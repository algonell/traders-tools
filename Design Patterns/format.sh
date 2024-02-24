#!/bin/sh

clear

echo
echo "google-java-format..."
java -jar ~/Misc/google-java-format-*.jar --replace $(git ls-files *.java)

echo
echo "SpotBugs..."
mvn -f ~/git/traders-tools/ spotbugs:check
