package com.debasmitaghosh.portfolio.utils

import com.debasmitaghosh.portfolio.model.Certificates
import com.debasmitaghosh.portfolio.model.Experience
import com.debasmitaghosh.portfolio.model.Interests
import com.debasmitaghosh.portfolio.model.Skill

object DataRepository {

    fun getSkills() = ArrayList<Skill>().apply {
        add(Skill(drawable = Res.Drawable.ANDROID, title = "Android"))
        add(Skill(drawable = Res.Drawable.KOTLIN, title = "Kotlin"))
        add(Skill(drawable = Res.Drawable.JAVA, title = "Java"))
        add(Skill(drawable = Res.Drawable.ANDROID_JETPACK, title = "Jetpack"))
        add(Skill(drawable = Res.Drawable.JETPACK_COMPOSE, title = "Compose"))
        add(Skill(drawable = Res.Drawable.XML, title = "XML"))
        add(Skill(drawable = Res.Drawable.JSON, title = "JSON"))
        add(Skill(drawable = Res.Drawable.FIREBASE, title = "Firebase"))
        add(Skill(drawable = Res.Drawable.GIT, title = "Git"))
        add(Skill(drawable = Res.Drawable.ANDROID_STUDIO, title = "Android Studio"))
        add(Skill(drawable = Res.Drawable.INTELLIJ, title = "IntelliJ IDEA"))
        add(Skill(drawable = Res.Drawable.POSTMAN, title = "Postman"))
        add(Skill(drawable = Res.Drawable.VSCODE, title = "VSCode"))
        add(Skill(drawable = Res.Drawable.JIRA, title = "Jira"))

    }

    fun getAreaOfInterests() = ArrayList<Interests>().apply {

        add(
            Interests(
                drawable = Res.Drawable.FIGMA,
                title = "Figma",
                link = "https://www.figma.com/"
            )
        )
        add(
            Interests(
                drawable = Res.Drawable.CANVA,
                title = "Canva",
                link = "https://www.canva.com/"
            )
        )
        add(
            Interests(
                drawable = Res.Drawable.KOBWEB,
                title = "Kobweb",
                link = "https://kobweb.varabyte.com/docs/getting-started/what-is-kobweb"
            )
        )
        add(
            Interests(
                drawable = Res.Drawable.AGILE,
                title = "Agile",
                link = "https://www.atlassian.com/agile"
            )
        )


    }

