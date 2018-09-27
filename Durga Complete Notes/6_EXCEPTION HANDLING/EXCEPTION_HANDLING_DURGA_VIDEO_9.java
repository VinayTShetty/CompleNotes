TOPIC:-Exception Handling
--------
VIDEO NO=9
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-
Example=26
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
IllegalArgumentException:
-------------------------
For every Thread, priority is there.
valid range priority for every Thread is form 1-10.

If we are trying to set the priority more than 10,
we ll get RuntimeException saying IllegalArgumentException.

PROGRAME=1
=========
EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
IllegalFormatException is a child class of IllegalArgumentException observe Exception hireachy.
PDF(7).

PROGRAME=2
=========
class Test
{
public static void main(String[] args)
	{
        int j=Integer.parseInt("ten");
    }
}
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at Test.main(Test.java:5)

EXPLANATION:-
============
Vinay Point:-
-------------

If we observe we may think its IllegalArgumentException,its not coz parseInt()
always expects String as argument only.(Check once)
We are giving valid String argument..(so we are not getting  IllegalArgumentException)

Its not special NumberFormatException class,its a Child class of IllegalArgumentException.

but String is not properly formatted we ll get NumberFormatException .


Durga Point:-
-------------
It s direct Child class of IllegalArgumentException which is the Child class of RunTime Exception.
and Hence it is unchecked.
Rised explicitly eiether by programmer or by API developer to indicate that we are trying to convert 
String to Number and String is not properly formatted.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
IllegalStateException:-

Calling a sleeping person for tea is valid.
Calling a dead person for tea is invalid.(IllegalStateException)

A guy asking god to restart his life for not having good marks he mailed brahma,
Brahma told to contact yama.
But guy asking Brahma again so Brahma gave IllegalStateException .


Stating a Thread again is invalid.
once started we cannot start a Thread again.
Ex:-
We ll get IllegalThreadStateException for this Thread Example..

Thread t=new Thread();
t.start();
.
.
.
.
t.start();

After starting of Thread we are not allwed to restart the Thread once again..
If we do we ll get IllegalThreadStateException.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
AssertionError is not got properly so go once again only Assertion.

assert(x>7)
If x is not greater than 7 then we ll get RE saying AssertionError.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
Untill 1.6 version wat ever resources we opened in try-block compulsary we should close in finally block.

***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
try with resoure topic.

PROGRAME=6
=========
class Test {
	void m1(){}
   public static void main(String[] args)
	{
	  try
	  {
		 Test t;
	  }
	  catch (Exception e) 
	   {
		t.m1();
	   }  
    }

}

C:\Users\DELL\Desktop>javac Test.java
Test.java:11: error: cannot find symbol
                t.m1();
                ^
  symbol:   variable t
  location: class Test
1 error
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
Vinay Point:-
=============
Advantage of try with resource..
If we open database connection in try automatically it will be closed..
any how we need to close the data base connection.so it will do our work..
finally block not needed to write..

try  Not with resource:-Compulsary we should close data base connection in finally block.. 
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
It is highly recomended to write finally block to close resources,which are opened as the part of 
try-block.


BufferedReader br=null;
try
{
  br=new BufferedReader(new FileReader("abc.txt"));
}
catch(IOException e) 
{

}
finally 
	{
      if(br != null)
      br.close();
    }

Durga Point:-
=============
	The problems in this approach are compulsary programmer require to close resources inside finally 
	block.It increases complexity of programming..
	we have to write finally block compulsary,hence it increses length of the code and reduces 
	readability..
	to overcome above problems try-with resources in 1.7 version.
	The main advantage of try-with resources is wat ever resource we opened as the part of
	try-block will be automatically closed once control reaches end of try-block eiether normally or abnormally.
	
	and hence we are not required to close explicitly.so that complexity of programming will be reduced..
    we are not required to write finally block so that length of the code will be reduced and readability will
	be increased.

  **Imp Point:-
 RESOURCES WILL BE  CLOSED ONCE CONTROL REACHES END OF TRY-BLOCK 


try-with resources syntax.

 try(BufferedReader br=new BufferedReader(new FileReader("abc.txt")))
{
      /* use br based on our requirement, br will be closed automatically ,
         Onec control reaches end of try either normally
         or abnormally and we are not required to close explicitly*/
}
catch(IOException e) {
// handling code
}
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
we can write multiple resources in try-block.

Example:-

try(FileWriter fw=new FileWriter();FileReader fr=new FileReader())
{           //Resource:-1                //Resource:-2

}


