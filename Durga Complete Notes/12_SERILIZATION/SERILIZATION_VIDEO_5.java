TOPIC:-SERILIZATION
--------
(Serialization With respect to inheritance)
(56:00)

VIDEO NO=5
---------

NUMBER OF PICTURES=NULL
------------------

VIDEO COMPLETED=YES
--------------


IMPORTANT EXAMPLES:-

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
See notes 304 diagram.



Case 1 in Durga Notes..

PROGRAME=1
=========

import java.io.*;

class Animal implements Serializable {
	int i = 10;
}

class Dog extends Animal {
	int j = 20;
}

class Test {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		System.out.println(d1.i + "........" + d1.j);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "........" + d2.j);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
10........20
10........20

C:\Users\DELL\Desktop>

EXPLANATION:-
============

Even though Child class doesen t implements Serilizable.
we can seriliaze Child class Object If parent class implements Serializable interface...

That is 
serializable nature is inheriting from parent to Child..
Hence If parent is serilizable then by default Every Child is serializable.



In the above example even though Dog class dose nt implements Serializable,we can serilize Dog Object 
bcoz its Parent Animal class implemetns Serializable..




Object class dose nt implements Serializable interface.


Reason is If Object class implements Serializable,then every class in java will be Serialized.
so Object class dosen t implement Serializable...

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----

Page 306

Serialization with respect to inheritance..

Case 2:-
--------


PROGRAME=2
=========
EXPLANATION:-
============

Point 1:-
----------
To Serialize child class compulsary there is no rule that,it s parent class should be serialized.
If such type of rule is there then we cannot serialize even any java class Object..

So object class does nt not Serialized..

Even though parent class does not implements Serializable we can serialize child class
object, if child class implements Serializable interface.
i.e to Serialize child class Object, parent class need not be serialized compulasary..


To serialize Child class,compulsary Parent class should be serialized there is no such type of rule..

Point 2:-
--------
At the time of serialization JVM is gonna a check is any variable inheriting from non serilizable
Parent or not.
If any variable inheriting from non-serilizable parent then JVM ignores original value
and save defalut value to the file.



Point 3:-
--------
At the time of De-serialization JVM will check is any parent class is non serializable or not.
In this Example Animal class is non serializable,
IF any parent class is non-serializable then, JVM is gonna execute instance control flow
in every non serializable parent class es.
and  SHARE ITS INSTANCE VARIABLES VALUE TO THE  De-serialized Object.



Wat is Instance Control Flow
1)Identification of instance memebrs.
2)Execution of instance variable assignment and instane block.
3)Execution of constructors.




KeyPoint:-
Here JVM is responsible to execute instance control flow and share its instance members values to 
De-serialized Object.

To execute instance control flow JVM is gonna call no-args constructor in parent class.
In this example Dog class is Parent class and its non-serialized..
So Dog class should compulsary contain No-args constructor.(It may be programmed generated default
constructor or compiler generated default constructor..)


To Execute instance control flow/or as part of instance control flow,
JVM is gonna call no-args constructor in non-serialized Parent class..
It might be default constructed generated by Compiler or programmer generated No-args constructor.



If there is no No-args constructor in Parent Non-Serialized class, we will get 
RE saying InvalidClassException.


Point :-4
---------
While executing instance control flow of non-serializable Parent.
JVM will always call No-args constructor.
Hence Every non-serializable class should compulsary contain no-args constructor,
It may be default constructor generated by compiler or customized constructor explicitly
provided by programmer..
other wise we ll get RE saying InvalidClassException..

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
import java.io.*;

class Animal {
	int i = 10;

	Animal() {
		System.out.println("Animal constructor called");
	}
}

class Dog extends Animal implements Serializable {
	int j = 20;

	Dog() {
		System.out.println("Dog constructor called");
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		d1.i = 888;
		d1.j = 999;
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserialization started");
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "........." + d2.j);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Animal constructor called
Dog constructor called
Deserialization started
Animal constructor called 
10.........999

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
import java.io.*;

class Animal {
	int i = 10;

	Animal(int x) {
		System.out.println("Animal constructor called");
	}
}

class Dog extends Animal implements Serializable {
	int j = 20;

	Dog() {
		super(10);
		System.out.println("Dog constructor called");
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		d1.i = 888;
		d1.j = 999;
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "........." + d2.j);
	}
}





