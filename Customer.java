import java.math.BigDecimal;


/**
 * Low Of Demeter
 *
 * It specifies a style guideline: "Only talk to your immediate friends." E.g. one never calls a method on an object you
 * got from another call nor on a global object.
 *
 *
 * The customer
 *
 *
 * @author <a href="mailto:ouadiesoft@gmail.com">Ouadie LAHDIOUI</a>
 */
public class Customer
{
	private Wallet wallet;

	/**
	 * @param wallet
	 *           The wallet of the customer
	 */
	public Customer(final Wallet wallet)
	{
		this.wallet = wallet;
	}

	/**
	 * @param amount
	 *           The amount to make paymenet
	 * @return {@link BigDecimal}
	 */
	public BigDecimal makePayment(final BigDecimal amount)
	{
		if (wallet.haveMoney(amount))
		{
			wallet.removeMoney(amount);
			return amount;
		}

		return BigDecimal.ZERO;
	}

	/**
	 * Getter for the wallet.
	 *
	 * @return Returns the wallet
	 */
	public Wallet getWallet()
	{
		return wallet;
	}

	/**
	 * Setter for the wallet.
	 *
	 * @param wallet
	 *           The wallet to set
	 */
	public void setWallet(final Wallet wallet)
	{
		this.wallet = wallet;
	}


}
