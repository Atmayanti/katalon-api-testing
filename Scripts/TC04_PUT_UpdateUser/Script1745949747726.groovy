import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('Object Repository/TC04_PUT_UpdateUser'))
WS.verifyResponseStatusCode(response, 200)
def json = new groovy.json.JsonSlurper().parseText(response.getResponseText())
assert json.name == "atmayanti"
assert json.job == "qa lead"
