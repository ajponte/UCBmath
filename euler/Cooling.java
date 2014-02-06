package euler;


/** Represents the Newton Cooling Equation.
 *  See http://en.wikipedia.org/wiki/Convective_heat_transfer#Newton.27s_law_of_cooling.*/
public class Cooling implements Callable {
	
	/** Computation for Newton's Law of cooling at TIME T.*/
	public double compute(int time, double t) {
		return -0.07 * (t - 20);
	}

}
