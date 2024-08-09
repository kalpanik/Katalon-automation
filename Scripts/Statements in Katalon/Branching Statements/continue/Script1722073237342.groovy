import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

//list containg valid and invalid usernames

List <String> usernames = ["  ", "Invalid username", "John Doe"]
	
	for(String username : usernames)
	{
	
		if(username== '  '|| username == 'Inavlid username')
			
		{		WebUI.comment("Skipping invalid usernames: "+username)
			continue
		}
	
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), username)
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')
	WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
	
	boolean isElementVisible = WebUI.verifyElementVisible(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), FailureHandling.OPTIONAL)
	
	if (isElementVisible) {
		WebUI.comment('Login successful for user: ' + username)
	} else {
		WebUI.comment('Login failed for user: ' + username)
	}
	
	}
WebUI.closeBrowser()

