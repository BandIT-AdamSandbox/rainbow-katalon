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

WebUI.click(findTestObject('HomePage/zamknijCiastka'))

WebUI.click(findTestObject('Object Repository/Mobile Objects/HomePage/nav/burger'))

WebUI.comment('Offerta')

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/Oferta-akord'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/Oferta-akord'))

WebUI.click(findTestObject('Object Repository/Mobile Objects/HomePage/nav/Oferta-akord'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Lato 2022'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Lato 2022'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Zima 20222023 Second Minute'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Zima 20222023 Second Minute'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wypoczynek i zwiedzanie'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wypoczynek i zwiedzanie'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wycieczki objazdowe'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wycieczki objazdowe'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Dojazd wasny'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Dojazd wasny'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_All inclusive'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_All inclusive'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Hotele Elite'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Hotele Elite'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wakacje z dziemi'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wakacje z dziemi'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Hotele White Olive'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Hotele White Olive'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Autokarem z Polski'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Autokarem z Polski'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Rejsy'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Rejsy'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wakacje w Polsce'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wakacje w Polsce'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Krotki urlop'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Krotki urlop'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_City Break'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_City Break'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wycieczki fakultatywne'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wycieczki fakultatywne'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Przelot Dreamlinerem'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Przelot Dreamlinerem'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Parking przy lotnisku'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Parking przy lotnisku'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Ubezpieczenia podrne'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Ubezpieczenia podrne'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wszystkie kierunki'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/deal_Wszystkie kierunki'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Mobile Objects/HomePage/nav/Oferta-akord'))

WebUI.comment('Promocje')

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/Promocje-akord'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/promo_Topniejce Rabaty'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/promo_Happy Hours'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/promo_Super sroda'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/promo_Koncweczka'), 0)

WebUI.comment('Reszta nava')

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Last Minute'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Last Minute'))

WebUI.verifyElementAttributeValue(findTestObject('Mobile Objects/HomePage/nav/a_Last Minute'), 'href', 'https://r.pl/last-minute', 
    3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Czartery'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Czartery'))

//WebUI.verifyElementAttributeValue(findTestObject('Mobile Objects/HomePage/nav/a_Czartery'), 'href', 'https://biletyczarterowe.r.pl', 
//    3)
WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Wycieczki fakultatywne'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Wycieczki fakultatywne'))

WebUI.verifyElementAttributeValue(findTestObject('Mobile Objects/HomePage/nav/a_Wycieczki fakultatywne'), 'href', 'https://r.pl/wycieczki-fakultatywne', 
    3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Blog'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Blog'))

WebUI.verifyElementAttributeValue(findTestObject('Mobile Objects/HomePage/nav/a_Blog'), 'href', 'https://r.pl/blog', 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Ulubione'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Ulubione'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Ulubione'), 'href', 'https://r.pl/schowek', 
    3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Zaloguj sie'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Zaloguj sie'), FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementAttributeValue(findTestObject('Mobile Objects/HomePage/nav/a_Zaloguj sie'), 'href', 'https://panel-klienta.r.pl', 
//    3)
WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_telefon'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_telefon'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Mobile Objects/HomePage/nav/a_telefon'), 'href', 'tel:426803851', 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Nasze biura'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/nav/a_Nasze biura'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('Mobile Objects/HomePage/nav/a_Nasze biura'), 'href', 'https://r.pl/biura', 
    3)

WebUI.click(findTestObject('Object Repository/Mobile Objects/HomePage/nav/burger-cross'))

WebUI.verifyElementPresent(findTestObject('Mobile Objects/HomePage/nav/Logo'), 0)

WebUI.verifyElementClickable(findTestObject('Mobile Objects/HomePage/nav/Logo'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Mobile Objects/HomePage/nav/info-ukraina'), 0)

WebUI.verifyElementClickable(findTestObject('Mobile Objects/HomePage/nav/info-ukraina'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Mobile Objects/HomePage/nav/phone-img'), 0)

WebUI.verifyElementClickable(findTestObject('Mobile Objects/HomePage/nav/phone-img'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

