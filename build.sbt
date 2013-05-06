javacOptions in Compile ++= Seq("-source", "1.6",  "-target", "1.6") 

javacOptions in doc ++= Seq("-source", "1.6") 

libraryDependencies ++= Seq(
  "com.google.android" % "support-v4" % "r12",
  "com.google.android.analytics" % "analytics" % "2.0beta4"
)

libraryDependencies ++= Seq(
  "com.actionbarsherlock" % "actionbarsherlock" % "4.2.0" artifacts(Artifact("actionbarsherlock", "apklib", "apklib")),
  "net.saik0.android.unifiedpreference" % "unifiedpreference" % "0.0.2" artifacts(Artifact("unifiedpreference", "apklib", "apklib")),
  "org.jraf" % "android-switch-backport" % "1.0" artifacts(Artifact("android-switch-backport", "apklib", "apklib")),
  "de.keyboardsurfer.android.widget" % "crouton" % "1.7",
  "dnsjava" % "dnsjava" % "2.1.1"
)
