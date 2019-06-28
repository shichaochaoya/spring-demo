package com.imooc.aop.demo5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕前======");
        Object obj = methodInvocation.proceed();
        System.out.println("环绕后======");
        return obj;
    }
}
