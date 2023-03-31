package comunicacion;

public class Fabula extends Escrito{

    private String ensenanza;
    private String interpretacion;

    public Fabula(String Origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(Origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales( int numero){
        int factor = 1;
        return super.getPaginas()*factor*numero;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return super.getOrigen() + "\n"
                + super.getTitulo() + "\n"
                + super.getAutor() + "\n"
                + super.getPaginas() + "\n"
                + this.ensenanza;
    }
}
