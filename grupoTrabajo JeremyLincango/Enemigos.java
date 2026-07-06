package com.lincango.grupoTrabajo;

import lombok.Getter;

sealed class Enemigos {

    @Getter 
    protected String nombre;

    @Getter
    protected int vida;

    public Enemigos(String nombre, int vida){
        this.nombre=nombre;
        this.vida=vida;

    }

    public void atacar(){
        System.out.println(nombre+" lanzó un ataque basico");

    }

    


    final static class JefeFase extends Enemigos{

        public JefeFase(String nombre, int vida) {
            super(nombre, vida);
            //TODO Auto-generated constructor stub
        }

    }

    final static class JefeFinal extends Enemigos{

        public JefeFinal(String nombre, int vida) {
            super(nombre, vida);
            //TODO Auto-generated constructor stub
        }

        public void ataqueEspecial(Jugador jugador){
            System.out.println("EL jefe final uso Relampago Oscuro");
            int vidaActual=jugador.getVida();
            int daño=vidaActual/2;
            jugador.recibirDaño(daño);
        }

    }

    
}
