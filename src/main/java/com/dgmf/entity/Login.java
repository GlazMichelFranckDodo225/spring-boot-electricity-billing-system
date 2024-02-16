package com.dgmf.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "tbl_login")
public class Login {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String meterNo;
    private String name;
    private String username;
    private String password;
    private String user;
}
