TOPIC:-ACESS MODIFIER
--------
VIDEO NO=3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-7,
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
 import java.util.ArrayList.*;
class Test 
{
	public static void main(String[] args) 
	    {
           System.out.println("vinay");
        }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
vinay

EXPLANATION:-
============
 import java.util.ArrayList.*;

  video :-2 we can use ArrayList.*;
  valid no CE.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
VV important concept:-
88-90(Hand written notes)
PDF(124)
Page 10

PROGRAME=2
=========
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
 	import static java.lang.Math.sqrt;
class Test
{
	public static void main(String[] args)
	{
	 System.out.println(sqrt(2));
	}
}

PROGRAME=3
=========

 import static java.lang.System.out;
class Test
{
public static void main(String args[])
	{
       out.println("hello");
       out.println("hi");
     }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
hi


EXPLANATION:-
============
 import static java.lang.Math.sqrt;
 sqrt(2)
 We don t want further so we are stopping @ sqrt only.


We want to continue further so we using the return type of out and doing further operation.
 out.println("hello");
 We can acess out directly but we need println 
 so out return type of out is printstream so all classes present in printstream we can acess
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
 class Test
{
public static void main(String args[])
	{
       out.println("hello");
       out.println("hi");
     }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: cannot find symbol
       out.println("hello");
       ^
  symbol:   variable out
  location: class Test
Test.java:6: error: cannot find symbol
       out.println("hi");
       ^
  symbol:   variable out
  location: class Test
2 errors
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 import static java.lang.System.out;
class Test
{
public static void main(String args[])
	{
       out.println("hello");
       out.println("hi");
     }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
hi
EXPLANATION:-
============
out is a static variable present in System class hence we can acess by using class name System
But when ever we are writing static import it s not required to use class name and we can acess 
out directly.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
 import static java.lang.Integer.*;
import static java.lang.Byte.*;
class Test
{
public static void main(String args[])
	{
     System.out.println(MAX_VALUE);
    }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: reference to MAX_VALUE is ambiguous
     System.out.println(MAX_VALUE);
                        ^
  both variable MAX_VALUE in Integer and variable MAX_VALUE in Byte match
1 error

EXPLANATION:-
============
    @Native public static final int   MAX_VALUE = 0x7fffffff;

	Here MAX_VALUE is static variable not a method.
	