    fun getExperiences() = ArrayList<Experience>().apply {
        add(
            Experience(
                id = 1,
                designation = "Android Developer",
                employerName = "Flutrr Digimate Pvt. Ltd.",
                summary = "Contributed to the development of India’s first multilingual dating app with advanced architecture and integrations.",
                startDate = "Feb 2022",
                endDate = "Feb 2025",
                isCurrentJob = false,
                workLocation = "Kolkata, India",
                companyLogo = Res.Drawable.FLUTRR,
                keyDuties = listOf(
                    " Built and maintained a dating application from scratch using Kotlin, MVVM architecture, and Jetpack components.",
                    " Integrated SMS OTP verification, Google & Facebook Sign-In, and location-based features using GPS.",
                    " Implemented RoomDB for offline storage, Glide for image loading, and Razorpay/Google Pay/Juspay for payment gateway integration.",
                    " Utilized Firebase for push notifications and Crashlytics for error tracking to ensure stability.",
                    " Analyzed user behavior using Google Analytics and fixed bugs to enhance performance and user satisfaction.",
                    " Collaborated with UI/UX designers and backend teams to introduce new features and improve engagement.",
                    " Contributed to India’s first multilingual dating app, enhancing accessibility and inclusivity for users across diverse language backgrounds.",
                    " Played a key role in a high-growth startup recognized for its innovative approach and rapid market traction."
                ),
                technologiesUsed = listOf("Kotlin", "MVVM", "Jetpack", "RoomDB", "Firebase", "Glide", "Google Analytics", "Crashlytics", "Razorpay", "Juspay", "GPS"),
                projects = listOf(
                    Experience.Projects(
                        name = "flutrr",
                        description = listOf(
                            " A modern dating app that connects users based on location, interests, and preferences.",
                            " First multilingual dating app in India, supporting multiple regional languages to break language barriers in online dating.",
                            " Features include OTP-based login, Google/Facebook authentication, real-time notifications, and premium subscription plans.",
                            " Integrated with multiple third-party services for analytics, payment, and media handling.",
                            " Recognized as an emerging brand in the Indian dating app ecosystem."
                        ),
                        technologiesUsed = listOf("Kotlin", "Firebase", "Google Sign-In", "Facebook Login", "Glide", "RoomDB", "Jetpack", "Crashlytics", "GPS", "Payment Gateway"),
                        link = "https://play.google.com/store/apps/details?id=com.flutrr.dating&hl=en_IN&pli=1"
                    )
                )
            )


        )
        add(
            Experience(
                id = 2,
                designation = "Android Developer",
                employerName = "Infowebment Solution and Consultancy Services.",
                summary = "Developed Android apps across diverse domains with a focus on clean architecture and third-party integrations.",
                startDate = "Dec 2020",
                endDate = "Feb 2022",
                isCurrentJob = false,
                workLocation = "Kolkata, India",
                companyLogo = Res.Drawable.INFOWEBMENT,
                keyDuties = listOf(
                    " Designed and developed Android applications across education, job search, and video streaming domains using Java, XML, and MVC architecture.",
                    " Integrated third-party services including Picasso (image loading), Google Sign-In (authentication), AdMob (ads), and Push Notifications (engagement).",
                    " Actively contributed across the full SDLC—from requirement analysis to deployment—delivering clean, scalable, and user-focused mobile apps."
                ),
                technologiesUsed = listOf("Java", "MVC", "XML", "Picasso", "Google Sign-In", "AdMob", "Firebase Push Notifications"),
                projects = listOf(
                    Experience.Projects(
                        name = "WeduSuccess",
                        description = listOf(
                            " An educational Android application aimed at delivering smooth and intuitive learning experiences.",
                            " Built using Java, MVC, and XML with Picasso for optimized image rendering.",
                            " Integrated Google Sign-In for secure user authentication and ensured responsive layout across devices."
                        ),
                        technologiesUsed = listOf("Java", "XML", "MVC", "Picasso", "Google Sign-In"),
                        link = null
                    ),
                    Experience.Projects(
                        name = "JobHighlight",
                        description = listOf(
                            " A job portal app built on the same architecture as WeduSuccess, targeting job seekers across industries.",
                            " Enabled push notifications for job alerts and monetization using Google AdMob.",
                            " Streamlined application flow with a clean UI and integrated login/authentication system."
                        ),
                        technologiesUsed = listOf("Java", "XML", "MVC", "Firebase Push Notifications", "AdMob", "Google Sign-In"),
                        link = null
                    ),
                    Experience.Projects(
                        name = "ClickForClick",
                        description = listOf(
                            " A video streaming app developed in its MVP phase, focused on foundational media features.",
                            " Developed using Java, XML, and MVC, laying the groundwork for scalable video content delivery.",
                            " Designed for future enhancements including subscriptions, premium content, and in-app purchases."
                        ),
                        technologiesUsed = listOf("Java", "XML", "MVC"),
                        link = null
                    )
                )
            )

        )
    }

    fun getCertificates() = ArrayList<Certificates>().apply {
//        add(
//            Certificates(
//                name = "Gen AI",
//                issueDate = "Issued Apr 2025",
//                certificateLogo = Res.Drawable.UDEMY,
//                link = "https://www.udemy.com/certificate/UC-836ffd7a-38eb-42bd-8da2-7d34233aec48/"
//            )
//        )
//        add(
//            Certificates(
//                name = "Build a Website from Scratch with Kotlin and Jetpack Compose",
//                issueDate = "Issued Mar 2025",
//                certificateLogo = Res.Drawable.UDEMY,
//                link = "https://www.udemy.com/certificate/UC-aa6a285a-aa7c-443a-a532-638585b8bfb7/"
//            )
//        )
//        add(
//            Certificates(
//                name = "Flutter & Dart - The Complete Guide [2025 Edition]",
//                issueDate = "Issued Feb 2025",
//                certificateLogo = Res.Drawable.UDEMY,
//                link = "https://www.udemy.com/certificate/UC-beeba971-0e37-4bbb-a2fd-13c7fc3bddfb/"
//            )
//        )
    }

}