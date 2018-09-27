TOPIC:-OOPS
--------
VIDEO NO=16
-----------
NUMBER OF PICTURES=
------------------
1---------------->(I:\JAVA NOTES\DURGA JAVA NOTES\OOPS\OOPS_DURGA_VIDEO_16)

-----------------------------------------
VIDEO COMPLETED=YES
----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
3(*)
8(**)
13
16(***)
21(**)--->case 1
25(***************)
28(********)
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
class Test
{
	int x=10;
	Test()
	{
		this(10);
		System.out.println("no-arg consructor");
	}
			Test(int x)
	{
		this(10.5);
		System.out.println("int-arg consructor");
	}
			Test(double d)
	{
				System.out.println("double-arg consructor");
	}
public static void main(String[] args) 
   {
    Test t=new Test();   
   }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
double-arg consructor
int-arg consructor
no-arg consructor
EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
class Test
{
	int x=10;
	Test()
	{
		this(10);
		System.out.println("no-arg consructor");
	}
			Test(int x)
	{
		this(10.5);
		System.out.println("int-arg consructor");
	}
			Test(double d)
	{
				System.out.println("double-arg consructor");
	}
public static void main(String[] args) 
   {
    Test t=new Test(10);   
   }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
double-arg consructor
int-arg consructor
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
Automatic promotion in constructor also see..

PROGRAME=3
=========
class Test
{
	int x=10;
	Test()
	{
		this(10);
		System.out.println("no-arg consructor");
	}
			Test(int x)
	{
		this(10.5);
		System.out.println("int-arg consructor");
	}
			Test(double d)
	{
				System.out.println("double-arg consructor");
	}
public static void main(String[] args) 
   {
    Test t=new Test(10l);   
   }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
double-arg consructor

EXPLANATION:-
============
Givind long but double is getting the chance see..
automatic promotion is applicable for constructor also...



check for reference type also automatic promotion is also applicable....?
child---parent..?
----------------------------------------------------------------
Reference Type Case 1:-

----------------------------------------------------------------
----------------------------------------------------------------
-----------------------------------------------------------------
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
Within a class we can declare multiple constructor.
and all these constructor is having same name but different types of arguments,
Hence all these constructor are considered as overloaded constructor.
Hence overloading concept is applicable for constructor..
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
class Parent
{
	void m2()
	{
		System.out.println("Parent");
	}

}

class Child extends Parent
{
	void m1()
	{
		System.out.println("Child method");
	}