***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============

This case not discussed:- work on that..

try(FileWriter fw=new FileWriter();FileReader fr=new FileReader())
{           //Resource:-1                //Resource:-2

}

That resources can be written in any order like 
Frist read and  then  write vice versa and all.check that case once....

***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
For some cases we need to write catch block,which arises Checked Exception..
See its rising Checked Exception.

1.7 version try with resource finally or catch is optional..
But some special cases where catch or finally is mandatory..

or we can say in try--->use only resources which rises Unchecked Exception..

PROGRAME=11
=========

Case 1:- Inside the try-block the resources  which raises Checked Exception.
-------
import java.io.FileReader;
import java.io.FileWriter;

class Test {
   public static void main(String[] args)
	{
	   System.out.println("hi Vinay ");
	   try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
	   {           //Resource:-1                //Resource:-2

	   }
	   catch(Exception e){}
    }

}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
hi Vinay



Case2:-Inside the try-block the resources  which raises Checked Exception,But we are not handling it.
-------
import java.io.FileReader;
import java.io.FileWriter;

class Test {
   public static void main(String[] args)
	{
	   System.out.println("hi Vinay ");
	   try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
	   {           //Resource:-1                //Resource:-2

	   }
	

}

}

C:\Users\DELL\Desktop>javac Test.java
Test.java:8: error: unreported exception IOException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                             ^
Test.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                                                                     ^
Test.java:8: error: unreported exception IOException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                          ^
  exception thrown from implicit call to close() on resource variable 'fw'
Test.java:8: error: unreported exception IOException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                                                                  ^
  exception thrown from implicit call to close() on resource variable 'fr'
4 errors

C:\Users\DELL\Desktop>


EXPLANATION:-
============
try with resources catch is optional and finally is optional make sure the resources won t throw any Checked
Exception..
See do R & D on which resources will not throw Checekd Exception..
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
try with resource syntax won t work in compiler coz its old version IDE..
PROGRAME=12
=========
import java.io.FileReader;
import java.io.FileWriter;

class Test {
   public static void main(String[] args)
	{
	   System.out.println("hi viany ");
	   try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
	   {           //Resource:-1                //Resource:-2

	   }
	   catch(Exception e){}
    }

}

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
In try with resource,The resource code if raising an Checked Exception 
then compulsary we  should write the catch block..
try-finally also won t work see..

try-catch see it s working(Example:-14)

PROGRAME=13
=========
import java.io.FileReader;
import java.io.FileWriter;

class Test {
   public static void main(String[] args)
	{
	   System.out.println("hello");
	   try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
	   {           //Resource:-1                //Resource:-2

	   }
    	  finally
			  {
		       
			   }
    }

}

C:\Users\DELL\Desktop>javac Test.java
Test.java:8: error: unreported exception IOException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                             ^
Test.java:8: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                                                                     ^
Test.java:8: error: unreported exception IOException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                          ^
  exception thrown from implicit call to close() on resource variable 'fw'
Test.java:8: error: unreported exception IOException; must be caught or declared to be thrown
           try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
                                                                  ^
  exception thrown from implicit call to close() on resource variable 'fr'
4 errors

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
import java.io.FileReader;
import java.io.FileWriter;

class Test {
   public static void main(String[] args)
	{
	   System.out.println("james gosling");
	   try(FileWriter fw=new FileWriter("abc.txt");FileReader fr=new FileReader("abc.txt"))
	   {           //Resource:-1                //Resource:-2

	   }
	   catch(Exception e)
		{}
    }

}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
james gosling

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Conclusion:-So try with resources helps us to avoid writing finally block.
usually finally block is used to close database connection ect...
try-with resources automatically closes data base connection..

try with resources ---->finally optional..


In try with resource writing catch block is optional..

In try with resources,catch is optional,But  If an Exception is raised in try with resources 
block compulsary and mandatory to write its corresponding catch block.

try with resources--->(If any Exception is raised )-->catch block is compulsary..

 
Do R & D on below case:-
------------------------
try with resources--->(Resources not raising any Exception)-->catch block is optional.



***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
EXPLANATION:-
============
Conclusions:-
--------------
1)We can declare multiple resources in a try block,but each resources should be separated by semicolon.

try(FileWriter fr=new FileWriter();FileReader fw=new FileReader())
{
}

2)Wat ever resources we are taking i.e file IO resources,DATABASE related resources,NETWORK related resources
all these resources should be autoclosable resources..

