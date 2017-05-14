#!/bin/sh
pushd  ..
java -cp "./API for Calculator/target/api-1.0-SNAPSHOT.jar:./Multiplication operations/target/mutliply-1.0-SNAPSHOT.jar:./Add operations/target/add-1.0-SNAPSHOT.jar:./1Application/target/application-1.0-SNAPSHOT.jar" Main
popd
