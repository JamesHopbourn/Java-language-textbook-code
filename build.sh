#!/bin/zsh

clang-format -i -style=LLVM *.java
rm -rf ./build/*
mkdir -p ../build
javac $(find . -name "*.java") -d build

if [[ $1 != '0' ]]; then
  if [[ -f $1 ]]; then
    echo -e "\n\033[32mExecute result\033[0m"
    java -cp $(pwd)/build/ $(basename $1 .class)
  else
    echo "public class {
  public static void main(String args[]) {
    
  }
}" >  $1
    subl $1
  fi
fi
