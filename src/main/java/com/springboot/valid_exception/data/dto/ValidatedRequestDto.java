package com.springboot.valid_exception.data.dto;

import com.springboot.valid_exception.config.annotation.Telephone;
import com.springboot.valid_exception.group.ValidationGroup1;
import com.springboot.valid_exception.group.ValidationGroup2;
import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidatedRequestDto {
    @NotBlank
    private String name;

    @Email
    private String email;

    @Telephone
    private String phoneNumber;

    @Min(value = 20)
    @Max(value = 40)
    private int age;

    @Size(min = 0, max = 40)
    private String description;

    @Positive
    private int count;

    @AssertTrue
    private boolean booleanCheck;
}
