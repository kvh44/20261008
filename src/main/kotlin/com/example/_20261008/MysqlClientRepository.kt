package com.example._20261008

import org.springframework.data.jpa.repository.JpaRepository

interface MysqlClientRepository : JpaRepository<MysqlClient, Long>
