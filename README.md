# hello-maven-commons-io

Minimal Maven "Hello, World!" that depends on `commons-io:commons-io:2.11.0`, resolved from Maven Central
(`https://repo.maven.apache.org/maven2`). Used to exercise lockfileless Maven dependency resolution.

```sh
mvn -q compile exec:java -Dexec.mainClass=com.example.App
```
