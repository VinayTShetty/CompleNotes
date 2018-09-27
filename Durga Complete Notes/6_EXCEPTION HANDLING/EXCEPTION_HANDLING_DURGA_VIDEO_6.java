TOPIC:-Exception Handling(Important cases in this file)
--------
VIDEO NO=6
-----------
NUMBER OF PICTURES=1
------------------
1----->(I:\JAVA NOTES\DURGA JAVA NOTES\EXCEPTION HANDLING\EXCEPTION HANDLING VIDEO 6)

VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
8
12
17
18
25
26(****)
27(****)
28(****)
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
Last video programe.

PROGRAME=1
=========

class Test extends Exception
{
public static void main(String[] args) throws Throwable
   {
    System.out.println("hello");
    throw new Test();
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
Exception in thread "main" Test
        at Test.main(Test.java:6)
EXPLANATION:-
============

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
import java.io.*;
class Test 
{
public static void main(String[] args) 
   {
    System.out.println("hello");
    PrintWriter pw=new PrintWriter("abc.txt");
	pw.println("hello");
   }
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
    PrintWriter pw=new PrintWriter("abc.txt");
                   ^
1 error

EXPLANATION:-
============
In a programe If there is a possibility of rising a checked Exception.
then compulsary we need to handle that checked exception, if not we are getting a CE.

--->
      unreported exception XXX; must be caught or declared to be thrown

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
General Case:- providing invalid arguments..

import java.io.*;
class Test 
{
public static void main(String[] args) 
   {
    System.out.println("hello");
    PrintWriter pw=new PrintWriter(abc.txt);
	pw.println("hello");
   }
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: cannot find symbol
    PrintWriter pw=new PrintWriter(abc.txt);
                                   ^
  symbol:   variable abc
  location: class Test
1 error

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
    System.out.println("hello");
	Thread.sleep(10000);
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
        Thread.sleep(10000);
                    ^
1 error

EXPLANATION:-
============
when main Thread is sleeping other Thread might try to interuprt..
If they are interupting how u can handle..

Thread.sleep(10000); is a checked Exception..

We can handle this CE by using the following 2 ways
try-catch
throws keyword.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Here compiler is never gonna worry about wat u have written in catch block..
compiler is always checking for syntax,its checking u have written catch block that s it..

PROGRAME=5
=========
class Test 
{
public static void main(String[] args) 
   {
    System.out.println("hello");
     try
     {
		Thread.sleep(1000);
		System.out.println("Inside-trt block");
     }
     catch (InterruptedException Ie)
     {

     }
   }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
Inside-trt block

EXPLANATION:-
============
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
    System.out.println("hello");
     try
     {
		Thread.sleep(1000);
		System.out.println("Inside-trt block");
     }
     catch (InterruptedException Ie)
     {
          System.out.println("Inside catch block");
     }
   }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
Inside-trt block

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
By using throws keyword.

PROGRAME=8
=========
class Test 
{
public static void main(String[] args) throws InterruptedException
   {
    Thread.sleep(1000);
    System.out.println("hello");
   }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

EXPLANATION:-
============
JVM is responsible for calling main method,so let JVM handle the Exception..
In this Example JVM is the caller let JVM gonna handle that Exception..

 We can use throws to delagate the responsibility of Exception handling 
 to the caller.(It may be another method or JVM).
 Then caller method is responsible to handle that Exception.

(*****  important Point)
 throws keyword only meant for checked Exception..
 If its a checked Exception compiler is gonna rise CE,So to handle that we use throws keyword...
 unreported Exception may occur from compiler so to handle that we must use throws keyword.

If really InterruptedException occurs,throws keyword doesnt handle the exception.
throws keyword it s used only to convence compiler,
suppose If really @ run time InterruptedException occurs then JVM is gonna handle that Exception
in this Example.
JVM is gonna do abnormal termination,so usage of throw keyword does nt avoid abnormal termination.
so recomended to use try-catch.
 
InterruptedException is a checked Exception..(cross verify once)..
 throws keyword only meant for checked Exception..(coz compiler is going to check @ compile time)

 usage of throws keyword has no impact for uncecked Exception,If we want we can use but there is
 no impact.


Vinay Point:-
===============================================================================================
Usage of throws keyword doesnt handle the exception.
It just postpond to calller method.
If we are using throws for every caller method at the end JVM is gonna handle the
Exception object to default Exception handler..
so throws keyword doesn t handle the Exception.
===================================================================================
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
class Test 
{
public static void main(String[] args) throws Exception
   {
    System.out.println("hello");
   }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
ArithmeticException is a unchecked Exception..
It results in abnormal termination see..

PROGRAME=10
=========
class Test 
{
public static void main(String[] args) throws Exception
   {
    System.out.println(10/0);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:5)

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----

Thread.sleep(5000);

             ------> It s a checked Exception.

PROGRAME=11
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
         Thread.sleep(5000);
        }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:13: error: unreported exception InterruptedException; must be caught or declared to be thrown
         Thread.sleep(5000);
                     ^
1 error


Case 2:-
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
   public static void doMoreStuff() throws InterruptedException
	   {
         Thread.sleep(5000);
        }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:9: error: unreported exception InterruptedException; must be caught or declared to be thrown
           doMoreStuff();
                      ^
1 error

Case 3:-
--------
class Test
{
      public static void main(String[] args) throws InterruptedException
	{
       doStuff();
	   System.out.println("hello");
    }
    public static void doStuff() throws InterruptedException
		{
           doMoreStuff();
        }
   public static void doMoreStuff() throws InterruptedException
	   {
         Thread.sleep(5000);
        }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

In case 3 only one Thread is there that is main Thread,so if any Thread is interupting chance is 
there so compiler is asking us to handle.
no other Thread is there so we are not getting Exception.

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
throws keyword:-


throws just avoids occuring of checked Exception error from the compiler  
at compile time.
If @ runtime really an Exception is raised caller method is resposible to handle that Exception.

Doubt:- See if code is raising an cheked Exception we can use any type that is from
Throwable to any Child class we can use it throw or we should use only checked Exception types.
In that see we can use parent-child and vice versa..
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
class Test
{
      public static void main(String[] args) throws InterruptedException
	{
       doStuff();
	   System.out.println("hello");
    }
    public static void doStuff() 
		{
           doMoreStuff();
        }
   public static void doMoreStuff()
	   {
         Thread.sleep(5000);
        }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:14: error: unreported exception InterruptedException; must be caught or declared to be thrown
         Thread.sleep(5000);
                     ^
1 error


EXPLANATION:-
============
Here for main method have throws keyword to handle the Exception.
but compiler is telling oye doMoreStuff() u r writing an Exception code but u r not delagating that 
responsibilities to caller method.
so CE occurs.

Case 2:-
--------
In this case If we remove atlest one throws keyword code won t compile..

Same as case 1 and explanation.
class Test
{
      public static void main(String[] args) throws InterruptedException
	{
       doStuff();
	   System.out.println("hello");
    }
    public static void doStuff() 
		{
           doMoreStuff();
        }
   public static void doMoreStuff() throws InterruptedException
	   {
         Thread.sleep(5000);
        }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: unreported exception InterruptedException; must be caught or declared to be thrown
           doMoreStuff();
                      ^
1 error


Diagram:-

I:\JAVA NOTES\DURGA JAVA NOTES\EXCEPTION HANDLING\EXCEPTION HANDLING VIDEO 6

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
eclipse middle programe..

PROGRAME=15
=========
 class  Test
{
       public static Test t=new Test();
	 
	   private Test()
	   {

	   }
	  	   public static  Test m1()
	  {
		   return t;
	  }

		public static void main(String[] args) 
	{
         Test t=Test.m1();
		 System.out.println("t="+t);

        Test t1=Test.m1();
         System.out.println("t1="+t1);
         
		 Test t2=Test.m1();
         System.out.println("t2="+t2);

       System.out.println(new Test());
       System.out.println(new Test());
	}

}
      
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
Thread.sleep() some Theorey from eclipse.
sleep
public static void sleep(long millis)
                  throws InterruptedException
Causes the currently executing thread to sleep (temporarily cease execution) for the
specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers. The thread does not lose ownership of any monitors.

Parameters: 
millis - the length of time to sleep in milliseconds 
Throws: 
IllegalArgumentException - if the value of millis is negative // some important points.

InterruptedException - if any thread has interrupted the current thread.
The interrupted status of the current thread is cleared when this exception is thrown. 

***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
EXPLANATION:-
============
Vinay Discussion:-

reference from Example 12:-

  public static native void sleep(long millis) throws InterruptedException;

 We can use throws______
 only Exception and Throwable.

If we are using any code Which causes Checked Exception we can use throws__________
the same 

1)Checked Exception
2)Exception
3)Throwable
other than this we can t use someother classes.
See the different case below.
-----------------------------------------------------------------------------------------
Case 1:-
-------
import java.io.IOException;

class Test
{
	public static void main(String[] args) throws InterruptedException
	{
	      Thread.sleep(1000);
		  System.out.println("hello");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

We are using the same checked Exception.
-----------------------------------------------------------------------------------------
Case 2:-
--------
class Test
{
	public static void main(String[] args) throws RuntimeException
	{
	      Thread.sleep(10000);	
	}
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unreported exception InterruptedException; must be caught or declared to be thrown
              Thread.sleep(10000);
                          ^
1 error

we are using unchecked Exception which is invalid.
Thread.sleep() -->gives InterruptedException(Checked Exception)


Case 2a:- 
-------
class Test
{
	public static void main(String[] args) throws RuntimeException
	{
	      Thread.sleep(10000);	
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unreported exception InterruptedException; must be caught or declared to be thrown
              Thread.sleep(10000);
                          ^
1 error

-----------------------------------------------------------------------------------------
Case 3:-

class Test
{
	public static void main(String[] args) throws RuntimeException,Exception
	{
	      Thread.sleep(1000);
		  System.out.println("hello");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

Using both   invalid   and   valid.
           (Unchecked)      (checked)
Compiler will consider only valid one
-----------------------------------------------------------------------------------------
Case 4:-
--------
Throwable ,Exception,InterruptedException.
all These classes are present in java.lang package.

class Test
{
	public static void main(String[] args) throws Throwable ,Exception,InterruptedException
	{
		Thread.sleep(1000);
        System.out.println("hello");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

Using all valid valid valid 

***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
Case 1:-
-------
class Test
{
	Test() throws Throwable
	{

	}
	void m1() throws Throwable
	{

	}
	public static void main(String[] args) throws Throwable 
	{
		System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

Case 2:-
-------
For classes we can t use Throws keyword.

class Test throws Throwable
{
	Test() throws Throwable
	{

	}
	void m1() throws Throwable
	{

	}
	public static void main(String[] args) throws Throwable 
	{
		System.out.println("hello");
	}
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:1: error: '{' expected
class Test throws Throwable
          ^
1 error


EXPLANATION:-
============
We can use throws keywords for methods and constructor not for classes..
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
class Test 
{
	public static void main(String[] args) throws Test 
	{
		System.out.println("hello");
	}
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: incompatible types: Test cannot be converted to Throwable
        public static void main(String[] args) throws Test
                                                      ^
1 error

throws applicable only for Throwable types. 
We can use throws keyword only Throwable types,If we are trying to use for normal java classes
Then we ll get CE saying Incompatible types.

Case 2:-

Wheather its Checked or Unchecked no need to worry If we extend Throwable,RuntimeException ...etc
We can use normal java classes for throws keyword

 Case 2(a):-

Using RuntimeException

class Test extends RuntimeException
{
	public static void main(String[] args) throws Test 
	{
		System.out.println("hello");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello


Case 2:-(b)

Using Throwable

class Test extends Throwable
{
	public static void main(String[] args) throws Test 
	{
		System.out.println("hello vinay");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello vinay

***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
Case 1:-

class Test
{
	public static void main(String[] args)
	{
		throw new Exception();
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unreported exception Exception; must be caught or declared to be thrown
                throw new Exception();
                ^
1 error

Exception---->Checked Exception
If its a checked,Exception then compulsary compiler is gonna ask where you are handling If a checked
Exception occurs.
If u are not handling then i will give 
unreported Exception @ compile time.

compiler is gonna say oye handle it with try-catch or using throws keyword.

Case 2:-

Error------>Unchecked Exception
If a code is giving an uncehcked Exception then compiler is never gonna worry about
the programmer is gonna handle it or not.


class Test
{
	public static void main(String[] args)
	{
		throw new Error();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.Error
        at Test.main(Test.java:5)

 Here main mehtod is gonna create an Exception object and handle to JVM.
 and JVM is gonna give it to default Exception handler.
 programe is a ablnormal termination.(See Case 3 and Case 4)

 Case 3:-
 --------
In Case 3 results in abnormal termination
class Test
{
	public static void main(String[] args)
	{
		System.out.println("heloo");
		System.out.println("heloo");
		System.out.println("heloo");
		throw new Error();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
heloo
heloo
heloo
Exception in thread "main" java.lang.Error
        at Test.main(Test.java:8)

 Case 4:-
 -------
 class Test
{
	public static void main(String[] args)
	{
		System.out.println("heloo");
		System.out.println("heloo");
		System.out.println("heloo");
		throw new Error();
        System.out.println("bye");
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:9: error: unreachable statement
        System.out.println("bye");
        ^
1 error

***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
Case 1:-
--------
 class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("hello");
		}
		catch (ArithmeticException ae)
		{

		}
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

ArithmeticException-------->Unchecked Exception.
Case 2:-
--------
 class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("helloo");
		}
		catch (Exception E)
		{

		}
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
helloo

Exception---->Partially Chceked

Case 3:-
--------
If there is no chance of rising an IOException in the try-block,we cannot write the corresponding
catch block for that.
This rule is applicable only for fully checked Exception..

so in the try-block If we have not written any code that arises fully Checked Exception class.,
in the corresponding catch block we cannot write the argument of that in catch block.


Inside try-block if there is no chance of rising an Exception,then we can t write catch block for that 
Exception.
otherwise we ll get CE saying  xxxx Exception is never thrown in body of corresponding try statement
But this rule is applicable only for Fully Checked Exception..

Within in the try-block If there is no chance of rising an Exception then we can t write catch block
for that Exception otherwise we ll get CE saying 
Exception xxxx is never thrown in body of corresponding try statement.
But this rule is applicable only for Fully Checked Exception.


Ex:- 1
try
{
	//code-->checked Exception.
}
catch (FullyCheckedException fe)
{
}

error..

Ex:-2
try
{
	//code arising fully checked Exception
}
catch (FullyCheckedException fe)
{

}

Valid


import java.io.*;
 class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("helloo");
		}
		catch (IOException E)
		{

		}
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: exception IOException is never thrown in body of corresponding try statement
                catch (IOException E)
                ^
1 error

IOException--->Is a fully CheckedException.

Case 4:-
--------
 class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("helloo");
		}
		catch (InterruptedException E)
		{

		}
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:9: error: exception InterruptedException is never thrown in body of corresponding try
                catch (InterruptedException E)
                ^
1 error

InterruptedException ----->Is a fully Checked Exception.

Case 5:-
--------
 class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("helloo");
		}
		catch (Error E)
		{

		}
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
helloo


Error------>Is unchecked Exception.
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("hello");
		try 
		{
		  System.out.println(10/0);	
		}
		catch (InterruptedException e) 
		{
			
         } 
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: exception InterruptedException is never thrown in body of corresponding try statement
                catch (InterruptedException e)
                ^
1 error
EXPLANATION:-
============
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
Case:-1
In try-block if any Unchecked Exception occurs,in the corresponding catch block we can give the 
argument as 
1)Same Unckecked Exception
2)Its main parent
3)Exception
4)Throwable

Case 1:-


class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Start of main");   
               try 
        {
			System.out.println(10/0);
			System.out.println("Code after Exception");   

		}
        
        catch (ArithmeticException e)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End of main");   

	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Start of main
Inside catch block
End of main

Conclusion:-

try--ArithmeticException
catch(argument)---->ArithmeticException
-------------------------------------------------------------------------------------
Case 2:-
class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Start of main");   
               try 
        {
			System.out.println(10/0);
			System.out.println("Code after Exception");   

		}
        
        catch (RuntimeException r)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End of Main");   

	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Start of main
Inside catch block
End of Main

try--ArithmeticException
catch(argument)---->RuntimeException(Main Parent)
-------------------------------------------------------------------------------------
Case 3:-
class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Start of main");   
               try 
        {
			System.out.println(10/0);
			System.out.println("Code after Exception");   

		}
        
        catch (Exception E)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End of Main method");   

	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Start of main
Inside catch block
End of Main method

try--ArithmeticException
catch(argument)---->Exception(Parent)
-------------------------------------------------------------------------------------
Case 4:-

class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Start of main");   
               try 
        {
			System.out.println(10/0);
			System.out.println("Code after Exception");   

		}
        
        catch (Throwable t)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End Main");   

	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Start of main
Inside catch block
End Main

try--ArithmeticException
catch(argument)---->Throwable(Parent)

-------------------------------------------------------------------------------------

All 5 cases see for 

Null Pointer Exception...
------------------------------------------------------------------------------------------
Special case :-
---------------
In IndexOutOfBoundsException diargram page 8(PDF 8)

See if we have  ArrayIndexOutOfBoundsException we can use IndexOutOfBoundsException coz IOBE is parent 
of AIOBE considering the diagram.

After arrays concept do this assignment.
-------------------------------------------------------------------------------------
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
Note:- 1
========
In try-block if any checked Exception occurs,in the corresponding catch block we can give the 
argument as 
1)Same ckecked Exception
3)Exception
4)Throwable
If we are giving some thing else we ll get CE..

Case :-1
=========
class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Start of main");   
               try 
        {
			Thread.sleep(1000);
			System.out.println("Code after Exception");   

		}
        
        catch (InterruptedException i)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End Main");   

	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Start of main
Code after Exception
End Main


try---->Checked Exception
catch block argument:-Same Checked Exception..

---------------------------------------------------------------------------------------------------
Case 2:-
import java.io.*;
class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Starts  main");   
               try 
        {
			Thread.sleep(1000);
			System.out.println("Code after Exception");   

		}
        
        catch (IOException e)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End Main");   

	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:14: error: exception IOException is never thrown in body of corresponding try statement
        catch (IOException e)
        ^
Test.java:9: error: unreported exception InterruptedException; must be caught or declared to be thrown
                        Thread.sleep(1000);
                                    ^
2 errors

See 2 errors are comming..

try---->Checked Exception
catch block argument:-Checked Exception.(Main parent)
   ----->error.
---------------------------------------------------------------------------------------------------
Case 3:-
class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Starts  main");   
               try 
        {
			Thread.sleep(1000);
			System.out.println("code after Exception");   

		}
        
        catch (Exception e)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End Main");   

	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Starts  main
code after Exception
End Main

try---->Checked Exception
catch block argument:-Checked Exception.(But Exception)
   ----->valid.
---------------------------------------------------------------------------------------------------
Case 4:-
class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Starts  main");   
               try 
        {
			Thread.sleep(1000);
			System.out.println("code after Exception");   

		}
        
        catch (Throwable e)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End of Main");   

	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Starts  main
code after Exception
End of Main

try---->Checked Exception
catch block argument:-Checked Exception.( But Throwable )
   ----->valid.



Try for some more Example.
---------------------------------------------------------------------------------------------------
Note:- 2
========

In try-block we are not writing the code which raises the CheckedException but in the catch block we are
giving as argument then also its CE.

class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Start of main");   
               try 
        {
			System.out.println(10/0);
			System.out.println("Code after Exception");   

		}
        
        catch (InterruptedException i)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End Main");   

	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:13: error: exception InterruptedException is never thrown in body of corresponding try statement
        catch (InterruptedException i)
        ^
1 error

try--ArithmeticException(UncheckedException)
catch--->InterruptedException (checkedException)
error.
---------------------------------------------------------------------------------------------------
PROGRAME=24
=========

***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
PROGRAME=25
=========
class Test
{
	public static void main(String[] args) 
	{ 
       System.out.println("Starts  main");   
               try 
        {
			Thread.sleep(1000);
			System.out.println("code after Exception");   

		}
        
        catch (Object e)
        {
             System.out.println("Inside catch block");   
        }
		System.out.println("End of Main");   

	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:13: error: incompatible types: Object cannot be converted to Throwable
        catch (Object e)
               ^
1 error

EXPLANATION:-
============
We cannot use Object for any Exception.
Compulsary it must be Throwable type.
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
class Test
	{  
  public static void main(String args[])
	  {  
         try
	   {  
        int a[]=new int[5];  
         a[5]=30/0;  
       } 
   catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexOutOfBoundsException occured");}   
   catch(ArithmeticException e){System.out.println("Arithmetic Exception has occured");}  
   catch(Exception e){System.out.println("common task completed");}  
  
     System.out.println("rest of the code...");  
 }  
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Arithmetic Exception has occured
rest of the code...

EXPLANATION:-
============
        int a[]=new int[5];  
         a[5]=30/0;  

order of evaluation is always from right to left verify once from operator and assignment concepts..
If an Exception has occured in right it wont see the left side,It will immediately
go for the corresponding catch block..

In a try-block there can arise only one Exception.

order of evaluation is always from right to left,
@ this point of time there rises an ArithmeticException so corresponding catch block is executed.
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
class Test
	{  
  public static void main(String args[])
	  {  
         try
	   {  
        int a[]=new int[5];  
         a[1000]=10/0;  
       } 
   catch(ArithmeticException e){System.out.println("Arithmetic Exception has occured");}  
   catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexOutOfBoundsException occured");}   
   catch(Exception e){System.out.println("common task completed");}  
  
     System.out.println("rest of the code...");  
 }  
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Arithmetic Exception has occured
rest of the code...

EXPLANATION:-
============
       int a[]=new int[5];  
         a[1000]=10/0;  

		 Even though AIOBE occurs compiler is always evaluation from right to left so
		 frist preference is going for ArithmeticException.

		 Order of preference of catch block is not important --->Check this also
		 which Exception occurs that corresponding catch block will be executed.

		 try changing the order of catch block and executing.

***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========

class Test
	{  
  public static void main(String args[])
	  {  
         try
	   {  
        int a[]=new int[5];  
         a[1000]=10/2;  
       } 
   catch(ArithmeticException e){System.out.println("Arithmetic Exception has occured");}  
   catch(ArrayIndexOutOfBoundsException e){System.out.println("ArrayIndexOutOfBoundsException occured");}   
   catch(Exception e){System.out.println("common task completed");}  
  
     System.out.println("rest of the code...");  
 }  
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
ArrayIndexOutOfBoundsException occured
rest of the code...

EXPLANATION:-
============

***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
Inside a try-block we can write any code but only one Exception can rise.

Refer Example :-27
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
