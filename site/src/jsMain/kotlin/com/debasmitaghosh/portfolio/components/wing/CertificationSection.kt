package com.debasmitaghosh.portfolio.components.wing

import androidx.compose.runtime.Composable
import com.debasmitaghosh.portfolio.components.widgets.SectionTitle
import com.debasmitaghosh.portfolio.model.Certificates
import com.debasmitaghosh.portfolio.utils.*
import com.debasmitaghosh.portfolio.utils.Res.String.CERTIFICATIONS_TITLE
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun CertificationsSection(ctx: PageContext, breakpoint: Breakpoint) {
    Column(
        modifier = HeroSectionStyle.toModifier().id(CERTIFICATIONS_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(CERTIFICATIONS_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SimpleGrid(
            numColumns = numColumns(base = 1),
            modifier = Modifier.fillMaxWidth()
        ) {
            DataRepository.getCertificates().forEach { certificateItem ->
                CertificationItem(certificates = certificateItem, ctx = ctx)
            }
        }
    }
}

@Composable
fun CertificationItem(
    certificates: Certificates,
    ctx: PageContext,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = HoverBgStyle.toModifier().then(
            modifier.border(
                0.1.px, LineStyle.Solid, when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.DARK
                    ColorMode.DARK -> Res.Colors.WHITE
                }
            ).borderRadius(r = 8.px).padding(10.px).margin(bottom = 20.px)
        )
    ) {
        Column(modifier = Modifier.padding(10.px)) {

            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(5.px)
            ) {

                Image(
                    modifier = Modifier.width(60.px).objectFit(ObjectFit.Contain)
                        .background(Res.Colors.WHITE).padding(all = 6.px),
                    src = certificates.certificateLogo,
                )

                Column(Modifier.padding(left = 8.px)) {
                    SpanText(
                        text = certificates.name,
                        modifier = EmployerTextStyle.toModifier()
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.DARK
                                    ColorMode.DARK -> Res.Colors.WHITE
                                }
                            )
                            .fontFamily(Res.Font.MONTSERRAT_BOLD)
                    )

                    SpanText(
                        text = certificates.issueDate,
                        modifier = EmployerLocationTextStyle.toModifier()
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.DARK
                                    ColorMode.DARK -> Res.Colors.WHITE
                                }
                            )
                            .fontFamily(Res.Font.MONTSERRAT_REGULAR)
                            .margin(top = 4.px)
                    )

                    SpanText(
                        text = "View Certificate",
                        modifier = CertificateLinkTextStyle.toModifier()
                            .color(
                                when (ColorMode.current) {
                                    ColorMode.LIGHT -> Res.Colors.DARK
                                    ColorMode.DARK -> Res.Colors.WHITE
                                }
                            )
                            .fontFamily(Res.Font.MONTSERRAT_BOLD)
                            .margin(top = 8.px)
                            .onClick { certificates.link.let { link -> ctx.router.navigateTo(link) } }
                    )
                }

            }
        }
    }
}