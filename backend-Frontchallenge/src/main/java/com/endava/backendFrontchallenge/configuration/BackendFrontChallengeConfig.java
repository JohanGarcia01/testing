package com.endava.backendFrontchallenge.configuration;

import com.endava.backendFrontchallenge.repository.JobRepository;
import com.endava.backendFrontchallenge.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.mapping.event.LoggingEventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = {UserRepository.class, JobRepository.class})
@Configuration
public class BackendFrontChallengeConfig {
    @Bean
    public LoggingEventListener mongoEventListener() {
        return new LoggingEventListener();
    }
}
