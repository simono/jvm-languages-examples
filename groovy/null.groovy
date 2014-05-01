def conference = [name: "JavaLand"]

// ternärer Operator
println conference.name ?
	conference.name : "Unknown"

// Elvis-Operator
println conference.name ?: "Unknown"

// Safe-Navigation-Operator
conference.name?.toLowerCase()
