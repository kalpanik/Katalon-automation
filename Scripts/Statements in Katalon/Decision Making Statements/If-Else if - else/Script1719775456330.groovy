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
WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

// Click on Make Appointment button
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

// Verify the login page is displayed
WebUI.verifyTextPresent('Please login to make appointment.', false)

// Enter the username and password
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

// Click the login button
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

// Wait for page to load
WebUI.waitForPageLoad(5)

// Check for login failed message
boolean isLoginFailed = WebUI.verifyTextPresent("Login failed! Please ensure the username and password are valid.", false, FailureHandling.OPTIONAL)

// Check for successful login by verifying the presence of a specific element
boolean isLoginSuccessful = WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'), 5, FailureHandling.OPTIONAL)

// Comment based on the login result
if (isLoginFailed) {
    WebUI.comment("Login Failed")
} else  {
    WebUI.comment("Login Successful")
} 

// Close the browser
WebUI.closeBrowser()