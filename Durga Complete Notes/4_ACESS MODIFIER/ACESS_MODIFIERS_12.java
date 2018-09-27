TOPIC:-ACESS MODIFIER
--------
VIDEO NO=12
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
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
 interface contain variables.
 The main purpose of interface variables is to declare requirement level constant.

 
 so in the future any where we want we can use those while providing implementation 
to interface methods.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
 interface variable is static wat s the reason.

 We cannot create an object for interface.
 Then wat s the use of declaring it as instance,
 so without exixsting object implementation  class can acess this varibale if declared as static.

 interface variable is final wat s the reason.
 
  If any classes giving implementation to interfaces methods,and trying to change the value 
  so it will be effected to Remaining implementation classes which is providing implementation.
  so if we declare as final, implementation classes can only acess but cannnot change the value.

 Every interface variable is final coz:-
 If one implementation class  changes value then remaining implementation class will be effected,
 to restrict this every interface variable is final.
 so implementation class is acess but not change the value.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
 Note:-

 As every interface variable by default public static final we can't declare with the
following modifiers.

 1)We already using public coz its default, so we cannot use private and protected 
 we shoould use any one so.so private and protected we can t use.


why transient modifier we cannot apply to variable:-
2) For  interface we can t create an object, so object creation is not possible means serialization
concept is not applicable.
coz serialization means saving state of an object.
If serialization is not there we can t apply transient keyword we cannot apply.
so transient not applicable.


3)interface variable is final so volatile is not possible.
final-volatile illegal combinations.
 

 As every interface variable is public static final,we can t declare with the following modifier.
 Diagram:-
   Hand Written notes:-95 page
 
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
 interface varaiable are public static final

 If static variables declared as final JVM won t provide defalut values.
 compulsary we should perform intialization explicitly,before .class loading,so we havae only 
 2 option that is @ the time declaration only and static block only.


 static final variables must be given values at the time of intialization or inside static block
 But static block concept is not applicable to interface so we should provide values to interface 
 @ the time of intialization only.

Please note:-

interface contains methods and variables.
we cannot use static block for interface.





***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
 

For interface varaibles compulsary we should perform intialziaton @ the time of declaration
otherwise we will get CE.

PROGRAME=5
=========
 interface It
{
	int x;
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: = expected
        int x;
             ^
1 error

Programe 2:-

