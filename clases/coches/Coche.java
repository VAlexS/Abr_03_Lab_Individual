package clases.coches;

public abstract class Coche {

    private final String matricula, marca, modelo;


    private int kilometraje;

    public Coche(String matricula, String marca, String modelo, int kilometraje) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getInfo(){
        return "Es un "+marca+" "+modelo+". Su matricula es "+matricula+". Ha recorrido "+kilometraje+" kilometros";
    }
}
