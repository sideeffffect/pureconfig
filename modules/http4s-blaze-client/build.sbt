name := "pureconfig-http4s-blaze-client"

crossScalaVersions ~= { _.filterNot(_.startsWith("2.13")) }

libraryDependencies ++= Seq("org.http4s" %% "http4s-blaze-client" % "0.20.16")

developers := List(
  Developer(
    "sideeffffect",
    "Ondra Pelech",
    "ondra.pelech@gmail.com",
    url("https://github.com/sideeffffect")
  )
)

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.module.http4s.blaze.client.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(
  s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""",
  "*"
)
