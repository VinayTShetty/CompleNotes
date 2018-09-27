TOPIC:-JAVA LANG PACKAGE
--------
VIDEO NO=1
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
java.lang.package
                ---->Name it self tells java laungage package..
				     for wrting any commmon programme the most used class es and interface s are defined in 
					 java.lang.package..

without using util package we can write atlest countable java programe..
without using sql package we can write atlest countable java programe..


without using java.lang.package,it s impossible to write a java programe.
to write a main method and sop statement we need java.lang.package..
we cannnot write any java programe without using java.lang.package
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
For writing any java programe the most commonly used class es and interface are grouped into 
or encapsulated into package is called java.lang.package.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========

class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}



EXPLANATION:-
============
In the above simple java programe how many times we are depending on java.lang package..

1)class Test---->
       Every class in java is a child class of Object..
                 so that Object class is present in java.lang package only..
       
	   If we are writing class keyword then we are depending on java.lang package..
	   

2)The argument to the main method is String,so String class is present in java.lang package.

3)In sop statement we use System that System class is present in Object class..

4)Inside sop statement we are using String that String class,that String class belongs to Object class only..


without using java lang package we cannot run the show..

DP:-For writing any java programe wheather it is simple or complex,the mostly commonly used class es
and interface s are grouped into a separate package that is java.lang package..
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
util package we have to import,
sql package we have to import,

But java.lang package we can write directly why this facility for java.lang package..

coz without using sql and util we can write..
But without using java.lang package we cannot writre any java programe..

we are not required to import java.lang package explicitly,bcoz all class es and interface are present in lang
package by default avaliable to every java programe..
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
java.lang.Object class.
----------------------
Every class in java is a child class of Object eiether directly or indirectly..

IQ:-why Object class acts as a root for class for all java class...?

1) For any java class i.e Student class,String class,StringBuffer class,customer class,or StringBuilder class,
the most commonly requires methods are define in a separate class that class is called Object class..
so object class is the root class for all java class es..


To make all the methods in object class avaliable to all predefined and userdefined class,
Sun people had made Object class as parent class..

so automatically all its child class will get parent class(i.e Object class) methods..
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
why String class does nt act as a root for all java class es..?
   String class contain only methods applicable to String.
   String class methods we cannot apply for String Buffer class,Student class,
   so it does nt act as root for all java class es.

   But Object class methods we can apply to predefined and userdefined class es.
   so object class acts as root for all java class..

DP:-
1)For every java class(i.e predefined or user defined) the most commonly required metods 
are defined in separate class which is nothing but Object class..

2)Every class in java is the child class object eiether directly or indirectly so that object class methods 
by default avaliable to every java class..
Hence object class is considered as root of all java class es..
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
java provides suppoorts for multiple inheritance....?
  java can t extend to more than one class so java does nt support multiple inheritance...



  IQ:-  page 131 long Book...
  Direct Child class vs Indiredct child class
  Multiple inheritance vs Multilevel inheritance..


Case 1:-If our class extends any other class,then our class is indirect child class of Object

Ex:-class A extends B
{
}

1)  A is the child of Object class
2) A is the child of A class
      so java supports multiple inheritance..(wrong)
    The above 2 statements are wrong              

1)A is the child B
2)B is the child Object
          This is called multilevel inheritance (Right)



  Case 2:-
  If our class does nt extends any other class then only our class is the direct child class of Object.

Ex:-A is the child class of Object..

  class A
  {
  }


 Conclusion:-eiether directly or indirectly java won t provide support for multiple inheritance
             with respect to class es
 

***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
IQ:-

Object class defines the following 11 methods..

Object class consists of 11 methods..
1. public String toString();
2. public native int hashCode();
3. public boolean equals(Object o);
4. protected native Object clone()throws CloneNotSupportedException;
5. public final Class getClass();
6. protected void finalize()throws Throwable;
7. public final void wait() throws InterruptedException;
8. public final native void wait()throws InterruptedException;
9. public final void wait(long ms,int ns)throws InterruptedException;
10. public final native void notify();
11. public final native void notifyAll();


