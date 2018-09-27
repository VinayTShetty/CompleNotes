TOPIC:-EXCEPTION HANDLING
--------
VIDEO NO=2
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
1(*****)
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

Inside the method If any Exception is raised,that method is responsible to create an Exception Object 
and then pass that Exceptin Object to JVM..
That Exception Object contains the following information...

Then JVM is gonna go to each caller method and See any Exception handling code is there.
If code is not there terminate the programe abnormallly and remove the corespondig entry from the stack.

This process continues untill main method..
If the main method also doesnt handle the called Exception Programe will get Terminated and JVM will
Remove the main method entry from the stack..

As For Page:-5(5) Programe..

Name of the exception-->Arithmetic Exception
Description of the exception-->Division by zero
Location of the exception.(StackTrace)--->method name(Where exception is raised)-->domoreStuff();
                                             |
										  method name(caller method)--->doStuff();
										     |
										  method name(caller-->1 method )-->main();
										     |
										  JVM(Point:-1)


Point:-1
After Removing main method form the stack for not handling the exception,
JVM is responsible to call the main method by indirectly control will come for JVM,
To handle this type of situtuation JVM will have one default Exception handler..
JVM will call that default Exception handler.
JVM is gonna pass that Exception Object to Exception Handler...

The main role for default Exception handler is to print the exception information to the 
console and terminate the programe abnormally.

It prints as 

Exception in thread "main" java.lang.ArithmeticException: / by zero
atTest.doMoreStuff(Test.java:10)
atTest.doStuff(Test.java:7)
atTest.main(Test.java:4)
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
Command Prompot:-

cd /
cd ..


***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
Last video:-

import java.io.*;
class Parent
{
	Parent() throws IOException
	{
	}
}
class Child extends Parent
{
       Child() throws Throwable
	{
	 super();
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
class Test
{
public static void main(String[] args)
	{
        doStuff();
    }
  public static void doStuff()
	  {
         doMoreStuff();
      }

public static void doMoreStuff()
	{
     System.out.println(10/0); 
     }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.doMoreStuff(Test.java:14)
        at Test.doStuff(Test.java:9)
        at Test.main(Test.java:5)

		The above programe terminated abnormally..

EXPLANATION:-
============
Stack Trace see here..

Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.doMoreStuff(Test.java:14)
        at Test.doStuff(Test.java:9)
        at Test.main(Test.java:5)

		Then JVM is gonna get coz main method is called by JVM.
		JVM then calls default Exception handler..

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============

Complete Theroey:-

1)Inside a method If an Exception occurs,then the method in which it is raised is responsible
  to create Exception object by including the following information..
   a)Name of Exception
   b)Description of Exception
   c)Location at which Exception occurs.

2) After creating Exception object method handovers that object to the JVM.

3)JVM will check wheather the method contains any Exception handling code or not,
If the method does nt contain Exception handling code then the JVM terminates that method abnormally
and removes corresponding entry from the stack.

4)Then JVM identifies caller method and checks wheather caller method contains any handling code or
not,If the caller method does nt contain handling code then JVM terminates the caller method
also abnormally and removes the corresoponding entry from stack.
This process will be continued untill main method and If the main method also does nt contain 
handling code then JVM Terminates main method also abnormally and removes corresponding entry 
from the stack.

5)Then JVM hand overs responsiblity to default Exception handler which is the part of JVM.
  default Exception handler prints Exception information in the following format and terminates
  the programe abnormally.




  Format:-   
   
   Exception in thread “xxx(main)” Name of exception: description
   Location of exception (stack trace)

***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 class Test
{
public static void main(String[] args)
	{
        doStuff();
    }
  public static void doStuff()
	  {
         doMoreStuff();
         System.out.println(10/0); 
      }

public static void doMoreStuff()
	{
       System.out.println("hello"); 
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.doStuff(Test.java:10)
        at Test.main(Test.java:5)

EXPLANATION:-
============
Observe dostuff() is gone..
compare Example:-4
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Test
{
public static void main(String[] args)
	{
        doStuff();
		System.out.println(10/0);
    }
  public static void doStuff()
	  {
         doMoreStuff();
         System.out.println("hi"); 
      }

public static void doMoreStuff()
	{
       System.out.println("hello"); 
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
hi
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:6)

EXPLANATION:-
============
Note:-If atleast one methods termninates abnormally
Then total programe terminates abnormally.

If all the methods Terminates normally,then the programe terminates normally.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----

PROGRAME=9
=========
EXPLANATION:-
============
Throwable is class name but not interface name..
It seems to interface name but not,,
Its a class name..

Throwable class contains the following two child classes.
1)Exception
2)Error


Exception:-
Most of the cases exceptions are caused by our program.

Example:-

try
{
   //read data from london file	
}
catch ()
{
}
    We are trying to read data from London file,
	we have prorgrmmed like that so exception occurs due to programe.


Recorevable means:-
If file not found Exception occurs provide local file and continue the rest of the
application.

Exception:-Most of the cases exceptions are caused by our program and these are recoverable.
Ex:-If our programming requirement is to read data from remote file locating at london.
At run time If remote file is not avaliable then we ll get RE saying 
File not found Exception..

Recorable:- If file not found Exception occurs we can provide local file and 
continue rest of the progrmae normnally.

try
{
	//read data from remote file locating at london
}
catch (FilenotFoundException e)
{
	//use localfile and continue the rest of the
   //programe normally.
}


Error:-out of memory occurs when sufficient heap memory is not there.
If out of memory occurs being a programmer we can t do anything and the programe will
be terminated abnormally.
System or Server admnin is responsible to increase heap memory.
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
