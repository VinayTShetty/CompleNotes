TOPIC:-MULTI-THREADING
--------
VIDEO NO=9 --------->(SYNCHRONIZATION BLOCK)
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------

IMPORTANT EXAMPLES:-

Example:-9
Example:-15
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		

		    for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}







		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
    }
	
}
class Test
{
	public static void main(String []args)
	{
		Display d=new Display();
		MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : virat
Dhoni

C:\Users\DELL\Desktop>

EXPLANATION:-
============
irregular output..

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
synchronized (this)
	   {
		    for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
	   }






		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
    }
	
}
class Test
{
	public static void main(String []args)
	{
		Display d=new Display();
		MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
class Display
{
	public  void  wish(String name)
	{
		    ;;;;;;;;;;;;//1 lahk lines of code.
		
synchronized (this)
	   {
		    for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
	   }

             ;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	X x;
	String name;
	MyThread(X x,String name)
	{
		this.x=x;
		this.name=name;
	}
	public void run()
	{
		 new Display().wish(name);
    }
	
}
class Test
{
	public static void main(String []args)
	{
		X x=new X();
		MyThread t1=new MyThread(x,"Dhoni");
		MyThread t2=new MyThread(x,"virat");
		t1.start();
		t2.start();
	}
}

class X
{
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Good morning : virat
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : virat
Dhoni

C:\Users\DELL\Desktop>

EXPLANATION:-
============
In Display class wish() method is there in that it has synchronized block,
that wish () is executed by which Thread..?
so if that Thread contains the Target argument same as in synchronized block then it will execute 
that block..
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
Case Study:-

PROGRAME=4
=========
class Display
{
	public static void  wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
synchronized (this)
	   {
		    for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
	   }

             ;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	X x;
	String name;
	MyThread(X x,String name)
	{
		this.x=x;
		this.name=name;
	}
	public void run()
	{
		Display.wish(name);
    }
	
}
class Test
{
	public static void main(String []args)
	{
		X x=new X();
		MyThread t1=new MyThread(x,"Dhoni");
		MyThread t2=new MyThread(x,"virat");
		t1.start();
		t2.start();
	}
}
class X
{
}

C:\Users\DELL\Desktop>javac Test.java
Test.java:7: error: non-static variable this cannot be referenced from a static context
synchronized (this)
              ^
1 error

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
execute again..
make some R & D on synchronized block..

PROGRAME=5
=========
EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
Case Study Starts from here..

PROGRAME=6
=========


Case :-1
--------
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		    for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}

		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
    }
	
}
class Test
{
	public static void main(String []args)
	{
		Display d=new Display();
		MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : Dhoni
virat

C:\Users\DELL\Desktop>
EXPLANATION:-
============
Multiple Thread s are operatring on the same Display object..
Without synchronized block.

**************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
Case 2:-
--------
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(this)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
    }
	
}
class Test
{
	public static void main(String []args)
	{
		Display d=new Display();
		MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Multiple Thread s are operatring on the same Display object..
With synchronized block.
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
Case 3:-
--------
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(this)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
    }
	
}
class Test
{
	public static void main(String []args)
	{
		Display d1=new Display();
		Display d2=new Display();
		MyThread t1=new MyThread(d1 ,"Dhoni");
		MyThread t2=new MyThread(d2,"virat");
		t1.start();
		t2.start();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Good morning : virat
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : Dhoni
virat

C:\Users\DELL\Desktop>

EXPLANATION:-
============
2 Thread s are operating on on 2 different Display Object,
Even though synchronized block is there it has no effect coz its operating on different Objects.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(this)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		Display D=new Display();
		D.wish(name);
		//or below both are same  
		//new Display().wish(); 
    }
	
}
class Test
{
	public static void main(String []args)
	{
		Display d=new Display();
	    MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : virat
Good morning : Dhoni
Good morning : Dhoni
virat

C:\Users\DELL\Desktop>
EXPLANATION:-
============
Here we are passing a single object but we are calling on 
different object.


Key rule:-
The argument in Thread that is the Target is same as the invoking method which contains the synchronized 
block then only synchronized works...

That is mostly hashcode of single object must be there then only the magic works..
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
class Display
{
	public static void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(this)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
	
}
class Test
{
	public static void main(String []args)
	{
		Display d=new Display();
	    MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}


C:\Users\DELL\Desktop>javac Test.java
Test.java:7: error: non-static variable this cannot be referenced from a static context
                synchronized(this)
                             ^
1 error

C:\Users\DELL\Desktop>java Test-----


PROGRAME=10
=========
EXPLANATION:-
============
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
Passing a Particular object..

PROGRAME=11
=========
class Display
{
	X x;
	Display (X x)
	{
	  this.x=x;
	}
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(x)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		
		d.wish(name);
		
    }
	
}
class Test
{
	public static void main(String []args)
	{
		X x=new X();
		Display d=new Display(x);
	    MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}
class X
{
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat

C:\Users\DELL\Desktop>

EXPLANATION:-
============
In this Example Frist Thread got the lock of X class.
untill X finishes the synchronized block no other Thread is allowed to execute that block..
so Thread second Thread has to wait...

It has nothing to do with argument present in
		MyThread t1=new MyThread(d,"virat");
		MyThread t2=new MyThread(d,"virat");
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
Passing a particular object which Thread is having as a argumet..
We can t follow that 11 th programe approach to send a single Object so we are following this style..

PROGRAME=12
=========
class Display
{
	static Display d;
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(d)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		
		d.wish(name);
		
    }
	
}
class Test
{
	public static void main(String []args)
	{
        Display d=new Display();
       
		Display.d=d;              //important point..
	    
		
		MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		
		t1.start();
		t2.start();
	}
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat

C:\Users\DELL\Desktop>
EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(X.class)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		
		d.wish(name);
		
    }
	
}
class Test
{
	public static void main(String []args)
	{
        Display d=new Display();
       
	    MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}

class X{}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Here Frist Thread came and get the lock of X class..
untill Frist Thread finishes Second Thread won t get the chance..(coz lock is avaliable with Frist Thread)
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(Display.class)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		
		d.wish(name);
		
    }
	
}
class Test
{
	public static void main(String []args)
	{
        Display d=new Display();
       
	    MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");
		t1.start();
		t2.start();
	}
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Here Frist Thread came and get the lock of Display class..
untill Frist Thread finishes, Second Thread won t get the chance..(coz lock is avaliable with Frist Thread)


Example 13 and 14 has nothing to do with the argument presrent in 

       
	    MyThread t1=new MyThread(d ,"Dhoni");
		MyThread t2=new MyThread(d,"virat");

***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		
		synchronized(Display.class)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		
		d.wish(name);
		
    }
	
}
class Test
{
	public static void main(String []args)
	{
        Display d1=new Display();
        Display d2=new Display(); //2 display Objects.
       
	    MyThread t1=new MyThread(d1,"Dhoni");
		MyThread t2=new MyThread(d2,"virat");
		t1.start();
		t2.start();
	}
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : Dhoni
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat
Good morning : virat

C:\Users\DELL\Desktop>

EXPLANATION:-
============

Note short notes in page 17..
If we use


synchronized(<classname>.class)

A Class class objecet will be created that lock is occupied by Frist Thread untill that Thread finishes
no other Thread can get that Class class object..
Even though many objects are created it doesn t concern if we get a Class class lock..

Example 3 and this Example is completely different.......
see and observe carefully...

***************************-----END of--->15<--------***************************
Example=16
=========
NOTE:-
-----
There are 2 types of lock in java,
class level lock and Object level lock..

lock concept is not applicable to primitives..

int x=10;
synchronized(x)
{

}

PROGRAME=16
=========
class Display
{
	public void wish(String name)
	{
		;;;;;;;;;;;;//1 lahk lines of code.
		int x=10;
		synchronized(x)
		{    
		     for (int i=0;i<5;i++)
		    {System.out.print("Good morning : ");
		    try{Thread.sleep(1000);}
		    catch (InterruptedException IE){}
		    System.out.println(name);}
		}
		;;;;// 1 lakh line of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		
		d.wish(name);
		
    }
	
}
class Test
{
	public static void main(String []args)
	{
        Display d1=new Display();
        Display d2=new Display();
       
	    MyThread t1=new MyThread(d1,"Dhoni");
		MyThread t2=new MyThread(d2,"virat");
		t1.start();
		t2.start();
	}
}



C:\Users\DELL\Desktop>javac Test.java
Test.java:7: error: unexpected type
                synchronized(x)
                ^
  required: reference
  found:    int
1 error

C:\Users\DELL\Desktop>java Test

EXPLANATION:-
============
lock concepts applicable for Object type and class type and not for primitives..
hence we cannot pass primitive type as argument to synchronized block..
otherwise we ll get CE...
***************************-----END of--->16<--------***************************
Example=17
=========
NOTE:-
-----
PROGRAME=17
=========
EXPLANATION:-
============
wat is Race condition...?
If multiple Threads are operating simultaneously on the same java Object,then there may be a chance of
data inconsistency problem..this is called Race condition..
we can overcome this problem by using synchronized keyword..



Wat is Object lock and when it is required..?
Every Object in java has a unique lock,which is nothing but object lock..
when ever a Thread wants to execute instance synchronized method,
Then Thread require object lock..

Wat is class level lock and when it is required..?
Every class in java has a unique lock which is nothing but class level lock.
Whenever a Thread wants to execute static synchronized method then the Thread requires this lock..



wat is the difference b/w class level lock and Object level lock...?
If a Thread wants to execute static synchroniozed method then Thread requires class level lock.
If a Thread wants to execute instace synchroniozed method then Thread requires Object level lock.



while a Thread executing synchronized method on the given Object,,Is the remaining Thread s 
are allowed to execute any other synchronized method simultaneously on the same Object...?

  NO NO NO..


wat is synchronized block...?
how to declare synchronized block to get lock of current Object...?
how to declare synchronized block to get class level lock...?

wat is the advantage of synchronized block over synchronized methods...?
performance will increased.
waiting time of the Thread will be increased.


Is a Thread can acquire multiple locks silmultaneously ....?

yes off course from diiferent Objects.

Page 18(short notes)

class X
{
	public synchronized void m1()
	{      
		//Here Thread has a lock of X object.
		Y y=new Y();
		synchronized(y)
		{
			//here Thread has lock of X and Y object.
			Z z=new Z();
			  synchronized(z)
			    {
				  //Here Thread has lock of X,Y,Z objects..

			    }
		
		}

	}
}


X x=new X()
x.m1();


wat is synchronized statements...?
(Interview people created terminology)

The statmemts present in synchronized methods and synchronized blocks are called synchronized statements..
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