Strictly speaking Object class contains 12 methods
It is internally required for Object  class not for other class so we are not giving much importance to that. 
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
java.lang package we don t need to import.

But we need java.lang.reflect.*; It s a subpackage..
subpackage we need to import.. 
java.lang.reflect.*;--------->It is for Method class.

PROGRAME=9
=========
import java.lang.reflect.*;
class Test
{
	public static void main(String [] args) throws Exception
	{
		int count=0;
      Class c=Class.forName("java.lang.Object");
      Method [] m=c.getDeclaredMethods();
	  for (Method Methodname:m )
	  {
		  count++;
		  System.out.println(Methodname.getName());
	  }
        System.out.println("The number of methods="+count);
    }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
finalize
wait
wait
wait
equals
toString
hashCode
getClass
clone
notify
notifyAll
registerNatives
The number of methods=12

C:\Users\DELL\Desktop>

EXPLANATION:-
============

It is internally required for only Object class not for child class. 

Strictly speaking Object class contains 12 methods,
the extra methods is registerNatives();
This method internally required for Object class and not avaliable to the child class.,Hence we are not 
required to consider that method..
and hence its private method,outside of Object class we can t call...

Even in API level java.lang.Object it displays only 11 methods...

private static native void registerNatives();
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
toString() method.
-----------------

When ever we are trying to print an Object reference internally toString() method will be executed...


When toString() method is required....?

         we can use toString() method to get String representation of an Object..
		 Ex:-Object o=new Object();
             String s=o.toString();
			 System.out.println(s);
			 System.out.println(o);
			 System.out.println(o.toString());

Ex:-The above all are same..

class Test
{
	public static void main(String [] args) throws Exception
	{
        Object o=new Object();
             String s=o.toString();
			 System.out.println(s);
			 System.out.println(o);
			 System.out.println(o.toString());
	}

}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
java.lang.Object@15db9742
java.lang.Object@15db9742
java.lang.Object@15db9742

C:\Users\DELL\Desktop>



String representation of an Object when it is required....?
          Assume we have an student Object..
		      Student s=new Student();
			    System.out.println(s);
				printing an object reference is useless..
Ex:-
---
Case:-1
--------
class Test
{
	public static void main(String [] args) throws Exception
	{
        Test t=new Test();
		System.out.println(t);
    }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Test@15db9742

Case 2:-
--------
class Test
{
	public static void main(String [] args) throws Exception
	{
        Test t=new Test();
        System.out.println(t.toString()); //approach 1
		String s=t.toString();
 		System.out.println(s);         //approach 2
    }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Test@15db9742
Test@15db9742

C:\Users\DELL\Desktop>
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============
DP:-We can use toString() method to get String representation of an Object.
String s =Obj.toString();
When ever we are trying to print Object reference internally toString() method will be called..

Ex:-Student s =new Student();
       
