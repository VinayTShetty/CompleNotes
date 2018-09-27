TOPIC:-JAVA LANG PACKAGE
------
VIDEO NO=4
----------
NUMBER OF PICTURES=NULL
-----------------------
VIDEO COMPLETED=NO
---------------

IMPORTANT EXAMPLES:-

Example=7

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============

getClass() method:-
------------------
We can  use getClass() method to get RuntimeClass definition of an Object...

It is present in Object class..
public final native Class<?> getClass();

By using this Class class Object we can acess class level properties
like fully qualified name of the class,
methods information
constructor information ..etc

Ex:-I have an Object,but i don t know the corresponding class properties...?
like how many methods are there...etc..







***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
This concept is called Reflection concept..,(Where getClass() method plays a very important role)

If we want class Class Object we should use getClass() method.

For every .class file created JVM is gonna create a Class class Object in heap area.
That Class class Object is nothing but (Class x)
         
Object o=l.get(0);
Class x=o.getClass();
 
PROGRAME=2
=========
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
DP:-

We can use getClass() methods to get run time class definition of an Object.
public final native Class<?> getClass();
By Using this Class class Object we can acess class level properties like
fully qualified named of the class.
Mehtods information.
constructor information etc.

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
import java.lang.reflect.*; //Point 3
class Test
{
	public static void main(String [] args)
	{
		     int count=0;
             Object o=new String("vinay"); //Point 1
             Class c=o.getClass();
			 System.out.println("Full qualified information"+c.getName());
			 Method[] m=c.getDeclaredMethods();
			 System.out.println("Mehtod informaton");
			 for(Method m1:m)
		     {
				   count++;//Point2
			      System.out.println(m1.getName());
			 }

			  System.out.println("The number of methods="+count);
	} 
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Full qualified informationjava.lang.String
Mehtod informaton
equals
toString
hashCode
compareTo
compareTo
indexOf
indexOf
indexOf
indexOf
indexOf
indexOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
valueOf
charAt
checkBounds
codePointAt
codePointBefore
codePointCount
compareToIgnoreCase
concat
contains
contentEquals
contentEquals
copyValueOf
copyValueOf
endsWith
equalsIgnoreCase
format
format
getBytes
getBytes
getBytes
getBytes
getChars
getChars
indexOfSupplementary
intern
isEmpty
join
join
lastIndexOf
lastIndexOf
lastIndexOf
lastIndexOf
lastIndexOf
lastIndexOf
lastIndexOfSupplementary
length
matches
nonSyncContentEquals
offsetByCodePoints
regionMatches
regionMatches
replace
replace
replaceAll
replaceFirst
split
split
startsWith
startsWith
subSequence
substring
substring
toCharArray
toLowerCase
toLowerCase
toUpperCase
toUpperCase
trim
The number of methods=77

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Point 1:-Page 153 in that we have used arraylist to make it much easier we have used String concept..


Point 2:-
In this programe See the behaviour of count how it behaves as local variables..
In for-each loop count value is changed ,so it effects the outside the for-each count value also...

Point 3:-We are using Method[] concept which is present in reflect pacakage.
so we need to import.
java.lang is a default package we don t need to import.,
But Reflect is subpackage we need to import it..
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Last video Programes

PROGRAME=5
=========
Case:-1
-------
class Test
{
	public static void main(String [] args)
	{
         System.out.println(this);
	}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:5: error: non-static variable this cannot be referenced from a static context
         System.out.println(this);
                            ^
1 error

C:\Users\DELL\Desktop>

Case 2:-
--------

We cannot use super as a single we should compulsary use it as super.x or someting
class Test
{
	public static void main(String [] args)
	{
         System.out.println(super);
	}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:5: error: '.' expected
         System.out.println(super);
                                 ^
Test.java:5: error: ')' expected
         System.out.println(super);
                                  ^
Test.java:5: error: ';' expected
         System.out.println(super);
                                   ^
Test.java:7: error: reached end of file while parsing
}
 ^
4 errors

C:\Users\DELL\Desktop>

Case 4:-
--------
class Test
{
	void m1(){System.out.println(super);}
	public static void main(String [] args)
	{
         System.out.println("Vinay java 123");
	}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:3: error: '.' expected
        void m1(){System.out.println(super);}
                                          ^
Test.java:3: error: ')' expected
        void m1(){System.out.println(super);}
                                           ^
Test.java:3: error: ';' expected
        void m1(){System.out.println(super);}
                                            ^
Test.java:4: error: illegal start of expression
        public static void main(String [] args)
        ^
Test.java:4: error: ';' expected
        public static void main(String [] args)
              ^
Test.java:4: error: illegal start of expression
        public static void main(String [] args)
                      ^
Test.java:4: error: ';' expected
        public static void main(String [] args)
                               ^
Test.java:4: error: ';' expected
        public static void main(String [] args)
                                              ^
Test.java:8: error: reached end of file while parsing
}
 ^
9 errors

C:\Users\DELL\Desktop>

Case 5:-
--------
We can use this as a single entity no problem...
class Test
{
	void m1(){System.out.println(this);}
	public static void main(String [] args)
	{
         System.out.println("Vinay java 123");
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Vinay java 123

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============


GENERAL POINTS about Class class Object.
----------------------------------------
Class x=_____

 x Object..

Where this type of requirement is there..?

how to create connection Object...?

   Connection con =Driver.getConnection()...

 Connection is an interface how we are getting Connection Object...?
   Bcoz Vendor implemented class Object we are using...

   But which is vendor implemented class Object we are using...?
It may be different.
Mysql people gonna use 1 class name.
sql people gonna use 1 class name.
Oracle people gonna use 1 class name.

              So hardcoding of class name is not recomended.
			  It s gonna work only for MYSQL,or SQL..etc
			  If we are using different it may cause an error.

 So we are usign General API name is used..



DP:-To display database vendor specific connection interface implemented class name

Connection con=DriverManager.getConnection(....);
System.out.println(con.getClass().getName());



Vinay Explanation:-
-------------------
con.getClass().getName()

con.getClass()--->It return s Class class Object..
By using Class class Object we are calling getName() method..



Note:-1
-------
After loading the generated .class file , JVM is gonna Create a Class class Object in the Heap area 
that is java.lang.Class.

who s gonna use is Class class Object..?
   Programmer is gonna use this Class class Object to acess (correponding class) level properties...



DP:-After a loading every .class file JVM will create an Object of the type java.lang.Class in the heap area.
Programmer can use this Class class Object to get class level information.

We can use getClass() method very frequently in reflection concept..


***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
Importatnt Point:-
-----------------
Some time we have  an Object,But we dont know underlying class information,
to know the corresponding  class(Ex:-class x) information we use getClass() method.. 

getClass() return Class class Object by using Class class Object we can get
any information about the corresponding class(i.e class x)
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
method tutorial have not been completed...
i.e 
clone() method
 But durga sir told its completed so check once....

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

finalize() method
-----------------

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
