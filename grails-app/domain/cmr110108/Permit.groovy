package cmr110108

class Permit {
	Date permitDate
	
	String propertyDescription
	String permitType
	String permitNumber
		
	String propertyType
	String propertyStreet
	String propertyCity
	String propertyCounty
	String propertyState
	String propertyZip
	String buildingSqFt
	
	String propertySubdivision
	String propertyLot
	String buildingCost
	String propertyTaxID
	String propertyMapGrid
	
	String propertyBuilderType
	String contractorCompany
	String designArchitect
	String propertyOwner
	static hasOne = [permitTypes:PermitType,propertyTypes:PropertyType, townships:Township]
	String toString(){
		return permitAuthority+'-'+permitNumber
	}

	static constraints = {
		permitType()
		permitDate()
		permitNumber()
		PermitType()
		
		propertyType()
		propertyDescription()
		propertyZip()
		propertyStreet()
		propertyCity()
		propertyCounty()
		propertyState()
		
		buildingCost()
		buildingSqFt()
		
		propertySubdivision()
		propertyLot()
		propertyTaxID()
		propertyMapGrid()
	
		propertyBuilderType()
		propertyOwner()
		contractorCompany()
		designArchitect()	
    }
}
