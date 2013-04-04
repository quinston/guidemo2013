Guidemo2013.jar: Guidemo2013.java ButtonListener.java CheckboxListener.java RadioListener.java GuidemoFrame.java CorrectlyClicked.java
	javac *.java
	jar cfm Guidemo2013.jar Manifest.txt *java *class 

clean:
	rm *class
	rm *jar
