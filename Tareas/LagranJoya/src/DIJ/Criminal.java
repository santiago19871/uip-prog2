package DIJ;

public class Criminal extends Policia {
    private String nombre;
    private String cedula;
    private String delito;
    private String policia;



    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setCedula(String c) {
        this.cedula = c;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setDelito(int idDelito) {
        if (idDelito == 1)
            this.delito = "Robo";
        else if (idDelito == 2)
            this.delito = "Violacion";
        else if (idDelito == 3)
            this.delito = "Homicidio";
        else
            this.delito = "Desconocido";
    }

    public String getDelito() {
        return this.delito;
    }

    public void setPolicia(String policia ) {
        this.policia = policia;
    }
    public String getPolicia() {
        return this.policia;
    }

}


