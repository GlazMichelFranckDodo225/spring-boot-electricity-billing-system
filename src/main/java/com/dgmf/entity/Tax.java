package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "tbl_tax")
public class Tax {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Float costPerUnit = 9.0F;
    private Float meterRent = 47.0F;
    private Float serviceCharge = 22.0F;
    private Float serviceTax = 57.0F;
    private Float sbt = 6.0F;
    private Float fixedTax = 18.0F;
}