	so it means we can acess both static variable and method() by using static import.
	ex:- sqrt(2)  -->method
         MAX_VALUE--->variable
***************************-----END of--->6<--------***************************
Example=7                  NORMAL IMPORT AND static import preference both are different. 
=========
NOTE:-
-----
PROGRAME=7
=========
 import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test
{
	static int MAX_VALUE=999;
public static void main(String args[])
	{
     System.out.println(MAX_VALUE);
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
999

EXPLANATION:-
============
 While resolving static memebers compiler will always give precedence in the following order

 current class static members
 Explicit static import
 implicit static import

 static import Preference is like this
 
 current class static members working directory 
 Explicit static import          
 implicit static import          
 
 
 
 
 Preference Table:-
 -----------------
current class static members working directory ----->Preference is going for this 
Explicit static import
implicit static import
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
 import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test
{
	
public static void main(String args[])
	{
     System.out.println(MAX_VALUE);
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
2147483647

EXPLANATION:-
============
 source code does nt contain current class working directory MAX_VALUE so preference is going for 
 Explicit static import
 

 Preference Table:-
 -----------------
current class static members working directory
Explicit static import----->Preference is going for this 
implicit static import
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
 import static java.lang.Byte.*;
class Test
{
	
public static void main(String args[])
	{
     System.out.println(MAX_VALUE);
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
127

C:\Users\dell1\Desktop>

EXPLANATION:-
============
  Preference Table:-
 -----------------
current class static members working directory
Explicit static import
implicit static import----->Preference is going for this 
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
  import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;
class Test
{
	static int MAX_VALUE=999;
public static void main(String args[])
	{
     System.out.println(MAX_VALUE);
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
999

EXPLANATION:-
============
 Observe Here if  it get s the MAX_VALUE in current class working directory
 even though its present in Explicit static import it won t consider.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============
 Normal import:-
              ------------> Explicit import
				    
					Syntax----->import package name.class name;
					       ----->Ex:-import java.util.ArrayList;
 
			  ------------> Implicit import
			
					Syntax----->import package name.*;
					       ----->Ex:-import java.util.*;





static import:-
            ------> Explicit import
				   
				   Syntax----->import static package name.class name.static members;
 static members:-static members may be variables or methods
                     ------->Ex:- import static java.lang.Math.sqrt;
                                  import static java.lang.System.out;
  
			 
			 
			 ------> implicit import
				   Syntax----->import static package name.class name.*;
                      ------->Ex:- import static java.lang.Math.*;
                                  import static java.lang.System.*;
***************************-----END of--->11<--------***************************
Example=12
=========
 find out the individual reason for each of the following.(Not completed)
 COZ SOME of the cases are true so find the internal reason.
NOTE:-
-----
PROGRAME=12
=========
EXPLANATION:-
============
which of the following import statement are valid:-

import java.lang.Math.*;
 invalid
 normal import, After class name semicolon is required.

import static java.lang.Math.*;
 valid(implicit static import all static members made avaliable)


import java.lang.Math.sqrt;
 invalid
 normal import never talks about member level(i.e sqrt)
 Upto class level its valid

import static java.lang.Math.sqrt();
 invalid method name we should specify not bracket open and close-->()
 
import static java.lang.Math.sqrt.*;
invalid
meaning less

import  java.lang.Math.sqrt.*;
invalid

import static java.lang.Math.sqrt;
 valid
 import sqrt member to our class.

import java.lang;
 invalid
 normal import package name .* required

import static java.lang;
invalid
meaning less

import java.lang.*;
valid 
syntaxally valid


import static java.lang.*;
invalid
.* is allowed for static import after class name but not after package name.

Programe:-

//import java.lang.Math.*;
//import static java.lang.Math.*;
//import java.lang.Math.sqrt;
//import static java.lang.Math.sqrt();
//import static java.lang.Math.sqrt.*; 
//import static java.lang.Math.sqrt;
//import java.lang;
//import static java.lang;
//import java.lang.*;
//import static java.lang.*;

class Test
{
	public static void main(String[] args)
	{
	 System.out.println(sqrt(10));
	}
}


***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
EXPLANATION:-
============
Why static import is not recomended to use
 
 2 packages contain a class or interace with a same name is very rare.
 In total 5000 java class only 2 cases we found this problem.

 Date and List  class

List-->List is avaliable in util and awt
Date --> Date is avaliable in util and sql

so 2 packages contain  class or interface with the same name is very rare.
so in the case of normal import ambguity problem is very rare if it s a normal import.


But 2 class and interface contain method with same name and variable is very common
 EX:- MAX_VALUE is avaliable in byte,short,int,long,float,double. 

 Mehthods and variables with same name in two classes is very common so ambguity problem is very common 
 in static import.
 
 2 packages contain a class or interface with the same name is very rare
 and hence ambguity problem is also very rare in normal import.

 But in 2 classes or interfaces contain a variable or a method with the same name is very common 
 hence ambuguity problem is also very common problem in static import.
 
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============

case 1:-

class 
{

//50 thousand lines of code
 sopln(sqrt(4));

}

 so question is which class sqrt() method is executing 
                                           current class sqrt method
                                           implicit class sqrt method
                                            or any static import is there.

 so checking which class sqrt() method we are using is always a problem.
 readability will be down.
 
so usage of static import in creates unnecessary confusion
so extending static import untill method level and variable level creates confusion 
untill there is no requirement don t use static import.

usage of static import reduces readability and creates confusion and
hence if there s no specific requirement
then it s not recomended to use static import.

case 2:-

class 
{

//50 thousand lines of code
 sopln(Math.sqrt(4));

}
 so question is which class sqrt() method is executing  
 we can easily tell Math class sqrt () method is executing
 so case 2 readability is more.
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
