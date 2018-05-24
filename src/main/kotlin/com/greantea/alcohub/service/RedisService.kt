package com.greantea.alcohub.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate

class RedisService {

    @Autowired
    lateinit var stringRedisTemplate: StringRedisTemplate

    fun test() {
        stringRedisTemplate.convertAndSend("test", "Hello")
        val opsForValue = stringRedisTemplate.opsForValue()
        opsForValue.set("test", "Hello")
        stringRedisTemplate.boundValueOps("test").set("Hello")
        print(opsForValue.get("test"))
        print(stringRedisTemplate.hasKey("test"))
    }
}