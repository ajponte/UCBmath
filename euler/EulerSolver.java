package euler;
import newton.Polynomial;

/** Solves a differential equation using Euler's method.*/
public class EulerSolver {
	/** A new EulerSolver for the Polynomial F.*/
	public EulerSolver(Callable f, double y0, int a, int b, int h) {
		t = a;
		init_val = y0;
		b_val = b;
		height = h;
		func = f;
	}
	public void solve() {

	    while (t < b_val) {
	      System.out.println ("" + t + " " + init_val);
	      t += height;
	      init_val += height * func.compute (t, init_val);
	    }
	    System.out.println ("DONE");
	}
	
	/** THIS function to be solved by Euler.*/
	private Callable func;
	
	/** The T parameter for the function.*/
	private int t;
	
	/** The initial value for the IVP.*/
	private double init_val;
	
	/** The B parameter for the function.*/
	private int b_val;
	
	/** The height (num of steps) for the Euler solver.*/
	private int height;
}