A resource is said to be autocloseable resources,if the corresponding class implements 
i.e FileWriter/FileReader class should implement java.lang.AutoCloseable interface.


 All file file IO resources,DATABASE related resources,NETWORK related resources 
 already implements this java.lang.AutoCloseable interface.
 Being a programmer we are not required to worry.

java.lang.AutoCloseable interface came in 1.7 version.

This java.lang.AutoCloseable interface contain only one method that method is close method.
i.e:-public void close();

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Special case:- using name less approach is invalid..

PROGRAME=16
=========
import java.io.FileReader;
import java.io.FileWriter;

class Test {
   public static void main(String[] args)
	{
	   System.out.println("Vinay is the king in java");
	   try(new FileWriter("abc.txt");new FileReader("abc.txt"))
	   {           //Resource:-1                //Resource:-2

	   }
	   catch(Exception e)
		{}
    }

}



C:\Users\DELL\Desktop>javac Test.java
Test.java:8: error: illegal start of type
           try(new FileWriter("abc.txt");new FileReader("abc.txt"))
               ^
Test.java:8: error: = expected
           try(new FileWriter("abc.txt");new FileReader("abc.txt"))
                   ^
Test.java:8: error: ')' expected
           try(new FileWriter("abc.txt");new FileReader("abc.txt"))
                             ^
Test.java:8: error: '{' expected
           try(new FileWriter("abc.txt");new FileReader("abc.txt"))
                              ^
Test.java:8: error: illegal start of expression
           try(new FileWriter("abc.txt");new FileReader("abc.txt"))
                                       ^
Test.java:8: error: ';' expected
           try(new FileWriter("abc.txt");new FileReader("abc.txt"))
                                                                  ^
Test.java:12: error: 'catch' without 'try'
           catch(Exception e)
           ^
Test.java:16: error: reached end of file while parsing
}
 ^
8 errors

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
Its a Unchecked Exception see.
PROGRAME=17
=========
import java.io.FileReader;
import java.io.FileWriter;

class Test {
   public static void main(String[] args)
	{
         FileWriter fr=new FileWriter("abc.txt");  
    }

   }

C:\Users\DELL\Desktop>javac Test.java
Test.java:7: error: unreported exception IOException; must be caught or declared to be thrown
         FileWriter fr=new FileWriter("abc.txt");
                       ^
1 error

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
Pointing to same file name--> "abc.txt"
i don t care re-assignment is not possible that s it..

PROGRAME=18
=========
import java.io.*;

class Test {
   public static void main(String[] args) throws Exception
	{
         try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))) 
            {
               br=new BufferedReader(new FileReader("abc.txt"));
             }
     }

   }


C:\Users\DELL\Desktop>javac Test.java
Test.java:8: error: auto-closeable resource br may not be assigned
               br=new BufferedReader(new FileReader("abc.txt"));
               ^
1 error


All resource reference variables are implicitly final and hence we can't perform
reassignment with in the try block.

EXPLANATION:-
============
1)We are using throws to avoid Checked Exception.
2)Importing IO classes..

Note:-Even though we are pointing br to same file "abc.txt" again in try block.
Compiler will not allow coz its final.
Re-assignment for final is not applicable..

Reason its final:-try with resources main objective is to close the resources when it reaches the end of 
try block.
So If we are Changing/pointing those resource reference to other REFERENCE then 
compiler/JVM is getting confused which resource should be closed Frist one or 
Changed one.

Ex:-
                try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))) 
            {
               br=new BufferedReader(new FileReader("abc.txt"));
             }

			 
			 @ the end of try----compiler/JVM  is trying to close > br---> "abc.txt"..
             But in middle br pointing to some other file.
             compiler/JVM   will get confused which br to close.(Frist one or Changed one)
			 so sun people have made it final..

See durga diagram:-1:09:00(For explanation it will be easy)
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
Pointing to differnet file

PROGRAME=19
=========
import java.io.*;

class Test {
   public static void main(String[] args) throws Exception
	{
         try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))) 
            {
               br=new BufferedReader(new FileReader("output.txt"));
             }
     }

   }
C:\Users\DELL\Desktop>javac Test.java
Test.java:8: error: auto-closeable resource br may not be assigned
               br=new BufferedReader(new FileReader("output.txt"));
               ^
1 error

EXPLANATION:-
============
All resource reference variables are implicitly final and hence we can't perform
reassignment with in the try block.
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
import java.io.*;

