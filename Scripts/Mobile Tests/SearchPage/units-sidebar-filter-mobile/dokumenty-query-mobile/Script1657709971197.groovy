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

System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());

Map<String, String> mobileEmulation = new HashMap<>();

mobileEmulation.put("deviceName", GlobalVariable.mobileDevice);

ChromeOptions chromeOptions = new ChromeOptions();

chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

WebDriver driver = new ChromeDriver(chromeOptions);

DriverFactory.changeWebDriver(driver);

driver.navigate().to('https://r.pl/szukaj');

WebUI.click(findTestObject('Object Repository/SzukajPage/ZamknijCiastka'))

WebUI.click(findTestObject('Object Repository/Mobile Objects/SearchPage/filtry-boczne/pokaz-filtry-mobile-btn'))

WebUI.enableSmartWait()

WebUI.comment('Dokumenty')

WebUI.scrollToElement(findTestObject('Mobile Objects/SearchPage/filtry-boczne/udogodnienia/W-blisko centrum'), 0)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/dokumenty/Bez paszportu'), timeout, 
    8, dokumenty[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('Mobile Objects/SearchPage/filtry-boczne/dokumenty/Bez wizy'), timeout, 
    8, dokumenty[1])

WebUI.closeBrowser()

