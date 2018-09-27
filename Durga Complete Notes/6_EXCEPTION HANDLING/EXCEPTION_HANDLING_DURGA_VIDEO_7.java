TOPIC:-	EXCEPTION HANDLING
--------
VIDEO NO=7
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-

7(Doubt)(5*)
8(Doubt)(5*)


15(case 2)
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
Exception handling keywords summary:
1. try: To maintain risky code.
2. catch: To maintain handling code.
3. finally: To maintain cleanup code.
4. throw: To handover our created exception object to the JVM manually.
5. throws: To delegate responsibility of exception handling to the caller method.
           (Caller  may be method and JVM)



 The various COMPILE TIME ERROR during Exception Handling
  Note:-
            ----------->(Compile Time Error)
			In page 26(PDF 26)
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
class Test
{  
  public static void main(String args[])
  {
       try
       {
    		  throw new Exception();
	   }
       catch (Exception e) 
       {
            System.out.println(e);         
       }
   } 
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
java.lang.Exception

EXPLANATION:-
============
Analyize the code.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class Test
{  
  public static void main(String args[])
  {
          throw new Exception();     
  } 
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unreported exception Exception; must be caught or declared to be thrown
          throw new Exception();
          ^
1 error

EXPLANATION:-
============
Analyize the code.
Exception is a Checked Exception,i guess so compiler is asking us to handle the it.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============

Some times to meet programmer requirements our own Exception.
such type of Exception s are called customized or user defined Exception.

Ex:-

1. InSufficientFundsException
2. TooYoungException
3. TooOldException

 Every Exception is a java class only.
If we want to define our own Exception,
then our class should Child class of Throwable / be under Throwable directly or
indirectly.Then only our class will get those ability.

Refer Example:-16

Doubt:- See IF we use 
class Test extend Throwable 
we ll get Exception ability or not ...?

Note:-If we want to provide some description about that Exception,
use constructor with String as argument.
coz when we create new xxxx() automatically that xxx class constructor will be Executed.


***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
extends Throwable.

PROGRAME=5
=========

class Test extends Throwable 
{  
	Test(String s)
	{
		
	}
	public static void main(String[] args)
	{
            throw new Test("Java King");
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:9: error: unreported exception Test; must be caught or declared to be thrown
            throw new Test("Java King");
            ^
1 error


Case 2:-
---------


EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========

class Test extends Throwable 
{  
	Test(String s)
	{
		
	}
	public static void main(String[] args)
	{
            try
            {
				throw new Test("Java King");
            }
            catch (Exception e)
            {
				System.out.println("Sucess");
            }
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: unreported exception Test; must be caught or declared to be thrown
                                throw new Test("Java King");
                                ^
1 error

EXPLANATION:-
============
See in try block new Test() that extends Throwable
But in catch argument Exception..
Its giving error.

Refer previous Notes to see have solved it..
See Example :-7

(Vinay Point:- Verify once)
We are getting an error because its an Throwable it is checked Exception,
for Checked Exception we should give its same type or its Parent.(Vinay Point)
(Its previously disscussed topic go through previous notes once.)
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Test extends Throwable 
{  
	Test(String s)
	{
		
	}
	public static void main(String[] args)
	{
            try
            {
				throw new Test("Java King");
            }
            catch (Throwable e)
            {
				System.out.println("Sucess");
            }
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Sucess

EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Page 27(PDF 26) See that Programe..
In that for constructor they have used super();.
So without using super(); also we can Write Find out that code..

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
1)throw keyword best suitable for User defined or Customized Exception But not for Predefined Exception.
2)It is highly recomended to define customized Exception as Unchecked that is we have to extend
RuntimeException but not Exception..
3)
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
Page 27(PDF 26) See that Programe..

Extend those class using Exception and compile and run see Compiler will arise 
Unreported Exception.

compiler won t listen Bcoz its Checked Exception.
Compiler is gonna ask oye where u are handling it...?
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
class Test
{  
  public static void main(String args[])
  {
     try
     { 
		 
    	System.out.println("Before Exception");
		System.out.println(10/0);
		System.out.println("Before Exception");
		throw new Exception(); //Point:-1
	 }
     catch(Exception e)
     {
          System.out.println(e);		
	 }
  } 

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Before Exception
java.lang.ArithmeticException: / by zero

EXPLANATION:-
============
See the point :-1 after Rising an Exception even though the below code is rising an Exception,
It wont get any Chance.It skips to the corresponding catch block...

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 class Test
{  
  public static void main(String args[])
  {
    	System.out.println("Before Exception");
		System.out.println(10/0); //Point:-1
		System.out.println("After Exception");
		throw new RuntimeException(); 
  } 

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Before Exception
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:6)

EXPLANATION:-
============
RuntimeException is a unchecked Exception.so compiler is not gonna worry about it..
Even though compiler will see Exception at line // Point:-1
It will just see throw new RuntimeException and ignore...
But in Example 15 see its oppposite..


Same Code using try-catch see.
------------------------------
 
 class Test
{  
  public static void main(String args[])
  {
    	try
		{
            System.out.println("Before Exception");
		    System.out.println(10/0); //Point:-1
		    System.out.println("After Exception");
		    throw new RuntimeException(); //Point:-2
		}
		catch (Exception e)
		{
             System.out.println(e);
		}
  } 

}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Before Exception
java.lang.ArithmeticException: / by zero


After //Point:-1 
its never gonna come for //Point:-2
in try block. from //Point:-1 
its gonna go for catch block.
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
class Test
{  
  public static void main(String args[])
  {
    	System.out.println("Before Exception");
		System.out.println(10/0);
		System.out.println("After Exception");
        Thread.sleep();		
  } 

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: no suitable method found for sleep(no arguments)
        Thread.sleep();
              ^
    method Thread.sleep(long) is not applicable
      (actual and formal argument lists differ in length)
    method Thread.sleep(long,int) is not applicable
      (actual and formal argument lists differ in length)
1 error

EXPLANATION:-
============
General Error:-
See If not giving argument to sleep() method.
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========

class Test
{  
  public static void main(String args[])
  {
    	System.out.println("Before Exception");
		System.out.println(10/0);// Point:-1
		System.out.println("After Exception");
        Thread.sleep(1000);		//Point:-2
  } 

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(1000);
                    ^
1 error

      
EXPLANATION:-
============
See Even though an Exception is raised in //Point:-1 
compiler is gonna checek oye u r writing one Checked Exception where u are handling it.


Case:-2
=======
Same Code using try-catch block.(******** vvv important)

See in this Compiler is gonna just check wheather the checked Exception is written inside the try-catch
block or not.
Wheather in try-catch block its getting a chance or not its not going to worry..
Coz in try-block only one code is going to get the chance..
After that code got chance remaining code is never gonna get chance wheather its 
unchecked or Checked(make conferm--->unchecked or Checked) 

 class Test
{  
  public static void main(String args[])
  {
    	try
		{
            System.out.println("Before exception");
		    System.out.println(10/0); //Point:-1
		    System.out.println("After Exception");
		    Thread.sleep(1000);
		}
		catch (Exception e)
		{
             System.out.println(e);
		}
  } 

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Before exception
java.lang.ArithmeticException: / by zero
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Refer Example :-4 Theorey

PROGRAME=16
=========

class TooYoung extends RuntimeException
{
	TooYoung(String s)
	{
		super(s);
	}
}

class TooOld extends RuntimeException
{
	TooOld(String s)
	{
		super(s);
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
Exception in thread "main" TooOld:  ur age is already over for marriage and no chance for marriage
        at CustExcepDemo.main(Test.java:29)

C:\Users\dell1\Desktop>java CustExcepDemo 18
you will get match detail in mail

C:\Users\dell1\Desktop>java CustExcepDemo 19
you will get match detail in mail

C:\Users\dell1\Desktop>java CustExcepDemo 65
Exception in thread "main" TooYoung: please wait for some more time definitely will get best match.
        at CustExcepDemo.main(Test.java:25)

EXPLANATION:-
============
Important:-
------------
Valid Reson for using throw keyword:-
-------------------------------------
throw keyword best suitable for customized Exception,coz JVM is not going to know when it should 
Rise,so best suitable to use after some condition statement.
i.e after conditional statements.


Note 1:-
========
throw keyword is best suitable for user defined/customized Exception.
But not for predefined Exception.


Note 2:-
========
 It is highly recomemded to define customized Exception as unchecked,
 that is we have to extends RuntimeException but not Exception.

 Reason is If we extends checkedException compulsary compiler is going to ask
 and enquiry oye u r rising an Exception wr u handling or not..


 If u extends Unchecked Exception compiler is never gonna worry about that unChecked Exception.
If something goes wrong i want you to rise an Exception,i don t wana handle it. so go extends Unchecked
Exception.

If
class Test extends RuntimeException 
then Test is unchecked Exception class..

If
class Test extends Exception 
then Test is checked Exception class..

Note 3:-
========
need of 
super(s) in TooOld and TooYoung constructor..
To make descprition avaliable to default Exception handler.

Inside Every user Exception handler class we use super(s) inside the constructor
to make our description avaliable to defalut Exception handler.

See Example 19
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
class Test extends Throwable 
{  
	Test(String s)
	{
		
	}
	public static void main(String[] args)
	{
            try
            {
				throw new Test("Java King");
            }
            catch (Exception e)
            {
				System.out.println("Sucess");
            }
	}
}
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
Throwable class is having one constructor in that one method fillInStackTrace();
is there,but in Throwable class there is no method as fillInStackTrace();

i guess by using package concept we can call other class methods in the class.
Do this Experement once and find out.

public Throwable(String message) {
        fillInStackTrace();
        detailMessage = message;
    }
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
Not using super(s)
see the result.

PROGRAME=19
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
Exception in thread "main" TooOld
        at CustExcepDemo.main(Test.java:27)

Not giving much information.



In a method if an Exception is raised then then that method is going to create an Exception object and
pass to JVM.
JVM is calling default Exception handler and
Tat defalut Exception handler uses printStackTrace mehtod to print the information.

printstacktrace method is present in Throwable class 



Throwable
       {super(s);}
             ---->Exception
                  {super(s);}
                      -----> RuntimeException
                                {super(s);}
	          	                     ----> TooYoung(class)
									          {super(s);}

Chain command for constructor calling.
If u open source file then we can see the constructor calling using 
super(String s); keyword with String as argument.

public Throwable(String message) {
        fillInStackTrace();
        detailMessage = message;
    }

i guess fillInStackTrace(); or some internal data structure
makes the user defined String argument of construcotr
avaliable for printstackTrace() method to print the information.

My guess:-(Vinay)
Default Exception handler uses Throwable class constructor to execute printstacktrace()
method to print information.

so to execute that Throwable class constructror along with the 
user defined information String as argument. we give super(s) to its Child class(Too young /Too Old)..

I guess it triggers the coresponding String agrs constructor.


(Some More information is required so do R and D)

Last 5 min of the video watch once again..
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
