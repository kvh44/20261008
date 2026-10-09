package com.example._20261008

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("local")
@SpringBootTest(
    properties = [
        "spring.main.lazy-initialization=false",
        "spring.datasource.url=jdbc:mysql://127.0.0.1:1/appdb",
    ],
)
class ApplicationTests {

    @Test
    fun startsWithoutMysqlConnection() {
    }

}
