package clases.videos;

public class Movie extends Video {

    private double calificacion;

    public Movie(String titulo, int duraccion, double calificacion) {
        super(titulo, duraccion);
        this.calificacion = calificacion;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+". Tiene una calificacion de "+calificacion;
    }


}
