### Steps to reproduce

1. Ensure a Test Distribution agent is running and registered with `ge-helm-standalone-unstable`
2. `./gradlew --rerun-tasks clean test`

Setting Test Distribution `enabled = true` results in passing tests
