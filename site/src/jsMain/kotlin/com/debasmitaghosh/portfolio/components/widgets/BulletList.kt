package com.debasmitaghosh.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.debasmitaghosh.portfolio.utils.AboutTextStyle
import com.debasmitaghosh.portfolio.utils.EmployerLocationTextStyle
import com.debasmitaghosh.portfolio.utils.Res
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun BulletList(listItems: List<String>) {
    listItems.forEach {
        Row {
            SpanText(
                modifier = AboutTextStyle.toModifier().fontFamily(Res.Font.MONTSERRAT_MEDIUM).color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                ).lineHeight(2).margin(bottom = 6.px).textAlign(
                    TextAlign.Start
                ), text = "●"
            )
            SpanText(
                modifier = AboutTextStyle.toModifier().fontFamily(Res.Font.MONTSERRAT_MEDIUM).color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                ).lineHeight(2).padding(left = 3.px).margin(bottom = 6.px).textAlign(
                    TextAlign.Start
                ), text = it
            )
        }
    }
}

@Composable
fun BulletedExpList(listItems: List<String>) {
    listItems.forEach {
        Row {
            SpanText(
                text = "●",
                modifier = EmployerLocationTextStyle.toModifier().fontFamily(Res.Font.MONTSERRAT_MEDIUM)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    ).lineHeight(2).margin(bottom = 6.px).textAlign(
                    TextAlign.Start
                )
            )
            SpanText(
                text = it,
                modifier = EmployerLocationTextStyle.toModifier().fontFamily(Res.Font.MONTSERRAT_MEDIUM)
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    ).lineHeight(2).margin(bottom = 6.px).textAlign(
                    TextAlign.Start
                )
            )
        }
    }
}