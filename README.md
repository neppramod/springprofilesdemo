# Running

Default
```sh
./mvnw spring-boot:run
```

With an active profile
```sh
./mvnw clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```
