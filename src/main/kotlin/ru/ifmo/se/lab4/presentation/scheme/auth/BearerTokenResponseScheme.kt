package ru.ifmo.se.lab4.presentation.scheme.auth

data class BearerTokenResponseScheme(
    val token: String,
    val expirationTime: Long,
    val expiresAt: Long,
)
