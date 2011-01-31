package cmr110108

class Township {
    String description
	static hasOne = [counties:County]
	String toString(){
		return description
	}
	    static constraints = {
		description(maxsize:25)
		}
}