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

WebUI.comment('Ocena klientów')

WebUI.scrollToElement(findTestObject('Mobile Objects/SearchPage/filtry-boczne/standard-hotelu/2-slonca'), 2)

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/ocena-klientow/Od 5.0'), timeout, 
    5, ocenaKlientow[0])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/ocena-klientow/Od 4.0'), timeout, 
    5, ocenaKlientow[1])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/ocena-klientow/Od 3.0'), timeout, 
    5, ocenaKlientow[2])

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/ocena-klientow/Dowolna'), timeout)

WebUI.closeBrowser()

