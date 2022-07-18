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

WebUI.navigateToUrl('https://r.pl/szukaj')

WebUI.comment('1.07.22 - there is a bug and test needs another nav')

WebUI.navigateToUrl('https://r.pl/szukaj')

WebUI.waitForPageLoad(5)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/ZamknijCiastka'), timeout)

WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/searchBar-typ-transportu'))

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/TypTransportu/span_DowolnyTypTransportu'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[0])

WebUI.delay(timeout)

WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/searchBar-typ-transportu'))

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/TypTransportu/span_Samolot Dreamliner'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[2])

WebUI.delay(timeout)

WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/searchBar-typ-transportu'))

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/TypTransportu/span_Autobus'), timeout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[3])

WebUI.delay(timeout)

WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/searchBar-typ-transportu'))

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/TypTransportu/span_DojazdWlasny'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[4])

WebUI.delay(timeout)

WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/searchBar-typ-transportu'))

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/TypTransportu/span_Samolot'), timeout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[1])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[2])

WebUI.delay(timeout)

WebUI.click(findTestObject('SzukajPage/SearchBar/TypTransportu/usunTypTransportu'))

WebUI.delay(timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[0])

WebUI.closeBrowser()

