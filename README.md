# Fork of [FossifyOrg/Contacts](https://github.com/FossifyOrg/Contacts)

-   Aim was to make Automatic Backup option [FossifyOrg/Contacts](https://github.com/FossifyOrg/Contacts) app work in my old android 10 phone.

# create and install apk from local

1. generate signing key
   `keytool -genkey -v -keystore my-release-key.jks -keyalg RSA -keysize 2048 -validity 10000 -alias my-alias`
2. update `keystore.properties` file
3. generate apk
   `./gradlew assembleRelease`
4. install apk on your phone using `adb`
   `adb -d install "./app/build/outputs/apk/foss/release/contacts-4-foss-release.apk"`
