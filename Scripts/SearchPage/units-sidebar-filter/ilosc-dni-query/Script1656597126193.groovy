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

WebUI.navigateToUrl('https://r.pl/szukaj')

WebUI.click(findTestObject('Object Repository/SzukajPage/ZamknijCiastka'))

WebUI.enableSmartWait()

WebUI.comment('Ilość dni')

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-1'), timeout,
    1, iloscDni[0])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-2'), timeout, 
    1, iloscDni[1])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-3'), timeout, 
    1, iloscDni[2])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-4'), timeout, 
    1, iloscDni[3])

CustomKeywords.'search.filterQueryCheck.clickFilterOnce'(findTestObject('SzukajPage/SidebarFilters/filter2-5-default'), timeout, 
    1, iloscDni[4])

WebUI.closeBrowser()

