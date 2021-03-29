package Comparators;

import Classes.Contact;
import Classes.Order;

import java.util.Comparator;

public class SortByName implements Comparator<Order> {
    @Override
    public int compare(Order order, Order t1) {
        return order.getName().compareTo(t1.getName());
    }
}
