package com.debasmitaghosh.portfolio.components.wing

import androidx.compose.runtime.Composable
import com.debasmitaghosh.portfolio.model.Skill
import com.debasmitaghosh.portfolio.utils.*
import com.debasmitaghosh.portfolio.utils.Res.String.AREA_OF_INTEREST_TITLE
import com.debasmitaghosh.portfolio.utils.Res.String.SKILLS_TITLE
import com.debasmitaghosh.portfolio.utils.Res.String.TOOLS_TITLE
import com.debasmitaghosh.portfolio.components.widgets.SectionTitle
import com.debasmitaghosh.portfolio.model.Interests
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.MixBlendMode
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.mixBlendMode
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun SkillsSection(ctx: PageContext) {

    Column(
        modifier = HeroSectionStyle.toModifier().id(SKILLS_TITLE), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(SKILLS_TITLE.kebabCaseToTitleCamelCase() + " and " + TOOLS_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SimpleGrid(
            numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 4),
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.px)
                .border(
                    0.1.px, LineStyle.Solid, when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
                .borderRadius(r = 8.px)
        ) {
            DataRepository.getSkills().forEach {
                SkillItem(skillModel = it, Modifier)
            }
        }

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SectionTitle(AREA_OF_INTEREST_TITLE)

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SimpleGrid(
            numColumns = numColumns(base = 2, sm = 2, md = 3, lg = 4),
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.px)
                .border(
                    0.1.px, LineStyle.Solid, when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
                .borderRadius(r = 8.px)
        ) {
            DataRepository.getAreaOfInterests().forEach {
                InterestItem(interest = it, Modifier, ctx = ctx)
            }
        }
    }
}

@Composable
fun SkillItem(skillModel: Skill, modifier: Modifier) {
    Column(
        HoverBgStyle.toModifier().then(
            modifier.fillMaxWidth().padding(topBottom = 20.px)
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            src = skillModel.drawable,
            modifier = SkillIconStyle.toModifier()
                .styleModifier {
                    mixBlendMode(MixBlendMode.Normal)
                }
        )

        SpanText(
            text = skillModel.title,
            modifier = SkillTitleStyle.toModifier()
                .padding(top = 10.px)
                .fillMaxWidth()
                .fontFamily(Res.Font.MONTSERRAT_BOLD)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                ).textAlign(TextAlign.Center)
        )
    }
}

@Composable
fun InterestItem(
    interest: Interests, modifier: Modifier, ctx: PageContext
) {
    Column(
        HoverBgClickableStyle.toModifier().then(
            modifier.fillMaxWidth().padding(topBottom = 20.px)
        ).onClick { ctx.router.navigateTo(interest.link) },
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            src = interest.drawable,
            modifier = SkillIconStyle.toModifier()
                .styleModifier {
                    mixBlendMode(MixBlendMode.Normal)
                }
        )

        SpanText(
            text = interest.title,
            modifier = SkillTitleStyle.toModifier()
                .padding(top = 10.px)
                .fillMaxWidth()
                .fontFamily(Res.Font.MONTSERRAT_BOLD)
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK_GREEN
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                ).textAlign(TextAlign.Center)
        )
    }
}