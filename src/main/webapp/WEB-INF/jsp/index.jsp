<!DOCTYPE HTML>
<html>
<head>
    <link href="${pageContext.request.contextPath}/main.css" rel="stylesheet" >
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <meta charset="UTF-8" />
    <title>Blink App</title>

</head>
<body>
<h1><b>Blink App</b></h1>
<div class="wrapper">
    <form id="form1" action="/" method="post">
        <div>
            <p><b>First number :</b></p>
            <input type="number" id="number1" placeholder="1" defaultValue = "1" value="1" class="form-control" name="a"></input>
            <br/>
            <p><b>Second number :</b></p>
            <input type="number" id="number2" placeholder="1" defaultValue = "1" value="1" class="form-control" name="b"></input>
            <br/>
            <br/>
        </div>
        <div >
            <button type="submit"  name="button1" id="button1"  class="button button1"> + </button>
            <button type="submit" name="button2" id="button2" class="button button2"  > - </button>
        </div>

    </form>
    <script type="text/javascript" src="${pageContext.request.contextPath}/main.js"></script>
    <div class="yellowRectangle" id="pulse" />
    </div>

</div>

</body>

</html>