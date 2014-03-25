def builder =
	new groovy.xml.MarkupBuilder()

builder.html {
	body {
		a(href: 'http://groovy.codehaus.org',
			"Mit Groovy erstellt")
	} 
}
