TOPIC:-FLOW CONTROL STATEMETNS 
--------
VIDEO NO=5
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=NO (NOT COMPLETED)
-----------------  
(55:00-1:10:00) for-each and for loop use in arrays.
 After collections some cocepts are here finnish collection and then study this again.
**************************************************************************************
IMPORTANT EXAMPLES:-3,9(*),10(*),19(**)
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
  
class Test
{
public static void main(String args[])
  {	+
     for (int i=0;true;i++)
     {
		 System.out.println("vinay");
     }
   }

}
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay

C:\Users\dell1\Desktop>

EXPLANATION:- valid for-statement.
============
for (int i=0;true;i++)
     {
		 System.out.println("vinay");
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
public static void main(String args[])
  {
     for (int i=0;true;i++)
  }

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: illegal start of statement
  }
  ^
1 error

EXPLANATION:-
============
without curly braces rule 

looking for ;
looking for one non-declarative statement(can write only one declarative statement)
looking for{}
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
 class Test
{
public static void main(String args[])
  {
     for (int i=0;true;i++);
  }

}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

EXPLANATION:-
============
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

need to shut down JVM manually see
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
     for (int i=0;true;i++)
		 int x=10;
  }

}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: variable declaration not allowed here
                 int x=10;
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
public static void main(String args[])
  {
     for (int i=0;i<10;i++)
	  {
	 
	  }
  }

}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

C:\Users\dell1\Desktop>

EXPLANATION:-
============
Normal Shut-down of JVM
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
     for (int i=0,j=5,l=10;i<10;i++)
	  {
	 
	  }
  }

}
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test


EXPLANATION:-
============
 for (int i=0,j=5,l=10;i<10;i++)
	  {
	 
	  }

 int i=0,j=5,l=10;   i<10;        i++


 We can declare any type of variable of same type,coz we are not ending with semicolon(;)



case 2:-
-------
 class Test
{
public static void main(String args[])
  {   
     for (int i = 0,int j = 0;i<10; i++)
     {
	        	
	 }   
  }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: <identifier> expected
     for (int i = 0,int j = 0;i<10; i++)
                    ^
Test.java:5: error: not a statement
     for (int i = 0,int j = 0;i<10; i++)
                               ^
Test.java:5: error: ')' expected
     for (int i = 0,int j = 0;i<10; i++)
                                  ^
Test.java:5: error: ';' expected
     for (int i = 0,int j = 0;i<10; i++)
                                       ^
4 errors

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
     for (int i=0,String s="vinay";i<10;i++)
	  {
	 
	  }
  }

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: ';' expected
     for (int i=0,String s="vinay";i<10;i++)
                        ^
Test.java:5: error: not a statement
     for (int i=0,String s="vinay";i<10;i++)
                                    ^
Test.java:5: error: ')' expected
     for (int i=0,String s="vinay";i<10;i++)
                                       ^
Test.java:5: error: ';' expected
     for (int i=0,String s="vinay";i<10;i++)
                                           ^
EXPLANATION:-
============
 Immediately after , it s excepting semicolon(;) but we are giving String so error.
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
     for (int i=0;String s="vinay";i<10;i++)
	  {
	 
	  }
  }

}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: ';' expected
     for (int i=0;String s="vinay";i<10;i++)
                        ^
Test.java:5: error: ')' expected
     for (int i=0;String s="vinay";i<10;i++)
                                  ^
Test.java:5: error: illegal start of type
     for (int i=0;String s="vinay";i<10;i++)
                                     ^
Test.java:5: error: not a statement
     for (int i=0;String s="vinay";i<10;i++)
                                    ^
Test.java:5: error: ';' expected
     for (int i=0;String s="vinay";i<10;i++)
                                           ^
5 errors

