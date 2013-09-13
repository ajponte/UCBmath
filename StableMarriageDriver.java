package UCBmath;

/** * Stable Marriage Driver 
	* @Alan Ponte */
	
public class StableMarriageDriver() {
	public static void main (String[] args){
		
		ArrayList<man> men = new ArrayList<man>();
		ArrayList<woman> woman = new ArrayList<woman>();
		w1 = new woman('w1');
		w2 = new woman('w2');
		
		w1.addPreference(m2).addPreference(m1);
		w2.addPrefrence(m1).addPreference(m2);
		
		m1 = new man('m1');
		m2 = new man('m2');
		
		m1.addPreference(m2).addPreference(m1);
		m2.addPreference(m1).addPreference(m2);
		
		
		
		stableMarriage = new StableMarriage(men, woman);
		stableMarriage.runAlgorithm();
	}
}
