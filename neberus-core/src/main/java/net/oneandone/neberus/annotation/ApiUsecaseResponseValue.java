package net.oneandone.neberus.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ResponseValue returned by a REST method in a usecase.
 */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiUsecaseResponseValue {

    /**
     * Name of the response value. If the method is linked to an actual REST method, the name must exist in the linked method.
     *
     * @return the name
     */
    String name();

    /**
     * Exact returned value.
     *
     * @return the value
     */
    String value() default "";

    /**
     * Hint about the returned value.
     *
     * @return the value hint
     */
    String valueHint() default "";

}
