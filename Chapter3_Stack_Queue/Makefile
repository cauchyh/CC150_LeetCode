JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	@$(JC) $(JFLAGS) $*.java

CLASSES = \
	c3test.java 

default: run

classes: $(CLASSES:.java=.class)

clean:
	@$(RM) *.class

run: classes
	@java c3test



