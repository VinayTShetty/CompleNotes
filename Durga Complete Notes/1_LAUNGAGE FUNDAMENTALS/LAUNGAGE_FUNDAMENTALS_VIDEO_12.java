TOPIC:-LAUNGAGE FUNDAMENTALS
--------
VIDEO NO=12
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=(See only last 10 minutes)(Not completed)
-----------------
 IMPORTANT EXAMPLES:-

----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
   methodOne(10,20,30);
   methodOne(10,20,30);//calling again

PROGRAME=1
=========
  class Test
  {
   public static void methodOne(int... x)
   {
     System.out.println("var-arg method");
    }
  public static void main(String[] args)
  {
   methodOne();
   methodOne(10);
   methodOne(10,20,30);
   methodOne(10,20,30);//calling again
   methodOne(10,20,30,40);
  } 
}

var-arg method
var-arg method
var-arg method
var-arg method
var-arg method

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2  Miscellaeneous Example
=========
NOTE:-
-----
PROGRAME=2
=========
 class Test
{  	
  public static void main(String[] args)
   {
     Dog d1=new Dog();
     Dog d2=new Dog();
     d1.m1(d1);
   }
}

class Dog
{
int x=10;
  void m1(Dog d)
  {
	d.x=555;
	System.out.println(x);
  }
}
class Animal
{      int y=20;
	  void m2(Animal a)
	  {
		a.y=888;
		System.out.println(y);
	  }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
555

EXPLANATION:-
============
 See the .class file from Dcompiler
   
   void m1(Dog d)
  {
	d.x=555;
	System.out.println(x);
  }
 

Its an instance method compulsary we should call it by using Object reference,,
Which Object reference i used to call by that reference only i should change the value..

.class file 
 import java.io.PrintStream;

class Dog
{

    int x;

    Dog()
    {
        x = 10;
    }

    void m1(Dog dog)
    {
        dog.x = 555;
        System.out.println(x);
    }
}

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:- Forget Example 2,coz its instance variable concept,
-----for object separate copy see..no other terminology..

PROGRAME=3
=========
class Test
{  	
  public static void main(String[] args)
   {
    
     Dog d1=new Dog();
     Dog d=new Dog();
new Dog().m1(new Dog());

 
   }
}

class Dog
{
static int x=10;
  void m1(Dog d)
  {
    System.out.println(x);
	d.x=555;
    System.out.println(d.x);
    System.out.println(x);
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10
555
555
EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
 class Test
{
   public static void sum(int... x)
   {
   int total=0;
   for(int i=0;i<x.length;i++)
     {
    total=total+x[i];
      }
   System.out.println("The sum :"+total);
   }
   public static void main(String[] args)
   {
   sum();
   sum(10);
   sum(10,20);
   sum(10,20,30,40);
   }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The sum :0
The sum :10
The sum :30
The sum :100

EXPLANATION:-
============
 for(int i=0;i<x.length;i++)
     {
    total=total+x[i];
      }

	  --->Internally it implements 1-d array concept see the for loop.
	  and we can apply length variable concept also for that loop.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 class Test
{
   public static void sum(int... x)
   {
   int total=0;
   for(int x1:x)
     {
    total=total+x1;
      }
   System.out.println("The sum :"+total);
   }
   public static void main(String[] args)
   {
   sum();
   sum(10);
   sum(10,20);
   sum(10,20,30,40);
   }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
The sum :0
The sum :10
The sum :30
The sum :100

C:\Users\dell1\Desktop>

EXPLANATION:-
============
Anothetr Style of writing to show that var-arg is implemented using 1-d array comcept.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
 Internally 1-d array implementation
 1)m1(int[] x);
 2)m1(int []x);
 3)m1(int x[]);

 valid var-arg method
 m1(int ...x);
 m1(int... x);
 m1(int...x);

 Invalid var-arg method
 m1(int x...);
 m1(int. ..x);
 m1(int  .x..);
-----------------------
 valid    ***** important.
m1(int a,int... b)
  ---->One int value compulsary and any number of int values.

  valid:-
  m1(int x,int ... x);
  m1(String s,double ...y);
  m1(char ch,String ...s);
--------------------------------------
Invalid

m1(int... a,int b)
    ---->Writing frist only var-arg parameter then normanl parameter is inavalid.
 Invalid
 m1(double ...x,String s);

------------------------------------------

Inside the var-arg method we can take only one var-arg parameter. i.e., if we are
trying to more than one var-arg parameter we will get CE.
 Ex:-
     m1(int ...x,double ...y); 
	                        ----->CE
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-Inside the class we can t declare var-arg method and corresponding 1-D array method simaltaneously.
-----Other wise we ll get CE. 
PROGRAME=7
=========
 class Test
{
	public static void main(String[] args)
	{
	
	}

