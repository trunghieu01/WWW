<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register</h1>
<form method="get/post" action="register-servlet" name="registrationForm">
    <div class="form-group row">
        <label for="name" class="col-md-4 col-3 col-form-label text-md-right">Họ và tên</label>

        <div class="col-md-8 col-9">
            <input id="name" type="text" class="form-control  form-control-sm " name="name" value=""
                   autocomplete="name" autofocus>
        </div>
    </div>

    <div class="form-group row">
        <label class="col-md-4 col-3 col-form-label text-md-right">Email</label>

        <div class="col-md-8 col-9">
            <input id="email" type="email" class="form-control  form-control-sm " name="email" value=""
                    autocomplete="email">

        </div>
    </div>
    <div class="form-group row">
        <label class="col-md-4 col-3 col-form-label text-md-right">Điện thoại</label>

        <div class="col-md-8 col-9">
            <input id="tel" maxlength="10" class="form-control form-control-sm " type="number" name="tel" >
        </div>
    </div>

    <div class="form-group row">
        <label class="col-md-4 col-3 col-form-label text-md-right">Mật khẩu</label>

        <div class="col-md-8 col-9">
            <input id="password" type="password" class="form-control form-control-sm " name="password" >
        </div>
    </div>

    <div class="form-group row">
        <label for="password-confirm" class="col-md-4  col-3 col-form-label text-md-right">Nhập lại Mật khẩu</label>

        <div class="col-md-8 col-9">
            <input id="password-confirm" type="password" class="form-control form-control-sm"
                   name="password_confirmation" >
        </div>
    </div>
    <div class="form-group row ">
        <div class="col-md-12  text-center">
            <button type="submit" id="submit" class="btn btn-sm btn-primary">
                Đăng ký tài khoản
            </button>
        </div>

    </div>
    <br>
    <br>
    <br>
    <a href="uploadImage.jsp">Go to file upload page</a>
    <br>
    <a href="sendEmail.jsp">Go to send Email page</a>
</form>

</body>
</html>