TOPIC:-MULTI THREADING
--------
VIDEO NO=6
-----------
NUMBER OF PICTURES=
------------------
1--->H:\JAVA NOTES\DURGA JAVA NOTES\MULTI THREADING\MULTI_THREADING_VIDEO_6

VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-

EXAMPLES:- 11
EXAMPLES:- 12
EXAMPLES:- 18
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
Case :-1 We can t call getName() method If our class doesent extend Thread class,coz getName() is in Thread class
-------- (General Case)
class MyThread extends Thread 
{
	public void run()
		{
           Test t=new Test();
		   System.out.println(" ----"+t.getName());
           System.out.println("Run method executed by"+Thread.currentThread().getName());
	    }
}
class Test {
	public static void main(String[] args) throws InterruptedException 
	{
        System.out.println(Thread.currentThread().getName());
		MyThread t = new MyThread();
		t.start();
        System.out.println(t.getName());
	}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:6: error: cannot find symbol
                   System.out.println(" ----"+t.getName());
                                               ^
  symbol:   method getName()
  location: variable t of type Test
1 error

C:\Users\DELL\Desktop>

------------------------------------------------------------------------------------------------------------

Case 2:- 
-------
See this Programe how Thread is getting the name every time we are creating an instance of a class.
so this concept is very important in future topics.

class MyThread extends Thread 
{
	public void run()
		{
           Test t=new Test();
		   System.out.println("-----"+t.getName());
           System.out.println("Run method executed by"+Thread.currentThread().getName());
		   System.out.println("======"+new MyThread().getName());
	    }
}
class Test extends Thread
	{
	public static void main(String[] args) throws InterruptedException 
	{
        System.out.println("main=="+Thread.currentThread().getName());
		MyThread t = new MyThread();
		t.start();
        System.out.println("****"+t.getName());
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main==main
****Thread-0
-----Thread-1
Run method executed byThread-0
======Thread-2

C:\Users\DELL\Desktop>


Case 2:-In this only 2 Thread are there that is main and Thread-0.
Remaining Thread have got their name but have not started.
-------------------------------------------------------------------------------------------------------------
EXPLANATION:-
============
Thread.currentThread().getName();


It s Present in Thread class 

public static native Thread currentThread();

public final String getName() 
	{
        return name;
    }

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
Case 1:- (General Case getting error.)
-------- //Analysis This error due to overriding rules i guess so find out the reason..
        //Internal reason for using try-catch and not throws keyword..
class MyThread extends Thread 
{
	public void run() throws InterruptedException
		{
           Test t=new Test();
		   t.join(); //Point:-1
        }
}
class Test extends Thread
	{
	public static void main(String[] args) throws InterruptedException 
	{
      	MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}
    }
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:3: error: run() in MyThread cannot implement run() in Runnable
        public void run() throws InterruptedException
                    ^
  overridden method does not throw InterruptedException
1 error

C:\Users\DELL\Desktop>
  
 classes Presennt in Thread class..
 
1)public final void join() throws InterruptedException 
	{
        join(0);
    }
2)@Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }

-------------------------------------------------------------------------------------------------------
REQUIREMENT IS TO STOP CHILD THREAD HAS TO WAIT UNTILL COMPLETING MAIN THREAD

Case 2:-
--------
class MyThread extends Thread 
{
	public void run() 
		{
           Test t=new Test();
		   try
		   {
    			t.join(); //Point:-1
		   }
		   catch (InterruptedException ie){}
                
          for (int i = 0; i < 5; i++)
		    {
		       System.out.println("Child Thread");
            }


        }
}
class Test extends Thread
	{
	public static void main(String[] args) throws InterruptedException 
	{
      	MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(1000);
			System.out.println("Main Thread");
		}
    }
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread

C:\Users\DELL\Desktop>

w.r.to Example 1 case 2:-

 Here in run method Child Thread(i.e Thread-0) is asking that it will wait untill completing 
 Thread-1 { i.e Test t=new Test();
                   t.join();     }
 But make sure Thread -1 has not yet called start() method so Thread-1 is not created..

Programe Flow:-
so main method(main Thread) creates Child Thread ,Child Thread executes run() method,
inside run() method Thread-1{ i.e Test t=new Test();
                               t.join();     }   is assigned..

