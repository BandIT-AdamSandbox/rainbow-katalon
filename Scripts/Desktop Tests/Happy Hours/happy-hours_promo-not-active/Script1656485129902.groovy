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

WebUI.navigateToUrl('https://r.pl/happy-hours')

WebUI.verifyElementText(findTestObject('Object Repository/HappyHoursPage/do-startu-kolejnej-promocji-pozostao'), 'Do startu kolejnej promocji pozostało:')

WebUI.verifyElementPresent(findTestObject('Object Repository/HappyHoursPage/clock-module'), 1)

WebUI.verifyElementVisible(findTestObject('Object Repository/HappyHoursPage/clock-module2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HappyHoursPage/clock_1-block'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/HappyHoursPage/clock_2-block'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/HappyHoursPage/clock_3-block'), 1)

WebUI.verifyElementPresent(findTestObject('Object Repository/HappyHoursPage/clock_4-block'), 1)

WebUI.verifyElementText(findTestObject('Object Repository/HappyHoursPage/dni-string'), 'dni')

WebUI.verifyElementText(findTestObject('Object Repository/HappyHoursPage/godz-string'), '(godz)')

WebUI.verifyElementText(findTestObject('Object Repository/HappyHoursPage/min-string'), '(min)')

WebUI.verifyElementText(findTestObject('Object Repository/HappyHoursPage/sek-string'), '(sek)')

WebUI.verifyElementNotPresent(findTestObject('HappyHoursPage/pokaz-wszystkie-oferty-link'), 1)

//WebUI.verifyElementNotPresent(findTestObject('HappyHoursPage/pierwszy-bloczek-hh'), 1)

WebUI.closeBrowser()

