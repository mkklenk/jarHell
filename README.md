# Welcome to jar hell:

This Example of code compiles, all tests pass, but still fails on integration (= at runtime) due to classpath issues. The runtime errors depend on the order of jar files put to the classpath.

## add operations before multiplication operations
*java -cp "./API for Calculator/target/api-1.0-SNAPSHOT.jar:**./Add operations/target/add-1.0-SNAPSHOT.jar**:**./Multiplication operations/target/mutliply-1.0-SNAPSHOT.jar**:./1Application/target/application-1.0-SNAPSHOT.jar" Main*
In this case the "add" jar is loaded before the "multiply" jar. The code runs unless it has to multiply:

```
Welcome to Calculator:
The result of 5 + 5 = 10
Exception in thread "main" java.lang.NoSuchMethodError: Utils.multiply(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
        at MultiplyOperation.calculate(MultiplyOperation.java:7)
        at Main.main(Main.java:9)
```

## multiplication operations before add operations
*java -cp "./API for Calculator/target/api-1.0-SNAPSHOT.jar:**./Multiplication operations/target/mutliply-1.0-SNAPSHOT.jar**:**./Add operations/target/add-1.0-SNAPSHOT.jar**:./1Application/target/application-1.0-SNAPSHOT.jar" Main*
In this case the "add" jar is loaded before the "multiply" jar. The code runs unless it has to add:

```
Welcome to Calculator:
Exception in thread "main" java.lang.NoSuchMethodError: Utils.add(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
        at AddOperation.calculate(AddOperation.java:7)
        at Main.main(Main.java:8)
```


