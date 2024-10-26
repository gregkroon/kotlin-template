@echo off
setlocal
set DEFAULT_JVM_OPTS=
set APP_BASE_NAME=%~nx0
call "%JAVA_CMD%" %DEFAULT_JVM_OPTS% -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*
