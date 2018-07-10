package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/10
 * @ Description：
 * @ throws
 */
@Component
@Aspect
@Order(-99) // 控制多个Aspect的执行顺序，越小越先执行
public class MyAOP {

    //切入点
    @Pointcut("execution(* com.example.demo.controller..*(..)))")
    public void aspect(){
    }

    @Before("aspect()")
    public void doBeforeAdvce(JoinPoint joinPoint){
        System.out.println("在方法之前执行....");
        String kind = joinPoint.getKind();
        System.out.println(kind);
    }
/*    @Around("aspect()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("这里对程序进行处理");

        //pjp.proceed()-->意义:回到原有程序继续往下执行
        Object proceed = pjp.proceed();
        return proceed;
    }*/

    @After("aspect()")
    public void doAfterAdvce(JoinPoint joinPoint){
        System.out.println("在方法之后执行++++");
        String kind = joinPoint.getKind();
        System.out.println(kind);
    }
}
