Feature: To Edit a Lead in the LeafTaps application 


Scenario Outline: T2_Edit Lead 
    Given give UserName as <UserName> 
	Given Password as <Password> 
	When Click Login 
	When click on 'CRM/SFA' link 
	When click on 'Leads' link
	When click on Find Leads link 
	When click on Phone button
	Then give phoneNumber
	When click findLeads
	When choose Lead
	When click Edit
	Then update company details
	When click update
	
	
	Examples:
	|UserName|Password|
	|'DemoSalesManager'|'crmsfa'|
	
@smoke	
Scenario Outline: T2_DeleteLead
Given give UserName as <UserName> 
	Given Password as <Password> 
	When Click Login 
	When click on 'CRM/SFA' link 
	When click on 'Leads' link
	When click on Find Leads link 
	When click on Phone button
	Then give phoneNumber
	When click findLeads
	When choose Lead
	When click delete
	
	Examples:
	|UserName|Password|
	|'DemoSalesManager'|'crmsfa'|