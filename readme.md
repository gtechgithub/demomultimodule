# this is the read me to push for multi module 

it has main module called demo where we can compile using mvn clean install which will build all the child modules
such as 

* customer-service
* customer-service-standalone
* data-entities

## usage of modules

data-entities module is used in the customer-service
customer-service is used by customer-service-standalone which is the spring boot run 


to execute the module of customer-service-standalone

```
mvn spring-boot:run 
```
