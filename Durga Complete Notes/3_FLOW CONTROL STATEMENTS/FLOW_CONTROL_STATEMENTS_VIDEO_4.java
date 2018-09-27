TOPIC:-OPERATOR AND ASSIGNMENTS
--------
VIDEO NO=4
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED= YES (do-while() Do some research.)
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-3,4,5,11
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
 If we know the iteration in advance then compulsary we should go for loop.
  Ex:- This iteration will print 10 times.

for (int i=0;i<10;i++ )
{
	sopln("hello");
}


we don t know the number of iteration then we should go For 
while loop.

EXPLANATION:-
============
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
while (argument)
{
	//action
}
The argument should be boolean type,if we are trying to provide any other type we ll get 
CE.
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
     while(true)
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
 If the condition is true always the While body will keep on Executing.
 then the sop statement ("hi") never going to get the chance so wat s the use of writing it.
 see the error..

 Example:-3
 ----------
   while(true)
     {
       System.out.println("hello");
      }
        System.out.println("hi"); ----->unreachable statemnet

 Example:-4
 ----------
  while(true)
     {           -------------------->unreachable statemnet
       System.out.println("hello");
      }
        System.out.println("hi"); 

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:- 
-----  
 DP:-
Compiler is responsible to check unreachable statement. 
JVM just executes,(JVM not responsible to check.)                                       

PROGRAME=4
=========
 class Test 
{
   public static void main(String args[])
   {
     while(false)
     {
       System.out.println("hello");
     }
        System.out.println("hi");
    }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreachable statement
     {
     ^
1 error

EXPLANATION:-
============
	 while(false)
     {
       System.out.println("hello");
     }
     System.out.println("hi");


 If the condition is false the body of the While i.e(curly braces) {

 while(false)
  {   --------->this will never get a chance to execute so wat s the use of writing the this blok

 Misunderstanding:-

         while(false)
     {
       System.out.println("hello");
     }
        System.out.println("hi");
       ^  ----> this sop statement("hi") is unreachable ..this is wrong concept.

 Right Concept:-The While body curly braces @ the begining is not getting the chance.
	 
 For proof see the CE line 6.


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
         while(10<20)
     {
       System.out.println("hello");
      }
        System.out.println("hi");
    }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: unreachable statement
        System.out.println("hi");
        ^
1 error

EXPLANATION:-
============

   while(10<20)   --->If the condition is fixed then Compiler always giving error as unreachable statement.
      {
       System.out.println("hello");
      }
        System.out.println("hi");

 If the condition is fixed then Compiler always giving error as unreachable statement.

    condition true----->After block the statemet is unreachable (Example:- 3)
              false---->Starting of the is unreachable (Example:- 4)
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
     while(x<y)
     {
       System.out.println("hello");
      }
        System.out.println("hi");
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
	  int x=10;
	  int y=20;
 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    // here x and y we can vary 
	//x=100,y=200 (changing the value is valid )
    //Point:-1
	 while(x<y)
     {
       System.out.println("hello");
      }
        System.out.println("hi");
    }


	Point:-1
		Here compiler is aware that condition can change depending on the x and y values.
		so it takes the present condition and gives the chance.
		JVM never worries about the unreachable statement it just Executes.
		In this condition is true so hello printed infinite times..

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
	  int y=20;
     while(x>y)
     {
       System.out.println("hello");
      }
        System.out.println("hi");
    }
}
 

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hi

EXPLANATION:-
============
	 Exact opposite of Example 7
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
    final  int x=10;
	final  int y=20;
     while(x>y)
     {
       System.out.println("hello");
      }
        System.out.println("hi");
    }
}
 

C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: unreachable statement
     {
     ^
1 error

EXPLANATION:-
============
  final  int x=10;
	final  int y=20;
     while(x>y)   ----->condition is fixed.@ compile time it is replaced with values(final variables)so CE
     {
       System.out.println("hello");
      }
        System.out.println("hi");
    }

    final int x=10;
	sopln(x);
	=10
 final value variable we cannot change during run time,
		so why to wait till run time @ compile time only i will allocate the value to x as 10 by compiler.

 
 final int x=10;   ====================sopln(10)
                    After Compilation
	
        int y=20;   ====================sopln(b) ====> @ run time i will allocate it
                     After Compilation

 

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========

