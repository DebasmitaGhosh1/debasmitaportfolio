package com.debasmitaghosh.portfolio.components.wing


import androidx.compose.runtime.Composable
import com.debasmitaghosh.portfolio.components.widgets.BulletedExpList
import com.debasmitaghosh.portfolio.model.Experience
import com.debasmitaghosh.portfolio.utils.*
import com.debasmitaghosh.portfolio.utils.Res.String.EXPERIENCE_TITLE
import com.debasmitaghosh.portfolio.components.widgets.SectionTitle
import com.varabyte.kobweb.browser.util.kebabCaseToTitleCamelCase
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.StyleModifier
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
fun ExperienceSection(ctx: PageContext, breakpoint: Breakpoint) {
    Column(
        modifier = HeroSectionStyle.toModifier().id(EXPERIENCE_TITLE),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(EXPERIENCE_TITLE.kebabCaseToTitleCamelCase())

        Surface(modifier = SurfaceStyle.toModifier()) {}

        SimpleGrid(
            numColumns = numColumns(base = 1, md = 1),
            modifier = Modifier.fillMaxWidth()
        ) {
            DataRepository.getExperiences().forEach { experienceItem ->
                ExperienceItem(experience = experienceItem, ctx = ctx, breakpoint = breakpoint)
            }
        }
    }
}

@Composable
fun ExperienceItem(experience: Experience, ctx: PageContext, breakpoint: Breakpoint, modifier: Modifier = Modifier) {
    Column(
        modifier = HoverBgStyle.toModifier().then(
            modifier.border(
                0.1.px, LineStyle.Solid, when (ColorMode.current) {
                    ColorMode.LIGHT -> Res.Colors.DARK
                    ColorMode.DARK -> Res.Colors.WHITE
                }
            ).borderRadius(r = 8.px).padding(10.px).margin(bottom = if (experience.id < 3) 20.px else 0.px)
        )
    ) {
        Column(modifier = Modifier.padding(10.px)) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.padding(5.px)
            ) {

                Image(
                    modifier = Modifier.width(60.px).objectFit(ObjectFit.Contain).padding(right = 8.px),
                    src = experience.companyLogo,
                )

                Column {
                    SpanText(
                        text = experience.employerName,
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
                        text = experience.workLocation,
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
                }

            }

            SpanText(
                text = experience.designation + " (${experience.startDate} - ${experience.endDate ?: "Present"})",
                modifier = EmployerTextStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_BOLD)
                    .margin(top = 5.px)
            )

            SpanText(
                text = Res.String.KEY_DUTIES,
                modifier = EmployerLocationTextStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_BOLD)
                    .margin(top = 20.px)
            )

            BulletedExpList(experience.keyDuties)

            SpanText(
                text = Res.String.PROJECTS,
                modifier = EmployerLocationTextStyle.toModifier()
                    .color(
                        when (ColorMode.current) {
                            ColorMode.LIGHT -> Res.Colors.DARK
                            ColorMode.DARK -> Res.Colors.WHITE
                        }
                    )
                    .fontFamily(Res.Font.MONTSERRAT_BOLD)
                    .margin(top = 20.px)
            )

            experience.projects.forEach { projectItem ->
                ProjectItem(project = projectItem, ctx = ctx, breakpoint = breakpoint)
            }
        }
    }
}

@Composable
fun ProjectItem(project: Experience.Projects, ctx: PageContext, breakpoint: Breakpoint) {

    Column(modifier = Modifier.padding(topBottom = 10.px)) {

        SpanText(
            text = project.name,
            modifier = EmployerTextStyle.toModifier()
                .color(
                    when (ColorMode.current) {
                        ColorMode.LIGHT -> Res.Colors.DARK
                        ColorMode.DARK -> Res.Colors.WHITE
                    }
                )
                .fontFamily(Res.Font.MONTSERRAT_BOLD)
                .margin(top = 5.px)
        )

        BulletedExpList(project.description)

        if (project.link.isNullOrEmpty()) {
            Box(
                modifier = NAPlayStoreButtonStyle.toModifier()
                    .margin(top = 20.px)
                    .border(0.1.px, LineStyle.Solid, Res.Colors.GREY)
                    .borderRadius(r = 5.px)
                    .background(
                        Res.Colors.GREY
                    )

            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.margin(right = 5.px).align(Alignment.Center)
                ) {
                    Image(
                        modifier = ResumeIconStyle.toModifier().margin(4.px),
                        src = Res.Drawable.PLAY_STORE_NULL,
                    )

                    SpanText(
                        text = "Currently not available on Google Play",
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
        } else {
            Box(
                modifier = Modifier
                    .margin(top = 20.px)
                    .onClick { project.link.let { link -> ctx.router.navigateTo(link) } }
                    .border(0.1.px, LineStyle.Solid, Res.Colors.GREY)
                    .borderRadius(r = 5.px)
                    .size(width = 140.px, height = 40.px) // keep as per your button size
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize()
                        .objectFit(ObjectFit.Fill), // optional: keeps aspect ratio
                    src = Res.Drawable.PLAY_STORE,
                )
            }

        }
    }
}