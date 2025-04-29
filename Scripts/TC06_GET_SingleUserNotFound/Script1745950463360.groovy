import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager
import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

// Send request
def response = WS.sendRequest(findTestObject('TC06_GET_SingleUserNotFound'))

// Verify response status code = 404
WS.verifyResponseStatusCode(response, 404)