EXPLANATION:-
============
	final int x=10;
	final int y=10;
	int c=20;
	sopln(a+b); ---->@ compile time(After compilation) only ----> sopln(10+10) --->20
	sopln(a-b); ---->@ compile time (After compilation) only ----> sopln(10-10) 0
	sopln(a>b); ---->@ compile time (After compilation) only ----> sopln(10>10) false
	sopln(a<b); ---->@ compile time (After compilation) only ----> sopln(10<10) false

	sopln(a+c); ---->@ compile time (After compilation)  ----> sopln(10+c)  pending--->(Run time )
    
	sopln(a>c); ---->@ compile time (After compilation)  ----> sopln(10>c)  pending--->(Run time)

***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
	case :-1(Both are Compile time constant)

	final int x=10;
	final int y=10;
	
	sopln(x>y); ---->@ compile time (After compilation) only ----> sopln(10>10) false

 sopln(a>b); ----->If both operation is compile time constant,that operation will be performed by
	               compiler only.(@ compile time only)
	               wat is the need of going till Run time.

	
	 case :-2(Only one is Compile time constant)

	int x=10;
	final int y=10;
	
sopln(x>10); ---->@ compile time (After compilation) --Pending-->JVM WILL PERFORM-- sopln(10>10)-- false

 sopln(a>b); ----->If any one operation is not compile time constant,that operation will be performed by
                   Run time.
***************************-----END of--->10<--------***************************
Example=11(50:00-video 4)
=========
NOTE:-{},;,non declarative statements must be there compulsary,
-----
PROGRAME=11
=========
 class Test 
{
   public static void main(String args[])
   {  
      do //nothing between do and while so error.
     while(true);
    }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: while expected
     while(true);
                 ^
Test.java:8: error: illegal start of expression
}
^
Test.java:8: error: reached end of file while parsing
}
 ^
Test.java:9: error: reached end of file while parsing
4 errors

C:\Users\dell1\Desktop>cls

EXPLANATION:-
============
      do
    
	 while(true);

Between do and while 
{},sop statement(non declarative),   ;  

Within these 3 any one of them is comppulssary requird.
BUt it s missing so CE 


 between do and while body is required,without body wat is the need of taking the loop.
 
 without {} between do and while  compulsary u should  take one statement that statement should not be 
 declarative
 
 atleast ; is mandatory.
 
If u dont want {} ,statement, ; .don t go For Loop concept.,wat s the use then ...? 

***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
 Expect Switch statements,Every Where curly braces are optional.

