import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonSlurper

// Kirim request
def response = WS.sendRequest(findTestObject('TC01_GET_ListUsers'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 200)

// Parsing JSON
def json = new groovy.json.JsonSlurper().parseText(response.getResponseText())

// Validasi data
assert json.page == 2
assert json.data != null
