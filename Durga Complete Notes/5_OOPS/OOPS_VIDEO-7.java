TOPIC:-OOPS
--------
VIDEO NO=7
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=NO
-----------------
(1:10:56)
**************************************************************************************
IMPORTANT EXAMPLES:-
12(overloading static--->non-static vice-versa there is no rule we can overload.)
               (Parent)      (child)

14(Type casting in argument only) see the style.

16(automatic type promotion some confusing,but overloading only see..
   Exact type is going to get the chance.)
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
overriding with respect to vararg method.

PROGRAME=1
=========
EXPLANATION:-
============
In overriding method name must be same and argument must be same.

But here method name is same but argument is different so it s not overiding its overloading.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
Its not overriding,in overriding method name must be same and argument must be same.

But here

parent method signature------> m1(int ...x)
child method signmature------>m1(int x)
here argument is different so its not overriding,it is overloading.


same name different arguments--->overloading.


var -arg method can be overide from a another var-arg method only.

we cannot override var-arg method with normal method,if we are doing like this its called overloading
not overriding.

case 1:- overriding valid case w.r.t to var-arg method.
valid
------
parent method signature------> m1(int ...x)
child method signmature------>m1(int ...y)


case 2:- overloading valid case w.r.t to var-arg method.
valid
------
parent method signature------> m1(int ...x)
child method signmature------>m1(int x)


PROGRAME=2
=========
class Parent
{
	void m1(int ...x)
	{
	System.out.println("Parent");
	}
}
class Child extends Parent
{
   void m1(int x)
	{
	System.out.println("Child");
	}
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Parent();
	  p.m1(10);

	  Parent p1=new Child();
	  p1.m1(10);
   
      Child c=new Child();
	  c.m1(10);
	}
}
C:\Users\dell1\Desktop>javac  Test.java

C:\Users\dell1\Desktop>java Test
Parent
Parent
Child

EXPLANATION:-
============
Durga Point:-we can overide var-arg method with another var-arg method only.

If we are trying to override with normal method then it will become overloading but not
overriding.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
cd /

in cmd window it will go the end of the drive..
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
overriding w.r.t to var-arg method..

PROGRAME=4
=========
 class Parent
{
	void m1(int ...x)
	{
	System.out.println("Parent");
	}
}
class Child extends Parent
{
   void m1(int ...x)
	{
	System.out.println("Child");
	}
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Parent();
	  p.m1(10);

	  Parent p1=new Child();
	  p1.m1(10);
   
      Child c=new Child();
	  c.m1(10);
	}
}
C:\Users\dell1\Desktop>javac  Test.java

C:\Users\dell1\Desktop>java Test
Parent
Child
Child

EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Overriding with respect to variables:
Overriding concept is not applicable for variables.
Variable resolution is always takes care by compiler based on reference type.

PROGRAME=5
=========
 class Parent
{
	int x=555;
}
class Child extends Parent
{
    int x=999;
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Parent();
	  System.out.println(p.x);
     
	  Parent p1=new Child();
	  System.out.println(p1.x);
   
      Child c=new Child();
	  System.out.println(c.x);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
555
555
999

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
Variable resolution is always takes care by compiler based on reference type wheather it may be static 
or instance variable.
 
Frist remenber that overriding concept is not applicalbel for variables.

PROGRAME=7
=========

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
Parent--->static 
Child--->static

PROGRAME=8
=========
 class Parent
{
	static int x=555;
}
class Child extends Parent
{
    static  int x=999;
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Parent();
	  System.out.println(p.x);
     
	  Parent p1=new Child();
	  System.out.println(p1.x);
   
      Child c=new Child();
	  System.out.println(c.x);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
555
555
999
EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Parent--->instance 
Child--->static

PROGRAME=9
=========
class Parent
{
	 int x=555;
}
class Child extends Parent
{
    static  int x=999;
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Parent();
	  System.out.println(p.x);
     
	  Parent p1=new Child();
	  System.out.println(p1.x);
   
      Child c=new Child();
	  System.out.println(c.x);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
555
555
999

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Parent--->static 
Child--->instance

PROGRAME=10
=========
 class Parent
{
	static int x=555;
}
class Child extends Parent
{
      int x=999;
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Parent();
	  System.out.println(p.x);
     
	  Parent p1=new Child();
	  System.out.println(p1.x);
   
      Child c=new Child();
	  System.out.println(c.x);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
555
555
999
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
In overloading we can use any modifier we can

Parent-->public
Child--->private
no restriction on modifier in overloading.


overloading:-
Compile time polymorphism (or)static polymorphism(or)early binding.
PROGRAME=11
=========

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
 In overloading there is no rule as

