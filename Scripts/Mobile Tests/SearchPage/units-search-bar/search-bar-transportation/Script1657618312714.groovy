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

WebUI.comment('1.07.22 - there is a bug and test needs another nav')

WebUI.waitForPageLoad(5)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/ZamknijCiastka'), timeout)

WebUI.click(findTestObject('Mobile Objects/SearchPage/buttony-szukaj-mobile/szukaj-show-options'))

WebUI.comment('1. typ transportu: Dowolny')

WebUI.click(findTestObject('Mobile Objects/SearchPage/SearchBar/TypTransportu/div_Typ Transportu'))

WebUI.delay(1)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('Mobile Objects/SearchPage/SearchBar/TypTransportu/label_Dowolny'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[0])

WebUI.delay(timeout)

WebUI.comment('2. typ transportu: Samolot Dreamliner')

WebUI.click(findTestObject('Mobile Objects/SearchPage/SearchBar/TypTransportu/div_Typ Transportu'))

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('Mobile Objects/SearchPage/SearchBar/TypTransportu/label_Samolot Dreamliner'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
    timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[2])

WebUI.delay(timeout)

WebUI.comment('3. typ transportu: Autobus')

WebUI.click(findTestObject('Mobile Objects/SearchPage/SearchBar/TypTransportu/div_Typ Transportu'))

WebUI.delay(5)

//WebUI.click(findTestObject('Mobile Objects/SearchPage/SearchBar/TypTransportu/label_Autobus'))

//CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('Mobile Objects/SearchPage/SearchBar/TypTransportu/label_Autobus'), timeout)
//
//CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
//    timeout)

//CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[3])
//
//WebUI.delay(timeout)

//WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/searchBar-typ-transportu'))
//
//CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/TypTransportu/span_DojazdWlasny'), 
//    timeout)
//
//CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
//    timeout)
//
//CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[4])
//
//WebUI.delay(timeout)
//
//WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/searchBar-typ-transportu'))
//
//CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/TypTransportu/span_Samolot'), timeout)
//
//CustomKeywords.'search.filterQueryCheck.clickDelay'(findTestObject('SzukajPage/SearchBar/searchBar-typ-transportu__wybierz'), 
//    timeout)
//
//CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[1])
//
//CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[2])
//
//WebUI.delay(timeout)
//
//WebUI.click(findTestObject('SzukajPage/SearchBar/TypTransportu/usunTypTransportu'))
//
//WebUI.delay(timeout)
//
//CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(1, transportation[0])

WebUI.closeBrowser()

