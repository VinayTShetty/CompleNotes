TOPIC:-Garbage Collection.
-------
VIDEO NO=3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
07/07/18
20/07/18

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
Durga Point:-By means of Some way i made an group of Object s eligible for GC.
Once the object s eligibe For GC ,Don t expect immediately these object s will be destroyed by garbage collector.
Once JVM runs GC then only these Object s will be destroyed.
When JVM run s GC.
1)we don t know.
2)Program run s with LOW memory.
3)Varied from JVM to JVM.

When JVM run s GC then only Object s will be destroyed.

House cleaning Lady comming at morning and cleaning.
House owner throwing paper to dustbin and asking lady to clean .
sometiimmes she will telll keep all those things in Dustbin then in morning i will come and clean.

sometimes asking her come and clean the house when relative s are comming.
sometimes she will come.(Same concept..when ever huge number of Object s are eligible for GC instead of waiting untill JVM runs GC.
We can request JVM to run GC.)..

If i call the housemaid when relative home If the relation ship is not good she will tell negative response that she is not feeling well..

Same like HOuse maisd.We can Request JVM to Run GC.untill waiting till JVM run GC.
But JVM accepts the reqest or not we are not sure.
Most of the time JVM will accept the Request.

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============

The ways for requesting JVM to run GC:
--------------------------------------
1)By using System class.
      System.gc(); --->We are calling garbage collector.(Wrong approach)
      System.gc(); --->We are requesting JVM to run garbage collector.

2)By Using Runtime class.
     
page 68(My notes).

For java appplication to communicate with JVM,For this communication which Object is Required..?
 RunTime Object is required.

How can we create a Runtime Object...?
 Runtime class present in java.lang package.
 Runtime class is SingleTon class.
 If its a singleton class we are able to create only one Object.Such type of class is called singleton class.
 If its a singleton class we cannot create Object by using constructor concept.
 Compulsary we need to go for some other concept. like Factory method concept.

By Using factory method we can create Runtime Object.
           
		   Runtime.getRuntime();

       It return a Runtime Object so we are catching it using..
	   Runtime r=Runtime.getRuntime();

	   We cannot create Runtime Object as    Runtime r=new Runtime();   Becasuse its a single ton class..
	 


	   What is the Factory Method..

	   By using class name i am calling a method that method will return Same class Object that concept is called Factory Method.

      1)Runtime.getRuntime();
      2)Runtime r=new Runtime(); 

	  Where Factory method is used..?
	  At the time of Object Creation i want to check some condition is satisfied..
	  Then Factory method is best suitable.


    Once we get the Runtime Object we can call all these Method s.

      r.freeMemory(); returns the free memory present in the heap.
                      It returns number of byte of free memory present in the heap.


      r.totalMemory(): returns total memory of the heap.
                          It return s number of byte s of total memory present in the Heap.That is Heap size.

      r.gc(): for requesting jvm to run gc.
	          
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
import java.util.Date; //Date is present in utill package..
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Runtime r=Runtime.getRuntime();
         //Once we got Runtime Object we can ask several things to JVM>

        System.out.println("total memory of the heap :"+r.totalMemory()); //100 bytes assume is the total size.
        System.out.println("free memory of the heap :"+r.freeMemory());// Assume 60 bytes is the free memory.
                                                                      //Here 40 bytes are used memory so meaning full..

		for(int i=0;i<10000;i++)  //this loop is executed 10000 times...
				{
					Date d=new Date(); //Am creating the 10000 data objects and immediately making 10000 it eligible for GC.
					d=null;
					               //If 10000 objects are elgible for GC JVM is gonna Run GC...? May or May not..
								     //If memory problem is there JVM gonna GC.If memory problem is not there it might not.
				}
				System.out.println("free memory of the heap :"+r.freeMemory());  //After creating 10000 objects free memory is 40bytes.
																				//Earlier free memory was 60bytes, now its 40 bytes ..is it meaningfull or not..?
																				//Here there is reduction of 20 bytes.
																				//Bcoz for creation for 10000 objects we need some memory for creating the Objects..
				                                                                    
				r.gc();                                                       //Asking JVM to RUN GC. There is no gaurantee that JVM is gonna RUN GC.

				System.out.println("free memory of the heap :"+r.freeMemory()); //30 bytes
																				// 40 bytes should be there,If GC is not came but its 30 bytes reason is.
				                                                                //30 bytes Because internally JVM require some memory to the programe might be 10 bytes.. 
			}
	}


System.out.println("free memory of the heap :"+r.freeMemory()); //50 bytes
                                                                //GC came and destroyed only 5000 objects so sufficient memory is there so left the process in the middle..
																
System.out.println("free memory of the heap :"+r.freeMemory()); //60 bytes
                                                                //GC came and destroyed only 10000 objects s completely..


System.out.println("free memory of the heap :"+r.freeMemory()); //80 bytes    possible
                                                                //Earlier free memory is 40 
																//After creating 10000 objects free memory is 40 bytes..
                                                               //Because in the begining the used memory is 40 bytes,In that used memory there might be some useless objects already present.
														

