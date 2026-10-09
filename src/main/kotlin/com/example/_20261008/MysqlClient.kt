package com.example._20261008

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "dockerclient")
class MysqlClient(
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @field:Column(nullable = false, length = 100)
    var username: String = "",

    @field:Column(nullable = false)
    var email: String = "",

    @field:Column(length = 32)
    var telephone: String? = null,
)
