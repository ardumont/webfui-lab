(defproject webfui-lab "0.1.0-SNAPSHOT"
  :description "webfui learning playground"
  :url "http://github.com/ardumont/webfui-lab"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :main webfui-lab.server
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [webfui "0.2.1"]
                 [noir "1.3.0"]
                 [hiccup "1.0.2"]]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :source-paths ["src-clj"]
  :cljsbuild
  {:builds
   [{:source-paths ["src-cljs/add_two_numbers"],
     :id "add_two_numbers",
     :compiler
     {:pretty-print true,
      :output-to "resources/public/js/add_two_numbers.js",
      :optimizations :whitespace}}]})
