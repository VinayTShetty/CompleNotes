TOPIC:-MULTI THREADING
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
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
A separate flow of execution is called a Thread..
For every flow a separate job is there.


If only one flow is there then its called single Thread.
If multiple flows are there then Multiple Thread.

For every flow of Execution a separate independent JOB is there.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
class Test extends Thread
{
		public void run()
		{
			  for (int i=0;i<10;i++)
			  {
				  System.out.println("hello");
			  }
		}
   public static void main(String[] args)
	{
     
	 }
}
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Here we are overriding run method of Thread class.
run method is present in Thread class.

Inside the run method wat ever code/logic is there,that is called job of Thread.
If i start this Thread it will perform the job assigned inside run method.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class Test extends Thread
{
		public void run()
		{
			  for (int i=0;i<5;i++) ////Executed by Child Thread
			  {
				  System.out.println("Child Thread");
			  }
		}
   
}

class Main
{
       public static void main(String[] args)
	{
                //Point:-1 

			   Test t=new Test(); // Point:-2
			   t.start();

			   //Point:-3


			   //. . . . . code   
			   for (int i=0;i<5;i++) //Point:-4 //Executed by main Thread
			   {
                      System.out.println("main Thread");
			   }               
	 }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Main
main Thread
main Thread
main Thread
main Thread
main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread


main Thread calls main method..

here we get mixed output..so whenever dependency is not required,only task completion is required
at that time we should go for multithreading

coz see here main Thread logic and Child Thread logic will be executed simultaneously.

EXPLANATION:-
============
Point:- 1 
---------
Every java programe internally default contains one Thread that is main Thread.
(But internally severeal daemon Thread is  there)

Point:- 2
---------
main Thread creates Child Thread.,
This line is called instatiation.
t.sart(); --->This line executed by main Thread.that s why main Thread starts/creates Child Thread.
                                                           main Thread creates Child Thread Object.
Point:-3
--------
At this point of time 2 Thread are there i.e main Thread and Child Thread

Child Thread starts executing start method which internally executes the run method.

Point:-4
--------
Rest of the code will be exeuted by main Thread only..
(Vinay Point:- Child Thread won t come into picture)



Here observe Point :-3 and Point :-4 
 During Execution time main Thread and Child Thread starts executing simultaneously.
 independent of each other..
 We get mixed output.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
Thread Scheduler  may follow different algorithm It may be:-

Round Robin
Frist come Frsit serve
shortest job frist..

It varies from 
JVM to JVM,
System to  System

Thread Scheduler:-
------------------
It s part of JVM.
It is responsible to Schedule Thread 's'.i.e If multiple Threads are waiting to get the chance to
execution, then in which order Thread will be executed is descided by Thread Scheduler.
We can t Expect exact algorithm followed by Thread Scheduler its varied from JVM to JVM.
and we can t Expecet Thread execution order and exact output.
Hence whenever situation comes to multiThreading there is no gaurante for exact output.
but we can provide several Possible outputs.

 Output is not fixed..(explanation)

Child Thread and main Thread both job are independent job.
so y need to worry which will execute frist.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----

PROGRAME=5
=========
EXPLANATION:-
============
t.start() --->Whenever we are calling start () method.
It will Check any start() method is present in current class,If not there means Thread class start() method will
be executed.
Thread class start() method is responsible to start our Thread.
Thread class start() method  internally call MyThread run() method to execute.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
mdclass MyThread extends Thread
{
		public void run()
		{
			  for (int i=0;i<5;i++)
			  {
				  System.out.println("Child Thread");
			  }
		}
   
}

class ThreadDemo
{
       public static void main(String[] args)
	{
			   MyThread t=new MyThread(); 
			   t.run();
 
			   for (int i=0;i<5;i++) 
			   {
                      System.out.println("main Thread");
			   }               
	 }
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadDemo
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
main Thread
main Thread
main Thread
main Thread
main Thread
EXPLANATION:-
============

In the case of t.Start() a new Thread will be created for the execution of run() method..
But in the case of t.run() won t be created and run() method will be executed just like a normal method call by 
main Thread..


Hence in the above programe If we replace t.start() with t.run() then the output is constant..

Total output produced only by main Thread.
No new Thread will be created.
If i execute this code in any System/JVM/Machine, output always remain constant.
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
Need for calling Start() method internal reason.
Ex:-Kid joining to school process.
Leaving kid in front of school gate,and not doing properly formalities (Invalid approach) 

PROGRAME=7
=========

EXPLANATION:-
============
After Creating Thread object(MyThread t=new MyThread();) several internal responsibilities are There..
The following are the responsibilities.

Start()
{
   1)Registet this Thread with Thread Scheduler
   2)Perform all other activities
   3) Invoke run() method
}

Thread class start() method performs all These responsibilities..

Without calling Thread class Start() method there is no Chance of Strating a Thread in java.

Importance of Thread class  Start() method.
Thread class Start() method is responsible to perfom to register the Thread with Thread Scheduler 
and all other mandatory activities and hence we without Executing Thread class Start() method there is 
no Chance of starting a new Thread in java.
Due to this Thread class Start() method is considered as Heart of MultiThreading.

