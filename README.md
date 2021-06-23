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
- The `master` and `v*` branches will publish a SNAPSHOT for all commits.  This is accessible only to internal developers.
- A semantic version in the form of a git tag, `vX.Y.Z` will publish to Maven central.

### Branches and tags
- `master` represents `vNext` and corresponds to SNAPSHOT releases
- `v1.x` is a major version branch.  Each major version has its own branch.
- `vX.Y.Z` as a tag targets the corresponding major version branch. 


### Publishing a major version
To create a new major version:
1. Start with `git checkout master`
1. Create the new release branch: `git checkout -b v2.x` where `2` is the new major version.
1. Create a GitHub Release for `v2.0.0` targeting the `v2.x` branch

### Publishing a minor version
To publish a minor or patch version:
1. Start from the corresponding major version `git checkout v1.x`
1. Create a feature branch `git checkout -b my-feature`
   a. NOTE: branches can't begin with `v`
1. In github, create a pull request from `my-feature` -> `v1.x`
1. Create a pull request from `my-feature` -> `master` to ensure inclusion in future major versions.
1. Merge the pull request
1. Create a new GitHub Release with a new SemVer tag e.g. `v1.1.1`, targeting branch `v1.x`
1. Include any changes in the release notes

