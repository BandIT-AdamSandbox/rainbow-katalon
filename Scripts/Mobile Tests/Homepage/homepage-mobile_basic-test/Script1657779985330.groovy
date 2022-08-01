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
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions


System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())

Map<String, String> mobileEmulation = new HashMap<>();

mobileEmulation.put("deviceName", GlobalVariable.mobileDevice);

ChromeOptions chromeOptions = new ChromeOptions();

chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

WebDriver driver = new ChromeDriver(chromeOptions);

DriverFactory.changeWebDriver(driver)

driver.navigate().to(homepageUrl)

//WebUI.navigateToUrl(homepageUrl)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('HomePage/zamknijCiastka'))

WebUI.comment('SearchBar / Hero')

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/wraper'), timeout)

WebUI.verifyElementVisible(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/wraper'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/gdziekolwiek'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/gdziekolwiek'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/kiedykolwiek'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/kiedykolwiek'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/ilosc-osob'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/ilosc-osob'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/skadkolwiek'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/skadkolwiek'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/typ-transportu'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/typ-transportu'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/a_SZUKAJ-hero'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/homepage-hero-filtry/a_SZUKAJ-hero'), FailureHandling.STOP_ON_FAILURE)

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

WebUI.comment('Sekcja 4 - Popularne kierunki')

WebUI.verifyElementPresent(findTestObject('HomePage/popularne-kierunki/Header-popularne-kierunki'), timeout)

WebUI.verifyElementText(findTestObject('HomePage/popularne-kierunki/Header-popularne-kierunki'), 'Popularne kierunki')

WebUI.verifyElementPresent(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('HomePage/popularne-kierunki/kolaz-kierunkow'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/popularne-kierunki/grecja-pierwszy-kierunek'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/Mobile Objects/HomePage/popularne-kierunki/grecja-pierwszy-kierunek'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Pierwszy popularny kierunek (popularne-first-href)')

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Mobile Objects/HomePage/popularne-kierunki/grecja-pierwszy-kierunek'), 'href', 
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

WebUI.verifyElementPresent(findTestObject('HomePage/content-boxes/content-section__box-1'), timeout)

WebUI.verifyElementVisible(findTestObject('HomePage/content-boxes/content-section__box-1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/content-section/content-2'), timeout)

WebUI.verifyElementVisible(findTestObject('Object Repository/Mobile Objects/HomePage/content-section/content-2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Mobile Objects/HomePage/content-section/content-3'), timeout)

WebUI.verifyElementVisible(findTestObject('Object Repository/Mobile Objects/HomePage/content-section/content-3'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Koniec')

WebUI.closeBrowser()

