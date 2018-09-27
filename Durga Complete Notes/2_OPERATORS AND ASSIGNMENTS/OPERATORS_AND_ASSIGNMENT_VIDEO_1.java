TOPIC:-OPERATORS AND ASSIGNMENT
--------
VIDEO NO=1
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-
 8,19,20
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
 class Test
{
 private boolean x;	
 public void setx( boolean v)
 {
	 this.x=v;
 }
 public boolean getShetty()
 {
	 return x;
 }
 public static void main(String[] args) 
   {
	  Test t=new Test();
	  t.setx(true);
	  
     boolean d=t.getShetty();
     System.out.println(d);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
 class Test
{
public static void main(String[] args) 
   {
     int x =10;
     int y =++10;
     System.out.println(y);
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unexpected type
     int y =++10;
              ^
  required: variable
  found:    value
1 error
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
     int x =10;
     int y =++x;
     System.out.println(y);
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
11
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
case :-1
========
class Test
{
public static void main(String[] args) 
   {
     int x =10;
     x=11;
     System.out.println(x);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
11

case 2:-
========
Coz for final variable Re-assignment not possible.
 class Test
{
public static void main(String[] args) 
   {
    final int x =10;
     x=11;
     System.out.println(x);
   }
}
 
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: cannot assign a value to final variable x
     x=11;
     ^
1 error
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 class Test
{
public static void main(String[] args) 
   {
    final int x =10;
     ++x;
     System.out.println(x);
   }
}
 


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: cannot assign a value to final variable x
     ++x;
       ^
1 error

EXPLANATION:-
============
For final variables we cannot apply incremnet or decrement operator,.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-Applying increment or decrement operator to a single variable 
-----
PROGRAME=6
=========
=======================================================================
case:-1
-------
 class Test
{
public static void main(String[] args) 
   {
     int x =10;
     ++x;
     System.out.println(x);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
11
=======================================================================
case:-2
-------
class Test
{
public static void main(String[] args) 
   {
     int x =10;
     x++;
     System.out.println(x);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
11

=======================================================================
case:-3
-------
 class Test
{
public static void main(String[] args) 
   {
     int x =10;
     x--;
     System.out.println(x);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
9

=======================================================================
case:-4
-------
 class Test
{
public static void main(String[] args) 
   {
     int x =10;
     --x;
     System.out.println(x);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
9

C:\Users\dell1\Desktop>

=======================================================================

EXPLANATION:-
============
 Pre-increment or Posr-increment both works same to single variable 

 Pre-decrement or Posr-decrement both works same to single variable 
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-Applying increment or decrement operator to assigining variable 
-----
PROGRAME=7
=========
=======================================================================
case:-1
-------
class Test
{
public static void main(String[] args) 
   {
     int x =10;
     System.out.println("The intial value of x="+x);
     int y=++x;
     System.out.println("The final value of x="+x);
     System.out.println("The value of x="+y);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The intial value of x=10
The final value of x=11
The value of x=11
=======================================================================
case:-2
-------
 class Test
{
public static void main(String[] args) 
   {
     int x =10;
     System.out.println("The intial value of x="+x);
     int y=x++;
     System.out.println("The final value of x="+x);
     System.out.println("The value of y="+y);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The intial value of x=10
The final value of x=11
The value of y=10

=======================================================================
case:-3
-------
 class Test
{
public static void main(String[] args) 
   {
     int x =10;
     System.out.println("The intial value of x="+x);
     int y=x--;
     System.out.println("The final value of x="+x);
     System.out.println("The value of y="+y);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The intial value of x=10
The final value of x=9
The value of y=10
=======================================================================
case:-4
-------
class Test
{
public static void main(String[] args) 
   {
     int x =10;
     System.out.println("The intial value of x="+x);
     int y=--x;
     System.out.println("The final value of x="+x);
     System.out.println("The value of y="+y);
   }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The intial value of x=10
The final value of x=9
The value of y=9
=======================================================================
EXPLANATION:-
============
When using 2 variables compulsary it will assign the increment or decrement value
to another valriable,
and @ the end performs the increment or decrement operation to the operated variable..

But in Example 6 it s not lik that just increment or decremet aste..
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
     char x ='A';
      ++x;
     System.out.println(x);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
B

EXPLANATION:-
============
internally the ASCII value of A=65
so ++x means 66,The symbol for ASCII value 66 is B.
See the ASCII values and symbol tables.
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
     byte b=10;
	 b=b+1;
	System.out.println(b);
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: possible lossy conversion from int to byte
         b=b+1;
            ^
1 error

case 2:-
=======
class Test
{
public static void main(String[] args) 
   {
     byte a=10;
    byte b=20;
	byte c=a+b;
	System.out.println(c);
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: incompatible types: possible lossy conversion from int to byte
        byte c=a+b;
                ^
1 error


EXPLANATION:-
============

  case 1:-
  ========
     byte b=10;
	 b=b+1;  // 1 -----> here acts has as integer.
	System.out.println(b);

	case 2:-
	========
    byte a=10;
    byte b=20;
	byte c=a+b;
	System.out.println(c);
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
case 1:-
========
 class Test
{
public static void main(String[] args) 
   {
     byte a=10;
    byte b=20;
	byte c=(byte)a+b;
	System.out.println(c);
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: incompatible types: possible lossy conversion from int to byte
        byte c=(byte)a+b;
                      ^
1 error

case 2:-
========
class Test
{
public static void main(String[] args) 
   {
     byte a=10;
    byte b=20;
	byte c=(byte)(a+b);
	System.out.println(c);
   }
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
30

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
case 1:-
========
 class Test
{
public static void main(String[] args) 
   {
     byte b=10;
	 b=(byte)b+1;
	System.out.println(b);
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: possible lossy conversion from int to byte
         b=(byte)b+1;
                  ^
1 error

case 2:-
========
 class Test
{
public static void main(String[] args) 
   {
     byte b=10;
	 b=(byte)(b+1);
	System.out.println(b);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
11

C:\Users\dell1\Desktop>

case 3:- Using int see 
======== 
max ( int, type A,type B)
 
  (int ,byte,int)
   ===>So int only.

  class Test
{
public static void main(String[] args) 
   {
     byte b=10;
	 int x=(byte)b+1;
	System.out.println("The value of x ="+x);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The value of x =11

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:- Bracket difference in all above cases
-----
PROGRAME=12
=========
  class Test
{
public static void main(String[] args) 
   {
     int b=100;
	 b=(int)b+1;
	System.out.println(b);
   }
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
101
EXPLANATION:-
============
Page :-49


 int b=100;
	 b=(int)b+1; //--->not using bracket.

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
   class Test
{
public static void main(String[] args) 
   {
     byte b=100;
	 b=(b+1);
	System.out.println(b);
   }
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: incompatible types: possible lossy conversion from int to byte
         b=(b+1);
             ^
1 error
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

System.out.println('a' + 'b'); // output : 195  ===> char+char=int

System.out.println('a' + 1); // output : 98 =======>char+int=int

System.out.println('a' + 1.2); // output : 98.2======>char+double=double

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-Page 51
-----
PROGRAME=15
=========
  class Test
{
public static void main(String[] args) 
   {
	System.out.println(10/0);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:5)

EXPLANATION:-
============
 	System.out.println(10/0);
	{(int)/(int)}===>int type is the result
    max(int ,type A,type B)

 In integral arithmetic (byte , int , short , long) there is no way to represents
infinity , if infinity is the result we will get the ArithmeticException / by zero
System.out.println(10/0); // output RE : ArithmeticException / by zero


C:\Users\dell1\Desktop>javap java.lang.Integer
Compiled from "Integer.java"
public final class java.lang.Integer extends java.lang.Number implements java.lang.Comparable<java.lang.Integer> 
	{
	
	}

 If we open this wrapper class Integer there is no such thing as constant in Integer class.
 see using 
 javap java.lang.Integer

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-Page-51
-----
PROGRAME=16
=========
 Case 1:-
 =======
  class Test
{
public static void main(String[] args) 
   {
	System.out.println(10/0.0);
   }
}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Infinity

 Case 2:- -ve infinity see the output 
 =======
  class Test
{
public static void main(String[] args) 
   {
	System.out.println(-10/0.0);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
-Infinity


EXPLANATION:-
============
 	System.out.println(10/0.0);
	max(int ,type A,type B)
 {(int)/(double)}===>double type is the result

But in floating point arithmetic(float , double) there is a way represents infinity.
System.out.println(10/0.0); // output : infinity
 
 For this Float and Double classes contains the following constant
1)POSITIVE_INFINITY; (May be variable check in src folder)
2)NEGATIVE_INFINITY  (May be variable check in src folder)
 
 Hence even though result is infinnity,
 we wont get any ArithmeticException in floating point Arithmetic

C:\Users\dell1\Desktop>javap java.lang.Double

Compiled from "Double.java"
public final class java.lang.Double extends java
  public static final double POSITIVE_INFINITY;
  public static final double NEGATIVE_INFINITY;
 
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
  class Test
{
public static void main(String[] args) 
   {
	System.out.println(0/0);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:5)

EXPLANATION:-
============
NaN(Not a Number) in integral arithmetic (byte , short , int , long) there is no
way to represent undefine the results. Hence the result is undefined we will get
ArithmericException in integral arithmetic
System.out.println(0/0); // output RE : ArithmeticException / by zero


Check it in 

javap java.lang.Integer

C:\Users\dell1\Desktop>javap java.lang.Integer
Compiled from "Integer.java"

 We won t find any NaN constant

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
	System.out.println(0.0/0);
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
NaN

EXPLANATION:-
============
 
C:\Users\dell1\Desktop>javap java.lang.Double
Compiled from "Double.java"

public static final double NaN;


But floating point arithmetic (float , double) there is a way to represents
undefined the results .
For the Float , Double classes contains a constant NaN , Hence the result is
undefined we won t get ArithmeticException in floating point arithmetics.

 We will get NaN 

 NaN means Not a Number.

 Important observation:-
 ======================
See for -ve  input we won t get -ve NaN we ll get samenormal NaN.

System.out.println(0.0/0.0); // output : NaN
System.out.println(0.0/0); // output : NaN
System.out.println(-0/0.0); // output : NaN


System.out.println(-0.0/0.0); // output : NaN(valid)  
-ve -NaN (invalid)



System.out.println(10/0); --->RE : AE / by Zero

System.out.println(0.0/0.0);  Infinity

System.out.println(0/0); ;---->RE :AE / by zero

System.out.println(0/0); -----> NaN

***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:- Some important Observation in variable assignment.
-----  Division of variable by assigining it..
      And check see using class name we are acessing it.
PROGRAME=19
=========
 class Test
{
	static int vSIZE=94;
 static final int x=100/Test.vSIZE; //--->Observe this
public static void main(String[] args) 
  { a
    System.out.println(x);	
  }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
1

 .class file
 ============
import java.io.PrintStream;

class Test
{

    static int vSIZE;
    static final int x;

    Test()
    {
    }

    public static void main(String args[])
    {
        System.out.println(x);
    }

    static 
    {
        vSIZE = 94;
        x = 100 / vSIZE;
    }
}



 in double class  file variable intialization in which divison has taken place.
     
	 public static final int SIZE = 64;
     public static final int BYTES = SIZE / Byte.SIZE;
EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:- 1:27:00(Video 1)
-----  Page 66

PROGRAME=20
=========
System.out.println(10 != Float.NaN ); //true
System.out.println(Float.NaN != Float.NaN ); //true


 Only for these 2 combinations it returns true..
rest all combinations false.
 
 Combination 1:-
 EX:-      
           that is for any number 
           int x=10;
           x !=Float.NaN ====>true

 Combination 2:-
 EX:-      
           Float.NaN !=Float.NaN ====>true

 
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-For any x value including NaN the following expressioin returns false.
-----
 	System.out.println(10<Float.NaN);
	System.out.println(10<=Float.NaN);
	System.out.println(10>Float.NaN);
	System.out.println(10>=Float.NaN);
	System.out.println(10==Float.NaN);
	System.out.println(Float.NaN==Float.NaN);


For any x value including NaN the following expression returns true
int x=10;
x!=NaN
NaN!=NaN
 	System.out.println(10!=Float.NaN);
	System.out.println(Float.NaN!=Float.NaN);

PROGRAME=21
=========
 //ctrl +j to duplicate the line.


class Test 
{
	public static void main(String[] args)
	{
	System.out.println(10<Float.NaN);
	System.out.println(10<=Float.NaN);
	System.out.println(10>Float.NaN);
	System.out.println(10>=Float.NaN);
	System.out.println(10==Float.NaN);
	System.out.println(Float.NaN==Float.NaN);
	System.out.println(10!=Float.NaN);
	System.out.println(Float.NaN!=Float.NaN);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
false
false
false
false
false
false
true
true

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
Arithmetic Exception:-Page 66.

It occurs only in integral arithmetic but not in floating point arithmetic.coz we cannot specify
using infinity in this case

In floating point arithmetic we never gonna get any ArithmeticException coz if the result is infinty
it shows as Infinity only

The only operations which cause ArithmeticException are : ' / ' and ' % '..
any other operator we won t get ArithmeticException..


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
