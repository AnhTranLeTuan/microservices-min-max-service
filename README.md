# Min Max Microservice for Cloud-Based Microservices with DevOps and Automation

## Description
A part of the cloud-based microservices with DevOps and automation project that include:
* Set up this service for port 8088
* Create Configuration class that retrieves configuration properties from this project's bootstrap.properties file
* The bootstrap.properties file will access the centralized configuration server (microservices-config-server-spring-cloud) through http://localhost:8888 to fetch information
* Build Controller class that maps URL request to a specific function, then autowired the Configuration object for returning values to users
