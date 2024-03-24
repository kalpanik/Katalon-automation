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

WebUI.navigateToUrl('https://academy.katalon.com/courses/test-reusability/')

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/button_Enroll'))

WebUI.verifyElementText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/p_Create a Katalon account'), 
    'Create a Katalon account')

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/a_Log In'))

WebUI.verifyElementText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/p_Log in to Katalon Academy'), 
    'Log in to Katalon Academy')

WebUI.setText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/input_Sign up now_username'), 
    'kirankukreja51@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/input_Sign up now_password'), 
    'HQ5CVqziJwodpPS1s4noTw==')

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/input_Katalon Certification Program_skillat_294bf0'))

WebUI.verifyElementText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdowns/Handling dialogue boxes/Web baesd modal/Katalon Academy/a_Resume Course'), 
    'Resume Course')

