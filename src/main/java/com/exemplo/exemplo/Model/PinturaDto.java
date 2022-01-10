package com.exemplo.exemplo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PinturaDto {
    
    private double metrosPintados;
    private double metrosPorLata;
    private double precoLata;
    private double latas;
}
