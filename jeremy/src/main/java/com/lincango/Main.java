package com.lincango;

import java.util.ArrayList;
import java.util.List;


import com.lincango.biblioteca2.Libro2;
import com.lincango.biblioteca2.Recurso2;
import com.lincango.biblioteca2.Revista2;

/*import com.lincango.biblioteca.Biblioteca;
import com.lincango.biblioteca.Recurso;
import com.lincango.biblioteca.TipoRecurso;*/

public class Main {
    public static void main(String[] args) {


        List<Recurso2> inventario = new ArrayList<>();
       
        Libro2 libro1 = new Libro2("L001", "Cien años de soledad", "Gabriel García Márquez", 471);

        Revista2 revista1 = new Revista2("R001", "National Geographic", "Mayo", 245);

        inventario.add(libro1);
        inventario.add(revista1);

        
        System.out.println("--- INVENTARIO HERENCIA ---");
        System.out.println();
        
        for (Recurso2 r : inventario) {
            r.mostrarFichaTecnica(); 
        } //por un momento me dio error, pero fue por tener 2 clases con mismo nombre en diferente paquete
          }
}  
        
        /*Biblioteca miBiblioteca = new Biblioteca();

        // Crear un Libro
        Recurso libro1 = new Recurso("L001", "Cien años de soledad", TipoRecurso.LIBRO);
        libro1.agregarDetalle("Autor", "Gabriel García Márquez");
        libro1.agregarDetalle("Páginas", "471");

        // Crear una Revista
        Recurso revista1 = new Recurso("R001", "National Geographic", TipoRecurso.REVISTA);
        revista1.agregarDetalle("Mes", "Mayo");
        revista1.agregarDetalle("Edición", "245");

        // Registrar en el sistema
        miBiblioteca.registrarRecurso(libro1);
        miBiblioteca.registrarRecurso(revista1);

        // Mostrar todos los recursos y sus atributos
        miBiblioteca.mostrarInventario();

        // Mostrar todo por tipo
        System.out.println("\n--- Filtrando Revistas ---");
        List<Recurso> revistas = miBiblioteca.filtrarPorTipo(TipoRecurso.REVISTA);
        revistas.forEach(Recurso::mostrarFichaTecnica);

        // Prueba de búsqueda
        System.out.println("\nBuscando recurso L001...");
        Recurso encontrado = miBiblioteca.buscarPorId("L001");
        if (encontrado != null) {
            System.out.println("Resultado de búsqueda: " + encontrado.getTitulo());
        }

        //supongo que aqui seria del punto 4.1, seria en demostrar como pueden añadir
        // revistas o librs usando la misma clase recurso

        Recurso revista2 = new Recurso("R002", "Nasa",TipoRecurso.REVISTA);
        revista2.agregarDetalle("Mes", "Mayo"); 
        revista2.agregarDetalle("N.Paginas", "200");

        //por si acaso no le entindo muy bien el uso de los hashmap y map profe*/




