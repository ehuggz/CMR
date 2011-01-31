package cmr110108

class PermitType {
	String description
	String toString(){
		return description
	}
	    static constraints = {
		description(blank:false, maxsize:25)
		}
}
