@Serializable class Conference {
	Str? name
	Int year

	static Void main() {
		javaLand := Conference {
			name = "JavaLand"
			year = 2014
		}
		Env.cur.out.writeObj(javaLand)
	}
}
