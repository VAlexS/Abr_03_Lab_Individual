package clases.videos;

public abstract class Video {

    private final String titulo;

    private final int duraccion;

    public Video(String titulo, int duraccion) {
        this.titulo = titulo;
        this.duraccion = duraccion;
    }

    public String getInfo(){
        return "Este video se titula "+titulo+" y dura "+duraccion+" horas";
    }
}
