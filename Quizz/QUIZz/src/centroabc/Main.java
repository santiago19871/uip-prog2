package centroabc;

import java.util.*;

//QUIZ#
//USTED FUE CONTRATADO POR EL CENTRO EDUCATIVO ABC PARA CREAR UN PROGRAMA DE CONSOLA QUE MANEJE UN MODULO DEL
// SISTEMA DE MATRICULA PARA LOS CURSOS DE EDUCACION EN LINEA. LOS CURSOS DISPONIBLES SON "PROGRAMACION EN C++",
//"PROGRAMACION EN PYTHON", "PROGRAMACION EN JAVA". LOS DATOS A SOLICITAR POR CADA ESTUDIANTE SON SU NOMBRE,
// APELLIDO,CEDULA Y TELEFONO. EL PROGRAMA DEBE SOLICITAR LOS DATOS DEL ESTUDIANTE Y EL CURSO A TOMAR.
//ADEMAS DEBE MANTENER ESTADISTICAS DE CUANTOS ESTUDIANTES HAY POR CURSO



public class Main {

    private static Scanner estudiante;


    public static void main(String[] args)throws Exception {


        String nombre;
        String apellido;
        String keyboard=" Ingreso letras en vez de numeros solicitados";
        int numero;
        int cedula;
        int celular;
        int x;
        String opcion = "s";


        System.out.println("Biemvenidos a Sistema en linea - >Centro Educativo ABC");
        System.out.println("Estos son los cursos en linea disponibles");
        System.out.println("OPCION 1-> PROGRAMACION EN C++");
        System.out.println("OPCION 2 ->PROGRAMACION EN PYTHON");
        System.out.println("OPCION 3->PROGRAMACION EN JAVA");
        System.out.println("Digite la cantidad de estudiantes que se matricularan: ");

        Scanner estudiante = new Scanner(System.in);

        int l=0; int m=1;
        int o=0; int p=1;
        int q=0;int r=1;
        int n = estudiante.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("Digite la opcion del curso: ");


            x = estudiante.nextInt();
            if (x == 1) {
                System.out.println("Programacion en C++");
                System.out.println("Digite el nombre: ");
                nombre = estudiante.next();
                try {
                    numero=Integer.parseInt(nombre);
                    System.out.println("Escribio un numero en vez de un nombre, Porfavor vuelva a ejecutar");
                } catch(NumberFormatException e){
                    System.out.println("Nombre correcto");
                }
                System.out.println("Digite el apellido:");
                apellido = estudiante.next();
                try {
                    numero=Integer.parseInt(apellido);
                    System.out.println("Escribio un numero en vez de un apellido, Porfavor vuelva a ejecutar");
                } catch(NumberFormatException e){
                    System.out.println("Apellido correcto");
                }

                System.out.println("Digite la cedula");
                cedula = estudiante.nextInt();
                try {
                    keyboard=Integer.toString(cedula);
                    System.out.println("Cedula correcta");
                } catch(NumberFormatException e){
                    System.out.println("Escribio un nombre en vez, del numero solicitado");
                }

                System.out.println("DIgite el telefono");
                celular = estudiante.nextInt();
                try {
                    keyboard=Integer.toString(celular);
                    System.out.println("Celular correcto");
                } catch(NumberFormatException e){
                    System.out.println("Escribio un nombre en vez, del numero solicitado");
                }

                l=l+m;
                System.out.println("El numero de estudiantes inscritos en C++ es: " + (l));
            }


            else if (x == 2) {
                System.out.println("Programacion en Python");
                System.out.println("Digite el nombre: ");
                nombre = estudiante.next();
                try {
                    numero=Integer.parseInt(nombre);
                    System.out.println("Escribio un numero en vez de un nombre, Porfavor vuelva a ejecutar");
                } catch(NumberFormatException e){
                    System.out.println("Nombre correcto");
                }
                System.out.println("Digite el apellido:");
                apellido = estudiante.next();
                try {
                    numero=Integer.parseInt(apellido);
                    System.out.println("Escribio un numero en vez de un apellido, Porfavor vuelva a ejecutar");
                } catch(NumberFormatException e){
                    System.out.println("Apellido correcto");
                }
                System.out.println("Digite la cedula");
                cedula = estudiante.nextInt();
                try {
                    keyboard=Integer.toString(cedula);
                    System.out.println("Cedula correcta");
                } catch(NumberFormatException e){
                    System.out.println("Escribio un nombre en vez, del numero solicitado");
                }
                System.out.println("DIgite el telefono");
                celular = estudiante.nextInt();
                try {
                    keyboard=Integer.toString(celular);
                    System.out.println("Celular correcto");
                } catch(NumberFormatException e){
                    System.out.println("Escribio un nombre en vez, del numero solicitado");
                }
                o=o+p;
                System.out.println("El numero de estudiantes inscritos en Python es: " + (o));

            } else if (x == 3) {
                System.out.println("Programacion en Java");
                System.out.println("Digite el nombre: ");
                nombre = estudiante.next();
                try {
                    numero=Integer.parseInt(nombre);
                    System.out.println("Escribio un numero en vez de un nombre, Porfavor vuelva a ejecutar");
                } catch(NumberFormatException e){
                    System.out.println("Nombre correcto");
                }
                System.out.println("Digite el apellido:");
                apellido = estudiante.next();
                try {
                    numero=Integer.parseInt(apellido);
                    System.out.println("Escribio un numero en vez de un apellido, Porfavor vuelva a ejecutar");
                } catch(NumberFormatException e){
                    System.out.println("Apellido correcto");
                }
                System.out.println("Digite la cedula");
                cedula = estudiante.nextInt();
                try {
                    keyboard=Integer.toString(cedula);
                    System.out.println("Cedula correcta");
                } catch(NumberFormatException e){
                    System.out.println("Escribio un nombre en vez, del numero solicitado");
                }
                System.out.println("DIgite el telefono");
                celular = estudiante.nextInt();
                try {
                    keyboard=Integer.toString(celular);
                    System.out.println("Celular correcto");
                } catch(NumberFormatException e){
                    System.out.println("Escribio un nombre en vez, del numero solicitado");
                }
                q=q+r;
                System.out.println("El numero de estudiantes inscritos en Java es: " + (q));

            } else if (x > 3) {
                System.out.println("Numero ingresado Incorrecto, Recuerde que solo hay tres cursos disponibles");


            }

        }
    }
}