# HelloWorldJavaCmd
 [JDK Installation](https://docs.oracle.com/javase/webdesign/pubs8/im/a.gif)
 


This guide is a quick start to Java programming from the Windows 10 command line.
Various cases of project creation are considered.
All examples are divided into different branches of git.
---
Цей посібник для швидкого старту програмування на Java з командного рядка Windows 10.
Розглянуто різні випадки створення проектів.
Всі приклади розділені по різним гілкам git.
---



- ## simpleProject Branch

The first simple case here is to check the installation of the JDK and the actual compilation and operation of our class HelloTest.java
Перший випадок найпростіший тут міститься перевірка встановлення JDK та власне компіляція та робота нашого класу HelloTest.java


After downloading this repository, follow these steps.
1. Open cmd.
2. Navigate to the root directory of the downloaded folder.
```
$ java --version
java 15 2020-09-15
Java(TM) SE Runtime Environment (build 15+36-1562)
Java HotSpot(TM) 64-Bit Server VM (build 15+36-1562, mixed mode, sharing)
$ ls
HelloTest.java README.md
$ javac HelloTest.java
$ java HelloTest
Congratulation
$ ls
HelloTest.class  HelloTest.java  README.md
```
