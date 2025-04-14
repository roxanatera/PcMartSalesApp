package mundoPc.service;

import mundoPc.modelo.Computer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int idOrder;
    private final List<Computer> computers;
    private static int contadorOrders;

    public Order(){
        computers = new ArrayList<>();
        this.idOrder = ++contadorOrders;
    }

    public void addComputers(Computer computer){
        computers.add(computer);
    }

    public void mostrarOrder(){
        System.out.println("Order #: " + idOrder);
        System.out.println("Total computers:" + computers.size());
        computers.forEach(System.out::println);
    }

}
