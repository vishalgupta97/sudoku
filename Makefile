JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: SudokuSolver

SudokuSolver: $(classes)

clean:
	rm -f *.class
	rm -f manifest.txt
	rm -f SudokuSolver.jar

%.class: %.java
	$(JAVAC) $<

jar: $(classes)
	@echo "Manifest-Version: 1.0" > manifest.txt
	@echo "Class-Path: ." >> manifest.txt
	@echo "Main-Class: SudokuSolver" >> manifest.txt
	@echo "" >> manifest.txt
	jar -cmf manifest.txt SudokuSolver.jar $(classes)
