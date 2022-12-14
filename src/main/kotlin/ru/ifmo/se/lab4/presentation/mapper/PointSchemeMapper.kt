package ru.ifmo.se.lab4.presentation.mapper

import ru.ifmo.se.lab4.domain.model.Point
import ru.ifmo.se.lab4.domain.model.PointResult
import ru.ifmo.se.lab4.presentation.scheme.point.PointRequestScheme
import ru.ifmo.se.lab4.presentation.scheme.point.PointResponseScheme
import java.time.ZoneOffset

fun PointRequestScheme.toPoint() = Point(
    this.x!!,
    this.y!!,
    this.r!!,
)

fun PointResult.toPointResponseScheme() = PointResponseScheme(
    this.id,
    this.result,
    this.delay,
    this.datetime.toInstant(ZoneOffset.UTC).toEpochMilli(),
    this.datetime.toString(),
    this.x,
    this.y,
    this.r,
)
