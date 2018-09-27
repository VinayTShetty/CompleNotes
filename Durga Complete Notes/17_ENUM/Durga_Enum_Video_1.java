TOPIC:-Enum 
--------
VIDEO NO=1
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
52:00

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
If we want to represent a group of named constatnts then we should go for Enum 
Enum Month
{
 JAN,FEB,MARCH, ...DEC;    //Here semicolon is optional.
}

 Enum Beer
 {
 KF,KO,RC,FO
 }


The main Objective of Enum is to define our OWN data types.(Enumerated Data types).


Other Programmig laungages 
Enum is group of named constants.


But in java Enum its completely different.



Enum is internallly a java class only.
Internally java Enum is class only.
We can take main method in Enum also and run in command prompt.


enum Beer
{

  KF,RC;
}


class Enum
{
	public static final Beer KF=new Beer();
	public static final Beer RC=new Beer();
}
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
enum Beer
{
   KF,RC,KO,FO;
}


class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		//We want to acess RC of Enum. Here RC is static variable of Enum.Static variables can be acessed by  using class name..
		//Every Enum constant is Object of the Type Enum.
		Beer b= Beer.RC;
        System.out.println(b);//When ever we are trying to print a Object Reference internally two String () method will be called.
		                      //Inside Enum toString() method is implemented to return the name of the Constant.
							  
	}
}



C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Hello World!
RC

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
Enum Declaration and uses


Every Enum is constatnt is public static final and hence we can acess Enum constatnts using Enum name.
Here we declared enum outside of the class..


Here one modification i am using this Beer enum inside the Test class not other places...
so is it possible to write enum directly inside the class...? 
Yes its possible inside just like innnerclass concept..

can we declare a enum inside a method just like method local inner class..?
Inside the methods static type declaration is not allowed.
so we cannot declare enum inside the mehtod..
we will get CE enum types must not be local...
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
enum Beer
{
   KF,RC,KO,FO
}


class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("Semicolon optionnal");
		
		
		Beer b= Beer.RC;
        System.out.println(b);
							  
	}
}





C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Semicolon optionnal
RC

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========



class  Test
{

	enum Beer
{
   KF,RC,KO,FO;
}
	public static void main(String[] args) 
	{
		System.out.println("Enum iside a class");
		
		
		Beer b= Beer.RC;
        System.out.println(b);
							  
	}
}





C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Semicolon optionnal
RC

C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Enum iside a class
RC

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
class  Test
{


	public static void main(String[] args) 
	{

			enum Beer
{
   KF,RC,KO,FO;
}
		System.out.println("Enum iside a method");
		
		
		Beer b= Beer.RC;
        System.out.println(b);
							  
	}
}



C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:8: error: enum types must not be local
                        enum Beer
                        ^
1 error

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============

We can declare enum eiether within the class,or outside the class.
we cannot declare inside the method.
If we are trying to declare inside a method,then we will get CE saying enum types must not be local.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
valid
------

enum x{}
class y{}


valid
-----

class X
{
	enum y{}
}


Invalid
-------

class X
{
	public void m1()
	{
	  enum{}
	}
}
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============

enum x{}
class y{}




For Top level class what are all the modifier s are allowed..?
  public,<default>,abstract,final,strictfp.


If we declare a enum outside the class.It acts just like a class.
Modifiers applicable for enum
1)public
2)default
3)strictfp.

Every Enum is always implicitly final but we cannot declare it as final..
illegal combination for Enum.
abstract and final illegal so we cannnot declare abstract.


If we declare outside of the class,the applicable modifier s are
1)public
2)default
3)strictfp





***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class X
{
	enum y{}
}

EXPLANATION:-
============
If we declare enum inside a class,its somewhat inner class.

If we declare a enum inside a class .It acts just like a  inner class.
Modifiers applicable for enum inside a class are.
1)public
2)default
3)strictfp.
4)private 
5)protected 
6)static 

Modifier s applicable are 

If we declare enum inside a class,the applicable modifiers are 

1)public
2)default
3)strictfp
4)private
5)protected
6)static

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
class X
{
	public void m1()
	{
	  enum{}
	}
}
EXPLANATION:-
============
Compile time error. we ll get...
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
Enum vs switch statement:

