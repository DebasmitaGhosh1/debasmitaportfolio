package com.debasmitaghosh.portfolio.components.wing

import androidx.compose.runtime.Composable
import com.debasmitaghosh.portfolio.components.widgets.BulletList
import com.debasmitaghosh.portfolio.utils.*
import com.debasmitaghosh.portfolio.components.widgets.SectionTitle
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.shapes.Rect
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun AboutSection(breakpoint: Breakpoint) {

    Column(
        modifier = HeroSectionStyle.toModifier().id(Res.String.ABOUT_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(Res.String.ABOUT_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 2), modifier = Modifier.fillMaxWidth().thenIf(
                condition = breakpoint > Breakpoint.MD, other = Modifier.fillMaxHeight()
            ).padding(all = 12.px).border(
                0.1.px, LineStyle.Solid,
                when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.DARK
                    ColorMode.DARK -> Res.Colors.WHITE
                }
            ).borderRadius(r = 8.px)
        ) {
            LeftSide(breakpoint = breakpoint)
            RightSide(breakpoint = breakpoint)
        }
    }
}

@Composable
fun LeftSide(
    breakpoint: Breakpoint
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(all = 40.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = AboutSectionHeadingStyle.toModifier().margin(bottom = 12.px).fontFamily(Res.Font.MONTSERRAT_BLACK)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                ).fontWeight(FontWeight.Bold).textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION_,
            modifier = AboutSectionDesignationStyle.toModifier().margin(bottom = 12.px).fontFamily(Res.Font.MONTSERRAT_BOLD)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
        )
        SpanText(
            text = Res.String.YEAR_OF_EXP,
            modifier = AboutSectionDesignationStyle.toModifier().margin(bottom = 24.px).fontFamily(Res.Font.MONTSERRAT_BOLD)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
        )

        Surface(
            modifier = Modifier
                .height(2.px)
                .fillMaxWidth()
                .margin(bottom = 24.px)
                .background(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                    else Alignment.Start
                )
        ) {}

        BulletList(Res.String.ABOUT_ME)
    }
}

@Composable
fun RightSide(breakpoint: Breakpoint) {
    Box(
        modifier = Modifier.thenIf(
            condition = breakpoint > Breakpoint.MD, other = Modifier.height(756.px)
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = AboutProfileImageStyle.toModifier().borderRadius(10.px).clip(shape = Rect(0, 10.px))
                    .align(if (breakpoint > Breakpoint.MD) Alignment.End else Alignment.CenterHorizontally)
            ) {
                Image(
                    modifier = Modifier.fillMaxSize().align(Alignment.Center),
                    src = Res.Drawable.IMAGE_2, alt = "Profile image"
                )
            }
        }
    }
}