class SLLNode {
	constructor(val) {
		this.value = val
		this.next = null
	}
}

class SLL {
	constructor() {
		this.head = null
	}

	addFront(value) {
		var newNode = new SLLNode(value)
		newNode.next = this.head
		this.head = newNode
		return this.head
	}

	removeFront() {
		if (this.head == null) {
			return this.head
		}
		var removeNode = this.head
		this.head = removeNode.next
		removeNode.next = null
		return this.head
	}

	front() {
		if (this.head == null) {
			return null
		} else {
			return this.head.value
		}
		// return this.head == null ? null : this.head.value
	}
}

var mySLL = new SLL()
mySLL.addFront(10)
mySLL.addFront(90)
mySLL.addFront(6)
mySLL.addFront(12)
mySLL.removeFront()
mySLL.removeFront()
mySLL.removeFront()
console.log(mySLL.front())
console.log(mySLL)
