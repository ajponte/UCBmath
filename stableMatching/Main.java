package stableMatching;
import java.util.HashMap;

/** Main entry point for the Stable Matching program
 * 
 * @author Alan Ponte
 *
 */
public class Main {
	
	/** Main function.*/
	public static void main(String[] args) {
		
		
		Man m1 = new Man("m1");
		Man m2 = new Man("m2");
		Man m3 = new Man("m3");
		
		Woman w1 = new Woman("w1");
		Woman w2 = new Woman("W2");
		Woman w3 = new Woman("W3");
		
		HashMap<Agent, Integer> m1Prefs = new HashMap<Agent, Integer>();
		m1Prefs.put(w1, 1);
		m1Prefs.put(w2, 2);
		m1Prefs.put(w3, 2);
		
		HashMap<Agent, Integer> m2Prefs = new HashMap<Agent, Integer>();
		m2Prefs.put(m1, 2);
		m2Prefs.put(m2, 3);
		m2Prefs.put(m3, 1);
		
		m1.setPreferences(m1Prefs);
		m2.setPreferences(m2Prefs);
		
		
		
		System.out.println(m1 + " " + w1);
		System.out.println(m1Prefs.toString());
		System.out.println(m1Prefs.get(w1));
	}

}
