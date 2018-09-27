TOPIC:-Garbage Collection
--------
Fianllization Part 1

VIDEO NO=4
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
22/07/18
38:00
44:00
27/07/18
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
cleanup activities:-
1)Close database connection.
2)Finish network related operation.

The above are Resource allocation activities.


1)finalize() method is required for Every Object..
It might be student Object,
Customer Object,
Connection Object..
For every Object finalize() method is required..
so finalize() method is defined in Object class..Any methods present  in Object class we can happily apply for all Objects.

Object class contain 11 methods.

Signature of the finalize() method..

protected void finalize() throws Throwable
{

}

Based on the our requirement we can override this method in our class.
I have clean up activities related to student Object so  in student class so i will override the finalize() method in Student class to perform clean up activities.
I have clean up activities related to Customer Object so  in Customer class so i will override the finalize() method in Student class to perform clean up activities.

Finalization:
Just before destroying any object gc always calls finalize() method to perfom clean up activities.
Once finalize() method completes automatically gc destroys that Object.

finalize() method present in Object class.With the following declareation.

protected void finalize() throws Throwable
{

}

Is it possible to override this method in our class..?
protected means it is highly recomended to overide in our class..
We can override the finalize() method in our class.To define our own clean up activities.its valid..



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
	Test t=new Test();
	String s=new String("bhaskar"); //We created one String Object.
	s=null; // We are making the Object eligible for GC.
	System.gc();// We are requesting JVM to Run GC.
	System.out.println("End of main.");
  }
   
   public void finalize()
	   {
        System.out.println("finalize() method is executed");
       }
}


C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java Test
End of main.

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============
Here Assumption Output is:-

finalize() method is executed
End of main.

Bcoz frist JVM will call finalize() method and it comes again and executes main method..

But the assumption is wrong..
See the explanation in Example 3 Scenario..
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
18:51

PROGRAME=3
=========
Here how many Thread s are there..? only one Thread that is main Thread.
1)main Thread creates String Object.
2)main Thread makes Object eligible for GC.
3)After calling System.gc()...? How many thread s are there...?
      2 Thread s are there..
	  a)Main Thread also there..
	  b)Thread which is executing in the backgrouund also came that is daemon Thread..
	  
	  After this manin Thread is responsible to execute remaining code.Garbage collector is resposible to execute finalize() method.

	  If 2 Thread s are there in which order it will execute we are not sure it might it 

	  Scenario 1
	  1)End of main.
      2)finalize() method is executed

	  	  Scenario 2
		  1)finalize() method is executed
          2)End of main.

 But we won t get this possibile output see the Reason..
      
We will get only 
End of main.   as output..

It s valid overiding only Bcoz
1)protected to public valid overirding.
2)If parent class method throws Throwable there is no rule that child class should throw Throwable only.No such rule..

Here why finalize() method is not getting executed...? what is the reason...?

1)Here we are calling System.gc() but JVM not accepting the request..
  so that only finalize() method is not getting executed..?

  No Garbage Collector came it destroyed the Object and called  finalize() method this is exactly true..!
  What is the internal reason..?

            Reason is See Observely properly..
			String s=new String("bhaskar"); 
        	s=null;
        	System.gc();

			Here we are making the String Object eligible for GC ,
			On String Object we are calling System.gc().
			So Garbage Collector will call String class finalize() method.
			Not Test class finalize() method...

			String class finalize() method is having empty implementation so nothing will be executed..

1)Here Just before destroying the String Object GC will call finalize() method on String Object.
so String class finalize() method will be executed.Which is having an empty implementation.so we are seeing only "main method."

If s is Student type then Student class finalize() method will be executed.
If s is Customer type then Customer class finalize() method will be executed.



class Test
{
	public static void main(String args[])
  {
	Test t=new Test();  // 
	String s=new String("bhaskar"); 
	s=null;
	System.gc();
	System.out.println("End of main.");
  }
   
   public void finalize()
	   {
        System.out.println("finalize() method is executed");
       }
}



EXPLANATION:-
============
Jsut before destroying an Object GC will calls finailize() method on the Object  which is eligible for GC.
Then the corresponding class finalize() method will be executed..

If String object eligible for GC ,then String class finalize() method will be executed.But not Test class finalize() method.

In this example String Object is eligible for GC,and Hence String class finalize() method got executed.
which has empty implemenation and hence the output is "End of main."

If we replace String Object with Test Object then Test class finalize() method will be executed.
In this case the o/p is 
"End of main"
"finalize method calll"
or
"finalize method calll"
"End of main"

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
Here Test class finalze() method will be executed..
Bcoz we are making Test class finalize() method is getting executed.
Which Thread is getting executed we are not sure we can see that also.. o/p is fluctatuing..


class Test
{
	public static void main(String args[])
  {
	Test t=new Test(); 
	//String s=new String("bhaskar"); 
	t=null;
	System.gc();
	System.out.println("End of main.");
  }
   
   public void finalize()
	   {
        System.out.println("finalize() method is executed");
       }
}


C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java Test
End of main.
finalize() method is executed

C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java Test
End of main.
finalize() method is executed

C:\Users\vinay.ts\Desktop>javac Test.java
Note: Test.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

C:\Users\vinay.ts\Desktop>java Test
finalize() method is executed
End of main.

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
PDF Page 10 Case 2. Durga Notes.

Based on our requirement explicitly then it will be executed just like a normal method call and Object won t be destroyed.
If garbage collector calls finalize() method Object will be destroyed.

Note:-If we are calling finalize() method explicitly it will be executed like a normal method call and Object won t be destryoed.
If Garbage collector callls finalize() method Object will be destroyed.


In the Servlet life cycle methods are 
1)init
2)Service.
3)Destroy.


After servlet intiation init method will be called by webcontainer to perform intialization activities

If i configure load on startup then at the time of server start up only initialization only.

In servlet init method will called only once.
For every request service method will be called..

Web container needs to destroy servlet object,just befor destroying the servlet Object.
Destroy() method will be called only once for clean up activities..


Ex:-
init()
{
destroy();
}
service()
{
 destroy();
}

destroy() method will be executed just like a normal method call and servlet Object won t be destroyed.

destroy() method will be called onlyy oncce.
Just before destroying servlet Object webContainer will call.


Note:-init,service,destroy method s are considered as life cycle methods of servlets.
just before destroying servlet Object web container calls destroy () method to perform clean up activities.
But based on our requirement we can destroy method fromm init() and service method then destroy() method will be executed just like a normal method
call and servlet Object won t be destroyed.

***************************-----END of--->5<--------******************
*********
Example=6
=========
NOTE:-
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
