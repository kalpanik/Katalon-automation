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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.automationtesting.in/Alerts.html')

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling alerts/Page_Alerts/button_click the button to display an  alert box'))
WebUI.getAlertText()
WebUI.acceptAlert()

sleep (5)


WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling alerts/Page_Alerts/a_Alert with OK  Cancel'))
WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling alerts/Page_Alerts/button_click the button to display a confirm box'))

sleep (2)

WebUI.dismissAlert()
/*

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling alerts/Page_Alerts/a_Alert with Textbox'))

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling alerts/Page_Alerts/button_click the button to demonstrate the _b1783c'))
*/
