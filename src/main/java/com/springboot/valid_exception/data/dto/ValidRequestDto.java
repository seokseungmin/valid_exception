package com.springboot.valid_exception.data.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidRequestDto {

    @NotBlank
    String name;

    @Email
    String email;

    @Pattern(regexp = "^01(?:0|1|[6-9])[.-]?(\\d{4})[.-]?(\\d{4})$", message = "Phone number should be valid")
    private String phoneNumber;

    @Min(value = 20)
    @Max(value = 40)
    int age;

    @Size(min = 0, max = 40)
    String description;

    @Positive
    int count;

    @AssertTrue
    boolean booleanCheck;

}