EXPLANATION:-
============

 condition part is optional see this programe.
 so if the condition is optional it excepting semicolon(;) but we giving String so meaningfull CE.

 class Test
{
public static void main(String args[])
  {  
     for (int i = 0;; i++) //default conditoin is true by compiler.
     {
	        	
	 }   
  }
	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test



***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
 class Test
{
public static void main(String args[])
  {   
	      int a=100;
	      
          if (true)
          {
			int a=10;
			 a++
			 System.out.println(a);\\Point:-1
		   }  
	      
   }
	
}


EXPLANATION:-
============
 \\Point:-1
Assume that a=10 inside the if block is getting the prefernce 
but wat s the use of writing the local variable a=100;
 If we are not using it within the scope.
so shadowoing of local variable within the scope particulary inside loop s is invalid

The same applies For for-loop also.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:- Variable concept very very important,local varible concept
-----  Example 9(Same concept)
PROGRAME=10
=========
 class Test
{
public static void main(String args[])
  {   int a,b,c=10;  
     for (int i = 0,a=10,b=10,c=20;i<10; i++)
     {
	        	
	 }   
  }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: variable a is already defined in method main(String[])
     for (int i = 0,a=10,b=10,c=20;i<10; i++)
                    ^
Test.java:5: error: variable b is already defined in method main(String[])
     for (int i = 0,a=10,b=10,c=20;i<10; i++)
                         ^
Test.java:5: error: variable c is already defined in method main(String[])
     for (int i = 0,a=10,b=10,c=20;i<10; i++)
                              ^
3 errors

EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-In intialization section we can take any valid java statement including sop statement. 
-----
PROGRAME=11
=========
 class Test
{
public static void main(String args[])
  {   int i=5;
     for (System.out.println("hello");i<10; i++)
     {
	        	System.out.println("vinay");
	 }   
  }
	
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
vinay
vinay
vinay
vinay
vinay

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:- Intialization is optional
-----
PROGRAME=12
=========
 class Test
{
public static void main(String args[])
  {   int i=5;
     for (;i<10; i++)
     {
	        	System.out.println("vinay");
	 }   
  }
	
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
vinay
vinay
vinay
vinay
vinay

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
	static void m1()
	{
		System.out.println("static void m1 method");
		
	}
public static void main(String args[])
  {   int i=5;
     for (m1();i<10; i++)
     {
	        	System.out.println("vinay");
	 }   
  }
	
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
static void m1 method
vinay
vinay
vinay
vinay
vinay

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
 class Test
{
	 void m1()
	{
		System.out.println("Instance void m1 method");
     }
public static void main(String args[])
  {   int i=5;
     for (new Test().m1();i<10; i++)
     {
	        	System.out.println("vinay");
	 }   
  }
	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Instance void m1 method
vinay
vinay
vinay
vinay
vinay
EXPLANATION:-
============
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-Break and return we cannot use in intialization part as it s not a valid java statement
-----
PROGRAME=15
=========
 class Test
{
	static void m1()
	{
		System.out.println("static void m1 method");
		
	}
public static void main(String args[])
  {   int i=5;
     for (break;i<10; i++)
     {
	        	System.out.println("vinay");
	 }   
  }
	
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: illegal start of expression
     for (break;i<10; i++)
          ^
Test.java:10: error: not a statement
     for (break;i<10; i++)
                 ^
Test.java:10: error: ')' expected
     for (break;i<10; i++)
                    ^
Test.java:10: error: ';' expected
     for (break;i<10; i++)
                         ^
4 errors

EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
      for (int i=5;<condition>;i++)
     {
         System.out.println("vinay");
	 }   



<condition>  we can take any java expression but @ the end it should be boolean type.

<condition> 
condition part is optional,
If we are not providing condition,compiler will place defalut condition as true.
	  

 class Test
{
public static void main(String args[])
  {   
     for (int i=5;;i++)
     {
         System.out.println("vinay");
	 }   
  }
	
}


vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay


EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:- default value is true,which will be placed by the compiler.
-----
PROGRAME=17
=========
 class Test
{
public static void main(String args[])
  {   
     for (int i=5;;i++)
     {
         System.out.println("vinay"+i);
	 }   
  }
	
}


vinay9459
vinay9460
vinay9461
vinay9462
vinay9463
vinay9464
vinay9465
vinay9466
vinay9467
vinay9468
vinay9469
vinay9470
vinay9471
vinay9472
vinay9473
vinay9474

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
    for (int i=5;i<10; System.out.println("vinay"+i);)
       {    
		 
       }
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:- vvvvvv important concept.
-----
 vvvvv important concept see in selective statements we can use false condition 
 and can use declarative statememts

PROGRAME=19
=========
 class Test
{
	
