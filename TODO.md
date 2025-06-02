# TODO

- create build
- post build to https://github.com/FossifyOrg/Contacts/issues/228
- understand changes

---

# publish to maven local

1. In Commons repos
   1. `./gradlew publishToMavenLocal`
2. In Contacts repo
   1. build and debug

---

# publish to jitpack.io

1. In Commons repos
   1. Push your local commits to your fork on GitHub.
   2. ```bash
         git commit
         git tag -a v1.0.4 -m "JitPack build for v1.0.4"
         git push origin v1.0.4
      ```
2. Go to https://jitpack.io/#RabbitRun47/FossifyOrg-Commons
   1. Click on "Get it" for your version v1.0.4
3. In Contacts repo, go to gradle/libs.versions.toml
   1. update version
      ```
      #Fossify
      commons = "v1.0.4"
      ```
---
                activity.isAccessibleWithSAFSdk30(path) -> activity.handleSAFDialogSdk30(path) {
NEW
    return if (isAccessibleWithSAFSdk30(path) && !hasProperStoredFirstParentUri(path)) {
NEW
        isAccessibleWithSAFSdk30(path) -> getFastDocumentSdk30(path)?.exists() ?: false
OLD
    return if (isAccessibleWithSAFSdk30(path) && !hasProperStoredFirstParentUri(path)) {
NEW