/**
 * Created by Solomiya on 29.09.2017.
 */
console.log("hello");

$("#show").click(function () {
    $.ajax({
        url: '/show',
        type: 'GET',
        success: function (response) {
            $("#showAll").empty();
            console.log(response);
            for (let i=0; i<response.length; i++){
                $('<p/>', {text:response[i].name}).appendTo("#showAll");
            }
        },
        error: function () {
            alert("no");
        }

    })
})


$('#save').click(function () {
   var name = $('input').val();
   var user = {name: name};
   console.log(name);
   $.ajax({
       url: '/saveUser',
       type: 'POST',
       data: JSON.stringify(user),
       contentType: 'application/json',
        success: function (/*data*/) {
           $('input').val("");
            /* або
            $('input').reset;*/
            /*alert(data.name);*/
        },

    error: function () {
        alert("Noooo")
    }
   })

})
