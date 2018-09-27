TOPIC:-LAUNGAGE FUNDAMENTALS
--------
VIDEO NO=4
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
============================================================
Doubt section 

Doubt:-1
--------
Page 14:- Laungage Fundamentals
Example:
int x=10;
int y=010;
int z=0x10;
System.out.println(x+"----"+y+"----"+z); //10----8----16
By default every integral literal is int type but we can specify explicitly as long type by
suffixing with small "l" (or) capital "L".


doubt cleared i guess just use long data type i feel.
===========================================================

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============

Decimal literals: Allowed digits are 0 to 9.

Decimal literals:(Base 10)

Example: int x=10;
             10 is decimal form



Octal literals: Allowed digits are 0 to 7. Literal value should be prefixed with zero.

Octal literals:(Base 8)

Example: int x=010;

 its 0 but not alphabit.

 int x=10;-->decimal form

 int x=010;-->Octal form(Adding 0 before )


 octal(010) and decimal(10) are both different. 


Hexa Decimal literals:

Hexa Decimal literals:(Base -16)

The allowed digits are 0 to 9, A to F(mistake in notes)..(both lower case and upper case we can use)
 
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
class Test {

	public static void main(String[] args) 
	{
		int x =10; //decimal
		System.out.println(x);
		
		int y=010;//octal
		System.out.println(y);
		
		
		
		//Hexadecimal(can use both upper case and lower case value won t change both x and A-F)

		int z=0x10F;//Hexadecimal    //271
		System.out.println(z);
		
		int a=0X10f;//Hexadecimal    //271
        System.out.println(a);
	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
8
271
271

EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class Test {

	public static void main(String[] args) 
	{
				
		int y=0108;//octal allowed only 0-7
		System.out.println(y);
	}

}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: integer number too large: 0108
                int y=0108;
                      ^
1 error


int x=0786; -->(invalid if starting 0 means its octal.
                 In octal allowed digits are 0-7,but 8 is not allowed)
				 -

EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
class Test {

	public static void main(String[] args) 
	{		
		//Hexadecimal allows frist letter(0x) and alphabit a-F(A-F)  Lowecase or UpperCase )

		int a=0X10g;
		System.out.println(a);
	}

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: ';' expected
                int a=0X10g;
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
class Test {

	public static void main(String[] args) 
	{		
		//Hexadecimal allows frist letter(0x) and alphabit a-F(A-F)  Lowecase or UpperCase )

		int a=0X1G0;
		System.out.println(a);
	}

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: ';' expected
                int a=0X1G0;
                         ^
1 error

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:- Important see
-----  Even though programmer specify values in Octal and Hexadecimal 
      JVM always prints the results in Decimal form only..

PROGRAME=6
=========
class Test {

	public static void main(String[] args) 
	{		
 	 int x=10;
     int y=010;
     int z=0x10;
     System.out.println(x+"----"+y+"----"+z); //10----8----16
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10----8----16


Hexadecimal to Decimal conversion proof

int z=0x10;

 (0x10)    ----> (0*16)^0+(1*16)^1 =16
       16

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:- We can use capital "L" or small "l" both are same.
-----
PROGRAME=7
=========
 class Test {

	public static void main(String[] args) 
	{		
 	 long x=10l;
     System.out.println(x);

	 long x1=10L;
     System.out.println(x1);

	 
     long y=010l;
     System.out.println(y);

	 long y1=010L;
     System.out.println(y1);
     
	 
   	 long z=0x10l;
     System.out.println(z); 

     long z1=0x10L;
     System.out.println(z1); 

	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
10
8
8
16
16

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:- using "L"or  "l" is Optional
-----
PROGRAME=8
=========
class Test {

	public static void main(String[] args) 
	{		
 	 long x=10l;
     System.out.println(x);

	 long x1=10;
     System.out.println(x1);

	 
     long y=010l;
     System.out.println(y);

	 long y1=010;
     System.out.println(y1);
     
	 
   	 long z=0x10l;
     System.out.println(z); 

     long z1=0x10;
     System.out.println(z1); 
	 System.out.println("hello"); 

	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
10
8
8
16
16
hello

EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Every Point values is of Double type (By default in java)
ex:- 123.456
 
PROGRAME=9
=========
class Test {

	public static void main(String[] args) 
	{		
 	 double x=123.456;
     System.out.println(x);

	 double x1=000000.456;
     System.out.println(x1);
   }

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
123.456
0.456

C:\Users\dell1\Desktop>


EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-Every Point values is of Double type (By default in java)
-----   
       ex:- 123.456(Point value)
	    
      double =8 bytes
      float=4 bytes

	  so double is higher so if we are assiging double values to float we ll get CE.


class Test {

	public static void main(String[] args) 
	{		
     float x=123.456;
     System.out.println(x);
	}

}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from double to float
     float x=123.456;
             ^
1 error

C:\Users\dell1\Desktop>



PROGRAME=10
=========
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:- using D or d or without D is optional
-----
PROGRAME=11
=========
class Test {

	public static void main(String[] args) 
	{		
     double x=123.456D;
     System.out.println(x);

	 double x1=785.456d;
     System.out.println(x1);

     double x2=253.456;
     System.out.println(x2);


   }

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
123.456
785.456
253.456

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:- compulsary we should use "F" or "f" to use floating point values
-----
PROGRAME=12
=========
class Test {

	public static void main(String[] args) 
	{		
      float x=123.456F;
      System.out.println(x);

   	 float x1=785.456f;
     System.out.println(x1);

}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
123.456
785.456

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========

public class Test {

	public static void main(String[] args) 
	{
		float f=123.456f;
		System.out.println(f);
		
		float f1=789.456F;
		System.out.println(f1);
		
	
	}

}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
123.456
789.456

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
We cannot apply Octal and hexadecimal Literal Concept to double and float 
These concept is not applicable to (floating point data types)

only decimal form we can apply to double and float.

EXPLANATION:- Typical Example(very typical Example)
============
 
 		double d=0123.456;   // 
         It starts with 0 so we are thinking its octal but its not octal its decimal only.

public class Test {

	public static void main(String[] args) 
	{
		double d=0123.456;
		System.out.println(d);
	}

}

 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
123.456

C:\Users\dell1\Desktop>

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
 
public class Test {

	public static void main(String[] args) 
	{
		double d=0x123.456;
		System.out.println(d);
		
		
	
	}

}

 
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: malformed floating point literal
                double d=0x123.456;
                         ^
1 error

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
class Test
{
public static void main(String[] args)
 {
   double d=000123.456; //-->Its not octal form its decimnal form only.
   System.out.println(d);
 }
}

123.456

EXPLANATION:-
============
   double d=000123.456;
 000-->Ignored.


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
	double d =0786;
	System.out.println(d);
}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: integer number too large: 0786
        double d =0786;
                  ^
1 error

EXPLANATION:-
============
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
	double d =1.23e3;
	System.out.println(d);
}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
1230.0

C:\Users\dell1\Desktop>

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
