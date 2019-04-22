Feature: Insurance Quote from Progressive
	

Scenario: Insurance quote for one person

	Given the user is on the homepage of Progressive
	When the user verifies url and title while on the homepage.
	And the user clicks on the Auto button
	And the user enters the zip code
	And the user clicks on the Quote Auto button
	And the user enters the first name
	And the user enters the last name
	And the user enters the address
	And the user enters the city
	And the user enters the date of birth
	And the user clicks on the Okay, start my quote button
	And the user chooses the year of the vehicle
	And the user chooses the make of the vehicle
	And the user chooses the model of the vehicle
	And the user selects body type
	And the user selects the purpose of use
	And user selects if the car is owned or leased
	And the user selects for how lond the car has been owned
	And the user clicks on the Done button
	And the user clicks on the Save and Continue button
	And the user chooses the gender
	And the user selects marital status
	And the user selects the highest level of education
	And the user selects primary residence
	And the user answers the question if s/he moved in two years
	And the user selects the years licensed
	And the user answers the question if s/he was involved in an accident
	And the user reports the violations and tickets
	And the user clicks on the Save and Continue button
	And the user enters his/her spouse's name
	And the user chooses his/her spouse's gender
	And the user enters his/her spouse's date of birth
	And the user add his/her spouse to the policy
	And the user selects his/her spouse's highest level of education
	And the user selects his/her spouse's years licensed
	And the user answers the question if his/her spouse was involved in an accident
	And the user reports his/her spouse's violations and tickets
	And the user clicks on the Save and Continue button
	And the user clicks on the Save and Continue button
	And the user clicks on the Save and Continue button
	And the user clicks on the Save and Continue button
	And the user selects if they have any insurance right now
	And the user selects current's insurance longiness
	And the user selects current bodily injury limits
	And the user selects if they have any progressive non auto insurance right now
	And the user selects if they had any progressive auto insurance in the last month
	And the user enters policy starting date
	And the user enters e-mail addresses
	And the user enters resident amount in their home
	And the user clicks on the Save and Continue button
	And the user reject the snapshot membership offer
	And the user clicks on the Save and Continue button
	And the user reject the other policy offers
#	And the user refreshes the page
	Then the user should see the options
	
	
	
	
#	And the user selects employment status
#	And the user views the accupation list
#	And the user selects an industry from the industry selection list
#	And the user selects an occupation from the occupation list
#	And the user clicks on the save and continue button after selecting occupation
#	And the user clicks on the fourth save and continue button to continue
#	And the user clicks on the save and continue button for the fifth time
#	And the user answers the question about insurance history
#	And the user selects the duration with s/he is insured with the current company
#	And the user selects most recent bodily injury limits
#	And the user chooeses if s/he has purchases a service from progressive other than car insurance
#	And the user chooses if s/he was insured by progressive last month
#	And the user enters the primary email address
#	And the user answers the question if the family members have health insurance
#	And the user clicks oon the sixth save and continue button
#	And the customer is asked if s/he wants to use snatpshot
#	And the customer clicks on the save and continiue button for the seventh time
#	And the user clicks on the no thanks just auto button