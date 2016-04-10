package com.luis;

import java.util.*;

public class Main {




    public static void main(String[] args) {

//mapa es una coleccion que se encarga de collecionar elementos con valores
        //puede ocurrir un nullpointexcepcion tammbien usar un clear-containkey-containvalue:te valida un valor


        Map mapa=new HashMap();
        mapa.put("Elridge","95");
        mapa.put("Juan","30");
        mapa.put("Rolando","71");
        System.out.println("Los elementos del mapa son:");
        System.out.println(mapa);

        /*HashMap mapa=new HashMap();
        mapa.put("Elridge", new Double(95.65));
        mapa.put("Rolando", new Double(99.99));
        System.out.println(mapa);

        /*Set conjunto =mapa.entrySet();
        Iterator i=conjunto.iterator();
        while (i.hasNext()){
            Map.Entry e=(Map.Entry)i.next();
            System.out.println(e.getKey()+"Ganó");
            System.out.println(e.getValue());*/
        }








    }

