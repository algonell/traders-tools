#!/bin/sh

clear

echo "\ntraders-tools..."
mvn -f ~/git/traders-tools clean package -DskipTests
