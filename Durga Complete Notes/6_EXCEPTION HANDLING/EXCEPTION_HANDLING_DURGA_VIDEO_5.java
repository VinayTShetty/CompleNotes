TOPIC:-Exception Handling.
--------
VIDEO NO=5
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
18
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
Last video programe:-
class Test
{
	public static void main(String[] args)
	{
		System.out.println("main");
		try
		{
		  System.out.println(10/0);	
        }
         catch(ArithmeticException e)
			 {
          System.out.println(e);
          System.out.println(e.toString());
		     }
          
		  catch(ArithmeticException e)
			 {
          System.out.println(e);
          System.out.println(e.toString());
		     }

        
    }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:16: error: exception ArithmeticException has already been caught
                  catch(ArithmeticException e)
                  ^
1 error

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
throw v/s throws

throw keyword/statement/class:-
--------------
the programmer throw an Exception Object.
JVM is gonna handle catch that Exception.

Diagram 
Page 106 Hand written notes..

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
Case 1:-
-------
class Test
{
	public static void main(String[] args)
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
The method in which exception is raised is responsible to create Exception object and hand over to JVM.
JVM is gonna check any handling code is there,if no handling code is there then JVM is gonna handle 
the Exception object to default exception handler and terminates the programmer abnormally and print
Exception information in the console.

In this programe main mehtod is responsible to create Exception object hand over to JVM.


Case 2:-
--------
class Test
{
	public static void main(String[] args)
	{
		throw new ArithmeticException("/ by zero");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:5)


Hence the result of the following 2 programes is exactly same..

In this case 2 programmer creating Exception Object explicitly and handover to JVM.

An unwanted/unexcepted event that disturbs normal execution of programe is called Exception.
which terminates the progrmae abnormally.

wat is the use of this abnormal termination..?
by using throw key word....?


throw best suitable for customized Exception or user defined Exception..
And not for predefined Exception.
***************************-----END of--->3<--------***************************
Example=4
=========

NOTE:-
----
In Example 3 main method handovers the exception object to JVM.

But i don t wana main method to handover exception object to JVM,i want programmer
to create Exception object and hand over to JVM manually by the programmer.

PROGRAME=4
=========
class Test
{
	public static void main(String[] args)
	{
		throw new ArithmeticException("Vinay");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: Vinay
        at Test.main(Test.java:5)
 
EXPLANATION:-
============
Some times we can create Excetion Object explicitly and hand over to the JVM manually for this we 
have to use throw keyword.

		throw new ArithmeticException("Vinay");


new ArithmeticException("Vinay");----> Creation of Exception Object explicitly
throw---->Hand over the created Exception object to JVM manually.

Hence main objective of throw keyword is to create Exception object and hand over to JVM manually.


Here one Big doubt for me:-
In main method we are just writing new ArithmeticException();
but we are not writing any Exception creating code.See Example 5 and Example 7.

ok i got this see we get the excat same result of ArithmeticException in both case i.e 
Example 4 and 3

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
class Test
{
	public static void main(String[] args)
	{
		System.out.println(10/0);
		throw new ArithmeticException("Vinay");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:5)

EXPLANATION:-
============
In this programe
throw new ArithmeticException("Vinay"); is not getting the chance i get.
coz System.out.println(10/0); is already throwing an Exception.
and remaining line not getting a chance.

It treats throw new ArithmeticException("Vinay"); as a normal statements.

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
		System.out.println(10/0);
		throw new ArithmeticException("Vinay");
        System.out.println("hello");
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: unreachable statement
        System.out.println("hello");
        ^
1 error
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
main use of throw keyword.

PROGRAME=8
=========
class Test
{
	static void m1(int age)
	{
		if (age<18)
		throw new ArithmeticException("Invalid age");
		else;
		System.out.println("Welcome to vote");
    }

	public static void main(String[] args)
	{
         m1(13);
		 System.out.println("Rest of the code");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: Invalid age
        at Test.m1(Test.java:6)
        at Test.main(Test.java:13)

EXPLANATION:-
============
Vinay Point:-
Recomemded position:-

We should use throw keyword after some condition so it will be more helpfull.

See in Example 7,after throw we cannot use any statement it will be unreachable.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
class Test
{
	static void m1(int age)
	{
		if (age<18)
		throw new ArithmeticException("Invalid age");
		else;
		System.out.println("Welcome to vote");
    }

	public static void main(String[] args)
	{
         m1(21);
		 System.out.println("Rest of the code");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Welcome to vote
Rest of the code

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
class Test
{
	static void m1(int age)
	{
		if (age<18)
		System.out.println(10/0);
		else
		System.out.println("Welcome to vote");
    }

	public static void main(String[] args)
	{
         m1(13);
		 System.out.println("Rest of the code");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.m1(Test.java:6)
        at Test.main(Test.java:13)

EXPLANATION:-
============
m1() method creating an Exeption Object and Hand over to JVM.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
class Test
{
	static void m1(int age)
	{
		if (age<18)
		System.out.println(10/0);
		else
		System.out.println("Welcome to vote");
    }

	public static void main(String[] args)
	{
         m1(21);
		 System.out.println("Rest of the code");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Welcome to vote
Rest of the code

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
Proper reason for using throw keyword.

PROGRAME=12
=========
Case:- 1
--------
class Test
{
	static void m1(int x)
	{
		if ((10/x)>1)
       System.out.println("sucess");
		else
		System.out.println("failure");
    }

	public static void main(String[] args)
	{
         m1(0);
		 System.out.println("Rest of the code");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.m1(Test.java:5)
        at Test.main(Test.java:13)

 In Case:-1 Default Exception handler is providing the information which i don t need.

Case:- 2
--------
class Test
{
	static void m1(int x)
	{
		if ((10/x)>1)
       throw new ArithmeticException("u will be a failure");
		else
		System.out.println("failure");
    }

	public static void main(String[] args)
	{
         m1(0);
		 System.out.println("Rest of the code");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.m1(Test.java:5)
        at Test.main(Test.java:13)

Case 2:-
In Case 2 Exception is raised inside if() and throw is not getting the chance..
condition is false so see.
class Test
{
	static void m1(int x)
	{
		if ((10/x)>1)
       throw new ArithmeticException("u will be a failure");
		else
		System.out.println("failure");
    }

	public static void main(String[] args)
	{
         m1(0);
		 System.out.println("Rest of the code");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.m1(Test.java:5)
        at Test.main(Test.java:13)

case 3:-condition is true.
So When throw keyword can be usefull,and how we can use.
after any condition We should use throw its recomended.
Best suitable for customized Exception(User defined),not for predifined Exception.

class Test
{
	static void m1(int x)
	{
		if ((10/x)>1)
       throw new ArithmeticException("u wont reach failure");
		else
		System.out.println("failure");
    }

	public static void main(String[] args)
	{
         m1(2);
		 System.out.println("Rest of the code");
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: u wont reach failure
        at Test.m1(Test.java:6)
        at Test.main(Test.java:13)
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
ArithmeticException consist of 2 constructor 
1)no-args.
2)String as parameter.

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
  static ArithmeticException e=new ArithmeticException();
  public static void main(String[] args)
	{
       throw e;
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException
        at Test.<clinit>(Test.java:3)


EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
class Test
{
  static ArithmeticException e;
  public static void main(String[] args)
	{
       throw e;
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:6)
      

EXPLANATION:-
============
 Here we won t any CE.
 coz compiler will only Check syntax.
 
 e is of wat type..?
 --->ArithmeticException();
 so compiler is never gonna worry about runtime Object.,
 Wheather run time object is there or not..?

For static variable default value is null;
using null we performing any operation we ll get null pointer operation.

  
throw e;
If e refers null we ll get null pointer Exception.
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========

case :-1
========
class Test
{
public static void main(String[] args)
   {
    System.out.println(10/0);
    System.out.println("hello");
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:5)

EXPLANATION:-
============
In this programe the compiler is unaware
that an Exception may rise at System.out.println(10/0); and it thinks it can print next
System.out.println("hello"); so this is not comming under not reachable code.


case :-2
========
class Test
{
public static void main(String[] args)
   {
    throw new ArithmeticException("hello");
    System.out.println("hello");
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreachable statement
    System.out.println("hello");
    ^
1 error

In case 2 compiler is aware that after throw statement we are not allowed to write 
any statmemts directly.
If we write,we ll get CE saying unreachable statement.
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
Case 1:-
-------
 class Test
{
public static void main(String[] args)
   {
    throw new Test();
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: Test cannot be converted to Throwable
    throw new Test();
    ^
1 error

EXPLANATION:-
============
throw keyword is meant up for throwable types.
If we use any other we ll get CE:-

We can use throw keyword only for Throwable types,If we are trying to use for normal java 
code we ll get CE saying telling incompatible types.

Case 2:-
--------
class Test extends Throwable
{
public static void main(String[] args)
   {
    throw new Test();
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unreported exception Test; must be caught or declared to be thrown
    throw new Test();
    ^
1 error

Its not CE its unreported Exception,in main method is throwing an Exception
but we should handle it using try-catch or using throws key word if we are not handling 
we ll get Exception.

Case 3:-
--------
class Test extends Throwable
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

Case 4:-
--------
class Test extends Throwable
{
public static void main(String[] args) throws Throwable
   {
    throw new Test();
    System.out.println("hello");
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreachable statement
    System.out.println("hello");
    ^
1 error


***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
Case 1:-
--------
class Test extends Throwable
{
public static void main(String[] args) throws Exception
   {
    System.out.println("hello");
    throw new Test();
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreported exception Test; must be caught or declared to be thrown
    throw new Test();
    ^
1 error


extends--->Parent type
 throws---->Child type
              --->CE.

Case 2:-
--------
class Test extends Throwable
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

extends--->Parent
throws---->Parent 
            ---->NO CE

Case 3:-
--------
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

 extends---->child
 throws----->Parent 
                 ----->Valid,no CE.
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
