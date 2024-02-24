#!/bin/sh

echo "Maven..."
mvn -f ~/git/traders-tools versions:use-latest-releases -DgenerateBackupPoms=false
find ~/git/traders-tools -name "*.xml" -exec xmllint --format '{}' --output '{}' \;

echo "build..."
~/git/traders-tools/Design\ Patterns/build.sh
