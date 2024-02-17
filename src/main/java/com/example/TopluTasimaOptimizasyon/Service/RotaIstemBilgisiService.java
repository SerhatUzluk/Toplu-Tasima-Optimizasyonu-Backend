package com.example.TopluTasimaOptimizasyon.Service;

import com.example.TopluTasimaOptimizasyon.Dto.RotaIstemBilgisiDto;

import java.util.List;

public interface RotaIstemBilgisiService {
    RotaIstemBilgisiDto RotaOlustur(RotaIstemBilgisiDto rotaIstemBilgisiDto);

    List<RotaIstemBilgisiDto> tumRotalariGetir();

}
