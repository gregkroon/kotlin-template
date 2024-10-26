#!/bin/sh
DEFAULT_JVM_OPTS=""
APP_NAME="gradlew"
APP_BASE_NAME=$(basename "$0")
exec "$JAVACMD" $DEFAULT_JVM_OPTS -cp "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@"
