package com.lincango.biblioteca2;

import lombok.Getter;
import lombok.Setter;

public class Revista2 extends Recurso2 {

    @Getter @Setter
    private String mes;

    @Getter @Setter
    private int edicion;

    public Revista2(String id, String titulo, String mes, int edicion) {
        super(id, titulo, true);
        this.mes = mes;
        this.edicion = edicion;
    }

    @Override
    public void mostrarFichaTecnica() {

        System.out.println("--- [REVISTA] ---");
        System.out.println("ID: " + getId() + " | Título: " + getTitulo());
        System.out.println("Edición: " + edicion + " (Mes: " + mes + ")");
        System.out.println();

    }
}
