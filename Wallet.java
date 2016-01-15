import java.math.BigDecimal;


/**
 * Low Of Demeter
 *
 * It specifies a style guideline: "Only talk to your immediate friends." E.g. one never calls a method on an object you
 * got from another call nor on a global object.
 *
 *
 * The wallet
 *
 *
 * @author <a href="mailto:ouadiesoft@gmail.com">Ouadie LAHDIOUI</a>
 */
public class Wallet
{
	private BigDecimal money = BigDecimal.ZERO;

	/**
	 * @param money
	 *           The money in the wallet
	 */
	public Wallet(final BigDecimal money)
	{
		this.money = money;
	}

	/**
	 * Verify in the wallet have the necessary amount of money
	 *
	 * @param money
	 *           The amount of money to verify
	 *
	 * @return {@link Boolean}
	 */
	public boolean haveMoney(final BigDecimal money)
	{
		return this.money.compareTo(money) >= 0;
	}

	/**
	 * Remove an amount of money from the wallet
	 *
	 * @param money
	 *           The amount of money to remove
	 */
	public void removeMoney(final BigDecimal money)
	{
		this.money.subtract(money);
	}

}
