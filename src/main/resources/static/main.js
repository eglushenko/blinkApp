$("#form1").submit(function(event){
    event.preventDefault();
    var post_url = $(this).attr("action");
    var request_method = $(this).attr("method");
    var clickedButton = $(document.activeElement).attr('name');
    var form_data = $(this).serialize() + '&button=' + clickedButton;
    //alert(clickedButton);
    $.ajax({
        url : post_url,
        type: request_method,
        data : form_data
    }).done(function(response){
        var obj = jQuery.parseJSON( response );
        var re = obj.var;
        // alert(re);
        if(re > 0){
            var myVar;
            myVar = setInterval(blink, 500);
            var stopSec = re*1000;
            function blink() {
                var curBgC = document.getElementById("pulse").style.background;
                if(clickedButton==="button1"){
                    document.getElementById("pulse").style.background = curBgC === "green" ? "yellow" : "green";
                }else{
                    document.getElementById("pulse").style.background = curBgC === "red" ? "yellow" : "red";
                }

            }
            setTimeout(function () {
                $("#pulse").css('visibility', 'visible');
                clearInterval(myVar);
            }, stopSec);
        }

    });

});