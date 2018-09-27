TOPIC:-OOPS
--------
VIDEO NO=12
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-

Example=5 (*****)
Example=7(**)
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----                     Instance control Flow
PROGRAME=1
=========

 class Test
{
	int i=10;
	{
		m1();
	 System.out.println("Frist instance block");
	}
	Test()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
main
EXPLANATION:-
============
Frist static control flow will start.
so in this code,there are no static members expect main method.
main mehtod will execute..


Note:-If we are not creating any Object,even the basic identification of instance variables also 
won t happen.
Instance memberes will be identified only if we create Object.


Observe here :-

	public void m1()
	{
		System.out.println(j); //using frist
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20; // declaring here.. but no error.
}

Using frist and then declaring..its not getting any error..
see the reason..we are not giving any chance to instance part coz we are not creating any object.
only static control flow will get the chance,so main method will get the chance..


Durga Point:- when ever we are executing a java class,
Frist static control flow will be executed.In that static control flow.
IF WE ARE CREATING AN OBJECT(**) 
the following sequence of events will be executed as the part of instance control flow.


3 points
page 50-52
PDF:-223





***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
See PDF 222 and 223 page in that step main method has given 1st step.
so static control flow is the frist..
page:-50 and 51

In this page steps are

identifation of staic members.
assignment of staic variables and static block.
execution of main method...
   so in main method Parent p=new parent(); is there so it has taken 2 nd step.
 
 next is instance flow..
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
NOTE:-DURING IDENTIFICATION OF INSTANCE OR STATIC VARIABLES VARIABLES WILL BE IN [RIWO] ONLY STATE...

EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
 class Test
{
	int i=10;
	{   
	   m1();
	 System.out.println("Frist instance block");
	}
	Test()
	{   
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
main method

EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
See here even though we are creating the object inside instance block its not getting executed.
coz instance block will only not get a chance to execute..

PROGRAME=5
=========
class Test
{
	int i=10;
	{   
	 Test t=new Test();      //Observe here.
     m1();
	 System.out.println("Frist instance block");
	}
	Test()
	{   
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
main method

EXPLANATION:-
============
BAsic identification of instance variables also won t happen..
***************************-----END of--->5<--------***************************
Example=7
=========
NOTE:-
-----
Observe the flow control.

PROGRAME=7
=========
class Test
{
	int i=10;
	static
	{   
	 Test t=new Test(); 
    System.out.println("Frist static block");
	}
	Test()
	{   
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Second instance Block
constructor
Frist static block
main method

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 class Test
{
	int i=10;
	{   
	m1(); 
    System.out.println("Frist instance block");
	}
	Test()
	{   
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{    Test t=new Test(); 
		System.out.println("main method");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

0
Frist instance block
Second instance Block
constructor
main method

EXPLANATION:-
============
public static void main(String[] args)
	{    Test t=new Test(); 
		System.out.println("main method");
	}

	Frist preference is static control flow,after that main method..
so object is created inside the main method.so usual steps see.


when ever we are creating an object the following action takes place.

Main conclusion:-(If we create an object anywhere in static control flow.)

Frsit static control flow.
In this flow,IF we create an object anywhere in between then instance control flow will come into
picture.
After completing instance control flow again static control flow will start....


***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
class Test
{
	int i=10;
	{   
	m1(); 
    System.out.println("Frist instance block");
	}
	Test()
	{   
		System.out.println("constructor");
	}
	public static void main(Strinmdg[] args)
	{   
		System.out.println("main method");
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
main method
EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
check for illegal forward reference for miscellaeneous..commbination.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
stack over flow error..
avoid these 

PROGRAME=11
=========
  class Test
{
	int i=10;
	{   
	m1(); 
    System.out.println("Frist instance block");
	}
	Test()
	{   
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{    Test t=new Test(); 
		System.out.println("main method");
	}
	public void m1()
	{      new Test();
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}

        at Test.<init>(Test.java:5)
        at Test.m1(Test.java:17)
        at Test.<init>(Test.java:5)
        at Test.m1(Test.java:17)
        at Test.<init>(Test.java:5)
        at Test.m1(Test.java:17)
        at Test.<init>(Test.java:5)

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
  class Test
{
	int i=10;
	{   
	m1(); 
    System.out.println("Frist instance block");
	}
	Test()
	{   
		System.out.println("constructor");
	}
	public static void main(String[] args)
	{    Test t=new Test(); 
		System.out.println("main method");
		new Test();
	}
	public void m1()
	{      
		System.out.println(j);
	}
	{
		System.out.println("Second instance Block");
	}
	int j=20;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0
Frist instance block
Second instance Block
constructor
main method
0
Frist instance block
Second instance Block
constructor

EXPLANATION:-
============
static control flow is one time activity,Which will be performed at the time of class loading.
But instance control flow is not one time activity and it will be performed for every object creation.


object creation is the most costly operation,if there is no specific requirements then its not 
recomended to create object.
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
Whenever we are  executing any java class frist static control flow will be executed.

PROGRAME=13
=========
PDF:- 223
PAGE:- 50-52
TIME:- 45:00--

instance control flow from parent to child example...If did nt understood..
see the above time..

Instance control flow in Parent to Child relationship :

just go through and if not understood see the video...
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
