### Steps to reproduce

Have so far been unable to reproduce the failure in [this build scan](https://customer-scans.grdev.net/s/n2t6dmvuw5cfu).

1. Ensure a JDK 17 Test Distribution agent is running and registered with the solutions GE instance.
2. `./gradlew --rerun-tasks clean test`

### Reproducer Structure

This reproducer has 3 modules:
1. `:libOne`
2. `:libTwo`
3. `:otherLibs:subLib`

The kover plugin is applied to all 3 modules, and the root module declares a kover dependency on them all to create a combined coverage report.
