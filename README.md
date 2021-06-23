plugin-sdk
==========

Parts of the Algorithmia system can be customized by introducing jar files
containing alternative implementations.  This module provides interfaces for
creating those jar files.

## Getting started

Building a plugin will require importing interfaces.

### Import the dependency

#### Maven
```xml
<dependency>
    <groupId>com.algorithmia</groupId>
    <artifactId>plugin-sdk</artifactId>
    <version>[1.0,2.0)</version>
</dependency>
```

#### SBT

```
libraryDependencies += "com.algorithmia" % "plugin-sdk" % "1.0.0"
```

### Create your plugin
- Plugins have a `Factory` entrypoint that you should start with to implement the desired module.
  - Implement e.g. `MySecretProvider extends secrets.SecretProviderFactory`
- Export your project as a fat jar file
- Upload via the algorithmia API or admin panel, following the documentation on the [developer center](https://algorithmia.com/developers).


## Publishing this SDK

CI will publish the plugin a new version under the following conditions:
- The `master` branch will publish a SNAPSHOT for all commits.  This is accessible only to internal developers.
- A semantic version in the form of a git tag, `vX.Y.Z` will publish to Maven central.

### Publishing a new version
To publish the next version:
- Increment the version in the README.md for `sbt` and `maven` instructions.
- After merging that PR to master, create a new GitHub release using the appropriate SemVer
