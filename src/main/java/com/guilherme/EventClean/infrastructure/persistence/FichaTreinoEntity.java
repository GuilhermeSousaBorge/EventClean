package com.guilherme.EventClean.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Fichas_treinos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FichaTreinoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exercise_name")
    private String exerciseName;

    @Column(name = "week_day")
    private String weekDay;

    @Column(name = "advanced_technique")
    private String AdvancedTechnique;

    @Column(name = "url_video")
    private String url_video;

    private int sets;

    private int reps;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
