var todayHigh = 24
var todayLow = 18
var tomorrowHigh = 27
var tomorrowLow = 19
var fridayHigh = 21
var fridayLow = 16
var saturdayHigh = 26
var saturdayLow = 21


function acceptCookies() {
    document.querySelector(".cookie-box").remove();
}
function convertToFarenheit() {
    todayHigh = todayHigh * 1.8 + 32;
    Math.floor(todayHigh);
    document.querySelector("#today-weather-high").innerText = todayHigh + "°"
}