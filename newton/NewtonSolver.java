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
	
	/** Creates a new solver with the Polynoomial P, the 
	 * derivative of the Polynomial, DF, and an initial guess of GUESS.
	 * The solver will run until the TOLERANCE is reached, or the maximum number
	 * of iterations. MAXITER is reached.*/
	public NewtonSolver(Polynomial p, Polynomial df, double guess, double tolerance, int maxIter) {
		_poly = p;
		_guess = guess;
		_df = df;
		_tol = tolerance;
		_maxIter = maxIter;
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
			p = _guess - _poly.valueAt(_guess)/_df.valueAt(_guess);
			System.out.println("P-Value: " + p + " itration : " + i);
			if (Math.abs(p - _guess) < _tol) {
				break;
			}
			_guess = p;
			i += 1;
		}
		return p;
	}
	
	/** THIS Polynomial.*/
	private Polynomial _poly;
	
	/** The derivative of THIS Polynomial.*/
	private Polynomial _df;
	
	/** The initial guess.*/
	private double _guess;
	
	/** The allowable tolerance.*/
	private double _tol;
	
	/** The maximum amount of iterations.*/
	private int _maxIter;

}
