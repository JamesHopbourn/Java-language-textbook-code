#### 不可执行的 jar
```
javac MathSelf.java

jar cvf MathSelf.jar MathSelf.class

javac mulExperiment.java

java mulExperiment
12
12.0
```

#### 可执行的 jar
```
vim MathSelfExe.java

javac MathSelfExe.java

vim Manifest.txt

jar cfm MathSelfExe.jar Manifest.txt MathSelfExe.class

java -jar MathSelfExe.jar
8
8.0
```

#### 参考资料
[java - How to create a .jar file using the terminal - Stack Overflow](https://stackoverflow.com/questions/10125639/how-to-create-a-jar-file-using-the-terminal)  
