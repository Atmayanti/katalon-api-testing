# API Testing with Katalon Studio

This repository contains automated API test cases developed using **Katalon Studio**. The tests cover several RESTful endpoints using both positive and negative scenarios.

---

## 📁 Project Structure

- `Test Cases/TC01_GET_ListUsers`
- `Test Cases/TC02_GET_SingleUser`
- `Test Cases/TC03_POST_CreateUser`
- `Test Cases/TC04_PUT_UpdateUser`
- `Test Cases/TC05_DELETE_User`
- `Test Cases/TC06_GET_SingleUserNotFound`

Each test case corresponds to a specific HTTP method and behavior, including expected responses and validations.

---

## ✅ Covered Test Scenarios

| Test Case ID | Description                          | Method | Status Code |
|--------------|--------------------------------------|--------|-------------|
| TC01         | Get list of users                    | GET    | 200 OK      |
| TC02         | Get single user                      | GET    | 200 OK      |
| TC03         | Create a new user                    | POST   | 201 Created |
| TC04         | Update existing user                 | PUT    | 200 OK      |
| TC05         | Delete a user                        | DELETE | 204 No Content |
| TC06         | Get user not found (negative case)   | GET    | 404 Not Found |

---

## 🔧 Tools Used

- [Katalon Studio](https://katalon.com/)
- [Git](https://git-scm.com/)
- [GitHub](https://github.com/)
- API Endpoint: [Reqres.in](https://reqres.in)

---

## 🚀 How to Run

1. Open Katalon Studio.
2. Clone or open this project.
3. Select a test case from the Test Explorer.
4. Click the **Run** button to execute.

---

## 🧪 Tips

- JSON payloads are used for `POST` and `PUT` methods.
- Dynamic variables and response verification scripts are included.
- Make sure Katalon Studio is connected to the internet to access external APIs.

---

## 📌 Notes

- All tests are based on public dummy API: https://reqres.in
- The project can be extended to support authentication and chained API testing.
