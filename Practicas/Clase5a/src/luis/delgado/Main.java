package luis.delgado;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws exception {

        BufferedReader t= new BufferedReader (new InputStreamReader (System.in));

        System.out.print("Ingresa tu nombre");
        String nombre=t.readLine();

        int edad;
        System.out.print("Ingrese su edad");
        edad=Integer.parseInt(t.readLine());

        char sexo;
        System.out.print("Es usted M o F");
        sexo=t.read();
        sexo=(char)t.readLine();

        double salario;
        System.out.print("Ingrese su salario");
        salario=Double.parseDouble(t.readLine());

        System.out.println("Hola"+nombre+"tienes"+edad+"años");
        Double salarioneto=salario*0.80;
        System.out.println("Tu salario neto es $"+salarioneto);

















    }
}