In switch allowed datatypes are
1)byte
2)short
3)char
4)int
this rule is applicable only untill 1.4 version.

From 1.5 version onwards because of autoboxing and autounboxing.
primitive and Object type 
primitive and Wrapper type there is no differene so the coresponding wrapper class es also u can take.

In switch allowed datatypes are
 
Primitive type.------>Wrapper class

1)byte ----------------->Byte
2)short----------------->Short           + Enum is also allowed.
3)char----------------->Character
4)int----------------->Integer


From 1.7 verison onwards we can pass String also we can pass.

Hence 1.5 version onwards we can pass enum types as argument to switch statement.

***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============

How to pass Enum as argument to switch.

Enum Beer
{
   KF,RC,FO
}

class Test
{
      Beer rc=Beer.RC
public static void main(String [] args)
		  {
	    switch(rc)
	  
         case KF:System.out.println("king fisher");
		 break;

		 case RC:System.out.println("Royal chalaenger");
		 break;

		 case FO:System.out.println("Foster Bear");
		 break;
    }
	  
	    }
		
	{

}
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========

enum Beer
{
KF,KO,RC,FO;
}
class Test{
public static void main(String args[]){
Beer b1=Beer.RC;
switch(b1){
case KF:
System.out.println("it is childrens brand");
case KO:
System.out.println("it is too lite");
break;
case RC:
System.out.println("it is too hot");
break;
case FO:
System.out.println("buy one get one");
break;
default:
System.out.println("other brands are not good");
}
}}

C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
it is too hot

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
enum Beer
{
KF,KO,RC,FO;
}
class Test{
public static void main(String args[]){
Beer b1=Beer.RC;
switch(b1)  // If we pass Enum  type as argument to switch statement. Then Every case label should be valid Enum constatnt only.If  not we will Get CE. as below.
	{
case Vinay:
System.out.println("it is childrens brand");
case 10:
System.out.println("it is too lite");
break;
case RC:
System.out.println("it is too hot");
break;
case FO:
System.out.println("buy one get one");
break;
default:
System.out.println("other brands are not good");
}
}}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
it is too hot

C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:9: error: an enum switch case label must be the unqualified name of an enumeration constant
case Vinay:
     ^
Test.java:11: error: an enum switch case label must be the unqualified name of an enumeration constant
case 10:
     ^
2 errors

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
If we pass Enum  type as argument to switch statement. 
Then Every case label should be valid Enum constatnt only.If  not we will Get CE. as below.


We can  overcome this problem by adding Vinay to enumm list .
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
enum Beer
{
KF,KO,RC,FO,Vinay;
}
class Test{
public static void main(String args[]){
Beer b1=Beer.RC;
switch(b1)
	{
case Vinay:
System.out.println("it is childrens brand");
case 10:
System.out.println("it is too lite");
break;
case RC:
System.out.println("it is too hot");
break;
case FO:
System.out.println("buy one get one");
break;
default:
System.out.println("other brands are not good");
}
}}



C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:12: error: an enum switch case label must be the unqualified name of an enumeration constant
case 10:
     ^
1 error

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
enum Beer
{
KF,KO,RC,FO,Vinay,10;
}
class Test{
public static void main(String args[]){
Beer b1=Beer.RC;
switch(b1)
	{
case Vinay:
System.out.println("it is childrens brand");
case 10:
System.out.println("it is too lite");
break;
case RC:
System.out.println("it is too hot");
break;
case FO:
System.out.println("buy one get one");
break;
default:
System.out.println("other brands are not good");
}
}}




C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:3: error: <identifier> expected
KF,KO,RC,FO,Vinay,10;
                  ^
1 error

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
enum Beer
{
KF,KO,RC,FO,Vinay;
}
class Test{
public static void main(String args[]){
Beer b1=Beer.RC;
switch(b1)
	{
case Vinay:
System.out.println("it is childrens brand");
case KF:
System.out.println("it is too lite");
break;
case RC:
System.out.println("it is too hot");
break;
case FO:
System.out.println("buy one get one");
break;
default:
System.out.println("other brands are not good");
}
}}



C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
it is too hot

C:\Users\vinay.ts\Desktop>
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
