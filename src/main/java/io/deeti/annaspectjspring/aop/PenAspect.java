package io.deeti.annaspectjspring.aop;

import io.deeti.annaspectjspring.dto.PenDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Aspect
public class PenAspect {

    private static final Logger logger = LoggerFactory.getLogger(PenAspect.class);

    @Before("execution(* io.deeti.annaspectjspring.service.*.*(..))")
//    @Pointcut(value = "")
    public void beforeNewPen(JoinPoint joinPoint, PenDto pen) {

        logger.info("" + pen);
        if (pen.getBrand() == null && pen.getManufacturedBy() == null) {
            throw new IllegalStateException("brand or manufacture should not be empty");
        }
    }
}
