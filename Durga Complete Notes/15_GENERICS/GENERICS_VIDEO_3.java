TOPIC:-Generics
--------
VIDEO NO=3
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
20:19(7/4/18)
COMPLETED(11/4/18)
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
class Test<T> //T can be any type based on the Runtime. T is the type pareameter.
{
	public void m1()
	{
	    T a,b;
		sopln(a+b);
        sopln(a*b);
        sopln(a/b);
	
	}
}

If we Observe here we are performing arithmetic operation only on Number type.
Suppose we are passing String,Student Object the its meaning less..

If the Functionality is applicable only to particular range(that is the functionality is applicatble only to Number,we
cannot apply anywhre else) then we have to bound Type parameter upto Number Only.
So insted of <T> we should use <T extends Number>.


<T extends Number> --->As a type Parameter we can pass Number or its Child class es..
Number Child class--->Byte,Short,Integer,Long,Float,Double.



If we passing the Type parameter as Student Object then it s meaning less..
Bcoz we cannot add,Mutiiply Student Object..





We can bound a type parameter for particular range by  using extends keyword.
Such types are called Bounded type.

class Test<T> //UNbounded Type.
{
}

As the type parameter we can pass anytpe and there are no restricion,and Hence it is Unbounded type.
Test<Integer> =new Test<Integer>();
Test<String> =new Test<String>();

class Test<T extends Number> //Bounded Type.
{

}


***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
class Test<T> //UnBounded Type.
{

}


class Test<T extends Number> //As a Type parameter we can pass Number or its child class es..
{

} //Valid.

class Test<T implements Runnable> //As a Type parameter we can pass Runnable or its implemented classs es.
{

}//Invalid

class Test<T super String> //As a Type parameter we can pass String or its Super class es.
{

}//Invalid.

Becasue we define Bounded type only by using extends keyword.
implements,super these words not applicable..
But note:-Where ever implement keyword is there we can replace with extends keyword.


We can apply extends Keywords in Generics for interface also.
class Test<T extends Runnable> 
{

} //valid

Syntax for Bounded type.
------------------------
class Test<T extends x>
{

}

x-->Eiether class or interface.
If x is a class-->then as a type parameter  we can pass x type or its child  class es.
If x is interface-->then as a type parameter  we can pass x type or its implemented class es.

x can be eiether class or interface.
If x is a class then as a type parameter we can pass eiether x type or its child class es
If x is an interface then as type parameter we can pass eiether x type or its implementation class es.

***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
class Test<T extends Number>
{
}
Test<Integer> t=new Test<Integer>(); //valid.
Test<String> t2=new Test<String>();//Invalid.
CE:-type parameter j.l.String is its not in its Bound.

class  Test<T extends Number>
{
	public static void main(String[] args) 
	{
		Test<Integer> t=new Test<Integer>(); //valid.
        Test<String> t2=new Test<String>();//Invalid.
	}
}

Microsoft Windows [Version 10.0.16299.309]
(c) 2017 Microsoft Corporation. All rights reserved.

C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:6: error: type argument String is not within bounds of type-variable T
        Test<String> t2=new Test<String>();//Invalid.
             ^
  where T is a type-variable:
    T extends Number declared in class Test
Test.java:6: error: type argument String is not within bounds of type-variable T
        Test<String> t2=new Test<String>();//Invalid.
                                 ^
  where T is a type-variable:
    T extends Number declared in class Test
2 errors

