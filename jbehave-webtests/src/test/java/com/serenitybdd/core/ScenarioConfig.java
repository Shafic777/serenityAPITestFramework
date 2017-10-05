package com.serenitybdd.core;


import org.springframework.beans.factory.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScenarioConfig {

    @Bean
    public StoryScope storyScope(){

        StoryScope scenarioScope=new StoryScope();
        return scenarioScope;
    }

    @Bean
    public ScenarioScope scenarioScope()
    {
        ScenarioScope scenarioScope= new ScenarioScope() ;

        return scenarioScope;
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(ScenarioScope scenarioScope,StoryScope storyScope)
    {
        CustomScopeConfigurer customScopeConfigurer=new CustomScopeConfigurer();
        customScopeConfigurer.addScope("scenario",scenarioScope);
        customScopeConfigurer.addScope("story",storyScope);
        return customScopeConfigurer;

    }

    @Bean
    @Scope("story")
    public StoryContext storyContext()
    {
        return new StoryContext();
    }

    @Bean
    @Scope("scenario")
    public ScenarioContext scenarioContext()
    {
        return new ScenarioContext();
    }
}
