 TOPIC:-LAUNGAGE FUNDAMENTALS
--------
VIDEO NO=1,2,3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
----------------->START OF EXAMPLES<---------------------------
 Doubt:-
 ======
 How to convert to 2s compliment form in byte maximum value is 127
 minimun value is ..? 

===============================================================================================
 class Test
{
public static void main(String[] args) 
   {
    int x=10;	
   }
}


Test--->class name
main--->method name
String---->predefined java class name(class name only)
args---->name of th array
x-->variable name
========================================================================================
 class Test
{
public static void main(String[] _args) 
   {
    int x=10;	
    System.out.println(x);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10

C:\Users\dell1\Desktop>
--------------------------------------------
class Test
{
public static void _123main(String[] _args) 
   {
    int x=10;	
    System.out.println(x);
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\Users\dell1\Desktop>

Note:- NO compile time error.
-------------------------------------------------------------------------
 class Test
{
public static void main(Stri_ng[] _args) 
   {
    int x=10;	
    System.out.println(x);
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: cannot find symbol
public static void main(Stri_ng[] _args)
                        ^
  symbol:   class Stri_ng
  location: class Test
1 error

C:\Users\dell1\Desktop>

Note:-we cannot change predefined java class name if its used as identifier.
if we use that then we ll get CE.
 ---------------------------------------------------------------------------
 Note:- We cannot change used predefined class name using rule of identifier.
 we ll get CE...see the error CFS class String
 class Test
{
public static void main(Stri_ng[] args) 
   {
    int x=10;	
    System.out.println(x);
   }

C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: cannot find symbol
public static void main(Stri_ng[] args)
                        ^
  symbol:   class Stri_ng
  location: class Test
1 error

C:\Users\dell1\Desktop>

}
 important observation
----------------------------------------
NOte:- we can change args see

class Test
{
public static void main(String[] _123$args) 
   {
    int x=10;	
    System.out.println(x);
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10

========================================================================================

 ===============================================================================================
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
Rule 5: There is no length limit for java identifiers but it is not recommended to take
more than 15 lengths.

 
public class Test {

	public static void main(String[] args) {
 int xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx=10;
 System.out.println(xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
	}

}


 All predefined classes and interfaces will come in Red colour.

String
Runnable

----------------------------------------------
reserved words in Blue colour
int,public,static,
----------------------------------------------- 
 which of the following are java reserved words
 public--->valid
 static--->valid
 void--->valid
 main--->invalid(name of the method)
 String--->invalid(Predefined class)
 args--->name of variable
------------------------------------------------


args-->not reserved
main--->not reserved
 
 We can change args but we cannot change main find the internal reason. 
 
 public class Test {

	public static void main(String[] ar______gs) {
 int xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx=10;
 System.out.println(xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx);
	}

}

 valid/invalid Identifiers.
 ===========================
 Integer--->valid
 Int--->valid
 int --->reserved words

Reserved words
--->keywords(if the reserved word is associated with functionality is called reserved word)
----->Reserved Literals(if the reserved words is associated to represent only values but not functionality )


Primitive data Types--->Numeric Data Type
                      --->Non-numeric Data Types(char and Boolean) 

Non numeric data types is again divided into 2 types see.(char and Boolean)
 

 signed data Types.(we can use both +ve and -ve numbers)
 int x=10;---->(valid)
 int x=-10;---->(valid)

boolean x=-true;---->(Invalid)
boolean x=+true;---->(Invalid)

 char c=-a;---->(Invalid)
 char c=+a;---->(Invalid)


Excpect boolean and char remaning data types are considered are signed data 
Bcoz we can represent both +ve and -ve values.

 1 byte =8 bits

 Msb-->Most Significant Bit
 0---> means +ve in msb
 1---> means -ve in msb
 
 where byte is used is in hand written notes...
 diagram also.
=====================================================================
 byte -->8 bits
 1--> reserved for sign 
 remaining 7 bits if we use..


About Maximum value:-
 
 Positive numbers will be represented directly in the memory.
 
 About minimun value 
 

 Note:- 1)we cannot fill all 7 blocks with with 0,coz it will be 0.
 
 
   But if we fill with -1 number in 7 blocks.It will be represented in 2s compliment form in the
   memory and after its converted it s value is 128,frist bit is 1 so -ve.so -128..
 =====================================================================

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
	byte x=127;
	System.out.println(x);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
127

C:\Users\dell1\Desktop>


 class Test
{
	public static void main(String[] args)
	{
	byte x=-128;
	System.out.println(x);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
-128

C:\Users\dell1\Desktop>

 
 class Test
{
	public static void main(String[] args)
	{
	byte x=-129;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from int to byte
        byte x=-129;
               ^
1 error

C:\Users\dell1\Desktop>

 class Test
{
	public static void main(String[] args)
	{
	byte x=a;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: cannot find symbol
        byte x=a;
               ^
  symbol:   variable a
  location: class Test
1 error

   class Test
{
	public static void main(String[] args)
	{
	byte x="vinay";
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: String cannot be converted to byte
        byte x="vinay";
               ^
1 error

C:\Users\dell1\Desktop>


 class Test
{
	public static void main(String[] args)
	{
	byte x=10.5;
	System.out.println(x);
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from double to byte
        byte x=10.5;
               ^
1 error


 byte b=10;
 byte b=127;



 byte b=128;--->PLP found int require byte.
 byte b=10.5;--->PLP found double require byte.


byte b=false;---->ICT found boolean require byte.
byte b="vinay";---->ICT found java.lang.String require byte.





 short
 ====
 class Test
{
	public static void main(String[] args)
	{
	short  x=10.5;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from double to short
        short  x=10.5;
                 ^
1 error

C:\Users\dell1\Desktop>
 
   short s=32767;---->(valid)



 class Test
{
	public static void main(String[] args)
	{
	short  x=32768;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from int to short
        short  x=32768;
                 ^
1 error

  class Test
{
	public static void main(String[] args)
	{
	short  x="vinay";
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: String cannot be converted to short
        short  x="vinay";
                 ^
1 error

C:\Users\dell1\Desktop>

 class Test
{
	public static void main(String[] args)
	{
	short  x=true;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: boolean cannot be converted to short
        short  x=true;
                 ^
1 error

C:\Users\dell1\Desktop>


   
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:- How to set path temporarly
-----
set path=C:\Program Files\Java\jdk1.8.0_51\bin

java was introduced in 1995 @ that time 16 bit processor(8085) is very popular.
16 bit means instruction will be represented .

 A 16-bit microprocessor can process data and memory addresses that are represented by 16 bits. 
 bus : 
 indicates the number of wires in the bus.

PROGRAME=3
=========
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
  Important. *********

NOTE:-Every no in java without any decimal point is considered as integer only.
----- so this-no 2147483648 is considered as integer only but its too large(out of int value range). 
      so we ll get this-CE

PROGRAME=4
=========
class Test
{
	public static void main(String[] args)
	{
	int  x=2147483648;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: integer number too large: 2147483648
        int  x=2147483648;
               ^
1 error

 --------------------------------------------
 Note:- long value how u gonna assign to int..compiler is gonna treat as ICT
 class Test
{
	public static void main(String[] args)
	{
	int  x=2147483648l;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from long to int
        int  x=2147483648l;
               ^
1 error

C:\Users\dell1\Desktop>

  using capital L see for Long 

 class Test
{
	public static void main(String[] args)
	{
	int  x=2147483648L;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from long to int
        int  x=2147483648L;
               ^
1 error

C:\Users\dell1\Desktop>


 class Test
{
	public static void main(String[] args)
	{
	int  x=true;
	System.out.println(x);
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: boolean cannot be converted to int
        int  x=true;
               ^
1 error

C:\Users\dell1\Desktop>



long
====
long l=f.length();
 length();--->used to calculate the lines or charcter in a file
 length range may exceed int value so it s return type is long.


 float
 =====
 10/3 example

precision.---> accuracy

single precission---->less accuracy(less decimal points)
double precission----->More accuracy..(more decimal points)


boolean data type:
Size: Not applicable (virtual machine dependent)(may be 1 byte or more.)

 class Test
{
	public static void main(String[] args)
	{
	boolean  x=0;
	System.out.println(x);
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: int cannot be converted to boolean
        boolean  x=0;
                   ^
1 error

C:\Users\dell1\Desktop>


Important:-
===========
 if its not a datatype we ll get CFS error.
 class Test
{
	public static void main(String[] args)
	{
	boolean  x=True;
	System.out.println(x);
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: cannot find symbol
        boolean  x=True;
                   ^
  symbol:   variable True
  location: class Test
1 error

C:\Users\dell1\Desktop>

-------------------------------
class Test
{
	public static void main(String[] args)
	{
	boolean  x="True";
	System.out.println(x);
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: String cannot be converted to boolean
        boolean  x="True";
                   ^
1 error

C:\Users\dell1\Desktop>

 
 class Test
{
	public static void main(String[] args)
	{
	boolean  x=false;
	System.out.println(x);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
false

C:\Users\dell1\Desktop>

----------------------------
Important Observation

class Test
{
	public static void main(String[] args)
	{
	boolean  x=null;
	System.out.println(x);
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: <null> cannot be converted to boolean
        boolean  x=null;
                   ^
1 error

C:\Users\dell1\Desktop>

 
public class Test {

	public static void main(String[] args) 
	{
       int x=10;
      if (x)
      {
		System.out.println("hi");
	  } 
      else
      {
         System.out.println("hello");
	  }
	}

}


C:\Users\dell1\Desktop\Ec\Experement\src>javac Test.java
Test.java:7: error: incompatible types: int cannot be converted to boolean
      if (x)
          ^
1 error

C:\Users\dell1\Desktop\Ec\Experement\src>

EXPLANATION:-
============ 
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----


PROGRAME=5
=========

Video :-2(22:46)
 Except Boolean and char all remaining data types are considered as signed data types
because we can represent both "+ve" and"-ve" numbers.

But for char we can use all +ve numbers from 0 to 65535 as its range is within that only.

 valid cases:-
 case 1:-
 ---------
 class Test
{
public static void main(String[] args)
{
	char c='a';
	System.out.println(c);
	
	char c1=+'w';
	System.out.println(c1);
	
	char c3=+152;
	System.out.println(c3);
	
}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
a
w
?

 case 2:-
 -------
 class Test
{
public static void main(String[] args)
{
	char c=0;
	System.out.println(c);
}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test


C:\Users\dell1\Desktop>


invalid case:-
case 1:-
-------
 class Test
{
public static void main(String[] args)
{
	char c=-'a';
	System.out.println(c);
	
	
}
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from int to char
        char c=-'a';
               ^
1 error

case 2:-
--------
 class Test
{
public static void main(String[] args)
{
	char c=-97;
	System.out.println(c);
}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from int to char
        char c=-97;
               ^
1 error

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
 It comes under the category of we have to apply max(int,type a ,type b)
PROGRAME=6
=========
 class Test 
{
  public static void main(java.lang.String args[])
	  {
           char x=65535+'a';
           System.out.println(x);
	  }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from int to char
           char x=65535+'a';
                       ^
1 error

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-Type casting problem
----- See we have to apply max(int,type a ,type b)
      internal type casting won t happen.
	  like incrememnt and decrement.

     Manually we have to apply cast,coz it s of the form max(int,type a ,type b)

PROGRAME=7
=========
 class Test 
{
  public static void main(java.lang.String args[])
	  {
           char x=(char)(65535+'a');
           System.out.println(x);
	  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
`

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
 Internal type casting is done even though we are exeeding the char range.
 By using increment operator

PROGRAME=8
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

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test


C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
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
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
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
