plugins {
    id("org.pkl-lang") version "0.26.3"
}

pkl {
    evaluators {
        register("evalPkl") {
            sourceModules.add(file("src/hello.pkl"))
            outputFile = layout.buildDirectory.file("hello.yaml")
            outputFormat = "yaml"
        }
    }
}
