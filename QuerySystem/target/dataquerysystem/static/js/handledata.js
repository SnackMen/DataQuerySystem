$(document).ready(function () {
    $(".atn-ms").click(function () {
        $("#postForm").attr("action","/ms?sdbsno="+$("#id").text());
        $('#postForm').submit();
    });

    $(".atn-cnmr").click(function () {
        $("#postForm").attr("action","/cnmr?sdbsno="+$("#id").text());
        $('#postForm').submit();
    });

    $(".atn-hnmr").click(function () {
        $("#postForm").attr("action","/hnmr?sdbsno="+$("#id").text());
        $('#postForm').submit();
    });

    $(".atn-ir").click(function () {
        $("#postForm").attr("action","/ir?sdbsno="+$("#id").text());
        $('#postForm').submit();
    });

    $(".atn-raman").click(function () {
        $("#postForm").attr("action","/raman?sdbsno="+$("#id").text());
        $('#postForm').submit();
    });

    $(".atn-esr").click(function () {
        $("#postForm").attr("action","/esr?sdbsno="+$("#id").text());
        $('#postForm').submit();
    })
});