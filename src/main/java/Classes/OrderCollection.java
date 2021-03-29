package Classes;

import Comparators.SortByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class OrderCollection implements Serializable {
    private static final long serialVersionUID = 7L;
    private List<Order> ordersCollection = new ArrayList<Order>();

    public void addOrder(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Classes.Order: id, name, courier, date, type");
        Order order = new Order(parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine());

        order.setDateTime(scanner.nextLine());
        order.setType(parseInt(scanner.nextLine()));
        ordersCollection.add(order);
    }

    public List<Order> getOrdersCollection() {
        return ordersCollection;
    }

    public void sortByName(){
        Collections.sort(ordersCollection, new SortByName());
    }

    @Override
    public String toString() {
        String text = new String("Orders collection :\n");
        for(Order ocl : ordersCollection){
            text+=ocl.toString()+"\n";
        }
        return text;
    }
}
