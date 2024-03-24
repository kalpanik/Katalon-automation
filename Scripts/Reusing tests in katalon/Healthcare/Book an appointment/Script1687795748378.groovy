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

WebUI.callTestCase(findTestCase('Reusing tests in katalon/Healthcare/Login Test'), [('username') : 'John', ('password') : 'ThisIsAPassword'])

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/Facility drop down'), 'Hongkong CURA Healthcare Center', 
    true)

WebUI.check(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Healthcare programe - Medicaid'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Calendar icon'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_30'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Book Appointment button'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Go to homepage button'))

WebUI.closeBrowser()

