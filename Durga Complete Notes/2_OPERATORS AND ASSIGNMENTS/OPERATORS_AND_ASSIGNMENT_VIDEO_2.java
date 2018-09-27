TOPIC:-OPERATOR AND ASSIGNMETNS 
--------
VIDEO NO=2
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-Programe written bt a developer is called source code.
-----
In java does nt support operator overloading concept.
only few exceptional cases we can say java suppports operator overloading.
That operator is +

PROGRAME=1
=========
String a="durga";
int b=10 , c=20 , d=30 ;
System.out.println(a+b+c+d);
 
 Important Point:-   a+b+c+d  --->3 operator
 If more than one operator we use it will be evaluated based on precedence it
 will be operated.
------> High precedence operator will be evaluated frist and, 
------> The low precedence operator will be operated next.

Example:-1

String a="durga";
int b=10 , c=20 , d=30 ;
System.out.println(a+b+c+d);
  
  *****
 IF ALL OPERATOR HAVE SAME PRECEDENCE ORDER OF EVALUATION IS ALWAYS FROM LEFT TO RIGHT
  *****
  
  a+b+c+d ====>All operator is having same precedence.

 If atleast one argument is string it acts as String only..


case 1:-
 Working:-
 String a="durga";
int b=10 , c=20 , d=30 ;

System.out.println(a+b+c+d);
           
       Step 1:-       a+b
			         "durga"+10
					  "durga10"

      Step 2:-        a+b+c  
	                  "durga10"+20
					    "durga1020"
      
	  Step 3:-        a+b+c+d
	                  "durga1020"+30
                       "durga102030"


case 2:- carefull case see it acts as addition till it gets String.

 String a="durga";
int b=10 , c=20 , d=30 ;
System.out.println(b+c+d+a); //-->"durga60"
  Working:-
  
	 Step 1:-       b+c
			         10+20
                       30

      Step 2:-        b+c+d  
	                  30+30
					  60
      
	  Step 3:-        b+c+d+a
	                  60+"durga"
					  "60durga"

 System.out.println(b+c+a+d); "30durga30"

System.out.println(b+a+c+d);   "10durga2030"
EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
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


***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
Relational operator

System.out.println('a' > 100.5); //false
coz char will be promoted to number..

System.out.println('a'<10); //false
=============================================================================
System.out.println('a'< 97.6); //true ===>(97.0 < 97.6)   
see how it will become 97.0.It should be 97 know or durga told wrong see using .class file.

