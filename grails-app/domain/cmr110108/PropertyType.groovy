package cmr110108

class PropertyType {
	String description
	String toString(){
		return description
	}

    static constraints = {
		description(blank:false, maxsize:25)
    }
}
