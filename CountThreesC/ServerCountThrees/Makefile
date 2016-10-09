# Neetu Rohith
# Assignment 5: Writing a makefile to build ServerCountThrees


# To create object file countthrees.o we need files readInt32BitLE.c and readInt32BitLE.h
readInt32BitLE.o: readInt32BitLE.h readInt32BitLE.c
	gcc -c readInt32BitLE.c

ServerCountThrees.o: ServerCountThrees.c
	gcc -c ServerCountThrees.c

ServerCountThrees: readInt32BitLE.o ServerCountThrees.o
	gcc -o ServerCountThrees readInt32BitLE.o ServerCountThrees.o

.PHONY: test clean

test: ServerCountThrees
	mkdir -p test
	cp threesData.bin ServerCountThrees test/ 
	./test/ServerCountThrees 

clean:
	rm -f *.o ServerCountThrees
	rm -rf test

