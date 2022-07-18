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
import org.openqa.selenium.remote.DesiredCapabilities as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.delay(5)

firstRun = WebUI.getText(findTestObject('test-case-10/szukaj-offers-amount'))

for (int i = 0; i < 6; i++) {
    WebUI.delay(2)

    WebUI.click(findTestObject('Mobile Objects/SearchPage/buttony-szukaj-mobile/szukaj-show-options'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Mobile Objects/SearchPage/buttony-szukaj-mobile/button_szukaj'))

    WebUI.delay(2)

    compareString = WebUI.getText(findTestObject('test-case-10/szukaj-offers-amount'))

    WebUI.verifyMatch(compareString, firstRun, false, FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.closeBrowser()

