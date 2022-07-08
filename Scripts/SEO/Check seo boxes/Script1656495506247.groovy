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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.net.httpserver.Authenticator.Failure as Failure
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseUrl + slug)

if(WebUI.verifyElementClickable(findTestObject('SeoContentSearchPage/zamknijCiastka'), FailureHandling.OPTIONAL)){
	WebUI.click(findTestObject('SeoContentSearchPage/zamknijCiastka'))
} else {
//	KeywordUtil.markFailedAndStop('Prawdopodobnie 404')
	KeywordUtil.markFailedAndStop('Prawdopodobnie 404')
}


WebUI.comment('Sekcja seo')

if(!WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/content-bluebg-section'), 1, FailureHandling.OPTIONAL)){
	KeywordUtil.markFailedAndStop('Brak sekcji z treścią SEO dla: ' + destination)
}

WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/content-bluebg-section'), 1)

WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/content-bluebg-section'))

WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/content-seo-container'), 1)

WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/content-seo-container'))

WebUI.comment('Elementy sekcji')

WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-content-general'), 1)

WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-content-general'))

WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-box'), 1)

WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-box'))

WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-articles'), 1)

WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-articles'), 1)

WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-opinions'))

WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-opinions'))

WebUI.comment('Nazwa kraju/miejsca')

WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-box__place'), 1)

WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-box__place'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('SeoContentSearchPage/destination-box__place'), destination)

WebUI.comment('Pierwszy element akordeonu')

WebUI.scrollToElement(findTestObject('SeoContentSearchPage/content-bluebg-section'), 1)

if (WebUI.verifyElementNotPresent(findTestObject('SeoContentSearchPage/destination-akordeon-2'), 2, FailureHandling.OPTIONAL) == 
false) {
    WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-akordeon-2'), 1)

    WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-akordeon-2'))

    WebUI.click(findTestObject('SeoContentSearchPage/destination-akordeon__first-element'))

    WebUI.waitForElementPresent(findTestObject('SeoContentSearchPage/destination-akordeon__first-para'), 1)

    WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-akordeon__first-para'), 1)

    WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-akordeon__first-para'), FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('SeoContentSearchPage/destination-oldAkordeon'), 1)

    WebUI.verifyElementVisible(findTestObject('SeoContentSearchPage/destination-oldAkordeon'))
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

