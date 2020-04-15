.PHONY: all loud test run profile doc clean pack
	
all:
	gradlew -q build
	
loud:
	gradlew build
	
test:
	gradlew test
	
run:
	gradlew run
	
profile:
	gradlew profile
	
doc: all
	doxygen doxy_config

clean:
	gradlew clean
	rmdir /Q /S .gradle\
	
pack: clean
	
