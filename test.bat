@echo off
::close echo
if "%1"=="test" goto step1
if "%1"=="terence" goto step2
:step1
echo "%1"
dir
:step2
echo "%1"
java -version
