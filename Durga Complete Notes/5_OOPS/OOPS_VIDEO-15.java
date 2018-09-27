TOPIC:-OOPS
--------
VIDEO NO=15
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
5(*)
19(**)
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
	private Test()
	{
	}
public static void main(String[] args) 
   {
   }	
}

class Vinay
{
   public static void main(String[] args) 
   {
	    new Test();
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:17: error: Test() has private access in Test
            new Test();
            ^
1 error

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
Every 0 arg or no arg constructor is not default constructor.
and every default constructor is 0-arg constructor and no arg constructor.

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
EXPLANATION:-
============
The acess modifier of default constructor is same as class modifier.
class is public---->modifier of default  constructor is public.
class is default---->modifier of default  constructor is default.

This rule is applicalble only for public and default not to others...
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============

Programmer Generated Code:-

Case 1:-
--------
public class Test
{
	void Test()
	{

	}
}
Copmpiler Generated Code:-

Case 1:-
--------
public class Test
{
    public Test()
	{
		super();
	}
	void Test()
	{

	}
}
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
Very important :-
Constructor will always place super(); in the frist line of the constructor.
If we are not writing this and super in the constructor.
If we writing this and super in the frist line of constructor compiler wont generate this or super()

Wrong concept compiler will never generate this() keyword inside the frist line of constructor..


***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
class Test
{
	Test()
	{
	   this();
	   super();
		
	}
public static void main(String[] args) 
   {
	
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: call to super must be first statement in constructor
           super();
                ^
Test.java:3: error: recursive constructor invocation
        Test()
        ^
2 errors

EXPLANATION:-
============
See the error also..,

Test.java:3: error: recursive constructor invocation
        Test()
        ^
recursive constructor invocation
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Test
{
	Test()
	 {
        super();
	    this();
     }
public static void main(String[] args) 
   {
	
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: call to this must be first statement in constructor
            this();
                ^
1 error

EXPLANATION:-
============
We are using this() @ the end so its giving like that...
It s not checking the recursive of using this() keyword obseve that..
just telling we cannot use this () and in the second line,its not checking recursive action..
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----

PROGRAME=9
=========
class Test
{
	public void m1()
	 {
        super();
		System.out.println("hello");
     }
public static void main(String[] args) 
   {
	   System.out.println("Hi");
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: call to super must be first statement in constructor
        super();
             ^
1 error
EXPLANATION:-
============
Inside a method we cannot use the frist statement as this and super(); 
only in constructor we can use..

Note:-(Tution Point)
We can call a constructor,eiether a super class constructor or a current class constructor only from
a constructor.
not from a method,.
If we are calling from a method we ll ge CE(call to super must be first statement in constructor)

We can use super() or this() only inside a constructor,If we are trying to use outside of constructor
we will get CE..

We can call a constructor directly from another constructor only.

***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
class Test
{
	public void m1()
	 {
        this();
		System.out.println("hello");
     }
public static void main(String[] args) 
   {
	   System.out.println("Hi");
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: call to this must be first statement in constructor
        this();
            ^
1 error

EXPLANATION:-
============
Inside a method we cannot use the frist statement as this and super(); 
only in constructor we can use..
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
 class Test
{
	public void m1()
	 {
		System.out.println("hello");
        this();
	
     }
public static void main(String[] args) 
   {
	   System.out.println("Main mehthod");
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: call to this must be first statement in constructor
        this();
            ^
1 error

EXPLANATION:-
============
So this() and super() must be used inside the constructor only.
we cannot use inside the method..
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
class Test
{

	 {
		System.out.println("hello");
        this();
	
     }
public static void main(String[] args) 
   {
	   System.out.println("Main mehthod");
   }	
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: call to this must be first statement in constructor
        this();
            ^
1 error

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-                   Difference between 
-----                           this.(reference of a varable ) VS this() /super()


this.(reference of a varable) can be used anywhere in the instance area.
but make sure that it come after this() or super() If u are using this() or super().

PROGRAME=13
=========
 class Test
{
	int x=10;
    Test()
	 {   super();
		System.out.println("hello");
		System.out.println(this.x);
     }
public static void main(String[] args) 
   {
	   System.out.println("Main mehthod");
	   new Test();
   }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Main mehthod
hello
10

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
	int x=10;
    Test()
	 {
		System.out.println(this.x);
		super();
		System.out.println("hello");
	
     }
public static void main(String[] args) 
   {
	   System.out.println("Main mehthod");
	   new Test();
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: call to super must be first statement in constructor
                super();
                     ^
1 error

EXPLANATION:-
============
this() and super() must be the frist line in constructor If we are writing it..
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
class Test
{
	int x=10;
    Test()
	 {
	   System.out.println(this.x);
	   System.out.println("hello");
     }
public static void main(String[] args) 
   {
	   System.out.println("Main mehthod");
	   new Test();
   }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Main mehthod
10
hello
      
EXPLANATION:-
============
If we are not writing then compiler will write it,
so hook-cook this() and super() must be the frist line of a constructor.
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
class Test
{
	int x=10;
    Test()
	 {
	   System.out.println(this.x);
	   System.out.println("hello");
     }
	 static void m1()
	{
		 System.out.println(this.x);
	}
public static void main(String[] args) 
   {
	   System.out.println("Main mehthod");
	   new Test();
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: non-static variable this cannot be referenced from a static context
                 System.out.println(this.x);
                                    ^
1 error

EXPLANATION:-
============
we cannot use this or super inside static area..
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
class Test
{
	int x=10;
    Test()
	 {
	   System.out.println(this.x);
	   System.out.println("hello");
     }
	 static void m1()
	{
		this();
	}
public static void main(String[] args) 
   {
	   System.out.println("Main mehthod");
	   new Test();
	   m1();
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: call to this must be first statement in constructor
                this();
                    ^
1 error 

EXPLANATION:-
============
We cannot use this() or super() inside the static area also..
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
We cna use this and super to refer current class and parent class instance members...

PROGRAME=18
=========
class Parent
{
	int y=20;
}
class Child extends Parent
{
	int x=10;
 
	void m1()
	{
		System.out.println(this.x);
		System.out.println(super.y);
	}
public static void main(String[] args) 
   {
        new Child().m1();        
   }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
10
20
EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
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

	void Call()
	{
		System.out.println(this.m1());
		System.out.println(super.m1());
	}
public static void main(String[] args) 
   {
        new Child().Call();        
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:18: error: 'void' type not allowed here
                System.out.println(this.m1());
                                          ^
Test.java:19: error: 'void' type not allowed here
                System.out.println(super.m1());
                                           ^
2 errors

EXPLANATION:-
============
 Use String as return type there coz println method expects some limited argument.

***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
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

	void Call()
	{
     	this.m1();
    	super.m1();	
	}
public static void main(String[] args) 
   {
        new Child().Call();        
   }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Child
Child
Parent

EXPLANATION:-
============
We can call instance members of a class,by using this and super both variables and methods.
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
EXPLANATION:-
============
super(), this()

 Case :-1
 --------
1)We can use only in constructors,only in frist line
3)only one,not both simultaneously.
4)These are constructor calls to call current class or super class constructor.

Case :-2
--------
We can only once in a constructor
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
EXPLANATION:-
============
this and super

Case :-1
---------
1)These are keywords to call super class and current class instance members.
   These are keywords to refer to super and current class instance members..

Case :-2
--------
We can use anywhere expect static area.

Case :-3
---------
We can use any number of times in instance area..
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
To show this and super are non-static variable and they are related to instance..
PROGRAME=23
=========
class Test
{
public static void main(String[] args) 
   {
        System.out.println(super.hashCode()); 
   }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: non-static variable super cannot be referenced from a static context
        System.out.println(super.hashCode());
                           ^
1 error

EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
class Test
{
	int x=10;
public static void main(String[] args) 
   {
        System.out.println(new Test().this.x)
   }	
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: as of release 8, 'this' is allowed as the parameter name for the receiver type only, which has to be the first parameter
        System.out.println(new Test().this.x)
                                      ^
Test.java:6: error: ';' expected
        System.out.println(new Test().this.x)
                                             ^
2 errors

EXPLANATION:-
============
See by using object reference we can use this and super 

Do some R and D on that comment.
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
