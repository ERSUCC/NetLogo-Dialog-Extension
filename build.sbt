enablePlugins(org.nlogo.build.NetLogoExtension)

netLogoExtName := "dialog"

netLogoClassManager := "org.nlogo.extension.dialog.DialogExtension"

netLogoZipSources := false

version := "1.0.1"

scalaVersion := "2.12.8"

scalaSource in Compile := baseDirectory.value / "src"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-encoding", "us-ascii")

// The remainder of this file is for options specific to bundled netlogo extensions
// if copying this extension to build your own, you need nothing past line 14 to build
// sample-scala.zip
netLogoTarget :=
  org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value)

resolvers      += "netlogo" at "https://dl.cloudsmith.io/public/netlogo/netlogo/maven/"
netLogoVersion := "6.2.0-d27b502"
