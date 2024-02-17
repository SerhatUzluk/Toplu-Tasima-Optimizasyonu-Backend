package com.example.TopluTasimaOptimizasyon.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class RotaIstemBilgisi {
    @Id
    private long id;
    @Column(nullable = false)
    private String kullaniciTipi;
    @Column(nullable = false)
    private LocalDateTime gidisZamani;
    @Column(nullable = false)
    private LocalDateTime donusZamani;
    @Column(nullable = false)
    private double lat;
    @Column(nullable = false)
    private double lng;
    @Column(nullable = false)
    private boolean haftalikKullanim;
}
