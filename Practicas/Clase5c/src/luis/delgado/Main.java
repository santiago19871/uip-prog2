package luis.delgado;
import java.util.Scanner;
public class Main {
    private static Scanner x;
    public static void main(String[] args) {

        x=new Scanner (System.in);
        System.out.println("Tribunal Electoral de Panamá");
        System.out.print("Edad:");
        int edad;
        edad=x.nextInt();

        if (edad>18){
            System.out.println("Puedes votar");
        }else if (edad==18){
            System.out.println("Primera vez que vota");
        }else
        System.out.println("Busca tu acudiente");


    }
}
