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
 * The paperBoy
 *
 *
 * @author <a href="mailto:ouadiesoft@gmail.com">Ouadie LAHDIOUI</a>
 */
public class PaperBoy
{
	private BigDecimal funds;
	private List<Customer> customers;

	{
		customers = new ArrayList<Customer>();
	}

	/**
	 * Getter for the funds.
	 *
	 * @return Returns the funds
	 */
	public BigDecimal getFunds()
	{
		return funds;
	}

	/**
	 * Setter for the funds.
	 *
	 * @param funds
	 *           The funds to set
	 */
	public void setFunds(final BigDecimal funds)
	{
		this.funds = funds;
	}

	/**
	 * Getter for the customers.
	 *
	 * @return Returns the customers
	 */
	public List<Customer> getCustomers()
	{
		return customers;
	}

	/**
	 * Setter for the customers.
	 *
	 * @param customers
	 *           The customers to set
	 */
	public void setCustomers(final List<Customer> customers)
	{
		this.customers = customers;
	}


}
