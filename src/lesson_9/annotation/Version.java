package lesson_9.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface Version {
    String versionNumber();

    String versionName() default "";
}
