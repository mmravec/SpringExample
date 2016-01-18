package aop3;

import org.aspectj.lang.ProceedingJoinPoint;

import aop.Performer;

public class BadAudience {	
    public void eliminate(ProceedingJoinPoint joinpoint, Performer performer) {    	
        System.out.println("Mr. " + performer.getName() + " you are not good singer!");

        System.out.println("But I will give you a chance.");
        try {
			joinpoint.proceed();
			System.out.println("Sounds fun.");
		} catch (Throwable e) {
			System.out.println("You have failed us. Boys eliminate him!");
		}
    }
}
