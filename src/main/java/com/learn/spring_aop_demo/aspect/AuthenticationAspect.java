package com.learn.spring_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    //for all the types with in this package, i want to execute this pointcut
    @Pointcut("within(com.learn.spring_aop_demo..*)")
    public void authenticationPointCut(){

    }

    //for all the types with in this package, i want to execute this pointcut
    @Pointcut("within(com.learn.spring_aop_demo..*)")
    public void authorizationPointCut(){

    }

    @Before("authenticationPointCut() && authorizationPointCut()")//I want to do the authentication before the pointcut, I have mentioned
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }


}
