TOPIC:-OOPS
--------
VIDEO NO=17
-----------
NUMBER OF PICTURES=
------------------
1(I:\JAVA NOTES\DURGA JAVA NOTES\OOPS\OOPS_VIDEO_DURGA_17)

VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
2(*****)
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
For any java class If we are able to create only one Object then it is called Singleton class..
Ex:-
1) Runtime class
2) ActionServlet
3) ServiceLocator
4) BusinessDelegate

Advantage of singletonclass:-
If several people have same requirement,then it s not recomended to create a separate Object,for every 
requirement,we have to create only one Object and we can re-use same objecet for every similar requirement
so that performance and memory utiliazation will be improved.

This is the central advantage of singleton classes.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
Very important Points on Singleton class.



Conclusion :-1

Singleton class objects we cannot create using new operator or constructor.
Compulsary we should use factory method.(using class name creating an Object)

Reason:-
Vinay Point
(may be the constructor is private so in all factory method,so we cannot use new operator)

-------------------------------------------------------------------------------------
Conclusion :-2

Runtime r1=Runtime.getRuntime();
Runtime r2=Runtime.getRuntime();
Runtime r3=Runtime.getRuntime();

Diagram:-
I:\JAVA NOTES\DURGA JAVA NOTES\OOPS\OOPS_VIDEO_DURGA_17


Here 1lakh people are using Runtime object,but we have creatred only one Runtime Object.

If several perople require same object, create one object and Re-use that object for everyone
so that memory utlization and performance will get improved.

Runtime.getRuntime()  method won t create new Object it always returns exixting Object..

It wont create new object,single object but different reference name that s it..
only one object exists..
-------------------------------------------------------------------------------------

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
Is it possible to create our own singleton class..
Yes we can..

There are 2 approaches.
1st approach take constructor as private..
2nd approach is Example=9

1) Frsit we should take constructor as private..
  And private static variable and public factory method.


Private constructor main use is to creatre our own singleton class..
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----

Approach:-1

1) Frsit we should take constructor as private..
   And private static variable and public factory method.

PROGRAME=4
=========
class  Test
{
       public static Test t=new Test();
	 
	   private Test()
	   {

	   }
	  	   public static  Test getTest()
	  {
		   return t;
	  }

		public static void main(String[] args) 
	{
         Test t=Test.getTest();
		 System.out.println("t="+t);

        Test t1=Test.getTest();
         System.out.println("t1="+t1);
         
		 Test t2=Test.getTest();
         System.out.println("t2="+t2);
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
t=Test@2a139a55
t1=Test@2a139a55
t2=Test@2a139a55

EXPLANATION:-
============
Runtime class internally implemented using this approach..
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
class  Test
{
       public static Test t=new Test();
	 
	   private Test()
	   {

	   }
	  	   public static  Test getTest()
	  {
		   return t;
	  }

		public static void main(String[] args) 
	{
         Test t=Test.getTest();
		 System.out.println("t="+t);

        Test t1=Test.getTest();
         System.out.println("t1="+t1);
         
		 Test t2=Test.getTest();
         System.out.println("t2="+t2);

       System.out.println(new Test());
       System.out.println(new Test());
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
t=Test@2a139a55
t1=Test@2a139a55
t2=Test@2a139a55
Test@15db9742
Test@6d06d69c

EXPLANATION:-
============
For singleton class we can create many objects we want but inside the class.
outside the class,we ll get CE.

See the object reference are different..
-------------------------------------------------------------------------------------------
Internal Doubt:-
================

See If its private its compulsary we should use get and set..
coz in this i am using m1() also but no error. see.

class  Test
{
       public static Test t=new Test();
	 
	   private Test()
	   {

	   }
	  	   public static  Test m1()
	  {
		   return t;
	  }

		public static void main(String[] args) 
	{
         Test t=Test.m1();
		 System.out.println("t="+t);

        Test t1=Test.m1();
         System.out.println("t1="+t1);
         
		 Test t2=Test.m1();
         System.out.println("t2="+t2);

       System.out.println(new Test());
       System.out.println(new Test());
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
t=Test@2a139a55
t1=Test@2a139a55
t2=Test@2a139a55
Test@15db9742
Test@6d06d69c
-------------------------------------------------------------------------------------------





***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
class  Test
{
       public static Test t=new Test();
	 
	   private Test()
	   {

	   }
	  	   public static  Test getTest()
	  {
		   return t;
	  }

		public static void main(String[] args) 
	{
         Test t=Test.getTest();
		 System.out.println("t="+t);

        Test t1=Test.getTest();
         System.out.println("t1="+t1);
         
		 Test t2=Test.getTest();
         System.out.println("t2="+t2);

       System.out.println(new Test());
       System.out.println(new Test());
	}

}

class Exam extends Test
{
   public static void main(String[] args)
	{
	   new Test();
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:31: error: Test() has private access in Test
class Exam extends Test
^
Test.java:35: error: Test() has private access in Test
           new Test();
           ^
2 errors

EXPLANATION:-
============
See it wont allow us to create an object outside the class.

***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class  Test
{
       public static Test t=new Test();
	 
	   private Test()
	   {

	   }
	  	   public static  Test getTest()
	  {
		   return t;
	  }

		public static void main(String[] args) 
	{
	}

}

class Exam extends Test
{

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:20: error: Test() has private access in Test
class Exam extends Test
^
1 error

EXPLANATION:-
============
Inheritance concept also won t comne into picture due to  default constructor concept.
***************************-----END of--->8<--------***************************
Example=9
=========

Approach 2:-
------------
 For creating singleton classes...

 See in Example :-5 Object got created in the begining only.(drawback)

But in Example:-9 i want to create an Object whenever the request came and pass the same Object to 
all whom ever is necessary.

NOTE:-
-----
PROGRAME=9
=========
class  Test
{
       public static Test t=null;
	 
	   private Test()
	   {

	   }
	  	   public static  Test getTest()
	  {
			   if (t==null)
			   {
				   t=new Test();
			   }
		   return t;
	  }

		public static void main(String[] args) 
	{
         
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

EXPLANATION:-
============
At any point of time for Test class we can create only one Object hence Test class is singleton class.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
General error see and check out...

PROGRAME=10
=========
class  Test
{
       public static Test t=null;
	 
	   private Test()
	   {

	   }
	  	   public static  Test getTest()
	  {
			   if (t=null)
			   {
				   t=new Test();
			   }
		   return t;
	  }

		public static void main(String[] args) 
	{
         
	}

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: incompatible types: Test cannot be converted to boolean
                           if (t=null)
                                ^
1 error
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
If class is final we can t create Child class...

I.Q:-
class is not final but we are not allowed to create Child classes...?
How it s possible...?

Decalare every construct as private...(Durga Point)
Some important point coz If we create an arg constructor and then its not private we can create object
for that..so declare every constructor as private..

PROGRAME=11
=========
Case:-1
-------
class  Parent
{
	private Parent()
	   {

	   }
      
	  public static void main(String[] args) 
	{
         
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

Case 2:-
--------

By declareing every constructor as private.
It is impossible to create child class.

class  Parent
{
	private Parent()
	   {

	   }
      
	  public static void main(String[] args) 
	{
         
	}

}

class Child extends Parent
{

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:15: error: Parent() has private access in Parent
class Child extends Parent
^
1 error


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
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 
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
