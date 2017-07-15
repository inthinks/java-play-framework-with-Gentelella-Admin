name := """play"""
organization := "play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice

libraryDependencies ++= Seq(jdbc,cache,"mysql" % "mysql-connector-java" % "5.1.27")