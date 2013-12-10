package stableMatching;

import java.util.List;
import java.util.Map;
/** An Agent in the Stable Matching algorithm.
 * @author Alan Ponte*/
abstract class Agent {
	
	/** A new agent whose name is NAME.*/
	public Agent(String Name) {
		_name = Name;
		
	}
	
	/** A new Agent whose name is NAME, 
	 *  and whose preference list is PREFERENCES.*/
	public Agent(String Name, Map<Agent, Integer> preferences) {
		_name = Name;
		_prefs = preferences;
	}
	
	/** Return's the preference list of THIS Agent.*/
	public Map<Agent, Integer> getPreferences() {
		return _prefs;
		
	}
	
	/** Sets THIS Agent's Name to NAME.*/
	public void setName(String Name) {
		_name = Name;
	}
	
	/** Sets THIS Agent's preferences to PREFS.*/
	public void setPreferences(Map<Agent, Integer> prefs) {
		_prefs = prefs;
		
	}
	
	@Override
	public String toString() {
		return "Agent " + _name;
		
	}
	
	/** THIS Agent's name.*/
	private String _name;
	
	
	/** THIS agent's preference map.*/
	private Map<Agent, Integer> _prefs;
	
}
