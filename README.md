# seata-spring-boot-custom-registry
Demo using Seata custom registry with Spring Boot

## Expected result
Throw an exception:
``` 
java.lang.Exception: Yeah! The custom registry is working.
```

And, to validate the custom configuration, we should see these following lines somewhere in the logs:
```
---> key: transport.server, value: NIO
---> key: transport.type, value: TCP
```

## Run
Run this command in your terminal:
```
./mvnw spring-boot:run
```