package lab;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import lab.util.TestUtil;
import lab.demand.ManageDemand;
import lab.demand.Order;
import lab.demand.Tax;
import java.util.List;

@Test
public class TaxTest {
    private Tax tax;

    @BeforeClass
    public void setup() {
        tax =  new Tax();
    }

    public void test_validate_country_calculate_tax() {
        List<Order> orders = TestUtil.buildOrders();
        for (Order order : orders){
            // Verify if is a valid country code
            Assert.assertTrue(order.getCountry().length()==2);
        } 
    }
    
}