 interface It
{
	int x=;
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: illegal start of expression
        int x=;
              ^
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
 interface It
{
	int x=999;
}

class Test implements It
{
	public static void main(String [] args)
	{
	  System.out.println(x);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
999

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 interface It
{
	int x=999;
}

class Test implements It
{
	public static void main(String [] args)
	{  
       x=10; //Point:- 1 
	  System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: cannot assign a value to final variable x
       x=10;
       ^
1 error
EXPLANATION:-
============
 static variable we can acess directly in static method.
 But it s final so we can t change the value.


 Inside implementation class we can acess interface variables but we cannot modify values.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
 interface It
{
	int x=999;
}

class Test implements It
{
	public static void main(String [] args)
	{  
      int x=10; 
	  System.out.println(x);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
But for methods it won t happen like that.
varables it may happen i feel proof is the programe.
PROGRAME=10
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
     System.out.println(x);
    }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: reference to x is ambiguous
     System.out.println(x);
                        ^
  both variable x in It1 and variable x in It2 match
1 error

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
------------------------------
 toString();

class Test
{
     void m1()
    {
	System.out.println("m1 method"+"--"+toString()); 
    }	
     
     public static void main(String[] args) 
      {
		Test t =new Test();
		t.m1();
		
		Test t1 =new Test();
		t1.m1();
	  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
m1 method--Test@2a139a55
m1 method--Test@15db9742




 -----------------------------------
   interface methods are by Default public abstract we write it or not.


 interface It1
{
	public void m1();
}

interface It2
{
    a bstract void m1();
}

class Test implements It1,It2
{
	public void m1()
		{
	System.out.println("m1 implementation"+" "+toString());
	    }
 public static void main(String[] args)
	{
      It1 x=new Test();
	  x.m1();


	  It2 xx=new Test();
	  xx.m1();

	  Test t =new Test();
	  t.m1();
	  System.out.println();
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
m1 implementation Test@2a139a55
m1 implementation Test@15db9742
m1 implementation Test@6d06d69c

EXPLANATION:-
============
 Providing implementation for one method is enough..
 class implementing from 2 interface having same method signaure.

 and when ever we are calling toString() method wat happens do some research.

 If 2 interface contain same signature 
                        same return type
						then we have to provide implementation to only one method.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
 interface methods are by Default public abstract we write it or not. 
PROGRAME=12
=========
 interface It1
{
	public void m1();
}

interface It2
{
    abstract void m1(int i);
}

class Test implements It1,It2
{
	public void m1()         //----------------------------> overloaded methods
		{
	System.out.println("m1 implementation");
	    }

    public void m1( int i) //----------------------------> overloaded methods
		{
	System.out.println("m1 implementation");
	    }
 public static void main(String[] args)
	{
      
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

EXPLANATION:-
============
 If 2 interface contains a method with same name but different argument type then in the imnplementation
 class we have to provide implementation for methods and these methods acts as overloaded methods
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 interface It1
{
	public int m1();
}

interface It2
{
    abstract void m1();
}

class Test implements It1,It2
{
	public void m1()
		{
	System.out.println("HI");
	    }
    public int m1()
	{
	System.out.println("Hello");
	return 10;
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:17: error: method m1() is already defined in class Test
    public int m1()
               ^
Test.java:11: error: Test is not abstract and does not override abstract method m1() in It1
class Test implements It1,It2
^
Test.java:13: error: m1() in Test cannot implement m1() in It1
        public void m1()
                    ^
  return type void is not compatible with int
3 errors

EXPLANATION:-
============
 Test class contain 2 methods of same signature so its not allowed
  
  public void m1() // method signature---->m1()
		{
	System.out.println("HI");
	    }
    public int m1()// method signature---->m1()
	{
	System.out.println("Hello");
	return 10;


***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
 We can use this approach see 

PROGRAME=14
=========
 interface It1
{
	public int m1();
}

interface It2
{
    abstract void m1();
}

abstract class Test implements It1,It2
{
	public void m1()
		{
	System.out.println("HI");
	    }
}
class Exam extends Test
{
	    public int m1()
	{
	System.out.println("Hello");
	return 10;
	}

}
C:\Users\dell1\Desktop>javac Test.java
Test.java:13: error: m1() in Test cannot implement m1() in It1
        public void m1()
                    ^
  return type void is not compatible with int
Test.java:20: error: m1() in Exam cannot implement m1() in It2
            public int m1()
                       ^
  return type int is not compatible with void
2 errors

EXPLANATION:-
============
This is the wrong approach bcoz
	Parent class(Test)-->m1()
	child class(Exam) -->m1()
	having same signature this concept is called overriding concept.
    In overriding retutn type must be same,but here return type is diffferent
    Parent class(Test)-->m1()--->void     
	child class(Exam) -->m1()---->int 
	so this also wrong approach.

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:- vvvvvv important
-----
 It is impossible to implement both interface simultaneoulsy,(condition applied)
	 If two interface contain method with same signature and different return type.
	
If the return types are covaraint return types then its possible.

	like Object and String
 
     Parent we can provide implementation for 1 method. (Object type)
	 child we can provide implementation for  1 method.	 (String type)


PROGRAME=15
=========

      
EXPLANATION:-
============
If two interface contain method with same signature and different return type,
then it is impossible to implement both interface simultaneously.(If return type are not covaraint.)
 
interface Right
{
	public void m1();
}

                           interface Left
                           {
                           	public int m1();
                           }

 We can t write any java class which implements both interfaces simultaneously.
 
--------------------------------
 Is java class can implement any number of interface simultataneously...?
 yes...


	Except a particular case:-If two interfaces contains a method with same signature with different 
		return type then its impossible to implement both interfaces simultaneously..

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
 Student doubt:-
PROGRAME=16
=========
EXPLANATION:-
============
	 	When we implementation for both interface simultaneously

Student doubt:-
	 Inner class also same problem..If we trying with inner class,concept.
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
	varaible naming conflict solution is there,we can use interface name to call it.
PROGRAME=18
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
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
	 varaible naming conflict solution is there.
	method nameing conflkict solutin is not there.
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
