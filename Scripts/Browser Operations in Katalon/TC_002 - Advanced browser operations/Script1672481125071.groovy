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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

//get window title
WebUI.getWindowTitle()

print(WebUI.getWindowTitle())

// get url of the window
WebUI.getUrl()

WebUI.getWindowIndex()

//define a variable int and store window index in it
int currentTab = WebUI.getWindowIndex()

//open a new window using js snippet
WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')

//switch to window with index 1 and navigate to wiki
WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl('https://www.wikipedia.org/')

WebUI.getWindowIndex()

WebUI.delay(3)

//switch to window by title
WebUI.switchToWindowTitle('CURA Healthcare Service')

WebUI.delay(3)

//switch to window by url
WebUI.switchToWindowUrl('https://www.wikipedia.org/')

WebUI.delay(3)

//close window by title
//WebUI.closeWindowTitle('CURA Healthcare Service')
//close window by url
//WebUI.closeWindowUrl('https://katalon-demo-cura.herokuapp.com/')
//close window by index
WebUI.closeWindowIndex(1)

WebUI.delay(3)

WebUI.closeBrowser()

