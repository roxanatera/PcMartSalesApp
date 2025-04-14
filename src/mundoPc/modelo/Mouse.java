package mundoPc.modelo;

public class Mouse extends DispositivoEntrada  {
    private final int idMouse;
    private static int contadorMouses;

    //constructor
    public Mouse(String tipoEntrada, String Marca){
        super(tipoEntrada, Marca);
        idMouse = ++contadorMouses;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                "} " + super.toString();
    }
}
