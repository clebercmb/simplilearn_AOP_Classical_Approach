package com.apps;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BothAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Before Method");
        methodInvocation.proceed();
        System.out.println("After Method");
        return null;
    }
}
