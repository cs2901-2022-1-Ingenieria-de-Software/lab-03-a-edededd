package lab.demand;

import java.util.HashMap;
import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }
    
    public double finalCalculate(List<Order> orders, double taxes){
        // Final calculate
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.getQuantity();
            quantities += temp;
        }

        return quantities * taxes;

    }

    public double calculateTotal(List<Order> orders){
        // Calculate Total
        double taxes = 0.0;
        for (Order order : orders) {
            double tax = this.tax.calculateTax(order.getCountry());
            taxes += tax;
        }
        
        //Final calculate
        return finalCalculate(orders, taxes);
    }
    
    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, double defaultAdditionalColombia, double defaultAdditionalPeru, double defaultAdditionalBrazil){
        // Calculate additionals by country
        double taxes = 0.0;

        for (Order order : orders) {
            String currCountry = order.getCountry();
            if (currCountry.equals("PE")) {
                taxes += defaultAdditionalPeru;
            } else if (currCountry.equals("BR")) {
                taxes += defaultAdditionalBrazil;
            } else {
                taxes += defaultAdditionalColombia;
            }
        }
        
        // Final calculate
        return finalCalculate(orders,taxes);
          
    }

}
