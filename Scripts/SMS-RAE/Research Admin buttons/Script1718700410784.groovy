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

WebUI.navigateToUrl('http://127.0.0.1:8000/sign-in')

WebUI.setText(findTestObject('Object Repository/SMS-RAE/Page_PUPSMS/input__email'), 'ResearchAdmin@pupsrcsms.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SMS-RAE/Page_PUPSMS/input__password'), '373N5QL8KVQ=')

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSMS/button_Sign                                    In'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/i_Dashboard_sidenav-toggler-line'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/a_Research'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/button_Open'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/button_Close'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/span_Delete'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/button_Close'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/input_Search_selectAll'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/input_Search_selectAll'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/a_Pending 0'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/a_Done 0'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/a_All 0'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/path_Research_Vector'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/svg'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/svg'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/svg'))

WebUI.click(findTestObject('Object Repository/SMS-RAE/Page_PUPSRC-SMS/span_Logout'))

