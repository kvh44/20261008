package com.example._20261008

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class MysqlClientRepository(private val jdbcTemplate: JdbcTemplate) {
    fun findAll(): List<MysqlClient> = jdbcTemplate.query(
        "SELECT id, username, email, telephone FROM dockerclient ORDER BY id",
    ) { resultSet, _ ->
        MysqlClient(
            id = resultSet.getLong("id"),
            username = resultSet.getString("username"),
            email = resultSet.getString("email"),
            telephone = resultSet.getString("telephone"),
        )
    }
}
