package com.lincango.biblioteca2;

import lombok.Getter;
import lombok.Setter;

public class Libro2 extends Recurso2 {

    @Getter @Setter
    private String autor;

    @Getter @Setter
    private int paginas;

    public Libro2(String id, String titulo, String autor, int paginas) {

        super(id, titulo, true);

        this.autor = autor;
        this.paginas = paginas;
    }

    @Override
    public void mostrarFichaTecnica() {

        System.out.println("--- [LIBRO] ---");
        System.out.println("ID: " + getId() + " | Título: " + getTitulo());
        System.out.println("Autor: " + autor + " | Páginas: " + paginas);
        System.out.println();

    }
}
