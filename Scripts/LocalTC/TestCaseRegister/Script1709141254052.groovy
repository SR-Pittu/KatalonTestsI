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

WebUI.navigateToUrl('http://127.0.0.1:5000/')

WebUI.click(findTestObject('Object Repository/Page_Art  Photo Gallery/a_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Register as a Creator/input_Email_email'),'sobhareddypittu@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register as a Creator/input_Password_password'),'kz57GLv5OhC90CE+I4FSMg==' )

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register as a Creator/input_Re-Enter Password_password-reenter'),'kz57GLv5OhC90CE+I4FSMg==' )

WebUI.click(findTestObject('Object Repository/Page_Register as a Creator/button_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Register as a Creator/div_Registration successful n Please proceed to the login page'), 'Registration successful! /n Please proceed to the login page')