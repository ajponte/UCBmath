package stableMatching;
import java.util.Map;
/** * A Man that will be matched with a woman in the Stable Marriage Algorithm.
	* Every man has a prefrence list, indicated by an ArrayList.  The rank
	* of the preferences is indicated by the position in the list.
	* Each preference will be a string, which should be indicated by 
	* w1, w2,...,wn.
	* @author Alan Ponte
	*/
	
	
public class Man extends Agent {
	
	/** A new man whose Name is NAME with preferences PREFERENCES.*/
	public Man(String Name, Map<Agent, Integer> preferences) {
		super(Name, preferences);
		
	}
	
	
	/** A new man whose Name is NAME.*/
	public Man(String Name) {
		super(Name);
	}
	
	
	
}