  public static void main(String[] args)
  {
	if(false)
		System.out.println("hello");
	    int x=10;
	    Test t=new Test();
  }
	
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test

C:\Users\dell1\Desktop>
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
Example=21                Increment or Decrement Section
=========
NOTE:-
-----
PROGRAME=21
=========
 class Test
{
	
  public static void main(String[] args)
  {
	  int i=0;
      for (System.out.println("hello");i<10;System.out.println("vinay"))
    {
           i++;//writing here also its optional
	 }
  }
	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay

EXPLANATION:-
============
***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
 class Test
{
     public static void main(String[] args)
     {
	  int i=0;
      for (System.out.println("hello");i<10;System.out.println("vinay"))
       {
           
	   }
    }
	
}

vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay
vinay

EXPLANATION:-
============
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
  for (Point:-1; Point:-2;Point:-3)
       {
           
	   }
EXPLANATION:-
============
    Point:-1
	  optional,can write any java statemet
   Point:-2
   optional,can write any java statement.@ the end should be boolean
   Point:-3 
     optional,can write any java statemet

***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
 class Test
{
     public static void main(String[] args)
     {
      for (;;)
       {
           System.out.println("hello");
	   }
    }
	
}


hello
hello
hello
hello
hello
hello
hello
hello
hello
hello
C:\Users\dell1\Desktop>

EXPLANATION:- Infininte loop
============
for (;;)
       {
           System.out.println("hello");
	   }
***************************-----END of--->24<--------***************************
Example=25                  unreachable statement
=========
NOTE:-
-----
PROGRAME=25
=========
 class Test
{
     public static void main(String[] args)
     {
      for (int i=0;true;i++)
       {
           System.out.println("hello");
	   }
     	   System.out.println("hi");
    }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:9: error: unreachable statement
           System.out.println("hi");
           ^
1 error

EXPLANATION:-
============

  for (int i=0;true;i++)
       {
           System.out.println("hello");
	   }
           System.out.println("hi");
 

