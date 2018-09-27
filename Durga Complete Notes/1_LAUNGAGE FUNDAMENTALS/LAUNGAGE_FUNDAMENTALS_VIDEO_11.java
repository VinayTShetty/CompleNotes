TOPIC:-LAUNGAGE FUNDAMENTALS
--------
VIDEO NO=11
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:- Local variables Concept
-----
PROGRAME=1
=========
class Test
{
public static void main(String[] args) 
    {
     int i=10;
	 for (int j=0;j<1;j++)
	 {
		 i =i+j;
	 }
	 System.out.println(i+"========="+j);
    }
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: cannot find symbol
         System.out.println(i+"========="+j);
                                          ^
  symbol:   variable j
  location: class Test
1 error


case 2:-Local variables Concept
========
 class Test
{
   public static void main(String[] args)
   {
     try
     {
      int i=Integer.parseInt("ten");
     }
     catch(NullPointerException e)
       {
     	 System.out.println(i);
       }
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: cannot find symbol
         System.out.println(i);
                            ^
  symbol:   variable i
  location: class Test
1 error

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-Local variables Concept
-----
PROGRAME=2
=========
case 1:-Local variables Concept
========
class Test
{
public static void main(String[] args) 
    {
        int i=Integer.parseInt("ten");
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Exception in thread "main" java.lang.NumberFormatException: For input string: "ten"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at Test.main(Test.java:5)

C:\Users\dell1\Desktop>

case 2:-Local variables Concept
======
Handle using try-catch block..
 class Test
{
   public static void main(String[] args)
   {
     try
     {
      int i=Integer.parseInt("ten");
     }
     catch(NullPointerException e)
       {
     	 System.out.println(i);
       }
   }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: cannot find symbol
         System.out.println(i);
                            ^
  symbol:   variable i
  location: class Test
1 error

C:\Users\dell1\Desktop>


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
    int x;
   if(args.length>0)
    {
    x=10;
    }
  System.out.println(x);
  }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: variable x might not have been initialized
  System.out.println(x);
                     ^
1 error

EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:- Typical behaviour of Local variable
       very very important case
PROGRAME=4
=========
class Test
{
  public static void main(String[] args)
   {
    int x;
   if(true)
    {
    x=10;
    }
  System.out.println(x);
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10

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
    int x;
   if(args.length==0)
    {
    x=10;
    }
  System.out.println(x);
  }
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: variable x might not have been initialized
  System.out.println(x);
                     ^
1 error

EXPLANATION:-
============
   if(args.length==0)

**********
 Note:- If the condition is dependiong on programmer,compulsary its default value is false..
************
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
class Test
{
  public static void main(String[] args)
   {
    int x;
   if(args.length==0)
    {
    x=10;
    }
	else
	{
	x=20;
	}
  System.out.println(x);
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10

C:\Users\dell1\Desktop>

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
    int x;
   if(args.length==0)
    {
    x=10;
    }
	else
	{
	x=20;
	}
  System.out.println(x);
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test A B
20

C:\Users\dell1\Desktop>


EXPLANATION:-
============

 important case:-
 =================
if(args.length==0)   ----> false
    {
    x=10;
    }
	else
	{
	x=20; ----> always x is intializing the value in else see
	}
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
    int x;
   if(args.length>0)
    {
    x=10;
    }
	else
	{
	x=20;
	}
  System.out.println(x);
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
20

EXPLANATION:-
============
   if(args.length>0)---> false(by default if the condition depends on programer)
    {
    x=10;
    }
	else            --->so else will get the chance.
	{
	x=20;
	}
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:- only allowed modifier is final,.if we are trying to apply any other modifier
-----  we ll get CE.
PROGRAME=9
=========
class Test
{
	int a=10;//public(Any where)
	int b=20;//private(within the class)
	int c=30;//default(within the current package any where)
	int d=40;//protected(current package any where,outside package only in child classes)
  public static void main(String[] args)
   {
      final int x=10;//only modifier allowed is final
      System.out.println(x);
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:- 
-----
PROGRAME=10
=========
class Test
{
	
  public static void main(String[] args)
   {
      final int x;      
	  System.out.println("hello");
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

C:\Users\dell1\Desktop>



EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:- Instance variable final..,
-----
PROGRAME=11
=========
 class Test
{
    final int x;  	
  public static void main(String[] args)
   {
          
	  System.out.println("hello");
  }
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: variable x not initialized in the default constructor
    final int x;
              ^
1 error

EXPLANATION:-
============
The reason is we getting CE coz,
By default instance variable will get default value.(so int value is 0).
when we applied final 
we can t change the value of that variable..
EX:- 
int x;---> default value is 0
final int x;---> it will get default value and we cannot change that value..
wat s the use of instead of that we can use int x; only..
so this might be the reason..

this case is opposite in case of local varible see.. 

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
if we are not declaring with any modifier(instance and static) then by default it is default.
But this rule is applicable only for instance and static variable but not for local variable.

PROGRAME=12
=========
class Test
{
     int x=10;
	 static int y=20;
  public static void main(String[] args)
   {
      int z=30;
	  System.out.println("hello");
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello

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
class Test
{
   int x=10; //--->inatance primitive 
   static string s="vinay";//----->static reference
  public static void main(String[] args)
    {
        int [] x=new int[3]; //-->local reference
    }
}

EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
        *********************************
NOTE:- Typical cases from Example :- 14 --->19
-----   **********************************
PROGRAME=14
=========
class Test
{
   int [] x; //--> default value for object reference is null
  public static void main(String[] args)
    {
      Test t=new Test();

     System.out.println(t.x);  //  ---->Default value for Object reference is null.
	  
	 System.out.println(t.x[0]);  // --->  using null refernce we are performing any action we ll NPE 
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
null
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:10)

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
   int [] x=new int[3];
  public static void main(String[] args)
    {
      Test t=new Test();

     System.out.println(t.x);     // Pointing to 1-d array
	  
	 System.out.println(t.x[0]); // inside that 1-d array default value of int is 0.
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55
0

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:- using static see the behaviour
-----
PROGRAME=16
=========
class Test
{
   static int [] x; //--> default value for object reference is null
  public static void main(String[] args)
    {
      
     System.out.println(x);  //  ---->Default value for Object reference is null.
	  
	 System.out.println(x[0]);  // --->  using null reference we are performing any action we ll NPE 
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
null
Exception in thread "main" java.lang.NullPointerException
        at Test.main(Test.java:9)

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-VVVV important case see the index also we can acess directly inside the static area..
----- using indexes very new concept but old terminology..

PROGRAME=17
=========
  class Test
{
     static  int [] x=new int[3];
  public static void main(String[] args)
    {
      System.out.println(x);
	  System.out.println(x[0]);
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55
0

C:\Users\dell1\Desktop>


EXPLANATION:-
============
 *****************************************
vvvvvvvvvvv important example in example 17
 ******************************************         
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:- Local variable concept in arrays 
-----  ******************************
PROGRAME=18
=========
 class Test
{
    
  public static void main(String[] args)
    { 
	  int [] x;
      System.out.println(x);
	  System.out.println(x[0]);
    }
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: variable x might not have been initialized
      System.out.println(x);
                         ^
1 error

EXPLANATION:-
============
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
 class Test
{
    
  public static void main(String[] args)
    { 
	  int [] x=new int[3];
      System.out.println(x);
	  System.out.println(x[0]);
    }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
[I@2a139a55
0

EXPLANATION:-
============
	  int [] x=new int[3];
System.out.println(x);  ---> x is already intailzed so no problem.
---------------------------------------------------------------------------
System.out.println(x[0]);
 coz once we create an array every array element will be by default intialzied will default values
 it may be eieher instance array ,local array ,static array ...

---------------------------------------------------------------------------
  
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
