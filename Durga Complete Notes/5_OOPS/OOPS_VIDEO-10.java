TOPIC:-OOPS
--------
VIDEO NO=10
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
 2,(Vinay Point.)
 7,8
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
Last video programe

PROGRAME=1
=========
   class Parent
{    
	int x=777;
}

class Child extends Parent
{
	int x=888;
}

class Gchild extends Child
{      int x=999;
}

class Test
{
	public static void main(String[] args)
	{
        Gchild gc =new Gchild();
		Parent p=((Parent)(Child)gc);
		System.out.println((Parent)(Child)gc.x);
		System.out.println("bye");
	}
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:21: error: incompatible types: int cannot be converted to Child
                System.out.println((Parent)(Child)gc.x);
                                                    ^
1 error
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
	static int i=20;
	
	static
	{   m1();
	   System.out.println("staic block one");
	}
	
	public static void main(String [] args)
	{
         m1();
      System.out.println("main method");
	}
	
	public static void m1()
	{
	 System.out.println(j);
	}
   
	static 
	{
	   System.out.println("staic block two");
	}
	static int j=10;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

0
staic block one
staic block two
10
main method


EXPLANATION:-
============
 Execution:-

    java Test
           ------>
Whenever we are executing a java class the following sequence of steps will be executed as the part of
static control flow.

      1)Identification of static members from top to bottom.
      2)Execution of static variable assignments and Execution static blocks.(from top to bottom)

(from top to bottom,this condition applicable for both variable and static block s) // important point 
	     
      3)Execution of main method.



So 1 st point:-
     Identification of static members.

1)If a static varaible is  identified frist it will assign default value at the time of identificatiOn.
So this stage where default value is assigned is called [RIWO],where original value is not assigned.
i.e 
static int i=0;
static int j=0;

RIWO:-READ INDIRECTLY WRITE ONLY.

2) Execution of static variable assignment giving their original vlaue.
   static int i=10;
   static int j=20;
   This state is called [R&W-->Read and Write]
   
   Execution of static Block from top to bottom.
  
   (from top to bottom/variables & assignments) // important point





Vinay Point:-

1)Frist identification of staic members in a class from TOP TO BOTTOM.

2)Execution of static varaible assignments [RIWO].TOP TO BOTTOM.
  So variable is in [RIWO] state so defalut value is assigned by the JVM.

3)Execution of static block. TOP TO BOTTOM.

 Note:-So @ this point we can perform read operation of varaibles only in Indirect read.
       i.e expect static block other places is Indirect read.
	   
	   If we perform read operation in static block where Direct Read is possible 
	    we ll get illegal forward reference CE.

4)main method will get the chance...
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
General Point:-In static control flow main method is the last to get the chance.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
 class Test
{
	static int i=20;
	
	static
	{   m1();
	   System.out.println("staic block one");
	}
	
	public static void main(String [] args)
	{
         m1();
      System.out.println("main method");
	}
	
	public static void m1()
	{
	 System.out.println(j);
	}
   
	static 
	{
	   System.out.println("staic block two");
	}
	static int j=10;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

0
staic block one
staic block two
10
main method

EXPLANATION:-
============
0       /* Its in [RIWD] form & its getiing a chance to execute,(Where JVM is assigining default value)
           before getting into [R&W-->Read and Write] state,where programmer value is getting assigned.
	       so its printing the defalut value.*/

staic block one 

staic block two

10        /*After static block execution,variable value is assigned.
            and then its getting the chance.so its value is printed. */
        
	  

main method



***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
The same magic works for Object reference also.

PROGRAME=5
=========
class Test
{
	static int i=20;
	
	static
	{   m1();
	   System.out.println("staic block one");
	}
	
	public static void main(String [] args)
	{
         m1();
      System.out.println("main method");
	}
	
	public static void m1()
	{
	 System.out.println(j);
	}
   
