package com.debasmitaghosh.portfolio.pages

import androidx.compose.runtime.*
import com.debasmitaghosh.portfolio.components.wing.*
import com.debasmitaghosh.portfolio.components.widgets.BackToTopButton
import com.debasmitaghosh.portfolio.utils.Res
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {

    val pageContext = rememberPageContext()
    val breakpoint = rememberBreakpoint()

    Box(
        modifier = Modifier.fillMaxSize().background(
            when (ColorMode.current) {
                ColorMode.LIGHT -> Res.Colors.WHITE
                ColorMode.DARK -> Res.Colors.DARK_GREEN
            }
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HomeSection(ctx = pageContext, breakpoint = breakpoint)
            AboutSection(breakpoint = breakpoint)
            SkillsSection(ctx = pageContext)
            ExperienceSection(ctx = pageContext, breakpoint = breakpoint)
           // CertificationsSection(ctx = pageContext, breakpoint = breakpoint)
            Surface(modifier = Modifier.height(30.px)) {}
            BackToTopButton()
            FooterSection(ctx = pageContext)
        }
    }
}
