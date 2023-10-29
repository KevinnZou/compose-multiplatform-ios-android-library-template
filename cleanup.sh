#!/bin/sh
rm -rf .idea
./gradlew clean
rm -rf .gradle
rm -rf build
rm -rf */build
rm -rf sample/*/build
rm -rf sample/iosApp/iosApp.xcworkspace
rm -rf sample/iosApp/Pods
rm -rf sample/iosApp/iosApp.xcodeproj/project.xcworkspace
rm -rf sample/iosApp/iosApp.xcodeproj/xcuserdata
