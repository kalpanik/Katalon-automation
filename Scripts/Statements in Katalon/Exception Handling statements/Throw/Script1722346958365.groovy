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

try {
	WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')
	WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John')
	WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')
	WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
	
//adding a throw statement for custom exception	
	
	boolean elementpresent =  WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), 10, FailureHandling.OPTIONAL)
	if(!elementpresent)
	{
		throw new Exception('Login failed - Make appointment header not found')
	}
	
	
	WebUI.comment('Login successful')
	
} 

catch (Exception e) {
	WebUI.comment('An error occurred: ' + e.getMessage())
} 

finally {
	WebUI.closeBrowser()
}
