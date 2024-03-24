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

WebUI.callTestCase(findTestCase('Reusing tests in katalon/Katalon Ecommerce/AddToCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/h1_Checkout'), 
    5)

WebUI.setText(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/input__billing_first_name'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    'Customer')

WebUI.setText(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/input_(optional)_billing_company'), 
    'XYZ')

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/span_Vietnam'))
WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/span_Vietnam'))
WebUI.setText(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/input__billing_address_1'), 
    '628 Nguyen Hai Phong A')

WebUI.setText(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/input_(optional)_billing_postcode'), 
    '70000')

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/input__billing_city'))

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/p_Thank you. Your order has been received'))

WebUI.verifyElementText(findTestObject('Object Repository/Katalon ecommerce/Page_Checkout  Katalon Shop/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')