So Child Thread(Thread-0) asking Thread-1 ok will Wait untill Thread-1 completes.,But Thread-1 actually not created
only so Child Thread continue its Execution.

-------------------------------------------------------------------------------------------------------
Case 3:-  Very nice example see here  main Thread creates by Child Thread
-------   and Child Thread is Creating another Grand Child Thread.
            
			we are telling Child Thread to wait untill completing Grand Child.
            so Child Thread is waiting see untill completing Grand Child Thread.

			But main Thread is not waiting....
       


class MyThread extends Thread 
{
	public void run() 
		{
           Test t=new Test();
		   try
		   {    
    			t.start();
				t.join(); 
		   }
		   catch (InterruptedException ie){}
                
          for (int i = 0; i < 5; i++)
		    {
		       System.out.println("Child Thread");
            }


        }
}
class Test extends Thread
	{
		public void run()
			{
		           for (int i = 0; i < 5; i++)
		             {          
					           try
					           {
								 Thread.sleep(2000);
					           }
					           catch (InterruptedException ie)
					           {
					           }
	                 	       System.out.println(Thread.currentThread().getName());
                     }
		    }

	public static void main(String[] args) throws InterruptedException 
	{
      	MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(1000);
			System.out.println("Main Thread");
		}
    }
}




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Main Thread
Main Thread
Thread-1
Main Thread
Main Thread
Thread-1
Main Thread
Thread-1
Thread-1
Thread-1
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

C:\Users\DELL\Desktop>
-------------------------------------------------------------------------------------------------------
EXPLANATION:-
============

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class MyThread extends Thread 
{
	public void run() 
		{
           Test t=new Test();
		   try
		   {    
    			t.start();
				t.join(); 
		   }
		   catch (InterruptedException ie){}
                
          for (int i = 0; i < 5; i++)
		    {
		       System.out.println(Thread.currentThread().getName());
            }


        }
}
class Test extends Thread
	{
		public void run()
			{
		           for (int i = 0; i < 5; i++)
		             {          
					           try
					           {
								 Thread.sleep(2000);
					           }
					           catch (InterruptedException ie)
					           {
					           }
	                 	       System.out.println(Thread.currentThread().getName());
                     }
		    }

	public static void main(String[] args) throws InterruptedException 
	{
      	MyThread t = new MyThread();
		t.start();
		t.join();
		for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		}
    }
}
 
 
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
main
main
main
main
main

EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
Waiting of child Thread untill completing main Thread :
----------------------------------------------------


