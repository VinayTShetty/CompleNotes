TOPIC:- Generics
--------
VIDEO NO=2
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=NO
-----------------
10:00 (21/3/17)
IMPORTANT EXAMPLES:-
33:00:00(26/3/18)
46:00:00(26/3/18)
56:00:00(02/4/18)
----------------->START OF EXAMPLES<---------------------------
Example=1
=========
NOTE:-
-----
PROGRAME=1
=========
EXPLANATION:-
============

To hold only String type of Object s we can create Generic version of ArrayList Object s as follows.

ArrayList<String> l =new ArrayList<String>();

For this ArrayList we can add only String types of Object s.
By mistake if we are trying to add anyother type then we will get CE.

l.add("Durga");//valid
l.add("Ravi");//valid
l.add(new Integer(10));// CE

hence through Generics we are getting Type safety.


In the above code we added String Objects to ArrayList, and i want to retrive elements.

Here i am not gonna use type casting.,

String name1=l.get(0); // how the compiler is gonna consider.
						// here l is ArrayList of String Type.
						 //So it gonna hold only String type. So type casting is not required.
At the time of retrival we are not required to perform type casting.
Hence through Generics we can solve Typecasting Problem.


***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============

ArrayList l=new ArrayList();
1)Non Generic version Arraylist
2)Not type safe.(For this ArrayList we can add any type of Object s ,so it is not type safe.)
3)Type casting is Required at the time of Retrival.

ArrayList<String> l=new ArrayList<String> ();
1)It is Generic version of ArrayList.
2)Type Safe(For this ArrayList we can add only String type of Object s ,so it is type safe.)
3)Type casting is not required at the time of Retrival.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
import java.util.*;
class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("ArrayList<String> l=new ArrayList<String>();");
		ArrayList<String> l=new ArrayList<String>();
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
ArrayList<String> l=new ArrayList<String>();

C:\Users\vinay.ts\Desktop>
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
import java.util.*;
class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("List<String> l=new ArrayList<String>();");
		List<String> l=new ArrayList<String>();
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
List<String> l=new ArrayList<String>();

C:\Users\vinay.ts\Desktop>

***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============

import java.util.*;
class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("Collection<String> l=new ArrayList<String>();");
		Collection<String> l=new ArrayList<String>();
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java

C:\Users\vinay.ts\Desktop>java Test
Collection<String> l=new ArrayList<String>();

C:\Users\vinay.ts\Desktop>
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
import java.util.*;
class  Test
{
	public static void main(String[] args) 
	{
		System.out.println("ArrayList<Object> l=new ArrayList<String>();");
		ArrayList<Object> l=new ArrayList<String>();
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:7: error: incompatible types: ArrayList<String> cannot be converted to ArrayList<Object>
                ArrayList<Object> l=new ArrayList<String>();
                                    ^
1 error

C:\Users\vinay.ts\Desktop>
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
import java.util.*;
class  Test
{
	public static void main(String[] args) 
	{
		
		ArrayList<int> l=new ArrayList<int>();
	}
}


C:\Users\vinay.ts\Desktop>javac Test.java
Test.java:7: error: unexpected type
                ArrayList<int> l=new ArrayList<int>();
                          ^
  required: reference
  found:    int
Test.java:7: error: unexpected type
                ArrayList<int> l=new ArrayList<int>();
                                               ^
  required: reference
  found:    int
2 errors

C:\Users\vinay.ts\Desktop>
EXPLANATION:-
============
Conclusion 2:-
--------------
	ArrayList<  > x=new ArrayList<   >();
             //x                   //x


Her in x blank that is parameter type we can take anything i.e,
1)Any Class Name.i.e Customer,Student ,Integer,String ...
2)Any Interface Name.

But we cannot take Primitives types..
ArrayList<int> x=new ArrayList<int>();
If we doing something like this we ll get CE.

Because ArrayList that is Collection s can hold only Object s but no primitives.

For type parameter we can give any class or interface name but not primitives.
If we are tryng to provide primitives then we ll get CE.


***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
But in 1.5v a generic version of ArrayList class is declared as follows.


class ArrayList<T>
{
	add(T t);      //Add method can take T type as a argument.
	T get(int index);// Return type of get method is T type.
}

Based On our Runtime requirement Every T can be replaced with our OWN  type. //Important Point.

Suppose we need to hold only String type of Objects then we can go with.
ArrayList<String> l=new ArrayList<String>();

Here every T will be replaced with String.


The compiler created class looks like,Every <T> will be replaced String type. //Important Point.
                                                                             //A class with Type parameter is generic class.

class AL<String>
{
	add(String s);
	String get(int index);
}


	add(String s); ---->Here add method will take only String type as argument.
String get(int index)---->Here the get return type is String, so we can get only String type only.so no need of type casting.

l.add("Durga"); //valid
l.add(new Intgeger(10)); //Invalid
 In the ArrayList we have  String as generic, add method can take only String as argument not Integer.
 so we will get 
CE:-

CFS :- method add(j.l.Integer );   // There is no add method which can take Integer as argument.
      location class ArrayList<String>.   //See location also.when compiler is doing the code.


String name1=l.get(0); //
               Here l is of the ArrayList 
			   In the ArrayList class return type of get() method is String type.
			   so there is no need of doing type casting.



***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============

For Example to hold only string type of objects we can create a generic version of ArrayList object can be created as follows.

ArrayList<String> l=new ArrayList<String>();

For this Requirement compiler considered version of ArrayList class is as follows.

class ArrayList<String>
{
add(String s);
String get(int index);
}

add() method can take only string type as argument,
And the return type of get() method is String type.

The Argument to add() method is String type hence we can add only String type of Object s.By mistake we are adding anyother type we 
will get CE.

l.add("Durga"); //valid
l.add(new Intgeger(10)); //Invalid

CFS :- method add(j.l.Integer );   
      location class ArrayList<String>.

Hence through Generics we are getting type safety.
The return type of get() method is String type and hence at the time of Retrival we are not required to perform type casting.


String name1=l.get(0);



In c and c++ this generic concet is called Template concept.
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-r
-----
PROGRAME=10
=========
EXPLANATION:-
============
System.out.println("The type of object is:"+obj.getClass().getName());

If i know the Object reference we can print the corresponding class name.By using this method..


Page 9 Durga Notes PDF that example need to see for alternate cases and different scenario.
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
