TOPIC:-Enum
--------
VIDEO NO=3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
17:17
36:51
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
Enum vs Constructor.

Every Enum constant represent a Object.
If its an Object compulsary there  should be constructor concept also.
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============

Every enum constant is an Object.
If its a Object compulsary there should be constructor concept.,because constructor is meant for Object only.
So inside enum we can take constructor also.
Because enum contains Object s.
Object s means constructor terminology is there.

Every enum constant is an Object.
Here we are creating 3 objects so 3 times constructor will be executed.
Every Enum constant is  always static ,so static variables will be created at the time of class loading.

so at the time of enum class loading all this 3 constants(constructor) will be executed and their corresponding constructor
will be executed.

constructor will be executed when we create an object,these Object s will be created during enum class loading automatically,
because these are static variables.

so the enum class constructor can be executed separately for Every Object at the time of enum class loading.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
enum Beer
{
  KF,RC,KO;
  Beer()
	{
      System.out.println("Enum constructor");
    }

}	

class Test
{
  
public static void main(String [] args)
	{
       System.out.println(" Helolo");

    }
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
 Helolo

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============


Here 2.class file will be generated after compiling.
Beer.class and Test.class.

If we are executing java Test here java Test.class will be loaded.
Here we are not using Beer functionality anywhere in the Test class.


here we are not loading any Beer.class file.
so we are getting o/p as only  Helolo.


***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
enum Beer
{
  KF,RC,KO;
  Beer()
	{
      System.out.println("Enum constructor");
    }

}	

class Test
{
  
public static void main(String [] args)
	{
	         Beer b=Beer.RC;                   //      If we comment this line Beer functionality we are not using so Beer.class file will not be loaded.Hence the o/p is helloo.
       System.out.println(" Helolo");

   }
}



C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Enum constructor
Enum constructor
Enum constructor
 Helolo

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============

Here 2.class file will be generated.
Beer.class and Test.class.

when we execute Test.class it will load Beer.class file also i guess..(Because we are using Beer functionality also in Test class..)


Here y the constructor is getting executed 3 times..?

Here we are calling one Constants or two Constants it does nt matter..

Frist .class file should be loaded.(i.e Test.class)
All the static constants should be created.
so for each constatnts the constructor will be executed..



Here we are calling one Constants or two Constants it does nt matter..
Here we are loading .class file,after .class file loading all the static constatnts will be executed.
for all the object s the corresponding constructor will be executed.



In this program we are executing Test.class file,in the Test class we are using Beer Functionality.
so Beer.class file will be loaded. when ever we load Beer.class file all the static constant s  of Beer enum will be Created.
so Every Constant in enum is static.

so hence all 3 constants of enum will be created,so 3 times constructor will be executed.




Durga Point:-
Enum can contain constructor.enum constructor will be executed separately for every enum constant at the time of enum class loading
automatically.


***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
enum Beer
{
  KF,RC,KO;
  Beer()
	{
      System.out.println("Enum constructor");
    }

}	

class Test
{
  
public static void main(String [] args)
	{
	         Beer.RC;                          //Observe here we are not catching it so we are getting the error.Find out the reason for that...
       System.out.println(" Helolo");

}
}




C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:16: error: not a statement
                 Beer.RC;
                     ^
1 error

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
enum Beer
{
  KF,RC,KO;
  Beer()
	{
      System.out.println("Enum constructor");
    }

}	

class Test
{
  
public static void main(String [] args)
	{
	         Beer b= new Beer();
       System.out.println(" Helolo");

}
}


Microsoft Windows [Version 10.0.17134.165]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:16: error: enum types may not be instantiated
                 Beer b= new Beer();
                         ^
1 error

C:\Users\vinay.ts\Desktop>

EXPLANATION:-
============


Here we are misusing enum syntax.If we want to Create a enum constatn just declare it in the enum.
No need of creating a new Object.

already enum is having syntax to create it.so please use it..


We can t create enum Object directly.
and hence we can t invoke enum constructor directly.

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
If we are taking abstract class,then we have to give their implementation in child class.

But if we are taking abstract class inside enum,we have to provide implementation.
But in enum we are unable to create child class.coz every enum is always final..


One more thing if a class contain one abstract methods then the class should be declared as abstract.
so in enum we have a abstract method then the enum should be declared as abstract.
Every enum is final so,final and abstract are illegal combination.


Note:- Inside enum we can declare methods but should be concerete methods only.
and we can t declare abstract methods.
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
1)Beer.KF.equals(Beer.RC)-------------------> false------>valid.
2)Beer.KF.Hashcode()>Beer.RC.Hashcode()------>valid.  solution might be true or false.but it s valid..



