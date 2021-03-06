(set-env!
 :source-paths #{"src"}
 :dependencies '[[ancient-clj "0.3.11" :exclusions [com.amazonaws/aws-java-sdk-s3]]
                 [com.amazonaws/aws-java-sdk-s3 "1.9.0" :exclusions [joda-time]]
                 [adzerk/bootlaces "0.1.12" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "3.2.6")

(bootlaces! +version+)

(task-options!
 pom  {:project     'hoplon/lein-template
       :version     +version+
       :description "Create new Hoplon projects with style and grace."
       :url         "https://github.com/tailrecursion/hoplon-template"
       :scm         {:url "https://github.com/tailrecursion/hoplon-template"}
       :license     {"Eclipse Public License"
                     "http://www.eclipse.org/legal/epl-v10.html"}})
