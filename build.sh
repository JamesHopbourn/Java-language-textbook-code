#!/bin/zsh
clang-format -i -style=LLVM *.java
rm -rf ./build/*
mkdir -p ../build
javac $(find . -name "*.java") -d build
