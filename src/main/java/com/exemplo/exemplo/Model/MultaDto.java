package com.exemplo.exemplo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultaDto {
 
    private double excesso;
    private double multa;
    private double total;

}