3)
Between 2 Object s we cannot apply relational operator.(i.e <, etc).


Student s1=new Studemt();
Student s2=new Studemt();

s1<s2  it s invalid..

s1.height<s2.height  its valid..
.we can compare the properties of the Object.But we cannot compare the object itself..

Beer.KF<Beer.Rc----------------->Invalid..

4)Beer.KF.ordinal()<Beer.RC.ordinal()------>valid.  Here we are comparing 2 ordinal values like 10 or 20.





Every enum constatnt represent an Object of that type enum.Hence what ever methods we can apply on normal java Object s.
can be applicable on enum constant also..
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
We can acess static members by using class name.
Without using class name If you want to acess static member then we can use it by  static import.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========


import java.util.ArrayList;
//import java.util.*;
class Test
{
  
public static void main(String [] args)
	{
	        ArrayList l=new ArrayList();//  
			 System.out.println("ArrayList Print");

   }
}







Microsoft Windows [Version 10.0.17134.165]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
ArrayList Print

C:\Users\vinay.ts\Desktop>



//import java.util.ArrayList;
import java.util.*;
class Test
{
  
public static void main(String [] args)
	{
	        ArrayList l=new ArrayList();//  
			 System.out.println("ArrayList Print package change.");

   }
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
ArrayList Print package change.

C:\Users\vinay.ts\Desktop>











EXPLANATION:-
============

If we want Acess class/interface name directly from outside package.(Here we are using ArrayList).
Actually ArrayList is present in util package..
so normal import is necessary.
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
EXPLANATION:-
============
We can acess static variable by using class name.
Without using class name we want to acess means then we should go for static import.


System.out.println(Math.sqrt(4)); //Here we are using class name to acess static method sqrt(4).


Suppose we don t want to acess using class name then we should go for static import i.e
import static java.lang.Math.sqrt;
System.out.println(sqrt(4));




Durga:-If we want to use class/interface directly from outside package then the required import is normal import.
If we want to acess static members without class name then the required import is static import.
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-
-----
PROGRAME=12
=========
EXPLANATION:-
============

Page 73 in notes.


***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
enum Colour
{
   BLUE,RED,GREEN;

   public void info()
	{
         System.out.println("Info colour");
   
     }

}

class Test
{

	public static void main(String [] args)
	{
	  Colour c []=Colour.values();
	  for (Colour c1:c)
	  {
		  c1.info();
	  }
	
	 }
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Info colour
Info colour
Info colour

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
enum Colour
{
   BLUE,RED
	   {   
          //This concept is called Anonymous inner class.   for this behaviour i.e RED only this info() mehthod having Dangerous coloue is avaliable.
   public void info()
	{
         System.out.println("Dangerous Colour");
   
     }
        
   
      },GREEN;

   public void info()
	{
         System.out.println("Info colour");
   
     }

}

class Test
{

	public static void main(String [] args)
	{
	  Colour c []=Colour.values();
	  for (Colour c1:c)
	  {
		  c1.info();
	  }
	
	 }
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Info colour
Dangerous Colour
Info colour

C:\Users\vinay.ts\Desktop>
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
Enum:- Is a class. every enum in java is a child class of enum.This class acts as base class for all enum..All base properties of enum in java is comming from this class..

Enumeration:-It s a interface,In collection we have to use.In collection we have to use to get the Object s one by one.Its like a cursor.
similar to enumeration iterator and listiterator is there.

enum:-	Is a keyword is used to define a group of named constants.

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
