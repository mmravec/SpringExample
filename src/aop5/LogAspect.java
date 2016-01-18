package aop5;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
    public Object log(ProceedingJoinPoint joinpoint) {
        String methodInfo = getMethodInfo(joinpoint);
        System.out.println("Calling method " + methodInfo);
        try {
            Object o = joinpoint.proceed();
            System.out.println("Finished call " + methodInfo);
            return o;
        } catch (Throwable e) {
            System.out.println("Failed call " + methodInfo);
            throw new RuntimeException(e);
        }
    }

    private String getMethodInfo(ProceedingJoinPoint joinpoint) {
        return joinpoint.getSignature().toLongString();
    }
}
