JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	c1test.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

run:
	java c1test