C:\Users\vinay.ts\Desktop>
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
class  Test<T extends Runnable>
{
	public static void main(String[] args) 
	{
		Test<Runnable> t=new Test<Runnable>(); //valid.
        Test<Thread> t2=new Test<Thread>();//valid.
		System.out.println("heloo");
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
heloo

C:\Users\vinay.ts\Desktop>

---------------------------------------------------------------------------
class  Test<T extends Runnable>
{
	public static void main(String[] args) 
	{
		Test<Runnable> t=new Test<Runnable>(); //valid.
        Test<Thread> t2=new Test<Thread>();//valid.
		Test<Integer> t2=new Test<Integer>();//Invalid.
		System.out.println("heloo");
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:7: error: variable t2 is already defined in method main(String[])
                Test<Integer> t2=new Test<Integer>();//Invalid.
                              ^
Test.java:7: error: type argument Integer is not within bounds of type-variable T
                Test<Integer> t2=new Test<Integer>();//Invalid.
                     ^
  where T is a type-variable:
    T extends Runnable declared in class Test
Test.java:7: error: type argument Integer is not within bounds of type-variable T
                Test<Integer> t2=new Test<Integer>();//Invalid.
                                          ^
  where T is a type-variable:
    T extends Runnable declared in class Test
3 errors

C:\Users\vinay.ts\Desktop>
---------------------------------------------------------------------------
Unbounded type..

class  Test<T>
{
	public static void main(String[] args) 
	{
		Test<Runnable> t=new Test<Runnable>(); //valid.
        Test<Thread> t2=new Test<Thread>();//valid.
		Test<Integer> t3=new Test<Integer>();//valid.
		System.out.println("heloo");
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
heloo

C:\Users\vinay.ts\Desktop>
---------------------------------------------------------------------------




EXPLANATION:-
============
class Test<T extends Runnable>
{
}
Test<Runnable> t=new Test<Runnable>(); //valid. //Eiether Runnable or its implementation class es we can call..
Test<Thread> t2=new Test<Thread>();//valid.
Test<Integer> t3=new Test<Integer>(); //Invalid.
CE:-type parameter j.l.Integer is not in its Bound.

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============

class Test<T extends Number> //As a Type parameter we can pass Number or its child class es..
{

} //Valid.

class Test<T extends Runnable> //As a Type parameter we can pass Runnable or its implemented classs es.
{

}//valid


Here i want type parameter which should be child class of number,and should implement Runnable..
Both condition should be satisfied..

Such types only allowed..

class Test<T extends Number & Runnable>
{
	//As a type parameter we can pass anytype which should be Child class of Number,and should implement Runnable interface. 
}

We can define Bounded type in combination also..
There is no rule we can define bounded type only for one condition like extends,..
More than one condition also we can define..


We can define bounded type evnen in combination also.
class Test<T extends Runnable & Number>
{
	//As a type parameter we can take anything which should be child class of Number and should implement Runnable interface.
}

Search example for this
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
A class can implement more than one interface simultaneously..

Requirement:-As a type parmeter anything u can pass which should implement both Runnable and Comparable interface s..

A class can implement more than one interface simultaneously..//valid..

class Test<T extends Runnable & Comparable>
{
}

class Test<T extends Number & Runnable & Comparable>
{
}

class Test<T extends Runnable & Number >
{   //Invalid
	//If we are taking both class and interface.
	// In type Parameter frist we need to take class frist and then interface.same as normal in java class also.
	//we have to take class frist and then interface.
}



In normal class also we use..

class A extends B implements C
{
	//valid,..
}

class A implements B extends C
{
	//Invalid,.. Frist extends and then implements
}

---------------------------------------------------------------------------------------------------------
Requirememt is :-It should be Child class for Number and Thread..

class Test<T extends Number & Thread>
{
	//Invalid 
	//Bocz we cannot extend more than one class simultaneously..
	//java won t support multiple  inheritance..
}

In normal java class also..
class A extends B,C
{
	//Bcoz java class can t extend more than 1 class..
}

Number---> class
Thread---->class

Bcooz we canot extend more than 1 class simulaneously...

Final Review:-
1)My Type parameter can extends a class and implement an interface .
2)My Type parameter can implement more than one interface .
3)My Type parameter can extends a class and implement any no of interface s.


Invalid
1)My Type parameter can implements a interface and then extends a class//(Frist interface and then class is Invalid.).
2)My Type parameter extends more than one class // Coz multiple inheritance not supported in java.

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============

Valid

class Test<T extends Runnable & Comparable>
{
}


class Test<T extends Number & Runnable & Comparable>
{
}


Invalid
-------
class Test<T extends Runnable & Number >
{   //Invalid
	//If we are taking both class and interface.
	// In type Parameter frist we need to take class frist and then interface.same as normal in java class also.
	//we have to take class frist and then interface.
}


Bcoz we have to take class frist and then interface..


class Test<T extends Number & Thread>
{
	//Invalid 
	//Bocz we cannot extend more than one class simultaneously..
	//java won t support multiple  inheritance..
}

Becasuse we can t extends more than One class simultaneously.


***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
Note:-
------
class Test<T extends Number>  //valid
{
}

class Test<T implements Runnable> //Invalid,,Implements Keywords we cannot use.
{
}

class Test<T extends  Runnable>  //Valid..
{
}

class Test<T super String> //Super such type of terminology not applicable..
{
}


We can define Bounded Type only by Using extends keyword,
implements and super these keywords are not applicable...
where ever implements keyword is required we can use extends keyword only..




We can define Bounded Type only by Using extends keyword,
and we can t use implements and super keyword s.
But we can replace implements keyword purpose with extends keyword.
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
class Test<T>
{

}

T---->Type parameter..(Its just a convention of Type parameter)
Instead of T we can take X,Y,Z...?

As a type Parameter we can take any valid java Identifier.
 
As the Type parameter 'T' we can take any valid java identifier.But it is convention to use T.

***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
Upto to this we took only one Type parameter.

We can declare Multiple Type parameter //valid.
class Test<A,B)
{
	//These Parameters should be separated by ,(coma)
}

class Test<X,Y,Z>
{
	//3 or many type parameter.Based on requirement.
	//These Parameters should be separated by ,(coma)
}



HashMap is the group of key,value pair..
class HashMap<K,V>  //Here K is the key type and V is the value type.
{
}

HashMap<Integer,String> h=new HashMap<Integer,String>();//valid..
Based on our requirements we can declare  any no Type parameters, and all these type parameters should be separated wtih coma(,);
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
