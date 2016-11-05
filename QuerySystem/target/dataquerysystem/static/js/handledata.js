$(document).ready(function () {

    $(".atn-ms").click(function () {
        // alert($(this).parent().parent().children(":first").text());
        $("#postForm").attr("action","/ms?sdbsno="+$(this).parent().parent().children(":first").text());
        $('#postForm').submit();
    });

    $(".atn-cnmr").click(function () {
        $("#postForm").attr("action","/cnmr?sdbsno="+$(this).parent().parent().children(":first").text());
        $('#postForm').submit();
    });

    $(".atn-hnmr").click(function () {
        $("#postForm").attr("action","/hnmr?sdbsno="+$(this).parent().parent().children(":first").text());
        $('#postForm').submit();
    });

    $(".atn-ir").click(function () {
        $("#postForm").attr("action","/ir?sdbsno="+$(this).parent().parent().children(":first").text());
        $('#postForm').submit();
    });

    $(".atn-raman").click(function () {
        $("#postForm").attr("action","/raman?sdbsno="+$(this).parent().parent().children(":first").text());
        $('#postForm').submit();
    });

    $(".atn-esr").click(function () {
        $("#postForm").attr("action","/esr?sdbsno="+$(this).parent().parent().children(":first").text());
        $('#postForm').submit();
    });


});