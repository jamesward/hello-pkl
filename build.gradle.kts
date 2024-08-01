plugins {
    id("org.pkl-lang") version "0.26.2"
}

pkl {
    evaluators {
        register("evalPkl") {
            sourceModules.add(file("src/hello.pkl").toURI())
            outputFile = layout.buildDirectory.file("hello.yaml")
            outputFormat = "yaml"
        }
    }
}
