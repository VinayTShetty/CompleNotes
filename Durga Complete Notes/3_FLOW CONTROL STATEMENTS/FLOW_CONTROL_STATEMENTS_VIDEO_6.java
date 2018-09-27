TOPIC:-FLOW CONTROL STATEMENTS
--------
VIDEO NO=6
-----------
NUMBER OF PICTURES=3
------------------
 I:\JAVA NOTES\DURGA JAVA NOTES\FLOW CONTROL STATEMENTS\PICTURES

VIDEO COMPLETED=NO
-----------------
 After 25:00 so many incompleted concepts.
**************************************************************************************
IMPORTANT EXAMPLES:-10(*),18
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
  {
     for(int i=0; i<10; i++) 
     {
       if(i==5)
       break;
       System.out.println(i);
      }
   }
 }
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0
1
2
3
4

EXPLANATION:-
============
 break is used to exit from the condition of the loop.


 for(int i=0; i<10; i++) 
     {
       //if(i==5)
       break;
       //System.out.println(i);
      }


	  It exits out of for-loop {} only see this programe.

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
       int x=0;
      switch(x)
      {
          case 0:
          System.out.println("1");
		  
          case 1:
          System.out.println("2");
		  
          case 2:
          System.out.println("3");
          break ;
          case 3:
          System.out.println("4");
 
		  case 4:
          System.out.println("5");
   
       }
}
	}
	
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
1
2
3

EXPLANATION:-
============
 Same in the case of switch also.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-We should use break always inside  switch,loop along with {}.
-----
PROGRAME=3
=========
 class Test
 {
  public static void main(String args[])
  {    int x=10;
	  if(x==10)
		  System.out.println("hello");
	  break;
	  
   }
 }

 
C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: break outside switch or loop
          break;
          ^
1 error

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
  public static void main(String args[])
  {    int x=10;
	  if(x==10)
		  System.out.println("hello");
	  {
	  break;
	  }
   }
 }

 
C:\Users\dell1\Desktop>javac Test.java
Test.java:8: error: break outside switch or loop
          break;
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
  {    int x=10;
	
	  {
	  break;
	  }
   }
 }



C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: break outside switch or loop
          break;
          ^
1 error

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-We can use break inside label block also.
-----
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
EXPLANATION:-
============
We can use break in 3 places
Inside Switch to avoid fall through.
Inside loop to break the condition and exit out of loop.
***************************-----END of--->7<--------***************************
Example=8                       Break and continue.

=========
NOTE:-
-----

PROGRAME=8
=========
 class Test
{
	public static void main(String[] args)
   { 

       for (int i = 0; i < 10; i++)
        {
    	   System.out.println("Inside for-loop="+i);
		       if (i==5)
		       {
                System.out.println("Inside if block="+i);   
				break;
			   }
	    }
    }
}
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Inside for-loop=0
Inside for-loop=1
Inside for-loop=2
Inside for-loop=3
Inside for-loop=4
Inside for-loop=5
Inside if block=5
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
========= 
NOTE:-
-----
 It breaks the entire loop condition not the inner most loop.

PROGRAME=9
=========
class Test
{
	public static void main(String[] args)
   { 

       for (int i = 0; i < 10; i++)
        {
    	   System.out.println("Inside for-loop="+i);
		         if (i==5)
		         {
                    System.out.println("Inside 1st if block="+i);   
                    if (true)
 		             {
                        System.out.println("Inside 2nd if block="+i);   
                           if (true)
  		                     {
                                 System.out.println("Inside  3rd if block="+i);
                                 break;
                             }
 			          }
                
			     }
	    }
    }
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Inside for-loop=0
Inside for-loop=1
Inside for-loop=2
Inside for-loop=3
Inside for-loop=4
Inside for-loop=5
Inside 1st if block=5
Inside 2nd if block=5
Inside  3rd if block=5

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
In selective statement without curly braces we can write only one statement
after that we can take any java statmetnt.

PROGRAME=10
=========
  class Test
{
public static void main(String[] args) 
    {
           if(true)
        	   System.out.println("true body");
           int x=10;
           System.out.println(x);
    }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
true body
10
 
