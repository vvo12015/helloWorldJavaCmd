# ProjectSectionByFolders Branch
 
 [javacDoc](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html)
---

This branch describes how to compile java files when distributed by directories

* source code	           	-> src/java
* test code   			-> src/test
* external library		-> lib
* classes			        -> bin
* test classes		 	-> test

Дана гілка описує, як компілювати java файли при розподіленні по директоріях

* вихідний код         -> src/java
* вихідний код тестів  -> src/test
* зовнішні бібліотеки  -> lib
* бінарні файли        -> bin
* бінарні тести		 -> test

---

In addition, the java file is in the org.hello package

На додачу java файл знаходяться у пакеті org.hello

After loading the repository and launching cmd, follow these steps

Після завантаження репозиторію та запуску cmd, виконайте наступні кроки

1.  Завантаження репозиторію
```PowerShell
c:\>git clone https://github.com/vvo12015/helloWorldJavaCmd.git
c:\>git checkout projectSectionByFolders
```
2. 	Download the necessary libraries

	Завантаження необхідних бібліотек
	
* [junit-4.12.jar](https://search.maven.org/search?q=g:junit%20AND%20a:junit)
* [hamcrest-core-1.3.jar](https://search.maven.org/search?q=g:org.hamcrest%20AND%20a:hamcrest-core)

>Theoretical knowledge on running tests from the command line was taken from

>Теоретичні знання з запуску тестів з команого рядка брав з 

>[www.codejava.net](https://www.codejava.net/testing/how-to-compile-and-run-junit-tests-in-command-line)

3.	Compile and run java files.

	Компіляція та запуск java файлів

```PowerShell
C:\>java --version
java 15 2020-09-15
Java(TM) SE Runtime Environment (build 15+36-1562)
Java HotSpot(TM) 64-Bit Server VM (build 15+36-1562, mixed mode, sharing)
C:\>dir \root
test
bin
lib
README.md
src
C:\root\>dir src
java
test
C:\root\>dir src\java
org
C:\root\>dir lib
hamcrest-core-1.3.jar
junit-4.12.jar
```
3.1. Compile [**without libs**]

Компіляція [**без бібліотек**]

PowerShell
```
C:\root\>javac -sourcepath src src\java\org\hello\HelloWorld.java -d bin
```
WindowsTerminal
```
C:\root\>javac -sourcepath src 'src\java\org\hello\HelloWorld.java' -d bin
```
run java class [**without libs**]

запускаємо [**без бібліотек**]

PowerShell
```
C:\root\>java -cp .;bin org.hello.HelloWorld
HelloWorld!!!
```
WindowsTerminal
```
C:\root\>java -cp '.;bin' org.hello.HelloWorld
HelloWorld!!!
```
2. Compile and run [**with libs**]. 

>Compile and run on the example of JUnit4 tests

>Компіляція та запуск на прикладі JUnit4 тестів

PowerShell
```
C:\root\>javac -sourcepath src -classpath 'test;lib\junit-4.12.jar' 'src\test\hello\HelloTest.java' -d test
```
WindowsTerminal
```
C:\root\>javac -sourcepath src 'src\java\org\hello\HelloWorld.java' -d bin
```
run test class

запуск тестів

PowerShell
```
C:\root\>java -cp .;test;lib\junit-4.12.jar;lib\hamcrest-core-1.3.jar org.junit.runner.JUnitCore hello.HelloTest
JUnit version 4.12
.
Time: 0,003

OK (1 test)
```
WindowsTerminal
```
C:\root\>java -cp ".;test;lib\junit-4.12.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore hello.HelloTest
JUnit version 4.12
.
Time: 0,003

OK (1 test)
```
run class file

запуск .class файлів

WindowsTerminal
```
C:\root\>java -cp ".;bin" org.hello.HelloWorld
HelloWorld!!!
```
