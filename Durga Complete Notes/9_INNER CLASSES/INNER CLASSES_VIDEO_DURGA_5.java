TOPIC:-ANNONYMOUS INNER CLASS 
--------
VIDEO NO=5
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-
--------------------
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
can i declare a class inside a class.
can i declare a class inside an interface
can i declare interface inside interface
can ideclare interface inside a class



Anything inside anything is possible w r t to classes and interfaces
All 4 combinationsa are valid..

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============

Case 1:- class inside a class
-------

university consists of several dept.


Without existing University object, there is no chance of existing Department object. i.e.,
 Hence we have to declare Department class inside university class.

 class University
 {
    class Department
    {

    }
 }
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============

Case 2:- interface inside a class..
-------
We have a class where multiple implementation of interface is required 
all this implementation are related to that particulatr  class only( i.e X class)...

Then happily we can declare interface and corresponding implementation class es 
in that particular class(i.e X class)


(09:08)


Interface inside a class----> Valid.
-------------------------
Durga Point:-Inside a class if we require Multiple implementation of an interface and all these implementation are
related to particular class then we can define interface inside a class..


class VechileTypes
{
	interface Vechile
	{
		public int GetNoOfWheels();
    }

	  class Bus implements Vechile
	  {
		 public int GetNoOfWheels()
		   {
			  return t;
		   }
      }
	  
    	class Auto implements Vechile
	   {
		      public int GetNoOfWheels()
		     {
		    	 return t;
		     }
      }
	  .
	  .
	  .
	  .
      .
	  .
	  .
	  .		   

	  }

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
Case 3:- interface inside interface
-------
Map:- Map is a group of key value pair.
Each key value pair is considered as entry.


(See page 128 long book for more information)
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----


PROGRAME=5
=========

EXPLANATION:-
============
Every interface present inside another interface (i.e inner interface ) that is inner interface is
public and static wheather we are declaring or not.

Hence we implement inner interface directly without implementing outer interface 
Similarly when ever we are implementing outer interface we are not required to implement  inner interface 
that is we can implement outer and inner interface 's' independently..
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
Providing implementation for Outer interface and we are not providing implementation for inner interface is VALID

We have requirement to provide implementation for Outer interface then we can ignore inner
interface.

PROGRAME=6
=========
interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

class Test1 implements Outer
{
	public void m1()
	{
	  System.out.println("Outer m1 method implementation");
	}
}


class Test
{
		public static void main(String[] args)
	{
          Test1 t=new Test1();
		  t.m1();
	}

}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Outer m1 method implementation

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Every innner interface is public and static.,Wheather we declaring or not..

When ever we want to provide implementation for outer interface,we don t need to perform implementation for
Inner interface.



DP:-
--
Every interface present inside another interface (i.e inner interface ) that is inner interface is
public and static wheather we are declaring or not.

Hence we implement inner interface directly without implementing outer interface 
Similarly when ever we are implementing outer interface we are not required to implement  inner interface 
that is we can implement outer and inner interface 's' independently..
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
When ever we want Inner interface implementation we don t need to provide implementation for Outer interface 
we can provide implementation to inner interface directly..

Bcoz inner interface is public static..
Without existing inner class object there is a chance of existing inner class object...
Every innner interface is public and static.,Wheather we declaring or not..
PROGRAME=7
=========
interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

class Test1 implements Outer.Inner
{
	public void m2()
	{
	  System.out.println("Inner m2 method implementation");
	}
}


class Test
{
		public static void main(String[] args)
	{
          Test1 t=new Test1();
		  t.m2();
	}

}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Inner m2 method implementation

C:\Users\DELL\Desktop>

EXPLANATION:-
============


DP:-
--
Every interface present inside another interface (i.e inner interface ) that is inner interface is
public and static wheather we are declaring or not.

Hence we implement inner interface directly without implementing outer interface 
Similarly when ever we are implementing outer interface we are not required to implement  inner interface 
that is we can implement outer and inner interface 's' independently..
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
Whenever we want both inner interface and outer interface both implementation.

PROGRAME=8
=========
interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

