package mundoPc.modelo;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String Marca;

    //Constructor
    public DispositivoEntrada (String tipoEntrada, String Marca){
        this.tipoEntrada = tipoEntrada;
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }

}