Refer Example :-7   (MyThread.mt = Thread.currentThread();//Point:-1 //new Concept)
-----------------
Refer Example :-18 also (important)
-----------------
Waiting of child Thread untill completing main Thread
The only way to assign a main Thread to  Thread reference...

Modified Programe see:-Example 9,See Example :- 11,12

class MyThread extends Thread 
{
	static Thread mt;//Point:-2 

	public void run() 
		{
	   try
         {
			mt.join(); //Point :-3  // combine 2 and 3 new concept calling join method() using mt.
		 } 
		catch (InterruptedException e) {}
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Child Thread");
		}
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread.mt = Thread.currentThread();//Point:-1 //new Concept
		MyThread t = new MyThread();
		t.start();

	 	for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

C:\Users\DELL\Desktop>

PROGRAME=4
=========
EXPLANATION:-
============

Getting main Thread reference so Child Thread can call on that reference..//Point:-1

Point:-1

Thread.currentThread(); It return Thread object so we can assign it to Thread.mt.
Thread.mt is also having same return type so.



Point:-2

static Thread mt;
 Usinng mt we can call all the methods present in Thread class.see this in eclipse.
 try normal example using Parent and Child.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
class MyThread extends Thread 
{
	 static Thread mt=new MyThread();

	public void run() 
		{
	   try
         {
			mt.join();
			System.out.println("----"+mt.getName());
		 } 
		catch (InterruptedException e) {}
		for (int i = 0; i < 5; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread t = new MyThread(); //Point:-1
		t.start();
		System.out.println("main "+t.getName());
	 	for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName());
		}
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main Thread-1
----Thread-0
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
main
main
main
main
main

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Point :-1 From there static control flow will come into picture.
It will load all the static variables members of that class so 

class MyThread
{
		 static Thread mt=new MyThread() //-->It goes for Thread -0
}
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
class MyThread extends Thread 
{
 public void run() 
		{
	   try
         {
		   Thread mt=new MyThread();;
			mt.join();
			System.out.println("----"+mt.getName());
		 } 
		catch (InterruptedException e) {}
		for (int i = 0; i < 5; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread t = new MyThread();
		t.start();
		System.out.println("main "+t.getName());
	 	for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName());
		}
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main Thread-0
----Thread-1
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
main
main
main
main
main
EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
class Parent
{
	void m1(){System.out.println(" m1 method");}
	void m2(){System.out.println(" m2 method");}
	void m3(){System.out.println(" m3 method");}
}

class Child extends Parent
{
	static Parent x;
  void demo()
  {
    	  x.m1();
	      x.m2();
	      x.m3();
  }
}

class Test
{

   public static void main(String[] args) 
   { 
	 Child.x=new Parent();
	 System.out.println(Child.x);
	 
	 
	 Child c=new Child();
	 c.demo();
   }	
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Parent@15db9742
 m1 method
 m2 method
 m3 method

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Parent
{
	void m1(){System.out.println(" m1 method");}
	void m2(){System.out.println(" m2 method");}
	void m3(){System.out.println(" m3 method");}
}

class Child extends Parent
{
	static Parent x;
  void demo()
  {
    	  x.m1();
	      x.m2();
	      x.m3();
  }
}

class Test
{

   public static void main(String[] args) 
   { 
	 
	 Child c=new Child();
	 c.demo();
   }	
}

class Parent
{
	void m1(){System.out.println(" m1 method");}
	void m2(){System.out.println(" m2 method");}
	void m3(){System.out.println(" m3 method");}
}

class Child extends Parent
{
	static Parent x;
  void demo()
  {
    	  x.m1();
	      x.m2();
	      x.m3();
  }
}

class Test
{

   public static void main(String[] args) 
   { 
	 
	 Child c=new Child();
	 c.demo();
   }	
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Exception in thread "main" java.lang.NullPointerException
        at Child.demo(Test.java:13)
        at Test.main(Test.java:26)

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========

Modification on Example 4
-------------------------
class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
		{
	   try
         {
			mt.join(); 
		 } 
		catch (InterruptedException e) {}
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Child Thread");
		}
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		Thread x = Thread.currentThread();
        MyThread.mt=x;// see here

		MyThread t = new MyThread();
		t.start();

	 	for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
		System.out.println(mt);
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread t = new MyThread();
		t.start();
     }
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
null

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
			
			System.out.println(mt);
	
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        MyThread.mt=x;
		MyThread t = new MyThread();
		t.start();

	 	
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Thread[main,5,]

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
			
			System.out.println(mt);
	
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        MyThread.mt=x;
        System.out.println(x);
		MyThread t = new MyThread();
		t.start();

	 	
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Thread[main,5,main]
Thread[main,5,]

C:\Users\DELL\Desktop>

EXPLANATION:-
============
public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        MyThread.mt=x;

		Indirectly Thread class Object will be created so but we are not getting the Hashcode.
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13 //Refer Example 18 for this.....
=========
class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
		System.out.println("<----"+mt);
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        x.join(1000);
        
        MyThread.mt=x;
        System.out.println("--->"+x);
		MyThread t = new MyThread();
		t.start();

	 	
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
--->Thread[main,5,main]
<----Thread[main,5,]

C:\Users\DELL\Desktop>

EXPLANATION:-
============
	 Thread x = Thread.currentThread();
        x.join(1000);
        
        MyThread.mt=x;
        System.out.println("--->"+x);


Thread Object has been created coz we are calling join method,join is an instance method and should be called on Thread 
	Object.

    Another way to create an Object that is Thread Object using main Thread reference..

	If we are creating an Thread Object by using an  main Thread reference.,
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
EXPLANATION:-
============
		Waiting of child Thread untill completing main Thread :

	Page 21 Programe.:-
		Durga Sir point:-
          In the above Example Child Thread calls join() method on main Thread Object hence Child Thread has to wait 
		untill completing main Thread.
		In this case output is 

	main Thread
	main Thread
	main Thread
     .
     .
   Child Thread
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
		class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
		{
	   try
         {
			mt.join(); 
		 } 
		catch (InterruptedException e) {}
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Child Thread");
		}
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		Thread x = Thread.currentThread();
        MyThread.mt=x;

		MyThread t = new MyThread();
		t.start();
        t.join();
	 	for (int i = 0; i < 5; i++)
	 	{
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test

	                            // Deadlock situation.

EXPLANATION:-
============
		If main Thread calls join() method on Child Thread objcet and Child Thread calls join() on main Thread Object
		then both the Threads will wait forever and the programe will be stucked/paused.
		This is something like dead lock..
		
***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
PROGRAME=16
=========
	class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
		System.out.println(""+mt);
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        x.join();
        
        MyThread.mt=x;
        System.out.println(""+x);
		MyThread t = new MyThread();
		t.start();

	 	
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test

 //dead lock..

EXPLANATION:-
============
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
	Page 22 PDF another approach..

PROGRAME=17
=========
	class Test 
	{
	public static void main(String[] args) throws InterruptedException 
	  {   
		Thread x = Thread.currentThread();
        x.join(); //approach 2
      }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test

C:\Users\DELL\Desktop>

EXPLANATION:-
============
	If a Thread calls on the same Thread itself Then the programe will be stucked.
	this is something like deadlock...
	In this case Thread has to wait infinite amount of time..
***************************-----END of--->17<--------***************************
Example=18
=========
NOTE:-
-----
PROGRAME=18
=========
	class MyThread extends Thread 
{
	
	public void run() 
	{	
		
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
	 MyThread t=new MyThread();
	 t.start();
	 System.out.println(t);
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Thread[Thread-0,5,main]

C:\Users\DELL\Desktop>

EXPLANATION:-
============
	If we are creating any class Object which extends Thread class.
	and trying to print that reference we ll get Thread information but not hashcode... see observe..
***************************-----END of--->18<--------***************************
Example=19
=========
NOTE:-
----- Refer Exaple 13 and compare..

PROGRAME=19
=========
	class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
		System.out.println("<----"+mt);
		Thread x= Thread.currentThread();
		System.out.println("===="+x);	
     }
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        x.join(1000);
        
        MyThread.mt=x;
        System.out.println("--->"+x);
		MyThread t = new MyThread();
		t.start();

	 	
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
--->Thread[main,5,main]
<----Thread[main,5,]
====Thread[Thread-0,5,main]

C:\Users\DELL\Desktop>

EXPLANATION:-
============
***************************-----END of--->19<--------***************************
Example=20
=========
NOTE:-
-----
PROGRAME=20
=========
	class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
		System.out.println("<----"+mt);
		Thread x= Thread.currentThread();
		System.out.println("===="+x);	
		m1();
     }
      
	   public void m1()
		   {
		 Thread x= Thread.currentThread();
		System.out.println("?????"+x);	
            }
	  
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        x.join(1000);
        
        MyThread.mt=x;
        System.out.println("--->"+x);
		MyThread t = new MyThread();
		t.start();

	 	
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
--->Thread[main,5,main]
<----Thread[main,5,]
====Thread[Thread-0,5,main]
?????Thread[Thread-0,5,main]

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->20<--------***************************
Example=21
=========
NOTE:-
-----
PROGRAME=21
=========
	class MyThread extends Thread 
{
	static Thread mt;

	public void run() 
	{	
		System.out.println("<----"+mt);
		Thread x= Thread.currentThread();
		System.out.println("===="+x);	
		m1();
     }
      
	   public void m1()
		   {
		 Thread x= Thread.currentThread();
		System.out.println("?????"+x);	
            }
	  
}

class Test {
	public static void main(String[] args) throws InterruptedException 
	{
		
        Thread x = Thread.currentThread();
        x.join(1000);
        
        MyThread.mt=x;
        System.out.println("--->"+x);
		MyThread t = new MyThread();
		t.start();

		MyThread t1 = new MyThread();
		t1.start();

	 	
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
--->Thread[main,5,main]
<----Thread[main,5,]
<----Thread[main,5,]
====Thread[Thread-0,5,main]
====Thread[Thread-1,5,main]
?????Thread[Thread-0,5,main]
?????Thread[Thread-1,5,main] 

C:\Users\DELL\Desktop>
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
	Sleep() method:
If a Thread don't want to perform any operation for a particular amount of time then
we should go for sleep() method.
1. public static native void sleep(long ms) throws InterruptedException
2. public static void sleep(long ms,int ns)throws InterruptedException

	every sleep() method throws InterruptedException which is a checked Exception,so when ever
		we are calling sleep method () compulsary we should handle InterruptedException eiether by try-catch or 
		by throws keyword otherwise we ll get CE..

Page 23 in that interrupt a Thread is there in diagram so how a Thread will be interputed when its sleeping and
	wat s the procedure for interrupting a sleeping Thread..do R & D....
***************************-----END of--->22<--------***************************
Example=23
=========
NOTE:-
-----
PROGRAME=23
=========
	class Test {
	public static void main(String[] args) throws InterruptedException 
	{
	 	for (int i=0;i<10;i++ )
		{   Thread.sleep(1000);
			System.out.println("slide="+i);
		}
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
slide=0
slide=1
slide=2
slide=3
slide=4
slide=5
slide=6
slide=7
slide=8
slide=9

C:\Users\DELL\Desktop>
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
	How a Thread can interupt another Thread...?

Interupt is good or bad..?
	depends on situation..

***************************-----END of--->24<--------***************************
Example=25
=========
NOTE:-
-----
PROGRAME=25
=========
EXPLANATION:-
============
	A Thread can interupt a sleeping Thread /waiting Thread by using interupt method of Thread class..

	public void interrupt(){}
***************************-----END of--->25<--------***************************
Example=26
=========
NOTE:-
-----
	In this Example main Thread is interupting Child Thread when sleepin..

PROGRAME=26
=========
Case 1:- main Thread interupting Child Thread..
-------
	
If we are writing  t.interrupt(),in this case output is below..

class MyThread extends Thread
{
	public void run()
	{
	 	try
		{
            for (int i=0;i<10;i++ )
		     {   
			   System.out.println("I am lazy Thread");
		       Thread.sleep(1000);
		     }
		}
		catch (InterruptedException ie)
		{
			System.out.println("i got interupted");
		}

	}
}
class Test {
	public static void main(String[] args)  
	{
	    MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("end of main");
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
end of main
I am lazy Thread
i got interupted

C:\Users\DELL\Desktop>


 Case 2:-main Thread not interrupting Child Thread..
-------
	 If we are not writing  t.interrupt(),
	 then main Thread won t interrupt Child Thread.
	 In this case Child Thread will execute for loop 10 times.

class MyThread extends Thread
{
	public void run()
	{
	 	try
		{
            for (int i=0;i<10;i++ )
		     {   
			   System.out.println("I am lazy Thread");
		       Thread.sleep(1000);
		     }
		}
		catch (InterruptedException ie)
		{
			System.out.println("i got interupted");
		}

	}
}
class Test {
	public static void main(String[] args)  
	{
	    MyThread t=new MyThread();
		t.start();
		System.out.println("end of main");
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
end of main
I am lazy Thread
I am lazy Thread
I am lazy Thread
I am lazy Thread
I am lazy Thread
I am lazy Thread
I am lazy Thread
I am lazy Thread
I am lazy Thread
I am lazy Thread

C:\Users\DELL\Desktop>

EXPLANATION:-
============

	very important Point:-main Thread call interupt method on Child Thread but Child Thread is not in waiting or
		sleeping state.

		wat will happem..?
			error..?
			exception..?
			frist check target Thread is sleeping state Then call interupt method on Thread..?
            interupt call will be wasted or not..?

			solution:-(Example:27 see)
				When ever we call interupt method,
				interupt method will wait untill target Thread enters into waiting or sleepin/waiting state 
                If target Thread enters waiting/sleepin state  then  interupt method will interupt..
				If the target Thread won t enter into waiting/sleepin state then interrupt  call will be wasted..

               main Thread won t take care of this interupt call,main Thread will continue as usual..
				   JVM is gonna take care of this interupt.

Vinay Point:-see in this examples
	main Thread want to interupt Child Thread so 
    main Thread has to call interupt call on Child Thread object reference.
***************************-----END of--->26<--------***************************
Example=27
=========
NOTE:-
-----
PROGRAME=27
=========
	class MyThread extends Thread
{
	public void run()
	{
		         for (int i=0;i<10000;i++ )
		     {   
			   System.out.println("i am lazy Thread "+i);
		     }
			 System.out.println("i want to sleep");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ie)
		{
			System.out.println("i got interupted");
		}

	}
}
class Test {
	public static void main(String[] args)  
	{
	    MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("end of main");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
end of main
i am lazy Thread 0
i am lazy Thread 1
i am lazy Thread 2
i am lazy Thread 3
i am lazy Thread 4
i am lazy Thread 5
i am lazy Thread 6
.
.
.
.
.
i am lazy Thread 9996
i am lazy Thread 9997
i am lazy Thread 9998
i am lazy Thread 9999
i want to sleep
i got interupted

C:\Users\DELL\Desktop>

EXPLANATION:-
============
	In this example main Thread got the chance frist so frist its printing
	end of main
	then child Thread got the chance so its executing so after 10000 times its going to sleep then JVM is gonna interupt
	see best example..
    main Thread already finished the its job.



Durga Point:-
-------------
	In the above example interupted call waited untill child Thread completes for loop 10000 times..
***************************-----END of--->27<--------***************************
Example=28
=========
NOTE:-
-----
PROGRAME=28
=========
	class MyThread extends Thread
{
	public void run()
	{
		         for (int i=0;i<10000;i++ )
		     {   
			   System.out.println("i am lazy Thread "+i);
		     }
			 System.out.println("i want to sleep");
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ie)
		{
			System.out.println("i got interupted");
		}
            System.out.println("ok i slept");
	}
}
class Test {
	public static void main(String[] args)  
	{
	    MyThread t=new MyThread();
		t.start();
		System.out.println("end of main");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
end of main
i am lazy Thread 0
i am lazy Thread 1
i am lazy Thread 2
i am lazy Thread 3
i am lazy Thread 4
i am lazy Thread 5
i am lazy Thread 6
.
.
.
.
i am lazy Thread 9996
i am lazy Thread 9997
i am lazy Thread 9998
i am lazy Thread 9999
i want to sleep //Point:-1
ok i slept


EXPLANATION:-
============
***************************-----END of--->28<--------***************************
Example=29
=========
NOTE:-
-----
PROGRAME=29
=========
	class MyThread extends Thread
{
	public void run()
	{
		         for (int i=0;i<10000;i++ )
		     {   
			   System.out.println("i am lazy Thread "+i);
		     }
			 System.out.println("i want to sleep");
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ie)
		{
			System.out.println("i got interupted");
		}
            System.out.println("ok i slept");
	}
}
class Test {
	public static void main(String[] args)  
	{
	    MyThread t=new MyThread();
		t.start();
		System.out.println("end of main");
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
end of main
i am lazy Thread 0
i am lazy Thread 1
i am lazy Thread 2
i am lazy Thread 3
i am lazy Thread 4
i am lazy Thread 5
i am lazy Thread 6
.
.
.
.
i am lazy Thread 9996
i am lazy Thread 9997
i am lazy Thread 9998
i am lazy Thread 9999
i want to sleep //Point:-1
ok i slept


EXPLANATION:-
============
	Point:-1
	See here Child Thread in run method() executes line by line execution...
	observe the output..


Here Child Thread won t be interrupted see..

***************************-----END of--->29<--------***************************
Example=30
=========
NOTE:-
-----
PROGRAME=30
=========
EXPLANATION:-
============
	When ever we are calling interrupt method If the target Thread not in sleeping/waiting state then 
	there is no impact of interupt call immediately.
	Interupted  call will be waited untill target Thread enter into sleeping/waiting state.

	If the target Thread enter into sleeping or waiting state then immediately interrupt call will interrupt 
		target Thread..


		If the target never entered into sleeping/waiting state in its life time then there is no impact of interupt call
			this is the only case where interrupt call will be wasted..

			interrupt call method Example explanation like snake waiting to take revenge on a person.
				if person going for sleeping/waiting then snake will go and bite..
				If person died in accidnet then snake can t get the revenge..that type of example..
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
