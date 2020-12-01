
name := "plugin-sdk"

organization := "com.algorithmia"

description := "Algorithmia plugin SDK"

publishMavenStyle := true
publishTo := Some("Algorithmia Maven" at "s3://s3-us-west-2.amazonaws.com/algorithmia-maven/repo")

// Do not append Scala versions to generated artifacts
crossPaths := false

// Forbid including Scala related libraries
autoScalaLibrary := false

// version artifacts using Git
enablePlugins(GitVersioning)
