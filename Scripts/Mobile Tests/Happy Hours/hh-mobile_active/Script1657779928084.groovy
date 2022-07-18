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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://r.pl/happy-hours')

//WebUI.click(findTestObject('HappyHoursPage/zamknijCiastka'))
WebUI.verifyElementNotPresent(findTestObject('HappyHoursPage/clock-module2'), 1)

WebUI.verifyElementNotPresent(findTestObject('HappyHoursPage/do-startu-kolejnej-promocji-pozostao'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/HappyHoursPage/pokaz-wszystkie-oferty-link'), 1)

WebUI.verifyElementVisible(findTestObject('Object Repository/HappyHoursPage/pokaz-wszystkie-oferty-link'))

WebUI.verifyElementText(findTestObject('Object Repository/HappyHoursPage/pokaz-wszystkie-oferty-text'), 'POKAŻ WSZYSTKIE OFERTY')

if (!(WebUI.verifyElementPresent(findTestObject('HappyHoursPage/bloczki-content-hh'), 1, FailureHandling.OPTIONAL))) {
    KeywordUtil.markFailedAndStop('Promocja jest ale nie ma bloczków z ofertami')
}

WebUI.verifyElementPresent(findTestObject('HappyHoursPage/bloczki-content-hh'), 1)

WebUI.verifyElementPresent(findTestObject('HappyHoursPage/pierwszy-bloczek-hh'), 1)

WebUI.verifyElementVisible(findTestObject('Object Repository/HappyHoursPage/pierwszy-bloczek-hh'))

WebUI.verifyElementPresent(findTestObject('HappyHoursPage/pokaz-wszystkie-oferty-link'), 1)

WebUI.closeBrowser()

