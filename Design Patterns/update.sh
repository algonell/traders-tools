#!/bin/sh

echo "Maven..."
mvn -f ~/git/traders-tools versions:use-latest-releases -DgenerateBackupPoms=false

echo "build..."
~/git/traders-tools/Design\ Patterns/build.sh
