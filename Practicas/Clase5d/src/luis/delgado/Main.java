package luis.delgado;

public class persona{


    private String nombre;
    private int edad;

    public persona(String n,int e){
        this.nombre=n;
        this.edad=e;

  public static void main(String[] args) {
        persona petra=new persona ("Petronila Perez",95);
        persona calixtro=new persona ("calixtro Cruz",98);
    }
}

/*public persona(){
    System.out.println("Hola Panamá");
}
    public static void main(String[] args) {

            persona jose=new persona ();
            persona josefa=new persona ("josefa",15);*/
    }
}
