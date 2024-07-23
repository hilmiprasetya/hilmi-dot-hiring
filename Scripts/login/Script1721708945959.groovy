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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.verifyElementText(findTestObject('Object Repository/word_in_login_page'), 'Facebook helps you connect and share with the people in your life.')

WebUI.getAttribute(findTestObject('Object Repository/input_Log in to Facebook_email'), 'Email address or phone number')

WebUI.getAttribute(findTestObject('Object Repository/form_password'), 'Password')

//Check if value form is empty
WebUI.click(findTestObject('Object Repository/cta_login'))

WebUI.verifyElementText(findTestObject('Object Repository/allert_if_username_empty'), 'The email address or mobile number you entered isn\'t connected to an account. Find your account and log in.')

//Check if value email n password is incorrect
WebUI.setText(findTestObject('Object Repository/input_Log in to Facebook_email'), 'bukan email yang benar')

WebUI.click(findTestObject('Object Repository/cta_login2'))

WebUI.verifyTextPresent('Find your account and log in.', false)

WebUI.setText(findTestObject('Object Repository/input_Log in to Facebook_email'), 'email@gmail.com')

WebUI.setText(findTestObject('Object Repository/form_password'), 'incorrect password')

WebUI.click(findTestObject('Object Repository/cta_login2'))

WebUI.click(findTestObject('Object Repository/msg_incorrect_password'))

//Check all value correct and successfully login

WebUI.setText(findTestObject('Object Repository/input_Log in to Facebook_email'), 'correctmail@gmail.com')

WebUI.setText(findTestObject('Object Repository/form_password'), 'correctpassword')

WebUI.click(findTestObject('Object Repository/cta_login2'))

WebUI.verifyTextPresent('What\'s on your mind,', false)

