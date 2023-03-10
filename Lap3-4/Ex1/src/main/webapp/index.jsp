<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="register-servlet" name="form-Register" enctype="multipart/form-data">

    <label for="firstname" style="width: 90px; display: inline-block">First name:</label>
    <input type="text" id="firstname" name="firstname"><br><br>

    <label for="lastname" style="width: 90px; display: inline-block">Last name:</label>
    <input type="text" id="lastname" name="lastname"><br><br>

    <label for="birthday" style="width: 90px; display: inline-block">Day of birth:</label>
    <input type="date" id="birthday" name="birthday"><br><br>

    <label for="email" style="width: 90px; display: inline-block">Email:</label>
    <input type="text" id="email" name="email"><br><br>

    <label for="phone" style="width: 90px; display: inline-block">Phone:</label>
    <input type="tel" maxlength=10 id="phone" name="phone"><br><br>

    <label style="width: 90px; display: inline-block">Gender:</label>
    <input type="radio" id="male" name="gender" value="Male">Male
    <input type="radio" id="female" name="gender" value="Female">Female<br><br>

    <label for="address" style="width: 90px; display: inline-block">Address:</label>
    <input type="text" id="address" style="height: 50px" name="address"><br><br>

    <label for="city" style="width: 90px; display: inline-block">City:</label>
    <input type="text" id="city" name="city"><br><br>

    <label for="pin" style="width: 90px; display: inline-block">Pin-code:</label>
    <input type="number" id="pin"><br><br>

    <label for="state" style="width: 90px; display: inline-block">State:</label>
    <input type="text" id="state" name="state"><br><br>

    <label for="country" style="width: 90px; display: inline-block">Country:</label>
    <input type="text" id="country" name="country"><br><br>

    <label style="width: 90px; display: inline-block">Hobbies:</label>
    <input type="checkbox" name="hobbies" value="Drawing">Drawing
    <input type="checkbox" name="hobbies" value="Singing">Singing
    <input type="checkbox" name="hobbies" value="Dancing">Dancing
<%--    <input type="text" id="other" name="hobbies">Other<br><br>--%>

    <label for="qualification" style="width: 90px; display: inline-block;float: left">Qualification:</label>
    <table id="qualification" style="float: end; border-collapse: collapse">
        <tr>
            <th style="width: 120px;  text-align: start">Examination</th>
            <th style="width: 120px;">Board</th>
            <th style="width: 120px;">Percentage</th>
            <th style="width: 120px">Year of Passing</th>
        </tr>
        <tr>
            <td style="width: 120px; font-weight: bold">Class X</td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true" id="x-board"></td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true" id="x-percentage"></td>
            <td style="width: 100px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true" id="x-yearPass"></td>
        </tr>
        <tr>
            <td style="width: 120px; font-weight: bold">Class XII</td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
        </tr>
        <tr>
            <td style="width: 120px; font-weight: bold;">Graduation</td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
        </tr>
        <tr>
            <td style="width: 120px; font-weight: bold">Masters</td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
            <td style="width: 120px; text-align: center; border: 1px solid black; border-collapse: collapse"
                contenteditable="true"></td>
        </tr>
    </table>

    <label style="width: 90px; display: inline-block;float: none">Course applies for:</label>
    <label for="BCA">BCA</label>
    <input type="radio" id="BCA" name="Course-applies">
    <label for="B.Com">B.Com</label>
    <input type="radio" id="B.Com" name="Course-applies">
    <label for="B.Sc">B.Sc</label>
    <input type="radio" id="B.Sc" name="Course-applies">
    <label for="B.A">B.A</label>
    <input type="radio" id="B.A" name="Course-applies"><br><br>

    <button type="submit">Submit</button>
    <button type="reset">Reset</button>
</form>
</body>
</html>