C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Animal constructor called
Dog constructor called
Deserialization started
Exception in thread "main" java.io.InvalidClassException: Dog; no valid constructor
        at java.io.ObjectStreamClass$ExceptionInfo.newInvalidClassException(ObjectStreamClass.java:150)
        at java.io.ObjectStreamClass.checkDeserialize(ObjectStreamClass.java:790)
        at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1987)
        at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1535)
        at java.io.ObjectInputStream.readObject(ObjectInputStream.java:422)
        at Test.main(Test.java:31)

C:\Users\DELL\Desktop>


EXPLANATION:-
============

Here Animal class does nt contain zero args constructor so at the time De-serialization 
During Runtime we are getting Exception..

JVM is checking zero-args constructor in Parent class constructor at the time De-serialization,
But there is no zero args constructor..so we are getting InvalidClassException.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
import java.io.*;

class Animal {
	int i = 10;

	Animal(int x) {
		System.out.println("Animal constructor called");
	}
}

class Dog extends Animal implements Serializable {
	int j = 20;

	Dog() {
	
		System.out.println("Dog constructor called");
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		d1.i = 888;
		d1.j = 999;
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "........." + d2.j);
	}
}






C:\Users\DELL\Desktop>javac Test.java
Test.java:14: error: constructor Animal in class Animal cannot be applied to given types;
        Dog() {
              ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
This corrected in Example 4 see it.

***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============

cmd points.

	cd /


	will go to intial path...
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
	
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
	Here compiler is creating a zero-args or no args constructor...
compare Example 3

PROGRAME=8
=========
	import java.io.*;

class Animal {
	int i = 10;

	
}

class Dog extends Animal implements Serializable {
	int j = 20;

	Dog() {
		System.out.println("Dog constructor called");
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		d1.i = 888;
		d1.j = 999;
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserialization started");
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "........." + d2.j);
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Dog constructor called
Deserialization started
10.........999

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
	import java.io.*;

class Animal {
	int i = 10;

	
}

class Dog extends Animal implements Serializable {
	int j = 20;

	Dog() {
		System.out.println("Dog constructor called");
	}
}

class Test {
	public static void main(String[] args) throws Exception {
		Dog d1 = new Dog();
		d1.i = 888;
		d1.j = 999;
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Deserialization started");
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.i + "........." + d2.j);
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Dog constructor called
Deserialization started
10.........999

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
EXPLANATION:-
============
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
EXPLANATION:-
============
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
EXPLANATION:-
============
***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
PROGRAME=25
=========
EXPLANATION:-
============
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
EXPLANATION:-
============
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
EXPLANATION:-
============
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
PROGRAME=29
=========
EXPLANATION:-
============
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
EXPLANATION:-
============
***************************-----END of--->30<--------***************************
Example=31
=========
NOTE:-
-----
PROGRAME=31
=========
EXPLANATION:-
============
***************************-----END of--->31<--------***************************
Example=32
=========
NOTE:-
-----
PROGRAME=32
=========
EXPLANATION:-
============
***************************-----END of--->32<--------***************************
Example=33
=========
NOTE:-
-----
PROGRAME=33
=========
EXPLANATION:-
============
***************************-----END of--->33<--------***************************
Example=34
=========
NOTE:-
-----
PROGRAME=34
=========
EXPLANATION:-
============
***************************-----END of--->34<--------***************************
Example=35
=========
NOTE:-
-----
PROGRAME=35
=========
EXPLANATION:-
============
***************************-----END of--->35<--------***************************
Example=36
=========
NOTE:-
-----
PROGRAME=36
=========
EXPLANATION:-
============
***************************-----END of--->36<--------***************************
Example=37
=========
NOTE:-
-----
PROGRAME=37
=========
EXPLANATION:-
============
***************************-----END of--->37<--------***************************
Example=38
=========
NOTE:-
-----
PROGRAME=38
=========
EXPLANATION:-
============
***************************-----END of--->38<--------***************************
Example=39
=========
NOTE:-
-----
PROGRAME=39
=========
EXPLANATION:-
============
***************************-----END of--->39<--------***************************
Example=40
=========
NOTE:-
-----
PROGRAME=40
=========
EXPLANATION:-
============
***************************-----END of--->40<--------***************************
Example=41
=========
NOTE:-
-----
PROGRAME=41
=========
EXPLANATION:-
============
***************************-----END of--->41<--------***************************
Example=42
=========
NOTE:-
-----
PROGRAME=42
=========
EXPLANATION:-
============
***************************-----END of--->42<--------***************************
Example=43
=========
NOTE:-
-----
PROGRAME=43
=========
EXPLANATION:-
============
***************************-----END of--->43<--------***************************
Example=44
=========
NOTE:-
-----
PROGRAME=44
=========
EXPLANATION:-
============
***************************-----END of--->44<--------***************************
Example=45
=========
NOTE:-
-----
PROGRAME=45
=========
EXPLANATION:-
============
***************************-----END of--->45<--------***************************
Example=46
=========
NOTE:-
-----
PROGRAME=46
=========
EXPLANATION:-
============
***************************-----END of--->46<--------***************************
Example=47
=========
NOTE:-
-----
PROGRAME=47
=========
EXPLANATION:-
============
***************************-----END of--->47<--------***************************
Example=48
=========
NOTE:-
-----
PROGRAME=48
=========
EXPLANATION:-
============
***************************-----END of--->48<--------***************************
Example=49
=========
NOTE:-
-----
PROGRAME=49
=========
EXPLANATION:-
============
***************************-----END of--->49<--------***************************
Example=50
=========
NOTE:-
-----
PROGRAME=50
=========
EXPLANATION:-
============
***************************-----END of--->50<--------***************************
Example=51
=========
NOTE:-
-----
PROGRAME=51
=========
EXPLANATION:-
============
***************************-----END of--->51<--------***************************
Example=52
=========
NOTE:-
-----
PROGRAME=52
=========
EXPLANATION:-
============
***************************-----END of--->52<--------***************************
Example=53
=========
NOTE:-
-----
PROGRAME=53
=========
EXPLANATION:-
============
***************************-----END of--->53<--------***************************
Example=54
=========
NOTE:-
-----
PROGRAME=54
=========
EXPLANATION:-
============
***************************-----END of--->54<--------***************************
Example=55
=========
NOTE:-
-----
PROGRAME=55
=========
EXPLANATION:-
============
***************************-----END of--->55<--------***************************
Example=56
=========
NOTE:-
-----
PROGRAME=56
=========
EXPLANATION:-
============
***************************-----END of--->56<--------***************************
Example=57
=========
NOTE:-
-----
PROGRAME=57
=========
EXPLANATION:-
============
***************************-----END of--->57<--------***************************
Example=58
=========
NOTE:-
-----
PROGRAME=58
=========
EXPLANATION:-
============
***************************-----END of--->58<--------***************************
Example=59
=========
NOTE:-
-----
PROGRAME=59
=========
EXPLANATION:-
============
***************************-----END of--->59<--------***************************
Example=60
=========
NOTE:-
-----
PROGRAME=60
=========
EXPLANATION:-
============
***************************-----END of--->60<--------***************************
Example=61
=========
NOTE:-
-----
PROGRAME=61
=========
EXPLANATION:-
============
***************************-----END of--->61<--------***************************
Example=62
=========
NOTE:-
-----
PROGRAME=62
=========
EXPLANATION:-
============
***************************-----END of--->62<--------***************************
Example=63
=========
NOTE:-
-----
PROGRAME=63
=========
EXPLANATION:-
============
***************************-----END of--->63<--------***************************
Example=64
=========
NOTE:-
-----
PROGRAME=64
=========
EXPLANATION:-
============
***************************-----END of--->64<--------***************************
Example=65
=========
NOTE:-
-----
PROGRAME=65
=========
EXPLANATION:-
============
***************************-----END of--->65<--------***************************
Example=66
=========
NOTE:-
-----
PROGRAME=66
=========
EXPLANATION:-
============
***************************-----END of--->66<--------***************************
Example=67
=========
NOTE:-
-----
PROGRAME=67
=========
EXPLANATION:-
============
***************************-----END of--->67<--------***************************
Example=68
=========
NOTE:-
-----
PROGRAME=68
=========
EXPLANATION:-
============
***************************-----END of--->68<--------***************************
Example=69
=========
NOTE:-
-----
PROGRAME=69
=========
EXPLANATION:-
============
***************************-----END of--->69<--------***************************
Example=70
=========
NOTE:-
-----
PROGRAME=70
=========
EXPLANATION:-
============
***************************-----END of--->70<--------***************************
Example=71
=========
NOTE:-
-----
PROGRAME=71
=========
EXPLANATION:-
============
***************************-----END of--->71<--------***************************
Example=72
=========
NOTE:-
-----
PROGRAME=72
=========
EXPLANATION:-
============
***************************-----END of--->72<--------***************************
Example=73
=========
NOTE:-
-----
PROGRAME=73
=========
EXPLANATION:-
============
***************************-----END of--->73<--------***************************
Example=74
=========
NOTE:-
-----
PROGRAME=74
=========
EXPLANATION:-
============
***************************-----END of--->74<--------***************************
Example=75
=========
NOTE:-
-----
PROGRAME=75
=========
EXPLANATION:-
============
***************************-----END of--->75<--------***************************
Example=76
=========
NOTE:-
-----
PROGRAME=76
=========
EXPLANATION:-
============
***************************-----END of--->76<--------***************************
Example=77
=========
NOTE:-
-----
PROGRAME=77
=========
EXPLANATION:-
============
***************************-----END of--->77<--------***************************
Example=78
=========
NOTE:-
-----
PROGRAME=78
=========
EXPLANATION:-
============
***************************-----END of--->78<--------***************************
Example=79
=========
NOTE:-
-----
PROGRAME=79
=========
EXPLANATION:-
============
***************************-----END of--->79<--------***************************
Example=80
=========
NOTE:-
-----
PROGRAME=80
=========
EXPLANATION:-
============
***************************-----END of--->80<--------***************************
Example=81
=========
NOTE:-
-----
PROGRAME=81
=========
EXPLANATION:-
============
***************************-----END of--->81<--------***************************
Example=82
=========
NOTE:-
-----
PROGRAME=82
=========
EXPLANATION:-
============
***************************-----END of--->82<--------***************************
Example=83
=========
NOTE:-
-----
PROGRAME=83
=========
EXPLANATION:-
============
***************************-----END of--->83<--------***************************
Example=84
=========
NOTE:-
-----
PROGRAME=84
=========
EXPLANATION:-
============
***************************-----END of--->84<--------***************************
Example=85
=========
NOTE:-
-----
PROGRAME=85
=========
EXPLANATION:-
============
***************************-----END of--->85<--------***************************
Example=86
=========
NOTE:-
-----
PROGRAME=86
=========
EXPLANATION:-
============
***************************-----END of--->86<--------***************************
Example=87
=========
NOTE:-
-----
PROGRAME=87
=========
EXPLANATION:-
============
***************************-----END of--->87<--------***************************
Example=88
=========
NOTE:-
-----
PROGRAME=88
=========
EXPLANATION:-
============
***************************-----END of--->88<--------***************************
Example=89
=========
NOTE:-
-----
PROGRAME=89
=========
EXPLANATION:-
============
***************************-----END of--->89<--------***************************
Example=90
=========
NOTE:-
-----
PROGRAME=90
=========
EXPLANATION:-
============
***************************-----END of--->90<--------***************************
Example=91
=========
NOTE:-
-----
PROGRAME=91
=========
EXPLANATION:-
============
***************************-----END of--->91<--------***************************
Example=92
=========
NOTE:-
-----
PROGRAME=92
=========
EXPLANATION:-
============
***************************-----END of--->92<--------***************************
Example=93
=========
NOTE:-
-----
PROGRAME=93
=========
EXPLANATION:-
============
***************************-----END of--->93<--------***************************
Example=94
=========
NOTE:-
-----
PROGRAME=94
=========
EXPLANATION:-
============
***************************-----END of--->94<--------***************************
Example=95
=========
NOTE:-
-----
PROGRAME=95
=========
EXPLANATION:-
============
***************************-----END of--->95<--------***************************
Example=96
=========
NOTE:-
-----
PROGRAME=96
=========
EXPLANATION:-
============
***************************-----END of--->96<--------***************************
Example=97
=========
NOTE:-
-----
PROGRAME=97
=========
EXPLANATION:-
============
***************************-----END of--->97<--------***************************
Example=98
=========
NOTE:-
-----
PROGRAME=98
=========
EXPLANATION:-
============
***************************-----END of--->98<--------***************************
Example=99
=========
NOTE:-
-----
PROGRAME=99
=========
EXPLANATION:-
============
***************************-----END of--->99<--------***************************
Example=100
=========
NOTE:-
-----
PROGRAME=100
=========
EXPLANATION:-
============
***************************-----END of--->100<--------***************************