PROGRAME=12
=========
 
  class Test
{
public static void main(String args[])
  {    
     do
     System.out.println("hello");
     while (true);
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
 
EXPLANATION:-
============
 Between do and While atlest If not using {},
 means altlest one declarative statements or semicolon is mandatory.

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 class Test
{
public static void main(String args[])
   {    
     do;
	 System.out.println("hello");
     while (true);
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: while expected
     do;
        ^
Test.java:6: error: illegal start of expression
         System.out.println("hello");
               ^
Test.java:6: error: ')' expected
         System.out.println("hello");
                ^
Test.java:6: error: ';' expected
         System.out.println("hello");
                   ^
4 errors

EXPLANATION:-Immediately after semicolon or {} braces i need while() but writing sop so error.
============
     do;      --->already semicolon is there,immmediately after semicolon(;).i am excepting while loop
	               But u are writing sop statements,so see the errror,While Excepted.
   
   System.out.println("hello");
   while (true);
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
 class Test
{
public static void main(String args[])
   {    
     do;
	 while (true);
	 System.out.println("hello");
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: unreachable statement
         System.out.println("hello");
         ^
1 error

EXPLANATION:-
============
 do;   ---->NO Task is there so noting will be executed(Between do and While without{},using ; so valid )
while (true); -->its true so again we ll go for do so last sop statement will never get a chance so wat s use of writing
System.out.println("hello");


     do   <==GAP===>   ;     --->Same as above
	 while (true);
	 System.out.println("hello");
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
 class Test
{
public static void main(String args[])
   {    
     do         
     int x=10;
	 while (true);
	 System.out.println("hello");
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: variable declaration not allowed here
     int x=10;
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
public static void main(String args[])
   {    
     do;         
     int x=10;
	 while (true);
	 System.out.println("hello");
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: while expected
     do;
        ^
Test.java:6: error: ')' expected
     int x=10;
             ^
2 errors

EXPLANATION:-
============
      
     do;    //Ending with semicolon next line give me my while loop         
     int x=10; 
	 while (true);
	 System.out.println("hello");

	 See the error syntax also
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
 class Test
{
public static void main(String args[])
   {    
     do{         
     int x=10;}
	 while (true);
	 System.out.println("hello");
   }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: unreachable statement
         System.out.println("hello");
         ^
1 error

C:\Users\dell1\Desktop>

EXPLANATION:-
============
  do
  {         
     int x=10;
  }
	 while (true);  //If it s true,again control will go for do, so sop("hello") never gets a chance. 
System.out.println("hello");
 
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
 class Test
{
public static void main(String args[])
   {    
     do{         
     int x=10;}
	 while (true);
   }
}



C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test


EXPLANATION:-
============
(Reson we can see)
 PLEASE NOTE WE NEED TO SHUT DOWN JVM MANUALLY FOR THIS PROGRAME.

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test


***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
 class Test
{
public static void main(String args[])
   {    
     do
	 while (true);
   }
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: while expected
         while (true);
                      ^
Test.java:8: error: illegal start of expression
}
^
Test.java:8: error: reached end of file while parsing
}
 ^
Test.java:11: error: reached end of file while parsing
4 errors

EXPLANATION:-
============
do  //After do compiler always looking for ; and then While(),it found the semicolon(;).But where is While() ..?
while (true);



***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
 class Test
{
public static void main(String args[])
  {
	do
		    do
			   System.out.println("hello");
	    	while(false);
   while(false);
  }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
 class Test
{
public static void main(String args[])
  {
	do
		    do
			   System.out.println("hello");
	    	while(true);
   while(true);
  }
}

hello
hello
hello
hello
hello
hello
hello

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 do
		    do
			   System.out.println("hello");
	    	while(true); //Why compiler is unable to think that the last while(true) never getting a chance    
   while(true); //--->Not getting the chance compiler not aware

 The reason may be compiler will check chance probability only for non declarative and declarative statemnets
i guess.
For java loop or inbuild functions it won t check chance i feel.Do some research.




Check Example 27 this point may be invalid.

***************************-----END of--->21<--------***************************
Example=22
=========
NOTE:-
-----
PROGRAME=22
=========
 class Test
{
public static void main(String args[])
  {
	do
		    do
			   System.out.println("hello");
	    	while(true);
   while(false);
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
hello

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 do
		    do
			   System.out.println("hello");
	    	while(true);
   while(false);
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
 Procedure:-
 
 1)After do compiler will check correponding while();


  Between Do while it will check compulsary check For these things.
 
  case 1:-Then check for {}
  case 2:-non declarative statement
  case 3:- semicolon(;)

EXPLANATION:-
============
***************************-----END of--->23<--------***************************
Example=24
=========
NOTE:-
-----
PROGRAME=24
=========
 class Test
{
public static void main(String args[])
  {
	do
		    do
			   System.out.println("hello");
	           while(true)
	    	while(false);
   while(false);
  }
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: ';' expected
                   while(true)
                              ^
1 error
EXPLANATION:-
============
  case 2:- error below

do //-->A
		
		do//-->B
			      System.out.println("hello");
	              while(true) //--->Point 1
	    
		while(false);//-->B

while(false);//-->A


 Point :-1
 ---------
 its not part of do while it s separate While();

         do//-->B
			      System.out.println("hello");
	              while(true) // observe here.
	    
		while(false);//-->B

 General case of while() study while () frist.








-----------------------------------------------------------------------------------------------
Case 1:-
--------
 class Test
{
public static void main(String[] args) 
  {
	while(true);
	System.out.println("hello");
  }	
}



C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreachable statement
        System.out.println("hello");
        ^
1 error
 
 we can write like this also

while(true)  --->GAP<---         ;
	
	System.out.println("hello");

	GAP will get the chance sop("hello") won t get chance.
----------------------------------------------------------
 case 2 :-
 class Test
{
public static void main(String[] args) 
  {
	while(true)
	System.out.println("hello");
  }	
}
 
 Infinite times.
hello
hello
hello
hello
hello

C:\Users\dell1\Desktop>
----------------------------------------------------------

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
 class Test
{
public static void main(String args[])
  {
	do
		    do
		       while(true)
			   System.out.println("hello");
		     
	    	while(false);
   while(false);
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
C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
  class Test
{
public static void main(String args[])
  {
	do
		    do
			   System.out.println("hello");
	           while(true);
	    	while(false);
   while(false);
  }
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: unreachable statement
   while(false);
   ^
Test.java:10: error: unreachable statement
   while(false);
               ^
2 errors

EXPLANATION:-
============
 	do
		    do
			   System.out.println("hello");
	           while(true);
	    	while(false);
   while(false);




We can Write like this

 do //-->A
		 
		 do//-->B
	     		   System.out.println("hello");
     	           while(true) --->GAP <---     ;
	    
		while(false);//-->B


while(false);//-->A

 Conclusion See before semicolon GAP part will get chance,remaining lines wont get.

 while(true) --->GAP <---     ;

***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
 class Test
{
public static void main(String args[])
  {   
       do
    	        do
    		       System.out.println("hello");
    	    	while(false);
      while(false);
    	   while(false);
   }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: unreachable statement
           while(false);
                       ^
1 error
EXPLANATION:-
============
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-For while,and for,we cannot use hardcoded false function.
-----
PROGRAME=29
=========
 class Test
{
public static void main(String args[])
      {   
	    while(false)
	    {
           System.out.println("vinay");
	    }
      }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreachable statement
            {
            ^
1 error

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
	 class Test
{
public static void main(String args[])
      {   
	    while(false)
	    System.out.println("vinay");
	    
      }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: unreachable statement
            System.out.println("vinay");
            ^
1 error
EXPLANATION:-
============
***************************-----END of--->30<--------***************************
Example=31
=========
NOTE:-
-----
PROGRAME=31
=========
 class Test
{
public static void main(String args[])
      {   
	    while(false);
	    
      }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:5: error: unreachable statement
            while(false);
                        ^
1 error				 
EXPLANATION:-
============
***************************-----END of--->31<--------***************************
Example=32
=========
NOTE:-
-----
PROGRAME=32
=========
 class Test
{
public static void main(String args[])
      {   
	 for (int i=0;false;i++)
	 {
		 System.out.println("heelo");
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
***************************-----END of--->32<--------***************************
Example=33
=========
NOTE:-
-----
PROGRAME=33
========= 

EXPLANATION:-
============
	Between 
	do
	// {}  ;  non declaraative statement. --->mandatory.
	while (false);
***************************-----END of--->33<--------***************************
Example=34
=========
NOTE:-
-----
	do while(true)
       System.out.println("hello");
       while (false);

PROGRAME=34
=========
 class Test
{
public static void main(String args[])
      {   
       do
       while(true)
		   System.out.println("hello");
       while (false);
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
C:\Users\dell1\Desktop>

EXPLANATION:-
============
	do
           while(true)
		   System.out.println("hello");
       while (false); ------>it won t get a chance to execute it does nt mean it s
		                     not reachable coz 
		                     once it entered do the corresponding while is always reachable. 


		   once it entered the do-the corresponding while() is reachable (Durga Point.)
***************************-----END of--->34<--------***************************
                      UNREACHABLE PROBLEMS
		   
		   
Example=35
=========
NOTE:-
-----
PROGRAME=35
=========
	class Test
{
public static void main(String args[])
      {   
    do
    {
		System.out.println("hello");
    }
    while (true);
     	System.out.println("viany");
      }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:10: error: unreachable statement
        System.out.println("viany");
        ^
1 error
EXPLANATION:-
============
***************************-----END of--->35<--------***************************
Example=36
=========
NOTE:-
-----
PROGRAME=36
=========
 class Test
{
public static void main(String args[])
      {   
    do
    {
		System.out.println("hello");
    }
    while (false);
     	System.out.println("viany");
      }
	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
viany

EXPLANATION:-
============
***************************-----END of--->36<--------***************************
Example=37
=========
NOTE:-
-----
PROGRAME=37
=========
	class Test
{
public static void main(String args[])
      {   
	int x=10;
	int y=20;
    do
    {
		System.out.println("hello");
    }
    while (x<y);
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
		int x=10;
	int y=20;
    do
    {
		System.out.println("hello");
    }
    while (x<y);
     	System.out.println("vinay"); ---->Point 1


			Point :-1
				This sop may never get a chance but it s not unraechable coz @ run time x and y value may 
				change.
                Durga Point:-compiler unable to check the condition
				and JVM not responsible to check unreachable statments.

***************************-----END of--->37<--------***************************
Example=38
=========
NOTE:-
-----
PROGRAME=38
=========
	class Test
{
public static void main(String args[])
      {   
	int x=10;
	int y=20;
    do
    {
		System.out.println("hello");
    }
    while (x>y);
     	System.out.println("vinay");
      }
	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
vinay

EXPLANATION:-
============
***************************-----END of--->38<--------***************************
Example=39
=========
NOTE:-
-----
PROGRAME=39
=========
	class Test
{
public static void main(String args[])
      {   
	  final int x=10;
      final	int y=20;
    do
    {
		System.out.println("hello");
    }
    while (x<y);
     	System.out.println("vinay");
      }
	
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:12: error: unreachable statement
        System.out.println("vinay");
        ^
1 error

EXPLANATION:-
============
	  final int x=10;
      final	int y=20;
    do
    {
		System.out.println("hello");
    }
    while (x<y); //Point:-1
     	System.out.println("vinay");
      }
	

	Point:-1
     @ compile time only it s value has been intialized
		coz we are not gonna change it,

***************************-----END of--->39<--------***************************
Example=40
=========
NOTE:-
-----
PROGRAME=40
=========
	class Test
{
public static void main(String args[])
      {   
	  final int x=10;
      final	int y=20;
    do
    {
		System.out.println("hello");
    }
    while (x>y);//Point:-1
     	System.out.println("vinay");
      }
	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
hello
vinay

C:\Users\dell1\Desktop>

EXPLANATION:-
============
	Point:-1
    @ compile time only it s value has been intialized
		coz we are not gonna change it,
	  
***************************-----END of--->40<--------***************************
Example=41
=========
NOTE:- Default condition will be true.
-----
PROGRAME=41
=========
class Test
{
public static void main(String args[])
  {   int x=10;
      int y=20;
     do 
      { 
    	 while(true)
		System.out.println("hello");
	  }
      while (x>y);//default condition true it will consider
     System.out.println("vinay");
     
   }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:12: error: unreachable statement
     System.out.println("vinay");
     ^
1 error

EXPLANATION:-
============
	 int x=10;
      int y=20;
     do 
      { 
    	 while(true)
		System.out.println("hello");
	  }
      while (x>y);//Point 1
     System.out.println("vinay");
     
   }
	

	Point:-1 @ compile time it takes the default condition as true if the condition 
	depends on run time by the variables.
	so the lase sop("") is unreacable.
***************************-----END of--->41<--------***************************
Example=42
=========
NOTE:-
-----
PROGRAME=42
=========
 class Test
{
public static void main(String args[])
  {   int x=10;
      int y=20;
     do 
      { 
    	 while(true)
		System.out.println("hello");
	  }
      while (x<y);//default condition true it will consider
     System.out.println("vinay");
     
   }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:12: error: unreachable statement
     System.out.println("vinay");
     ^
1 error

EXPLANATION:-
============
***************************-----END of--->42<--------***************************
Example=43
=========
NOTE:-
-----
PROGRAME=43
=========
 class Test
{
public static void main(String args[])
  {   int x=10;
      int y=20;
     do 
      { 
    	 while(true)
		System.out.println("hello");
	  }
      while (false);
     System.out.println("vinay");
     
   }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:12: error: unreachable statement
     System.out.println("vinay");
     ^
1 error
EXPLANATION:-
============
do 
 { 
   while(true)
	System.out.println("hello");
  }
while (false)     /*Gap */  ;   // gap concept wont come into picture bcoz in do-while();,while(-->;) semicolon in compulsary.
     System.out.println("vinay");

	Semicolon is mandotory in do-while();
	For while(); 




 In Example :-43 after while(false) /*Gap we cannot write any thing, coz next statement wont get the chance*/;
***************************-----END of--->43<--------***************************
Example=44
=========
NOTE:-
-----
PROGRAME=44
=========
 class Test
{
public static void main(String args[])
  {   int x=10;
      int y=20;
     do 
      { 
    	 while(true)
		System.out.println("hello");
	  }
      while (false)
     System.out.println("vinay");
     
   }
	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:11: error: ';' expected
      while (false)
                   ^
1 error

EXPLANATION:-
============
 do 
      { 
    	 while(true)
		System.out.println("hello");
	  }
      while (false)
     System.out.println("vinay");

  For while() semicolon is mandatory. 

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
