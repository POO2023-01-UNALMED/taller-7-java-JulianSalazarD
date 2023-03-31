package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;

    public Alfabeto(String Origen, String[] letras, String interpretacion){
        super(Origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    };

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public String toString() {
        StringBuilder alfabeto = new StringBuilder();
        for(int i = 0; i < letras.length; i++) {
            if ( i == letras.length-1){
                alfabeto.append(letras[i]);
            }
            else {
                alfabeto.append(letras[i]).append(", ");
            }
        }

        return alfabeto.toString();
    }
}
