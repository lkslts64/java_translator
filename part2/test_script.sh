#!/bin/bash
#$1 holds input file name

make execute < $1 > results/Main.java
cd results
javac Main.java 
java Main

