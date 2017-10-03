package com.serenitybdd.core;

import org.jbehave.core.annotations.BeforeScenario;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class StoryScope implements Scope {


    private final ConcurrentMap<String,Object> cache=new ConcurrentHashMap();

    private static StoryScope self;

    @BeforeScenario
    public void beforeScenario()
    {
        if (self==null)
            return;


    }

    public StoryScope()
    {
        self=this;
    }

    @Override
    public Object get(String name, ObjectFactory objectFactory) throws IllegalStateException{
        if(!cache.containsKey(name)){
            cache.putIfAbsent(name,objectFactory.getObject());
        }
        return cache.get(name);
    }

    @Override
    public Object resolveContextualObject(String name)
    {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }

    @Override
    public Object remove(String name)
    {
        return cache.remove(name);
    }

    @Override
    public void registerDestructionCallback(String name,Runnable callback)
    {
        cache.put(name, callback);
    }

}
