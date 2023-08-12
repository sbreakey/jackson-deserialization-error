package com.demoapp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DTO {
    private String defaultedParam;
    private String normalParam;
}
