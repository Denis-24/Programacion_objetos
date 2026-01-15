package org.example;

public class Televisor {
    private int canal;
    private int volumen;

    public Televisor(int canal, int volumen){
        this.canal = canal;
        this.volumen = volumen;
    }

    public Televisor(){
        canal = 1;
        volumen = 5;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void subirCanal(){
        if (canal==100){
            canal=1;
        }else{
            canal+=1;
        }
        System.out.println("Canal: " + canal);
    }

    public void bajarCanal(){
        if (canal==1){
            canal=100;
        }else{
            canal-=1;
        }
        System.out.println("Canal: " + canal);
    }

    public void subirVolumen(){
        if (volumen==100){
            volumen=1;
        }else{
            volumen+=1;
        }
        System.out.println("Nivel del volumen: " + volumen);
    }

    public void bajarVolumen(){
        if (volumen==1){
            volumen=100;
        }else{
            volumen-=1;
        }
        System.out.println("Nivel del volumen: " + volumen);
    }

}


