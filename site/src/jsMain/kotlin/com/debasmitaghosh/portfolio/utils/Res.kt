package com.debasmitaghosh.portfolio.utils

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    object Colors {
        val PROFILE_BG = Color.rgb(0xFFF9C4)      // Warm sunflower yellow (main background)
        val HOME_BG = Color.rgb(0xFFE536)         // Soft pastel yellow (lighter areas)
        val DARK = Color.rgb(0x544D12)           // Olive yellow (for contrast elements)
        val DARK_GREEN = Color.rgb(0x827717)//(0x996515)     // Deep olive (for headers or buttons)
        val WHITE = Color.rgb(0xFFFFFF)          // Neutral white (for text or backgrounds)
        val BLACK = Color.rgb(0x000000)          // Strong contrast (for text)
        val GREY = Color.rgb(0xBDBDBD)           // Neutral grey (for borders or secondary text)
    }




    object String {
        const val INTRO = "Hi, I am Debasmita Ghosh"
        const val NAME = "Debasmita Ghosh"
        const val HOME_TITLE = "home"
        const val ABOUT_TITLE = "about"
        const val SKILLS_TITLE = "skills"
        const val AREA_OF_INTEREST_TITLE = "Area of Interest"
        const val TOOLS_TITLE = "tools"
        const val EXPERIENCE_TITLE = "experience"
        const val CERTIFICATIONS_TITLE = "certifications"
        const val PROJECTS = "Key Projects worked:"
        const val PROFESSION = "Your Native Android Developer"
        const val PROFESSION_ = "Native Android Developer"
        const val YEAR_OF_EXP = "4+ years of experience"
        val ABOUT_ME = listOf(
            "Experienced Android Developer with 4+ years of hands-on expertise in building scalable, user-friendly applications",
            "Proficient in Kotlin and Java, with solid knowledge of Android Jetpack Components, Jetpack Compose, and MVVM architecture",
            "Strong command over RESTful API integration, Firebase services (including push notifications), RoomDB, and media playback features",
            "Adept at debugging, performance optimization, and memory leak detection to ensure smooth app performance",
            "Successfully developed and launched apps across diverse domains like dating, education, job portals, and video streaming",
            "Experience integrating Google Analytics, Crashlytics, Razorpay, and third-party APIs to enhance app functionality and user experience",
            "Recognized in the Global Dating Insights Women in Dating Special Report 2023 for contributions to the dating app industry",
            "Enthusiastic about UI/UX design principles, Material Design, and creating responsive dark mode interfaces",
            "Continuous learner, currently exploring Dependency Injection (Hilt) and advancing skills in Jetpack Compose and unit testing",
            "Strong team collaborator with a keen eye for detail, problem-solving mindset, and a drive for delivering impactful mobile experiences"
        )
        const val KEY_DUTIES = "Key Duties:"
        const val GITHUB_URL = "https://github.com/DebasmitaGhosh1"
        const val LINKEDIN_URL = "https://www.linkedin.com/in/debasmita-ghosh011/"
        const val RESUME = "https://drive.google.com/file/d/1laKIoY1_zKvg5L2gpopv9Y2Fz4LjUdaA/view?usp=drive_link"
        const val VERSION = "Version: 1.0.1"
        const val MADE_WITH = "Made with"
//        const val REVEAL_PROFILE_IMAGE = "Tap or hover to view my profile picture"
    }

    object Drawable {
        // Profile image
        const val IMAGE_1 = "/images/dghosh.jpg"
        const val IMAGE_2 = "/images/dghosh_about_img.png"
        const val PROFILE_IMAGE_ART = "/images/dghosh.jpg"

        // Skills and Tools
        const val ANDROID = "/images/android.svg"
        const val FIREBASE = "/images/firebase.svg"
        const val FIGMA = "/images/figma.svg"
        const val JAVA = "/images/java.svg"
        const val JIRA = "/images/jira_logo.svg"
        const val GIT = "/images/git.svg"
        const val INTELLIJ = "/images/intellij.svg"
        const val POSTMAN = "/images/postman.svg"
        const val VSCODE = "/images/vs-code.svg"
        const val KOTLIN = "/images/kotlin.svg"
        const val XML = "/images/xml_logo.svg"
        const val KOBWEB_LOGO = "/images/kobweb_logo.png"
        const val KOBWEB = "/images/kobweb.png"
        const val AGILE = "/images/agile.png"
        const val CANVA = "/images/canva_logo.png"
        const val JETPACK_COMPOSE = "/images/jetpack-compose.png"
        const val ANDROID_JETPACK = "/images/android-jetpack.svg"
        const val ANDROID_STUDIO = "/images/android-studio.svg"
        const val JSON = "/images/json.png"
        const val RESUME = "/images/resume.svg"

        // Experience
        const val INFOWEBMENT = "/images/infowebment_logo.png"
        const val FLUTRR = "/images/flutrr_logo.png"

        // Projects
        const val PLAY_STORE = "/images/play-store.png"
        const val PLAY_STORE_NULL = "/images/google_play_logo.png"


    }

    object Font {
        const val MONTSERRAT_BOLD = "Montserrat-Bold"
        const val MONTSERRAT_BLACK = "Montserrat-Black"
        const val MONTSERRAT_REGULAR = "Montserrat-Regular"
        const val MONTSERRAT_MEDIUM = "Montserrat-Medium"
        const val MONTSERRAT_SEMIBOLD = "Montserrat-SemiBold"
        const val MONTSERRAT_LIGHT = "Montserrat-Light"
    }
}