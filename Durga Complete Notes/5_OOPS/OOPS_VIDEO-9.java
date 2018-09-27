TOPIC:- OOPS
--------
VIDEO NO=9
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-

Example=7(Miscellaeneous)

**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
 lAST VIDEO PROGRAME

PROGRAME=1
=========
 class Parent
{

}
class Ramu extends Parent
{

}
class Shamu extends Parent
{

}

class Test
{
	public static void main(String[] args)
	{
	   Object o=new Parent();
	   Shamu r=(Ramu)o;
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:19: error: incompatible types: Ramu cannot be converted to Shamu
           Shamu r=(Ramu)o;
                   ^
1 error

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
Strictly speaking through type casting we are not creating any new object,
for the existing object we are providing another type of reference variable.
that is we are performing type casting but not object casting.


String s =new String("Durga");
Object o=(Object)s;
   
           ====>replacing the above 2 lines in a single line.
       		   Object o=new String("Dugra");
           

PROGRAME=2
=========
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
 class Test
{
	public static void main(String[] args)
	{
	   Integer I=new Integer(10);
	   Number N=(Number)I;
	   Object O=(Object)N;
	   System.out.println(I==N);
	   System.out.println(O==O);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true
true

EXPLANATION:-
============
 Case :-1
 
	   Integer I=new Integer(10);
	   Number N=(Number)I;
                           =====>combining these 2 lines we get
                                          Number N=(Number)I;
 Case 2:-
                     Integer I=new Integer(10);
	                 Number N=(Number)I;
                     Object O=(Object)N;
                          =====>combining these 3 lines we can write
                                        Object o=new Integer(10);
	
	please refer hand written notes on page 102 for diagram. 
	
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
 class A
 {
 }
 
 class B extends A
 {
 }
 
 class C extends B
 {
 }

EXPLANATION:-
============

A------------->B--------------->C
(Parent)    (Child)        (Grandchild)

 C c=new C();

        (B)c
          ==>This results in the form:-
		              B b =new C();
     
         (A)((B)c)
     		 ==>This results in the form:-
                     A a =new C();


***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 class Parent
{
	void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	void m2()
		 {
	         System.out.println("Child");
	     }
}

class Test
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m1();
		c.m2();
		System.out.println("hello");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent
Child
hello

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 class Parent
{
	void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	void m2()
		 {
	         System.out.println("Child");
	     }
}

class Test
{
	public static void main(String[] args)
	{
		Child c=new Child();
        Parent p=((Parent)c).m1();
		System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:22: error: incompatible types: void cannot be converted to Parent
        Parent p=((Parent)c).m1();
                               ^
EXPLANATION:-
============
This Example change the return type to Parent and Child and check.
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
 Same as Example 7 

PROGRAME=8
=========
 class Parent
{
	void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	void m2()
		 {
	         System.out.println("Child");
	     }
}

class Test
{
	public static void main(String[] args)
	{
		Child c=new Child();
        Parent p=((Parent)c);
		p.m1();
		System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent
hello

EXPLANATION:-
============
    Parent p=((Parent)c);
	          ===>This line is same as
			                      Parent p=new Child();
								        p.m1();

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----

PROGRAME=9
=========
class Parent
{
	void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	void m2()
		 {
	         System.out.println("Child");
	     }
}

class Test
{
	public static void main(String[] args)
	{
		Child c=new Child();
        Parent p=((Parent)c);
		p.m2();
		System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:23: error: cannot find symbol
                p.m2();
                 ^
  symbol:   method m2()
  location: variable p of type Parent
1 error

EXPLANATION:-
============
            Parent p=((Parent)c);
			          =====>This line is same as 
					                    Parent p=new Child();
										 p.m2();
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Parent reference can be used to hold child objects but by using that reference we can t call child
specific methods.
and we can call only methods avaliable in parent class.
PROGRAME=10
=========
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
 class Parent
{
	void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	void m1()
		 {
	         System.out.println("Child");
	     }
}

class Gchild
{      
	void m1()
		 {
	         System.out.println("GChild");
	     }
}

class Test
{
	public static void main(String[] args)
	{
        Gchild g =new Gchild();
		g.m1();
		System.out.println("bye");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
GChild
bye
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
 class Parent
{
	void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	void m1()
		 {
	         System.out.println("Child");
	     }
}

class Gchild extends Child
{      
	void m1()
		 {
	         System.out.println("GChild");
	     }
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Child)gc);
			p.m1();
		System.out.println("bye");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
GChild
bye


EXPLANATION:-
============
 Parent p=((Child)gc);
              =====>
			  Parent p=(Child)
       			      Accepatable

			  Parent p=(Parent)
       			      Accepatable

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
  class Parent
{
	void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	void m1()
		 {
	         System.out.println("Child");
	     }
}

class Gchild extends Child
{      
	void m1()
		 {
	         System.out.println("GChild");
	     }
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Parent)(Child)gc);
			p.m1();
		System.out.println("bye");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
GChild
bye


EXPLANATION:-
============
It is overriding and method resolution is always based on runtime object.
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
  class Parent
{
	static void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	static void m1()
		 {
	         System.out.println("Child");
	     }
}

class Gchild extends Child
{      
   static void m1()
		 {
	         System.out.println("GChild");
	     }
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Child)gc);
			p.m1();
		System.out.println("bye");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent
bye

EXPLANATION:-
============
It is method hiding and method resolution always based on reference type.
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
  class Parent
{
	static void m1()
		 {
	          System.out.println("Parent");
	     }
}

class Child extends Parent
{
	static void m1()
		 {
	         System.out.println("Child");
	     }
}

class Gchild extends Child
{      
   static void m1()
		 {
	         System.out.println("GChild");
	     }
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Parent)(Child)gc);
			p.m1();
		System.out.println("bye");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Parent
bye
      
EXPLANATION:-
============
It is method hiding and method resolution always based on reference type.

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
   class Parent
{    
	int x=777;
}

class Child extends Parent
{
	int x=888;
}

class Gchild extends Child
{      int x=999;
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		System.out.println(gc.x);
		System.out.println("bye");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
999
bye

EXPLANATION:-
============
 Variable resolution is based on reference type but not on run time object.
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
 
  class Parent
{    
	int x=777;
}

class Child extends Parent
{
	int x=888;
}

class Gchild extends Child
{      int x=999;
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Child)gc);
		System.out.println(p.x);
		System.out.println("bye");
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
777
bye

EXPLANATION:-
============
 Variable resolution is based on reference type but not on run time object.
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
   class Parent
{    
	int x=777;
}

class Child extends Parent
{
	int x=888;
}

class Gchild extends Child
{      int x=999;
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Parent)(Child)gc);
		System.out.println(p.x);
		System.out.println("bye");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
777
bye

EXPLANATION:-
============
 Variable resolution is based on reference type but not on run time object..

***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
   class Parent
{    
	int x=777;
}

class Child extends Parent
{
	int x=888;
}

class Gchild extends Child
{      int x=999;
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Parent)(Child)gc);
		System.out.println((Parent)(Child)gc.x);
		System.out.println("bye");
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:21: error: incompatible types: int cannot be converted to Child
                System.out.println((Parent)(Child)gc.x);
                                                    ^
1 error
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
