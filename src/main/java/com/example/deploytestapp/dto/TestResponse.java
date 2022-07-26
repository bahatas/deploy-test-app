package com.example.deploytestapp.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestResponse {
    String response ;
}
