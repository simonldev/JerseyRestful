package com.howtodoinjava.jerseydemo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
 
@Component
public class JerseyConfig extends ResourceConfig 
{
    public JerseyConfig() {
        this.registerClasses(new Class[]{UserResource.class, HelloWorld.class});
    }}
