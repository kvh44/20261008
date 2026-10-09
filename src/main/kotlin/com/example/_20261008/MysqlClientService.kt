package com.example._20261008

import org.springframework.stereotype.Service

@Service
class MysqlClientService(private val repository: MysqlClientRepository) {
    fun getClients(): List<MysqlClient> = repository.findAll()
}