Start()
{
   1)Registet this Thread with Thread Scheduler
   2)Perform all other activities
   3) Invoke run() method
}
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class MyThread extends Thread
{
		public void run()
		{
			  System.out.println("no -args");
		}

				public void run(int x)
		{
			  System.out.println("no -args");
		}
   
}

class ThreadDemo
{
       public static void main(String[] args)
	{
			   MyThread t=new MyThread(); 
			   t.run();
	 }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadDemo
no -args

C:\Users\DELL\Desktop>
EXPLANATION:-
============
Overloding of run() method:-
Overloding of run() method is possible.
Thread class can can invoke no-arg run() method.
The other overloaded run() method we have to call explicitly like a normal method call.

Same concept of main () method,overloadig of main method is possible. 
But JVM always calling main() method with String args  only.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
If we are not overriding run() method:

PROGRAME=9
=========
class MyThread extends Thread
{
   
}

class ThreadDemo
{
       public static void main(String[] args)
	{
			   MyThread t=new MyThread(); 
			   t.start();
	 }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadDemo

C:\Users\DELL\Desktop>

EXPLANATION:-
============
 Thread class run method is having empty implementation.

MyThread t=new MyThread(); 
			   t.start();

Note:- 
t.start();
Even though we are not overriding run() method,its possible to create a Thread.

			   jvm is gonna see any run() method is in MyThread class.
			   If its not there in MyThread class Then Thread class run() method will be executed
			   That Thread class run method is having empty implemntation..

Its highly recomended to override run method in MyThread class to do a separate job.
If u are not overriding run method don t go for MultiThreading concept.


Durga Point:-
If we are not overiding run() method then Thread class run() method will be executed which has
empty implementation hence we won t get any output.

It s highly recomended to override run() method otherwise don t go for multiThreading concept.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Case 1:-

over riding start() method:-
----------------------------
JVM is gonna see any start() method is There in MyThread class,If its there then 
MyThread class start() method will be executed as normal method call.
New Thread will be not be created.
only main Thread is There..

Thread class start() method won t be executed.

PROGRAME=10
=========
class MyThread extends Thread
{
		public void run()
		{
			  System.out.println("Run method");
		}
		public void start()
		{
			  System.out.println("start method");
		}
   
}

class ThreadDemo
{
       public static void main(String[] args)
	{
			   MyThread t=new MyThread(); 
			   t.start();
			   System.out.println("main method");
	 }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadDemo
start method
main method

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Output:-

start method
main method

These output produced only by main Thread.

Durga Point:-If we override our start() method,then our start() method will be executed as a normal method call
and new Thread won t be created.

It is not recomended to override start() method,otherwise don t go for MultiThreading concept.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
Case 1:-

not over riding start() method:-
----------------------------
JVM is gonna see any start() method is There in MyThread class,If its not  there then 
Thread class start() method will be executed.which internally calls run() method.

PROGRAME=11
=========
class MyThread extends Thread
{
		public void run()
		{
			  System.out.println("Run method");
		}
}

class ThreadDemo
{
       public static void main(String[] args)
	{
			   MyThread t=new MyThread(); 
			   t.start();
			   System.out.println("main method");
	 }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadDemo
main method
Run method

C:\Users\DELL\Desktop>

EXPLANATION:-
============
2 Threads  are created.
Thread class start() method calls run method. 
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
1:24:00
 Another way of calling Thread class start() method.
PROGRAME=12
=========
class MyThread extends Thread
{
		public void run()
		{
			System.out.println("RUN");
        }
		public void Start()
		{     
			   super.start();
               System.out.println("START");
		}
   
}

class Test
{
       public static void main(String[] args)
	{
			   MyThread t=new MyThread(); 
			   t.Start();
			  System.out.println("MAIN");
              System.out.println("inside MAIN");
	 }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
START
MAIN
inside MAIN
RUN

C:\Users\DELL\Desktop>java Test
START
MAIN
inside MAIN
RUN

C:\Users\DELL\Desktop>java Test
START
RUN
MAIN
inside MAIN



-------------------------------------------------
Observe this last output...
Durga sir in session told  main Thread is responsible for execution of 

							  System.out.println("MAIN");
                              System.out.println("inside MAIN");

so it will come one after the other but, see we can t predict.
 
C:\Users\DELL\Desktop>java Test
START
MAIN
RUN
inside MAIN


1:24:00 Durga mistake telling that  
System.out.println("START");
System.out.println("MAIN");
System.out.println("inside MAIN");

These sop statements belong to one Thread so they will execute in order.
According to his concept.(Different Example aste)

EXPLANATION:-
============
super.start();
  After this line a new Thread is created.
  This new Thread calls run method.

***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
EXPLANATION:-
============
1)Thread life cycle.
2)We cannot a Thread again once started.
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
class MyThread extends Thread
{
	public void run(){System.out.println("run");}
}
class Test
{
       public static void main(String[] args)
	{
			   MyThread t=new MyThread(); 
			   t.start();
			  System.out.println("MAIN");
              t.start();
    }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
MAIN
run
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.start(Thread.java:705)
        at Test.main(Test.java:12)

C:\Users\DELL\Desktop>
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
