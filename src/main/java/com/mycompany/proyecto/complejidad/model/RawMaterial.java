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
public class RawMaterial {
    private String name;
    private Integer cost;
    private Integer availability;
}