 case :-2
 -------
  class Test
{
public static void main(String[] args) 
    {
           if(false)
        	   System.out.println("true body");
           int x=10;
           System.out.println(x);
    }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
10

C:\Users\dell1\Desktop>

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
 break can be used in switch to stop fall through
 Inside loops to break loop execution based on some condition
 Inside  labeled blocks to break execution based on some condition 
PROGRAME=11
=========
 class Test
{
public static void main(String[] args) 
    {
       int x=10;
	   l:
		{
	   System.out.println("begin");
         if(x==10)
			 break l;
       System.out.println("end");
 	    }
       System.out.println("hello");
     }	
}

C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
begin
hello
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
 we cannot use somewhere else,If we using any where else we ll get CE

 
PROGRAME=12
=========
 class Test
{
public static void main(String[] args) 
    {
       int x=10;
           if(x==10)
			 break;
       System.out.println("hello");
      }	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:7: error: break outside switch or loop
                         break;
                         ^
1 error

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13                      continue statement.
=========
NOTE:-
-----
 
PROGRAME=13
=========
 class Test
{
public static void main(String[] args) 
   {   
	 
	 for (int i = 0; i<5; i++)
	  {		
        System.out.println(+i);
		         if (i==3) 
		       {
         	    System.out.println("inside if and vlaue of i="+i);
	            continue;
		       }
	     	System.out.println(i);
	  }
   }	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0
0
1
1
2
2
3
inside if and vlaue of i=3
4
4

EXPLANATION:-
============
 	 for (int i = 0; i<5; i++)
	  {		
        System.out.println(+i);
		         if (i==3) 
		       {
         	    System.out.println("inside if and vlaue of i="+i);
	            continue;
		       }
	     	System.out.println(i); // This sop statements won t get a chance when i==3
	  }   
	  
 It just skips the current iteration.

***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
 class Test
{
public static void main(String[] args) 
   {   
	 
	 for (int i = 0; i<5; i++)
	  {		
        System.out.println(+i);
		if (i==3) 
        continue; 
	    System.out.println(i);
	    System.out.println(i);
		
	  }
   }	
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
0
0
0
1
1
1
2
2
2
3
4
4
4

EXPLANATION:-
============
 for (int i = 0; i<5; i++)
	  {		
        System.out.println(+i);
		if (i==3)     //if its true                     //if false take chance of below sop statements
        continue;  
	    System.out.println(i); //Won t get the chance     
   	    System.out.println(i);//Won t get the chance
		
	  }
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-(22:00:00)
-----
Where we can use continue
 switch
 ------- 
switch 
 {
 
  inside switch one time execution,Every case will get chance only one time
  there s no terminology of iteration
  so inside switch we cannot use continue

 }

labeled block

l1:
{
  inside labeled block one time execution,Every statement will get chance only one time
  there s no terminology of iteration
  so inside labeled block we cannot use continue
  
}

 (Durga Point)conclusion:-so we can use continue statement inside loops,to skip currernt iteration 
and continue for next iteration.
If we are using somewhere else we ll get CE.continue outside of loop.
 
 (Vinay Point):-we can use continue statement where we can do iteration operation.



PROGRAME=15
=========
  class Test
{
public static void main(String[] args) 
   {  int x=10; 
	  if (x==10) 
        continue; 
	    System.out.println(x);
   }
   	
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: continue outside of loop
        continue;
        ^
1 error

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->15<--------***************************
Example=16                labeled break and continue
=========
NOTE:-
-----
 We can use labeled break and continue to break or continue a partcular loop
 in nested loops.
    
PROGRAME=16
=========
EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
----- 3 Pictures
 See pictures(32:00)
   I:\JAVA NOTES\DURGA JAVA NOTES\FLOW CONTROL STATEMENTS\PICTURES
PROGRAME=17
=========
  class Test
{
public static void main(String[] args) 
   {  
	l1: 
	   for (int i=0;i<10;i++)
       	 {
		     l2:
		    	 for (int j=0;i<10;i++)
	          {
			       for (int k=0;i<10;i++)
	               {
             
			    	   break;
			       }
               }
	     }
   }	
}

EXPLANATION:-
============
 
 Case 1:-

 l1: 
	   for (int i=0;i<10;i++)
       	 {
		     l2:
		    	 for (int j=0;i<10;i++)
	          {
			       for (int k=0;i<10;i++)
	               {
             
			    	   break; //This break wil come out of  for (int k=0;i<10;i++) {} loop
			       }
               }
	     }


 case 2:-

 l1: 
	   for (int i=0;i<10;i++)
       	 {
		     l2:
		    	 for (int j=0;i<10;i++)
	          {
			       for (int k=0;i<10;i++)
	               {
             
			    	   break l2; //This break wil come out of  for (int j=0;i<10;i++) {} loop
			       }
               }
	     }


case 3:-

 l1: 
	   for (int i=0;i<10;i++)
       	 {
		     l2:
		    	 for (int j=0;i<10;i++)
	          {
			       for (int k=0;i<10;i++)
	               {
             
			    	   break l1; //This break wil come out of  for for (int i=0;i<10;i++) {} loop
			       }
               }
	     }
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
 Page 112(PDF)
 PAge 84(Hand written notes)
 very important concept

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
