package com.example.TopluTasimaOptimizasyon.Dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HatYogunlukBilgisiDto {
    private long id;
    private String kullaniciTipi;
    private LocalDateTime gidisZamani;
    private LocalDateTime donusZamani;
    private String hatBilgisi;
    private String durakBilgisi;
    private boolean gidisYonu;
    private boolean haftalikKullanim;
}
