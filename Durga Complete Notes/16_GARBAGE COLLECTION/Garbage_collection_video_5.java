TOPIC:-Garbage Collection.
--------
VIDEO NO=5
---------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED= YES
-----------------
finalization part 2.
27/07/18.

10:44


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
When we are calling finalize() method and while executing that finalize() method any exception is raised and which is uncaught.
JVM will terminate our program abnormally by raising the exception.

When GC calls  finalize() method and while executing that finalize() method any exception is raised and which is uncaught.
JVM ignores the exception and rest of the program continues normally.




***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
Page 69 My Notes.

This Object does not have any reference so it is eligible for GC.


Garbage collector came to destroy the Object.
Before destruction of the Object the garbage collector should call finalize() method.

so GC call s finalize() method..

while executing finalize() method somehere in the middle of the executuion of the method.
finalize()
{

										//Some where in the Middle.,In this scenario.The Object which is getting destroyed got the reference.
   s=this;						       //s = crrent Object.
   
                                        //here Finalize method got completed,GC can destroy the Object..?
	                                   //No 
                               	    //Because according to the rule if the Object is having any reference GC cannot destroy the Object.
                            		//In this scenarion Object got the reference.. see  s= this.
                                   //After few Steps Object reference again gone...i.e s=this; is gone..?
								   // GC...? can call finalize() method and destroy the OBject or GC will Destroy the Object immediately...? 
                                    
}



2 nd time GC won t call finalize(),directly it will destroy the Object.
Because for this Object clean up activities is already completed. what is the need of calling again..What is the need of calling finalize() method again.

On any Object GC will call finalize() method only once..

On any Object GC will call finalize() method only once.Even though the Object eligibel for GC 2 times..
Doubt:- Where this Object eligibel for GC 2 times..corss verify..





***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
On any Object GC will call finalize() method only once.

PROGRAME=3
=========
class FinalizeDemo
{
	static FinalizeDemo s;  //To acess everywhere from the class. so it is static.
		public static void main(String args[])throws Exception
			{
		  FinalizeDemo f=new FinalizeDemo();
		  System.out.println(f.hashCode()); //For every Object separate Hascode will be avalibale so i am printing it.
		  f=null;    // if f=null then this Object is eligible for GC. when this object is eligible for GC. we will call Garbage collector. by using System.gc();
 		 System.gc();  //Here Garbage collector immediately will call finalize() method.on this Object..the flow will go to finalize() method from here only.
		 Thread.sleep(5000);// Untill Garbage collector finishes his task we will make the main Thread wait.so we are calling Thred.sleep(); untill Garbage collector finishes finalize() method.When ever we are calling Thread.sleep() we need to handle the interupted exception so we are using throws keyword. Now the flow will go to finalize() method.

		 
		 System.out.println(s.hashCode()); //After completing the finalize() method the control will come here..Here we can print the hashcode of the object.Here its the same Object we can see from the hashcode same number..Even though finalize() method called Object is not destroyed,coz OBject is in the heap memorry. Object is not destroyed bcoz of the reference provided in the finalize() method.


		 s=null;  //Again here i am removing the reference of the Object.


		 System.gc();  // here again chceking wheathere GC will be called again or not so to check that i am calling System.gc();

		 Thread.sleep(5000);   // so i am making the Main Thread to wait to that GC will finish the finalize() method call for the 2 nd time...? or it will destroy the object directly. here we can observe that Garbage collector will destroy the Object.It won t call finalize() method again.
		 System.out.println("end of main method");
			}
		
		public void finalize()   //Taking the flow to finalize() method from Thread.sleep();
		{
			System.out.println("finalize method called");     
			s=this;  //For the current Object S reference came.Here S is what type ..? It is FianlizeDemo type.After completting this line the control will go to S.hashcode()  2 nd time printing sop statements.
		}
}



C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java FinalizeDemo
668849042
finalize method called
668849042
end of main method

C:\Users\vinay.ts\Desktop>a

EXPLANATION:-
============
For Every Object a unique HashCode is there..


Even though Object eligible for GC multiple times but GC calls finalize() method only once.

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========

class FinalizeDemo
{
	static FinalizeDemo s;  
		public static void main(String args[])throws Exception
			{
		  FinalizeDemo f=new FinalizeDemo();
		  System.out.println(f.hashCode());
		  f=null;    
 		 System.gc(); 
		 Thread.sleep(5000);

		 
		 System.out.println(s.hashCode()); 


		 s=null; 

		 System.gc();  
         System.out.println(f.hashCode()); 
		 Thread.sleep(5000); 
		 System.out.println("end of main method");
			}
		
		public void finalize()  
		{
			System.out.println("finalize method called");     
			s=this;  
		}
}





