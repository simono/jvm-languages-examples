using concurrent

class Actors {
	static Void main() {

		p := ActorPool()
		actor := Actor(p) { "Hallo $it!" }

		echo(actor.send("JavaLand").get)
	}
}
