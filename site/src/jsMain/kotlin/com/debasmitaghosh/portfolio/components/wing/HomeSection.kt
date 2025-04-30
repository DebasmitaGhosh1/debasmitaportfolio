package com.debasmitaghosh.portfolio.components.wing

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.debasmitaghosh.portfolio.utils.*
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.icons.SunIcon
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div

@Composable
fun HomeSection(
    ctx: PageContext,
    breakpoint: Breakpoint
) {

    Column(
        modifier = HomeSectionStyle.toModifier().id(Res.String.HOME_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.HOME_BG
                    ColorMode.DARK -> Res.Colors.DARK
                }
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Box(modifier = Modifier.align(Alignment.End)) {
                ColorModeButton()
            }

            Box(
                modifier = ProfileImageStyle.toModifier()
            ) {
                Image(
                    Res.Drawable.IMAGE_1, alt = "Profile image",
                    modifier = ProfileImageStyle.toModifier().background(
                        Res.Colors.PROFILE_BG
                    ).clip(shape = Circle())
                )
                Div(
                    ProfileImageStyle.toModifier().clip(shape = Circle()).fillMaxSize().background(Colors.Transparent)
                        .toAttrs()
                )
                Image(
                    Res.Drawable.PROFILE_IMAGE_ART, alt = "Profile image art",
                    modifier = HoverProfileImageArtStyle.toModifier().background(
                        Res.Colors.PROFILE_BG
                    ).clip(shape = Circle())
                )
            }
            /*
            SpanText(
                text = Res.String.REVEAL_PROFILE_IMAGE,
                modifier = AboutSectionDesignationStyle.toModifier().margin(topBottom = 12.px)
                    .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
            )

             */



            SpanText(
                text = Res.String.INTRO,
                modifier = ProfileHeadingStyle.toModifier().fontFamily(Res.Font.MONTSERRAT_BOLD)
                    .padding(top = 10.px)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
            )

            SpanText(
                text = Res.String.PROFESSION,
                modifier = DesignationStyle.toModifier()
                    .margin(top = 10.px)
                    .fontFamily(Res.Font.MONTSERRAT_BOLD)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontWeight(FontWeight.Bold)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.margin(top = 15.px)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.margin(top = 5.px, right = 5.px)
                ) {
                    FaLinkedin(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px))
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.DARK
                                    ColorMode.DARK -> Res.Colors.WHITE
                                }
                            ).onClick { ctx.router.navigateTo(Res.String.LINKEDIN_URL) },
                        size = getIconSize(breakpoint)
                    )

                    FaGithub(
                        modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = if (breakpoint > Breakpoint.MD) 10.px else 0.px))
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.DARK
                                    ColorMode.DARK -> Res.Colors.WHITE
                                }
                            ).onClick { ctx.router.navigateTo(Res.String.GITHUB_URL) },
                        size = getIconSize(breakpoint)
                    )
                }

                Box(
                    modifier = ResumeButtonStyle.toModifier()
                        .margin(left = 5.px)
                        .onClick { ctx.router.navigateTo(Res.String.RESUME) }
                        .border(0.1.px, LineStyle.Solid, Res.Colors.GREY)
                        .borderRadius(r = 5.px)
                        .background(
                            when (ColorMode.current) {
                                ColorMode.LIGHT -> Res.Colors.DARK
                                ColorMode.DARK -> Res.Colors.WHITE
                            }
                        )

                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.margin(right = 5.px).align(Alignment.Center)
                    ) {
                        Image(
                            modifier = ResumeIconStyle.toModifier().margin(right = 4.px),
                            src = Res.Drawable.RESUME,
                        )

                        SpanText(
                            text = "View Resume",
                            modifier = Modifier
                                .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                                .align(Alignment.CenterVertically)
                                .color(
                                    when (ColorMode.current) {
                                        ColorMode.LIGHT -> Res.Colors.WHITE
                                        ColorMode.DARK -> Res.Colors.DARK_GREEN
                                    }
                                )
                        )
                    }
                }
            }
        }
    }
}

fun getIconSize(breakpoint: Breakpoint): IconSize {
    return when (breakpoint) {
        Breakpoint.ZERO -> IconSize.LG

        Breakpoint.SM -> IconSize.LG

        Breakpoint.MD -> IconSize.LG

        Breakpoint.LG -> IconSize.XL

        Breakpoint.XL -> IconSize.XXL
    }
}

@Composable
private fun ColorModeButton() {
    var colorMode by ColorMode.currentState
    IconButton(colorMode = colorMode, onClick = { colorMode = colorMode.opposite }) {
        if (colorMode.isLight) MoonIcon() else SunIcon()
    }
}

@Composable
fun IconButton(
    colorMode: ColorMode,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Button(
        onClick = { onClick() },
        Modifier.setVariable(ButtonVars.FontSize, 1.em).margin(all = 16.px)
            .background(if (colorMode.isLight) Res.Colors.WHITE else Res.Colors.BLACK),
        variant = CircleButtonVariant.then(UncoloredButtonVariant)
    ) {
        content()
    }
}