TOPIC:-LAUNGAGE FUNDAMENTALS
--------
VIDEO NO=6
-----------
NUMBER OF PICTURES=1
------------------
I:\JAVA NOTES\DURGA JAVA NOTES\LAUNGAGE FUNDAMENTALS\LAUNGAGE FUNDAMENTALS VIDEO 6
 LAUNGAGE_FUNDAMENTALS_6.png

VIDEO COMPLETED=YES
-----------------
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
int x=10;
int y=11;
int z=12;
int a=13;
.
.
.
100.. values

so readibility and dumb programming practice so we go for array concept.
int [] x=new int[1000];
see the pic  LAUNGAGE_FUNDAMENTALS_6.png

I:\JAVA NOTES\DURGA JAVA NOTES\LAUNGAGE FUNDAMENTALS\LAUNGAGE FUNDAMENTALS VIDEO 6



***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
At the time of declaration we can't specify the size otherwise we will get compile time
error.
  Ex:- int[5] a;//invalid


Size is required @ the time of creation.we should write @ that time only.

Example:

int[] a;//valid

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
int [] a,b;
int [] a[]
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
command prompt 
goes to end begining see
 
  cd ../..
  
C:\Users\dell1>cd ../..

C:\>
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:- Command line Arguments 
-----
PROGRAME=5
=========
int [] =new int [0];---->valid

 case 1:- proof its legal to have an array with size 0 in java.(case 1)
 --------
class Test {

	public static void main(String[] args) 
	{
	System.out.println(args.length);	
	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0

C:\Users\dell1\Desktop>

case 2:-
========
 class Test {

	public static void main(String[] args) 
	{
	System.out.println(args.length);	
	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test A B C
3

C:\Users\dell1\Desktop>

EXPLANATION:-
============
Its legal to have an array with size 0 in java.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
int [] x=new int[-3];

There is no CE error,bcoz
 1)compiler is always checking wheahter we are adding size or not @ time of declaration-->(int[-3]   inside the bracket)
 2)that size is of int type or not (int [] x=new int[-3];   --> -3 is of int type)

 if both got validated compiler wont create any error...
 
PROGRAME=6
=========
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
To specify aarray size in java only
byte
short
char
int are allowed
other than that if we are trying to apply any other data Type we ll get CE.
see automatic type conversion in notes
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:- vvv important case...
-----  5----->* important case..

PROGRAME=8
=========
 class Test
{
public static void main(String[] args)
 {
      int [] []a,b[][],c[];
      a=new int[2][];
	  System.out.println(a);

	  b=new int[3][][][];
      System.out.println(b);
      
	  c=new int [2][][];
      System.out.println(c);
 }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[[I@2a139a55
[[[[I@15db9742
[[[I@6d06d69c

C:\Users\dell1\Desktop>

EXPLANATION:-
============
After creating an array in a single line,
how to intialize value to those...


***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-We can assign null values to array also.
-----
PROGRAME=9
=========
class Test
{
public static void main(String[] args)
 {
     int [] x=null;
	 System.out.println(x);
 }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
null

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-Using null and doing any operation we ll get NullPointerException.
-----
PROGRAME=10
=========
class Test
{
public static void main(String[] args)
 {
     int [] x=null;
	 System.out.println(x);
	System.out.println(x.getClass().getName());
 }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
null
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:7)

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
class Test
{
public static void main(String[] args)
 {
     int [] x=new int [0];
	 System.out.println(x);
	System.out.println(x.getClass().getName());
 }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55
[I

EXPLANATION:-
============
int [] x=new int [0];   ----> i guess only one box is created.diagramatic approach.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
 class Test
{
public static void main(String[] args)
 {
     int [] x=new int [null];
	 System.out.println(x);
 }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: <null> cannot be converted to int
     int [] x=new int [null];
                       ^
1 error

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-NO CE coz compiler  job is to check an int value is specified or not.[in argument]
----- But @ run time JVM is going to rise an exception,saying i cannot assign -ve value to that.

PROGRAME=13
=========
class Test
{
public static void main(String[] args)
 {
     int [] x=new int [-3];
	 System.out.println(x);
 }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.NegativeArraySizeException
        at Test.main(Test.java:5)

C:\Users\dell1\Desktop>

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
     int [] x=new int ['a'];
	 System.out.println(x);
 }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55

C:\Users\dell1\Desktop>
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
public static void main(String[] args)
 {
     int [] x=new int ['a'];
	 System.out.println(x);

      byte b=10;
	 int [] x1=new int [b];
	 System.out.println(x1);

      short c=11;
	 int [] x2=new int [c];
	 System.out.println(x2);

 }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55
[I@15db9742
[I@6d06d69c
EXPLANATION:-
============
from chart it shows that we can assign 
byte
short
char  values to int..
so we can assign byte,short,char values to int type array.
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-If we are trying to specify any other data type we ll get CE..
-----only we can specify byte,short,char, to ------------->int
PROGRAME=16
=========
class Test
{
public static void main(String[] args)
 {   
	long l=10l;
	int [] x=new int [l];
	System.out.println(x);
}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: possible lossy conversion from long to int
        int [] x=new int [l];
                          ^
1 error

EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-Maximum size we can specify in an array is the int maximum in range..
-----
PROGRAME=17
=========
class Test
{
public static void main(String[] args)
 {   
	int [] x=new int [2147483647];
	System.out.println();
}
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limi
        at Test.main(Test.java:5)

C:\Users\dell1\Desktop>

EXPLANATION:-
============
Important note Point:-
@ Compile time compiler is only checking for int value,so its there within the range,no problem.

But @ run time JVM cant allocate those much memory so we ll get RE...
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
class Test
{
public static void main(String[] args)
 {   
	int [] x=new int [2147483648];
	System.out.println();
}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: integer number too large: 2147483648
        int [] x=new int [2147483648];
                          ^
1 error

EXPLANATION:- @ compile time only we are getting the error see this and EX--18 and 17.
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
