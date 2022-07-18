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

WebUI.navigateToUrl('https://r.pl/')

WebUI.waitForPageLoad(timeout)

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/footer-sekcja'), timeout)

WebUI.verifyElementPresent(findTestObject('HomePage/Footer/footer-subsekcja-gorna'), timeout)

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/span_Call center'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/span_Call center'), 'Call center')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/span_Mail'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/span_Mail'), 'Mail')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/span_Biura Rainbow'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/span_Biura Rainbow'), 'Biura Rainbow')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/newsletter-box'), timeout)

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/input_email'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/HomePage/Footer/input_email'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/input_btn'), timeout)

WebUI.verifyElementClickable(findTestObject('Object Repository/HomePage/Footer/input_btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/footer-subsekcja-dolna'), timeout)

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/span_O nas'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/span_O nas'), 'O nas')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/span_Dla klientw'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/span_Dla klientw'), 'Dla klientów')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/span_Zasady korzystania'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/span_Zasady korzystania'), 'Zasady korzystania')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/h2_Kanay patnoci'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/h2_Kanay patnoci'), 'Kanały płatności')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/span_Usugi dodatkowe'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/span_Usugi dodatkowe'), 'Usługi dodatkowe')

WebUI.verifyElementPresent(findTestObject('Object Repository/HomePage/Footer/h2_Social media'), timeout)

WebUI.verifyElementText(findTestObject('Object Repository/HomePage/Footer/h2_Social media'), 'Social media')

WebUI.closeBrowser()

