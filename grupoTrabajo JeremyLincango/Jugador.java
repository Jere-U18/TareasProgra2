package com.lincango.grupoTrabajo;

import lombok.Getter;

public class Jugador {

    @Getter
    private int vida=4;

    @Getter
    private int vidaTotal=4;
    @Getter int poderTotal=2;

    @Getter
    private int poder=2;

    @Getter
    private int nivelesCompletados=0;

    @Getter
    private int fasesCompletadas=0;

    @Getter
    private int bonificacionVida=0;

    @Getter
    private int bonificacionPoder=0;


    static{

        System.out.println("===========================================================");
        System.out.println("BIENVENIDO A LIFE TREE II");
        System.out.println("EL ATAQUE A LAS RAMAS ANTIGUAS");
        System.out.println("===========================================================");
        System.out.println("Despues de la guerra que ocurrio hace eones en el arbol de ");
        System.out.println("la vida, seres ancestrales quieren tomar el control y asi");
        System.out.println("poder dominar todo el universo entero");
        System.out.println("Tú, nacido de las viejas ruinas del arbol, deberas proteger");
        System.out.println("lo que alguna vez fue tu hogar y restaurar la paz que");
        System.out.println("habia perdurado, hasta este momento...");
        System.out.println("===========================================================");
    }

    {
        System.out.println("[ESTADISTICAS] Iniciando...");
        System.out.println("[FASES] Ramas completadas: 0");
        System.out.println("[NIVEL] 0-0");
        
    }
    
    public void registrarBonificacion(String tipo) {

        
        if (tipo.equalsIgnoreCase("vida")) {
            this.vida += 2;
            this.bonificacionVida++;
            this.vidaTotal+=2;
            this.vida=vidaTotal;
        } else {
            this.poder += 1;
            this.bonificacionPoder++;
            this.poderTotal++;
        }
        
    }

    public void bonificacion(){
        registrarBonificacion("");
    }

    public void completarNivel(){
        nivelesCompletados++;
    }

    public void completarFase(){
        fasesCompletadas++;
    }

    public void recibirDaño(int daño){
        this.vida-=daño;
        if(this.vida<=0){
            this.vida=1;
            System.out.println("¡¡TE QUEDA 1 VIDA!!");
            System.out.println("SE AUMENTO TU PODER...");

        }else{
            System.out.println("Recibiste "+daño+" de daño. Tu vida es de: "+this.vida);

        }
        
    }

    public void mostrarEstadisticas(){

        System.out.println("====================================");
        System.out.println("Nivel actual (Niveles completados): " + nivelesCompletados);
        System.out.println("Bonificaciones aplicadas -> Vida: " + bonificacionVida);
        System.out.println("Vida actual: "+getVida());
        System.out.println("Vida Maxima: "+getVidaTotal());
        System.out.println("Bonificaciones aplicadas -> Poder:" + bonificacionPoder);
        System.out.println("Poder Total: "+getPoderTotal());
        System.out.println("====================================");
    }
    



}
