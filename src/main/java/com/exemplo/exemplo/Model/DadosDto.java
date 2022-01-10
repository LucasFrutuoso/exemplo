package com.exemplo.exemplo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosDto {
    
    private double valorHora01;
    private double horasTrabalhadas01;
    private double totalBruto;
    private double impostoRenda;
    private double INSS;
    private double sindicato;
    private double totalLiquido;
    

}
