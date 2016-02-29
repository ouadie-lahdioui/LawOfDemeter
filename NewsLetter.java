import java.math.BigDecimal;
import java.util.List;


/**
 * Low Of Demeter
 *
 * It specifies a style guideline: "Only talk to your immediate friends." E.g. one never calls a method on an object you
 * got from another call nor on a global object.
 *
 *
 * The newsLetter
 *
 *
 * @author <a href="mailto:ouadiesoft@gmail.com">Ouadie LAHDIOUI</a>
 */
public class NewsLetter
{

	private static BigDecimal NEWS_LETTER_PRICE = BigDecimal.TEN;
	private final List<Customer> customers;

	public NewsLetter(List<Customer> customers) {
		this.customers = customers;
	}

	public BigDecimal calculateFunds() {
		BigDecimal fundsCollected = BigDecimal.ZERO;

		for (final Customer customer : customers)
		{
			final BigDecimal paymenetAmount = customer.makePayment(NEWS_LETTER_PRICE);
			if (paymenetAmount.compareTo(BigDecimal.ZERO) > 0)
			{
				fundsCollected = fundsCollected.add(paymenetAmount);
			}
		}
		System.out.println(fundsCollected);
		return fundsCollected;
	}

	/*private BigDecimal calculateFunds() {
		return customers.stream()
				.map(c -> c.makePayment(NEWS_LETTER_PRICE))
				.reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
	}**/
}
