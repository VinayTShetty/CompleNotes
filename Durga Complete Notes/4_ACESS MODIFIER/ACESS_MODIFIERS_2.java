TOPIC:-ACESS MODIFIER
--------
VIDEO NO=2
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-6(*,Point:-2),8(**)
9(***** Frist read this**)
10(***** final conclusion)
 
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
2 types of import

Explict class import
 Ex:-import java.util.ArrayList;
 



implicit class import
import java.util.*;
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
 class Test extends java.util.ArrayList
 {
    public static void main(String args[])
		{
        }
 }
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

EXPLANATION:-
============
DP:-
 The code compiles fine even though we did nt use import statement,
 coz we used fully qualified name.
 When ever we are using fully qualified statement,it s not required to write import statemetn.


similarly when ever we are writing import statement it s not required to use fully qualified name.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
 class Test extends java.util.ArrayList
 {
    public static void main(String args[])
		{
          java.util.ArrayList l=new java.util.ArrayList();
		 
        }
 }
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 Writing both also valid,but not recomended.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
 import java.util.*;
import java.sql.*;
class Test
{
   public static void main(String args[])
   {
      Date d=new Date();
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: reference to Date is ambiguous
      Date d=new Date();
      ^
  both class java.sql.Date in java.sql and class java.util.Date in java.util match
Test.java:7: error: reference to Date is ambiguous
      Date d=new Date();
                 ^
  both class java.sql.Date in java.sql and class java.util.Date in java.util match
2 errors

EXPLANATION:-
============
  import java.util.*;
import java.sql.*;

Date class is present in both util and sql package so compiler is confused which Date class to use.,
eieher sql or util so it s giving CE.




 General Note:-
 same ambiguity praoblem in case of List class
   List is avaliable in util package
   List is avaliable in awt package

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 import java.util.*;
import java.sql.*;
class Test
{
   public static void main(String args[])
   {
      System.out.println("hello world");     
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello world

EXPLANATION:-
============
 If we are not using Date class(commom class present in both package) then no CE.
 we are not using any commmon class which are present in both packages.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
import java.util.Date;//Explicit classs import 
import java.sql.*;//implicit class import
class Test
{
  public static void main(String args[])
	  {
          Date d=new Date();
		  System.out.println("hello james");
      }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello james

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 While resolving class names compiler will always gives the precedence in the following order
 
 Explicit class import
 classes present in current working directory
 default package
 implicit class import

 import java.util.Date;//Explicit classs import 
Point:-1
 Because compiler will give more priority to Explicit class import
Point:-2
 Next prioroty goes to classes present in current working directory
                                                  then default package


import java.sql.*;//implicit class import
Point 3:-Last preference will be giving for implicit class import.
 
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 case 1:-Compiler giving preference to Date class present in util package (Explicit class import)

import java.util.Date;//Explicit classs import 
import java.sql.*;//implicit class import
class Test
{
  public static void main(String args[])
	  {
          Date d=new Date();
		  System.out.println("hello james");
		  System.out.println(d.getClass().getName());
      }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello james
java.util.Date

case 2:-Compiler giving preference to Date class present in current working directory & default package
        Only if the Date class present in default package.      

import java.sql.*;//implicit class import
class Test
{
  public static void main(String args[])
	  {
          Date d=new Date();
		  System.out.println("hello james");
      }
}


 case 3:-Compiler giving preference to Date class present in java.sql package (implicit class import)
         If Date class not present in defalut package.

import java.sql.*;//implicit class import
class Test
{
  public static void main(String args[])
	  {
          Date d=new Date();
		  System.out.println("hello james");
		  System.out.println(d.getClass().getName());
      }
}
 
 ---------------------------------------------------------------------
Just see case 3:-
 import java.sql.*;//implicit class import
class Test
{
  public static void main(String args[])
	  {
          Date d=new Date();
		  System.out.println("hello james");
		  System.out.println(d.getClass().getName());
      }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: no suitable constructor found for Date(no arguments)
          Date d=new Date();
                 ^
    constructor Date.Date(int,int,int) is not applicable
      (actual and formal argument lists differ in length)
    constructor Date.Date(long) is not applicable
      (actual and formal argument lists differ in length)
1 error

C:\Users\dell1\Desktop>javap java.sql.Date
Compiled from "Date.java"
public class java.sql.Date extends java.util.Date {
  static final long serialVersionUID;
  public java.sql.Date(int, int, int);
  public java.sql.Date(long);
 
 conclusion :-preference is going for  import java.sql.*;//implicit class import
 coz Date class not present in deafault package(current working directory).
	 See the CE.
 ---------------------------------------------------------------------



EXPLANATION:-
============
conclusion:-

NOT FOUND(NF)

(Frist preference)             (Second preference)         (Third preference)        (Last preference)
Expicit class import<-(NF)->current working directory<-(NF)->default package<-(NF)->implicit class import

***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
 very very important.

	case 6
	page 121
	PDF:-8

(package)          java //contain A class,B class,C class,D interface
     (subpackage)        ---util //contain E class,F class,G class,H class,I interface
	     (subpackage)         -----regex //contain  j class,k class , L class,M class,N interface
	         (subpackage)          -----Pattern//contains pattern class

 Important Point:-
   import java.*
When ever i am using this import(import java.*) all classes and interfaces present in that package
will be avaliable,i.e(A class,B class,C class,D interface).
AND SUBPACKAE CLASSES AND INTERFACES WILLL NOT BE IMPORTED.

 If we want to import subpackage class compulsary we need to write import statement untill 
	 subpackage level.
Example:-
   Requirement is to import Pattern class.
	 import java.*;(invalid)
	 import java.util.*;(invalid)
     import java.util.regex.Pattern;(VALID)
	 import java.util.regex;(invalid)

Example:-
   Requirement is to import Method class present in lang package.

Wrong Concept 
	lang is default package so Method class present in lang package so by default its avaliable

Method class present in subpackage of reflect so we need write import statement untill subpackage level.
	import java.lang.reflect.Method;(valid)
    import java.lang;(invalid)
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
	PDF(122)
	Page-no(8)
	Some wrong typing mistake i guess taking default and lang package different both are same.

In any java Program the following 2 packages are not require to import because these
are available by default to every java Program.
1. java.lang package
2. current working directory

PROGRAME=9
=========
	   saving Student class in Desktop and Test class in Desktop
  
  class Student{} 
  
  class Test 
{
  public static void main(java.lang.String args[])
	  {
	     String s =new String("viany");//default package
		 Student st=new Student(); //current working directory
		 System.out.println("helllo james");
	  }
}


C:\Users\dell1\Desktop>javac Student.java

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
helllo james

EXPLANATION:-
============
	 Both current directory and default package we don t need to import.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
	 This is the main flow control going on by compiler

	  Explicit class import
      classes present in current working directory 
	  default package
      implicit class import

Proof:- Compiler will check in classes present in current working directory 

	Write a source file in desktop(current working directory--->String.java)
  
	class String
  {
  }

Write a source file in desktop(current working directory --->Test.java)
  
class Test 
{
  public static void main(String args[])
	  {
       String s =new String("vinay");
	  }
}


C:\Users\dell1\Desktop>javac String.java      //---->see in desktop

C:\Users\dell1\Desktop>javac Test.java        //---->see in desktop
Test.java:5: error: constructor String in class String cannot be applied to given types;
       String s =new String("vinay");
                 ^
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
1 error



***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:- Example 10 proof that it will then search for default package.
-----
	 In current working directory its not avaliable so it will search for default package.
PROGRAME=11
=========
	 class Test 
{
  public static void main(String args[])
	  {
     String s =new String("vinay");
	 System.out.println("hi james");
	  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hi james

EXPLANATION:-
============
	 Make conclusion by importing java.lan.*;
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
----- 
	Related to Example 10 it wont search Frist 
      
      classes present in current working directory 
		  if the corresponding classes present current working directory it won t search further.
		  Even though we have implicit class import.
	  
	   default package
      implicit class import

	  
PROGRAME=12
=========

	save both Test and String class in current working directory.

	class String 
{

}

  
   
   import java.lang.*;
class Test 
{
  public static void main(String args[])
	  {
     String s =new String("vinay");
	 System.out.println("hi james");
	  }
}

C:\Users\dell1\Desktop>javac String.java

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: constructor String in class String cannot be applied to given types;
     String s =new String("vinay");
               ^
  required: no arguments
  found: java.lang.String
  reason: actual and formal argument lists differ in length
1 error


EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
	Frist preference is going for Explicit class import only.

PROGRAME=13
=========
	 	save both Test and String class in current working directory.

	class String 
{

}
 
  class Test 
{
  public static void main(java.lang.String args[])
	  {
           java.lang.String s =new java.lang.String("vinay"); //using Explicit class import
	       System.out.println("hi james vinay");
	  }
}



C:\Users\dell1\Desktop>javac String.java

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hi james vinay

C:\Users\dell1\Desktop>
  
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
	 Case 8:
 "Import statement is totally compile time concept" if more no of imports are there then
  more will be the compile time but there is "no change in execution time".

PROGRAME=14
=========
	Case 1:-using fully qualified name.
	
class Test 
{
  public static void main(java.lang.String args[])
	  {
	  java.util.ArrayList al =new java.util.ArrayList();
	  System.out.println(al);
	  }
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[]

In this case 1 compiler is having full information like java.util.ArrayList where ever we have written
so it won t take much time to compile.
		SO LESS WORK FOR COMPILER.
  	      less import statements less compile time
          There is no effect on execution time

Execution or performance same time for both case 1 and case 2 is  by JVM.

-------------------------------------------------------------------------------------------
 Case 2:-using fully qualified name takes more time so i will use import statement and short names
  
	import java.util.*;
class Test 
{
  public static void main(java.lang.String args[])
	  {
	 ArrayList al =new ArrayList();
	  System.out.println("Short names ==   "+al);
	  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Short names ==   []

C:\Users\dell1\Desktop>
	
In this case compiler is not having full information  of ArrayList.
	If it sees ArrayList it should search for corresponding import statement.
	SO MORE WORK FOR COMPILER
  more import statements more compile time
  There is no effect on execution time

Execution or performance same time for both case 1 and case 2 is same by JVM.
-------------------------------------------------------------------------------------------
EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
	In IDE eclipse it always uses Explicit import observe.
	NO IDE in world uses impilict import.
	
observe this.
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----According to sun usage of static import reduces length of the code and improves readibility
	But acccording to world wide programming experts (like me)
usage of static import creates confusion ans reduces readbility hence if there s no specific requirement
then it s not recomended to use static import.

PROGRAME=16
=========
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17                            Static import
=========
NOTE:-Without static import
-----
PROGRAME=17
=========
 class Test
{
	public static void main(String[] args)
	{
	 System.out.println(Math.sqrt(2));
	 System.out.println(Math.max(10,20));
	 System.out.println(Math.random());
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
1.4142135623730951
20
0.7048721737570789

C:\Users\dell1\Desktop>

EXPLANATION:-
============
	  System.out.println(Math.sqrt(2));

Math is a class present in default package called java.lang.package
	we can use these classes coz it s a defalult package.

	sqrt is a static method so we are calling by using class name.
***************************-----END of--->17<--------***************************
Example=18
=========                     With static import.
NOTE:-
-----
 import static java.lang.Math.sqrt;(valid)
  import static java.lang.Math.sqrt();-------------->(invalid import using () for method) 

PROGRAME=18
=========
	import static java.lang.Math.sqrt;
class Test
{
	public static void main(String[] args)
	{
	 System.out.println(sqrt(2));
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
1.4142135623730951

C:\Users\dell1\Desktop>

EXPLANATION:-
============
	Only one method we are importing.
         import static java.lang.Math.sqrt;(valid)

don t use () while import for methods.
       import static java.lang.Math.sqrt();-------------->(invalid import using () for method) 
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
 import static java.lang.Math.sqrt;
class Test
{
	public static void main(String[] args)
	{
	 System.out.println(sqrt(2));
	 System.out.println(max(10,20));
	 System.out.println(random());
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: cannot find symbol
         System.out.println(max(10,20));
                            ^
  symbol:   method max(int,int)
  location: class Test
Test.java:8: error: cannot find symbol
         System.out.println(random());
                            ^
  symbol:   method random()
  location: class Test
2 errors

EXPLANATION:-
============
 We are using only import for one method but using other methods so it s invalid
	meaning full CE.
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
	 Using class name.

PROGRAME=20
=========
import static java.lang.Math.sqrt;
import static java.lang.Math;
class Test
{
	public static void main(String[] args)
	{
	 System.out.println(sqrt(2));
	 System.out.println(max(10,20));
	 System.out.println(random());
	}
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
1.4142135623730951
20
0.21322199483918736

EXPLANATION:-
============
 Usually we can acess static members by using class name,But when ever we are writing static import
we can acess static members directly without class name.
	case 1:-
	--------
import static java.lang.Math;(valid)
                                          Diff btwn these 2 ..? both are valid.
import static java.lang.Math.*;(valid)
 

import static java.lang.Math.*; ---->Till Math class is ok but after that again * wat s the reason
	find out. it s valid i felt its invalid so be carefull.
  
case 2:-
------
import static java.lang.Math.sqrt;
import static java.lang.Math;
 


In Example 20 even though if we remove import static java.lang.Math.sqrt
 and write---------------------------->import static java.lang.Math;
 code compiles fine coz sqrt by deafault avaliable in Math class which we importing.
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
	import static
While pronuncing we use static import
While writing we use import static

PROGRAME=21
=========
EXPLANATION:-
============
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
	After Example 17 see
PROGRAME=22
=========
	class Test
{
	public static void main(String[] args)
	{
	 System.out.println(sqrt(2));
	 System.out.println(max(10,20));
	 System.out.println(random());
	}
}
 
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: cannot find symbol
         System.out.println(sqrt(2));
                            ^
  symbol:   method sqrt(int)
  location: class Test
Test.java:6: error: cannot find symbol
         System.out.println(max(10,20));
                            ^
  symbol:   method max(int,int)
  location: class Test
Test.java:7: error: cannot find symbol
         System.out.println(random());
                            ^
  symbol:   method random()
  location: class Test
3 errors
EXPLANATION:-
============
***************************-----END of--->22<--------***************************
Example=23
========= Miscellaeneous
NOTE:-
-----

PROGRAME=23
=========
	 class Test 
{
	public static Test t;
	void m1(){System.out.println("hello");}
  public static void main(java.lang.String args[])
	  {
           t.m1();
	  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:7)

EXPLANATION:-
============
 When ever we are doing any operation using null we ll get NullPointerException.
	coz defalt value is null for reference type.

	My doubt is find out why we are not getting CE.
		we are getting RuntimeException as NullPointerException.

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
