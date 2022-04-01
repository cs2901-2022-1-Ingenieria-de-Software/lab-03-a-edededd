package lab.util;

import java.util.List;
import java.util.ArrayList;

import lab.demand.Order;

public class TestUtil {

    public static List<Order> buildOrdersPeru() {
        List<Order> ordersPeru = new ArrayList<Order>();
        ordersPeru.add(new Order("PE", 10L));
        ordersPeru.add(new Order("PE", 10L));
        return ordersPeru;
    }

    public static List<Order> buildOrdersColombia() {
        List<Order> ordersColombia = new ArrayList<Order>();
        ordersColombia.add(new Order("CO", 12L));
        ordersColombia.add(new Order("CO", 13L));
        return ordersColombia;
    }

    public static List<Order> buildOrders() {
        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order("CO", 12L));
        orders.add(new Order("PE", 13L));
        orders.add(new Order("CH", 14L));
        return orders;
    }

}