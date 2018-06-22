package com.aaxiscommerce.cloud.annotation.web;

import feign.Headers;
import org.springframework.core.annotation.AliasFor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * Created by terrence on 2018/06/15.
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping(produces = { MediaType.APPLICATION_JSON_UTF8_VALUE }, method = { RequestMethod.GET })
@Headers("Content-Type: application/json")
public @interface ACCPGetMapping {
    @AliasFor(annotation = RequestMapping.class) String name() default "";

    @AliasFor(annotation = RequestMapping.class) String[] value() default {};

    @AliasFor(annotation = RequestMapping.class) String[] path() default {};

    @AliasFor(annotation = RequestMapping.class) String[] params() default {};

    @AliasFor(annotation = RequestMapping.class) String[] headers() default {};

    @AliasFor(annotation = RequestMapping.class) String[] consumes() default {};

}