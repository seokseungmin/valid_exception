package com.springboot.valid_exception.data.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class ProductDto {
    private String name;
    private int price;
    private int stock;
}