 condition is always true next statement never gets a chance so unreachable.

***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
PROGRAME=26
=========
 class Test
{
     public static void main(String[] args)
     {
      for (int i=0;false;i++)
       {
           System.out.println("hello");
	   }
     	 
    }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreachable statement
       {
       ^
1 error

EXPLANATION:-
============

	 for (int i=0;false;i++)
       {
           System.out.println("hello");
	   }
    
		 Condition is always false so for-loop body will never get a chance 

***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
	 class Test
{
     public static void main(String[] args)
     {
      for (int i=0;;i++)
       {
           System.out.println("hello");
	   }
          System.out.println("vinay");	 
    } 
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:9: error: unreachable statement
          System.out.println("vinay");
          ^
1 error

EXPLANATION:-
============
	 for (int i=0;;i++)
       {
           System.out.println("hello");
	   }
           System.out.println("vinay");	 

 If we are not writing any condition compiler will place the default condition as true
	 so it keep on executing.so System.out.println("vinay"); never gets a chance.
	 see the error.
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
	 class Test
{
     public static void main(String[] args)
     {
		 int a=10;
		 int b=20;
      for (int i=0;a<b;i++)
       {
           System.out.println("hello");
	   }
          System.out.println("vinay");	 
    } 
	
}
hello
hello
hello
hello
hello
hello
hello
hello
hello
hello

EXPLANATION:-
============
     	 int a=10;
		 int b=20;
      for (int i=0;a<b;i++)
       {
           System.out.println("hello");
	   }
          System.out.println("vinay");	 

 compiler dont know wheather it s true or false @ run time it might change.
	 so compiler takes it as true.

	 @ run time JVM descides the condition and JVM is not responsible to check unreachable statemetnt
		 so it executes.

 Doubt:-
	 @ compile time if compiler takes it as true the 
       the  System.out.println("vinay"); must be unreachable.
	 so while explaining do some other points. 


 Important Conclusion:-
	 @ run time JVM descides the condition proof is that see this programe output.
	 hello printed so many times.
     JVM  is desciding the condition. proof.
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
PROGRAME=29
=========
	 class Test
{
     public static void main(String[] args)
     {
		 int a=10;
		 int b=20;
      for (int i=0;a>b;i++)
       {
           System.out.println("hello");
	   }
          System.out.println("vinay");	 
    } 
	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
vinay

EXPLANATION:-
============
	In case of normal variables these particular condition 
	will be performed @ run time.
	
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
	class Test
{
     public static void main(String[] args)
     {
		final int a=10;
		final int b=20;
      for (int i=0;a>b;i++)
       {
           System.out.println("hello");
	   }
          System.out.println("vinay");	 
    } 
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: unreachable statement
       {
       ^
1 error

EXPLANATION:-
============
	compiler is aware that final varibles values we cannot change 
	so wat s the necessary of waiting till run time so @ compile time only descides the condition.

***************************-----END of--->30<--------***************************
Example=31
=========
NOTE:-
-----
PROGRAME=31
=========
	 class Test
{
     public static void main(String[] args)
     {
		final int a=10;
		final int b=20;
      for (int i=0;a<b;i++)
       {
           System.out.println("hello");
	   }
          System.out.println("vinay");	 
    } 
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: unreachable statement
          System.out.println("vinay");
          ^
1 error
EXPLANATION:-
============
    
    compiler is aware that final varibles values we cannot change 
	so wat s the necessary of waiting till run time so @ compile time only descides the condition.

***************************-----END of--->31<--------***************************
Example=32    Combination of final and normal variables
=========
NOTE:-
-----
PROGRAME=32
=========
	class Test
{
     public static void main(String[] args)
     {
		final int a=10;
		 int b=20;
      for (int i=0;a<b;i++)
       {
           System.out.println("hello");
	   }
          System.out.println("vinay");	 
    } 
	
}

hello
hello
hello
hello
hello
hello
hello
hello
hello
EXPLANATION:-
============
***************************-----END of--->32<--------***************************
Example=33
=========
NOTE:-
-----
PROGRAME=33
=========
	 class Test
{
	
  public static void main(String[] args)
  {
       int[][]x ={{10,20,30},{40,50,60}};
      for (int i = 0; i < x.length; i++)
      {
		int[] js = x[i];
		System.out.println(js);
	   }
	
}

}

EXPLANATION:-
============
***************************-----END of--->33<--------***************************
Example=34
=========
NOTE:-
-----
PROGRAME=34
=========
	class Test
{
	
  public static void main(String[] args)
  {
       int[][]x ={{10,20,30},{40,50,60}};
     for (int i = 0; i < x.length; i++)
     {
	System.out.println(x[i]);	
	 }
	
}

}

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
	Page 106(22 PDF)
	for-each loop limitations:-
	for -each loop is the best choice to retrive elements of array and collection.
	BUt its limitations is its applicable only for arrays and collection.
	and its not a general purpose loop.


	for (int i=0;i<10;i++ )
	{                                    
		System.out.println("hello");     ========> we can t write equivalent for-each loop.
	}
***************************-----END of--->35<--------***************************
Example=36
=========
NOTE:-
-----
 We can print the array elements in normal order or reverse order.
But using for-each loop we cannot print in reverse order.
	we have to print in normal order only.

PROGRAME=36
=========
	 class Test
{
     public static void main(String[] args)
     {
		int [] x ={10,20,30,40,50};
      for (int i=x.length -1;i>=0;i--)
       {
           System.out.println(x[i]);
	   }

    } 
	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
50
40
30
20
10

C:\Users\dell1\Desktop>

EXPLANATION:-
============
int [] x ={10,20,30,40,50};
  for (int i=x.length -1;i>=0;i--)
  {                             =====>Equivalent for -each loop to print in reverse order we can t write
     System.out.println(x[i]);
  }

Noraml for-loop:-we can print in original order or in reveese order.
for-each loop we can print only  in original order reverse order we can t print.

***************************-----END of--->36<--------***************************
Example=37
=========
NOTE:-
-----
PROGRAME=37
=========
EXPLANATION:-
============
	All array realted classes and collection implemented class already  implemented java.lang.Iterable interface.
	Being a programmer we are not requires to do anything just we should aware the points.
***************************-----END of--->37<--------***************************
Example=38
=========
NOTE:-
-----
PROGRAME=38
=========
EXPLANATION:-
============
	Collection is the root interface

page:-82(Hand written notes)

Iterable :-1.5 version
	    contains only one method i.e iterable()
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
