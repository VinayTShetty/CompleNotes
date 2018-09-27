TOPIC:-MULTI THREADING 
--------
VIDEO NO=3
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

Defining a Thread by implementing a runnable interface.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
class MyRunnable implements Runnable
{
	public void run()
	{
	  for (int i=0;i <5;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  r.start();
	}

}
C:\Users\DELL\Desktop>javac Test.java
Test.java:17: error: cannot find symbol
                  r.start();
                   ^
  symbol:   method start()
  location: variable r of type MyRunnable
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Runnnable is an interface it contains only one method that is run() method..
It does nt have start() method..

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class MyRunnable implements Runnable
{
	public void run()
	{
	  for (int i=0;i <5;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread();
		  t.start();

          for (int i=0;i<10;i++)
          {
            System.out.println("main mehtod");
          }
	}

}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod

EXPLANATION:-
============

public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
          Thread t =new Thread();
		  t.start();
 
 Thread class start method will be executed,which internally calls Thread class run() method having empty
	 implementation.

Vinay Point:-(Invalid)

	 I guess no new Thread will be created.
	 coz start method to perform interanl responsibilities there is no Thread..

****** 5*
DURGA POINT:-(VALID)
*****
	When ever we call Thread class start () method compulsary one Thread will be created.
	In this Example Thread class run() method will be executed whick is having empty implementation.
    
    Thread will be created pakka

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
	class MyRunnable implements Runnable
{
	public void run()
	{
	  for (int i=0;i<10;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread(r);
		  t.start();

          for (int i=0;i<10;i++)
          {
            System.out.println("main mehtod");
          }
	}

}

C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
main mehtod
main mehtod
main mehtod
main mehtod
Run method

EXPLANATION:-
============
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread(r);
		  t.start();
                                            

=====>
	         To start the Thread compulsary we need to execute Thread class start method.
			  so create a Thread class object.
			  Thread t =new Thread();
              t.start();
			  so Thread class start() method intrenally calls Thread class Run method with empty implementation.
              Thread will be created
             
=====>
	              so to execute MyThread run method pass the class objecet to Thread class argument..
                     MyRunnable r =new MyRunnable();
        		    Thread t =new Thread(r);
		            t.start();
					So MyThread class run method will be executed.
		           Thread is obiviously created.
					
Thread class Constructor...
          Thread class one of the constructor:-

	               public Thread(Runnable target) {
        init(null, target, "Thread-" + nextThreadNum(), 0);
    } 


See its expecting Runnable type only or its Child also OK it will accept.
	its Child meand MyThread see.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
Am  having one doubt that don t extend(Thread) or implement(Runnable) Just create a class and
	pass that class reference in Thread class argument.

PROGRAME=5
=========
class MyRunnable 
{
	public void run()
	{
	  for (int i=0;i<10;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread(r);
		  t.start();

          for (int i=0;i<10;i++)
          {
            System.out.println("main mehtod");
          }
	}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:17: error: no suitable constructor found for Thread(MyRunnable)
                  Thread t =new Thread(r);
                            ^
    constructor Thread.Thread(Runnable) is not applicable
      (argument mismatch; MyRunnable cannot be converted to Runnable)
    constructor Thread.Thread(String) is not applicable
      (argument mismatch; MyRunnable cannot be converted to String)
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error

C:\Users\DELL\Desktop>

EXPLANATION:-
============
	Thread class one of the constructor:-

	               public Thread(Runnable target) {
        init(null, target, "Thread-" + nextThreadNum(), 0);
    } 


See its expecting Runnable type only or its Child also OK it will accept.
	its Child means MyThread see.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
		
We can create multiple Thread no problem at all.

PROGRAME=6
=========

	class MyRunnable implements Runnable 
{
	public void run()
	{
	  for (int i=0;i<3;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread(r);
		  t.start();
          
		  Thread t1 =new Thread(r);
		  t1.start();
 
          Thread t2 =new Thread(r);
		  t2.start();
 
          for (int i=0;i<10;i++)
          {
            System.out.println("main mehtod");
          }
	}
}


C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
	class MyRunnable extends Thread implements Runnable 
{
	public void run()
	{
	  for (int i=0;i<10;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread();
		  t.start();
          
         for (int i=0;i<10;i++)
          {
            System.out.println("main mehtod");
          }
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod

EXPLANATION:-
============
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread();
		  t.start();

Vinay Point:-
--------------
 Thread class start method will be executed and internally calls Thread class run method with empty implementation 
	 i guess..
Here only one Thread is there that is main Thread.
	main Thread created another Child Thread,
That Child Thread calls Thread class start() method which internally calls Thread class run method with empty implementation..
 so totally 2 Thread will be created...





Case 2:-
-------
	See here 2 Thread will be created..

	class MyRunnable extends Thread implements Runnable 
{
	public void run()
	{
	  for (int i=0;i<10;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  r.start();
          
         for (int i=0;i<20;i++)
          {
            System.out.println("main mehtod");
          }
	}
}

C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
Same case as extends Thread i guess..	

PROGRAME=8
=========
	class MyRunnable extends Thread implements Runnable 
{
	public void run()
	{
	  for (int i=0;i<10;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  Thread t =new Thread(r);
		  t.start();
          
         for (int i=0;i<20;i++)
          {
            System.out.println("main mehtod");
          }
	}
}

C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
Run method
Run method
Run method
Run method
Run method
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
Run method
Run method
Run method
Run method
Run method
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
	class MyRunnable extends Thread implements Runnable 
{
	public void run()
	{
	  for (int i=0;i<10;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo 
{
	public static void main(String []args)
	{
          MyRunnable r =new MyRunnable();
		  r.start();
          
         for (int i=0;i<20;i++)
          {
            System.out.println("main mehtod");
          }
	}
}

C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
Run method
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod

EXPLANATION:-
============
	Child Thread is created see it calls MyThreadDemo run() method..
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
Case 4:-
--------
	          MyRunnable r=new MyRunnable();
             Thread t2=new Thread(r);
		     t2.run();
PDF:-13(13)
	20:32

	Durga told run method will be executed.(Right)
	and by using t2 we can call MyRunnable  class run method (wrong)
    
    and by using t2 we can call Thread class run method internaaly how it calls MyRunnable  class
    run() method see below Explanation.

PROGRAME=10
=========
class MyRunnable implements Runnable 
{
	public void run()
	{
	  for (int i=0;i<5;i++)
	  {
		  System.out.println("Run method");
	  }
	}
}

class ThreadDemo
{
	public static void main(String []args)
	{
          MyRunnable r=new MyRunnable();
         Thread t2=new Thread(r);
		 t2.run();
          
         for (int i=0;i<5;i++)
          {
            System.out.println("main mehtod");
          }
	}
}


C:\Users\DELL\Desktop>java ThreadDemo
Run method
Run method
Run method
Run method
Run method
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod


EXPLANATION:-
============
	

         MyRunnable r=new MyRunnable();
         Thread t2=new Thread(r);
		 t2.run();
 
 No new Thread will be created.
 See important point here t2.run(); Thread class run method will be executed.Check in eclipse If u have doubt.
 but internally the logic implemnented in that run() method of Thread class is below,
 
 MyRunnable  run method will be exececuted by a normal method call...


If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called; 
otherwise, this method does nothing and returns. 
Subclasses of Thread should override this method.

Specified by: run() in Runnable
See Also:start()stop()Thread(ThreadGroup, Runnable, String)
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
	Case 4:- (But Vinay R&D)

PROGRAME=11
=========
	class MyRunnable implements Runnable 
{
}

class ThreadDemo
{
	public static void main(String []args)
	{
          MyRunnable r=new MyRunnable();
         Thread t2=new Thread(r);
		 t2.run();
          
         for (int i=0;i<5;i++)
          {
            System.out.println("main mehtod");
          }
	}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:1: error: MyRunnable is not abstract and does not override abstract method run() in Runnable
class MyRunnable implements Runnable
^
1 error
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
EXPLANATION:-
============
Case study:

MyRunnable r=new MyRunnable();
Thread t1=new Thread();
Thread t2=new Thread(r);

Case 1:
	
t1.start():

A new Thread will be created which is responsible for the execution of Thread class
run()method having empty implementation..



Case 5: r.start():

We will get compile time error saying start()method is not available in MyRunnable
class.

	Durga Point:-MyRunnable class does nt have start() capability..
		it means CFS error..
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
EXPLANATION:-
============
		Which is the best way to create/define a Thread....?

		1)extending Thread class--->Not Recomended. 
        2)implementing Runnable interface. --->Recomended..


1)extending Thread class 

It always extends Thread class ,there is no chance of extending any other class...
We cannot extend any other class..
We are missing inheritance advantage...

class MyThread extends Thread
 {

 }
 
 
2)implementing Runnable interface.
In the second approach While implementing Runnable interface we can extend Test class or any class,
	Which we want..Hence we won t miss any inheritance benefit..
	Because of above reason implementing Runnable interface approach is recomended then extending Thread class..

b)Memory level good
c)Performance level good
	class MyRunnable extends Test implements Runnable 
	{
	}

class Test
{
	//50 methods
}

so its advantageous in 2nd approach..
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============
	Thread class constructors

1)Thread t=new Thread(ThreadGroup g,String name);

Based on functionality we can group the Thread is called ThreadGroup..


2)Thread t=new Thread(ThreadGroup g,Runnable r,String name,long stackSize);
  For every Thread JVM is gonna create one RunTimeStack,
	  How much size we want for RunTimeStack,

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
	Another way of defining Thread..
	Hybrid Approach.

PROGRAME=15
=========
class MyThread extends Thread
{

public void run()
	{
          	for (int i=0;i<30;i++)
          {
            System.out.println("run mehtod");
          }	
     }

}
class ThreadDemo
{
	public static void main(String []args)
	{
		  MyThread t =new MyThread();
         Thread t1=new Thread(t);
		 t1.start();
          
         for (int i=0;i<50;i++)
          {
            System.out.println("main mehtod");
          }
	}
}


C:\Users\DELL\Desktop>java ThreadDemo
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod

EXPLANATION:-
============

	Example:-10
    -----------
  public static void main(String []args)
	{
		  MyThread t =new MyThread();
         Thread t1=new Thread(t);
		 t1.start();

 Thread class constructor can accept Runnable types.
	 so here

         ----> Runnable
 	          ----->Thread
	                ----->MyThread     
			 
 MyThread reference is indirectly Child of Runnable so it will accept and execute the MyThread class run() method..

	public Thread(Runnable target) {
        init(null, target, "Thread-" + nextThreadNum(), 0);


---------------------------------------------
public static void main(String []args)
	{
		  MyThread t =new MyThread();
         Thread t1=new Thread(t);
		 t1.start();

t1.start(); --->Thread class start method will be executed(Check in eclipse)
2 Threads are There main Thread and Child Thread..

Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread. 
The result is that two threads are running concurrently: the current thread 
(which returns from the call to the start method) and the other thread (which executes its run method).

It is never legal to start a thread more than once. In particular, a thread may not be restarted once it has completed execution.
Throws:IllegalThreadStateException - if the thread was already started.See Also:run()stop()
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-From Example 10
-----
PROGRAME=16
=========
	class MyThread extends Thread
{

public void run()
	{
          	for (int i=0;i<20;i++)
          {
            System.out.println("run mehtod");
          }	
     }

}
class ThreadDemo
{
	public static void main(String []args)
	{
		  MyThread t =new MyThread();
         Thread t1=new Thread(t);
		 t1.run();
          
         for (int i=0;i<20;i++)
          {
            System.out.println("main mehtod");
          }
	}
}


C:\Users\DELL\Desktop>java ThreadDemo
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
run mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod
main mehtod

EXPLANATION:-
============
As discussion from Example:-10

	public static void main(String []args)
	{
		  MyThread t =new MyThread();
         Thread t1=new Thread(t);
		 t1.run();

		 No new Thread will be created It will call Thread class run method which internally calls 
         MyThread class run() method..
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
EXPLANATION:-
============
			 Cmd

			 
C:\Users\DELL>cd \

C:\>
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
	getting and setting name of a Thread 
	Every Thread in java has some name,
	It may be default name generated by JVM or customized name provided by programmer.

	We can get and set name of a Thread by using the following 2 methods of Thread class.
		public final String getName()
        public final void setName(String name)


PROGRAME=18
=========
class MyThread extends Thread
{

}

class Test
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		MyThread t=new MyThread();
		System.out.println(t.getName()); //Point:-1
		Thread.currentThread().setName("Vinay Soft Solution");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main
Thread-0
Vinay Soft Solution
Exception in thread "Vinay Soft Solution" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:15)

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Point:-1(Vinay Point)
	----->New Thread is just instatianted its not started.to start Thread we need to call start() method..
------------------------------------
	Exception in thread "Vinay Soft Solution" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:15)
See we are changing the name of Thread. its showing...
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
-----
PROGRAME=19
=========
	class MyThread extends Thread
{
     public void run()
	{
		 System.out.println("This run () method executed by  :"+Thread.currentThread().getName());
	}
}

class Test
{
	public static void main(String[] args)
	{
		System.out.println("This main  () starting method executed by  :"+Thread.currentThread().getName());
		MyThread t=new MyThread();
        t.start();
		System.out.println("This main  () ending method executed by  :"+Thread.currentThread().getName());
		
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
This main  () starting method executed by  :main
This main  () ending method executed by  :main
This run () method executed by  :Thread-0

C:\Users\DELL\Desktop>

EXPLANATION:-
============
	We can get current Executing Thread Object using Thread.currentThread() method.


	This run () method executed by  :Thread-0 //coz we have not giving any name..
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
