package com.debasmitaghosh.portfolio.components.widgets

import androidx.compose.runtime.*
import com.debasmitaghosh.portfolio.utils.BackToTopButtonStyle
import com.debasmitaghosh.portfolio.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.w3c.dom.SMOOTH
import org.w3c.dom.ScrollBehavior
import org.w3c.dom.ScrollToOptions

@Composable
fun BackToTopButton() {
    var scroll: Double? by remember { mutableStateOf(null) }

    LaunchedEffect(Unit) {
        window.addEventListener(type = "scroll", callback = {
            scroll = document.documentElement?.scrollTop
        })
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .pointerEvents(PointerEvents.None),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        val show = scroll != null && scroll!! > 400.0

        val buttonColor = when (ColorMode.current) {
            ColorMode.LIGHT -> Res.Colors.DARK_GREEN
            ColorMode.DARK -> Res.Colors.WHITE
        }
        val arrowColor = when (ColorMode.current) {
            ColorMode.LIGHT -> Res.Colors.WHITE
            ColorMode.DARK -> Res.Colors.DARK_GREEN
        }

        Box(
            modifier = BackToTopButtonStyle
                .toModifier()
                .backgroundColor(buttonColor)
                .visibility(if (show) Visibility.Visible else Visibility.Hidden)
                .onClick {
                    document.documentElement?.scroll(ScrollToOptions(top = 0.0, behavior = ScrollBehavior.SMOOTH))
                }
                .then(
                    if (show) {
                        Modifier.animation(
                            FadeInKeyFrames.toAnimation(
                                null,
                                duration = 1.5.s,
                                timingFunction = AnimationTimingFunction.EaseInOut
                            )
                        )
                    } else {
                        Modifier
                    }
                ),
            contentAlignment = Alignment.Center
        ) {
            FaArrowUp( modifier = ArrowUpStyle.toModifier().color(arrowColor))
        }
    }
}

val FadeInKeyFrames = Keyframes {
    0.percent {
        Modifier
            .opacity(0)
    }
    100.percent {
        Modifier
            .opacity(1)
    }
}

val ArrowUpStyle = CssStyle {
    Modifier
        .fontWeight(FontWeight.ExtraBold)
        .fontSize(3.cssRem)
}