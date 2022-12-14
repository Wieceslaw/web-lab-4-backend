package ru.ifmo.se.lab4.presentation.scheme.point

data class PointResponseScheme(
    val id: Long,
    val result: Boolean,
    val delay: Long,
    val datetime: Long,
    val datetimeString: String,
    val x: Double,
    val y: Double,
    val r: Double
)
