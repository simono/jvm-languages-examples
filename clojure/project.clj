(
  defproject clj-test "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins [[lein-exec "0.3.2"]]
  :aliases {
    "code-as-data" ["exec" "src/code_as_data.clj"]
    "data-structures" ["exec" "src/data_structures.clj"]
    "hello-world" ["exec" "src/hello_world.clj"]
    "lazy" ["exec" "src/lazy.clj"]
    "macro" ["exec" "src/macro.clj"]
    "non-lazy" ["exec" "src/non_lazy.clj"]
  }
)
