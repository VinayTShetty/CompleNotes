TOPIC:-INNER CLASSES
--------
VIDEO NO=1
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-
--------------------
Example=15

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
class Test
{
	class A
	{
	}
}

Declaring a class inside a another class is called inner class...

java 1.0 version was introduced in 1995.
So many advantageous feature was introduced..,
robust
secured
top level laungage
Object oriented laungages etc..


Disadvantage in 1.0 version:-
-----------------------------
java was not good in performance wise..
Gui concept (AWT) there are several bugs..


so 1.1 version was introduced coz of this problem..

java 1.1 version came after 3 moths release of 1.0 version..
JIT (just in compiler was introduced in 1.1 version) to improve performance,
Event handling came to fix the bug of GUI concept.

        As a part of Event handling, to fix GUI in event handling java introduced inner class 
		concept strictly in 1.1 version.

		Due its powerfull feature slowly programmer started using in normal programmig also.


inner classes was introduced in 1.1 version to fix GUI bugs as a part of event handling,
Bcoz of powerfull feature and benefits of inner classes slowly programmer started using in regular coding also..


***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
without existing car object there is no chance of existing engine object so we have to declare engine class
inside car class..

class Car //outer class 
{
	class Engine// inner class
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
The relationship between outer class and inner class is not IS-A relationship and it
is Has-A relationship.(Composition or Aggregation).

Has-A relationship is also known as (Composition or Aggregation).
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
last video programe.

PROGRAME=4
=========
class Reader extends Thread {
	Calculator c;

	public Reader(Calculator calc) {
		c = calc;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting for calculation..."+Thread.currentThread().getName());
				c.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + c.total+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		new Reader(calculator).start();
		calculator.start();
		new Reader(calculator).start();
		new Reader(calculator).start();
		
	}
}

class Calculator extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}
	}
}

EXPLANATION:-4
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
class Outer
{
	class Inner
	{
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java outer    // Giving Wrong name
Error: Could not find or load main class outer

C:\Users\DELL\Desktop>java Inner    // Giving Wrong name
Error: Could not find or load main class Inner

C:\Users\DELL\Desktop>

EXPLANATION:-
============
.class file generated:-
1)Outer.class
2)Outer$Inner.class 

------------
cd \
------------
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
class Outer
{
	class Inner
	{
	}
}


C:\Users\DELL\Desktop>javac Test.java
-------------------------------------------------------------------------------------
C:\Users\DELL\Desktop>java Outer

Error: Main method not found in class Outer, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
-------------------------------------------------------------------------------------
C:\Users\DELL\Desktop>java Outer$Inner

Error: Main method not found in class Outer$Inner, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\Users\DELL\Desktop>

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
set path=<>
no ; at the end i guess,,
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Outer
{
      class Inner
	{
	}

	public static void main(String[] args)
	{
	   System.out.println("Outer class main method");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Outer class main method

C:\Users\DELL\Desktop>class Outer
{
      class Inner
	{
	}

	public static void main(String[] args)
	{
	   System.out.println("Outer class main method");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Outer class main method

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
class Outer
{
      class Inner
	{
	}

	public static void main(String[] args)
	{
	   System.out.println("Outer class main method");
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer$Inner
Error: Main method not found in class Outer$Inner, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
we cannot invoke inner class from command prompt.

PROGRAME=10
=========
class Outer
{
      class Inner
	{
		  public static void main(String[] args)
	      {
	         System.out.println("Outer class main method");
	      }
	}

}


C:\Users\DELL\Desktop>javac Test.java
Test.java:5: error: Illegal static declaration in inner class Outer.Inner
g
                                     ^
  modifier 'static' is only allowed in constant variable declarations
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
FIND OUT THE INTERNAL REASON FOR ...?(55:00)

DURGA POINT DIDNT UNDERSTOOD

 Durga Point:-
 without existing outer class object there is no chance of existing inner class object.
 inner class always talks about instance object related terminology.

inside inner class we can t declare any static member,including main method and we can t run inner class 
directly from command prompt.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
 class Test 
{
  public static void main(java.lang.String args[])
	  {
           char x=65535;
           ++x;
           System.out.println(x);
	  }
}

EXPLANATION:-
============
Here last value of byte,short,char,int last value and increment means we ll get the begining value.
only char value is getting different,Rest all values gets to the begining..
find the reason..
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
case 1:- Acessin inner class code from static area of outer class..
--------

 class Outer 
{
	class Inner
	{
		public void m1()
			{
		      System.out.println("Inner class m1 method");
		    }
	}
  public static void main(java.lang.String args[])
	  {
	      Outer o=new Outer();
          Outer.Inner i=o.new Inner();
		  i.m1();
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Approach 1:-

Outer o=new Outer();
Outer.Inner i=o.new Inner();
i.m1();
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
case 1:- Acessin inner class code from static area of outer class..
--------

 class Outer 
{
	class Inner
	{
		public void m1()
			{
		      System.out.println("Inner class m1 method appraoch 2");
		    }
	}
  public static void main(java.lang.String args[])
	  {
          Outer.Inner i=new Outer().new Inner();
		  i.m1();
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method appraoch 2

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Approach:-2
-----------
   Outer.Inner i=new Outer().new Inner();
		  i.m1();
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
case 1:- Acessin inner class code from static area of outer class..
--------


 class Outer 
{
	class Inner
	{
		public void m1()
			{
		      System.out.println("Inner class m1 method appraoch 3");
		    }
	}
  public static void main(java.lang.String args[])
	  {
          new Outer().new Inner().m1();
      }
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Inner class m1 method appraoch 3

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Approach:-3
-----------
 new Outer().new Inner().m1();
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
Case 2:-Acessing inner class code from instance Area of outer class.
-------
 class Outer 
{
	class Inner
	{
		public void m1()
			{
		      System.out.println("Inner class m1 method");
		    }
	}
 
    public void m2()
			{
		      System.out.println("Outer class m2 method");
			  Inner i =new Inner();
			  i.m1();
		    }

  public static void main(java.lang.String args[])
	  {
        Outer o =new Outer();
		o.m2();
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Outer
Outer class m2 method
Inner class m1 method

C:\Users\DELL\Desktop>


EXPLANATION:-
============
Without existing outer class object there is no chance of creating inner class object..

Step 1:-
Inside the Outer class main method compulsary we need to create Outer Object to get acess into 
instance method m2() of outer class.(coz its an instance method of Outer class..)
So outer Object already created from that created Object reference we have entered into instance area of m2().
So from inside m2() method area we just need to create a inner Object to get acess into inner class instance method.
Which is valid which come into picture that after creating outer object we are creating inner object..

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Case :- 3
---------
Acessing Inner class code from outside of Outer class.

PROGRAME=16
=========
class Outer 
{
	class Inner
	{
		public void m1()
			{
		      System.out.println("Inner class m1 method");
		    }
	}
}

class Test
{
	public static void main(java.lang.String args[])
	  {
          Outer o =new Outer();
		  Outer.Inner i=o.new Inner();
		  i.m1();
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Inner class m1 method

C:\Users\DELL\Desktop>
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
Summary just Observe...

Diagram see Long book(Big Spiral Book):-
Page---> 107
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
