package com.luis;
import java.util.SortedSet; //se encarga de ordenar de un conjunto
import java.util.TreeSet;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        SortedSet conjunto = new TreeSet();
        /*conjunto.add("b");
        conjunto.add("w");
        conjunto.add("a");*/


        conjunto.add(5);
        conjunto.add(7);
        conjunto.add(1);





        Iterator it= conjunto.iterator();// se utiliza para rcorrer una coleccion
        while (it.hasNext()){
            Object elemento=it.next();
            System.out.println(elemento.toString());



        }





    }
}
