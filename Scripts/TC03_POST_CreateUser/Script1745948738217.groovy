import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('TC03_POST_CreateUser', [
  ('name') : 'maya',
  ('job') : 'qa'
]))

WS.verifyResponseStatusCode(response, 201)
WS.comment(response.getResponseText())
