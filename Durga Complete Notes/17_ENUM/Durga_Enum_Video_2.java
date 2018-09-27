TOPIC:-Enum 
--------
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
enum vs inheritance.






enum beer{}

enum month{}              all the 3 extends java.lang.Enum.

enum Fish{}

Every enum in java is a direct child class of java.lang.
Hence our enum can t extend any other enum.Bcoz java won t support for multiple inheritance..

Every enum is final always implicitly and hence for our enum we can t create child enum.

Because of above reason we can conclude inheritance concept not applicable for enum explicitly.And we can t use extends keyword for
enum.




***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
Valid
-------
enum X{}
enum Y extends X{}

EXPLANATION:-
============
enum X{}
enum Y extends X{}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:2: error: '{' expected
enum Y extends X{}
      ^
Test.java:2: error: ',', '}', or ';' expected
enum Y extends X{}
       ^
Test.java:2: error: '}' expected
enum Y extends X{}
              ^
3 errors

C:\Users\vinay.ts\Desktop>
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
Valid
-------
enum X extends java.lang.enum{}

Microsoft Windows [Version 10.0.17134.165]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\vinay.ts>cd desktop

C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:1: error: '{' expected
enum X extends java.lang.enum{}
      ^
Test.java:1: error: ',', '}', or ';' expected
enum X extends java.lang.enum{}
       ^
Test.java:1: error: '}' expected
enum X extends java.lang.enum{}
              ^
Test.java:1: error: <identifier> expected
enum X extends java.lang.enum{}
                             ^
4 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
It does nt matter you are extending the java.lang.Enum.
compilere will care that you can t use extend keyword aste..



//If we are using captial letters.. Enum
enum X extends java.lang.Enum{}

C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:1: error: '{' expected
enum X extends java.lang.Enum{}
      ^
Test.java:1: error: ',', '}', or ';' expected
enum X extends java.lang.Enum{}
       ^
Test.java:1: error: '}' expected
enum X extends java.lang.Enum{}
              ^
3 errors

C:\Users\vinay.ts\Desktop>

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
class X{}
enum Y extends X{}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:2: error: '{' expected
enum Y extends X{}
      ^
Test.java:2: error: ',', '}', or ';' expected
enum Y extends X{}
       ^
Test.java:2: error: '}' expected
enum Y extends X{}
              ^
3 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
For enum extends keyword is not applicable.

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
enum X{}
class Y extends X
{
}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:2: error: cannot inherit from final X
class Y extends X
                ^
Test.java:2: error: enum types are not extensible
class Y extends X
^
2 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
every enum is always final.If its always final we can t create child class..

Here we are not using extends keyword to enum,.
that is fine,but we should also not use extends from other class to enum bcoz enum is  final and we cannot extend it.

after extends keyword we are using enum,so we are getting error.
cannot inherit from final enum.


***************************-----END of--->5<--------**************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("interface X enum Y implements X{}");
	}
}


interface X
{
}
enum Y implements X{}



C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
interface X enum Y implements X{}

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============

while extending java.lang.enum we cannot extend any other.

while extending java.lang.enum we can implement interface . its valid..

enum can implement any number of interface s.

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
Page 72.
PDF page 7.

EXPLANATION:-
============
Conclusions about enum.

Every enum in java is a direct child class java.lang.Enum.So java.lang.Enum acts as Base class for all enum.



java.lang.Enum is direct class of Object.

Object class
  |
  |
  |
java.lang.Enum.

java.lang.Enum is abstract class..
java.lang.Enum implements serilizable,comparable interfaces.(Enum Object we can pass across the network and We can compare 2 Enum also like order wise which is greater and higher.)


C:\Users\vinay.ts\Desktop>javap java.lang.Enum
Compiled from "Enum.java"
public abstract class java.lang.Enum<E extends java.lang.Enum<E>> implements java.lang.Comparable<E>, java.io.Serializable {
  public final java.lang.String name();
  public final int ordinal();
  protected java.lang.Enum(java.lang.String, int);
  public java.lang.String toString();
  public final boolean equals(java.lang.Object);
  public final int hashCode();
  protected final java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public final int compareTo(E);
  public final java.lang.Class<E> getDeclaringClass();
  public static <T extends java.lang.Enum<T>> T valueOf(java.lang.Class<T>, java.lang.String);
  protected final void finalize();
  public int compareTo(java.lang.Object);
}

C:\Users\vinay.ts\Desktop>


***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
enum Beer
{
KF,KO,RC,FO;
}
class Test{
public static void main(String args[]){
Beer[] b=Beer.values();
for(Beer b1:b)//this is forEach loop.
{
System.out.println(b1);
}}}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
KF
KO
RC
FO

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
enum Beer
{
KF,KO,RC,FO;
}
class Test{
public static void main(String args[]){
Beer[] b=Beer.values();
for(Beer b1:b)//this is forEach loop.
{
System.out.println(b1+"..."+b1.ordinal());
}}}



C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
KF...0
KO...1
RC...2
FO...3

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
values() method is Static method.

We cannot find values() method in java.lang.Enum see here but then also how we can we call this method..?