	static 
	{
	   System.out.println("staic block two");
	}
	static Test j=new Test();
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
null
staic block one
staic block two
Test@2a139a55
main method

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
	static int i=10;

	static
	{  
		m1(); 
	   System.out.println(i);//Direct Read
	}
   public static  void m1()
	{
       System.out.println(i); //Indirect Read
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>
EXPLANATION:-
============
RIWO:-READ INDIRECTLY WRITE ONLY
 
Inside a static block if we are trying to read a varibale this operation is called DIRECLTY READ.

If we are calling a method within that method if we are trying to read a variable that read operation
is callled INDIRECT READ
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
If the variable is just identified by the JVM, and original value not yet assigned,
then the variable is said to be [RIWO] state.

If a varable is in [RIWO] state then we can t peroform read operation Direct Read.
If we perform [RIWO] state then we can perform Indirect read.
If we are trying to read directly then we ll get CE saying illegal forward reference.

PROGRAME=8
=========
EXPLANATION:-
============

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
I guess main method is necessary for execution of class.

PROGRAME=9
=========
 class Test
{
  static int x=10;

  static
	{
	  System.out.println(x);
	}
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

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
  static int x=10;

  static
	{
	  System.out.println(x);
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
main method

EXPLANATION:-
============
10
main method

Here frist the variable is Identified so it s in [RIWO] state[Top to Bottom] 
then original value is provided and static block is executed.[Top to Bottom]
so x variable value is getting a chance to print only after providing original value.

compile using 1.6 version we can do run without using main method.(Durga compiled using that)
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============
 How to setPath.

 set path=

set path=<javac directory>
no semicolon and '' for set path so follow this approach.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
class Test
{
      static
	{
	  System.out.println(x);
	}
	  static int x=10;

	public static void main(String[] args)
	{
		System.out.println("main method");
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: illegal forward reference
          System.out.println(x);
                             ^
1 error

EXPLANATION:-
============
 Summary:-
 Identification of static members from top-bottom.
 then identified variable is in [RIWD] state JVM has assignned default values.
 so static block is executed so varible is still in [RIWD] state coz it s starts processing from
 top-bottom.
 so inside static block we are trying to perform read operation of a variable which is in [RIWO]
state so we ll get
Illegal forward reference.
coz process is from top-bottom.
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 class Test
{
      static
	{  m1();
	  System.out.println("inside static block");
	}
	 public static void m1()
	  {
	     System.out.println(x);//Indirect Read.
	  }
    
	public static void main(String[] args)
	{
		System.out.println("main method");
	}

	static int x=10;
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0
inside static block
main method

EXPLANATION:-
============
 Identification of static members,and assigining default values [RIWO] state.
 varaible value assignment and execition of static block.
 but the variable is declared at the bottom so still its in [RIWO] state with default value.
 execution of static block,so static block indirectly calls static method.
 so static method is in Indirect Read so defallt value is printed.
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
 Hand written notes page:- 103
 proof  case 4 is wrong 

PROGRAME=14
=========
class Test
{
	public static void main(String[] args)
	{
		byte b=10;
		int x=b;
        System.out.println("The value of B before modifacation="+b);
		System.out.println("The value of x @ Frist="+x);
		b=100+1;
        System.out.println("The value of B after modifacation="+b);
        System.out.println("The value of x @ End="+x);
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The value of B before modifacation=10
The value of x @ Frist=10
The value of B after modifacation=101
The value of x @ End=10

EXPLANATION:-
============
prempremasdf@gmail.com ----------->9986298740
arpithaarpitha1995@gmail.com----------->9986298740
vinaytssql@gmail.com----------->9986298740
rsharathkumar3@gmail.com----------->javaratan1
ss2875728@gmail.com----------->sandeepsandeep007
manjalinga999@gmail.com----------->9036762484
vinaytshetty@gmail.com----------->SLOGANISWORA9986298740
vinay9986298740@gmail.com----------->9986298740vinay
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
