def conference = [name: "JavaLand"]

println conference.name ?
	conference.name : "Unknown"

println conference.name ?: "Unknown"

conference.name?.toLowerCase()
