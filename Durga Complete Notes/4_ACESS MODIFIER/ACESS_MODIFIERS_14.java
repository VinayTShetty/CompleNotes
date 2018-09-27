TOPIC:-ACESS MODIFIER
--------
VIDEO NO=14
-----------
NUMBER OF PICTURES=1,
------------------
1--->(I:\JAVA NOTES\DURGA JAVA NOTES\ACESS MODIFIER\DURGA_MODIFIER_VIDEO_14)

VIDEO COMPLETED=NO
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
9(constructor)
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
Difference b/w interface,abstract,concerete class.


Note:-At the end of the day we should go for concerete class.

1)If we don t know anything about implementation just we have requirement specification then we 
go for interface concept.
Ex:-Servlet(I)

2)I know about implementaion but not completely but partially implementaion then we should go for
abstraction concept.
 OR
We are talking about implementation but not completely(partial implementation),then we should go
for abstract concept..
 Ex:-generic servlet(AC)
    Http servlet(AC)

3) I know about implementation and completely i can implement then we should go for concerete class.
   OR
If we are talking about implementation and ready to provide service then we should go for
cocnerete class.


interface--->servlet(I)
  |
  |
abstract--->HTTP servlet
 |         -->generic servlet.
 |
 concerete class
                --->My own servlet.



 Ex:-Building plan 1000 floor

interface
 |    ----->frist we ll go plan
 |
 |
 abstract--->completed till 600 floor
  |             remaining floor some changes or any new plans are there
  |
conceret class--->completed all 100 floor.


See the figure (I:\JAVA NOTES\DURGA JAVA NOTES\ACESS MODIFIER\DURGA_MODIFIER_VIDEO_14)
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
In deffierence table
Page-->176(PDF)
page-->(60)

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
interface:-
 
In interface column 2 point add this:-

Every method present inside interface is always public and abstract whether we are
declaring or not.
hence interface is considered as 100% pure abstract class 

Every method present inside interface is always public and abstract whether we are declaring or not.
so We can't 'declare interface methods with the modifiers private, protected, final, static,
synchronized, native, strictfp.


As every interface variable is public static final we can t declare with following modifiers 
private, protected
volatile,transient.

 Inside interface we can t declare static and instance block.

 
for interface variable compulsary we should perform intializtion at the time of declaration
only otherwise we ll get CE.

inside interface we can t declare constructor 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
abstract

column:-3

In abstract column 2 point add this:-

Every method present inside abstract class need not be public and abstract.
Hence we can take concerete methods  also.

column:-4
Every abstract class variable need not be public static final.
We can take private,
           non-public and non final and instance varibales.

		   
For abstract class variable we are not required to perform intialziation at the time of
 declaration.

 
 inside abstract class we can declare static and instance block.

 inside abstract class we can declare constructor.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
 interface It1
{
	int x=99;
}

interface It2
{
	int x=77;
}

