package stableMatching;
import java.util.Map;
/** Creates a stable matching by running the deferred acceptance algorithm (Gale-Shapely).
 *  Assumes m-proposing, but has the option to make w-proposing.
 * @author Alan Ponte
 */
public class StableMatching {
	
	/** Creates a new matching with the preferences of the men, MPREFS,
	 * and the preferences of the woman, WPREFS.*/
	public StableMatching(Map<Agent, Integer> mPrefs, Map<Agent, Integer> wPrefs) {
		_mPrefs = mPrefs;
		_wPrefs = wPrefs;
	}
	
	/** Creates a new matching with the preferernces of the men, MPREFS,
	 *  and the preferences of the women, WPREFS.  If M_PROPOSING is ON, 
	 *  then the algorithm is m_proposing.  
	 */
	public StableMatching(Map<Agent, Integer> mPrefs, Map<Agent, Integer> wPrefs, boolean m_proposing) {
		_mPrefs = mPrefs;
		_wPrefs = wPrefs;
		_mProposing = m_proposing;
	}
	
	/** Returns True iff the algorithm is M-Proposing.*/
	public boolean m_proposing() {
		return _mProposing;
	}
	
	/** Performs the deferred acceptance algorithm.  Outputs the result.
	 * The algorithm runs as follows:
	 * Step 1:  Each man points to his most preferred woman from his
	 * set of preferences.  Each woman accepts or rejects the man.
	 * 
	 * Step k >= 2:  Repeat this process until a matching is found.*/
	public static void runAlgorithm() {
		
		
	}
	/** If M_PROPOSING is ON, the algorithm is M-Proposing .*/
	public void setMproposing(boolean m_proposing) {
		
	}
	/** True iff the algorithm is m-proposing.*/
	private boolean _mProposing = true;
	
	/** The preference list of the men.*/
	private Map<Agent, Integer> _mPrefs;
	
	
	/** The preference list of the women*/
	private Map<Agent, Integer> _wPrefs;
}
