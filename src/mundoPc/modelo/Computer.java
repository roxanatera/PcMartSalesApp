package mundoPc.modelo;

public class Computer {
    private final int idComputer;
    private String nombre;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int contadorComputers;

    public Computer(String nombre, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.idComputer = ++contadorComputers;
        this.nombre = nombre;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=======================================");
        sb.append("\nComputadora: ").append(nombre).append(" (ID: ").append(idComputer).append(")");
        sb.append("\n---------------------------------------");
        sb.append("\nComponentes:");
        sb.append("\n").append(monitor.toString().replaceAll("(?m)^", "  "));
        sb.append("\n").append(keyboard.toString().replaceAll("(?m)^", "  "));
        sb.append("\n").append(mouse.toString().replaceAll("(?m)^", "  "));
        sb.append("\n=======================================");
        return sb.toString();
    }
}