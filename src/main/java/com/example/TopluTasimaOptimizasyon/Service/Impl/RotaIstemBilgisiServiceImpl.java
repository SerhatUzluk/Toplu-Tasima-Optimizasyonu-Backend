package com.example.TopluTasimaOptimizasyon.Service.Impl;

import com.example.TopluTasimaOptimizasyon.Dto.RotaIstemBilgisiDto;
import com.example.TopluTasimaOptimizasyon.Entity.RotaIstemBilgisi;
import com.example.TopluTasimaOptimizasyon.Mapper.RotaIstemBilgisiMapper;
import com.example.TopluTasimaOptimizasyon.Repository.RotaIstemBilgisiRepository;
import com.example.TopluTasimaOptimizasyon.Service.RotaIstemBilgisiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RotaIstemBilgisiServiceImpl implements RotaIstemBilgisiService {

    private RotaIstemBilgisiRepository rotaIstemBilgisiRepository;

    public  RotaIstemBilgisiServiceImpl(RotaIstemBilgisiRepository rotaIstemBilgisiRepository){
        this.rotaIstemBilgisiRepository = rotaIstemBilgisiRepository;
    }
    @Override
    public RotaIstemBilgisiDto RotaOlustur(RotaIstemBilgisiDto rotaIstemBilgisiDto) {
        RotaIstemBilgisi rotaIstemBilgisi = RotaIstemBilgisiMapper.mapToRotaIstemBilgisi(rotaIstemBilgisiDto);
        RotaIstemBilgisi kaydedilmisRota = rotaIstemBilgisiRepository.save(rotaIstemBilgisi);
        return  RotaIstemBilgisiMapper.mapToRotaIstemBilgisiDto(kaydedilmisRota);
    }

    @Override
    public List<RotaIstemBilgisiDto> tumRotalariGetir() {
        List<RotaIstemBilgisi> rotalar = rotaIstemBilgisiRepository.findAll();
        return rotalar.stream().map((rotaIstemBilgisi) -> RotaIstemBilgisiMapper.mapToRotaIstemBilgisiDto(rotaIstemBilgisi))
                .collect(Collectors.toList());
    }
}
