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


//Wrong email or password. Try again or create an account .

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.linkedin.com/login')

WebUI.setText(findTestObject('Object Repository/Page_LinkedIn Login, Sign in  LinkedIn/input_Sign in_session_key'), 'psreddy102@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LinkedIn Login, Sign in  LinkedIn/input_Sign in_session_password'),'cpgYUghDjfdr0TiipLVfAQ==')

WebUI.click(findTestObject('Object Repository/Page_LinkedIn Login, Sign in  LinkedIn/button_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_LinkedIn Login, Sign in  LinkedIn/div_Wrong email or password. Try again or   create an account'), 'Wrong email or password. Try again or create an account .')