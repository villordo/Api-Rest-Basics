# Allaria-integrations

Allaria Integrations micro service. This service expose all the bussines logic regarding links and redemptions.

### Run App
#### Locally

`sbt clean compile`

`sbt run` to run on default port (9000)

`sbt "run PORT"` to run on a given port

App runnning in `http://localhost:9000/`

#### Tests
`sbt test` to run tests

## Environment variables
### Database
- RDS_HOSTNAME
- RDS_PORT
- RDS_DB_NAME
- RDS_USERNAME
- RDS_PASSWORD

### Postmark mail service
- POSTMARK_URL: Postmark API endpoint
    * default value: `https://api.postmarkapp.com/email/withTemplate`
- POSTMARK_TOKEN: API token
- POSTMARK_FROM_EMAIL
    * default value: `noreply@midaruma.com.ar`

### Discord
- DISCORD_ID
- DISCORD_TOKEN
- `Channel: LOGS -> allaria-integrations`

### Admin
- ADMIN_TOKEN

## Firestore

Copy file `firebase-key-{ENVIRONMENT}.json` in `conf` folder. 

## Endpoints
[Api Spec](allaria-integrations.yaml) 