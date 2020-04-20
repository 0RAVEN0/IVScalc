packdir = xvanka00_xdzuba00_xhlady01_xrozpr00
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
	
pack: doc clean
	powershell md $(packdir) && \
	cd $(packdir) && \
	powershell md install && \
	powershell md repo && \
	cd .. && \
	powershell move ..\doc $(packdir) && \
	powershell xcopy ..\..\IVSproj $(packdir)\repo /i && \
	powershell Compress-Archive $(packdir) -Force -DestinationPath ..\..\$(packdir).zip
	rmdir /Q /S $(packdir)
