package com.alphacoder.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FallbackResponse {
    private String code;
    private String message;
}