 Parent--->static
 Child--->non-static.

Parent--->non-static
Child--->static.

it s overloading there is no such rule,It s oveloading only.

PROGRAME=12
=========

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
In this programe just observe and see that while calling the required method
its accepting short but we giving 10 so by default its int so we cannot call we getting incompatible 
type problem.

PROGRAME=13
=========
 import java.io.*;
class Parent
{
	public static void m1(short s) throws IOException
	{
	  System.out.println("Parent");
	}
}
class Child extends Parent
{
      public void m1(int x)
	   {
	  System.out.println("Child");
	   }
}
class Test
{
	public static void main(String[] args)
	{
	  Parent p=new Parent();
      p.m1(10);
		  
	  Child c=new Child();
	  c.m1(100);

	  Parent p1=new Child();
	  p1.m1(  10);
	  
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:21: error: incompatible types: possible lossy conversion from int to short
      p.m1(10);
           ^
Test.java:27: error: incompatible types: possible lossy conversion from int to short
          p1.m1(  10);
                  ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors

 
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
Please the observe the typecasting and handled exception..
which have occured in Example :-13..
How we doing type casting to short and doing it in argument only.
type casting in argument only.

PROGRAME=14
=========
 import java.io.*;
class Parent
{
	public static void m1(short s) throws IOException
	{
	  System.out.println("Parent");
	}
}
class Child extends Parent
{
      public void m1(int x)
	   {
	  System.out.println("Child");
	   }
}
class Test
{
	public static void main(String[] args) throws IOException
	{
	  Parent p=new Parent();
      p.m1((short) 10);
      
		  
	  Child c=new Child();
	  c.m1(100);

	  Parent p1=new Child();
	  p1.m1(  (short) 10);
	  
	}
}


C:\Users\dell1\Desktop>javac  Test.java

C:\Users\dell1\Desktop>java Test
Parent
Child
Parent

EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========                   Overloading w.r.t static modifier see
NOTE:-
-----
overloading 
static--->non static
non static--->static 
                      valid thers s no restriction in overloading..


PROGRAME=15
=========
 class Parent
{
	public static void m1(String s) 
	{
	  System.out.println("Parent");
	}
}
class Child extends Parent
{
      public void m1(int x)
	   {
	  System.out.println("Child");
	   }
}
class Test
{
	public static void main(String[] args) 
	{
	  Parent p=new Parent();
      p.m1("vinay");
      
		  
	  Child c=new Child();
	  c.m1(10);

	  Parent p1=new Child();
	  p1.m1("Shetty");
	  
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent
Child
Parent
 
      
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
See exact match is getting the chance overloading only.. 
but confusion see automatic type promotion happening.

PROGRAME=16
=========
 class Parent
{
	public static void m1(int x) 
	{
	  System.out.println("Parent");
	}
}
class Child extends Parent
{
      public void m1(byte x)
	   {
	  System.out.println("Child");
	   }
}
class Test
{
	public static void main(String[] args) 
	{
	  Parent p=new Parent();
      p.m1(10);
      
		  
	  Child c=new Child();
	  c.m1(10);

	  Parent p1=new Child();
	  p1.m1(10);
	  
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent
Parent
Parent


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
 Consider the method in parent class
Parent: public void methodOne(int i)throws IOException
------------------------------------------------------------------------

In the child class which of the following methods we can take..

Parent: public void methodOne(int i)throws IOException
Child:public void methodOne(int i)//valid(overriding)
    -------->

Vinay Point:-

method signature is same,
Child class is not throwing any exception,so we need not to worry wat parent throws 
---------------------------------------------------------------------------------------  
Parent: public void methodOne(int i)throws IOException
Child:private void methodOne()throws Exception//valid(overloading)

---------------------------------------------------------------------------------------
3. 
Parent:public void methodOne(int i)throws IOException
Child:public native void methodOne(int i);//valid(overriding)

method name is same and argument is same so its overriding and 
and 
Page no:-195
Page no:-24/62

child class native and parent class non-native vice-versa both are valid..

and see the Child class throws any checked exception,compulsary Parent class should throw the same 
checked exception or its parent..
here child class is not throwing any thing so no need to worry..
---------------------------------------------------------------------------------------
Parent: public void methodOne(int i)throws IOException
4. public static int methodOne(double d)//valid(overloading)

 
method name same and argument is different so its overloading only..
change in argument type.

in overloading we don t need to check return type,
Parent type--->void
child type---->int

non-static to static  and vice versa is valid overloading.

in overloading we don t need to check return type,acess modifier
only we need to see method name is same and argument is different..
---------------------------------------------------------------------------------------
5. public static void methodOne(int i)
  
method signature is same so its oveririding and in overriding we cannnot override from
static to non-static.
non-static-to static.


Compile time error :

methodOne(int) in Child cannot override methodOne(int) in Parent; overriding
method is static
---------------------------------------------------------------------------------------
6. 
Parent: public void methodOne(int i)throws IOException
Child:  public static abstract void methodOne(float f)

 
       Its overloading only coz method name is same and argument is different..
	   and even non-static to static 
	            non abstract to abstract is overloading is possible..

				1)But see the error static and abstract is illegal combination
                2)And mostly wheather the Child class is not declared as abstract i guess..

Compile time error :
1. illegal combination of modifiers: abstract and static
2. Child is not abstract and does not override abstract method
methodOne(float) in Child
---------------------------------------------------------------------------------------
7
Parent: public void methodOne(int i)throws IOException
child:public void methodOne(int i) throws Exception
 
 Its overiding method names are same and argument are same.
 But in overriding in child class throws any checked exception compulsary parent class method should
 throw the same checked exception or it s parent.

 But in this example Child is throwing Exception.
 Which is in High hiereachy.
 
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
 Overloading abstract method to non-abstract and vice versa is allowed.
 Vinay doubts so do some R and D is it overloading or data-hiding.

PROGRAME=18
=========
 abstract class Parent
{
	public static void m1(String s) 
	{
	  System.out.println("Parent");
	}
    abstract public void m1(int x);
}

class Test
{
	public static void main(String[] args) 
	{
	  System.out.println("Hello");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Hello

EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
 Overloading abstract method to non-abstract and vice versa is allowed.
 Vinay doubts so do some R and D is it overloading or data-hiding.

PROGRAME=19
=========
  class Parent
{
	public static void m1(String s) 
	{
	  System.out.println("Parent");
	}
    
}

abstract class Child extends Parent
{
	abstract public void m1(int x);
}

class Test
{
	public static void main(String[] args) 
	{
	  System.out.println("Hello");
	  Parent p=new Parent();
	  p.m1("Vinay");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Hello
Parent

EXPLANATION:-
============
In example 19 and 18 its overloading only coz method resolution is always takes care by compiler
based on reference.

We cannot create a Runtime Object for abstract method so JVM won t  get the  chance..
coz in method overriding method resouluton alwayas take care JVM based on RunTime object.
RunTime object is not avaliable so see the difference.
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
EXPLANATION:-
============
Polymorphism:-
 Overloading and Overriding is the concept of Polymorphism only.

 Student behaviour in front of parents (studies,temple)
 Student behaviour in front of friends(brandy,girls,trip)

 Overloading is under polymorphism only. (Different behaviour)
method name is same but argument is different.

 abs(int x)
 abs(long x)
 abs(float f)


over riding is also under polymorphism.

same method signature but different implementation.

 class Parent
 {
   public void marriage()
	 {
       System.out.println("subbalakshmi");
	 }
 }

 class Child extends Parent
 {
	 public void marriage()
	 {
       System.out.println("Megahanan");
	 }
 }


 Polymorphism:-
 One name but multiple forms is a concept of polymorphism
 method name is the same but we can apply different types of argumets (method overloading)
Ex:-
 abs(int x)
 abs(long x)
 abs(float f)

 Method signature is same but in parent type one type of implementation
 and in Child class another type of implementation (overriding)
 
 EX:-
  class Parent
 {
   public void marriage()
	 {
       System.out.println("subbalakshmi");
	 }
 }

 class Child extends Parent
 {
	 public void marriage()
	 {
       System.out.println("Megahanan");
	 }
 }

***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
One exceptional case where we get Child class methods
even though we use 
Parent p=new Child();
coz we using interface as Parent reference.

same magic also for interface also i guess.

PROGRAME=21
=========
 interface Parent
{
public void m1();
public void m2();
public void m3();
}

class Child implements Parent
{
	public void m1()
	{
		System.out.println("m1-method");
	}
	public void m2()
	{
		System.out.println("m2-method");
	}
	public void m3()
	{
		System.out.println("m3-method");
	}
}

class Test
{
  public static void main(String[] args) 
   {
	        Parent p=new Child();
	        p.m1();p.m2();p.m3();
   }	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
m1-method
m2-method
m3-method

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
