JFLAGS = -g -d
JC = javac
JVM = java
JU = .\junit-platform-console-standalone-1.6.1.jar
OUT = .\out\

.PHONY: all test clean
	
all:
	$(JC) $(JFLAGS) $(OUT) -cp $(JU) mathlib\interfaces\IMathLib.java mathlib\MathLibImpl.java mathlib\tests\MathLibImplTests.java
	
test: all
	$(JVM) -jar $(JU) -f .\out\mathlib\tests\MathLibImplTests.class

clean:
	rmdir /Q /S $(OUT)