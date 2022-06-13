

public class MadLib {
	private String noun;
	private String adjective;
	private String verb;
	
	public MadLib(String noun,String adjective,String verb) {

	this.noun=noun;
	this.adjective=adjective;
	this.verb=verb;
	
	
	}

	public String getNoun() {
		return noun;
	}

	public void setNoun(String noun) {
		this.noun = noun;
	}

	public String getAdjective() {
		return adjective;
	}

	public void setAdjective(String adjective) {
		this.adjective = adjective;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}
	
	
};