class Test {
   public static void main(String[] args) throws Exception
	{
	   System.out.println("Hi vinay ");
         try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))) 
            {
               
             }
     }

   }


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
NuLL left simply.

EXPLANATION:-
============

***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
Main use of try-finally.
-----------------------
try
{
	    //Exception Rising Code
    
	   /*No problem i am ready for abnormal termination,But can u close data base connecetion
	  after normal/abnormal Termination  */
}
finally
{

}
PROGRAME=22
=========
import java.io.*;

class Test {
   public static void main(String[] args) throws Exception
	{
	   System.out.println("hello beautifull");
         try(BufferedReader br=new BufferedReader(new FileReader("input.txt"))) 
            {
               
             }
     }

   }


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
hello beautifull
Exception in thread "main" java.io.FileNotFoundException: input.txt (The system cannot find the file specified)
        at java.io.FileInputStream.open0(Native Method)
        at java.io.FileInputStream.open(FileInputStream.java:195)
        at java.io.FileInputStream.<init>(FileInputStream.java:138)
        at java.io.FileInputStream.<init>(FileInputStream.java:93)
        at java.io.FileReader.<init>(FileReader.java:58)
        at Test.main(Test.java:7)

C:\Users\DELL\Desktop>

EXPLANATION:-
============
untill 1.6 versioin compulsary 
try should be followed by catch or finally.

But from 1.7 version try with resource,catch and finally are optional..
coz finally block responsibility will be completed by try with resource block only..


** vv Point
See in this Example 22:we are not getting any CompileTime Error,
 so independent try with resources is valid..
 Therefore try with resources we can write with out writing finally and catch block..(1.7 version)
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
try with multi catch block.

PROGRAME=23
=========
Valid:-
-------

try
{
	
}
catch (ArithmeticException|IOException )
{

}
catch (NullPointerException|InterruptedException )
{

}

EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----

PROGRAME=24
=========
try
{
-----------------
-----------------
}

catch(ArithmeticException e) 
	{
       e.printStackTrace();
    }
catch(IOException i)
	{
      e.printStackTrace();
    }
catch(NullPointerException  np)
	{
     System.out.println(e.getMessage());
    }
catch(InterruptedException  i) 
	{
     System.out.println(e.getMessage());
     }


Durga Point:-
Untill 1.6 version even though multiple different Exception having same handling code 
for every Exception type we have to write a separate catch block.
It increases length of the code and reduces readability.
To overcome this problem sun people introduced multi catch block in 1.7 version.
according to this we can write a single catch block that can handle multiple different type of Exception.

EXPLANATION:-
============
Vinay Point:-
=============
In this for multiple Exception same handling code is there in catch block.
i.e (e.printStackTrace(); or e.getMessage() )
Disdavantage is
Increases length of the code and reduces readability..


After 1.6 version that is from 1.7 version we have multi catch block
------------------------------------------------------------------------------

Durga Point:-
To overcome this problem sun people introduced multi catch block in 1.7 version.
according to this we can write a single catch block that can handle multiple different type of Exception.
The main advantage of this approach is length of the code will be reuced and readability will be increased..

try{}

  catch(ArithmeticException | IOException NullPointerException e) 
	  { 
		  e.printStackTrace();
	  }

catch(NullPointerException | InterruptedException e) 
	{
       System.out.println(e.getMessage());
    }


Durga Point:-
Untill 1.6 version even though multiple different Exception having same handling code 
for every Exception type we have to write a separate catch block.
It increases length of the code and reduces readability.


See try with multi catch after Example :-27
***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
PROGRAME=25
=========
class Test {
   public static void main(String[] args)
	{
            System.out.println("vinay is java");
            try
            {
				System.out.println(10/0);
			}
            
            catch (ArrayIndexOutOfBoundsException e){}
            catch (IllegalStateException ise){}
            catch (IndexOutOfBoundsException e){}
    }

}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
vinay is java
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:7)


Important Observation even though an Arithmetic Exception is raised we have not written its corresponding
catch block compier is not giving any error..
coz compiler responsibility to see try is having a catch block or not.
wheateher the catch block can handle or not compiler is never gonna check..

This important observation check for checked Exception

EXPLANATION:-
============
For the corresoponding try we can write the catch block
as order

Child    ---> ArrayIndexOutOfBoundsException
Parent   ---> IndexOutOfBoundsException


Case 2:-(Example 26)
--------
Child 1    --->ArithmeticException
Child 2    --->NullPointerException
Child 3    ---->ClassCastException
.
.
also valid see exception hiereachy diagram PDF:-7