class Test implements Outer,Outer.Inner
{
		public void m1()
	{
	  System.out.println("Outer m1 method implementation");
	}

	public void m2()
	{
	  System.out.println("Inner m2 method implementation");
	}

	public static void main(String[] args)
	{
          Test t=new Test();
		  t.m1();
		  t.m2();
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Outer m1 method implementation
Inner m2 method implementation

C:\Users\DELL\Desktop>


EXPLANATION:-
============

Must do:-
---------
Assignment :-See this that we can implement 

Example=6
Example=7
Example=8
Using annonymous inner class concepts..

Casual Point:-Creat a separate Top level class  for main metod as Durga((23:39)) so u won t get confused..
As in Example 7 and 6.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
Some other important Observation.

Case 1:-  
--------  (Vinay Point)
Meaning full CE coz we are creating  2 class es See at Point 1 and Point 2 they are annonymous inner class
So we can use there functionality  in Test class if Required..

But see at Point 3 we are implementing interface Outer and Inner interface to Test class But we are not 
Providing implementation of Both interface s in Test class So it s meaning full CE..

Just we are Writing another 2 Anonymous inner  class es which implements those interface..
Those annonymous inner class have no relation B/w Test class.
Just we can use their functionality that s it..

interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

class Test implements Outer,Outer.Inner //Point 3
{
	  Outer o=new Outer() //Point 1
	{
		public void m1()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};
	
	Outer.Inner o1=new Outer.Inner()  //Point 2

	{
		public void m2()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};
	
	public static void main(String[] args)
	{
        
	}
}

C:\Users\DELL\Desktop>javac Test.java
Test.java:11: error: Test is not abstract and does not override abstract method m1() in Outer
class Test implements Outer,Outer.Inner
^
1 error

C:\Users\DELL\Desktop>



-----------------------------------------------------------------------------------------------------
Case 2:- By Taking as abstract we can avoid that see...
--------
interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

abstract class Test implements Outer,Outer.Inner
{
	  Outer o=new Outer()
	{
		public void m1()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};
	
	Outer.Inner o1=new Outer.Inner()
	{
		public void m2()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};
	
	public static void main(String[] args)
	{
        System.out.println("Test class main method");
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Test class main method

C:\Users\DELL\Desktop>
-------------------------------------------------------------------------------------
Case 3:- Providing implementation s for Both interfaces see 
-------
interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

abstract class Test implements Outer,Outer.Inner
{
	  Outer o=new Outer()
	{
		public void m1()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};
	
	Outer.Inner o1=new Outer.Inner()
	{
		public void m2()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};

 			public void m1()
     	     {
	          System.out.println("Outer m1 Interface implementation");
	         }

	    	public void m2()
	          {
	          System.out.println("Outer m2 Interface implementation");
	          }


	
	public static void main(String[] args)
	{
        System.out.println("main method");
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main method

C:\Users\DELL\Desktop>
------------------------------------------------------------------------------
Case 4:-

 static   Outer o=new Outer()
	{
		public void m1()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};


	We can apply static to that class reference and used in main method see..


	Programe:-
	---------
	interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

abstract class Test implements Outer,Outer.Inner
{
	static  Outer o=new Outer()
	{
		public void m1()
	     {
	      System.out.println("Outer m1 method implementation");
	     }
	};
	
	Outer.Inner o1=new Outer.Inner()
	{
		public void m2()
	     {
	      System.out.println("Outer m2 method implementation");
	     }
	};

 			public void m1()
     	     {
	          System.out.println("Outer m1 Interface implementation");
	         }

	    	public void m2()
	          {
	          System.out.println("Outer m2 Interface implementation");
	          }


	
	public static void main(String[] args)
	{
        System.out.println("main method");
		o.m1();
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main method
Outer m1 method implementation

C:\Users\DELL\Desktop>

***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----

PROGRAME=10
=========
EXPLANATION:-
============


Case 4:- class inside an interface
--------
If a functionality of a class is closely associated with an interface and
within the interface only we should use that functionality.
Then we should go for class inside interface..

EmailDetails service we need it inside EmailServer interface only so we are declaring a class EmailDetails inside 
interface EmailServer.

**** Point:-
When we have these type of requirements:-
  When interface method have an argument of type class..
  When interface return type method is class type..
 
In above example Emaildetails is required only for EmailService and we are not using anywhere else,
hence EmailDetails class is recomended to declare EmailServivce interface..


interface EmailServer {
public void sendEmail(EmailDetails e);
class EmailDetails {
String from;
String to;
String subject;
}
}

If a functionality of a class is closely associated with interface then it is highly recomended declare 
class inside interface.

Ex:-
----
interface EmailService 
{
    public void sendEmail(EmailDetails e);
       class EmailDetails {
          String from;
          String to;
          String subject;
}
}

In the above example EmailDetails is required only for EmailService and we are not using anywhere else
hence EmailDetails class is recomeneded to declare inside EmailService interface.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
General case:-
--------------
interface Outer 
{
	public void m1();
     	
		interface Inner
	   {
		 public void m2();
	   }
}

class Test1 implements Outer
{
	public void m1()
	{
	  System.out.println("Outer m1 method implementation");
	}
}


class Test
{
		public static void main(String[] args)
	{
          Test1 t=new Test1();
		  t.m1();
	}

}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Outer m1 method implementation

C:\Users\DELL\Desktop>

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
We have a requirement like:-
Wanted to provide default implementation for interface.

People who satisfied with default implementation can easily use that class.
If not they can change and go for customized implementation..

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
Every class Declared inside interface is public static.

Without having outer interface instatnce(i.e Object) type directly we can create the class object present inside 
interface.

Ex:-interface It
{
	class X
	{
	}
}
We can create the X object directly without creating Instance of It.
This concept applied in at POINT 1.

PROGRAME=13
=========

interface Vechile
{
	public int Getnowheels();
	class DefaultImplementation implements Vechile
	{
        public int Getnowheels()
			{
			   return 4;
			}
	}
}

class Bus implements Vechile
{  
	        public int Getnowheels()
			{
			   return 6;
			}

}

class Test
{
	public static void main(String[] args)
	{

	   Vechile.DefaultImplementation x=new Vechile.DefaultImplementation (); //Point:-1
	   System.out.println(x.Getnowheels());

		   Bus b=new Bus();
       System.out.println(b.Getnowheels());
	}

}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
4
6

C:\Users\DELL\Desktop>

EXPLANATION:-
============
we can also define class inside interface do provide default implementation for that interface..

In the above example DefaultImplementation is the default implementation of vechile interface,
Where as Bus is customized implemetation of Vechile interface



Important Point:-
------------------
The class Which is declared inside interface is public and static wheather we are declaring or not..

Ex:- 1
---
The class Which is declared inside interface is public and static wheather we are declaring or not..
Hence we can create class Object directly w/o having outer interface type object. 

interface Vechile
{
	public int Getnowheels();
	class DefaultImplementation implements Vechile
	{
        public int Getnowheels()
			{
			   return 4;
			}
	}
}

	class DefaultImplementation -------->public and static
----------------------------------------------------------------------------
Ex:-2
-----
The class Which is declared inside interface is public and static wheather we are declaring or not..
Hence we can create class Object directly w/o having outer interface type object. 

Ex:-interface It
{
	class X
	{
	}
}
class X-------->public and static

***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============

Conclusions:-
-------------
Valid Combinationis
-------------------
Among class es and interface s we can declare anything inside Anything

1)

class A
{
	class B
	{
	}
}
------------------------------------------------------
2)

class A
{
	interface B
	{
	}
}

Interface Which is declared inside a class is always static.
But need not be public...

We can declare private also for that interface.
--------------------------------------------------------------------------------------
3)

interface A
{
	interface B
	{
	}
}

interface which is declared inside interface is always public and static wheather we are declaring or not..

Here we cannot declare innner interface as private coz it s already public..
--------------------------------------------------------------------------------------
4)

interface A
{
	class B
	{
	}
}

class which is declared inside interface should be avaliable to all implemted class..
so class which is  declared inside interface is always public and static wheather we are declaraing or not..
------------------------------------------------------


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
