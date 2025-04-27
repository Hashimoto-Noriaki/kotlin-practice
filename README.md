### サーバー実行
```Main.kt
fun main() {
    println("Hello, Kotlin!")
}
```
実行
```
kotlinc Main.kt -include-runtime -d Main.jar
java -jar Main.jar
```

### バージョン確認
```
kotlinc -version
```