Ex:-
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
Child 1    --->ArithmeticException
Child 2    --->NullPointerException
Child 3    ---->ClassCastException
.

PROGRAME=26
=========
class Test {
   public static void main(String[] args)
	{
            System.out.println("vinay is king in java");
            try
            {
				System.out.println(10/0);
			}
            
            catch (ArithmeticException ae){System.out.println("Top");
            	                           System.out.println("bottom");}

            catch (NullPointerException npe){}
            catch (ClassCastException cc){}
    }

}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
vinay is king in java
Top
bottom

EXPLANATION:-
============
Even Though we have written the corresponding catch block frist and its matched.
 below we can write same level Child Exception classes no problem see..
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
try with multi catch block..

PROGRAME=27
=========
class Test {
   public static void main(String[] args)
	{
            System.out.println("start of main ");
            try
            {
				System.out.println(10/0);
				String s=null;
				System.out.println(s.length());
			}
            
            catch (ArithmeticException|NullPointerException   xx)
				{
                         System.out.println(xx);
            	}
   }

}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
start of main
java.lang.ArithmeticException: / by zero

EXPLANATION:-
============

Note:-
======
1)In a try block at a time only one Exception can rise..
  see Example 27.(Preference is from top to bottom risky code in try block)

2)
When to go for try with multi catch block..?
When we don t know exactly Which Exception risky code may rise..
It may be ArithmeticException or NullPointerException




DP:-In the above Exapmle Wheather Rised Exception is ArithmeticException or NullPointerException
same catch block can listen or respond.
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
try with multi catch block..

PROGRAME=28
=========
class Test {
   public static void main(String[] args)
	{
            System.out.println("start of main ");
            try
            {    
				 
				//System.out.println(10/0);
				//Commenting Arithmetic Exception
				
				String s=null;
				System.out.println(s.length());
			}
            
            catch (ArithmeticException|NullPointerException   xx)
				{
                         System.out.println(xx);
            	}
   }

}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
start of main
java.lang.NullPointerException

EXPLANATION:-
============
Same Exception handling code can be used for both ArithmeticException,NullPointerException

***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
Small twist in try with multi catch block...

Durga Point:-(VV important Point:-)

In multi catch block there should not be any relationship between 
Exception types (eiether Child to Parent ,Parent to child, or same type.)

PROGRAME=29
=========
class Test 
{
   public static void main(String[] args)
	{
            System.out.println("start of main ");
            try
            {   
				System.out.println(10/0);
				String s=null;
				System.out.println(s.length());
			}
            
            catch (ArithmeticException|Exception   xx)
				{
                         System.out.println(xx);
            	}
   }

}

C:\Users\DELL\Desktop>javac Test.java
Test.java:12: error: Alternatives in a multi-catch statement cannot be related by subclassing
            catch (ArithmeticException|Exception   xx)
                                       ^
  Alternative ArithmeticException is a subclass of alternative Exception
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Wrong Syntax in Multi-catch block:-

catch(ArithmeticException|Exception xx)

catch(Child | Parent  xx)

internal reason is Parent class can handle Child class Exception,so wat s the use of writng 
Child class..

So inside catch block there should not be any Parent and Child relationship and vice versa..
or same type.

***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
Exception Propagation:-Inside a method an Exception is raised and we are not handling that Exception,
then that exception objcet will be propagated to caller by JVM.
Then caller method is responsible to handle that Exception.
This process is nothing but Exception propagation.

Inside a method If an Exception is raised and If we are not handling that Exception,then Exception 
Object will be propagated to caller then caller method is resoponsible to handle that Exception 
This process is called Exception propagation.

void m1()
{
	System.out.println(10/0);
}
void m2()
{
	m1();
}

PROGRAME=30
=========
class Test {
   public static void main(String[] args)
	{
            System.out.println("start of main method");
            try
            {   
				System.out.println(10/0);
				
			}
            
            catch (ArithmeticException ae)
				{
                         throw new NullPointerException();
            	}
   }

}
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
start of main method
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:13)

C:\Users\DELL\Desktop>

EXPLANATION:-
============

Rethrowing Exception:-

Need of this concept
To convert one Exception to another Exeption type.

May be for NullPointerException i configured some error page in web.xml
If NullPointerException will arise then that error page will come.

so if any ArithmeticException occurs i want that NullPointerException error page to display
then we ll go for this concept..
converting ArithmeticException to NullPointerException..

Durga Point:-
We can use this appraoch to convert one Exception type to another Exception type.

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
