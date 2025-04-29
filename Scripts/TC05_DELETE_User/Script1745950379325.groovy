import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// Kirim request
def response = WS.sendRequest(findTestObject('TC05_DELETE_User'))

// Verifikasi status code
WS.verifyResponseStatusCode(response, 204)
