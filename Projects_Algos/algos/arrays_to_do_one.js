//Push Front
function pushFront(arr, val) {
	for (let i = arr.length; i >= 0; i--) {
		arr[i] = arr[i - 1]
	}

	arr[0] = val

	return arr
}

console.log(pushFront([5, 6, 2, 3], 8))

//popFront
function popFront(arr, val) {
	for (let i = arr.length; i >= 0; i++) {
		arr[i] = arr[i + 1]
	}
	arr[0] = val

	return arr
}

function popFront(arr) {
	//saves the first value of the array
	let firstValue = arr[0]
	//loops the array left to right
	for (let i = 0; i < arr.length; i++) {
		arr[i] = arr[i + 1]
	}
	//decreases the amount of numbers in the array
	arr.length = arr.length - 1

	console.log(arr)
	return firstValue
}

console.log(popFront([5, 4, 3, 2, 1]))

//insertAt

function insertAt(arr, index, val) {
	for (let i = arr.length; i >= index; i--) {
		arr[i] = arr[i - 1]
	}
	arr[index] = val

	return arr
}

console.log(insertAt([100, 200, 5], 2, 311))
