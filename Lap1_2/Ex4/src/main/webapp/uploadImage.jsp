<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Upload file</title>
</head>
<body>
<h1>Upload multi-files</h1>
<form method="post" action="upload-servlet" enctype="multipart/form-data" id="form1">
    <h3>Choose files to upload...</h3>
    <input type="file" name="file1"/><br><br>
    <input type="file" name="file2"/><br><br>
    <input type="file" name="file3"/><br><br>
    <input type="submit"/>
    <input type="button" value="Reset" onclick="refresh()"/>
</form>


<form method="post" action="uploadsingle-servlet" enctype="multipart/form-data" id="form2">
    <h3>Choose files to upload...</h3>
    <input type="file" name="file"/><br><br>
    <input type="submit"/>
    <input type="button" value="Reset" onclick="refresh1()"/>
</form>
</body>
</html>

<script>
    function refresh() {
        document.getElementById("form1").reset();
    }
    function refresh1() {
        document.getElementById("form2").reset();
    }
</script>
