package org.example;

public class TelevisorApp {

    static void main(String[] args) {

        Televisor tv1 = new Televisor(2,10);

        tv1.subirVolumen();
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.bajarVolumen();

        tv1.getVolumen();
        System.out.println();

        Televisor tv2 = new Televisor();

        System.out.println(tv2.getCanal());
        System.out.println(tv2.getVolumen());

    }
}
