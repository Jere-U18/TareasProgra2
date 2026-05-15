package com.lincango.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {

    private List<Recurso> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }


    public void registrarRecurso(Recurso r) {
        inventario.add(r);
    }

    

    public List<Recurso> filtrarPorTipo(TipoRecurso tipo) {

        return inventario.stream().filter(r -> r.getTipo() == tipo)
                                  .collect(Collectors.toList());
    }


    public Recurso buscarPorId(String id) {

        for (Recurso r : inventario) {
            if (r.getId().equals(id)) {
                return r;
            }
        }
        return null;
    }

    public void mostrarInventario() {

        System.out.println("<<<< INVENTARIO COMPLETO >>>>");
        
        for (Recurso r : inventario) {

            r.mostrarFichaTecnica();
        
        }

        
    }
}
