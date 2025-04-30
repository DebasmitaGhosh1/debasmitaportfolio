package com.debasmitaghosh.portfolio.utils

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.forms.ButtonVars
import com.varabyte.kobweb.silk.style.*
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.css.*

val PageContentStyle = CssStyle {
    base { Modifier.fillMaxSize().padding(leftRight = 2.cssRem, top = 2.cssRem) }
    Breakpoint.MD { Modifier.maxWidth(60.cssRem) }
}

val CircleButtonVariant = ButtonStyle.addVariantBase {
    Modifier.padding(0.px).borderRadius(50.percent)
}

val UncoloredButtonVariant = ButtonStyle.addVariantBase {
    Modifier.setVariable(ButtonVars.BackgroundDefaultColor, Colors.Transparent)
}

val HoverBgStyle = CssStyle {
    hover {
        Modifier.background(
            if (colorMode.isLight)
                Res.Colors.HOME_BG
            else Res.Colors.DARK
        ).borderRadius(r = 6.px)
    }
}

val HoverBgClickableStyle = CssStyle {
    hover {
        Modifier.background(
            if (colorMode.isLight)
                Res.Colors.HOME_BG
            else Res.Colors.DARK
        ).borderRadius(r = 6.px).cursor(Cursor.Pointer)
    }
}

val ShareButtonStyle = CssStyle {
    hover {
        Modifier.cursor(Cursor.Pointer).scale(1.2)
    }
}

val FooterStyle = CssStyle.base {
    Modifier.padding(topBottom = 1.5.cssRem, leftRight = 10.percent)
}

val BackToTopButtonStyle = CssStyle {
    base {
        Modifier
            .size(30.px)
            .borderRadius(25.percent)
            .margin(
                right = 7.5.px,
                bottom = 30.px
            )
            .cursor(Cursor.Pointer)
            .styleModifier {
                property("pointer-events", "auto")
            }
            .transition(
                Transition.of(
                    property = "translate",
                    duration = 200.ms, timingFunction = AnimationTimingFunction.Ease,
                    delay = null
                )
            )

    }

    Breakpoint.SM {
        Modifier
            .size(30.px)
            .borderRadius(25.percent)
            .margin(
                right = 15.px,
                bottom = 30.px
            )
    }
    Breakpoint.MD {
        Modifier
            .size(40.px)
            .borderRadius(25.percent)
            .margin(
                right = 20.px,
                bottom = 30.px
            )
    }
    Breakpoint.LG {
        Modifier
            .size(50.px)
            .borderRadius(25.percent)
            .margin(
                right = 40.px,
                bottom = 40.px
            )
    }
}

val SubHeadLineTextStyle = CssStyle.base {
    Modifier
        .fontSize(1.cssRem)
        .textAlign(TextAlign.Start)
        .color(colorMode.toPalette().color.toRgb())
}

