package DIJ;

//UIP-PROG2- PANAMA

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

        int opcion = 0, idDelito;
        String nombre;
        String cedula ;
        String policia;
        String rango;


        ArrayList<Criminal> celda = new ArrayList<>();
        ArrayList<Policia> escuadron = new ArrayList<>();
        ArrayList<Policia> range = new ArrayList<>();

        Policia p1 = new Policia();
        Policia p2 = new Policia();
        Policia p3 = new Policia();
        p1.setNombre("Ricardo Perez");
        p2.setNombre("Carlos Palotes");
        p3.setNombre("CARLOS gARUZ");
        p1.setRango("Cabo");
        p2.setRango("Sargento");
        p3.setRango("Capitan");
        escuadron.add(p1);
        escuadron.add(p2);
        escuadron.add(p3);
        range.add(p1);
        range.add(p2);
        range.add(p3);

        while (opcion != 3) {

            System.out.println(" LA GRAN JOYA ");
            System.out.println("SISTEMA PARA INGRESAR Y VER RECLUSOS");
            System.out.println("  OPCIONES  ");
            System.out.println("1. Ingresar Criminal");
            System.out.println("2. Ver Criminales");
            System.out.println("3. Salir");
            System.out.print("\nOpcion: ");
            try {
                opcion = Integer.parseInt(s.readLine());
            } catch (NumberFormatException excepcion) {
                System.out.println("Digite un numero de las opciones");

            }

            switch (opcion) {
                case 1:
                    Criminal ctemp = new Criminal();
                    System.out.println("-----------");
                    System.out.println("| OPCION 1: Ingresar Criminal");
                    System.out.println("-----------");
                    System.out.println("\nDatos del Criminal");
                    System.out.print("Nombre: ");
                    nombre = s.readLine();
                    Pattern pat = Pattern.compile("[abc ]");
                    Matcher mat = pat.matcher(nombre);
                    if (mat.matches()) {
                        System.out.println("");
                    } else if (!mat.find()) {
                        System.out.println("Opcion Invalida");
                        System.out.println("Digite un nombre");
                        System.out.println("Ejemplo : Luis Delgado");
                        break;
                    }
                    System.out.print("Cedula o Pasaporte: ");


                    cedula = s.readLine();
                    Pattern pate = Pattern.compile("([0-9]|\\-)+");
                    Matcher mate = pate.matcher(cedula);
                    if (mate.matches()){
                    }else if (!mate.find()) {
                        System.out.println("Opcion Invalida");
                        System.out.println("Digite una cedula o pasaporte correcto");
                        System.out.println("Ejemplo: 4-XXX-XXX o X-X-XXX");break;
                    }

                    System.out.println("Que hizo?");
                    System.out.println("\t1.Robo\n\t2.Violacion\n\t3.Homicidio\n\t4.Desconocido");
                    System.out.print("Delito: ");
                    try {
                        idDelito = Integer.parseInt(s.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Opcion Invalida");
                        System.out.println("Digite un numero de las opciones" );break;
                    }
                    System.out.println("Quien te capturo?");
                    Iterator<Policia> listaPolicia = escuadron.iterator();
                    while (listaPolicia.hasNext()) {
                        Policia elemento = listaPolicia.next();
                        System.out.println("\t" + elemento.getNombre());

                    }
                    System.out.print("Policia: ");
                    policia = s.readLine();
                    Pattern patron = Pattern.compile("[abc ]");
                    Matcher matcher = patron.matcher(policia);
                    if (matcher.matches()) {
                        System.out.println("");
                    }else if (!matcher.find()) {
                        System.out.println("Opcion Invalida");
                        System.out.println("Escoja el nombre de un policia ");
                        System.out.println("Ejemplo: Ricardo Perez");break;
                    }

                    while (listaPolicia.hasNext()) {
                        Policia elemento = listaPolicia.next();
                        if (elemento.getNombre().equals(policia)) {


                        }
                    }
                    System.out.println("Rango del policia?");
                    Iterator<Policia> listaRango = range.iterator();
                    while (listaRango.hasNext()) {
                        Policia elemento = listaRango.next();
                        System.out.println("\t" + elemento.getRango());


                    }
                    System.out.println("Rango:");
                    rango = x.readLine();
                    Pattern pata = Pattern.compile("[abc ]");
                    Matcher mata = pata.matcher(rango);
                    if (mata.matches()) {
                        System.out.println("");
                    }else if (!mata.find()) {
                        System.out.println("Opcion Invalida");
                        System.out.println("Seleccione un rango al policia ");
                        System.out.println("Ejemplo: Cabo");break;
                    }

                    ctemp.setNombre(nombre);
                    ctemp.setCedula(cedula);
                    ctemp.setDelito(idDelito);
                    ctemp.setPolicia(policia);
                    ctemp.setRango(rango);
                    celda.add(ctemp);
                    System.out.println("Guardado con exito!");
                    break;
                case 2:
                    System.out.println("-----------");
                    System.out.println("| OPCION 2: Ver Criminales");
                    System.out.println("-----------");
                    System.out.println("\nCriminales de La Joya");
                    for (Criminal elemento : celda) {
                        System.out.println("\t" +elemento.getNombre() + " " + "Con cedula o pasaporte: " + elemento.getCedula() + ", detenido por " + elemento.getDelito() + ", Capturado por el " + elemento.getRango() + " " + elemento.getPolicia());

                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;

            }
        }
    }


}
