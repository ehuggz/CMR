import cmr110108.County
import cmr110108.PermitType
import cmr110108.PropertyType
import cmr110108.Township
import grails.util.GrailsUtil;

class BootStrap {

    def init = { servletContext ->
		switch(GrailsUtil.environment){
         case "development":
           println "#### Development Mode (Start Up)"
		   new PropertyType(description:"Single Family Residence").save()
		   new PropertyType(description:"Apartment").save()
		   new PropertyType(description:"Condo").save()
		   new PropertyType(description:"Commercial").save()
		   new PropertyType(description:"Man").save()
		   new PropertyType(description:"Modular").save()
		   new PropertyType(description:"Garage").save()
		   new PropertyType(description:"Ag Building").save()
		   new PropertyType(description:"Out Building").save()
		   new PropertyType(description:"Pool").save()
		   new PermitType(description:"Permit").save()
		   new PermitType(description:"Re-Permit").save()
		   new PermitType(description:"State Permit").save()
		   new County(description:"St. Joseph").save()
		   new County(description:"Elkhart").save()
		   new Township(description:"Clay",county:"St. Joseph").save()
		   new Township(description:"Harris",county:"St. Joseph").save()
		   new Township(description:"Elkhart Munci",county:"Elkhart").save()
		   new Township(description:"Harrison",county:"Elkhart").save()
           
		   break
         case "test":
           println "#### Test Mode (Start Up)"
           break
         case "production":
           println "#### Production Mode (Start Up)"
           break
       }
    }
    def destroy = {
		switch(GrailsUtil.environment){
			case "development":
			  println "#### Development Mode (Shut Down)"
			  break
			case "test":
			  println "#### Test Mode (Shut Down)"
			  break
			case "production":
			  println "#### Production Mode (Shut Down)"
			  break
		  }
    }
}
