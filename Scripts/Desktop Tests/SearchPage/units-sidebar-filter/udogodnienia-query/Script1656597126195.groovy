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

WebUI.comment('Udogodnienia')

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-1'), timeout, 
    7, udogodnienia[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-2'), timeout, 
    7, udogodnienia[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-3'), timeout, 
    7, udogodnienia[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-4'), timeout, 
    7, udogodnienia[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-5'), timeout, 
    7, udogodnienia[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-6'), timeout, 
    7, udogodnienia[5])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-7'), timeout, 
    7, udogodnienia[6])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-8'), timeout, 
    7, udogodnienia[7])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-9'), timeout, 
    7, udogodnienia[8])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter8-10'), timeout, 
    7, udogodnienia[9])

WebUI.closeBrowser()

