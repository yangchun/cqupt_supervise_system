<html>
<body>
<h2>Hello World!</h2>
<input type="button" value="test1" onclick="A()"/>
<input type="button" value="test2" onclick="B()"/>
<script src="js/jquery-2.1.1.js"></script>
<script>
    function A(){
        $.ajax({
            url: '/userController/test',
            dataType: 'json',
            type: 'POST',
            xhrFields: {
                withCredentials: true
            },
            crossDomain: true,
            contentType: "application/json",
            success: function (data) {

            },
            error: function () {

            }
        });
    }
    function B(){
        $.ajax({
            url: '/userController/getCookies',
            dataType: 'json',
            type: 'POST',
            xhrFields: {
                withCredentials: true
            },
            crossDomain: true,
            contentType: "application/json",
            success: function (data) {

            },
            error: function () {

            }
        });
    }


</script>
</body>
</html>
