class UrlMappings {

	
	static mappings = {
		    "/"(controller:'permit',action:'index')
			"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
