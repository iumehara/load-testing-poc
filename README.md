# Load Testing POC
Tests a Spring Boot JSON API using SoapUI

## Getting Started
- Install [SoapUI](https://www.soapui.org/downloads/soapui/). Make note of the install location.
- Make a local `.env` file based on [.template.env](.template.env) and set `SOAPUI_PATH` variable
- start the API with `make start`
- run test with `make test`
- 