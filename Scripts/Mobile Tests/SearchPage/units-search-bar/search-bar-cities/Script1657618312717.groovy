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

WebUI.click(findTestObject('SzukajPage/ZamknijCiastka'))

WebUI.click(findTestObject('Mobile Objects/SearchPage/buttony-szukaj-mobile/szukaj-show-options'))

WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/MiastoWylotu/searchBar-skadkolwiek'))

WebUI.delay(timeout)

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Bydgoszcz'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Gdask'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Katowice'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Krakw'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Lodz'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Poznan'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Rzeszow'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Szczecin'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_WarszawaChopin'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_WarszawaModlin'))

WebUI.click(findTestObject('SzukajPage/SearchBar/MiastoWylotu/span_Wroclaw'))

WebUI.click(findTestObject('Object Repository/SzukajPage/SearchBar/MiastoWylotu/searchBar-skadkolwiek-wybierz'))

WebUI.delay(timeout)

WebUI.verifyElementText(findTestObject('Object Repository/SzukajPage/SearchBar/MiastoWylotu/searchBar-ilosc-lotnisk'), '11 lotnisk')

WebUI.delay(timeout)

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[0])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[1])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[2])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[3])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[4])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[5])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[6])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[7])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[8])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[9])

CustomKeywords.'search.filterQueryCheck.checkSearchBarQuery'(0, miasta[10])

WebUI.closeBrowser()

