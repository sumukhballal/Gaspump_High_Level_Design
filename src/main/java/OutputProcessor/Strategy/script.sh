#!/bin/bash

while read line
do
	cd ./$line
	cp ../StorePrices/StorePrices.java "$line.java"
	cp ../StorePrices/StorePrices1.java "${line}1.java"
	cp ../StorePrices/StorePrices2.java "${line}2.java"
	cd ..
done < test.txt
