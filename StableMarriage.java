package UCBmath;

/** * Stable Marriage.  Will run through the Stable Marriage algorithm 
	* until a stable marriage is found 
	* The constructor will expect an ArrayList of MEN and another
	* ArrayList of WOMEN.  These lists are constant and will not be changed. 
	* For simplicity, assume all agents are rational, that is they prefer
	* to be matched with someone rather than reamin single.
	* @author Alan Ponte
	* @version 2013.09.13*/
	 
public class StableMarriage {
	
	private static num_men;
	private static ArrayList<Man> MEN = new ArrayList<Man>();
	private static ArrayList<Woman> WOMEN = new ArrayList<Woman>();
	public StableMarriage(Men, Woman){
		MEN = Men;
		WOMEN = Woman;	
	}
	
	/** MAIN method.  Runs the Stable marriage algorithm on the
	  * list of MEN and the list of WOMAN.  Terminates when a stable mathcing is found */
	public void runAlgorithm(){
		/** Run the algorithm*/
		
	}
}
