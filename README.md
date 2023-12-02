# Spring Boot 2.2 banner example

```bash
./mvnw clean package
```

```bash
java -jar target/spring-boot-2.2-banner-example-0.0.1-SNAPSHOT.jar 
```

helm install infinispan  --values infinispan-values.yaml
helm install infinispan  infinispan-0.3.2.tgz -n infinispan --values infinispan-values.yaml

helm upgrade infinispan  infinispan-0.3.2.tgz -n infinispan --values infinispan-values.yaml