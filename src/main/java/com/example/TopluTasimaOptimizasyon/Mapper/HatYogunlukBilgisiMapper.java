package com.example.TopluTasimaOptimizasyon.Mapper;

import com.example.TopluTasimaOptimizasyon.Dto.HatYogunlukBilgisiDto;
import com.example.TopluTasimaOptimizasyon.Entity.HatYogunlukBilgisi;

public class HatYogunlukBilgisiMapper {

    public static HatYogunlukBilgisiDto mapToHatYogunlukBilgisiDto(HatYogunlukBilgisi hatYogunlukBilgisi){
        return new HatYogunlukBilgisiDto(
                hatYogunlukBilgisi.getId(),
                hatYogunlukBilgisi.getKullaniciTipi(),
                hatYogunlukBilgisi.getGidisZamani(),
                hatYogunlukBilgisi.getDonusZamani(),
                hatYogunlukBilgisi.getHatBilgisi(),
                hatYogunlukBilgisi.getDurakBilgisi(),
                hatYogunlukBilgisi.isGidisYonu(),
                hatYogunlukBilgisi.isHaftalikKullanim()
        );
    }
    public static HatYogunlukBilgisi mapToHatYogunlukBilgisi(HatYogunlukBilgisiDto hatYogunlukBilgisiDto){
        return new HatYogunlukBilgisi(
                hatYogunlukBilgisiDto.getId(),
                hatYogunlukBilgisiDto.getKullaniciTipi(),
                hatYogunlukBilgisiDto.getGidisZamani(),
                hatYogunlukBilgisiDto.getDonusZamani(),
                hatYogunlukBilgisiDto.getHatBilgisi(),
                hatYogunlukBilgisiDto.getDurakBilgisi(),
                hatYogunlukBilgisiDto.isGidisYonu(),
                hatYogunlukBilgisiDto.isHaftalikKullanim()
        );
    }
}
