console.log("page loaded...");
var badgePlus = 500
var connectionRequests = 2

function changeName() {
    document.querySelector('#profile-name').innerText = "any other name";
}

function acceptConnectionTodd(element) {
    badgePlus ++;
    connectionRequests --;
    document.querySelector("#remove-me-todd").remove();
    document.querySelector(".badge").innerText = connectionRequests
    document.querySelector("#connections-badge").innerText = badgePlus;
}
function declineConnectionTodd(element) {
    connectionRequests --;
    document.querySelector("#remove-me-todd").remove();
    document.querySelector(".badge").innerText = connectionRequests
    // document.querySelector("#connections-badge").innerText = badgePlus;
}
function acceptConnectionPhil(element) {
    badgePlus ++;
    connectionRequests --;
    document.querySelector("#remove-me-phil").remove();
    document.querySelector(".badge").innerText = connectionRequests
    document.querySelector("#connections-badge").innerText = badgePlus;
}
function declineConnectionPhil(element) {
    connectionRequests --;
    document.querySelector("#remove-me-phil").remove();
    document.querySelector(".badge").innerText = connectionRequests
}