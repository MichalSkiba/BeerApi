# Migration notes
* Java 21, Spring Boot 3.5.16 (intermediate compatibility release), H2 2.5.252.
* `javax.persistence` migrated to Jakarta; old Jersey 1 and duplicate Hibernate/Data JPA dependencies removed.
* Database is in-memory H2 and recreated on launch. Do **not** use this configuration for persistent data.
* Old `/save` demo method had fixed data and was publicly accessible; it remains a demo-only endpoint; keep the service on a private network until authentication/authorization is implemented.
* JSONWriter no longer uses Jersey 1; it uses Java HttpClient. Check upstream API availability separately.
* Upgrade to Spring Boot 4.1 after establishing passing integration tests.
