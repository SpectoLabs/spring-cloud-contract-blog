
# spring-cloud-contract-blog

Vanilla implementations for Account and Subscription microservices for demonstrating Consumer-Driven Contracts using Spring Cloud Contract

### Requirements
 - Java
 - [Spring Boot](https://projects.spring.io/spring-boot/) 
 - [Spring Cloud Contract](https://cloud.spring.io/spring-cloud-contract/)
 - [Gradle](https://gradle.org/)
 - [Maven](https://maven.apache.org/) for creating local maven repository
 

##### Install Maven
This project use local maven repository to share stubs file
```sh
# Mac OS
brew install maven
# Ubuntu
apt-get install maven
```

##### Install Gradle
```sh
# Mac OS
brew install gradle
# Ubuntu
apt-get install gradle
```

### Usage
Use Gradle to test, build and publish artifacts for local development.

##### subscription-service (consumer) tasks

* **test** - Runs the unit tests
* **build** - Test and assemble uber jar

##### account-service (producer) tasks
In addition to test and build, there are other tasks specific to the producer:

* **generateContractTests** - Generate API verification tests from the contracts
* **generateWireMockClientStubs** - Generate WireMock client stubs from the contracts
* **install** - Install artifacts including stubs.jar into the local Maven repository
* **uploadArchives** - Upload artifacts to remote repository


#### Links
More details can be found on the [blog](https://www.specto.io/blog/spring-cloud-contract.html).
