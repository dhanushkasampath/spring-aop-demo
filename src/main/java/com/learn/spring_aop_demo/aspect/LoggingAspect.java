package com.learn.spring_aop_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 'execution' defines for which method we want to execute this aspect
    // Consider this as a method we want to execute before every method starts.
    // This defines that before calling checkout() method, I want to execute below logger() method
    @Before("execution(* com.learn.spring_aop_demo.service.ShoppingCart.checkout(..))")//here we defined two dots to match what ever number of parameters it has
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println("Before Loggers with args: " + joinPoint.getArgs()[0].toString());
    }

    @After("execution(* com.learn.spring_aop_demo.service.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After Loggers");
    }

    // 1st start says "for any return type"
    @Pointcut("execution(* com.learn.spring_aop_demo.service.ShoppingCart.quantity())")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",
    returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: " + retVal);
    }
}

// we just need to consider only these 2.
// 1. what is something we want to call
// 2. and where we want to call?