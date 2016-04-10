package com.luis;

public class Main {

    public static void main(String[] args) {

        //Excepciones y colecciones (listas,diccionarios y conjuntos)

        //exepciones - try-catch-finally

        //try un codigo propenso que ocurra un error en ese bloque

        /*try {
            //bloque de codigo sospechoso
            System.out.println("Bloque de codigo sospechoso");
        } catch (Exception e) {

            System.out.println("Ocurrio una excepciono");
        } finally {// puedes tener un try y luego un finally-los puedes trabajar en combinaciones
            System.out.println("Siempre me ejecuta ");]*/

        try {
        System.out.println("Ejecutemos al sospechosos");
        System.out.println("sospechoso 1");  // int n=Integer.parseInt("M") //error
        System.out.println("sospechoso 2");
        System.out.println("sospechoso 3");
}catch (NumberFormatExcepcion e){ System.out.println("capturamos NumberFormatExcepcion");
} catch (Exception e){
        System.out.println("capturamos al sospechoso");
} finally {
        System.out.println("capturamos o no al sospechosos");


}
