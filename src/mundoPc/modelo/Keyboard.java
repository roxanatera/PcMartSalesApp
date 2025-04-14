package mundoPc.modelo;

public class Keyboard extends DispositivoEntrada {
    private final int idKeyboard;
    private static int contadorKeyboard;

    public Keyboard(String tipoEntrada, String Marca){
        super(tipoEntrada, Marca);
        idKeyboard = ++contadorKeyboard;

    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "idKeyboard=" + idKeyboard +
                "} " + super.toString();
    }
}
