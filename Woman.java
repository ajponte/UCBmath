package UCBmath;

/** * A Woman that will be matched with a woman in the Stable Marriage Algorithm.
	* Every Woman has a prefrence list, indicated by an ArrayList.  The rank
	* of the preferences is indicated by the position in the list.
	* Each preference will be a string, which should be indicated by 
	* m1, m2,...,mn.
	* @author Alan Ponte
	*/
	
	
Public class Woman {
	
	private static String name;
	
	/* Constructor.  Sets THIS Woman's NAME. */
	public Woman(String Name) {
		this.name = Name;
	}
	private ArrayList <String> preferenceList = new ArrayList <String>();
	boolean mathced = false;
	
	/** Returns TRUE iff given man is matched to any woman */
	public bool isMatched(){
		return matched;	
	}
	
	/** Adds the MAN as the Nth preference */
	public static void addPrefrence(man){
		this.preferenceList.add(man);
	}

	
	/** Returns the Nth prefernce */
	public static String getPreference (n){
		return this.preferenceList.get(n);
	}
	
	
	
}
