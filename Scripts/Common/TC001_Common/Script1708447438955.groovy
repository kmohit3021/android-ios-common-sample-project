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

String objCommonPath = null

if (Mobile.getDeviceOS().equalsIgnoreCase('Android')) {
    Mobile.startExistingApplication('com.meesho.supply')

    objCommonPath = 'Object Repository/Common/Android/'
} else {
    Mobile.startExistingApplication('com.meesho.Meesho')

    objCommonPath = 'Object Repository/Common/iOS/'
}

Mobile.tap(findTestObject(objCommonPath + 'LanguageChange - English'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'Button - Allow'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'TextView - Categories'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'TextView - Men'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'TextView - Ethnic Jackets'), 10, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject(objCommonPath + 'TextView - High Quality'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject(objCommonPath + 'TextView - New Arrival'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'Obj - ImageView'), 10, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject(objCommonPath + 'Button - Add to Cart'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'CompoundButton - XXL'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'Button - Add to Cart 2'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject(objCommonPath + 'Button - NONE OF THE ABOVE'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject(objCommonPath + 'Obj - Filter close'), FailureHandling.OPTIONAL)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication(FailureHandling.STOP_ON_FAILURE)

