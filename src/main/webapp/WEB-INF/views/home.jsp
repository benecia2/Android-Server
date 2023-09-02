<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert</title>
    <!-- Bootstrap CSS link (assuming you're using Bootstrap) -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="jumbotron jumbotron-fluid">
    <div class="container">
        <h1>Insert</h1>
    </div>
</div>

<div class="container">
    <form action="fileInsert" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label for="pname">폐기물명:</label>
            <input type="text" class="form-control" id="pname" name="pname">
        </div>
        
        <div class="form-group">
            <label for="category">이미지파일명(영문):</label>
            <input type="text" class="form-control" id="pname2" name="pname2">
        </div>

        <div class="form-group">
            <label for="category">카테고리:</label>
            <input type="text" class="form-control" id="category" name="category">
        </div>

        <div class="form-group">
            <label for="pclass">폐기물 구분:</label>
            <input type="text" class="form-control" id="pclass" name="pclass">
        </div>

        <div class="form-group">
            <label for="pcontent1">버리는 방법:</label>
            <textarea class="form-control" rows="5" id="pcontent1" name="pcontent1"></textarea>
        </div>

        <div class="form-group">
            <label for="pcontent2">알면 더 도움되는 팁:</label>
            <textarea class="form-control" rows="5" id="pcontent2" name="pcontent2"></textarea>
        </div>

        <div class="form-group">
            <label for="img">이미지:</label>
            <input type="file" class="form-control-file" id="img" name="upload" required="required">
        </div>

        <button type="submit" class="btn btn-primary">File Submit</button>
    </form>
</div>

<!-- Bootstrap JS scripts (assuming you're using Bootstrap) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>


</div>


</body>
</html>