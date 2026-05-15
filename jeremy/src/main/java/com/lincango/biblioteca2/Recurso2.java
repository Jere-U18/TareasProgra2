package com.lincango.biblioteca2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
public abstract class Recurso2 {

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String titulo;

    @Getter @Setter
    private boolean disponible = true;


    public abstract void mostrarFichaTecnica();
}
