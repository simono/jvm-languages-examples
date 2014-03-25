val even = for {
	i <- 1 to 10
	if i % 2 == 0
} yield i

assert(List(2, 4, 6, 8, 10) == even)
