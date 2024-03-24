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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')
WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Katalon Shop  Katalon Ecommerce/a_My account'))

WebUI.setText(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/input__username'), 'customer')

WebUI.setEncryptedText(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/input__password'), 
    'fcttOx1e+dws0mP0AWb2uMRTnZbRfS0W')

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/button_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/loggedIn username'),5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/nav_HomeMy account'),5)

