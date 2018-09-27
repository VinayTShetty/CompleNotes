TOPIC:-OOPS
--------
VIDEO NO=14
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
Hence the main objective of constructor is to perform initialization of an object.
Not to create an object.

Constructor:-
Once we create an object compulsary we should perform intialization then only the
object is in a position to respond properly.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
See here for every object a same data will be avaliable,
so its not recomended..
If we want we cannot change so its a bad practice.

PROGRAME=2
=========
 class Student
{       
  String name;
  int id;
	{
		name="vinay";
		id=111;
	}
	public static void main(String[] args)
	{
		Student s=new Student();
		Student s1=new Student();
		System.out.println(s.name+"------"+s.id);
		System.out.println(s1.name+"-----"+s1.id);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Student
vinay------111
vinay-----111

See miscellaeneous videos for some  more info on String concatenation and println methods..

EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
We can perform intialization in many different places..
Some of the few are listed below..

PROGRAME=3
=========
class Student
{
	String name="viany";
	int id=123456;
	public static void main(String[] args)
	{
		Student s=new Student();
		Student s1=new Student();
		System.out.println(s.name+"   "+s.id);
		System.out.println(s1.name+"   "+s1.id);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Student
viany   123456
viany   123456

EXPLANATION:-
============
In this approach for all objects we are having same name and roll no so it s not recemonded
approach.

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
class Student
{
	String name;
	int  id;
	{
     name="vinay";
	id=123456;  
	}
	public static void main(String[] args)
	{
		Student s=new Student();
		Student s1=new Student();
		System.out.println(s.name+"   "+s.id);
		System.out.println(s1.name+"   "+s1.id);
	}
		
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Student
vinay   123456
vinay   123456
EXPLANATION:-
============
For all objects same data will be reflected so not a recemended appraoch.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 class Student
{
	String name;
	int  id;
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.name="vinay";
		s.id=222;

		Student s1=new Student();
		s1.name="James";
		s1.id=111;

		System.out.println(s.name+"   "+s.id);
		System.out.println(s1.name+"   "+s1.id);
	}
		
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Student
vinay   222
James   111

EXPLANATION:-
============
Here for every Object separatrely we should maintain the copy for intialization
readability of the code will be dumb.

500 objects means 500 copies we should maintain so its not recomended approach.
***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
When ever we are creating an object some piece of the code will be executed automatically to
perform intialization of the object this piece of the code is nothing but constructor.



PROGRAME=7
=========
class Student
{
	String name="viany";
	int id;
	Student(String name,int id)
	{
       this.name=name;
	   this.id=id;
	}
	public static void main(String[] args)
	{
		Student s=new Student("vinay",123);
		Student s1=new Student("james",456);
		System.out.println(s.name+"   "+s.id);
		System.out.println(s1.name+"   "+s1.id);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Student
vinay   123
james   456

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
Hence main purpose of constructor is to perform intialization of an Object.
but not to create object.
                           
						   Diff beween instance block and constructor.

other than intialization If we want to perform any activity for every object creation 
then we should go for instance block.(like upating one entry in the database for every object creation
or incrementing count value for every object creation etc...)
Both constructor and instance block have there own different purposes and replacing one concept with 
another concept may not work always..

Both constructor and instance block will be executed for every object creation.
But instance block frist followed by constructor.

PROGRAME=8
=========
EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
 Instance block best suitable :-
 Example:-  I want to check how many objects are created for class..i want the count..
 Assume we don t have instance block concept..

PROGRAME=9
=========
class Test
{
	static int count=0;
	Test()
	{
	   count++;
	}

	Test(int i)
	{
		count++;
	}
	Test(double d)
	{
         count++;
	}

public static void main(String [] args)
	{
	Test t=new Test();
	Test t1=new Test(10);
	Test t2=new Test(2.7);
	System.out.println(count);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
3

EXPLANATION:-
============
Here for every constructor we have to add count variable and readability of the code will be down.
coz at run time we don t know which constructor will be executed..
so we have to write count in all.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Another disadvantage..
see 
to check how many objects are created..

PROGRAME=10
=========
class Test
{
	static int count=0;
	Test()
	{   this(10);
	   count++;
	}

	Test(int i)
	{
		count++;
	}
	Test(double d)
	{
         count++;
	}

public static void main(String [] args)
	{
	Test t=new Test();
	System.out.println(count);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
2

EXPLANATION:-
============
Even though we are creating a single object the no of count is 2 so its not valid..
so best suitable way is going for instance block.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
other than intialization we have to perform any activity then highly recomended approach is
instance block..

Req:-To check how many objects have been created..

PROGRAME=11
===========
class Test
{
	static int count=0;
	
	{
	 count++;
	}
	Test()
	{   this(10);
	   
	}

	Test(int i)
	{
        this(2.7);
	}
	Test(double d)
	{
	}

public static void main(String [] args)
	{
	Test t=new Test();
	System.out.println(count);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
1

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
To check how many Objects have been created...

PROGRAME=12
=========
class Test
{
	static int count=0;
	
	{
	 count++;
	}
	Test()
	{   
	   
	}

	Test(int i)
	{

	}
	Test(double d)
	{
	}

public static void main(String [] args)
	{
	Test t=new Test();
	Test t1=new Test(5);
	Test t2=new Test(10.8);
	System.out.println(count);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
3

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 class Test
 {
	 void Test()
	 {
	 }
 }

 C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 void Test()
	 {
	 }

	 It s a method but not constructor...

	 It s possible to take method name same as class name but not recomended approach..

We won t get any error.coz compiler treats it as a method but not constructor..
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
Mehtod name same as class name that is constructor..

PROGRAME=14
=========
 class Test
 {
	 void Test()
	 {
         System.out.println("Test method");
	 }

	 Test()
	 {
		 System.out.println("constructor");
	 }
	 public static void main(String[] args)
	 {
          new Test();
	 }
 }

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
constructor

EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
 class Test
 {
	 void Test()
	 {
         System.out.println("Test method");
	 }

	 Test()
	 {
		 System.out.println("constructor");
	 }
	 public static void main(String[] args)
	 {
          new Test().Test();
	 }
 }

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
constructor
Test method
      
EXPLANATION:-
============
use 

Test t=new Test();
t.m1();

for explaining purpose.
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
Please do some R and D on constructor modifiers..
which modifiers are applicable for constructors. 
and How the operation works for those constructors.

PROGRAME=16
=========
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
The only applicable modifiers for the constructors are 
public, 
default, 
private,
protected.

PROGRAME=17
=========
 class Test
 {

	 static Test()
	 {
		 System.out.println("constructor");
	 }
	 public static void main(String[] args)
	 {
          new Test().Test();
	 }
 }
 C:\Users\dell1\Desktop>javac Test.java
Test.java:4: error: modifier static not allowed here
         static Test()
                ^
Test.java:10: error: cannot find symbol
          new Test().Test();
                    ^
  symbol:   method Test()
  location: class Test
2 errors 

EXPLANATION:-
============
Observe the error in Example 17(see CFS error) and 18 
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
 class Test
 {

	 static Test()
	 {
		 System.out.println("constructor");
	 }
	 public static void main(String[] args)
	 {
          new Test();
	 }
 }

C:\Users\dell1\Desktop>javac Test.java
Test.java:4: error: modifier static not allowed here
         static Test()
                ^
1 error

EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
1)
compiler is responsible to generate default constructor.

JVM wont generate default constructor(Wrong concept).

2) compiler will generate default constructor If we are not writing any constructor.
If we are writing atleast one constructor compiler will not generate default constructor..


3 **)Every class in java contain a constructor 
eiether programmer provided constructor or default constructor provided by compiler.
But not both simultaneously..

4)default constructor generated compiler and programmer generated constructor both existance in java
class is not possible..

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
