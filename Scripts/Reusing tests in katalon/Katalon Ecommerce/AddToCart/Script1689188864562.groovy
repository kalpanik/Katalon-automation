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

WebUI.callTestCase(findTestCase('Reusing tests in katalon/Katalon Ecommerce/Login to shop'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_My account  Katalon Shop/a_Shop'))

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Katalon Shop  Katalon Ecommerce/img__attachment-woocommerce_thumbnail size-_5f269b'))

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Happy Ninja  Katalon Shop/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon ecommerce/Page_Happy Ninja  Katalon Shop/div_View cart Happy Ninja has been added to_368951'),5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon ecommerce/Page_Happy Ninja  Katalon Shop/nav_HomeClothingHoodiesHappy Ninja'),5)

WebUI.click(findTestObject('Object Repository/Katalon ecommerce/Page_Happy Ninja  Katalon Shop/a_View cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon ecommerce/Page_Cart  Katalon Shop/h1_Cart'),5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon ecommerce/Page_Cart  Katalon Shop/td_Happy Ninja'),5)

