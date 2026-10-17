package com.miki.demo.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    @NotNull(message = "name should not be null")
    private String name;

    @Min(18)
    @Max(80)
    private Integer age;

    @Email(message = "invalid email")
    private String email;

    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?!.*[^a-zA-Z0-9@#$^+=])(.{8,16})$")
    private String password;
}
