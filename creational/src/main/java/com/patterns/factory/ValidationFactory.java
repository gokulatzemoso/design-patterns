package com.patterns.factory;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

public class ValidationFactory {

    public static Function<String, Boolean> makeValidator(Datatype datatype) {
        return switch (datatype) {
            case STRING -> stringValidator();
            case INTEGER -> integerValidator();
            default -> null;
        };
    }

    private static Function<String, Boolean> stringValidator() {
        return (input) -> {
            return StringUtils.isEmpty(input) || StringUtils.isAllUpperCase(input);
        };
    }

    private static Function<String, Boolean> integerValidator() {
        return (input) -> {
            return Integer.parseInt(input) > 20;
        };
    }
}