Programe:-
 class Test 
{
	public static void main(String[] args)
	{
       System.out.println('a'<98.6);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true

.class file
 Try different de-compiler not much info so durga telling it s converted to 97.0 may be just a guess.

import java.io.PrintStream;

class Test
{

    Test()
    {
    }

    public static void main(String args[])
    {
        System.out.println(true);
    }
}



 THE ABOVE DOUBT IS CLEARED READ THIS POINT(35:00---37:00)
  NOTE:-
  =====
   System.out.println('a' == 97.0 )
                      
					 (97.0 ===97.0)  ==>CONVERSION

   WHEN EVER WE ARE COMPARING TO SMALLER TYPE TO BIGGER TYPE AUTOMATICALLY SMALLER TYPE WILL BE 
   CONVERTED TO BIGGER TYPE (DURGA POINT)
   OR WHEN WE USE RELATIONAL OPERATOER(VINAY POINT)

=============================================================================
System.out.println('a' > 'A'); //true

===============================================================================
System.out.println(true >false); CE
 
We cannot apply relational operator for boolean data types.
class Test 
{
	public static void main(String[] args)
	{
       System.out.println(true<false);
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: bad operand types for binary operator '<'
       System.out.println(true<false);
                              ^
  first type:  boolean
  second type: boolean
1 error

C:\Users\dell1\Desktop>

 ===============================================================================
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-We cannot appply relational operator to object reference
-----
PROGRAME=4
=========
 class Test 
{
	public static void main(String[] args)
	{   Test t=new Test();
	    Exam e=new Exam();
       System.out.println(t<e);
	}
}

class Exam
{
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: bad operand types for binary operator '<'
       System.out.println(t<e);
                           ^
  first type:  Test
  second type: Exam
1 error

EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:- Including Object type
-----
PROGRAME=5
=========
class Test 
{
	public static void main(String[] args)
	{   Test t=new Test();
	    Exam e=new Exam();
		Object o=new Object();
       System.out.println(o>e);
	}
}

class Exam
{	`
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: bad operand types for binary operator '>'
       System.out.println(o>e);
                           ^
  first type:  Object
  second type: Exam
1 error

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:- We cannot apply relational operator concept to any object type 
-----
PROGRAME=6
=========
class Test 
{
	public static void main(String[] args)
	{  String v="viany";
	   String d="durga";
       System.out.println(v>d);
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: bad operand types for binary operator '>'
       System.out.println(v>d);
                           ^
  first type:  String
  second type: String
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
 class Test 
{
	public static void main(String[] args)
	{ 
       System.out.println(10<20<30);
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: bad operand types for binary operator '<'
       System.out.println(10<20<30);
                               ^
  first type:  boolean
  second type: int
1 error

EXPLANATION:- Meanning full CE error see it s showoing int.
============
 System.out.println(10<20<30);

 Step:-1
         10<20
		 true

 Step:-2  
         true<30
		 CE:-

 Durga Point:-Nesting of relational operator not allowed (see Example 8)
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
case 1:- Leaving that bracket (10<20)<30
========
class Test 
{
	public static void main(String[] args)
	{ 
       System.out.println((10<20)<30);
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: bad operand types for binary operator '<'
       System.out.println((10<20)<30);
                                 ^
  first type:  boolean
  second type: int
1 error


case 2:- Just see used that bracket.
========
class Test 
{
	public static void main(String[] args)
	{ 
       System.out.println((10<20)<(30));
	}
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: bad operand types for binary operator '<'
       System.out.println((10<20)<(30));
                                 ^
  first type:  boolean
  second type: int
1 error

case 3:-Used 2 condition see
======== Nesting of relational operator is not allowed.
         otherwise we ll get CE
 
 class Test 
{
	public static void main(String[] args)
	{ 
       System.out.println((10<20)<(30>20));
	}
}




C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: bad operand types for binary operator '<'
       System.out.println((10<20)<(30>20));
                                 ^
  first type:  boolean
  second type: boolean
1 error

EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
 System.out.println('a' == 97.0 )
 NOTE:-
  =====
   System.out.println('a' == 97.0 )
                     (97.0 ===97.0)  ==>CONVERSION

   WHEN EVER WE ARE COMPARING TO SMALLER TYPE TO BIGGER TYPE AUTOMATICALLY SMALLER TYPE WILL BE 
   CONVERTED TO BIGGER TYPE (DURGA POINT)

   OR WHEN WE USE RELATIONAL OPERATOER(VINAY POINT)


***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
 CHECK WHEATHER THE == AND != OPERATOR CONCEPT WILL COME UNDER RELATIONAL OPERATOR TOPICS.


                    == and != operator concept

PROGRAME=10
=========
 class Test 
{
	public static void main(String[] args)
	{ 
      System.out.println('a' == 97.0 );
	}
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 smaller datatype converted to bigger data type

   char converted to double when comparing.
  97.0==97.0 -->convwersion see
  it s not like 97==97.0.
***************************-----END of--->10<--------***************************
Example=11
=========
                  IMPORATANT NOTE POINT
 
 == and != operator are universal type we can apply for
 primitive type
 Object type
 boolean type also..



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
 class Test 
{
	public static void main(String[] args)
	{ 
      Test r1=new Test();
      Test r2=new Test();
      r2=r1;
	  System.out.println(r1==r2);
    }
}
 
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true
EXPLANATION:-
============
==
OPERATOR if we apply for object type return true only if both refernce are pointing to same object.
so when we apply == operator for object it always performs reference or address compaarison.
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:- just a small observation see in local variable concept we assigining
-----  Test r2 not we using but not assigining..
       just we providing it another reference see..
PROGRAME=13
=========
 class Test 
{
	public static void main(String[] args)
	{ 
      Test r1=new Test();
      Test r2;
      r2=r1;
	  System.out.println(r1==r2);
    }
}
 

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true

EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
 To use the equality operators between object type compulsory these should be
some relation between argument types(child to parent , parent to child ) ,
Otherwise we will get Compiletime error incompatible types
 
Thread t=new Thread( ) ;
Object o=new Object( );
System.out.println(t ==o); //false
                  t-->child
                  o-->Parent

String s=new String("durga");
Object o=new Object( );
System.out.println(o==s); //false
                    s--->child
					o--->parent

Thread t=new Thread( );
String s=new String("durga");
System.out.println(s==t);
                      s-->is String type
					  t--->Thread type   
                      2 are both different classes no relationship @ all.
					  so CE
 Programe:-
 class Test 
{
	public static void main(String[] args)
	{
	Thread t=new Thread( );
    String s=new String("durga");
    System.out.println(s==t);
    }
}
 

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: incomparable types: String and Thread
    System.out.println(s==t);
                        ^
1 error
 Ex:-AutoDriver===AutoDriver(valid)
     softwareEngineer==softwareEngineer(valid)

softwareEngineer==AutoDriver(Invalid)

 ======================================================
  Parent to Parent equality operator:-
  class Test 
{
	public static void main(String[] args)
	{ 
      Test r1=new Test();
      Test r2;
      r2=r1;
	  System.out.println(r1==r2);
    }
}
 


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true
 
 	  System.out.println(r1==r2);
	          r1-->Parent
			  r2--->Child
====================================================================


PROGRAME=14
=========
EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-for siblings relation we cannot apply == operator..
----- check for  != opertor we can apply or not.
PROGRAME=15
=========

           
 class Test   //class Test extends Object 
{
	public static void main(String[] args)
	{ 
      Test r1=new Test();
      Exam r2=new Exam();
      
	  System.out.println(r1==r2);
    }
}
 

class Exam //class Exam extends Object 
{

}


C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: incomparable types: Test and Exam
          System.out.println(r1==r2);
                               ^
1 error

C:\Users\dell1\Desktop>

EXPLANATION:-ckeck diagram on page-54 see the sibling sktech.
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
 In general we can use .equals( ) for content comparision where as == operator
for reference or address  comparision
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
 case 1:-
 =======
 
 class Test 
{
	public static void main(String[] args)
	{ 
      String s=null;
      System.out.println(s==null); 
	}
}
 


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true

 case 2:- Local variable see if not assigining and using it.
 =======
  class Test 
{
	public static void main(String[] args)
	{ 
      String s;
      System.out.println(s==null); 
	}
}
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: variable s might not have been initialized
      System.out.println(s==null);
                         ^
1 error

C:\Users\dell1\Desktop>java Test


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
