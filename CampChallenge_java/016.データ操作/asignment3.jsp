

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>占い結果</title>
    </head><body background ="http://season-freeillust.com/img/summer-haikei/02.jpg">
    <body>
        <h1>
            <%
            request.setCharacterEncoding("UTF-8");
            out.print(request.getParameter("horoscope")+"で"+request.getParameter("blood")+"な"+
                    request.getParameter("txtname")+"さんの運勢は大吉です!!"+"<br>"+
                    "おめでとうございます!"+"<br>");
            %>
            
            <p>
            <img src="http://www.artbank.co.jp/stockillust/vol8_image/miraikobo/1-B-AMG894.jpg"><br>
            <br>
            <br>
            
        詳しい占い結果を知りたい場合は<strong>メールアドレス</strong>を記入してください<br>
        詳細をお送りします
        <form action="./abc.def" method="post">
　　　　　<p><label>メールアドレス：<input type="email" name="emailaddress" size="15" maxlength="40"></label></p>
　　　　　<p><input type="submit" value="送信する"></p>
　　　　　</form></h1>
          　
    </body>
</html>
