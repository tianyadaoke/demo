# Demo

### a simple demo

Api: 
- path: get /brand/{brandId}/product/{productId}
- queryParam: date  (format:2020-06-15T10:10:10)
- example: http://localhost:8080/brand/1/product/35455?date=2020-06-15T10:10:10

Result:
-  200 ok
-  204 no content
-  400 bad request

Run application precondition: maven and jdk11
```
mvn clean package
cd target
java -jar demo-0.0.1-SNAPSHOT.jar
```

Connect to database h2
```yaml
url: jdbc:h2:mem:test
username: sa
password:
```







