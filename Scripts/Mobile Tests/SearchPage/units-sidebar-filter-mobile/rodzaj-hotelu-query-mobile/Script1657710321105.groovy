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

WebUI.navigateToUrl('https://r.pl/szukaj')

WebUI.click(findTestObject('Object Repository/SzukajPage/ZamknijCiastka'))

WebUI.click(findTestObject('Object Repository/Mobile Objects/SearchPage/filtry-boczne/pokaz-filtry-mobile-btn'))

WebUI.enableSmartWait()

WebUI.comment('Rodzaj hotelu')

WebUI.scrollToElement(findTestObject('Mobile Objects/SearchPage/filtry-boczne/dokumenty/Bez wizy'), 2)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/rodzaj-hotelu/Nowosc'), timeout, 
    9, rodzajHotelu[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/rodzaj-hotelu/Hotel Premium'), timeout, 
    9, rodzajHotelu[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/rodzaj-hotelu/Rodzinny'), timeout, 
    9, rodzajHotelu[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/rodzaj-hotelu/Dla doroslych'), timeout, 
    9, rodzajHotelu[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/rodzaj-hotelu/Siec White Olive'), timeout, 
    9, rodzajHotelu[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/rodzaj-hotelu/Hotel Elite'), timeout, 
    9, rodzajHotelu[5])

WebUI.closeBrowser()

