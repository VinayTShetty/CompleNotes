TOPIC:-FLOW CONTROL STATEMENT
--------
VIDEO NO=3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-11,
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
----- 
 Several  choices are there then going For if and else if is not recomended.
 give this example before starting switch example.

always recomended to go For switch statement.

PROGRAME=1
=========
 class Test 
 {
	public static void main(String[] args) 
      {
		int x=10;
		if (x==1)
		{
			System.out.println("jan");
         } 
		else if(x==2) 
		{
			System.out.println("feb");
		}
		else if(x==3) 
		{
			System.out.println("march");
		}
	  }
 }


EXPLANATION:- Do some research on if and else if. and   if,else
============
 	if (x==1)
		{
			System.out.println("jan");
         } 
		else if(x==2) 
		{
			System.out.println("feb");
		}


case 1:-
--------
if (x==1)
   {
 System.out.println("jan");
   }   
else if(x==2) // if(x==2) -->condition part is optional.If using if then condition part is mandatory. 
  {
System.out.println("feb");
  }
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
		int x=2;
		switch (x)
		{
		case 1:System.out.println("jan");
		break;
		case 2:System.out.println("feb");
		break;

        default:System.out.println("No idea");
		break;
		}
	  }
 }


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
feb

EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
 Syntax:-
 
 switch (key) 
	 {
		case value:
			
			break;

		default:
			break;
		}


EXPLANATION:-
============
 switch and ctrl+space in eclipse.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
 Both case and default are optional
 That is an empty switch statement is a valid java syntax.

PROGRAME=4
=========
 class Test 
 {
	public static void main(String[] args) 
      {
		System.out.println("hello world");
		int x=2;
		switch (x)
		{

		}
	  }
 }



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello world
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
		System.out.println("hello world");
		int x=2;
		switch (x)
		{
          System.out.println("Insdie Switch");
        }
	  }
 }
 
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
          ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                 ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                    ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                     ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                            ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                             ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                                            ^
Test.java:9: error: case, default, or '}' expected
          System.out.println("Insdie Switch");
                                             ^
9 errors


Observe the 9 error how the cursor is moving from System --->;
                                                  ^          ^
EXPLANATION:-
============
 Every Statement inside switch must under case or default.
 Independent Statement are not allowed.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
 class Test
{
public static void main(String args[])
  {
    int x=10;
    int y=20;
    switch(x)
      {
     case 10:
     System.out.println("10");
     case y:
     System.out.println("20");
      }
  }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: constant expression required
     case y:
          ^
1 error

EXPLANATION:-
============
 Every case label or value must be constant(constant expression) or compile time constatnt.
 we cannot use varible.

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 class Test
{
public static void main(String args[])
  {
    int x=10;
   final int y=20;
    switch(x)
      {
     case 10:
     System.out.println("10");
     case y:
     System.out.println("20");
      }
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
20

EXPLANATION:-
============
If we declare y as final we won t get any CE.
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
 
PROGRAME=8
=========
 class Test
{
public static void main(String args[])
  {
    int x=10;
   final int y=20;
    switch(x+10)
      {
     case 10:
     System.out.println("10");
	 break;
     case 10+y:
     System.out.println("40");
	 break;
     
	 case 10+1:
     System.out.println("11");
	 break;

	 case 20:
     System.out.println("20");
	 break;
      }
  }
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
20

C:\Users\dell1\Desktop>



EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Both switch argument and case label can be expression
but case label should be constant Expression

PROGRAME=9
=========
 class Test
{
public static void main(String args[])
  {
    int x=10;
   final int y=20;
    switch(x+10)  //(10+20) can use this inside switch argument.
      {
     case 10:
     System.out.println("10");
	 break;
     case 10+y:
     System.out.println("40");
	 break;
     
	 case 10+1:
     System.out.println("11");
	 break;

	 case 20:
     System.out.println("20");
	 break;
      }
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
20

C:\Users\dell1\Desktop>



EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
 out of byte range

PROGRAME=10
=========
 class Test
{
public static void main(String args[])
  {
    byte x=10;
    switch(x) 
		{
     case 10:
     System.out.println("10");
	 break;

     case 100:
     System.out.println("100");
	 break;
     
	 case 1000: //out of byte range
     System.out.println("1000");
	 break;
      }
  }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:16: error: incompatible types: possible lossy conversion from int to byte
         case 1000:
              ^
1 error
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
public static void main(String args[])
  {
    byte x=10;
    switch(x+1) 
		{
     case 11:
     System.out.println("11");
	 break;

     case 100:
     System.out.println("100");
	 break;
     
	 case 1000:
     System.out.println("1000");
	 break;
      }
  }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
11

EXPLANATION:-
============
 VVv important.
 Observe Example 10 u will see the difference.
 Every case label must be within the argument type
    switch(x+1) 
          (10+1)
		  (byte+int)==>Result type is int  

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-See it will search till end.
-----
PROGRAME=12
=========
 class Test
{
public static void main(String args[])
  {
    int x=10;
    switch(97) 
		{
     case 97:
     System.out.println("97");
	 break;

     case 98:
     System.out.println("98");
	 break;
     
	 case 99:
     System.out.println("99");
	 break;

     case 'a':
     System.out.println("a--->97");
	 break;
      }
  }
}
 
C:\Users\dell1\Desktop>javac Test.java
Test.java:20: error: duplicate case label
     case 'a':
     ^
1 error

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-See it converts the argument of case from char to int.
-----
PROGRAME=13
=========
 class Test
{
public static void main(String args[])
  {
    int x=10;
    switch(97) 
		{
     case 'a':
     System.out.println("a--->97");
	 break;
     
	 case 98:
     System.out.println("98");
	 break;
     
	 case 99:
     System.out.println("99");
	 break;

           }
  }
}
 
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
a--->97

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
 Generally while explaining in tutuions tell ---> default, wait for some time.
 if any case not matched then default take ur chance..
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
within the case we can write any java statement,
1)another switch statement we can write.
2)method declaration we can t,(method declaration is allowed inside a class.not in switch)
3)only functionlaties we can write.

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
