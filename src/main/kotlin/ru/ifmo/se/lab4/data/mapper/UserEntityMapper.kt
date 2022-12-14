package ru.ifmo.se.lab4.data.mapper

import ru.ifmo.se.lab4.data.entity.UserEntity
import ru.ifmo.se.lab4.domain.model.User
import ru.ifmo.se.lab4.domain.model.UserBuilder

fun UserEntity.toUser() = User(
    this.id!!,
    this.username,
    this.password
)

fun UserBuilder.toUserEntity() = UserEntity(
    this.username,
    this.password
)
