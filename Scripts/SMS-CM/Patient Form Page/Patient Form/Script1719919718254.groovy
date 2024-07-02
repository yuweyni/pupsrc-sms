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

WebUI.navigateToUrl('https://pupsrc-sms.com/sign-in')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_Sign In/input__email'), 'mariatheresabisnar@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_Sign In/input__password'), '/+RLqLUgKjVjTb0tZ10x8g==')

WebUI.click(findTestObject('Object Repository/SMS-CM/Add Patient/Page_Sign In/button_Sign                                    In'))

WebUI.click(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/img_Forms_navbar-brand-img img-fluid mb-3'))

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__name'), 'Maria Theresa Bisnar')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__pup_id'), '2021-00353-SR-0')

WebUI.selectOptionByValue(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/select_Select Year  Section                _ec0266'), 
    'BSIT 3-2', true)

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__contact_number'), '09565645465')

WebUI.selectOptionByValue(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/select_Select Sex                          _3c076a'), 
    'Female', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/select_Select Case Type                    _530fa8'), 
    'Non-emergency', true)

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__blood_pressure'), '120/80')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__temperature'), '45')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__respiration'), '26')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__pulse_rate'), '67')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__concern'), 'Dizziness')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__physical_assessment'), 'stress')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__medical_history'), 'hypertension')

WebUI.setText(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/input__medication'), 'biogesic')

WebUI.click(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/button_Submit'))

WebUI.click(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/button_Save'))

WebUI.click(findTestObject('Object Repository/SMS-CM/Add Patient/Page_PUPSRC-SMS/button_Okay'))

