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
// Katalon imports
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://r.pl/szukaj')

WebUI.click(findTestObject('Object Repository/SzukajPage/ZamknijCiastka'))

WebUI.enableSmartWait()

WebUI.comment('plik nieaktualny, nie pracuje dobrze')

WebUI.comment('Wyżywienie')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter1-1'), GlobalVariable.defaultTimout, 
    0, wyzywienie[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter1-2'), GlobalVariable.defaultTimout, 
    0, wyzywienie[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter1-3'), GlobalVariable.defaultTimout, 
    0, wyzywienie[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter1-4'), GlobalVariable.defaultTimout, 
    0, wyzywienie[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter1-5'), GlobalVariable.defaultTimout, 
    0, wyzywienie[4])

WebUI.comment('Ilość dni')

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-1'), GlobalVariable.defaultTimout, 
    1, iloscDni[0])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-2'), GlobalVariable.defaultTimout, 
    1, iloscDni[1])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-3'), GlobalVariable.defaultTimout, 
    1, iloscDni[2])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-4'), GlobalVariable.defaultTimout, 
    1, iloscDni[3])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-5-default'), GlobalVariable.defaultTimout, 
    1, iloscDni[4])

WebUI.comment('Typ wyjazdu')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filtr3-1'), GlobalVariable.defaultTimout, 
    2, typWyjazdu[0])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filtr3-2'), GlobalVariable.defaultTimout, 
    2, typWyjazdu[1])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filtr-3-2-1'), GlobalVariable.defaultTimout, 
    2, typWyjazdu[2])

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SidebarFilters/filtr-3-2-1'), GlobalVariable.defaultTimout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SidebarFilters/filtr3-2'), GlobalVariable.defaultTimout)

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filtr3-3'), GlobalVariable.defaultTimout, 
    2, typWyjazdu[3])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filtr3-3-1'), GlobalVariable.defaultTimout, 
    2, typWyjazdu[4])

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SidebarFilters/filtr3-3-1'), GlobalVariable.defaultTimout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SidebarFilters/filtr3-3'), GlobalVariable.defaultTimout)

WebUI.comment('Cena')

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter4-2'), GlobalVariable.defaultTimout, 
    3, cena[1])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter4-1-default'), GlobalVariable.defaultTimout, 
    3, cena[0])

WebUI.comment('Standard hotelu')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter5-1'), GlobalVariable.defaultTimout, 
    4, standardHotelu[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter5-2'), GlobalVariable.defaultTimout, 
    4, standardHotelu[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter5-3'), GlobalVariable.defaultTimout, 
    4, standardHotelu[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter5-4'), GlobalVariable.defaultTimout, 
    4, standardHotelu[3])

WebUI.comment('Ocena klientów')

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter6-2'), GlobalVariable.defaultTimout, 
    5, ocenaKlientow[0])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter6-3'), GlobalVariable.defaultTimout, 
    5, ocenaKlientow[1])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter6-4'), GlobalVariable.defaultTimout, 
    5, ocenaKlientow[2])

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SidebarFilters/filter6-1-default'), GlobalVariable.defaultTimout)

WebUI.comment('Sezon')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter7-1'), GlobalVariable.defaultTimout, 
    6, sezon[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter7-2'), GlobalVariable.defaultTimout, 
    6, sezon[1])

WebUI.comment('Udogodnienia')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-1'), GlobalVariable.defaultTimout, 
    7, udogodnienia[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-2'), GlobalVariable.defaultTimout, 
    7, udogodnienia[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-3'), GlobalVariable.defaultTimout, 
    7, udogodnienia[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-4'), GlobalVariable.defaultTimout, 
    7, udogodnienia[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-5'), GlobalVariable.defaultTimout, 
    7, udogodnienia[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-6'), GlobalVariable.defaultTimout, 
    7, udogodnienia[5])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-7'), GlobalVariable.defaultTimout, 
    7, udogodnienia[6])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-8'), GlobalVariable.defaultTimout, 
    7, udogodnienia[7])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-9'), GlobalVariable.defaultTimout, 
    7, udogodnienia[8])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-10'), GlobalVariable.defaultTimout, 
    7, udogodnienia[9])

