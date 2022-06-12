package com.example.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Getter
@Setter
public class Anime implements Serializable {

    private Long id;
    private String nome;

}
