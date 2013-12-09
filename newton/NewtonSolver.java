package newton;


/** Represents the Newton method.
 * @author Alan Ponte.*/
public class NewtonSolver {
	
	/** Creates a new solver with the Polynoomial P, the 
	 * derivative of the Polynomial, DF, and an initial guess of GUESS.
	 * The solver will run until the TOLERANCE is reached.*/

	public NewtonSolver(Polynomial p, Polynomial df, double guess, double tolerance) {
		_poly = p;
		_guess = guess;
		_df = df;
		_tol = tolerance;
	}
	
	/** Returns the tolerance of THIS solver.*/
	public double getTolerance() {
		return _tol;
	}
	/**Returns the result of applying newton's method.*/
	public double solve() {
		int i = 0;
		double p = 0.0;
		while (true) {
			p = _poly.valueAt(_guess)/_df.valueAt(_guess);
			if (Math.abs(p - _guess) < _tol) {
				break;
			}
			p = _guess;
			i += 1;
		}
		return p;
	}
	
	private Polynomial _poly;
	private Polynomial _df;
	private double _guess;
	private double _tol;

}