C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java FinalizeDemo
668849042
finalize method called
668849042
Exception in thread "main" java.lang.NullPointerException
        at FinalizeDemo.main(Test.java:19)

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
To show that Wheather the finalize() method is called again or not. it s not called.
If its called,we won t be getting the exception as null pointer..
If its called again i would have been intialized...in the finalize() method..
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========

EXPLANATION:-
============


Here if are intializing the multiple Object s to the same static variable what will happen..?
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
class FinalizeDemo
{
	static FinalizeDemo s;  
		public static void main(String args[])throws Exception
			{
		  FinalizeDemo f=new FinalizeDemo();
		  System.out.println(f.hashCode());
		  f=null;    
 		 System.gc(); 
		 Thread.sleep(5000);

		 
		 System.out.println(s.hashCode()); 


		 s=null; 

		 System.gc();  
         System.out.println(s.hashCode()); 
		 Thread.sleep(5000); 
		 System.out.println("end of main method");
			}
		
		public void finalize()  
		{
			System.out.println("finalize method called");     
			s=this;  
		}
}



Microsoft Windows [Version 10.0.17134.165]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\vinay.ts\Desktop>javac FinalizeDemo.java
Note: FinalizeDemo.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java FinalizeDemo
668849042
finalize method called
668849042
Exception in thread "main" java.lang.NullPointerException
        at FinalizeDemo.main(FinalizeDemo.java:19)

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============

In this Example i have checked that we are calling s.hashcode on a null object reference.


***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
class FinalizeDemo
{
	static FinalizeDemo s;  
		public static void main(String args[])throws Exception
			{
		  FinalizeDemo f=new FinalizeDemo();
		  FinalizeDemo f1=new FinalizeDemo();
		  System.out.println("f ="+f.hashCode());
		  System.out.println("f1 ="+f1.hashCode());
		  f=null;  
		  f1=null;  

		  
 		 System.gc(); 
		 Thread.sleep(5000);

		 
		 System.out.println(s.hashCode()); 


		 s=null; 

		 System.gc();  
        // System.out.println(s.hashCode()); 
		 Thread.sleep(5000); 
		 System.out.println("end of main method");
			}
		
		public void finalize()  
		{
			System.out.println("finalize method called");     
			s=this;  
		}
}




C:\Users\vinay.ts\Desktop>javac FinalizeDemo.java
Note: FinalizeDemo.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java FinalizeDemo
f =668849042
f1 =1631862159
finalize method called
finalize method called
668849042

EXPLANATION:-
============

Here S is pointing to 2 Object s but those 2 Objects will have Different hashcode,

Hashcode is related to Object i guess not Object Reference..
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
class Test 
{
	static int count;
	public static void main(String[] args) 
	{
		System.out.println("Main Method.");

		for (int i=0;i<1000000;i++)
		{
			Test t =new Test();
			t=null;

		}
	}

	
	public void finalize()
	{
	  System.out.println("This many time Garbage Collector will called finalize() method. "+ ++count);
	
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java Test
Main Method.
This many time Garbage Collector will called finalize() method. 1
This many time Garbage Collector will called finalize() method. 2
//Deleted here.
This many time Garbage Collector will called finalize() method. 93
This many time Garbage Collector will called finalize() method. 94
This many time Garbage Collector will called finalize() method. 95
This many time Garbage Collector will called finalize() method. 96
This many time Garbage Collector will called finalize() method. 97
This many time Garbage Collector will called finalize() method. 98

//Deleted here.


This many time Garbage Collector will called finalize() method. 461
C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
Every Time the Object is destroyed it will call finalize() method.

Garbage collector calls finalize() method on every Object separately and destroys that Object.

We can t expect exact brhaviour of Garbage collector ,It is varied from JVM to JVM and hece
for the following the Questions we can t provide exact answers.

1)when exactly JVM runs GC...?
2)In which order GC identifies eligible Objects.
3)In which order GC destroys elligible Object s.
4)Wheather GC destroys all eligible Object s or not.
5)what is the alogorithm followed by Garbage Collector etc..


when ever programe Runs with low memory then JVM runs GC.
But we can t expect at what time ..?

Most of the Garbage collector follow standard algorithm that is  Mark and Sweep algorithm.
It dosent meand every Garbage collector follows the same algorithm.


***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();

Student s1lakh=new Student();
Student s1core=new Student();
 
After creating  1 core Object memory problem came,If Memory Problem came and JVM will Call GC.
GC will come to Heap ARea and check wheather any Object is having null so that it is eligible for GC.
Memory Leaks..


The Object which are not using in our programe and which are not eligible for GC.
Such type of useless Object s are called Memory leaks.
In our programe if memory leaks present then the programe will be terminated by rising Out of Memory error.
Hence if an Object no longer required it is highly recomended to make that Object eleigible for GC.

The following are various 3 rd party management tools to identify memory leaks.

HP OVO
HP J Meter
J Probe
Patrol
IBM Tivoli.

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
