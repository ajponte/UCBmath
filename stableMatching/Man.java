package stableMatching;

/** * A Man that will be matched with a woman in the Stable Marriage Algorithm.
	* Every man has a prefrence list, indicated by an ArrayList.  The rank
	* of the preferences is indicated by the position in the list.
	* Each preference will be a string, which should be indicated by 
	* w1, w2,...,wn.
	* @author Alan Ponte
	*/
	
	
public class Man {
	
	public static String name;
	
	/* constructor.  sets THIS man's NAME */
	public Man(String Name) {
		this.name = Name;	
	}
	
	
	private ArrayList <String> preferenceList = new ArrayList <String>();
	boolean mathced = false;
	
	/** Returns TRUE iff given man is matched to any woman */
	public bool isMatched(){
		return matched;	
	}
	
	/** Adds the WOMAN as the nth preference */
	public static void addPrefrence(woman){
		this.preferenceList.add(woman);
	}
	
	/** Returns the Nth prefernce */
	public static String getPreference (n){
		return this.preferenceList.get(n);
	}
	
	
	
}
