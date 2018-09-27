TOPIC:-Exception Handling
--------
VIDEO NO=8
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
1)JVM Exception.
   ex:-Arithmetic Exception

System.out.println(10/0);
JVM is gonna rise ArithmeticException automatically.Such type of Exception is JVM created Exception.

System.out.println(10/0);
throw new ArithmeticException();

We never write throw new ArithmeticException();
JVM is gonna rise automatically.

2)Programmer Exception:-
The Exception raised by programmer is called Programmer Exception.
All customized Exception are Programmer raised Exception.
Ex:-TooOldException,TooYoungException,


3)API developer.
String class,Thread class.

In Thread class set priority method can accept priority from 1-10.
Thread priority is from 1-10.
Ex:- of API 

Thread t=new Thread();
t.setPriority(10); //valid

t.setPriority(15); //Invalid
---->illegal argument Exception we ll get..
    
	
	In Thread class see 
	
	class Thread
	{
		 public final void setPriority(int newPriority) {
        ThreadGroup g;
        checkAccess();
        if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
            throw new IllegalArgumentException();
        }
        if((g = getThreadGroup()) != null) {
            if (newPriority > g.getMaxPriority()) {
                newPriority = g.getMaxPriority();
            }
            setPriority0(priority = newPriority);
        }
       }
	}

API developer has written this code in Thread class.
If API has rised an Exception then its called API raised Exception.

-------------------------------------------------------------------
In java 3 people can rise an Exception.
--------------------------------------
1)JVM
2)Programmer
3)API

2 Types of Exception are 
=========================
1)JVM
2)Programmer or API
It is raised by programmer so it belog to programmer created Exception.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
ArrayIndexOutOfBoundsException is a Child class of IndexOutOfBoundsException

 IndexOutOfBoundsException (Parent)
                             ---->ArrayIndexOutOfBoundsException (Child)
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
Some important Example of Type casting go through..
class cast Exception is not understood in this so do study once again of this type casting..
Page:-30(PDF:-30)
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
StackoverflowError:-

In java For every Thread JVM is gonna create a RunTime stack
(RunTime Stack means one method call over other.).

In this Example only one Thread is there that is main Thread,so JVM is gonna create 
one Run Time stack.

Each and Every method call performed by this Thread will be stored in the correponding stack.

main Thread is responsible to call which method..?
It s responsible to call main method.

In this Example main Thread after calling main method it, internally calls mehtodone();
---------------------------------------------
RunTime Stack:-
          

		  .
          .
       methodOne
       methodTwo
       methodOne
       main()--->called by main Thread.
---------------------------------------------
PROGRAME=4
=========
class Test
{
public static void methodOne()
{
methodTwo();
}

public static void methodTwo()
{
methodOne();
}
public static void main(String[] args)
    {
            methodOne();
     }
}
        at Test.methodTwo(Test.java:10)
        at Test.methodOne(Test.java:5)
        at Test.methodTwo(Test.java:10)
        at Test.methodOne(Test.java:5)
        at Test.methodTwo(Test.java:10)
        at Test.methodOne(Test.java:5)

EXPLANATION:-
============
StackOverflowError:-
It is a Child class of error,hence it is unchecked rised automatically by JVM,
When ever we are trying to perform recursive method call.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Last video programe.

PROGRAME=5
=========
class TooYoung extends RuntimeException
{
	TooYoung(String s)
	{
 	}
}

class TooOld extends RuntimeException
{
	TooOld(String s)
	{
     }
}


class CustExcepDemo
{
	public static void main(String [] args)
	{
       int age=Integer.parseInt(args[0]);
	   if (age >60)
	   {
		   throw new TooYoung ("please wait for some more time definitely will get best match."); 
	   }
         else if(age<18)
		{
            throw new TooOld(" ur age is already over for marriage and no chance for marriage");
		}
		else
		{
             System.out.println("you will get match detail in mail");
 		}
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java CustExcepDemo 15
Exception in thread "main" TooOld
        at CustExcepDemo.main(Test.java:27)
EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
Did nt got output see wat s the reason for,
not geting  NoClassDefFoundError...

i am getting Error: Could not find or load main class Test If i do the same procedure.


PROGRAME=7
=========

class Test
{
public static void main(String[] args)
    {
           System.out.println("hello");
     }
}
        
		C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Error: Could not find or load main class Test

If we have deleted the .class file and then Running the java Test




Unable to get the error of NoclassDefFoundError.
If delete and Run the java programe means i am getting 
Error: Could not find or load main class Test


But in Durga video -38:00 explanation is there.Hes getting NoClassDefFoundError.
But If i do the same i will get Error: Could not find or load main class Test.

EXPLANATION:-
============
NoClassDefFoundError::-
Its a Run time Exception, 

Its not compiler responsibilty for checking the .class file so its an Exception.

Rised auomatically by JVM whenever JVM unable to find require .class file.
java Test
If Test .class is not avaliable saying NoClassDefFoundError
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
If JVM unable to find the required .class file then JVM gonna rise a run time Exception saying
NoClassDefFoundError.

PROGRAME=8
=========

Case:-1
-------
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new Exam();
	}
}