EXPLANATION:-
============
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
import java.util.Date;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World! 123");
		Runtime r=Runtime.getRuntime();
        System.out.println("total memory of the heap :"+r.totalMemory());
        System.out.println("free memory of the heap :"+r.freeMemory());
		for(int i=0;i<10000;i++)
				{
					Date d=new Date();
					d=null;
				}
				System.out.println("free memory of the heap :"+r.freeMemory());
				r.gc();
				System.out.println("free memory of the heap :"+r.freeMemory());
			}
	}



C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Hello World! 123
total memory of the heap :67108864
free memory of the heap :64716032
free memory of the heap :64422408
free memory of the heap :7358848

C:\Users\vinay.ts\Desktop>

//Here the behaviour is varied from JVM to JVM.


how to change the JVM.
go to JDK and Bin and setpath

set path = C:\Program Files\Java\jdk-9.0.4\bin

cd /   
For getting back.


EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
import java.util.Date;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("r.gc() commented");
		Runtime r=Runtime.getRuntime();
        System.out.println("total memory of the heap :"+r.totalMemory());
        System.out.println("free memory of the heap :"+r.freeMemory());
		for(int i=0;i<10000;i++)
				{
					Date d=new Date();
					d=null;
				}
				System.out.println("free memory of the heap :"+r.freeMemory());
				//r.gc();
				System.out.println("free memory of the heap :"+r.freeMemory());
			}
	}



C:\Users\vinay.ts\Desktop>javac Test.java                      //Previous Programe  output...Example 4.

C:\Users\vinay.ts\Desktop>java Test
Hello World! 123
total memory of the heap :67108864
free memory of the heap :64716032
free memory of the heap :64422408
free memory of the heap :7358848

C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
r.gc() commented
total memory of the heap :67108864
free memory of the heap :64716032
free memory of tahe heap :64422408
free memory of the heap :64422408

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
import java.util.Date;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("Requesting JVM to run GC");
		Runtime r=Runtime.getRuntime();
        System.out.println("total memory of the heap :"+r.totalMemory());
        System.out.println("free memory of the heap :"+r.freeMemory());
		for(int i=0;i<10000;i++)
				{
					Date d=new Date();
					d=null;
				}
				System.out.println("free memory of the heap :"+r.freeMemory());
			    r.gc();
				System.out.println("free memory of the heap :"+r.freeMemory());
			}
	}



C:\Users\vinay.ts\Desktop>javac Test.java    //Example 4

C:\Users\vinay.ts\Desktop>java Test
Hello World! 123
total memory of the heap :67108864
free memory of the heap :64716032
free memory of the heap :64422408
free memory of the heap :7358848

C:\Users\vinay.ts\Desktop>javac Test.java     

C:\Users\vinay.ts\Desktop>java Test
r.gc() commented                             //Example 5
total memory of the heap :67108864
free memory of the heap :64716032
free memory of the heap :64422408
free memory of the heap :64422408

C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Requesting JVM to run GC                      //Example 6
total memory of the heap :67108864
free memory of the heap :64716032
free memory of the heap :64422408
free memory of the heap :7358840

C:\Users\vinay.ts\Desktop>


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
System.gc();
This is a static method.so calling by using class name..
gc method present in System class in static method 


Runtime r=Runtime.getRuntime();
r.gc();
This is a instance method we have to call using instatnce reference.
This is a instance method present in Runtime class.


Which of the folllwing are appropiate to Run GC.

System.gc():-  Valid Bcoz we are calling by using class name.

Runtime.gc() :- Invalid because its an instance method not a static method.
cannot call using class name..gc() method present in Runtime class is instance but not static.

new Runtime().gc() :-Runtime class is singleton class,we cannot create singleton class by using new () operator Refernce.

Runtime.getRuntime().gc() :-valid.

gc() method present in System class in static method.
gc() method present in Runtime class is instnace method.
(Run time class is Singleton class,we cannot create object for singleton class using constructor concept).


Note:-gc() method present in Sytem class is a static method.
Where as gc() method  present in Runtime class is instance method.



***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
We can requeest JVM to Run GC by calling
1)System.gc()
2)Runtime.getRuntime().gc() 

Which is the most usefull and recomemded approach..
instance method or static method...

Recomended to use static method only.
Instance method means create an Object time and memory required.

But in this approach Runtime.getRuntime().gc()  is recomended because...

See in System class have..

class System
{
	public static void gc()
	{
	         
	  Runtime.getRuntime().gc() // Internal implementation of the gc() method..
	}
}

Here System class gc() internally calls Runtime.getRuntime.gc().so its recomended to calll Runtime.getRuntime().gc() directly.
so we can able to reduce a method call time..

class System //System  class implementation
{
	public static void gc()
	{
	   Runtime.getRuntime().gc();
	}
}

so its recomended to calll Runtime.getRuntime().gc()

Go to System class and check it..predefined library(52:55).


It is convininent to use System.gc() method when compared with Runtime.gc() method.
With respect to perormance its highly recomemded to use Runtime.gc() method when compared  with System class GC method..

Because System class GC method internally call Runtime class method..
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
