

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン画面</title>
    </head>
    <body>
                <h1><form action="/challenge_project/Challenge18_13login" method = post>
                    ユーザーの方はこちらから<br>
                    ユーザーIDを入力してください<br>
                    <input type="text" name="txtID"><br>  
                    お名前を入力してください<br>
                    <input type="text" name="txtName"><br>
                    <input type="submit" name="btnsubmit" value="ログインする">
                     </form>
                    <br>
                    <br>
                    <form action="" method= post>
                    新規登録の方はこちらから<br>
                    新規ユーザーIDを入力してください<br>
                    <input type="text" name="txtNewID"><br>  
                    お名前を入力してください<br>
                    <input type="text" name="txtNewName"><br>
                    <input type="submit" name="btnsubmit" value="登録する">                
            </form></h1>
    </body>
</html>
