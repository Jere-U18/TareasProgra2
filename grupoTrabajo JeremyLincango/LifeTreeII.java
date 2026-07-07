package com.lincango.grupoTrabajo;

import java.util.Scanner;

import com.lincango.grupoTrabajo.Enemigos.JefeFase;
import com.lincango.grupoTrabajo.Enemigos.JefeFinal;

public class LifeTreeII {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Jugador jugador = new Jugador();

        // ARREGLOS ASIMÉTRICOS: Configuración del mapa por ramas
        // Rama 0: Inicio (1 nivel), Rama 1: 3 niveles, Rama 2: 5 niveles, Rama 3: 2 nivel + jefe final
        int[][] mapaArbol=new int[4][];
           mapaArbol[0]= new int[1]; // Rama 1 
            mapaArbol[1]= new int[3]; // Rama 2
            mapaArbol[2]= new int[5]; // Rama 3
            mapaArbol[3]= new int[2]; // Rama 4 
        

        System.out.println("Comienza tu viaje a través de las " + mapaArbol.length + " ramas del arbol.\n");

        for (int rama = 0; rama < mapaArbol.length; rama++) {
            jugador.completarFase();
            System.out.println("\n ---- ENTRANDO A LA RAMA [" + (rama + 1) + "] ----");
            
            for (int nivel = 0; nivel < mapaArbol[rama].length; nivel++) {
                System.out.println("\n Completando Nivel " + (nivel + 1) + " de la Rama " + (rama + 1) + "...\n");
                jugador.completarNivel();

                jugador.mostrarEstadisticas();

                // CLase anonima: Bonificación al pasar cada nivel

                
                System.out.println("¡Nivel superado! Elige tu bonificación:");
                System.out.println("1. Mejorar Vida (+2 PS)\n2. Mejorar Poder (+1 ATQ)");
                int opcion = scanner.nextInt();

                Jugador aplicarMejora = new Jugador() {//clase anonima
                    @Override
                    public void bonificacion() {
                        if (opcion == 1) {
                            jugador.registrarBonificacion("vida");
                            System.out.println(" ---------¡Vida máxima aumentada!----------");
                            
                        } else {
                            jugador.registrarBonificacion("poder");
                            System.out.println(" ----------¡Poder de ataque aumentado!----------");
                            
                        }
                    }
                };
                aplicarMejora.bonificacion();

                // (Batalla de jefe final)
                if (nivel == mapaArbol[rama].length - 1) {
                    Enemigos jefe;
                    
                    // Configuración de jefes
                    if (rama == mapaArbol.length - 1) {
                        // Instanciación de jefe final
                        jefe = new JefeFinal("Guardian celestial", 50);
                    } else {
                        // Upcasting automático a la clase sellada Enemigo
                        jefe = new JefeFase("Guardián de la Rama " + (rama + 1), 15);
                    }

                    System.out.println("\n ¡CUIDADO! Un jefe ha aparecido: " + jefe.getNombre());
                    
                    // Polimorfismo con interface aqui y clase anonima
                    Movimientos accionesFase = new Movimientos() {
                        @Override
                        public void esquivarAtaque() {
                            System.out.println(" Esquivas hábilmente el golpe del " + jefe.getNombre());
                        }

                        @Override
                        public void contraAtacar() {
                            System.out.println(" ¡Contraataque directo! Infliges " + jugador.getPoder() + " de daño.");
                        }

                        @Override
                        public void lanzarPoder() {
                            System.out.println(" Lanzase un destello vital causando " + (jugador.getPoder() * 2) + " de daño.");
                        }
                    };

                    // Simulación rápida del combate de fase
                    accionesFase.esquivarAtaque();
                    jefe.atacar();  //Upcasting aqui
                    accionesFase.contraAtacar();
                    accionesFase.lanzarPoder();

                    // CASTING DE OBJETOS (Downcasting)
                    if (jefe instanceof JefeFinal) {
                        // Downcasting lo hago aqui
                        JefeFinal supremo = (JefeFinal) jefe;
                        supremo.ataqueEspecial(jugador);
                    } else {
                        // Los jefes normales quitan una cantidad fija controlada por recibirDaño()
                        jugador.recibirDaño(5);
                    }

                    
                    System.out.println(" ¡Has derrotado a " + jefe.getNombre() + "!");
                    

                }
            }
        }
        System.out.println("CONSEGUISTE LA LLAVE DE LA VIDA");

        System.out.println("\n ¡FELICIDADES! Has completado LIFE TREE II.");
        System.out.println("\n Tus estadisticas son:");
        jugador.mostrarEstadisticas();
    }
    }

