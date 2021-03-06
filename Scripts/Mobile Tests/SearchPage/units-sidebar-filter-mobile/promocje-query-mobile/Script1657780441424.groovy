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

Map<String, String> mobileEmulation = new HashMap<>()

mobileEmulation.put("deviceName", GlobalVariable.mobileDevice)

ChromeOptions chromeOptions = new ChromeOptions()

chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation)

WebDriver driver = new ChromeDriver(chromeOptions)

DriverFactory.changeWebDriver(driver)

driver.navigate().to('https://r.pl/szukaj')

WebUI.click(findTestObject('Object Repository/SzukajPage/ZamknijCiastka'))

WebUI.click(findTestObject('Object Repository/Mobile Objects/SearchPage/filtry-boczne/pokaz-filtry-mobile-btn'))

WebUI.enableSmartWait()

WebUI.comment('Promocje')

WebUI.scrollToElement(findTestObject('Mobile Objects/SearchPage/filtry-boczne/akordeon-btn/Tematyka-akordeon'), 2)

WebUI.click(findTestObject('Mobile Objects/SearchPage/filtry-boczne/akordeon-btn/Promocje-akordeon'))

WebUI.scrollToElement(findTestObject('Mobile Objects/SearchPage/filtry-boczne/akordeon-btn/Promocje-akordeon'), 2)

WebUI.waitForElementClickable(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/Egzotyka 22-23 Second Minute'), 0)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/Egzotyka 22-23 Second Minute'), 
    timeout, 12, promocje[0])

if (WebUI.getText(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/Happy Hours')) == 'Happy Hours') {
	
    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/podczas-hh/Happy Hours'), 
        timeout, 12, promocje[1])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/podczas-hh/Przedsmak Lata'), 
        timeout, 12, promocje[2])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/podczas-hh/Topniejce Rabaty'), 
        timeout, 12, promocje[3])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/podczas-hh/Egzotyka 2223 - przedsprzeda'), 
        timeout, 12, promocje[4])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/podczas-hh/Last minute'), 
        timeout, 12, promocje[5])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/podczas-hh/Single nie placa'), 
        timeout, 12, promocje[6])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/podczas-hh/Super sroda'), 
        timeout, 12, promocje[7])
} else {
    println('Filtr bocznyh Happy Hours dla Promocje jest nieobecny')

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/poza-hh/Przedsmak Lata'), 
        timeout, 12, promocje[2])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/poza-hh/Topniejace Rabaty'), 
        timeout, 12, promocje[3])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/poza-hh/Egzotyka 2223 - przedsprzedaz'), 
        timeout, 12, promocje[4])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/poza-hh/Last minute'), 
        timeout, 12, promocje[5])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/poza-hh/Single nie palca'), 
        timeout, 12, promocje[6])

    CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/promocje/poza-hh/Super sroda'), 
        timeout, 12, promocje[7])
}

WebUI.closeBrowser()

