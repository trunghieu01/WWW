<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <style>
        body{
            display: flex;
        }
        form {
            margin: 0 auto;
            width: 400px;
            text-align: center;
        }

        div {
            display: flex;
            margin-top: 20px;
            justify-content: space-between;
        }

        input {
            width: 400px;
        }
        #radio{
            display: block;
        }
    </style>
</head>
<body>
<form action="ChangePasswordServlet" enctype="multipart/form-data">
    <h1>Register Form</h1>
    <div>
        <input type="text" style="width: 190px;" placeholder="First Name" name="firstName">
        <input type="text" style="width: 190px;" placeholder="Last Name" name="lastName">
    </div>
    <div>
        <input type="text" placeholder="Email" name="email">
    </div>
    <div>
        <input type="text" placeholder="Re-enter Email">
    </div>
    <div>
        <input type="text" placeholder="New Password" name="password">
    </div>
    <div id="radio">
        <input type="radio" style="width: 30px;" value="Male" name="gender">Male
        <input type="radio" style="width: 30px;" value="Female" name="gender">Female
    </div>
    <div>
        <button type="submit">Sign up</button>
    </div>
</form>
</body>
</html>