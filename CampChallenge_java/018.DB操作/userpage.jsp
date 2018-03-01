

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ユーザーページ</title>
    </head>
    <body>
        <h1>ようこそ!${"loginUser"}}
            <br>
            <br>
            新たに商品情報を登録する<br>
            <form action="./addProduction.jsp" method="post">
            <input type="text" name="inputProID" value="商品ID"><br>
            <input type="text" name="inputProName" value="商品の名前"><br>
            <input type="submit" name="btnsubmit" value="登録する"><br>
            </form>
            <br>
            <br>
            商品情報一覧<br>
            <form action="./productionInformation.jsp" method="post"><br>
            <input type="submit" name="btnsubmit" value="確認する"><br>
            </form>
            <br>
            ログアウトはこちら
            <form action="/challenge_project/Challenge18_13logout" method= "post">
            <input type="submit" name="btnsubmit" value="ログアウトする"><br>    
            </form>
            </h1>
    </body>
</html>
