JFLAGS = -g -d
JC = javac
JVM = java
JU = .\junit-platform-console-standalone-1.6.1.jar
OUT = .\out\

.PHONY: all test profile clean
	
all:
	if not exist $(OUT) mkdir $(OUT)
	$(JC) $(JFLAGS) $(OUT) -cp $(JU) mathlib\interfaces\IMathLib.java mathlib\MathLibImpl.java tests\MathLibImplTests.java profiling\profile.java
	
test: all
	$(JVM) -jar $(JU) -cp $(OUT) -c tests.MathLibImplTests
	
profile: all
	$(JVM) -cp $(OUT) profiling.profile < profiling\nums.txt

clean:
	if exist $(OUT) rmdir /Q /S $(OUT)
