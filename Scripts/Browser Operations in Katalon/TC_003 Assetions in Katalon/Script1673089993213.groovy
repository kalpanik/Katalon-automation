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

WebUI.maximizeWindow()

title = WebUI.getWindowTitle()
//verify the title matches the expected string

WebUI.verifyMatch(title, 'CURA Healthcare Service', true)
//verify if make appointment button is present in the DOM
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'),2)

//Veify if button is clickable

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

//verify element is visible on webpage
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/Copyright Text'))

//verify element is visible in viewport

//WebUI.verifyElementVisibleInViewport(findTestObject('Object Repository/Page_CURA Healthcare Service/Copyright Text'), 2)
//WebUI.verifyElementVisibleInViewport(findTestObject('Object Repository/Page_CURA Healthcare Service/Copyright Text'),2)

//verify element not present

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/Make appointment page heading'), 2)


WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyTextPresent('Please login to make appointment.', false)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/Make appointment page heading'), 'Make Appointment')

WebUI.delay(2)

WebUI.closeBrowser()

