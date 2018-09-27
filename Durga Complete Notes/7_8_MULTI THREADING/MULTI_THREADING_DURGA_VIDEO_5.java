TOPIC:-MULTI THREADING
--------
VIDEO NO=5
-----------
NUMBER OF PICTURES=2
------------------
1----->H:\JAVA NOTES\DURGA JAVA NOTES\MULTI THREADING\MULTI_THREADING_VIDEO_5
2----->H:\JAVA NOTES\DURGA JAVA NOTES\MULTI THREADING\MULTI_THREADING_VIDEO_5(2)

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
class MyThread extends Thread
  {
     public void run()
    {
      for(int i=0;i<5;i++)
       {
          Thread.yield();
          System.out.println("child thread");
        }
     }
}
    class Test
    {
        public static void main(String[] args)
          {
            MyThread t=new MyThread();
            t.start();
            for(int i=0;i<5;i++)
             {
               System.out.println("main thread");
             }
        }
}

C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java Test
main thread
main thread
main thread
main thread
main thread
child thread
child thread
child thread
child thread
child thread

C:\Users\DELL\Desktop>

EXPLANATION:-
============
Vinay Point:-
-------------
Thread.yield()----->We are calling using Thread class name..


Thread.yield(); --->we have written this in run() method.
internally Thread 0 is responsible  for calling this method().
so Thread 0 will pause so remainning Thread can execute its corresponding
jobs..

Durga Point:-
-------------
In the above programe If we are commenting line 1 then both Thread s will be executed simultaneously,
and we can t expect which Thread will complete frist..

If we are not commenting line 1 then Child Thread always calls yield() method bcoz of that main Thread will get
chance more no of times and chance of completing main Thread frist is high..



Conclusion:-Some platforms won t provide proper support for yield() method.

yield() method--->Temporaray pausing a Thread--->Primitive Scheduling

Remove the Current Thread from the processor and allocate to another Thread to processor..(i.e Primitive Scheduling.)

yield() method is a native method,not implemented in java

so underlyiing processor level,OS level support must be required.


If my processor supports only for non-primitive scheduling (like frist come frist serve..)
untill 1 st  finishes i can t give chance to another.

If the processor doesen t support primitive scheduling then using of yield() method is of no use.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
Hand Written Notes:-(Small Notes See diagram)
--------------------
join();

Assume 2 Thread are three T1 and T2...!

Which Thread want to wait for  T2 Thread task completion...?
T1 Thread

so T1 Thread has to call T2.join()..


This T2.join() line is executed by T1 Thread.
Immediately after this line execution T1 Thread will enter into waiting state..
T2 Thread will continue its execution..
After completing T2 Thread,T1 will continue its execution.





Ex:-Durga Point
If a Thread T1 wants to wait untill completing T2,
then T1 has to call T2.join().
If T1 executes T2.join() then immediately T1 will be entered into waiting state untill T2 completes.
once T2 completes T1 can continue its execution.


Ex:-If a Thread T1 wants to wait untill completing T2,then T1 has to call T2.join().
If T1 executes T2.join() then immediately T1 will be entered into waiting state untill T2 completes.
once T2 completes T1 can continue its execution.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
Page 3 Theorey

Weddind card printing Thread(T2) has to wait untill venue fixing Thread(T1) completion.
Hence T2 has to call T1.join().
Weeding card distibution Thread (T3) has to wait untill wedding card printing Thread(T2) completion
hence T3 has call T2.join().
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
1. public final void join()throws InterruptedException

2. public final void join(long ms) throws InterruptedException   //join with time period
 Ex:- If any friend who wants to wait but will wait untill some particular time then he will give some time.
 then he will go for this method.

3. public final void join(long ms,int ns) throws InterruptedException  //join with time period
        If any friend who wants to wait but will wait untill some particular time then he will give some time.
 then he will go for this method.
He wants to wait untill maximum last value of nano second,after that next compulsary we need to take values from
milli seconds so then he will go for this method.

Ex:-withdraw 2500(Twenty five hundred)
so untill 999 we can allow hundred.after that we should take Thousand only.
Two Thousand five hundred only.(Recomended and valid)

Durga Point:-
all the above methods are overloaded methods and are 
instance methods.(Should call on Object).

Every join() method throws InterruptedException which is checked Exception.
Hence compusary we should handle this exception eiether by using try-catch or throws keywords otherwise we ll get CE.



(1:19:00)
While a Thread(T2)  waiting untill completing of some other Thread(i.e T1),
There may be a chance that some other Thread may interupt the waiting Thread(T2) so to avoid that interpution
so we use interupted Exception.
Which is Checked Exception..

Ex:-
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
Case 1:- Waiting of main Thread untill completing Child Thread.(run to see the output)
-------
class MyThread extends Thread
{
      public void run()
      {
        for(int i=0;i<10;i++)
          {
              System.out.println("Sita Thread");
             try
             {
                Thread.sleep(2000);// MIN 20 SEC  (COZ 2000 * 10=20sec minimum.)
             }
             catch (InterruptedException e){}
          }
      }
}
      
	  class ThreadJoinDemo
 {
   public static void main(String[] args)throws InterruptedException
     {
          MyThread t=new MyThread();
         t.start();
         t.join();
         for(int i=0;i<10;i++)
          {
            System.out.println("Rama Thread");
		  }
     }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadJoinDemo
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread

C:\Users\DELL\Desktop>

EXPLANATION:-
============
If we are using t.join();
main Thread calls join method on Child Thread Object,
Hence main Thread will wait untill completing Child Thread.

In this case output is sita Thread(10-Times) followed by Rama Thread(10-Times);


Vinay Point:-
-------------
1)Here main Thread is responsible for creating child Thread.
main Thread is calling join() method on Child Thread Object.

 2)About Exception...

so main Thread has to wait..so while waiting other Thread may try to interput main Thread so we need to handle it.
so main Thread is calling join () method so it will get interupted so we handle it using throws keyword..

3) continuing from 1) --> Point:-  
          main Thread have to wait untill completion of Child Thread..
   

Case 2:-main Thread waiting for a specific amount of Time
------
class MyThread extends Thread
{
      public void run()
      {
        for(int i=0;i<10;i++)
          {
              System.out.println("Sita Thread");
             try
             {
                Thread.sleep(2000);// MIN 20 SEC  (COZ 2000 * 10=20sec minimum.)
             }
             catch (InterruptedException e){}
          }
      }
}
      
	  class ThreadJoinDemo
 {
   public static void main(String[] args)throws InterruptedException
     {
          MyThread t=new MyThread();
         t.start();
         t.join(10000);
         for(int i=0;i<10;i++)
          {
            System.out.println("Rama Thread");
		  }
     }
}


C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadJoinDemo
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread

C:\Users\DELL\Desktop>


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
        for(int i=0;i<10;i++)
          {
              System.out.println("Sita Thread");
             try
             {
                Thread.sleep(1000);
             }
             catch (InterruptedException e){}
          }
      }
}
      
	  class ThreadJoinDemo
 {
   public static void main(String[] args)throws InterruptedException
     {
          MyThread t=new MyThread();
         t.start();
           for(int i=0;i<10;i++)
          {
            System.out.println("Rama Thread");
		  }
     }
}



C:\Users\DELL\Desktop>javac Test.java

C:\Users\DELL\Desktop>java ThreadJoinDemo
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Rama Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread
Sita Thread

C:\Users\DELL\Desktop>
EXPLANATION:-
============
If we  not  using t.join(); both main and child Thread will be executed simultaneously and we can t except Exact output.

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
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
EXPLANATION:-
============
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
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
