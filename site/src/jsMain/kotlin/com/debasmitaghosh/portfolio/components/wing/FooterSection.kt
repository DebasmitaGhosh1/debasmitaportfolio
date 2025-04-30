package com.debasmitaghosh.portfolio.components.wing

import androidx.compose.runtime.Composable
import com.debasmitaghosh.portfolio.utils.FooterStyle
import com.debasmitaghosh.portfolio.utils.PageContentStyle
import com.debasmitaghosh.portfolio.utils.Res
import com.debasmitaghosh.portfolio.utils.ShareButtonStyle
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun FooterSection(ctx: PageContext) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = FooterStyle.toModifier().fillMaxWidth().margin(top = 1.cssRem).backgroundColor(
            Res.Colors.DARK
        )
    ) {
        Row(PageContentStyle.toModifier().fillMaxWidth()) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(5.px).fillMaxWidth()
            ) {
                FaLinkedin(
                    modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px).color(Colors.White))
                        .onClick { ctx.router.navigateTo(Res.String.LINKEDIN_URL) },
                    size = IconSize.XL
                )
                FaGithub(
                    modifier = ShareButtonStyle.toModifier().then(Modifier.margin(right = 10.px).color(Colors.White))
                        .onClick { ctx.router.navigateTo(Res.String.GITHUB_URL) },
                    size = IconSize.XL
                )
            }
        }

        SpanText(
            text = "© 2025 Debasmita Ghosh. All rights reserved.",
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 2.cssRem)
                .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                .textAlign(TextAlign.Center)
                .color(
                    Res.Colors.WHITE
                )
                .fontSize(15.px)
        )

        SpanText(
            text = Res.String.VERSION,
            modifier = Modifier
                .fillMaxWidth()
                .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                .textAlign(TextAlign.Center)
                .color(
                    Res.Colors.WHITE
                )
                .fontSize(11.px)
                .margin(topBottom = 10.px)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(5.px).align(Alignment.CenterHorizontally)
        ) {
            SpanText(
                text = Res.String.MADE_WITH,
                modifier = Modifier
                    .fillMaxWidth()
                    .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                    .textAlign(TextAlign.Center)
                    .color(
                        Res.Colors.WHITE
                    )
                    .fontSize(11.px)
                    .margin(right = 5.px)
            )

            Image(
                modifier = Modifier.width(75.px).objectFit(ObjectFit.ScaleDown).background(Res.Colors.WHITE).padding(left = 4.px),
                src = Res.Drawable.KOBWEB_LOGO,
            )
        }
    }
}