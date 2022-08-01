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

WebUI.comment('Tematyka')

WebUI.scrollToElement(findTestObject('Mobile Objects/SearchPage/filtry-boczne/akordeon-btn/Tematyka-akordeon'), 2)

WebUI.click(findTestObject('Mobile Objects/SearchPage/filtry-boczne/akordeon-btn/Tematyka-akordeon'))

WebUI.waitForElementClickable(findTestObject('SzukajPage/SidebarFilters/filter12-1'), 4)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/City Break'), 
    timeout, 11, tematyka[0])

WebUI.scrollToElement(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/City Break'), 2)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Egzotyka'), 
    timeout, 11, tematyka[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Egzotyka light'), 
    timeout, 11, tematyka[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Europa i Orient'), 
    timeout, 11, tematyka[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Kuchnia i wino'), 
    timeout, 11, tematyka[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Parki rozrywki'), 
    timeout, 11, tematyka[5])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Poza utartym szlakiem'), 
    timeout, 11, tematyka[6])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Rejs statkiem'), 
    timeout, 11, tematyka[7])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Smak przygody'), 
    timeout, 11, tematyka[8])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Sylwester'), 
    timeout, 11, tematyka[9])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Zainteresowania i hobby'),
	timeout, 11, tematyka[10])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/tematyka/Wycieczki objazdowe premium'),
	timeout, 11, tematyka[11])

WebUI.closeBrowser()

