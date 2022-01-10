package com.exemplo.exemplo.Controller;

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
import com.exemplo.exemplo.Service.TesteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/testes")
public class ExerciciosController {

    @Autowired
    TesteService service;

    @GetMapping
    public ResponseEntity<?> teste() {

        TesteDto teste = service.teste();

        return ResponseEntity.ok().body(teste);
    }

    @PostMapping("/media")
    public ResponseEntity<?> media(@RequestBody DtoNotas notas) {

        MediaDto teste = service.media(notas);

        return ResponseEntity.ok().body(teste);
    }

    @PostMapping("/conversao")
    public ResponseEntity<?> conversao(@RequestBody MetrosDto metros) {

        ConversaoDto c = service.conversao(metros);

        return ResponseEntity.ok().body(c);

    }

    @PostMapping("/dobro")
    public ResponseEntity<?> dobro(@RequestBody LadosDto lados) {

        DobroDto d = service.dobro(lados);

        return ResponseEntity.ok().body(d);

    }

    @PostMapping("/salario")
    public ResponseEntity<?> salario(@RequestBody TrabalhoHorasDto dto) {

        SalarioMesDto s = service.sal(dto);

        return ResponseEntity.ok().body(s);
    }

    @PostMapping("/temperatura")
    public ResponseEntity<?> conversaoTemp(@RequestBody TempDto tempDto) {

        ConvTempDto con = service.conv(tempDto);

        return ResponseEntity.ok().body(con);
    }

    @PostMapping("/produtoA")
    public ResponseEntity<?> resultado01(@RequestBody NumerosDto numDto){

        ResultadoADto result = service.resul01(numDto);

        return ResponseEntity.ok().body(result);

    }
    @PostMapping("/produtoB")
    public ResponseEntity<?> resultado02(@RequestBody NumerosDto numDto){

        ResultadoBDto result = service.resul02(numDto);

        return ResponseEntity.ok().body(result);

    }
    @PostMapping("/produtoC")
    public ResponseEntity<?> resultado03(@RequestBody NumerosDto numDto){

        ResultadoCDto result = service.resul03(numDto);
     

        return ResponseEntity.ok().body(result);
     

    }

    @PostMapping("/peso")
    public ResponseEntity<?> resultadoPeso(@RequestBody AlturaDto alturaDto){

        PesoIdealDto peso = service.peso(alturaDto);

        return ResponseEntity.ok().body(peso);


    }

    @PostMapping("/multa")
    public ResponseEntity<?> multa(@RequestBody PesoTotalDto totalPesoDto){

    PesoTotalDto dto = service.pesoT(totalPesoDto);

    return ResponseEntity.ok().body(dto);

}

@PostMapping("/holerite")
    public ResponseEntity<?> totalBruto(@RequestBody DadosDto dto){
        
        DadosDto dtoDados = service.dados(dto);

        return ResponseEntity.ok().body(dtoDados);
    }

    @PostMapping("/pintura")
    public ResponseEntity<?> pintura(@RequestBody PinturaDto DtoPintura){

        PinturaDto p = service.pintura(DtoPintura);

        return ResponseEntity.ok().body(p);


    }
    @PostMapping("/internet")
    public ResponseEntity<?> net(@RequestBody VelocidadeInternet velocidade){

        VelocidadeInternet vel = service.internet(velocidade);

        return ResponseEntity.ok().body(vel);

    }





}
