package com.example.TopluTasimaOptimizasyon.Entity;
import jakarta.persistence.*;
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
public class HatYogunlukBilgisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String kullaniciTipi;
    @Column(nullable = false)
    private LocalDateTime gidisZamani;
    @Column(nullable = false)
    private LocalDateTime donusZamani;
    @Column(nullable = false)
    private String hatBilgisi;
    @Column(nullable = false)
    private String durakBilgisi;
    @Column(nullable = false)
    private boolean gidisYonu;
    @Column(nullable = false)
    private boolean haftalikKullanim;
}
