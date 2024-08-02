package com.springboot.valid_exception.data.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Builder
@ToString
public class ProductResponseDto {

    private Long number;
    private String name;
    private int price;
    private int stock;
}
