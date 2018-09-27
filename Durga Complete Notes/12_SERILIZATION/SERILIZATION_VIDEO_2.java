TOPIC:-SERIALIZATION 
--------

Serilization in case of Object Graphs.(43:45)

VIDEO NO=2
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


294 page 


see theorey.


We can serialize any number of Objects to the file.
But in which order we serialized in the same order only we should de-serilize.
i.e Order of Objects is important in serilization..

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============

Suppose in the morning x person seriliazed in the order
Dog d=new Dog();
Cat c=new Cat();
Rat r=new Rat();

In the evening Y person have to de-serilize then wat is the solution..?


If we don t know order of Object s in serilization we should follow this...?


Solution:-1
------------
FileInputStream fis=new FileInputStream ("abc.ser");
ObjectInputStream ois= new ObjectInputStream (fis);
Object o=ois.readObjects();


Here the problem is by using ----> 'o '
we can only call Parent specific methods 
Child specific methods we can t call..
This is the dis advantage..


so we need to modify according to this by using if() condition and instanceof operator..




Solution:-2
------------

FileInputStream fis=new FileInputStream ("abc.ser");
ObjectInputStream ois= new ObjectInputStream (fis);
Object o=ois.readObjects()

if(o instanceof Dog )
   {
      Dog d2=(Dog)o
		  //Perform dog specific functionality
   } 
else if(o instanceof Cat )
   {
      Cat c2=(Cat)o
		  //Perform cat specific functionality
   }

else if(o instanceof Rat )
   {
      Rat r2=(Rat)o
		  //Perform rat specific functionality
   }


Some doubt from my side:-16:30 and durga sir told some clue.
but did nt understand.

Here there are 100 objects for every objects we can t write if() condition and else if() condition
so use While() or for() loop condition and



FileInputStream fis=new FileInputStream ("abc.ser");
ObjectInputStream ois= new ObjectInputStream (fis);
Object o=ois.readObjects()

While( o isnot equal to null ) //some condition like this    16:15(See once again when free)
	
	{

   if(o instanceof Dog )
    {
      Dog d2=(Dog)o
		  //Perform dog specific functionality
    } 
   else if(o instanceof Cat )
   {
      Cat c2=(Cat)o
		  //Perform cat specific functionality
   }

    else if(o instanceof Rat )
    {
      Rat r2=(Rat)o
		  //Perform rat specific functionality
    }
}

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========

EXPLANATION:-
============


Page 296 diagram

class Dog
{
   Cat c=new Cat();
}

class Cat
{
	Rat r=new Rat();
}

class Rat
{
	int j=10;
}


(21:06)
Important Point:-
Page 296 diagram
Whenever we are creating ONE  Dog d=new Dog(); automatically Cat object will be created coz we writing an
instance of Cat in Dog class..

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
import java.io.*;

class Dog 
	{
 	Cat c = new Cat();
   }

class Cat 
	{
	Rat r = new Rat();
  }

class Rat   
	{
	int j = 20;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.j);
	}
}


//its run time exception..

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.io.NotSerializableException: Dog
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
        at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
        at Test.main(Test.java:23)

C:\Users\DELL\Desktop>

EXPLANATION:-
============

Reason is here we are trying to serialize Dog object but Dog class doesnt implement serilizable so
its RE.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
import java.io.*;

class Dog implements Serializable {
	Cat c = new Cat();
}

class Cat {
	Rat r = new Rat();
}

class Rat {
	int j = 20;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.j);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.io.NotSerializableException: Cat
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
        at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
        at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
        at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
        at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
        at Test.main(Test.java:20)

C:\Users\DELL\Desktop>


EXPLANATION:-
============

Here we are trying to serialize Dog object and Dog class implements Serializable.
but Dog class contain s cat Object and we are not Serializable ing Cat object so we are getting
RE.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
import java.io.*;

class Dog implements Serializable {
	Cat c = new Cat();
}

class Cat implements Serializable {
	Rat r = new Rat();
}

class Rat {
	int j = 20;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.j);
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.io.NotSerializableException: Rat
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1184)
        at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
        at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
        at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
        at java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1548)
        at java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1509)
        at java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1432)
        at java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1178)
        at java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:348)
        at Test.main(Test.java:20)

C:\Users\DELL\Desktop>


EXPLANATION:-
============

Here we are trying so Seriliaze Dog object and Dog Object implemetnts Serializable,and
Dog Object contain Cat object and we are Serilizaing Cat object also and  cat class implements
also Serializable.But cat class contain Rat object,But we are Serilizaing Rat object also here.
But we are not implementing Serializable to Rat class.
so we are getting RE.
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----

Important Point:-
--------------------
In object graphing all objects must be Serialized.. 



DP:-When ever we are Serializing an object,the set of all objects which are reachable from
that object will be serialized automatically.These group of objects is nothing but Object Graph.

In Object graph every object should be Serialized.
If atleast one Object is not Serialized we will RE saying NotSerializableException.


In the above programe when ever we are serializing Dog object automatically 
cat and Rat objects will be serialized coz these are part of Object graph of Dog..
Amog Dog,Cat and Rat object if atleast one object is not Seriliazed then we ll get RE saying
NotSerializableException.


See diagram on Notes:-
297
PROGRAME=7
=========
import java.io.*;

class Dog implements Serializable {
	Cat c = new Cat();
}

class Cat implements Serializable {
	Rat r = new Rat();
}

class Rat implements Serializable {
	int j = 20;
}

class Test {
	public static void main(String args[]) throws Exception {
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.c.r.j);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
20

C:\Users\DELL\Desktop>


EXPLANATION:-
============

System.out.println(d2.c.r.j);

Here we are taking d2 and all remains same for c r j see it..


its like complete Object we are getting from De-serilization and that object we are 
catching using another( i.e d2) Dog reference.
that d2 internally contains all objects..

***************************-----END of--->7<--------***************************

Example=8
=========

NOTE:-
-----

PROGRAME=8
=========

EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
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
