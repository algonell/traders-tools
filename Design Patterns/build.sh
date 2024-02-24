#!/bin/sh

clear

echo
echo "traders-tools..."
mvn -f ~/git/traders-tools clean package -DskipTests
