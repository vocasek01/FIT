<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h1>JAX-RS Upload Form</h1>

<form action="examples/file/upload" method="post" enctype="multipart/form-data">

    <p>
        Select a file : <input type="file" name="uploadedFile" size="50" />
    </p>

    <input type="submit" value="Upload It" />
</form>

</body>
</html>