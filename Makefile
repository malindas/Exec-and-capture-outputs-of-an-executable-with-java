app: app.o
	gcc -o app app.o
	
app.o: app.c
	gcc -c app.c
	
	javac main.java
