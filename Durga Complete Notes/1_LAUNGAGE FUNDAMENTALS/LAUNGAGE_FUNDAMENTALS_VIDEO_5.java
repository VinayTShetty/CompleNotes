TOPIC:-Laungage Fundamentals
--------
VIDEO NO=5
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:- here is not type of any data type so CFS error..
----- (it s not incompatible error see the reson.)
PROGRAME=1e
=========
class Test {

	public static void main(String[] args) 
	{
		char ch=a;
		System.out.println(ch);
		
		
	
	}

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: cannot find symbol
                char ch=a;
                        ^
  symbol:   variable a
  location: class Test
1 error

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-String cannot assign to char so incompatible type error.
-----
PROGRAME=2
=========
class Test {

	public static void main(String[] args) 
	{
		char ch="a";
		System.out.println(ch);
		
		
	
	}

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: String cannot be converted to char
                char ch="a";
                        ^
1 error

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-after space its accepting closing of----->  '  
----- but its not closed so CE.see 
PROGRAME=3
=========
class Test {

	public static void main(String[] args) 
	{
		char ch=' a';
		System.out.println(ch);
    }

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unclosed character literal
                char ch=' a';
                        ^
Test.java:5: error: unclosed character literal
                char ch=' a';
                           ^
Test.java:5: error: not a statement
                char ch=' a';
                          ^
3 errors

C:\Users\dell1\Desktop>
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
		char ch=' ab';
		System.out.println(ch);
    }

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unclosed character literal
                char ch=' ab';
                        ^
Test.java:5: error: unclosed character literal
                char ch=' ab';
                            ^
Test.java:5: error: not a statement
                char ch=' ab';
                          ^
3 errors



 ' ab';

 ' -->ok(' ok)
   --->(space also ok)

   immediately it will search for closing of ---> '

   but could not find so error--->1


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
		char ch=' ';
		System.out.println(ch);
    }

}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test


EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-We can specify char literal in octal,decimal or hexadecimal no problem in that..
----- But the range must be within 65535 range only..
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
class Test {

	public static void main(String[] args) 
	{
		char ch=65536;
		System.out.println(ch);
    }

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: incompatible types: possible lossy conversion from int to char
                char ch=65536;
                        ^
1 error

C:\Users\dell1\Desktop>



EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Test {

	public static void main(String[] args) 
	{
		char ch=97;
		System.out.println(ch);
    }

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
a

C:\Users\dell1\Desktop>



EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
That possible font is not avaliable in the system so we ll get ? marks..


www.unicode.org

PROGRAME=9
=========
class Test {

	public static void main(String[] args) 
	{
		char ch=297;
		System.out.println(ch);
    }

}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
?

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-Every escape charcter is a valid char literal
----- page 17

other than that rest all are illegal escape charcter.

char ch ='\m'; --->example 
PROGRAME=10
=========
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
\f Form feed --->may be to replace i guess

PROGRAME=11
=========
EXPLANATION:-
============
 Requirement:-

This is ' symbol  

sop("This is ' symbol");  --->CE in java durga videos but not in real find reason
  28.5 time this is taken as wrong see the video
class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the ' symbol");	
	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
This is the ' symbol
--------------------------------
sop("This is \' symbol"); ---->valid 

class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the \"' symbol");	
	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
This is the "' symbol

C:\Users\dell1\Desktop>


***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the "symbol");	
	}

}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: ')' expected
        System.out.println("This is the "symbol");
                                         ^
Test.java:5: error: unclosed string literal
        System.out.println("This is the "symbol");
                                               ^
Test.java:5: error: ';' expected
        System.out.println("This is the "symbol");
                                                        ^
Test.java:8: error: reached end of file while parsing
}
 ^
4 errors
===========================================

class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the \"symbol");	
	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
This is the "symbol


 class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the ' symbol");	
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
This is the ' symbol

C:\Users\dell1\Desktop>



EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-see both are same using escape charcter is optional i guess
-----
PROGRAME=13
=========

case 1:-
	class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the ' symbol");	
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
This is the ' symbol

C:\Users\dell1\Desktop>

case 2:-
class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the \' symbol");	
	}

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
This is the ' symbol

C:\Users\dell1\Desktop>






EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-compiler thinks it as a escape charcter but theere is no escape charcter like \symbol so
-----compiler will tell that error
PROGRAME=14
=========
case 1:-

class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the \symbol");	
	}

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: illegal escape character
        System.out.println("This is the \symbol");
                                         ^
1 error

C:\Users\dell1\Desktop>

 case 2:-
 class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the \\\symbol");	
	}

}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: illegal escape character
        System.out.println("This is the \\\symbol");
                                           ^
1 error

C:\Users\dell1\Desktop>
 
 case 3:-
 class Test {

	public static void main(String[] args) 
	{
	System.out.println("This is the \\symbol");	
	}

}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
This is the \symbol

C:\Users\dell1\Desktop>



Best Example is file io concept:-
C:\desktop --->CE
C:\\desktop

carriage return means moving to the frist line of secon line


EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
use of excape charcter in char datatype
class Test
{
public static void main(String[] args)
 {
   char ch='a';
   char ch1='b';
   char ch2='\'';
   System.out.println(ch+""+ch2+""+ch1);
 }
}

EXPLANATION:-
============
 try for all escape charcter..
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
   char ch='\n';
   System.out.println(ch);
 }
}

EXPLANATION:- if we are using single char its difficult to explain so refer exampple 16.
============  u will get clear idea.
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
