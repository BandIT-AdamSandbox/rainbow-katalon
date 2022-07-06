package search

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
// Katalon imports
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
// Java types
import java.util.HashMap;
import java.util.ArrayList;

public class filterQueryCheck {
	@Keyword
	def checkIfFilterPresentInQuery(Integer filterIndex, String filterValue) {
		String url = WebUI.getUrl()
		// Maybe bring up as a class property instead of being inside function
		ArrayList<String> filtersQueryKeys = new ArrayList<String>();
		// Aside filters
		filtersQueryKeys.add(0, 'wyzywienia[]=');
		filtersQueryKeys.add(1, 'dlugoscPobytu[]=');
		filtersQueryKeys.add(2, 'typyWyjazdu[]=');
		filtersQueryKeys.add(3, 'cena[]=');
		filtersQueryKeys.add(4, 'standardHotelu[]=');
		filtersQueryKeys.add(5, 'ocenaKlientow[]=');
		filtersQueryKeys.add(6, 'sezon[]=');
		filtersQueryKeys.add(7, 'atrybutUdogodnienia_AtrybutPolozenie[]=');
		filtersQueryKeys.add(8, 'atrybutWymaganeDokumenty[]=');
		filtersQueryKeys.add(9, 'atrybutCharakterystyka[]=');
		filtersQueryKeys.add(10, 'atrybutPokoj[]=');
		filtersQueryKeys.add(11, 'atrybutTematyka[]=');
		filtersQueryKeys.add(12, 'promocja[]=');
		// Header search bar filters
		filtersQueryKeys.add(13, 'miasta[]=');
		filtersQueryKeys.add(14, 'typTransportu[]=');
		String stringToCheck = filtersQueryKeys.get(filterIndex) + filterValue
		if(url.contains(stringToCheck)) {
			return;
		} else {
			KeywordUtil.markFailedAndStop('Nieprawidłowe query w linku: ' + stringToCheck + 'dla linku: ' + url);
		}
	}

	@Keyword
	def checkSearchBarQuery(Integer filterIndex, String filterValue) {
		String url = WebUI.getUrl()
		// Maybe bring up as a class property instead of being inside function
		ArrayList<String> searchBarQueryKeys = new ArrayList<String>();
		// Header search bar query
		searchBarQueryKeys.add(0, 'miasta[]=');
		searchBarQueryKeys.add(1, 'typTransportu[]=');
		String stringToCheck = searchBarQueryKeys.get(filterIndex) + filterValue
		if(url.contains(stringToCheck)) {
			return;
		} else {
			KeywordUtil.markFailedAndStop('Nieprawidłowe query w linku: ' + stringToCheck);
		}
	}

	@Keyword
	def clickFilterUnclick(TestObject object, Integer delay, Integer filterIdx, String filterValue) {
		WebUI.click(object)
		WebUI.delay(delay)
		checkIfFilterPresentInQuery(filterIdx, filterValue)
		WebUI.click(object)
		WebUI.delay(delay)
	}

	@Keyword
	def clickFilterOnce(TestObject object, Integer delay, Integer filterIdx, String filterValue) {
		WebUI.click(object)
		WebUI.delay(delay)
		checkIfFilterPresentInQuery(filterIdx, filterValue)
		WebUI.delay(delay)
	}

	@Keyword
	def clickDelay(TestObject object, Integer delay) {
		WebUI.click(object)
		WebUI.delay(delay)
	}
}
