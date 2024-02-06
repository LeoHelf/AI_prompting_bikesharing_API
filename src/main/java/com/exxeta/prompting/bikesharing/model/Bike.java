package com.exxeta.prompting.bikesharing.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private final Long id = 0L;
    @Column(name = "user_fk", nullable = false)
    private final Long userId = 0L;

    private final String name = null;
    private final boolean isRented = false;
    private final float latitude = 0;
    private final float longitude = 0;
    private final String geohash = null;
}
