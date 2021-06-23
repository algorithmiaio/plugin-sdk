inThisBuild(List(
  organization := "com.algorithmia",
  homepage := Some(url("https://github.com/algorithmiaio/plugin-sdk")),
  licenses := List("MIT" -> url("https://github.com/algorithmiaio/plugin-sdk/blob/master/LICENSE")),
  developers := List(
    Developer(
      "jbooth",
      "Joshua Booth",
      "jbooth@algorithmia.com",
      url("https://algorithmia.com")
    )
  )
))
name := "plugin-sdk"
organization := "com.algorithmia"
description := "Algorithmia plugin SDK"

// Forbid including Scala related libraries
autoScalaLibrary := false

// Do not append Scala versions to generated artifacts
crossPaths := false
