package com.example.springbatch.configuration;

import com.example.springbatch.entity.User;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableBatchProcessing
public class UserBatchConfig {

    @Bean
    public Job inActiveUserJob(JobBuilderFactory jobBuilderFactory, Step inactiveJobStep) {
        return jobBuilderFactory.get("inActiveUserJob")
                .preventRestart()
                .start(inactiveJobStep)
                .start(inactiveJobStep)
                .build();
    }

    @Bean
    public Job inActiveJobStep(StepBuilderFactory stepBuilderFactory) {
        return stepBuilderFactory.get("inActiveUserStep")
                .<User, User> chunk(10)

    }
}
