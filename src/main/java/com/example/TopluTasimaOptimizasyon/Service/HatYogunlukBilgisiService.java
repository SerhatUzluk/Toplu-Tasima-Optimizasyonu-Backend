package com.example.TopluTasimaOptimizasyon.Service;

import com.example.TopluTasimaOptimizasyon.Dto.HatYogunlukBilgisiDto;

import java.util.List;

public interface HatYogunlukBilgisiService {

    HatYogunlukBilgisiDto hatYogunlukBilgisiOlustur(HatYogunlukBilgisiDto hatYogunlukBilgisiDto);

    List<HatYogunlukBilgisiDto> hatYogunlukBilgileriniGetir();
}
