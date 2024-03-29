start:
	cd sample-api-for-load-testing && ./mvnw spring-boot:run

test:
	pwd
	. .env
	echo $$SOAPUI_PATH
	$$SOAPUI_PATH/Contents/java/app/bin/testrunner.sh ./sample-api-for-load-testng-soapui-project.xml
