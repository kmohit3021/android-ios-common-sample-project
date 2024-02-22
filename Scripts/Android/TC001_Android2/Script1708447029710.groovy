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

Mobile.startExistingApplication('com.meesho.supply')

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button - Allow'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Categories'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Ethnic Jackets'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - High Quality (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - New Arrival (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button - Add to Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.CompoundButton - XXL'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button - Add to Cart (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.Button - NONE OF THE ABOVE'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView (2)'), 0)

Mobile.closeApplication()

