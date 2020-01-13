package com.example.springredislinkshortner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;

@Configuration
public class RedisConfig {

	@Bean
	ReactiveRedisOperations<String, String> reactiveRedisOperations(
			ReactiveRedisConnectionFactory factory) {
		return new ReactiveStringRedisTemplate(factory);
	}
}
