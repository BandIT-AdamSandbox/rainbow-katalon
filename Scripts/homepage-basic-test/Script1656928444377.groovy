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

WebUI.navigateToUrl(homepageUrl)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('HomePage/zamknijCiastka'))

WebUI.comment('SearchBar / Hero')

WebUI.verifyElementPresent(findTestObject('HomePage/search-bar/searchBar'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/search-bar/searchBar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/search-bar/Gdziekolwiek-input'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/search-bar/Gdziekolwiek-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/search-bar/Kiedykolwiek-input'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/search-bar/Kiedykolwiek-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/search-bar/Osoby-input'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/search-bar/Osoby-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/search-bar/Skadkolwiek-input'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/search-bar/Skadkolwiek-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/search-bar/Transport-input'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/search-bar/Transport-input'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/search-bar/searchBar-szukaj-btn'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/search-bar/searchBar-szukaj-btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Sekcja 1 - Biuro podróży')

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/Header-Biuro-podrozy-rainbow'), timeout)

WebUI.verifyElementText(findTestObject('HomePage/biuro-podrozy-rainbow/Header-Biuro-podrozy-rainbow'), 'Biuro podróży Rainbow')

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/slider-1-wrapper'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/biuro-podrozy-rainbow/slider-1-wrapper'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('1.1 - Topniejace')

WebUI.verifyElementClickable(findTestObject('HomePage/biuro-podrozy-rainbow/Topniejace/slider__TopniejceRabaty-btn'))

WebUI.click(findTestObject('HomePage/biuro-podrozy-rainbow/Topniejace/slider__TopniejceRabaty-btn'))

WebUI.delay(smallTimout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/Topniejace/slider__Topniejace'), timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/Topniejace/slider_Topniejace-firstEle'), timeout)

WebUI.comment('1.2 - Last Minute')

WebUI.verifyElementClickable(findTestObject('HomePage/biuro-podrozy-rainbow/LastMinute/slider__LastMinute-btn'))

WebUI.click(findTestObject('HomePage/biuro-podrozy-rainbow/LastMinute/slider__LastMinute-btn'))

WebUI.delay(smallTimout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/LastMinute/slider__Last'), timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/LastMinute/slider_Last-firstEle'), timeout)

WebUI.comment('1.3 - Turcja')

WebUI.verifyElementClickable(findTestObject('HomePage/biuro-podrozy-rainbow/Turcja/slider__Turcja-btn'))

WebUI.click(findTestObject('HomePage/biuro-podrozy-rainbow/Turcja/slider__Turcja-btn'))

WebUI.delay(smallTimout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/Turcja/slider__Turcja'), timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/Turcja/slider_Turcja-firstEle'), timeout)

WebUI.comment('1.4 - Egoztyka')

WebUI.verifyElementClickable(findTestObject('HomePage/biuro-podrozy-rainbow/Egoztyka/slider__Egzotyka-btn'))

WebUI.click(findTestObject('HomePage/biuro-podrozy-rainbow/Egoztyka/slider__Egzotyka-btn'))

WebUI.delay(smallTimout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/Egoztyka/slider__Egzotyka'), timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/biuro-podrozy-rainbow/Egoztyka/slider__Egzotyka-firstEle'), timeout)

WebUI.comment('Sekcja 2 - Aktualne wytyczne')

WebUI.verifyElementPresent(findTestObject('HomePage/wytyczne/aktualne-wytyczne'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/wytyczne/aktualne-wytyczne'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/wytyczne/aktualne-wytyczne__sprawdz-teraz'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/wytyczne/aktualne-wytyczne__sprawdz-teraz'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('HomePage/wytyczne/wytyczne__link'), 'href', 'https://r.pl/wytyczne', timeout)

WebUI.comment('Sekcja 3 - Rainbow poleca')

WebUI.verifyElementPresent(findTestObject('HomePage/rainbow-poleca/Header-rainbow-poleca'), timeout)

WebUI.verifyElementText(findTestObject('HomePage/rainbow-poleca/Header-rainbow-poleca'), 'Rainbow poleca')

WebUI.verifyElementPresent(findTestObject('HomePage/rainbow-poleca/rainbow-poleca__slider'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/rainbow-poleca/rainbow-poleca__slider'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/rainbow-poleca/rainbow-poleca__slider-next-btn'), timeout)

WebUI.click(findTestObject('HomePage/rainbow-poleca/rainbow-poleca__slider-next-btn'))

WebUI.delay(timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/rainbow-poleca/rainbow-poleca__slider--clicked'), timeout)

WebUI.comment('Uwaga! Poniższa komenda sprawdza przesunięcie slidera')

WebUI.verifyElementAttributeValue(findTestObject('HomePage/rainbow-poleca/rainbow-poleca__slider--clicked'), 'style', popularneSliderClickedStyle, 
    timeout)

WebUI.comment('Sekcja 4 - Popularne kierunki')

WebUI.verifyElementPresent(findTestObject('HomePage/popularne-kierunki/Header-popularne-kierunki'), timeout)

WebUI.verifyElementText(findTestObject('HomePage/popularne-kierunki/Header-popularne-kierunki'), 'Popularne kierunki')

WebUI.verifyElementPresent(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow__first-element'), timeout)

WebUI.verifyElementClickable(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow__first-element'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Pierwszy popularny kierunek (popularne-first-href)')

WebUI.verifyElementAttributeValue(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow__first-element'), 'href', 
    popularneHref, timeout)

WebUI.comment('Sekcja 5 - Blog')

WebUI.verifyElementPresent(findTestObject('HomePage/blog/Header-blog'), timeout)

WebUI.verifyElementText(findTestObject('HomePage/blog/Header-blog'), 'blog')

WebUI.verifyElementPresent(findTestObject('HomePage/blog/blog-articles__wrap'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/blog/blog-articles__wrap'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/blog/blog-articles__first-element'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/blog/blog-articles__first-element'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Sekcja 5 - Content')

WebUI.verifyElementPresent(findTestObject('HomePage/content-boxes/content-section'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/content-boxes/content-section'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/content-boxes/content-section__show-more'), 0)

WebUI.verifyElementClickable(findTestObject('HomePage/content-boxes/content-section__show-more'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/content-boxes/content-section__show-more'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(timeout, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/content-boxes/content-section__span-Ukryj'), timeout)

WebUI.verifyElementText(findTestObject('HomePage/content-boxes/content-section__span-Ukryj'), 'Ukryj')

WebUI.verifyElementPresent(findTestObject('HomePage/content-boxes/content-section__box-1'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/content-boxes/content-section__box-1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/content-boxes/content-section__box-2'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/content-boxes/content-section__box-2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/content-boxes/content-section__box-3'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/content-boxes/content-section__box-3'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Koniec')

WebUI.closeBrowser()

