package com.exemplo.exemplo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VelocidadeInternet {
    
    private Double tamanhoArquivo;
    private Double velocidade;
    private Double tempoEmMinutos;

}
