TOPIC:-MULTITHREADING
--------
VIDEO NO=7
-----------
NUMBER OF PICTURES=
------------------
1-->H:\JAVA NOTES\DURGA JAVA NOTES\MULTI THREADING\MULTI_THREADING_VIDEO_7

VIDEO COMPLETED=YES
-----------------
IMPORTANT EXAMPLES:-

EXAMPLES:-6
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:- Previous video Programe
-----
PROGRAME=1
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
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----


PROGRAME=2
=========
EXPLANATION:-
============

Synchronization:-
Example:-1
Multiple dogs are trying to eat biryani  in a single plate then biryani consistency problems will occur..

Example:-2
If multiple people are trying to book a last ticket..

Example:-3
If 2 people are trying to operate on single account,and withdrawing 10000..
Assume only 10000 money is there..



At a time only one Thread should operate that type of necessay then we should go for Synchronizatioin concept.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
1) Synchronized is modifier applicable only for methods and blocks..
but not for classes and variables..

2)If multiple Thread are  trying to operate simultaneously on the same java object then there may be a chance of 
data inconsistency problem..
To overcome this problem we ll go for synchronized keyword..
3) IF a method or a block is declared as synchronized,Then @ a time only one Thread is allowed 
to execute that method or block on the given object.
so that data inconsistency problem will be resolved..


advantage:-we can overcome data inconsistency problem will be resolved..

Disadvantage of synchronized:-Thread s are executed one by one..
suppose web application is there 1000 of requests are comming untill completing frist Thread another Thread 
should wait.. etc
It increases waiting time of Thread which causes low performance..

If there is no specific need we should not go for synchronized keyword..

The main advantage of synchronized keyword is we can resolve data inconsistency problems..
but the main disadvantage of synchronized keyword is it increases waiting time of Thread s and creates performance 
problems,,
hence If there is non specific requirement then it is not recomended to use synchronized keyword..


***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----

Internally how synchronized keyword is implemented.
Internally synchronization concept is implemented by using lock.
Every Object in java has a unique lock,
when ever we are using synchronized keyword then only lock concept will come
into the picture..
If we are not using synchronized keyword then lock concept won t come into picture,,

If a Thread wans to execute synchronized method on the given object,Frist it has to get that lock of that object.
once Thread got the lock then it is allowed to execute any synchronized method on that object.
once method execution completes automaticaaly Thread release s the lock,.


Acquiring and releasing lock internally takes care by JVM
Programmer not responsible for this activity..


{{{ Vinay Point:-
	another Thread can t get the acess of that object via lock,
untill previous Thread releases the lock by completing its execution..so Present Thread has to wait untill the 
Past Thread completes its execution..
		}}}



PROGRAME=4
=========
EXPLANATION:-
============

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
Last Programe:-
---------------
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
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
38:00 

PROGRAME=6
=========
Please see the diagram 
H:\JAVA NOTES\DURGA JAVA NOTES\MULTI THREADING\MULTI_THREADING_VIDEO_7

class X
{
	synchronized void m1(){}
	synchronized void m2(){}
	 void m3(){}
}
EXPLANATION:-
============

While a Thread executing synchronized method on the given object,
The remaining Thread are not allowed to execute any synchronized methods simultaneously on the same Object.
But remaining Thread s are allowed  to execute non-synchronized methods simultaneously.


Important Point:-lock concept is implemented based on Object. 
But not Based on method..



***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
When a Thread T1 is executing synchronized method m1(),
the same Thread (T1) can execute another synchronized method m2() of the same class....?

solution:-yes it can execute..
Reason:-synchronized method can be acessed by only one Thread at a time so comment () method has not been
conqured by any other Thread so it can be executed by Thread-0.

See next video 8 notes have proved along with programe Example:-1
PROGRAME=7
=========
class Display
         {
                public synchronized void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
                     }
                public synchronized void comment()
                {
                  for(int i=0;i<1;i++)
                     {
                       System.out.print("good morning:");
                        try
                          {
                             Thread.sleep(1000);
                          }
                        catch (InterruptedException e){}
                       System.out.println("vinay");
                     }
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
                     d.comment();                        	
                     d.wish(name);// Point:-1
                     }
             }

           class Test
          {
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  MyThread t1=new MyThread(d1,"dhoni");
                  MyThread t2=new MyThread(d1,"yuvaraj");
                   t1.start();
                   t2.start();
                 }
            }

			
C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning:vinay
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:vinay
good morning:yuvaraj
good morning:yuvaraj
good morning:yuvaraj
good morning:yuvaraj
good morning:yuvaraj

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Point:-1
executing another synchronized  method comment by same Thread -0 see 





***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
With synchronized keyword..
PROGRAME=8
=========
class Display
         {
                public synchronized void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
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
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  MyThread t1=new MyThread(d1,"dhoni");
                  MyThread t2=new MyThread(d1,"yuvaraj");
                   t1.start();
                   t2.start();
                 }
            }



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:dhoni
good morning:yuvaraj
good morning:yuvaraj
good morning:yuvaraj
good morning:yuvaraj
good morning:yuvaraj

C:\Users\DELL\Desktop>

EXPLANATION:-
============
If we declare  wish () method as synchronized then at at time only one Thread is allowed to execute wish () method
on the given display object..
hence we ll get regular output..
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
Without synchronized keyword..

PROGRAME=9
=========
class Display
         {
                public  void wish(String name)
                    {
                      for(int i=0;i<5;i++)
                         {
                           System.out.print("good morning:");
                            try
                              {
                                 Thread.sleep(1000);
                              }
                            catch (InterruptedException e){}
                           System.out.println(name);
                         }
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
             public static void main(String[] args)
                {
                  Display d1=new Display();
                  MyThread t1=new MyThread(d1,"dhoni");
                  MyThread t2=new MyThread(d1,"yuvaraj");
                   t1.start();
                   t2.start();
                 }
            }




C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
good morning:good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
good morning:dhoni
good morning:yuvaraj
dhoni

C:\Users\DELL\Desktop>

EXPLANATION:-
============
multiple Thread operating on wish method..

Durga Point:-If we are not declaring wish () method as synchronized then both Thread will be executed simultaneously.
hence we ll get irregular output.

***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
Some important points on hand Written notes in short notes...see it..
and one important doubts also...
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
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
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
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
