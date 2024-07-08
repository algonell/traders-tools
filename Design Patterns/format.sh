#!/bin/sh

clear

# codespell
echo
echo "codespell..."
~/.venv/bin/codespell -L ErrorProne,errorprone $(git ls-files ~/git/traders-tools/)

# google-java-format
echo
echo "google-java-format..."
~/.sdkman/candidates/java/current/bin/java -jar ~/Misc/google-java-format-*.jar --replace $(git ls-files ~/git/traders-tools/*.java)

# SpotBugs
echo
echo "SpotBugs..."
mvn -f ~/git/traders-tools/ spotbugs:check
