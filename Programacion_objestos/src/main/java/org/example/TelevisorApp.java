package org.example;

public class TelevisorApp {

    static void main(String[] args) {

        Televisor tv1 = new Televisor(2,10);

        tv1.subirVolumen();
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.bajarVolumen();

        tv1.getVolumen();

    }
}
