package com.demoapp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DTO {
    @Builder.Default
    private String defaultedParam = "some default";
    private String normalParam;
}
