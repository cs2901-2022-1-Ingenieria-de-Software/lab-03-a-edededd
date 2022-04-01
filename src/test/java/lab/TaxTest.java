package lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import lab.util.TestUtil;
import lab.demand.Order;
import java.util.List;

@Test
public class TaxTest {

    public void test_validate_country_calculate_tax() {
        List<Order> orders = TestUtil.buildOrders();
        for (Order order : orders){
            // Verify if is a valid country code
            Assert.assertTrue(order.getCountry().length()==2);
        } 
    }
    
}
