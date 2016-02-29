import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NewsLetterTest {

    @Test
    public void testCalculateFunds() {
        // given
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(new Wallet(new BigDecimal(10.0))));
        customers.add(new Customer(new Wallet(new BigDecimal(15.0))));
        customers.add(new Customer(new Wallet(new BigDecimal(3.0))));

        // when
        BigDecimal funds = new NewsLetter(customers).calculateFunds();
        // then
        assertThat(funds, is(equalTo(new BigDecimal(20))));
    }
}