		System.out.printl(t.toString()); 
 		System.out.println(s); 


class Test
 {
public static void main(String [] args) throws Exception
	{
       Student s =new Student();
       System.out.println(s.toString()); 
 	   System.out.println(s); //When ever we are trying to print Object reference internally toString() method will
	}                         //  be called.

}
class Student
{
}
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Student@15db9742
Student@15db9742

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
class Student
{
	String sname;
	int rollno;
	Student(String sname,int rollno)
	{
      this.sname=sname;
      this.rollno=rollno;
	}
	public static void main(String [] args)
	{
       Student s=new Student("Vinay",100);
       Student s1=new Student("shetty",101);
	   System.out.println(s);
	   System.out.println(s.toString());
	   System.out.println(s1);
       System.out.println(s1.toString());
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Student@15db9742
Student@15db9742
Student@6d06d69c
Student@6d06d69c

C:\Users\DELL\Desktop>

EXPLANATION:-
============
When ever we are trying to print an Object reference internally toString() method will be executed..


       Student s=new Student("Vinay",100);
       Student s1=new Student("shetty",101);

	   So in this exapmle we are calling toString() method on Student class 
	     observe here student class does nt contain any toString() method, so Object class toString() method will
		 be executed..

         If our class does nt contain toString() method then Object class toString() method will be executed..
		 
		 Object class toString() method will be called so how its implemnted,like that we ll get O/P.

         //object classs toString() method.
		 public String toString() 
			 {return getClass().getName() + "@" + Integer.toHexString(hashCode());}

Meaning:-
getClass().getName() + "@" + ---->getting the name of the class
Integer.toHexString(hashCode())----->Convert Integer to Hexadecimal form..
i.e classname@hashcodeinhexadecimalform

DP:-In the above example Object class toString() method got executed as follows.

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
We can override Object class toString() method to return 
wat ever data(i.e  our own String representation ) we want.

PROGRAME=13
=========
class Student
{
	String sname;
	int rollno;
	Student(String sname,int rollno)
	{
      this.sname=sname;
      this.rollno=rollno;
	}
	public String toString()
	{
	     return sname+"-----"+rollno;
	}
	public static void main(String [] args)
	{
       Student s=new Student("Vinay",100);
       Student s1=new Student("shetty",101);
	   System.out.println(s);
	   System.out.println(s.toString());
	   System.out.println(s1);
       System.out.println(s1.toString());
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Vinay-----100
Vinay-----100
shetty-----101
shetty-----101

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
class Student
{
	String sname;
	int rollno;
	Student(String sname,int rollno)
	{
      this.sname=sname;
      this.rollno=rollno;
	}
	public String toString()
	{
	     return "Student Name--->"+sname+" RollNo--->"+rollno;
	}
	public static void main(String [] args)
	{
       Student s=new Student("Vinay",100);
       Student s1=new Student("shetty",101);
	   System.out.println(s);
	   System.out.println(s.toString());
	   System.out.println(s1);
       System.out.println(s1.toString());
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Student
Student Name--->Vinay RollNo--->100
Student Name--->Vinay RollNo--->100
Student Name--->shetty RollNo--->101
Student Name--->shetty RollNo--->101

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Based on our requirement we can override toString() method to provide our own String representation
Ex:-When ever we are trying to print student object reference to print his name and rollno we have to override
toString() as above...
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
class Test
{
	public static void main(String [] args)
	{
		String s =new String("Vinay");
		System.out.println(s);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Vinay

C:\Users\DELL\Desktop>

EXPLANATION:-
============
In String class toString() method is overided to return the content of String..
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========

import java.util.*;
class Test
{

	public static void main(String [] args)
	{
		String s =new String("Vinay");
		System.out.println(s);
        Integer i=new Integer(10);
        System.out.println(i);

		ArrayList al =new ArrayList();
		al.add("abc");
		al.add(123456);
        System.out.println(al);



		Test t=new Test();
		System.out.println(t);
	}
}



C:\Users\DELL\Desktop>javac Test.java
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\DELL\Desktop>java Test
Vinay
10
[abc, 123456]
Test@15db9742

C:\Users\DELL\Desktop>

EXPLANATION:-
============

It is highly recomended to override toString() method..

In all String class,StringBuffer,StringBuilder es 
collection class
and Wrapper class toString() method is overriden to return the content of the String..

Hence it is highly recomended to override toString() method in our class also..
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========

import java.util.*;
class Test
{

public String toString()
	{
          
		  return "Test";
    }
	public static void main(String [] args)
	{
		String s =new String("Vinay");
		System.out.println(s);
        Integer i=new Integer(10);
        System.out.println(i);

		ArrayList al =new ArrayList();
		al.add("abc");
		al.add(123456);
        System.out.println(al);



		Test t=new Test();
		System.out.println(t);
	}
}


C:\Users\DELL\Desktop>javac Test.java
Note: Test.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\DELL\Desktop>java Test
Vinay
10
[abc, 123456]
Test

C:\Users\DELL\Desktop>
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
