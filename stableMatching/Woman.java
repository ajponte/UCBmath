package stableMatching;
import java.util.Map;
/** * A Woman that will be matched with a woman in the Stable Marriage Algorithm.
	* Every Woman has a prefrence list, indicated by an ArrayList.  The rank
	* of the preferences is indicated by the position in the list.
	* Each preference will be a string, which should be indicated by 
	* m1, m2,...,mn.
	* @author Alan Ponte
	*/
	
	
public class Woman extends Agent {
	
	public Woman(String Name, Map<Agent, Integer> preferences) {
		super(Name, preferences);
	}
	
	/** A new Woman whose name is NAME.*/
	public Woman(String Name) {
		super(Name);
	}
	
	
	
}
