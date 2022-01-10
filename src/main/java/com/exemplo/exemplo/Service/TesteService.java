package com.exemplo.exemplo.Service;

import com.exemplo.exemplo.Model.AlturaDto;
import com.exemplo.exemplo.Model.ConvTempDto;
import com.exemplo.exemplo.Model.ConversaoDto;
import com.exemplo.exemplo.Model.DadosDto;
import com.exemplo.exemplo.Model.DobroDto;
import com.exemplo.exemplo.Model.DtoNotas;
import com.exemplo.exemplo.Model.LadosDto;
import com.exemplo.exemplo.Model.MediaDto;
import com.exemplo.exemplo.Model.MetrosDto;
import com.exemplo.exemplo.Model.NumerosDto;
import com.exemplo.exemplo.Model.PesoIdealDto;
import com.exemplo.exemplo.Model.PesoTotalDto;
import com.exemplo.exemplo.Model.PinturaDto;
import com.exemplo.exemplo.Model.ResultadoADto;
import com.exemplo.exemplo.Model.ResultadoBDto;
import com.exemplo.exemplo.Model.ResultadoCDto;
import com.exemplo.exemplo.Model.SalarioMesDto;
import com.exemplo.exemplo.Model.TempDto;
import com.exemplo.exemplo.Model.TesteDto;
import com.exemplo.exemplo.Model.TrabalhoHorasDto;
import com.exemplo.exemplo.Model.VelocidadeInternet;

import org.springframework.stereotype.Service;

@Service
public class TesteService {
    
    public TesteDto teste(){

        TesteDto teste = new TesteDto();
        teste.setMensagem("Alo, mundo");

        return teste;
    }


    public MediaDto media( DtoNotas notas){
        
        double resul = (notas.getN1() + notas.getN2()
        + notas.getN3() + notas.getN4()) / 4;

        MediaDto media = new MediaDto();

        media.setResultado(resul);

        return media;
    }

   
    public ConversaoDto conversao(MetrosDto metros){
        
        double resul = metros.getMetros() * 100;

        ConversaoDto dto = new ConversaoDto();

        dto.setMetros(resul);

        return dto;
    }

    public DobroDto dobro(LadosDto lados){

        double resul = (lados.getHeight() + lados.getWidth()) * 2;

        DobroDto dto = new DobroDto();

        dto.setDobro(resul);

        return dto;


    }

    public SalarioMesDto sal(TrabalhoHorasDto horasDto){

        double salario = horasDto.getHorasTrabalhadas() * horasDto.getSalarioHora();

        SalarioMesDto s = new SalarioMesDto();

        s.setSalarioTotal(salario);

        return s;
    }

    public ConvTempDto conv(TempDto tempDto){

        double celsius = ((tempDto.getTemp() - 32) / 9 ) * 5;

        ConvTempDto conv = new ConvTempDto();

        conv.setConversaoParaFarenheit(celsius);

        return conv;
        

      }

      public ResultadoADto resul01(NumerosDto numDto){

        double result01 = (numDto.getNum1() * 2) + (numDto.getNum2() / 2);

        ResultadoADto res01  = new ResultadoADto();

        res01.setA(result01);

        return res01;


      }
    
      public ResultadoBDto resul02(NumerosDto numDto){

        double result02 = (numDto.getNum1() * 3) + numDto.getReal();

        ResultadoBDto res02  = new ResultadoBDto();

        res02.setB(result02);

        return res02;


      }
      public ResultadoCDto resul03(NumerosDto numDto){

        double result03 = Math.pow(numDto.getReal(), 3);

        ResultadoCDto res03  = new ResultadoCDto();

        res03.setC(result03);

        return res03;

      }

      public PesoIdealDto peso(AlturaDto dtoAltura){
        
        double resultado = (73 * dtoAltura.getAltura()) - 58;

        PesoIdealDto pesoIdeal = new PesoIdealDto();

        pesoIdeal.setPesoIdeal(resultado);

        return pesoIdeal;
    
    }

    public PesoTotalDto pesoT(PesoTotalDto total){

      double excesso = total.getMulta_A_Pagar_Em_Reais() - 50;
      double multa = excesso * 4;

      PesoTotalDto pesoTotal = new PesoTotalDto();

      pesoTotal.setMulta_A_Pagar_Em_Reais(multa);

      return pesoTotal;


    }

    public DadosDto dados(DadosDto dto){

      double horaTrabalhada = dto.getHorasTrabalhadas01();
      double valorHoras = dto.getValorHora01();
      double totalBruto = valorHoras * horaTrabalhada;
      double impostoRenda = (totalBruto * 11) / 100.0;
      double INSS =(totalBruto * 8) / 100.0;
      double sindicato = (totalBruto * 5) / 100.0;
      double totalLiquido = totalBruto - impostoRenda 
      - INSS - sindicato;

      
     
      DadosDto d = new DadosDto();

      d.setHorasTrabalhadas01(horaTrabalhada);
      d.setValorHora01(valorHoras);
      d.setTotalBruto(totalBruto);
      d.setImpostoRenda(impostoRenda);
      d.setINSS(INSS);
      d.setSindicato(sindicato);
      d.setTotalLiquido(totalLiquido);

      
      return d;
    }

    public PinturaDto pintura(PinturaDto DtoPintura){
      double metros = DtoPintura.getMetrosPintados();
      double metrosPorLatas = 18 * 3;
      double precoDaLata = 80;
      double latas = metros / metrosPorLatas;

      PinturaDto dto = new PinturaDto();

      dto.setMetrosPintados(metros);
      dto.setMetrosPorLata(metrosPorLatas);
      dto.setPrecoLata(precoDaLata);
      dto.setLatas(latas);

      return dto;
    }

    public VelocidadeInternet internet(VelocidadeInternet net){

      double MB = net.getTamanhoArquivo();
      double Mb = net.getVelocidade();

      double tempo = MB /(Mb / 8);

      VelocidadeInternet dto = new VelocidadeInternet();

      dto.setTamanhoArquivo(MB);
      dto.setVelocidade(Mb);
      dto.setTempoEmMinutos(tempo);

      return dto;

    }


}