class Test implements It1,It2
{
 public static void main(String[] args)
	{
     System.out.println(It1.x);
     System.out.println(It2.x);
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
99
77
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
Wat is the need of constructor in abstract class.
case 1:-
abstract class without constructor.
----------------------------------------------------------------------------------------
 We can t create object for abstract class,
 But abstract class can contain constructor wat is the need....?


 abstract class constructor will be executed when ever we are creating child class objects 
 to perform intialization of child class object.
-------------------------------------------------------------------------------------------------
 Case 1:-

 abstract class Student
 {
	 Student()
	 {
		System.out.println("Student class constructor"); 	 
	 }
}

 
 class Test extends Student
{
	 public static void main(String[] args) 
	  {
            Test t= new Test();
	  }
	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Student class constructor

When ever we are not writing any constructor then compiler or jvm i guess will write one default
constructor with zero args.

In the frist line of that defalut constructor super(); keyword will be written by deafult.
so super means parent class constructor will get the chance.
so parent class constructor will get the chance.
----------------------------------------------------------------------------------------
case 2:-

  abstract class Student
 {
	 Student()
	 {
		System.out.println("Student class constructor"); 	 
	 }
}

 
 class Test extends Student
{
	 Test()
	 {
          System.out.println("0-args constructor");		 
	 }
	 Test( int x)
	 {
		 System.out.println("1-args constructor");
	 }
	 Test(String s,int x)
	 {
		 System.out.println("2-args constructor");
	 }
	 public static void main(String[] args) 
	  {
            Test t= new Test();
            Test t1=new Test(10);
            Test t2=new Test("vinay",3500);
	  }
	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Student class constructor
0-args constructor
Student class constructor
1-args constructor
Student class constructor
2-args constructor

If we are not writing super(),
then compiler will write super(),which is always call to parent class default constructor.
------------------------------------------------------------------------------------------
Case 3:-
 abstract class Student
 {

 }

 
 class Test extends Student
{
	 Test()
	 {
          System.out.println("0-args constructor");		 
	 }
	 Test( int x)
	 {
		 System.out.println("1-args constructor");
	 }
	 Test(String s,int x)
	 {
		 System.out.println("2-args constructor");
	 }
	 public static void main(String[] args) 
	  {
            Test t= new Test();
            Test t1=new Test(10);
            Test t2=new Test("vinay",3500);
	  }
	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0-args constructor
1-args constructor
2-args constructor

Not writing any constructor in Parent(Student),so compiler will generate constructor with 0-args
and empty implementation.
------------------------------------------------------------------------------------------
case :-4
  
  abstract class Student
 {
	 Student()
	 {
		System.out.println("Student class constructor"); 	 
	 }
}

 
 class Test extends Student
{
	 Test()
	 {
          System.out.println("0-args constructor");		 
	 }
	 Test( int x)
	 {
		 System.out.println("1-args constructor");
	 }
	 Test(String s,int x)
	 {
		 System.out.println("2-args constructor");
	 }
	 public static void main(String[] args) 
	  {
		   //Parent reference and child class Object.
		   //we can use abstract class reference as parent no problem.

            Student t= new Test();

            Student t1=new Test(10);

            Student t2=new Test("vinay",3500);
	  }
	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Student class constructor
0-args constructor
Student class constructor
1-args constructor
Student class constructor
2-args constructor

same as above just observe the object creation. 
  //Parent reference and child class Object.
		   //we can use abstract class reference as parent no problem.

            Student  t =  new  Test();
           (abstract)
            Student t1=new Test(10);

            Student t2=new Test("vinay",3500);
------------------------------------------------------------------------------------------
Important Point:-
Whenever we are creating child class object parent class constructor will be executed,
parent class object will not be created...

 the above cases are shown with proof


 Whenever we are creating child class object ,parent class object won t be created,
just  parent class constructor will be excuted for child object purpose only
coz parent class contain some properties(variables) which are needed for child.
------------------------------------------------------------------------------------------
Programe:-

hashcode is an instance method i guess.we should call using object reference..

here s one small point to remember inside instance area we can use this 
this--->keyword always refers to the correspomding calling object reference in instance area...
coz we need an object reference to call an instance method.

 Programe:-1
  class Parent
{
	Parent()
	{
	 System.out.println(this.hashCode());
	}
}
class Child extends Parent
{
	Child()
	{
      System.out.println(this.hashCode());
	}
}

class Test
{
	public static void main(String [] args)
	{
		Child c =new Child();
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
705927765
705927765
-----------------------------------------------
 Programe:-2
  class Parent
{
	Parent()
	{
	 System.out.println(this.hashCode());
	}
}
class Child extends Parent
{
	Child()
	{
      System.out.println(this.hashCode());
	}
}

class Test
{
	public static void main(String [] args)
	{
		Child c =new Child();
		System.out.println(this.hashCode());
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:21: error: non-static variable this cannot be referenced from a static context
                System.out.println(this.hashCode());
                                   ^
1 error
 -----------------------------------------------
 Programe:-3
  class Parent
{
	Parent()
	{
	 System.out.println(this.hashCode());
	}
}
class Child extends Parent
{
	Child()
	{
      System.out.println(this.hashCode());
	}
}

class Test
{
	public static void main(String [] args)
	{
		Child c =new Child();
		System.out.println(c.hashCode());
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
705927765
705927765
705927765
 --------------------------------------------------------
 Programe:-4
class Parent
{
	Parent()
	{
	 System.out.println(this.hashCode());
	}
}
class Child extends Parent
{
	Child()
	{
      System.out.println(this.hashCode());
	}
}

class Test
{
	public static void main(String [] args)
	{
		new Child();
		System.out.println(new Child().hashCode());
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
705927765
705927765
366712642
366712642
366712642


------------------------------------------------------------------------------------------
IMPORTANT POINT:-

WE CAN'T' CREATE OBJECT FOR ABSTRACT CLASS EITHER DIRECTLY OR INDIRECTLY.

we can t create object  for interface.
------------------------------------------------------------------------------------------
abstract class contain constructor but interface does nt contain constructor.

The main purpose for constructor is to intilaize the instance variable,
not to create object.
so inside abstract class there might be instance variable,so to perform intialization of that
isntance variable constructor is necessary in abstract class.

abstract class can contain instance varibles which may be necessary for child object,
so to perform intilazation of those instance varibles,construtor is required abstract class. 
------------------------------------------------------------------------------------------


But in interface we don t have instance varibale,
we have public static final variables,
so constructor is not necessary in interface.

But every variable present inside interface is public static final wheather we declare or not.
and there is no chance of existing isntance variable so constructor is not required for interface.
------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------


PROGRAME=4
=========
 abstract class Person
{
	String name;
	int age;
}


class Student extends Person
{
	int rollno;
	Student(String s,int age,int rollno)
	 {
		this.name=s;
	    this.age=age;
		this.rollno=rollno;
	 }
public static void main(String[] args)
	{
         Student s =new Student("vinay",28,00074);
	}
}
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 abstract class Person
{
	String name;
	int age;
}

class Student extends Person
{
	int rollno;
	Student(String s,int age,int rollno)
	 {
		this.name=s;
	    this.age=age;
		this.rollno=rollno;
	 }
public static void main(String[] args)
	{
         Student s =new Student("vinay",28,00074);
	}
}

class Teacher extends Person
{
	String subject;
	
	Teacher(String s,int age,int rollno,String subject)
		{
    	this.name=s;
	    this.age=age;
		this.rollno=rollno;
		this.subject=subject;
        }
    public static void main(String[] args)
	{
         Teacher t =new Teacher("Shilpa",25,00045,"java");
	}

}
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-Not explained properly example 4 and 5 so see this Example 7 and below.
-----
PROGRAME=7
=========
 abstract class SJCE
{
     String collegename;
     int fees;
     String branch;
}

class Vinay extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Vinay(String collegename,int fees,String branch,String stname,int rollno,int marks)
	 {
        this.collegename=collegename;
        this.fees=fees;
        this.branch=branch;
        this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
	public static void main(String[] args)
	{
         Vinay v =new Vinay("SJCE",28000,"IE","VINAY",18,40);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
         }
}

class Banu extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Banu(String collegename,int fees,String branch,String stname,int rollno,int marks)
	 {
        this.collegename=collegename;
        this.fees=fees;
        this.branch=branch;
        this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
public static void main(String[] args)
	{
         Banu v =new Banu("SJCE",28000,"IE","Banu",05,90);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Vinay
SJCE
28000
IE
VINAY
18
40

C:\Users\dell1\Desktop>java Banu
SJCE
28000
IE
Banu
5
90

EXPLANATION:-
============
Every time we need to provide intialization of abstract class variables if we extend
abstract class. 
here they are only few varables,if we contain more variables in abstract then readabilit of the code 
will dumb.
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 abstract class SJCE
{
     String collegename;
     int fees;
     String branch;
    
	 SJCE(String collegename,int fees,String branch )
     {
          this.collegename=collegename;	 
          this.fees=fees;
          this.branch=branch;
     }
}

class Vinay extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Vinay(String stname,int rollno,int marks)
	 {
		super("SJCE",28000,"IE");
        this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
	public static void main(String[] args)
	{
         Vinay v =new Vinay("VINAY",18,40);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
         System.out.println("=======");
    }
}

class Banu extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Banu(String stname,int rollno,int marks)
	 {
	   super("SJCE",28000,"IE");
		this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
	public static void main(String[] args)
	{
         Banu v =new Banu("Banu",05,90);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Vinay
SJCE
28000
IE
VINAY
18
40
=======

C:\Users\dell1\Desktop>java Banu
SJCE
28000
IE
Banu
5
90
EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
 Mistakes we do in the upper above cases.
 super("SJCE",28000,"IE"); //NOT GETTING CHANCE
PROGRAME=9
=========
 abstract class SJCE
{
     String collegename;
     int fees;
     String branch;
    
	 SJCE(String collegename,int fees,String branch )
     {
          this.collegename="NI";	 
          this.fees=50000;
          this.branch="MECH";
     }
}

class Vinay extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Vinay(String stname,int rollno,int marks)
	 {
		super("SJCE",28000,"IE"); //NOT GETTING CHANCE
        this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
	public static void main(String[] args)
	{
         Vinay v =new Vinay("VINAY",18,40);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
         System.out.println("=======");
    }
}

class Banu extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Banu(String stname,int rollno,int marks)
	 {
	   super("SJCE",28000,"IE");
		this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
	public static void main(String[] args)
	{
         Banu v =new Banu("Banu",05,90);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Vinay
NI
50000
MECH
VINAY
18
40
=======

C:\Users\dell1\Desktop>java Banu
NI
50000
MECH
Banu
5
90

EXPLANATION:-
============

APPROACH:-1
===========
  SJCE(String collegename,int fees,String branch )
     {
          this.collegename="NI";	 
          this.fees=50000;
          this.branch="MECH";
     }






                        
When we execute This in Example:-9
         Vinay v =new Vinay("VINAY",18,40);
		                      ======>constructor of vinay will get chance
                      Inside vinay construcor super keyword is there so super constructor will get chance.   
                      super constructor is parameterized constructor.
        
			super parameterized  constructor is only responsible for calling  super constructor.      

***imp point
 super constructor parameterers will be assigned to its corresponding super parameterized  constructor 

               super constructor parameterers  will get chance..
			 But the code inside that super constructor directly assign the instance variables values
             not giving chance to construcor parameters VALUES.

	                    SJCE(String collegename,int fees,String branch )
                            {
                               this.collegename="NI";	 
                               this.fees=50000;
                               this.branch="MECH";
                            }

                                Vinay(String stname,int rollno,int marks)
                                {
                                   super("SJCE",28000,"IE");
                                   this.stname=stname;
                                   this.rollno=rollno;
                                   this.marks=marks;
                                }
============================================================================
Difference between these two APPROACH 1 & 2
 ===========================================================================
 APPROACH:-2
===========
   SJCE(String collegename,int fees,String branch )
     {
          this.collegename=collegename;
          this.fees=fees;
          this.branch=branch;
     }






 when we execute  This in Example:-8 
       
	   Vinay v =new Vinay("VINAY",18,40);
	                    ===>call will go the vinay constructor.
						 Inside vinay super(==="parameters"======) is there so it will give the chance
						 super constructor.
					 super construcor parameter will get assigned to corresponding super constructor
                     Then same magic begins see
      
                     SJCE(String collegename,int fees,String branch )
                       {
                                 this.collegename=collegename;
                                 this.fees=fees;
                                 this.branch=branch;
                       }
                   

	   Vinay(String stname,int rollno,int marks)
	 {
		super("SJCE",28000,"IE");
        this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }

 


 APPROACH 1
 APPROACH 2
               ===>CREATE A BASIC PROGRAME AND THEN EXPLAIN.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
 check all points jsut written from my knoweldge.

 Inside constructor by this or super will be the frist keyword();
 If we are not writing then compiler will write that super will always call default constructor with
 zero parameter.

PROGRAME=10
=========
 abstract class SJCE
{
     String collegename;
     int fees;
     String branch;
    
	 SJCE(String collegename,int fees,String branch )
     {
          this.collegename=collegename;	 
          this.fees=fees;
          this.branch=branch;
     }
}

class Vinay extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Vinay(String stname,int rollno,int marks)
	 {
		/*super("SJCE",28000,"IE");*/     
			     
		           //compiler has written zero args cons but we need par cons
                            //calling
		
		this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
	public static void main(String[] args)
	{
         Vinay v =new Vinay("VINAY",18,40);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
         System.out.println("=======");
    }
}

class Banu extends SJCE
{ 
	String stname;
	int rollno;
	int marks;
	Banu(String stname,int rollno,int marks)
	 {
	   /*super("SJCE",28000,"IE");*/
		this.stname=stname;
        this.rollno=rollno;
        this.marks=marks;
	 }
	public static void main(String[] args)
	{
         Banu v =new Banu("Banu",05,90);
         System.out.println(v.collegename);
         System.out.println(v.fees);
         System.out.println(v.branch);
         System.out.println(v.stname);
         System.out.println(v.rollno);
         System.out.println(v.marks);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:21: error: constructor SJCE in class SJCE cannot be applied to given types;
         {
         ^
  required: String,int,String
  found: no arguments
  reason: actual and formal argument lists differ in length
Test.java:46: error: constructor SJCE in class SJCE cannot be applied to given types;
         {
         ^
  required: String,int,String
  found: no arguments
  reason: actual and formal argument lists differ in length
2 errors


EXPLANATION:-
============
	See the compiler is telling i can t find the parameterized args constructor calling.
    By default compiler has written that is zero arg construcotr calling,

	so 2 times we have written parent args constructor so we getting error 2 times.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
If everything is abstract  then we should go for interface.
If everything is abstract  then we should go for abstract.

		which is more recomended...?

   abstract class--->

  interface class--->

		
PROGRAME=11
=========
 

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
Inside interface every method is always abstract and we can take only  abstract
methods in interface.
	we can replace interface concept with abstract class but it not a good programmimng practice.
	This is somethig like recuriting IAS officer for sweeping activity.

 If everything is abstract then its highly recomended to go for interface only.

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
	 case 1:- we can extend only one class @ a time.so Test class can t extend other class,
	          so we not missing,not using inheritance relationship .

	abstract class A
{
}

class Test extends A
{
}
 
 case 2:-Inheritance benefit is avaliable.

 interface A
{

}
class B
{
}
class Test extends B implements A
{
}

EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
 abstract class A
{
}

class Test extends A
{
	Test t=new Test(); /* Here abstract class constructor will also get executed,abstract class instance
	                    variables also gets chance so it takes more time to execution*/ 
}                      // so more time for executuion.
 
 1)While extending abstract class it is not possible to extend any other class,and hence we are missing
	 inheritance benefit.
2)In this object creation is costly, Test t =new Test();
-----------------------------------------------------------------------------------
 case 2:-

 interface A
{

}

class Test implements A
{
    Test t=new Test();      /*Less time for execution coz only Test class constructor is getting the 
}	                           the chance.interface is not having constructor */


1)While implementing interface we can extend some other class and hence we won t miss any inheritance 
	benefit..
2) In this object creation is not costly Test t=new Test();
-----------------------------------------------------------------------------------

SO EVERY THING IS abstract HIGHLY RECOMENDED TO USE  interface CONCEPT.

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
