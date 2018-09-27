TOPIC:-Serialization
--------
VIDEO NO=1
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============

Page 287


Suppose assume we have to write an Dog Object into abc.ser file.
But Object  are binary data.

To write binary data to abc.ser file we have to use File Output Stream.
Here we cannot write the object directly into abc.ser file using File Output Stream.

So we use Object outputStream,by using this Object outputStream we ll call a method 
WriteObject("pass object parameter").




***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========	
EXPLANATION:-
============

Deserialization:-



on FileInputStream open ObjectInputStream
this ObjectInputStream contains one method readObject();
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========

Page 288 some  points..

import java.io.*; //File O/p,File I/p these are present in IO package so we need to import it.


class Dog implements Serializable { //Point 1(important)
	int i = 10;
	int j = 20;
}

class Test {


public static void main(String args[]) throws Exception { //While writing reading and writing there 
                                                          //might be IO Exception so we use Exception
		
		
		
		Dog d1 = new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
		
		Dog d2 = (Dog) ois.readObject();//The return type of readObject() is Object type so we need to
		                                //type cast it.


		System.out.println("Deserialization ended");
		System.out.println(d2.i + "................" + d2.j);
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Serialization started
Serialization ended
Deserialization started
Deserialization ended
100................200

C:\Users\DELL\Desktop>




EXPLANATION:-
============

Important Point:-
----------------
Point 1:-
Serializable is an interface so implements not extends.


If we want to serialize an Object compulsary that object class implement Serializable interface.

Here we are Serializable ing Dog object so compulsary we need to implement Serializable interface.


----------------

and i guess Serializable  is an marker interface.
so we need not to implement any methods.(My point so do some R&D)



DP:-43:00(43:44)


Its a marker interface  durga sir told..

Dog class doesent need to implemetn any methods of Serializable,coz its a marker interface..
Serializable is also present in java.io package.
--------------------------------------------------------------------------------------------
Here abc.ser is not there then also no error is there wat s the reason please...?


But i observed that abc.ser file extension is created in Desktop..i checked it later..
i think we can create any type of .file
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----

Not implements Serializable see the problem..


PROGRAME=4
=========

import java.io.*;

class Dog  {
	int i = 100;
	int j = 200;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println(d2.i + "................" + d2.j);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Serialization started
Exception in thread "main" java.io.NotSerializableException: Dog
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
        at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
        at Test.main(Test.java:15)

C:\Users\DELL\Desktop>



EXPLANATION:-
============

class Dog doesent implemetn Serializable so its a run time Exception observe... 
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
Transient keyword:-
-------------------

transient is the modifier applicable only for variables.
we cannot apply for methods and class es.

***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
 
import java.io.*;

class Dog implements Serializable {
	int i = 100;
	 transient int j = 200;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println(d2.i + "................" + d2.j);
	}
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Serialization started
Serialization ended
Deserialization started
Deserialization ended
100................0

C:\Users\DELL\Desktop>


EXPLANATION:-
============

int i = 100;
transient int j = 200;

'i' less secure..
but 'j' i want more secure so declared as transient  
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 
import java.io.*;

class Dog implements Serializable {
	transient  int i = 100;
	 transient int j = 200;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println(d2.i + "................" + d2.j);
	}
}





C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Serialization started
Serialization ended
Deserialization started
Deserialization ended
0................0

C:\Users\DELL\Desktop>

EXPLANATION:-
============
transient  int i = 100;
	 transient int j = 200;


	 See both transient...more secure..
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----


static vs transient.

PROGRAME=8
=========
 
import java.io.*;

class Dog implements Serializable {
	  static  transient  int i = 100;
	  int j = 200;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println(d2.i + "................" + d2.j);
	}
}





C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Serialization started
Serialization ended
Deserialization started
Deserialization ended
100................200

C:\Users\DELL\Desktop>

EXPLANATION:-
============

Durga Point
-----------




whenever we are creating an object instance variables will be created.

static variables are class level data.
static variable will be comming from method area.

static variable is not part of object in java,only instance variables are part of objects.
But serilization concept is applicable only for objects.
so static variable won t participate in serialization.


See page 291

Here variable  int  i static.
so static variable will be created frist during class loading.



***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
 import java.io.*;

class Dog implements Serializable {
	  static    int i = 100;
    transient int j = 200;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("Deserialization ended");
		System.out.println(d2.i + "................" + d2.j);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Serialization started
Serialization ended
Deserialization started
Deserialization ended
100................0

C:\Users\DELL\Desktop>


EXPLANATION:-
============

Here static variable value we are getting so declaring static variable as transient is of non use.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============


static variable is not part of object state hence, they won't participate in
serialization.Due to this declaring a static variable as transient there is no
use.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============


final vs transient

Every final variable assigned types will be replaced by the value at compile time only.




Ex:-
-----

final int x=10;
int y=20;
sopln(x);
sopln(y);

After compilation we ll get as

sopln(10);
sopln(y);


the value of x will be always 10 .It won t change.
so at the time of compilation itself it compiler will replace its value where ever its used.


But normal variable y can be changed so it will not be replaced by compiler.
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
