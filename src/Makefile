JFLAGS= -g
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java
	
CLASSES: mathlib\interfaces\IMathLib.java \
mathlib\tests\MathLibImplTests.java \
mathlib\MathLibImpl.java

clean:
	rmdir out\