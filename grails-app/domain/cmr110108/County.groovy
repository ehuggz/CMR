package cmr110108

class County {
    String description
	static hasMany = [townships:Township]
	String toString(){
		return description
	}
	    static constraints = {
		description(maxsize:25)
		}
}