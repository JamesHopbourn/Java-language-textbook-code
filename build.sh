#!/bin/zsh
clang-format -i -style=LLVM *.java
rm -rf ./build/*
mkdir -p ../build
javac $(find . -name "*.java") -d build

if [[ $1 != '0' ]]; then
  echo -e "\n\033[32mExecute result\033[0m"
  java -cp $(pwd)/build/ $(basename $1 .class)
  exit 0
fi