all: compile

compile:
	jflex scanner.flex
	java -jar ../java-cup-11b.jar  -interface  -expect 3 -parser Parser parser2.cup
	javac -cp ../java-cup-11b-runtime.jar *.java
verbose_compile:
	jflex scanner.flex
	java -jar ../java-cup-11b.jar -dump_states -interface  -expect 3 -parser Parser parser2.cup
	javac -cp ../java-cup-11b-runtime.jar *.java
more_verbose_compile:
	jflex scanner.flex
	java -jar ../java-cup-11b.jar -dump -interface  -expect 3 -parser Parser parser2.cup
	javac -cp ../java-cup-11b-runtime.jar *.java
execute:
	@java -cp ../java-cup-11b-runtime.jar:. Main

clean:
	rm -f *.class *~
