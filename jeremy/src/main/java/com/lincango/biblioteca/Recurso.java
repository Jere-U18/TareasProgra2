package com.lincango.biblioteca;


import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;



public class Recurso {

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String titulo;

    @Getter @Setter
    private TipoRecurso tipo;

    @Getter @Setter
    private boolean disponible;


    @Getter @Setter
    private Map<String,String> detalles;
    

    public Recurso(String id, String titulo, TipoRecurso tipo) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.disponible = false;
        this.detalles = new HashMap<>();
    }

    public void mostrarFichaTecnica() {
        System.out.println("------------------------------------");
        System.out.println("[" + tipo + "] ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Estado: " + (disponible ? "Disponible" : "Prestado"));
        
        
        detalles.forEach((llave, valor) -> System.out.println(llave + ": " + valor));
    }
    public void agregarDetalle(String clave, String valor) {
        this.detalles.put(clave, valor);
    }
    


   
    
}
