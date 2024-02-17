package com.example.TopluTasimaOptimizasyon.Controller;

import com.example.TopluTasimaOptimizasyon.Dto.HatYogunlukBilgisiDto;
import com.example.TopluTasimaOptimizasyon.Dto.RotaIstemBilgisiDto;
import com.example.TopluTasimaOptimizasyon.Service.RotaIstemBilgisiService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/rotaIstemBilgisi")
public class RotaIstemBilgisiController {
    private RotaIstemBilgisiService rotaIstemBilgisiService;

    @PostMapping
    public ResponseEntity<RotaIstemBilgisiDto> RotaOlustur(@RequestBody RotaIstemBilgisiDto rotaIstemBilgisiDto){
        RotaIstemBilgisiDto kaydedilmisRota = rotaIstemBilgisiService.RotaOlustur(rotaIstemBilgisiDto);
        return new ResponseEntity<>(kaydedilmisRota, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RotaIstemBilgisiDto>> tumRotalariGetir(){
        List<RotaIstemBilgisiDto> rotaIstemBilgisiDtoList = rotaIstemBilgisiService.tumRotalariGetir();
        return  ResponseEntity.ok(rotaIstemBilgisiDtoList);
    }

}
