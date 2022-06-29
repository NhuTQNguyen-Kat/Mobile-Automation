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

WebUI.scrollToElement(findTestObject('An Event Apart/Page_An Event Apart - the premier web  inte_f2ce13/a_Contact Us'), 
    60)

WebUI.click(findTestObject('Object Repository/An Event Apart/Page_An Event Apart - the premier web  inte_f2ce13/a_Contact Us'))

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_Contact An Event Apart/input_(required)_fromName'), 
    'My name')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_Contact An Event Apart/input_(required)_fromEmail'), 
    'email@gmail.com')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_Contact An Event Apart/input_Your Phone Number_messagePhone'), 
    '123123123')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_Contact An Event Apart/input_If this is about a specific event, pl_49ece3'), 
    'Vlaciiodilaca ta 001')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_Contact An Event Apart/textarea_(required)_messagebody'), 
    'This is my message')

WebUI.click(findTestObject('Object Repository/An Event Apart/Page_Contact An Event Apart/input'))

def txt_msg = WebUI.getText(findTestObject('Object Repository/An Event Apart/Page_Contact An Event Apart/p_Your message has been sent Thank you for _da51b0'))

WebUI.verifyMatch('Your message has been sent! Thank you for getting in touch with us. We’ll do our best to get back to you quickly.', 
    txt_msg, false)