C:\Users\vinay.ts\Desktop>javap java.lang.Enum
Compiled from "Enum.java"
public abstract class java.lang.Enum<E extends java.lang.Enum<E>> implements java.lang.Comparable<E>, java.io.Serializable {
  public final java.lang.String name();
  public final int ordinal();
  protected java.lang.Enum(java.lang.String, int);
  public java.lang.String toString();
  public final boolean equals(java.lang.Object);
  public final int hashCode();
  protected final java.lang.Object clone() throws java.lang.CloneNotSupportedException;
  public final int compareTo(E);
  public final java.lang.Class<E> getDeclaringClass();
  public static <T extends java.lang.Enum<T>> T valueOf(java.lang.Class<T>, java.lang.String);
  protected final void finalize();
  public int compareTo(java.lang.Object);
}

C:\Users\vinay.ts\Desktop>



values() method..

Every enum implicity contain values() method to list all values present inside Enum class.
values () method not present in java.lang.Enum and Object class es.

Enum keyword implicitly provides this method..

Similar to values() method one more method is there that is Ordinal () method..//But Ordinal method is there in java.lang.Enum


Ordinal () means order of array.

we can find the ordinal values by using ordinal() method.(In which order it is placed that is index).

Inside Enum order of constatnt is important and we can represent this  order by using ordinal value.
we can find ordinal values of Enum constant by using ordinal method.

 public final int ordinal();
 ordinal() values is 0 based.like array index.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
Speciality of java enum:

What ever we can take inside a class all those we can take in enum.
In old laungages enum we can take only constants,but in java enum in addition to constant s we can take 
methods,constructors,normal variables,etc.
Hence java enum is more powerfull then old laungages enum.

Inside java enum we can take main method ,
even inside java enum we can declare main method and we can run enum class directly command prompt.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
enum Test
{
	FISH,GOLD,APOLO;
public static void main(String args[])
	{
      System.out.println("inside enum main method");
    }

}

Microsoft Windows [Version 10.0.17134.165]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
inside enum main method

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
enum Test
{
	FISH,GOLD,APOLO
public static void main(String args[])
	{
      System.out.println("inside enum main method");
    }

}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:4: error: ',', '}', or ';' expected
public static void main(String args[])
^
Test.java:4: error: '}' expected
public static void main(String args[])
      ^
Test.java:7: error: class, interface, or enum expected
    }
    ^
3 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============

In addition to constatnts If we are taking any other extra member(like variables,methods,.. etc) than compulsary list of constatns should
end with Semicolon(;).


***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
enum Test
{

public static void main(String args[])
	{
      System.out.println("inside enum main method");
    }

		FISH,GOLD,APOLO

}



C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:2: error: <identifier> expected
{
 ^
Test.java:4: error: ',', '}', or ';' expected
public static void main(String args[])
^
Test.java:4: error: '}' expected
public static void main(String args[])
      ^
Test.java:7: error: class, interface, or enum expected
    }
    ^
4 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============

Compulsary the list of constatnts should be in the frist line and end with semicolon(;).
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
enum Test
{

public static void main(String args[])
	{
      System.out.println("inside enum main method");
    }

		FISH,GOLD,APOLO;

}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:2: error: <identifier> expected
{
 ^
Test.java:4: error: ',', '}', or ';' expected
public static void main(String args[])
^
Test.java:4: error: '}' expected
public static void main(String args[])
      ^
Test.java:7: error: class, interface, or enum expected
    }
    ^
Test.java:11: error: class, interface, or enum expected
}
^
5 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============


Note:-In addition to constatnts if we are taking any extra members like a method s ..etc.
Then list of constatnt s  in the enum should be in the frist line and should end s with ;


***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
EXPLANATION:-
============

Valid
-----
enum Test
{
FISH,GOLD,APOLO;
public static void main(String args[])
	{
      System.out.println("inside enum main method 123");
    }

}

InValid
-------
enum Test
{
FISH,GOLD,APOLO
public static void main(String args[])
	{
      System.out.println("inside enum main method 123");
    }

}	


InValid
-------
enum Test
{

	public static void main(String args[])
		{
		  System.out.println("inside enum main method 123");
		}
FISH,GOLD,APOLO;
}	


Enum constatnts should be in the Frist line of the code and should be enclosed with semicolon(;).

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
enum Test
{

public  void m1()
	{
      System.out.println("m1 method");
    }

}	




C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:2: error: <identifier> expected
{
 ^
Test.java:4: error: ',', '}', or ';' expected
public  void m1()
^
Test.java:4: error: '}' expected
public  void m1()
      ^
Test.java:7: error: class, interface, or enum expected
    }
    ^
4 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
In enum if we are taking any constants other than methods that it should be in the frist line 
and end with semicolon.(;).

Here we are not taking (;) but we are taking other members of the class like methods
so compulsary we need to put a blank semicolon.(;) in the frist line. See Example 17.
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
enum Test
{
;
public  void m1()
	{
      System.out.println("m1 method");
    }

}	


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
enum Test
{
;
public  void m1()
	{
      System.out.println("m1 method");
    }

	public static void main(String args[])
	{
      System.out.println("semicolon in the frist");
    }

}	


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
semicolon in the frist

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============


Inside enum if we are taking any extra member like a method compulsary the frist line should contain the list of constants
at least semicolon(;).


***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
enum Test
{


}	


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
An empty enum is a valid java syntax.
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
enum Test
{
  ;

}	


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>
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
