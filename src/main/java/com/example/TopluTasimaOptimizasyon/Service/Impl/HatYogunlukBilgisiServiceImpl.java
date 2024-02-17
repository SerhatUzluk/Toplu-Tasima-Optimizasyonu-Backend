package com.example.TopluTasimaOptimizasyon.Service.Impl;

import com.example.TopluTasimaOptimizasyon.Dto.HatYogunlukBilgisiDto;
import com.example.TopluTasimaOptimizasyon.Entity.HatYogunlukBilgisi;
import com.example.TopluTasimaOptimizasyon.Mapper.HatYogunlukBilgisiMapper;
import com.example.TopluTasimaOptimizasyon.Repository.HatYogunlukBilgisiRepository;
import com.example.TopluTasimaOptimizasyon.Service.HatYogunlukBilgisiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HatYogunlukBilgisiServiceImpl implements HatYogunlukBilgisiService {

    private HatYogunlukBilgisiRepository hatYogunlukBilgisiRepository;
    public HatYogunlukBilgisiServiceImpl(HatYogunlukBilgisiRepository hatYogunlukBilgisiRepository){
        this.hatYogunlukBilgisiRepository = hatYogunlukBilgisiRepository;
    }
    @Override
    public HatYogunlukBilgisiDto hatYogunlukBilgisiOlustur(HatYogunlukBilgisiDto hatYogunlukBilgisiDto) {
        HatYogunlukBilgisi hatYogunlukBilgisi = HatYogunlukBilgisiMapper.mapToHatYogunlukBilgisi(hatYogunlukBilgisiDto);
        HatYogunlukBilgisi kaydedilmisBilgi = hatYogunlukBilgisiRepository.save(hatYogunlukBilgisi);
        return HatYogunlukBilgisiMapper.mapToHatYogunlukBilgisiDto(kaydedilmisBilgi);
    }

    @Override
    public List<HatYogunlukBilgisiDto> hatYogunlukBilgileriniGetir() {
        List<HatYogunlukBilgisi> hatYogunlukBilgileri = hatYogunlukBilgisiRepository.findAll();
        return  hatYogunlukBilgileri.stream().map((hatYogunlukBilgisi) -> HatYogunlukBilgisiMapper.mapToHatYogunlukBilgisiDto(hatYogunlukBilgisi))
                .collect(Collectors.toList());
    }
}
