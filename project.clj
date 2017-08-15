(defproject cljds/ch7 "0.1.0"
  :description "Example code for the book Clojure for Data Science"
  :url "https://github.com/clojuredatascience/ch7-recommender-systems"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.mahout/mahout-core "0.9" :exclusions [com.google.guava/guava]]
                 [org.apache.mahout/mahout-examples "0.9" :exclusions [com.google.guava/guava]]
                 [gorillalabs/sparkling "2.1.2"]
                 [me.raynes/fs "1.4.6"]
                 [medley "1.0.0"]
                 [incanter "1.5.7"]
                 [com.google.guava/guava "23.0"]
                 [iota "1.1.3"]]
  :profiles {:dev
             {:dependencies [[org.clojure/tools.cli "0.3.5"]]
              :repl-options {:init-ns cljds.ch7.examples}
              :resource-paths ["data/ml-100k"]}
             :provided
             {:dependencies
              [[org.apache.spark/spark-mllib_2.11 "2.2.0" :exclusions [com.google.guava/guava]]
               [org.apache.spark/spark-core_2.11 "2.2.0" :exclusions [com.google.guava/guava com.thoughtworks.paranamer/paranamer]]]}}
  :main cljds.ch7.core
  :aot [sparkling.serialization sparkling.destructuring cljds.ch7.sparkling]
  :jvm-opts ["-Xmx4g"])
