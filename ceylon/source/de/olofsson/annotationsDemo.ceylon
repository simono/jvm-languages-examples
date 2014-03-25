import ceylon.language.meta
	{ annotations }

"Eine Funktion mit Annotationen."
by ("Simon Olofsson")
void annotationsDemo() {

	value a = annotations(`DocAnnotation`,
		`function annotationsDemo`);
}