C:\Users\DELL\Desktop>javac Test.java
Test.java:6: error: cannot find symbol
                new Exam();
                    ^
  symbol:   class Exam
  location: class Test
1 error


Case :-2
--------
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new Exam();
	}
}

class Exam
{
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Hello World!

Case 3:-
--------
Same programe as Case 2,but we are deleting the required .class file that is Exam.CLASS after compiling.

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Vinay");
		new Exam();
	}
}


class Exam
{
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Vinay
Exception in thread "main" java.lang.NoClassDefFoundError: Exam
        at Test.main(Test.java:6)
Caused by: java.lang.ClassNotFoundException: Exam
        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        ... 1 more


Case 4:-
--------
Deleting the .class file having the main method.(i.e Test.class)
Same programe as Case:-2.
We ll get different error see.

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Vinay");
		new Exam();
	}
}

class Exam
{
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Error: Could not find or load main class Test

EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Vinay Point:-
In this case we should get ArithmeticException /by zero but we are not getting 
coz internal reason may be frist static flow control will come into picture..
Do some R & D.
study static control flow frist..


ExceptionInInitializerError:-These may occur during only 2 cases like 
static variable assignment and staic block execution.

PROGRAME=9
=========
class Test 
{
	static int x=10/0;
	public static void main(String[] args) 
	{
		System.out.println("Vinay");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArithmeticException: / by zero
        at Test.<clinit>(Test.java:3)

EXPLANATION:-
============
Durga Point:-
Whenever we are executing static block or static variable assignmet,If any Exception
occurs then we ll get ExceptionInInitializerError.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
untill 1.6 version main method is optional.

From 1.6 version main method is compulsary for the execution of class.
so we are not getting that ExceptionInInitializerError.
PROGRAME=10
=========
class Test 
{
	static int x=10/0;
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
In static block.

PROGRAME=11
=========
class Test 
{
	static
		{ int x=10/0; }
	public static void main(String[] args) 
	{
		System.out.println("Vinay");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.ArithmeticException: / by zero
        at Test.<clinit>(Test.java:4)

EXPLANATION:-
============
Caused by: java.lang.ArithmeticException: / by zero

observe this in Exception information.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
 C:\Users\DELL\Desktop>java -version
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

PROGRAME=12
=========

EXPLANATION:-
============
java -version 
command.

2)
set path=<>

<directory path> no --->   " "
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========

 class Test 
{
	static
		{ String s=null; }
	public static void main(String[] args) 
	{
		System.out.println("hi vinay");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
hi vinay

EXPLANATION:-
============

***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
We are not getting NullPointerException,we are getting ExceptionInInitializerError coz due to static flow
control i guess.

PROGRAME=14
=========
class Test 
{
	static
		{
		String s=null;
		System.out.println(s.length());
	    }
	public static void main(String[] args) 
	{
		System.out.println("hi vinay");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.NullPointerException
        at Test.<clinit>(Test.java:6)

EXPLANATION:-
============
Caused by: java.lang.NullPointerException  

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========

      
EXPLANATION:-
============
ExceptionInInitializerError:-It is Child class of error,hence it s unchecked.
raised automatically by JVM if any Exception occurs while executing static variable assignments and
static blocks.
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
 
PROGRAME=16
=========
class Test 
{
		{
		String s=null;
		System.out.println(s.length());
	    }
	public static void main(String[] args) 
	{
		System.out.println("hello vinay");
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
hello vinay

EXPLANATION:-
============
Instance block is not getting a chance to execute coz we are not creating an Object.
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
Reason same as Example:-16

PROGRAME=17
=========
 class Test 
{
	    String s=null;
		void m1()
	      {
            System.out.println(s.length());
		  }
	    
	public static void main(String[] args) 
	{
		System.out.println("hello ");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
hello

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
