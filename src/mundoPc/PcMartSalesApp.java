package mundoPc;

import mundoPc.modelo.Computer;
import mundoPc.modelo.Keyboard;
import mundoPc.modelo.Monitor;
import mundoPc.modelo.Mouse;
import mundoPc.service.Order;

public class PcMartSalesApp {
    public static void main(String[] args) {
        System.out.println("=== INVENTARIO DE COMPONENTES ===");

        Mouse mouseAsus = new Mouse("bluetooth", "Asus");
        //System.out.println(mouseLenovo);

        Keyboard keyboardAsus= new Keyboard("bluetooth", "Asus");

       // System.out.println(keyboardLenovo);
        Monitor monitorAsus = new Monitor("Asus", 40);

       // System.out.println(monitorAsus);
        // Creando computadora completa
        System.out.println("\n=== ENSAMBLANDO COMPUTADORA ===");
        Computer computadoraAsus = new Computer("Asus Gaming", monitorAsus, keyboardAsus, mouseAsus);
        //System.out.println(computadoraAsus);

        //Objeto Computer
        Monitor monitorLenovo = new Monitor("Lenovo", 20);
        Keyboard keyboardLenovo = new Keyboard("bluetooth", "Lenovo");
        Mouse mouseLenovo = new Mouse("usb", "Lenovo");
        Computer computerLenovo = new Computer("Computer Lenovo",
                monitorLenovo, keyboardLenovo, mouseLenovo);



        //Creación de Ordenes.
        Order order1 = new Order();
        order1.addComputers(computadoraAsus);
        order1.addComputers(computerLenovo);
        order1.mostrarOrder();
    }

}