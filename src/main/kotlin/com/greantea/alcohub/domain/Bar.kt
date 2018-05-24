package com.greantea.alcohub.domain

import org.springframework.data.redis.core.RedisHash

@RedisHash("BAR")
class Bar(val name: String)