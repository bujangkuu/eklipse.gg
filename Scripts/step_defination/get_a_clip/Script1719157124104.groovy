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

WebUI.callTestCase(findTestCase('step_defination/open_landing_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('landing_page/click_button_sign_in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('login/input_email'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('login/input_password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('login/click_sign_in'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('stream_upload/click_skip_for_now'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('get_a_clip/click_button_get_a_clip'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('get_a_clip/dropdown_roblox'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('get_a_clip/click_button_confirm'), [:], FailureHandling.STOP_ON_FAILURE)

