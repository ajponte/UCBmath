package newton;

/** Represents a polynomial.
 * @author Alan Ponte*/
public class Polynomial {
	
	/** Creates a new polynomial whose coefficients
	 * are represented by the values in COEFFS.  E.G.
	 * [1, 2, 2] -- > 1 + 2x + 2x^2
	 */
	public Polynomial(int[] coeffs) {
		_coeffs = coeffs;
		
	}
	
	/** Returns the result of applying VAL to THIS polynomial.*/
	public double valueAt(double val) {
		/*If the polynomial is constant*/
		if (_coeffs.length == 1) {
			return _coeffs[0];
		}
		double result = 0;
		for (int i = 1; i < _coeffs.length; i += 1) {
			result = result + ((Math.pow(val, i)) * (_coeffs[i]));
		}
		return (double)result;
		
	}
	
	/** Returns THIS Polynomial's Coefficients.*/
	public int[] getCoeffs() {
		return _coeffs;
		
	}
	
	/** Sets THIS Polynomial's Coefficients to COEFFS.*/
	public void setCoeffs(int[] coeffs) {
		_coeffs = coeffs;
	}
	
	/** THIS Polynomial's Coefficients.*/
	private int[] _coeffs;

}