val SectionTitleStyle = CssStyle {
    base {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.SM {
        Modifier.fontSize(FontSize.Large)
    }
    Breakpoint.MD {
        Modifier.fontSize(FontSize.XLarge)
    }
    Breakpoint.LG {
        Modifier.fontSize(FontSize.XLarge)
    }
}

val ProfileImageStyle = CssStyle {
    base {
        Modifier
            .size(250.px)
            .borderRadius(100.percent)
            .margin(0.px)
            .objectFit(ObjectFit.Cover)
            .opacity(100.percent)
    }
    Breakpoint.SM {
        Modifier.size(250.px).opacity(100.percent)

    }
    Breakpoint.MD {
        Modifier.size(275.px).opacity(100.percent)

    }
    Breakpoint.LG {
        Modifier.size(375.px).opacity(100.percent)

    }
}

val HoverProfileImageArtStyle = CssStyle {
    base {
        Modifier.size(250.px)
            .borderRadius(100.percent)
            .margin(0.px)
            .objectFit(ObjectFit.Cover)
            .opacity(100.percent)
            .transition(
                Transition.of(
                    property = "opacity",
                    duration = 200.ms,
                    delay = null
                )
            )
    }
    Breakpoint.SM {
        Modifier.size(250.px).opacity(100.percent)

    }
    Breakpoint.MD {
        Modifier.size(275.px).opacity(100.percent)

    }
    Breakpoint.LG {
        Modifier.size(375.px).opacity(100.percent)

    }
    hover {
        Modifier
            .opacity(0.percent)
    }
    cssRule("onClick") {
        Modifier
            .opacity(0.percent)
    }
}

val AboutProfileImageStyle = CssStyle {
    Breakpoint.ZERO {
        Modifier
            .height(100.percent)
            .width(85.percent)
            .objectFit(ObjectFit.Cover)
    }
    Breakpoint.SM {
        Modifier
            .height(100.percent)
            .width(85.percent)
            .objectFit(ObjectFit.Cover)
    }
    Breakpoint.MD {
        Modifier
            .height(100.percent)
            .width(85.percent)
            .objectFit(ObjectFit.Cover)
    }
    Breakpoint.LG {
        Modifier
            .height(100.percent)
            .width(85.percent)
            .objectFit(ObjectFit.Cover)
    }
}


val ProfileHeadingStyle = CssStyle {
    base {
        Modifier
            .fontSize(20.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(25.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(30.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(40.px)
    }
}

val AboutSectionHeadingStyle = CssStyle {
    base {
        Modifier
            .fontSize(20.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(20.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(25.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(35.px)
    }
}

val DesignationStyle = CssStyle {
    base {
        Modifier
            .fontSize(15.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(18.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(22.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(25.px)
    }
}

val AboutSectionDesignationStyle = CssStyle {
    base {
        Modifier
            .fontSize(14.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(14.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(16.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(18.px)
    }
}

val AboutTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(14.5.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(14.5.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(15.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(16.px)
    }
}

val ResumeButtonStyle = CssStyle {
    base {
        Modifier
            .width(115.px)
            .height(35.px)
            .fontSize(12.px)
    }
    Breakpoint.SM {
        Modifier.width(115.px)
            .height(40.px)
            .fontSize(12.px)

    }
    Breakpoint.MD {
        Modifier.width(115.px)
            .height(40.px)
            .fontSize(13.px)
    }
    Breakpoint.LG {
        Modifier.width(135.px)
            .height(45.px)
            .fontSize(14.px)
    }

    hover {
        Modifier.cursor(Cursor.Pointer)
    }
}

val PlayStoreButtonStyle = CssStyle {
    base {
        Modifier
            .width(180.px)
            .height(35.px)
            .fontSize(12.px)
    }
    Breakpoint.SM {
        Modifier.width(180.px)
            .height(40.px)
            .fontSize(12.px)

    }
    Breakpoint.MD {
        Modifier.width(180.px)
            .height(40.px)
            .fontSize(13.px)
    }
    Breakpoint.LG {
        Modifier.width(200.px)
            .height(45.px)
            .fontSize(14.px)
    }

    hover {
        Modifier.cursor(Cursor.Pointer)
    }
}

val NAPlayStoreButtonStyle = CssStyle {
    base {
        Modifier
            .width(280.px)
            .height(35.px)
            .fontSize(12.px)
    }
    Breakpoint.SM {
        Modifier.width(260.px)
            .height(40.px)
            .fontSize(12.px)

    }
    Breakpoint.MD {
        Modifier.width(280.px)
            .height(40.px)
            .fontSize(13.px)
    }
    Breakpoint.LG {
        Modifier.width(310.px)
            .height(45.px)
            .fontSize(14.px)
    }

    hover {
        Modifier.cursor(Cursor.NotAllowed)
    }
}

val SkillIconStyle = CssStyle {
    base {
        Modifier.size(34.px)
    }
    Breakpoint.SM {
        Modifier.size(34.px)

    }
    Breakpoint.MD {
        Modifier.size(38.px)
    }
    Breakpoint.LG {
        Modifier.width(42.px)
    }
}

val ResumeIconStyle = CssStyle {
    base {
        Modifier.size(22.px)
    }
    Breakpoint.SM {
        Modifier.size(22.px)

    }
    Breakpoint.MD {
        Modifier.size(24.px)
    }
    Breakpoint.LG {
        Modifier.width(28.px)
    }
}

val SkillTitleStyle = CssStyle {
    Breakpoint.ZERO {
        Modifier
            .fontSize(12.5.px)
    }
    Breakpoint.SM {
        Modifier
            .fontSize(12.5.px)
    }
    Breakpoint.MD {
        Modifier
            .fontSize(13.px)
    }
    Breakpoint.LG {
        Modifier
            .fontSize(14.px)
    }
}

val SurfaceStyle = CssStyle {
    base {
        Modifier.height(25.px)
    }
    Breakpoint.ZERO {
        Modifier.height(25.px)
    }
    Breakpoint.SM {
        Modifier.height(25.px)
    }
    Breakpoint.MD {
        Modifier.height(45.px)
    }
    Breakpoint.LG {
        Modifier.height(45.px)
    }
}

val HeroSectionStyle = CssStyle {
    base {
        Modifier
            .width(95.percent)
            .fontSize(3.cssRem)
            .padding(top = 2.cssRem)
    }
    Breakpoint.ZERO {
        Modifier
            .width(90.percent)
            .fontSize(2.5.cssRem)
            .padding(top = 2.cssRem)
    }
    Breakpoint.SM {
        Modifier
            .width(90.percent)
            .fontSize(2.5.cssRem)
            .padding(top = 2.cssRem)
    }
    Breakpoint.MD {
        Modifier
            .width(95.percent)
            .fontSize(2.75.cssRem)
            .padding(top = 3.cssRem)
    }
    Breakpoint.LG {
        Modifier
            .width(80.percent)
            .fontSize(3.cssRem)
            .padding(top = 3.cssRem)
    }
}

val HomeSectionStyle = CssStyle {
    base {
        Modifier
            .width(100.percent)
            .height(600.px)
    }
    Breakpoint.ZERO {
        Modifier
            .width(100.percent)
            .height(550.px)
    }
    Breakpoint.SM {
        Modifier
            .width(100.percent)
            .height(550.px)
    }
    Breakpoint.MD {
        Modifier
            .width(100.percent)
            .height(625.px)
    }
    Breakpoint.LG {
        Modifier
            .width(100.percent)
            .height(725.px)
    }
}

val EmployerTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(15.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(15.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(16.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(17.px)
    }
}

val CertificateLinkTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(15.px)
            .textDecorationLine(TextDecorationLine.Underline)
    }
    Breakpoint.SM {
        Modifier.fontSize(15.px)
            .textDecorationLine(TextDecorationLine.Underline)
    }
    Breakpoint.MD {
        Modifier.fontSize(16.px)
            .textDecorationLine(TextDecorationLine.Underline)
    }
    Breakpoint.LG {
        Modifier.fontSize(17.px)
            .textDecorationLine(TextDecorationLine.Underline)
    }

    hover {
        Modifier.cursor(Cursor.Pointer)
    }
}

val EmployerLocationTextStyle = CssStyle {
    base {
        Modifier
            .fontSize(14.px)
    }
    Breakpoint.SM {
        Modifier.fontSize(14.px)
    }
    Breakpoint.MD {
        Modifier.fontSize(15.px)
    }
    Breakpoint.LG {
        Modifier.fontSize(16.px)
    }
}