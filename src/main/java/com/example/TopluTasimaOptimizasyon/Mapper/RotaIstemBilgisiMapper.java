package com.example.TopluTasimaOptimizasyon.Mapper;

import com.example.TopluTasimaOptimizasyon.Dto.RotaIstemBilgisiDto;
import com.example.TopluTasimaOptimizasyon.Entity.RotaIstemBilgisi;

public class RotaIstemBilgisiMapper {

    public static RotaIstemBilgisiDto mapToRotaIstemBilgisiDto(RotaIstemBilgisi rotaIstemBilgisi){
        return new RotaIstemBilgisiDto(
                rotaIstemBilgisi.getId(),
                rotaIstemBilgisi.getKullaniciTipi(),
                rotaIstemBilgisi.getGidisZamani(),
                rotaIstemBilgisi.getDonusZamani(),
                rotaIstemBilgisi.getLat(),
                rotaIstemBilgisi.getLng(),
                rotaIstemBilgisi.isHaftalikKullanim()
        );
    }

    public static RotaIstemBilgisi mapToRotaIstemBilgisi(RotaIstemBilgisiDto rotaIstemBilgisiDto){
        return new RotaIstemBilgisi(
                rotaIstemBilgisiDto.getId(),
                rotaIstemBilgisiDto.getKullaniciTipi(),
                rotaIstemBilgisiDto.getGidisZamani(),
                rotaIstemBilgisiDto.getDonusZamani(),
                rotaIstemBilgisiDto.getLat(),
                rotaIstemBilgisiDto.getLng(),
                rotaIstemBilgisiDto.isHaftalikKullanim()
        );
    }
}
