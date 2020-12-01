plugin-sdk
==========

Parts of the Algorithmia system can be customized by introducing jar files
containing alternative implementations.  This module provides interfaces for
creating those jar files.

## Getting started

Building a plugin will require importing interfaces.

### Maven

```xml
<dependency>
    <groupId>com.algorithmia</groupId>
    <artifactId>plugin-sdk</artifactId>
    <version>[,1.0.0)</version>
</dependency>
```

### SBT

```sbt
libraryDependencies += "com.algorithmia" % "plugin-sdk" % "0.9.0"
```

## Publishing

### Maven
The following command can be used to publish a version based on SHA.

`sbt publish`

To publish a semantically versioned release, please follow the documentation
[here](https://docs.google.com/document/d/12uYiHsXNH8yGbaHF00aUwlTrkIQMh8gdTy-pITLT144/edit#heading=h.ake9tfj07vvi).

### Local
The following command can be used to publish to the local Ivy repository.

`sbt publishLocal`
