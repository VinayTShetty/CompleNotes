TOPIC:-Exception Handling
--------
VIDEO NO=4(5) final block.
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
---------------
Just go once again to see all case have been covered.
**************************************************************************************
IMPORTANT EXAMPLES:-
8(5**)
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
final applicale for variables,methods,classes..

class is final we cannot apply inheritance,Child class creation is not possible.
mehtod is final we cannot override that method in Child class.
If a variable is declared as final we cannot perform re-assignment.(Because it will become constant)
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
finally
--------
try
{
	//Risky Code
}
catch (Exception e)
{
	//handling code
}
finally ()
{
   //clean up code
}

The specilality of final block is it will be executed always,
wheather Exception is raised or not raised.
wheather Exception is Handled or not Handled.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
Page:-105(Hand Writen notes)

finalize() is a method
----------------------

Object which doesn t have any reference is eligible for garbage collection.
So just before destroying the Object GC is going to call finalize() method.
finalize() method is used for clean up activities.


Who s calling finalize() method..?
 GC calls finalize method.

 When garbage collector calls finalize() method...?
 Just before destroying an Object it calls finalize() method.

 finalize() is  a method always invoked by Garbage Collector just before destroying an Object
 to perform clean up activities.
 once finalize() method completes immediately Garbage Collector destroys that Object.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
finally and finlaize() difference.
------------------------------------

finally
========
try
{
	
}
catch ()
{
}

  finally()
  {

 }

finally blocks is associatede with clean up activities with respect to try-catch block...

finally block is resposible to perform clean up activities related to try-block that is
wat ever resources we have opened as a part try-block will be closed inside finally block..

finlaize() 
==========
When object is not having any refernce then eligible for GC.
Where as finalize() method is responsible to perform clean up activities related to Object.
That is wat ever resources associated with object will be de-allocated before destroying an object
by using finalize() method..

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
Various possible combination of try-catch finally..

1)
try
{
	//risky code
}
finally
{
   //clean up activities.
}

In try block Exception is raised and i don t know how to handle that Exception,
so i am not writing catch block. 
so Exception is raised in try block then no catch block then abnormal termination 
so before abnormal termination it executes finally block to to perform clean up activities.
like closing the data base connection ..etc

Its abnormal termination ok..but execute finally before abnormal termination and
close data base connecetion. 

2)
try {}
finally {}
catch (X e) {} //CE: 'catch' without 'try'


try-finally ok.
But after finally there is a catch block compiler asking where its corresponding 
try block..
previously declared try block is linked to finally..
at the end catch block is alone so its giving an error as

//CE: 'catch' without 'try'

3)
try{}
System.out.println("hello");
catch(Exception e){}

CE:-coz that Frist try is not associated with catch and last catch is not associated with try.
coz in the middle sop statements is there.. 
so 2 CE..

CE:-2 errors will get.
try without catch and 
catch without try..

3)
try {}
catch (X e) {}
System.out.println("Hello");
catch (Y e) {} //CE: 'catch' without 'try'


try-catch and sop statements is ok no problem.
but after that sop statement, we are writing catch block where its is corresponding try- block.
so CE:-catch without try..


4)
****
valid

try
{
	try
	{
		
	}
	catch (ArithmeticException ae)
	{
	}
}
catch (ArithmeticException ae)
{

}

valid

For both Exception we are giving ArithmeticException ae..
coz for nested try its corresponding catch block and for outer try the outer catch block..
its valid to have same exception for both inner and outer try-catch.

Within the try-we can take another try-catch,acceptable no problem.

5)
Invalid
=======
try
{
	try
    {
	
	}
}
catch (Exception e)
{

}

Invalid
CE:-try-without catch or finally..
coz for innner try we are not writing its corresponding catch block.

6)
valid:-
------
try
{
	try
	{
		
	}
       finally
	{

	}
}
catch (Exception e)
{

}

Valid..

7)
Valid
-----
try
{
	
}
catch (Exception e)
{
 try
	{
		
	}
       finally
	{

	}
}

8)
try
{
	
}
catch (X x)
{
	finally
	{

	}
}

CE:-
finally without try.

9)
Valid
-----
try
{
	
}
catch (X e)
{

}
finally
{
	try
	{
		
	}
	catch (X e)
	{
	}

}
Valid
-----

We can take try-catch finally inside 
try
catch 
finally also no problem.
nesting of try-catch is allowed.

10)
Invalid..

try
{
	
}
catch (X x)
{
}
finally
{
   finally
	{

	}
}

CE:-
Coz try-catch-finally ok but inside finally inner finally not having its corresaponding try.
so CE 
finally without try..

11)
CE:-
error invalid

try
{
}
catch (X x)
{
}
finally
{
}
finally
{
}
CE:-
bottom finally doesnt have its corresponding try-block..
so CE:-
finally without try..

12)
Invalid:-
---------
CE
---

try
 System.out.println("hello");
catch (X x)
{
	System.out.println("catch");
}
finally
{
}

invalid
-------
CE:-

13)
Invalid:-
---------
CE
---
try
{}
catch (X x)
System.out.println("catch");
finally
{
}

14)

Invalid:-
---------
CE
---
try
{System.out.println("try");}
catch (X x)
{
	System.out.println("catch");
}
finally
System.out.println("finally");

12,13,14 all are invalid coz for try-catch-finally  curly braces are mandatory.
{} --->Compulsary we should take.


Theorey of all above:-
----------------------
1)
In try-catch-finally compulsary order is important.
try
{
	
}
catch (X x)
{
}
finally
{
}

2)
Whenever we are writing try,compulsary we should write eiether catch or finally otherwise
we ll get CE..

CE:-  
That try-without catch or finally is invalid.

3)
When ever we are writing catch block try block must be required..
catch without try is invalid..

4)
Whenever we are writing finally block compulsary we sholud write try block..
finally without try is invalid..


5)Inside try catch finally blocks we can declare try catch finally blocks.
That is nesting of try catch finally is allowed.

6)
try catch finally blocks curly braces are mandatory.
***************************-----END of--->5<--------***************************
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
12)
Invalid:-
---------
CE
---

try
 System.out.println("hello");
catch (X x)
{
	System.out.println("catch");
}
finally
{
}

invalid
-------
CE:-

13)
Invalid:-
---------
CE
---
try
{}
catch (X x)
System.out.println("catch");
finally
{
}

14)

Invalid:-
---------
CE
---
try
{System.out.println("try");}
catch (X x)
{
	System.out.println("catch");
}
finally
System.out.println("finally");

12,13,14 all are invalid coz for try-catch-finally  curly braces are mandatory.
{} --->Compulsdary

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
