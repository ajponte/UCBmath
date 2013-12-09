package newton;

/** Main entry point.
 * @author Alan Ponte.*/
public class Main {
	
	
	/** Main function.  Returns the result of applying Newton's Method.*/
	public static void main(String[] args) {
		int[] p = {1, 2, 3};
		int[] dp = { 0, 2, 6};
		Polynomial e = new Polynomial(p);
		Polynomial de = new Polynomial(dp);
		NewtonSolver n = new NewtonSolver(e, de, 0, .00001);
		double result = n.solve();
		System.out.println("The intercept with tolerance of " + n.getTolerance() 
				+ " is " + result);
	}

}