    void m1(int[] x) 
	{
     System.out.println("hello");
	}
      void m1(int...x)
    {
     System.out.println("hello");
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:12: error: cannot declare both m1(int...) and m1(int[]) in Test
      void m1(int...x)
           ^
1 error

EXPLANATION:-
============
  void m1(int[] x)  //----> Signature is m1(int[])
	{
     System.out.println("hello");
	}
      void m1(int...x) //---->Signature is m1(int[])
    {
     System.out.println("hello");
	}

	2 methods of same signature is not alllowed in java.
	Internally it converts into 1-D array see
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-General Example
-----
class Test
{
	public static void main(String[] args)
	{
	
	}

    void m1(int x) 
	{
     System.out.println("hello");
	}
      int m1(int x)
    {
     System.out.println("hello");
	 return 10;
	}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:12: error: method m1(int) is already defined in class Test
      int m1(int x)
          ^
1 error
PROGRAME=8
=========
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
 class Test
{
   public static void m1(int i)
   {
     System.out.println("general method");
   }
   public static void m1(int... i)
   {
     System.out.println("var-arg method");
   }
   public static void main(String[] args)
  {
     m1();
     m1(10,20);
     m1(10);
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
var-arg method
var-arg method
general method

EXPLANATION:-
============
 In general var-arg method will get least priority that is if no other method matched then
only var-arg method will get the chance this is exactly same as default case inside a
switch.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
Equvialance between var-arg parameter and 1-d array
  
  Very important.

 case 1:-
 =======
m1(int[] x) -->method signature 

     ----->valid method call
  	        m1(new int {10});
           m1(new int {10,20});
	   	   m1(new int {10,20,30});

 case 2:-
 ========
 m1(int ...x) -->method signature  or  m1(int[] x)

     ----->valid method call
  	        m1(new int {10});
           m1(new int {10,20});
	   	   m1(new int {10,20,30});
           m1(10);
		   m1(10,20);
		   m1(10,20,30);

 Note:-********************(very important points)
 ======
 Where ever 1-d array method as argument is there we can easily replace it with 
 var-arg method.

**********************************
VALID
 1)m1(int [] x); =====> m1(int ...x);
 2)main method
     main(String []args);=====>main(String ...args);
    
 NOte:-
Where ever 1-d array method as argument is there we can easily replace it with 
var-arg method.

 Programe:-
 class Test
{
   public static void main(String ...args)
  {
    System.out.println("main method");    
  }
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
main method

C:\Users\dell1\Desktop>
**********************************

***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============
Very very important Observation

NOte:-
======
 Where ever var-arg method parameter is present we cannot replace it with 1-D array as parameter.
            

			 replcae
 m1(int ...x)=========> m1(int []x)  ----->Invalid we cannot do like this..

 case 1:-
  m1(int ...x)   -----> method signature.

  valid method call
         m1(10);
         m1(10,20);
		 m1(10,20,30);
		 m1(new int[] {10,20});

  case 2:-
               replcae
 m1(int ...x)=========> m1(int []x) Invalid Replacement

 m1(int []x)   -----> method signature.
         m1(10);   ----->Invalid
         m1(10,20); ----->Invalid
		 m1(10,20,30);----->Invalid
		 m1(new int[] {10,20});----->Valid

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
EXPLANATION:-
============
Highly important Observation.
=============================
1)m1(int ...x); --->method signature
    
	m1(10); --->valid method call 
   Note:-We can call this method by passing a group of int values
 
 case 1:-
2)m1(int[]...x)--->method signature
      Internally it will become m1(int[][] x)--->method signature
      we can call it passing 2-d array
	  coz:-A group of 1-d array will become 2-d array.
 Note:-We can call this method by passing a group of 1-d int arrays and x will become 2-D int array

case 2:-

3)m1(int[][]...x)--->method signature
      Internally it will become m1(int[][][] x)--->method signature
      we can call it passing 3-d array
	  coz:-A group of 2-d array will become 3-d array

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-Important Example
-----
PROGRAME=13
=========
 class Test
{
   public static void main(String ...args)
  {
    int [] x={10,20,30};
	int [] y={40,50,60};
	m1(x,y);
  }
  static void m1(int[]... x)
	{
   System.out.println("m1 method ***");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
m1 method ***

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
