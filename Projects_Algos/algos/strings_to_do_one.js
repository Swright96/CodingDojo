//removeBlanks
function removeBlanks(str) {
	let newStr = ""

	for (let i = 0; i < str.length; i++) {
		if (str[i] != " ") {
			newStr += str[i]
		}
	}

	return newStr
}

console.log(removeBlanks("Pl ayT ha t Fu nk yMu si c"))

function getDigits(str) {
	let newStr = ""

	for (let char in str) {
		if (!isNaN(str[char])) {
			console.log(str[char])
		}
	}

	return newStr
}

console.log(getDigits("abc8c0d1ngd0j0!8"))

function acronym(str) {
	let wordsArr = str.split(" ")
	let acronymStr = ""

	for (let word in wordsArr) {
		if (wordsArr[word].length > 0) {
			acronymStr += wordsArr[word][0].toUpperCase()
		}
	}

	return acronymStr
}

console.log(acronym("there's no free lunch - gotta pay yer way."))

function countNonSpaces(str) {
	let counter = 0
	for (let char in str) {
		if (str[char] != " ") {
			counter++
		}
	}
	return counter
}

console.log(countNonSpaces("Honey pie, I ate all the donuts!"))

function removeShorterStrings(arr, len) {
	let newStrings = []
	let nextIndex = 0

	for (let value in arr) {
		if (arr[value].length >= len) {
			newStrings[nextIndex++] = arr[value]
		}
	}
	return newStrings
}

console.log(
	removeShorterStrings(["good morning", "sunshine", "dont", "smell", "me"], 5)
)
