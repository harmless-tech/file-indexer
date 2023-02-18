# file-indexer

A basic file indexer being worked on.

### Build

To build libs:
```shell
./gradlew build
```

To build dist:
```shell
./gradlew assembleDist
```

To build image:
```shell
./gradlew jlink
```

To build installer:
```shell
./gradlew jpackage -PinstallerType=[msi,pkg,dmg,deb,rpm]
```

### Run

To simply run the app:
```shell
./gradlew run
```

To simply run the app in debug mode with assertions:
```shell
./gradlew debug
```
