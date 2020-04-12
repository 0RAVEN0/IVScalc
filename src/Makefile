.PHONY: all loud test run profile doc clean pack
	
all:
	gradle -q build
	
loud:
	gradle build
	
test:
	gradle test
	
run:
	gradle run
	
profile: all
	java -cp .\build\classes\java\main profiling.profile
	
doc: all
	doxygen doxy_config

clean:
	gradle clean
	rmdir /Q /S .gradle\
	
pack: clean
	
