lazy val root = project.in(file(".")).aggregate(p1, p2)
lazy val p1 = project.settings(scalaVersion := "2.11.8", zincDebug := true)
lazy val p2 = project.settings(scalaVersion := "2.12.1", zincDebug := true)
