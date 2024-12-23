# spring-boot-flyway-jpa-sqlserver

## Configuration
### application.yaml 
This project uses Flyway for managing database migrations. Below is an example configuration for Flyway in `application.yaml`:
```yaml
spring:
  flyway:
    baseline-on-migrate: true
    locations:
      - classpath:db/migration
```

### Example Directory Structure:
```
src
└── main
    └── resources
        └── db
            └── migration
                ├── V1__Create_Table.sql
                └── V2__Create_Table.sql
```