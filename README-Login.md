# MicroBlaug User Profile/Login-Signup feature

# API Documentation

## Authentication
`POST /login`

Allows the user to log in. When a user logs in successfully, the server will generate an HTTP Session that contains the user credentials.
(cookie-based authorization)

`POST /signup`
<!-- GET? -->
Allows a new user to sign up to the MicroBlaug website. A new user will have to enter a username, email, and password to sign up. The server will generate an HTTP Session that will save the new user's credentials to the user db.

### Request
Request Body Sign up
```json
{
    "username": "luke_skywalker",
    "email": "jedi1@rebelalliance.com",
    "password": "pass1234"
}
```

### Response
Response Body Sign up (if successful)
```json
{
    "user_id": 1,
    "username": "luke_skywalker",
    "email": "jedi1@rebelalliance.com",
    "password": "pass1234"
}
```

Response Body (if not successful)
```json
{
    "message": "Please fill in all fields"
}

```
### Request
Request Body Log in
```json
{
    "username": "luke_skywalker",
    "password": "pass1234"
}
```

### Response
Response Body Log in (if successful)
```json
{
    "user_id": 1,
    "username": "luke_skywalker",
    "email": "jedi1@rebelalliance.com",
    "password": "pass1234",
    "interest": "hunting"
}
```

Response Body (if not successful)
```json
{
    "message": "Invalid Log in Information"
}

```

Status Codes
| Status Code | Description |
| :---------- | :---------- |
| 200 OK | Successfully logged in |
| 201 OK | Sucessfully Created new user |
| 204 NO CONTENT | Response body is empty |
| 400 BAD REQUEST | Invalid credentials|
| 401 UNAUTHORIZED | User is not authorized to access a particular resource |
| 404 NOT FOUND | A resource requested was not found |

