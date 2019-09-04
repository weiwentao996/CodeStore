$(document).ready(function () {
    $(".menu").hover(function () {
        $(this).find(".droup").hide()
        $(this).css("background", "background:rgba(0,0,0,0.2)")
    })
    $(".menu").mouseover(function () {
        $(this).find(".droup").show()
        $(this).css("background", "background:rgba(0,0,0,0.5)")
    })
});



