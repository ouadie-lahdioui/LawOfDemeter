import java.math.BigDecimal;
import java.util.ArrayList;
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
	private static List<Customer> customers;

	static
	{
		final Wallet wallet = new Wallet(BigDecimal.TEN);

		/* Initialise customers */
		customers = new ArrayList<Customer>();

		/* Add custemer */
		customers.add(new Customer(wallet));
		customers.add(new Customer(wallet));
	}

	/**
	 * Buy news letter to all customers
	 *
	 * @param args
	 *           The JAVA args
	 */
	public static void main(final String[] args)
	{
		final BigDecimal fundsCollected = BigDecimal.ZERO;

		for (final Customer customer : customers)
		{
			final BigDecimal paymenetAmount = customer.makePayment(NEWS_LETTER_PRICE);
			if (paymenetAmount.compareTo(BigDecimal.ZERO) > 0)
			{
				fundsCollected.add(paymenetAmount);
			}
		}
	}
}
