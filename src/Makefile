.PHONY: all qbuild test run profile doc clean pack
	
all:
	gradle build
	
qbuild:
	gradle -q build
	
test:
	gradle test
	
run:
	gradle run
	
profile: qbuild
	java -cp .\build\classes\java\main profiling.profile
	
doc: qbuild
	doxygen doxy_config

clean:
	gradle clean
	rmdir /Q /S .gradle\
	
pack: clean
	
