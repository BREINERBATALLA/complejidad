package com.mycompany.proyecto.complejidad.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author PC
 */
@Data
@Builder
@ToString

public class ProductDto {
    private String name;
    private Integer salePrice;
    private Integer[] rawMaterialQuantity;
  
}