WebUI.comment('Dokumenty')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter9-1'), GlobalVariable.defaultTimout, 
    8, dokumenty[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter9-2'), GlobalVariable.defaultTimout, 
    8, dokumenty[1])

WebUI.comment('Rodzaj hotelu')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter10-1'), GlobalVariable.defaultTimout, 
    9, rodzajHotelu[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter10-2'), GlobalVariable.defaultTimout, 
    9, rodzajHotelu[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter10-3'), GlobalVariable.defaultTimout, 
    9, rodzajHotelu[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter10-4'), GlobalVariable.defaultTimout, 
    9, rodzajHotelu[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter10-5'), GlobalVariable.defaultTimout, 
    9, rodzajHotelu[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter10-6'), GlobalVariable.defaultTimout, 
    9, rodzajHotelu[5])

WebUI.comment('Pokoje')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter11-1'), GlobalVariable.defaultTimout, 
    10, pokoje[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter11-2'), GlobalVariable.defaultTimout, 
    10, pokoje[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter11-3'), GlobalVariable.defaultTimout, 
    10, pokoje[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter11-4'), GlobalVariable.defaultTimout, 
    10, pokoje[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter11-5'), GlobalVariable.defaultTimout, 
    10, pokoje[4])

WebUI.comment('Tematyka')

WebUI.click(findTestObject('SzukajPage/SidebarFilters/tematyka-filter-akordeon'))

WebUI.waitForElementClickable(findTestObject('SzukajPage/SidebarFilters/filter12-1'), 0)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-1'), GlobalVariable.defaultTimout, 
    11, tematyka[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-2'), GlobalVariable.defaultTimout, 
    11, tematyka[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-3'), GlobalVariable.defaultTimout, 
    11, tematyka[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-4'), GlobalVariable.defaultTimout, 
    11, tematyka[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-5'), GlobalVariable.defaultTimout, 
    11, tematyka[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-6'), GlobalVariable.defaultTimout, 
    11, tematyka[5])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-7'), GlobalVariable.defaultTimout, 
    11, tematyka[6])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-8'), GlobalVariable.defaultTimout, 
    11, tematyka[7])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-9'), GlobalVariable.defaultTimout, 
    11, tematyka[8])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-10'), GlobalVariable.defaultTimout, 
    11, tematyka[9])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-11'), GlobalVariable.defaultTimout, 
    11, tematyka[10])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-12'), GlobalVariable.defaultTimout, 
    11, tematyka[11])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-13'), GlobalVariable.defaultTimout, 
    11, tematyka[12])

WebUI.comment('Promocje')

WebUI.click(findTestObject('SzukajPage/SidebarFilters/promocje-filter-akordeon'))

WebUI.waitForElementClickable(findTestObject('SzukajPage/SidebarFilters/filter13-1'), 0)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-1'), GlobalVariable.defaultTimout, 
    12, promocje[0])

if(WebUI.verifyElementPresent(findTestObject('SzukajPage/SidebarFilters/filter13-2'), 0, FailureHandling.OPTIONAL)) {
	CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-2'), GlobalVariable.defaultTimout,
	    12, promocje[1])
} else {
	KeywordUtil.markWarning('Filtr bocznyh Happy Hours dla Promocje jest nieobecny')
}

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-3'), GlobalVariable.defaultTimout, 
    12, promocje[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-4'), GlobalVariable.defaultTimout, 
    12, promocje[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-5'), GlobalVariable.defaultTimout, 
    12, promocje[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-6'), GlobalVariable.defaultTimout, 
    12, promocje[5])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-7'), GlobalVariable.defaultTimout, 
    12, promocje[6])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter13-8'), GlobalVariable.defaultTimout, 
    12, promocje[7])

WebUI.closeBrowser()

