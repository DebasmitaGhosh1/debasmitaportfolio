package com.debasmitaghosh.portfolio.model

data class Experience(
    val id: Int,
    val designation: String,
    val employerName: String,
    val summary: String? = null,
    val startDate: String,
    val endDate: String?,
    val isCurrentJob: Boolean = false,
    val workLocation: String,
    val companyLogo: String,
    val keyDuties: List<String>,
    val technologiesUsed: List<String> = emptyList(),
    val projects: List<Projects>
) {
    data class Projects(
        val name: String,
        val description: List<String>,
        val link: String? = null,
        val technologiesUsed: List<String> = emptyList()
    )
}

