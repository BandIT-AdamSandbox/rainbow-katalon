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

WebUI.navigateToUrl('https://r.pl/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/zamknijCiastka'))

WebUI.comment('Sprawdzanie submenu oferty')

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/Oferta'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/Oferta'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/HomePage/Nav/Oferta'))

WebUI.mouseOver(findTestObject('Object Repository/HomePage/Nav/nav-oferta/span_Lato'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Lato'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Lato'))

WebUI.mouseOver(findTestObject('Object Repository/HomePage/Nav/nav-oferta/span_Zima-sm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Zima-sm'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Zima-sm'))

WebUI.mouseOver(findTestObject('Object Repository/HomePage/Nav/nav-oferta/span_Wypoczynek'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Wypoczynek'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Wypoczynek'))

WebUI.mouseOver(findTestObject('Object Repository/HomePage/Nav/nav-oferta/span_Objazdowe'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Objazdowe'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Objazdowe'))

WebUI.mouseOver(findTestObject('Object Repository/HomePage/Nav/nav-oferta/span_Wlasny'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Wlasny'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/HomePage/Nav/nav-oferta/wrapper_Wlasny'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_All inclusive'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_All inclusive'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_All inclusive'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Hotele Elite'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Hotele Elite'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Hotele Elite'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Wakacje z dziemi'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Wakacje z dziemi'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Wakacje z dziemi'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Autokarem z Polski'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Autokarem'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Autokarem'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Rejsy'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Rejsy'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Rejsy'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Krtki urlop'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Krtki urlop'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Krtki urlop'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_City Break'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_City Break'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_City Break'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Hotele White Olive'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Hotele White Olive'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Hotele White Olive'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Wycieczki fakultatywne'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Wycieczki fakultatywne'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Wycieczki fakultatywne'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Przelot Dreamlinerem'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Przelot Dreamlinerem'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Przelot Dreamlinerem'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Parking przy lotnisku'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Parking przy lotnisku'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Parking przy lotnisku'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Ubezpieczenia podrne'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Ubezpieczenia podrne'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Ubezpieczenia podrne'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-oferta/span_Wszystkie kierunki'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-oferta/wrapper_Wszystkie kierunki'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-oferta/wrapper_Wszystkie kierunki'))

WebUI.comment('Sprawdzanie submenu promocje')

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/Promocje'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/Promocje'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/Promocje'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-promocje/span_Topniejce Rabaty'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-promocje/wrapper_Topniejce Rabaty'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-promocje/wrapper_Topniejce Rabaty'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-promocje/span_Happy Hours'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-promocje/wrapper_Happy Hours'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-promocje/wrapper_Happy Hours'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-promocje/span_Super roda'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-promocje/wrapper_Super roda'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-promocje/wrapper_Super roda'))

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-promocje/span_Kocweczka'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-promocje/wrapper_Kocweczka'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-promocje/wrapper_Kocweczka'))

WebUI.comment('Sprawdzanie reszty nava')

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/Last Minute'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/Last Minute'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/Last Minute'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/Czartery'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/Czartery'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/Czartery'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/Wycieczki fakultatywne'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/Wycieczki fakultatywne'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/Wycieczki fakultatywne'))

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/Blog'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/Blog'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/Blog'))

WebUI.comment('Prawa strona nava')

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-rightside/ukraina-info'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-rightside/ukraina-info'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-rightside/ukraina-info'))

WebUI.verifyElementAttributeValue(findTestObject('HomePage/Nav/nav-rightside/ukraina-info'), 'href', 'https://r.pl/informatsiya-dla-hromadian-ukrainy', 
    timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-rightside/kontakt'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-rightside/kontakt'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-rightside/kontakt'))

WebUI.verifyElementAttributeValue(findTestObject('HomePage/Nav/nav-rightside/kontakt'), 'href', 'https://r.pl/kontakt', 
    timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-rightside/Numer telefonu'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-rightside/Numer telefonu'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HomePage/Nav/nav-rightside/Numer telefonu'), '42 680 38 51')

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-rightside/panel-klienta'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-rightside/panel-klienta'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-rightside/panel-klienta'))

WebUI.verifyElementAttributeValue(findTestObject('HomePage/Nav/nav-rightside/panel-klienta'), 'href', 'https://panel-klienta.r.pl/', 
    timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-rightside/biura'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-rightside/biura'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-rightside/biura'))

WebUI.verifyElementAttributeValue(findTestObject('HomePage/Nav/nav-rightside/biura'), 'href', 'https://r.pl/biura', timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/Nav/nav-rightside/schowek'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/Nav/nav-rightside/schowek'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/Nav/nav-rightside/schowek'))

WebUI.verifyElementAttributeValue(findTestObject('HomePage/Nav/nav-rightside/schowek'), 'href', 'https://r.pl/schowek', 
    timeout)

WebUI.closeBrowser()

