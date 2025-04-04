package clases.videos;

public class TvSeries extends Video {

    private int numEpisodios;

    public TvSeries(String titulo, int duraccion, int numEpisodios) {
        super(titulo, duraccion);
        this.numEpisodios = numEpisodios;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+". Tiene "+numEpisodios+" episodios";
    }
}
