package com.example._20261008

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class User(val id: Long, val name: String)

@RestController
class UserController(private val mysqlClientService: MysqlClientService) {
    @GetMapping("/users")
    fun getUsers(): List<User> = listOf(
        User(1, "Alice"),
        User(2, "Bob"),
    )

    @GetMapping("/mysql-users")
    fun getMysqlUsers(): List<MysqlClient> = mysqlClientService.getClients()
}
