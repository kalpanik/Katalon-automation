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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

/*WebDriver driver = DriverFactory.getWebDriver()

assert driver.title == 'CURA Healthcare Service'*/
WebUI.maximizeWindow()

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'CURA Healthcare Service', true)

WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'), 2)

WebUI.verifyElementClickable(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.verifyElementVisible(findTestObject('Page_CURA Healthcare Service/Copyright Text'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/Make appointment page heading'), 
    2)

//verify element visible in a viewport
//WebUI.verifyElementVisibleInViewport(findTestObject('Page_CURA Healthcare Service/Copyright Text'), 2)
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))
//verify text present on a webpage
WebUI.verifyTextPresent('Please login to make appointment.', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/Make appointment page heading'), 
    'Make Appointment')

WebUI.closeBrowser()