	void Calliing()
	{
          this.m1();
		  super.m2();
	}
              public static void main(String[] args) 
             {
                  Child t=new Child();   
				  t.m1();
				  t.m2();
            }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
Child method
Parent

EXPLANATION:-
============
We can use this and super to call methods also see this...
***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
class Test
{
	Test(int x)
	{
		this.x=x;
	}
	public static void main(String [] args)
	{
		new Test(10);
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: cannot find symbol
                this.x=x;
                    ^
  symbol: variable x
1 error
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
Wat ever methods avaliable in Parent is avaliable to Child through inheritance concept.

But Parent class constructor is not avaliable to Child class,we can call Parent class constructor
but its not avaliable to Child class through inheritance concept.

PROGRAME=8
=========
class Parent
{
	Parent()
	{
		System.out.println("Parent class constructor");
	}
}

class Child extends Parent
{
	Child (int x)
	{
		System.out.println("Child class constructor");
	}
	public static void main(String [] args)
	{
		Parent p=new Child();
    }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:17: error: constructor Child in class Child cannot be applied to given types;
                Parent p=new Child();
                         ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

EXPLANATION:-
============
Parent p=new Child();
                ---->here its lookin for zero arg constructor but it can t find it.
				so its giving CE..

See the .class file also 

Parent class..
--------------
import java.io.PrintStream;

class Parent
{

    Parent()
    {
        System.out.println("Parent class constructor");
    }
}

Child class
----------
import java.io.PrintStream;

class Child extends Parent
{

    Child()
    {
        System.out.println("Child class constructor");
    }

    public static void main(String args[])
    {
    }
}

Seee in .class file also Parent class constructor is not avaliable..


Conclusion:-So inheritance and overriding concept is not applicable for constructor..
But overloading concept is applicable..
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
Every class in java including abstract class can contain constructor.
But interface does nt contain constructor..
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Normal class in java contains constructor.

PROGRAME=10
=========
class Test
{
	public static void main(String[] args)
	{
		System.out.println("hello world");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello world

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
abstract class Test
{
	Test()
	{
		System.out.println("abstract class constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("hello world abstract class");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

hello world abstract class

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
It s not possible to create an instance for an abstract class,then how its possible to execute the constructor
of an abstract class..

here is the solution..
Important Point constructor are not executed automatically..
We should create an instane or call (implicitly/explicityly).

So to call an abstract class constructor compliler calls automatically by writing 
super(); in the frist line of the constructor if we are not writing..

PROGRAME=12
=========
abstract class Parent
{
	Parent()
	{
		System.out.println("abstract class Parent constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("hello world abstract class");
	}
}

class Child extends Parent
{
	Child()
	{
		System.out.println("Child class constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("hello world Child class");
		new Child();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
hello world Child class
abstract class Parent constructor
Child class constructor
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----

No IS-A relation ship then compiler writes super();
So object class constructor will be executed,which is having empty implementation.

PROGRAME=13
=========
abstract class Parent
{
	Parent()
	{
		System.out.println("abstract class Parent constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("hello world abstract class");
	}
}

class Child 
{
	Child()
	{
		System.out.println("Child class constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("hello world Child class");
		new Child();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
hello world Child class
Child class constructor
 
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
Important Point constructor are not executed automatically..
We should create an instane or call (implicitly/explicityly).

PROGRAME=15
=========
abstract class Parent
{
	Parent()
	{
		System.out.println("abstract class Parent constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("hello world abstract class");
	}
}

class Child
{
	Child()
	{
		System.out.println("Child class constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("hello world Child class");
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
hello world Child class
      
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Interface doesent contain constructor.
eiether user programmer wriiten or compiler generated defalut constructor..
so interface concept is not applicable for constructor..
 
PROGRAME=16
=========
interface Test
{
	Test()
	{

	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: <identifier> expected
        Test()
            ^
1 error
EXPLANATION:-
============
The main purpose of constructor is to perform intialization of an Object.
that is to perform intialization of instance variables..
But every variable present inside interface is static variable so constructor concept is not applicable..
If there is no instance variable then then there is no chance of existing constructor..

so constructor concept is not applicable to interface..
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
In this interface there is no default constructor..

PROGRAME=17
=========
 interface Test
{
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
If we are keeping matchbox and petrol together it wont get ignited automatically..

PROGRAME=18
=========
class Test
{
	public static void m1()
	{
		m2();
		System.out.println("m1 methd");
	}

	public static void m2()
	{
		m1();
		System.out.println("m2 methd");
	}
	public static void main(String[] args)
	{
		System.out.println("hello");
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
class Test
{
	public static void m1()
	{
		m2();
		System.out.println("m1 methd");
	}

	public static void m2()
	{
		m1();
		System.out.println("m2 methd");
	}
	public static void main(String[] args)
	{
		m1();
		System.out.println("hello");
	}

}

   
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.StackOverflowError
        at Test.m2(Test.java:11)
        at Test.m1(Test.java:5)
        at Test.m2(Test.java:11)
        at Test.m1(Test.java:5)
        at Test.m2(Test.java:11)

EXPLANATION:-
============
In this example there is one Thread,i.e main Thread.
For every Thread JVM is going t create a Run time Stack.

1)The frist method call which is executed by main Thread is main() method.
main () method internallly calls m1()
m1() internally calls m2()
m2() internalls callls m1().

See the diagram
I:\JAVA NOTES\DURGA JAVA NOTES\OOPS\OOPS_DURGA_VIDEO_16



Recursive method call is a Run time exception saying StackOverflowError
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
Recursive method call is a RuntimeException which occur at Run time not at Compiletime,
and in the same case

In constructor Recursive call is a error,its not an Exception...

Example:-19 is Exception.
Example:-20 is error.

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
class Test
{
	Test()
	{
		this(10);
	}
	Test(int x)
	{
		this();
	}
	public static void main(String[] args)
	{
		System.out.println("main");
	}

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: recursive constructor invocation
        Test(int x)
        ^
1 error

EXPLANATION:-
============
In a constructor even though we are not calling the constructor by creating an object.
If there is a chance of Recursive constructor call,then the code won t compile,and we will get error..
 constuctor recursive will be checked by compiler and gives an error..

But in method we ll get Exception.
in the case of recursive method call we ll get Exception,

Find the internal reason..
y in constructor we ll get CE error...

Recursive method call is RuntimeException saying stackoverflow error occurs when we call one method
calls another method..

***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
Case :-1

class Parent
{
}
class Child extends Parent
{
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

Compiler generated code:-

valid case:-
----------
class Parent
{
	Parent()
	{
		super();
	}

}
class Child extends Parent
{
	Child()
	{
		super();
	}
}

-------------------------------------------------------------------------------------
Case 2:-

class Parent
{
	Parent()
	{
	}
}
class Child extends Parent
{

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

Compiler Generated Code:-
-------------------------
Valid Case:-
----------
class Parent
{
	Parent()
	{
		super();
	}
}
class Child extends Parent
{    
       Child()
	{
		   super();
	}
}
-------------------------------------------------------------------------------------
Case 3:-
class Parent
{
	Parent(int i)
	{
	}
}
class Child extends Parent
{

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: constructor Parent in class Parent cannot be applied to given types;
class Child extends Parent
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

Compiler Generated Code:-
-------------------------
class Parent
{
	Parent(int i)
	{
	}
}
class Child extends Parent
{
       Child()
	{
		   super(); // in Parent there is no args constructor so we getting an error
	}
}

Conclusion:-

We should write the code as
Coz see the error its asking int as argument,but we giving no-args so we are getting an error..

class Child extends Parent
{
       Child()
	{
		   super(10); 
	}
}

***
Important Point:-
If the parent class contain  any argumented constructor,then while writing some Child classes compulsary
its recomended to write some zero arg constructor in parent..

When ever we are writing any arg constructor Its highly recomemnded to write no-arg constructor also...

EXPLANATION:-
============
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========

IOException--->Checked Exception.
If a method throws a checked exception,caller is responsible to handle that exception.
If the caller won t handle that Exception we ll get CE.

In this m1() is the caller...
We can handle the exeption in 2 ways....
1)try-catch (Keep the m2() method call inside the try-catch)
2)throws


void m1()
{
	m2();
}



m2() throws IOException
{

}

EXPLANATION:-
============
Same concept applicable for-constructor..
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
import java.io.*;
class Parent
{
	Parent() throws IOException
	{
	}
}
class Child extends Parent
{

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: unreported exception IOException in default constructor
class Child extends Parent
^
1 error

EXPLANATION:-
============
The caller is not handling the Exception..

compiler Generated code:-
-------------------------

import java.io.*;
class Parent
{
	Parent() throws IOException
	{
	}
}
class Child extends Parent
{
       Child()
	{
		   super();// Calling the Parent Constructor but not handling that Exception..
	}
}




***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
Different ways to handle the Exception in Example:-24

try-catch
throws

PROGRAME=25
=========
import java.io.*;
class Parent
{
	Parent() throws IOException
	{
	}
}
class Child extends Parent
{
       Child()
	{
		  try
		  {
			 super();
		  }
		  catch (IOException e)
		  {
		  }
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:14: error: call to super must be first statement in constructor
                         super();
                              ^
1 error

EXPLANATION:-
============
We cannot do like this coz frist statement inside every Constructor is super();
and we are writing inside  try-catch block...

So try-catch approach won t work....
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
import java.io.*;
class Parent
{
	Parent() throws IOException
	{
	}
}
class Child extends Parent
{
       Child() throws IOException
	{
	 super();
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
import java.io.*;
class Parent
{
	Parent() throws IOException
	{
	}
}
class Child extends Parent
{
       Child() throws Exception
	{
	 super();
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
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

Important Rule:-
If Parent class constructor throws any Checked Exception compulsary Child class constructor
should throw the same Checked Exception or its Parent otherwise the code won t compile..

***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
PROGRAME=29
=========
EXPLANATION:-
============
The main purpose of constructor is to create an object:- false
The main purpose of an constructor is to intialize an object:-True..

The name of the constructor need not be same as class name:-false..
constructor name and class name must be same:-True..

Return type concept is applicable for constructor,that is only void:- false..


We can apply any modifier for the constructor:-false.
public,private,protected and default only applicable...(True)



Default constructor generated by JVM.
Default constructor gfenerted by Compiler...


Compiler will always generate default constructor:-false.
If we are not writing any constructor, then compiler will generate default constructor..


If we are not writing no-arg constructor compiler will generate default constructor:-false
If we are not writing any constuctor then compiler will generate default constructor..True.


Every no-arg constructor is a defalut constructor:-false..
Compiler generated constructor is default constructor..

default constructor is always no-arg constructor:-True..

The frist line inside every constructor is eiether super() or this().
If we are not writing then compiler will generate this() --->false..
Compiler will always write super():-true...



For constructor overloading concept is applicable.
For constructor overriding concept is not applicable...


For constructor inheritance Concept is  applicable,but not overriding:-false.
(Because Parent class constructor is not visible to Child)

Only concerete classes can contain constructor:-false..
abstract classes can also contain constructor:-True.

Interface can contain constructor:-false.

Recursive constructor invocation is a RunTime Exception:-False
(No it s Compile time error)


If Parent class constructor throws some checked exception compulsary child class consructor
should throw the same checked exception or its Child(false)


If Parent class constructor throws some checked exception compulsary child class consructor
should throw the same checked exception or its Paernt(true)
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
