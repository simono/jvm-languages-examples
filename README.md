# JVM Languages Examples

This Repository contains Code Examples for my Talk ["Frischer Wind für die JVM –
sechs Programmiersprachen im
Vergleich"](https://speakerdeck.com/simono/frischer-wind-fur-die-jvm-sechs-programmiersprachen-im-vergleich-javaland)
(available in German only).

## Presented Languages:

* [Groovy](http://groovy.codehaus.org)
* [Scala](http://www.scala-lang.org)
* [Clojure](http://clojure.org)
* [Ceylon](http://ceylon-lang.org)
* [Kotlin](http://kotlin.jetbrains.org)
* [Fantom](http://fantom.org)

To install the Languages on OS X:

```sh
brew install groovy scala leiningen ceylon fantom
```

Kotlin is best [installed with IntelliJ](http://confluence.jetbrains.com/display/Kotlin/Getting+Started).

Now you can run the `Hello World' examples:

```sh
cd groovy && groovy hello_world && cd ..
cd scala && scala helloWorld.scala && cd ..
cd clojure && lein hello-world && cd ..
cd ceylon && ceylon compile de.olofsson && ceylon run de.olofsson && cd ..
cd fantom && fan hello_world.fan && cd ..
```
