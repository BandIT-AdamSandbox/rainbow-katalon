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

WebUI.comment('Tematyka')

WebUI.click(findTestObject('SzukajPage/SidebarFilters/tematyka-filter-akordeon'))

WebUI.waitForElementClickable(findTestObject('SzukajPage/SidebarFilters/filter12-1'), 0)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-1'), timeout, 
    11, tematyka[0])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-2'), timeout, 
    11, tematyka[1])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-3'), timeout, 
    11, tematyka[2])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-4'), timeout, 
    11, tematyka[3])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-5'), timeout, 
    11, tematyka[4])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-6'), timeout, 
    11, tematyka[5])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-7'), timeout, 
    11, tematyka[6])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-8'), timeout, 
    11, tematyka[7])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-9'), timeout, 
    11, tematyka[8])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-10'), timeout, 
    11, tematyka[9])

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-11'), timeout, 
    11, tematyka[10])

WebUI.delay(2)

CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-12'), timeout, 
    11, tematyka[11])

//CustomKeywords.'search.filterQueryCheck.clickFilterUnclick'(findTestObject('SzukajPage/SidebarFilters/filter12-11'), timeout, 
//    11, tematyka[12])
WebUI.closeBrowser()

