package com.greantea.alcohub.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate

class RedisConfig {

    @Bean
    fun jedisConnectionFactory(): JedisConnectionFactory {
        return JedisConnectionFactory()
    }

    @Bean
    fun redisTemplate(): RedisTemplate<Any, Any> {
        val template = RedisTemplate<Any, Any>()
        template.setConnectionFactory(jedisConnectionFactory())
        return template
    }
}