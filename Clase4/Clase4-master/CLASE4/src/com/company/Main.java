package com.company;

public class Main {

    public static void main(String[] args) {

        //Tipos de datos primitivos

        //para datos numeros enteros
        byte a=100;  //entero de 8 bits
        short c = 10000; //entero 16 bits
        int m = 1500; //entero 32 bits
        long l = 1500L; //entero 64 bits

        //para numeros decimales

        float f1=234.5f; //precision 32 bits
        double d1=213.4; //precision 64 bits

        // otro datos primitivos - boolenanos

        boolean one = true;
        boolean two = false;

        //datos char //representa un caracter
        char letraA= 'A';

        //CADENAS

        String mensaje = "Hola Mundo!";

        /*
        Esto es un comentario
        de varias lineas.
         */


        int edad;
        edad=0;

        String nombre="Carlos";
        double nota1,nota2,nota3;

        //Constantes - definir

        final String DEPARTAMENTO ="Finanzas";
        final double PI=3.1416;

        //IMPRIMIR EN PANTALLA EN JAVA SE UTILIZA
        System.out.println("Hola Panama");


        //OPERADORES - PUEDEN SER ARITMETICOS - LOGICOS - RELACIONALES
        //OPERADORES ARITMETICOS TE PERMITEN HACER OPERACIONES MATEMATICAS
        System.out.printf("Suma:"+(a+m));
        System.out.printf("Resta:"+(a-m));
        System.out.printf("Multipliccion:"+(a*m));
        System.out.printf("Division:"+(a/m));
        System.out.printf("Residuo:"+(a%m));
        System.out.printf("Incremento:"+(a++));
        System.out.printf("Decremento:"+(a--));





    }
}
