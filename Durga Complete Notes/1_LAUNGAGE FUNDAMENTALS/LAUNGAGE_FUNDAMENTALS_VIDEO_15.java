TOPIC:-LAUNGAGE FUNDAMENTALS
--------
VIDEO NO=15
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
 class Test {
  static
	{
     System.out.println("static block");
	}
	public static void main(String[] args) throws Exception
	{
	    for (int i=0;i<10;i++)
	  {
	   Thread.sleep(1000); 
  
      System.out.println("main method");
      System.exit(3000);
	  }
      
	}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
static block
main method
EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========


EXPLANATION:-
============
public static void main(String[] args)
JVM will create an String array.

The argument which are passing from command prompt are called command line argument.
with these command line arguments JVM will "create an array" and by passing that array as argument
JVM will call main method
The main objective of command line arguments are we can customize the behavior of
the main() method.


java Test A B C
 
 A--->args[0]
 B--->args[1]
 C--->args[2]

 args.length=3


 =====================================================================
 Doubt:-
 check who will create normal array object
 ===============================================================
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
 case 1:- 
 ========
 class Test 
{
public static void main(String[] args) 
    {
	;;;;;;;;;;;;;;;;
	System.out.println("The square of 4 is 16");
    }
      
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test 4
The square of 4 is 16

case 2:-
========
 class Test 
{
public static void main(String[] args) 
    {
	;;;;;;;;;;;;;;;;
	System.out.println("The square of 4 is 16");
    }
      
}
 
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test 100
The square of 4 is 16

EXPLANATION:-
============
In case 1 and 2 its hardcoded..we ll get the same output.

harcoded programe.

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
 class Test 
{
public static void main(String[] args) 
    {
	          int x=Integer.parseInt(args[0]);
			  System.out.println("The square of  "+x+" is ="+(x*x));
    }
      
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test 100
The square of  100 is =10000

C:\Users\dell1\Desktop>java Test 25
The square of  25 is =625

 Not harcoded programe.
 These customization will happen depending on the requirement,main methdod will work.
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-There is compulsary rule that we should pass the command line arguments if we have written 
----- in the programe..we can leave empty..
      Have experemted see for other cases also..(Like String, other data types)

PROGRAME=5
=========
  class Test 
{
public static void main(String[] args) 
    {
	          int x=Integer.parseInt(args[0]);
			  System.out.println("The square of  "+x+" is ="+(x*x));
			  System.out.println("hello world");
    }
      
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Test.main(Test.java:5)

  
 General point :-
 java Test
   Even though we leave space after Test it wont work

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
public static void main(String[] args) 

command line arguments is always String form(y don t we use int,short,etc..)
reason is in any java application commonly used object is string object.
Almost 70% in any application we use String object,and 30% we use non String Object.

Reason 2:-
===========
from string to any data type we can change see Example 4
String can converted to int
String can converted to Number type(check programatically durga said verbally giving example 4)
String can converted to boolean type
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
   class Test
  {
   public static void main(String[] args)
   {
    for(int i=0;i<=args.length;i++)
      {
      System.out.println(args[i]);
      }
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test a b c
a
b
c
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test.main(Test.java:7)


EXPLANATION:-
============
 java Test a b c

     for(int i=0;i<=args.length;i++)
      {
      System.out.println(args[i]);
      }

 args.length =3 for this command line argument..
 so for loop changes to 
 
 for(int i=0;i<=3;i++)
      {
      System.out.println(args[i]);
      }

args[0]-->yes--->a
args[1]-->yes--->b
args[2]-->yes--->c
args[3]-->yes---> ????? so RE:AIOBE
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
   class Test
  {
   public static void main(String[] args)
   {
    for(int i=0;i<=args.length;i++)
      {
      System.out.println(args[i]);
      }
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test a b
a
b
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
        at Test.main(Test.java:7)

EXPLANATION:-
============
java Test a b 

     for(int i=0;i<=args.length;i++)
      {
      System.out.println(args[i]);
      }

 args.length =2 for this command line argument..
 so for loop changes to 
 
 for(int i=0;i<=2;i++)
      {
      System.out.println(args[i]);
      }

args[0]-->yes--->a
args[1]-->yes--->b
args[2]-->yes--->????? so RE:AIOBE
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
   class Test
  {
   public static void main(String[] args)
   {
    for(int i=0;i<=args.length;i++)
      {
      System.out.println(args[i]);
      }
  }
}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test a
a
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
        at Test.main(Test.java:7)

EXPLANATION:-
============
java Test a 

     for(int i=0;i<=args.length;i++)
      {
      System.out.println(args[i]);
      }

 args.length 1 = for this command line argument..
 so for loop changes to 
 
 for(int i=0;i<=1;i++)
      {
      System.out.println(args[i]);
      }

args[0]-->yes--->a
args[1]-->yes--->????? so RE:AIOBE
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
for(int i=0;i<args.length;i++)
      {
      System.out.println(args[i]);
      }

 i<args.length repalcing it with < we can avoid it.so be carefull doing command prompt
 By replacing it with we can avoid RE

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
  class Test
  {
   public static void main(String[] args)
   {
        if (false)
        {
			System.out.println(args[0]);
        }
      System.out.println("hello world java");

    }
  }



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello world java

EXPLANATION:-
============
compare this with Example 5 and check here we are tring to print,
then also we not getting any error see.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PAGE 46

PROGRAME=12
=========
case 1:-
========
class Test
{
  public static void main(String[] args)
  {
     String[] argh={"X","Y","Z"};
     args=argh;
     for(String s :args)
      {
       System.out.println(s);
      }
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
X
Y
Z

C:\Users\dell1\Desktop>

case 2:-(See the command line arguments)
========
class Test
{
  public static void main(String[] args)
  {
     String[] argh={"X","Y","Z"};
     args=argh;
     for(String s : args)
      {
       System.out.println(s);
      }
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test A B C D E F G H I
X
Y
Z

case 3 4 5 :-(See the command line arguments)
========
class Test
{
  public static void main(String[] args)
  {
     String[] argh={"X","Y","Z"};
     args=argh;
     for(String s : args)
      {
       System.out.println(s);
      }
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test A B C
X
Y
Z

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test A B
X
Y
Z

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
X
Y
Z

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-see using the local variable of the method
-----same in example 12,..
using main method local varibale inside the arguments.we can use it.

PROGRAME=13
=========
class Test
{
  public static void main(String[] args)
   {
         m1(25);
    }
	static void m1(int x)
		{
	       int y=10;
		   y=x;
		   System.out.println(y);
	    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
25

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
  public static void main(String[] args)
  {
     String[] argh={"X","Y","Z"};
     for(String s : args)
      {
       System.out.println(s);
      }
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test A B C
A
B
C

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test A
A

EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:- Within the main mehtod command line arguments will be avaliable in String form only.
-----  So String related operations we can perform..It performs concatenation.

      To perform number realted opeations use  Integer.parseInt concept as in Example  4

PROGRAME=15
=========
class Test
{
  public static void main(String[] args)
  {
    System.out.println(args[0]+args[1]); 
  }
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test 10 20
1020
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
----- 
usually space is the separator between command line arguments..

To make all space invisible and make it as single argument use "Viany T Shetty"(Example 17)

PROGRAME=16
=========
class Test
{
  public static void main(String[] args)
  {
    System.out.println(args[0]); 
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test Vinay T shetty
Vinay

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:- Use "" to make space invisible in arguments to make it as a single argument.
-----
PROGRAME=17
=========
 class Test
{
  public static void main(String[] args)
  {
    System.out.println(args[0]); 
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test "Viany T Shetty"
Viany T Shetty

C:\Users\dell1\Desktop>

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
