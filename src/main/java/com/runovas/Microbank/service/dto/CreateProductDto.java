package com.runovas.Microbank.service.dto;

import lombok.*;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateProductDto {
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
