package com.example.TopluTasimaOptimizasyon.Controller;

import com.example.TopluTasimaOptimizasyon.Dto.HatYogunlukBilgisiDto;
import com.example.TopluTasimaOptimizasyon.Service.HatYogunlukBilgisiService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/hatYogunlukBilgisi")
public class HatYogunlukBilgisiController {

    private HatYogunlukBilgisiService hatYogunlukBilgisiService;

    @PostMapping
    public ResponseEntity<HatYogunlukBilgisiDto> hatYogunlukBilgisiOlustur(@RequestBody HatYogunlukBilgisiDto hatYogunlukBilgisiDto){
        HatYogunlukBilgisiDto kaydedilmisBilgi = hatYogunlukBilgisiService.hatYogunlukBilgisiOlustur(hatYogunlukBilgisiDto);
        return new ResponseEntity<>(kaydedilmisBilgi, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HatYogunlukBilgisiDto>> hatYogunlukBilgileriniGetir(){
        List<HatYogunlukBilgisiDto> hatYogunlukBilgisiDtoList = hatYogunlukBilgisiService.hatYogunlukBilgileriniGetir();
        return  ResponseEntity.ok(hatYogunlukBilgisiDtoList);
    }
}
