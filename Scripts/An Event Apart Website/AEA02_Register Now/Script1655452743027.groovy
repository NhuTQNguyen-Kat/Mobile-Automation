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

WebUI.navigateToUrl('https://aneventapart.com/')

WebUI.click(findTestObject('Object Repository/An Event Apart/Page_An Event Apart - the premier web  inte_f2ce13/label_Menu'))

WebUI.click(findTestObject('Object Repository/An Event Apart/Page_An Event Apart - the premier web  inte_f2ce13/a_Register Now'))

WebUI.click(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Registration/a_Spring Summit'))

WebUI.verifyTextPresent('Register for An Event Apart', false)

WebUI.verifyTextPresent(text, false)

WebUI.verifyTextPresent('$1,050.00', false)

WebUI.click(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Register for An _467dfd/a_Buy Now'))

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_First Name_attendeefirst_name'), 
    'First name')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Last Name_attendeelast_name'), 
    'last name')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Company_attendeecompany'), 
    'company')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Title_attendeetitle'), 
    'title')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Address_attendeeaddress'), 
    'address')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Suite_attendeesuite'), 
    'suite')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_City_attendeecity'), 
    'city')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_State_attendeestate'), 
    'state')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Zip_attendeezip'), 
    '11111')

WebUI.selectOptionByValue(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/select_United StatesCanadaAfghanistanAland _99e1a8'), 
    'Canada', true)

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Email_attendeeemail'), 
    'email@gmail.com')

WebUI.setText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Phone_attendeephone'), 
    '0123123123')

WebUI.selectOptionByValue(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/select_Please selectYesNoDont know'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Attendee Information/input_Has this person attended one of our p_a67947'))

WebUI.click(findTestObject('An Event Apart/Page_An Event Apart Store  Attendee Information/btn_Add attendee'))

def ticket = WebUI.getText(findTestObject('Object Repository/An Event Apart/Page_An Event Apart Store  Your An Event Ap_eb3b17/div_On Demand Three-Day Pass'))

def totalcell = WebUI.getText(findTestObject('An Event Apart/Page_An Event Apart Store  Your An Event Ap_eb3b17/td_Total1,050.00'))

WebUI.verifyMatch(ticket, 'On Demand Three-Day Pass', false)

WebUI.verifyMatch(totalcell, 'TOTAL:$1,050.00', false)

