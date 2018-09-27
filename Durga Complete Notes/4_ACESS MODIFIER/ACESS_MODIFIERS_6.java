TOPIC:- ACESS MODIFIER
--------
VIDEO NO=6
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-
**************************************************************************************
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============
In java order of modifier is not at all important.
public,abstract
or
abstract,public all are same.
***************************-----END of--->1<--------***************************
Example=2   compare rich and poor while Explaining this illegal combimation of modifier.
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
 abstract 
 
 
 native--> The methods having native modifier,
 logic implemented in other laungages like c or c++.

synchronized--->The methods having synchronized modifier
 These methods have implementation,
 These methods implemenmtation can be acessed by only one Thread at a time.


static--->The methods having static modifier
 These methods should  have implementation compulsary.

private--->The methods having private modifier
 These methods should  have implementation compulsary.

strictfp-->The methods having strictfp modifier
 These methods should  have implementation compulsary.


 Any modifier which talks implementation to a method is enemy to abstract.
 coz abstract method never talks about implementation.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
   abstract class Test
{

	public static void main(String[] args)
     {        
	       new Test();  
	 }
}	

C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: Test is abstract; cannot be instantiated
               new Test();
               ^
1 error

C:\Users\dell1\Desktop>
EXPLANATION:-
============
abstract :-
we are not allowed to create an object for abstract class.
coz we are not providing complete implementation.
 we cannot instatiate the class if we declared class as abstract.

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
abstract class vs abstract methods

 abstract class:-
 If a class contain atleast one abstract method then compulsary we should declare class as 
 abstract otherwise we will get CE.
 Reason:-If a class contain atleast one abstract method then implementation is not complete
 hence its not recomnended to create object.
 hence to restrict object instatiation,compulsary we should declare class as abstract.



even though class doesnt contain any abstract methods still we can declare class as abstract if 
we don t want istatiation of that class.
abstract class contain zero number of abstract methods also.

Example1: 

Ex:-HTTP servlet----->HTTP servlet class is abstract but it doesnt contain any abstract methods.
 
abstract  class  HTTP servlet
       {
         doget(){}
         dopost(){}
      }

 doget(){}
 dopost(){}
       these methods are implemented just to provide error information to the client.
	    these methods doesnt provide any service to the client.
		so creating object for HTTP servlet class and calling HTTTP servlet class methods
		by that object reference is not recomended so oracle declared as abstract.

 Reason:-
          doget(){}
         dopost(){}
                     does nt provide service just gives error information.

 Example2: Every adapter class is abstract but it doesn't contain any abstract method.
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
 class Test
{
	public void m1();
}
C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: missing method body, or declare abstract
        public void m1();
                    ^
1 error

EXPLANATION:-
============
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
 class Test
{
	abstract public void m1(){}
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:1: error: Test is not abstract and does not override abstract method m1() in Test
class Test
^
Test.java:3: error: abstract methods cannot have a body
        abstract public void m1(){}
                             ^
2 errors

EXPLANATION:-
============
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 class Test
{
	abstract public void m1();
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:1: error: Test is not abstract and does not override abstract method m1() in Test
class Test
^
1 error

EXPLANATION:-
============
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
  abstract class Test
{
	abstract public void m1();
}
 
 
C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
========= 
  abstract class Parent
{
	abstract public void m1();
	abstract public void m2();
}
class Child extends Parent
{
   public void m1(){}
}
 
  C:\Users\dell1\Desktop>javac Test.java
Test.java:6: error: Child is not abstract and does not override abstract method m2() in Par
class Child extends Parent
^
1 error

EXPLANATION:-
============
 If we are extending abstract class,then for each and every abstract method of parent class
 we should provide implementation.otherwise we have to declare child class as abstract.

 In this case next level child class is responsible to provide implementation.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
(1:00:00)
 PDF(135) page 25:- some mistake in notes i did nt understand.
 Difference between final and abstract.(Durga s Point)

abstract methods compulsary we should override in child classes,to provide implementation.
where as we can t override final methods hence,final abstract combination is illegal combination for methods.

 
for final classes we can t create child classes,where as for abstract classes
we should create child class to provide implementation.
Hence final abstract combination is illegal for classes.

***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:- Interview question
-----
PROGRAME=11
=========
 final class Test
{
	abstract public void m1();
}

C:\Users\dell1\Desktop>javac Test.java
Test.java:1: error: Test is not abstract and does not override abstract method m1() in Test
final class Test
      ^
1 error

EXPLANATION:-
============
***************************-----END of--->11<--------***************************
Example=12
=========
NOTE:-abstract class con contain final methods with implementation.
-----
PROGRAME=12
=========
 abstract class Test
{
	final public void m1(){};
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-abstract class con t contain final methods without implementation(i.e abstract methods).
----- illegal combination of modifiers
PROGRAME=13
=========
 abstract class Test
{
	final abstract public void m1();
}


C:\Users\dell1\Desktop>javac Test.java
Test.java:3: error: illegal combination of modifiers: abstract and final
        final abstract public void m1();
                                   ^
1 error

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
 PDF(135) page 25:- some mistake in notes i did nt understand.
 Difference between final and abstract.(Durga s Point)

abstract class contain final methods where as final class can t contain abstract methods.
It is highly recomended to use abstract modifier because it promotes several oop features
inheritance and polymorphism.
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
