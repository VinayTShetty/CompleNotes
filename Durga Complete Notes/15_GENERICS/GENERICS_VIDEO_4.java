TOPIC:-GENERICS
--------
VIDEO NO=4
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
30:17
5/5/18 COMPLETED

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
Generics methods and Wild Card Charcters..

***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
I have ArrayList of String..We can Add  only String type of Objects..
ArrayList<String> al=new ArrayList<String>();
I am calling
m1(al)
by passing ArrayList as argument..

Now the target here is how to declare this m1() method....?

public static void m1(ArrayList<String> al)
{

}


After few days i will call m1() method by passing 
ArrayList<Integer> al2=new ArrayList<Integer>();
m1(al2);

Is this valid...?

Here If we observe means m1() can take only String type as argument but we are passing Integer..?
what will happen...?
Here m1() can take ArrayList<String> as argument,but we are passing m1(al2),,i.e al2 is having Integer as argument.
that is we are passing Integer so type mismatch will be there...

We cannot use m1(al2) coz argument mismatch is there,compulsary we should go for new method.

The new method should be 

public static void m1(ArrayList<Integer> al)
{

}

ArrayList<Integer> al2=new ArrayList<Integer>();
m1(al2);   //valid..







***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
Example :-3
ArrayList <Double> al3=new ArrayList<Double>();//For this requirement i want to m1 () method 
m1(al3);

1)   public static void m1(ArrayList<Integer> al){}
2)   public static void m1(ArrayList<String> al){}

We cannot use 1) and 2) of Example 3,Bcoz type mismatch will be there in the argument.
Compulsary we need to go for the new Mehtod i.e

3)public static void m1(ArrayList<Double> al){}
m1(al3); //valid..

One Doubt here in normal data types If we are having double as argument means we can call it
by using int and byte as i know..

But in Double as argument can we call Integer or Byte or Short check it once..

See here 
Double double change in colours.

***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
PROGRAME=4
=========
EXPLANATION:-
============
Example :-4
ArrayList <Student> al4=new ArrayList<Student>();//For this requirement i want to m1 () method 
m1(al4);

1) public static void m1(ArrayList<Integer> al){}
2) public static void m1(ArrayList<String> al){}
3) public static void m1(ArrayList<Double> al){}
We cannot use 1) and 2) and 3) of Example 4 ,Bcoz type mismatch will be there in the argument.
Compulsary we need to go for the new Mehtod i.e

4)public static void m1(ArrayList<Student> al){}
m1(al4); //valid..

Same Student,if we are going for Customer,StringBuffer,the compulsary we need to go For new method().

Disadvantage:-If there is a change in the argument then compulsary we need to For new method.which causes the readibality down of the 
code..

How to overcome this Disadvantage.
So we need to declare a single method() that method, can be called by any type of the argument.
The method can take any type of  the argument.

1)public static void m1(ArrayList<?> al){} // ? mark means  anytype.

m1() method can be called  by passing any type of the argument..

ArrayList <Integer> al1=new ArrayList<Integer>();
m1(al1);//valid
ArrayList <Double> al2=new ArrayList<Double>();
m1(al2);//valid
ArrayList <String> al3=new ArrayList<String>();
m1(al3);//valid
ArrayList <Student> al4=new ArrayList<Student>();
m1(al4);//valid
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
PROGRAME=5
=========
EXPLANATION:-
============
1)public static void m1(ArrayList<String> al){}

We can call m1() method by passing the ArrayList of only String type.
ArrayList <String> l=new ArrayList<String>();
m1(l);

We need to define only 2 activities here...?
1)How to call this method...?
we can call this method by passing ArrayList of only String Type..i.e ArrayList<String>.

2)Within this method ,What activity we need to do...?

public static void m1(ArrayList<String> l)
{
    l.add("hi");//String Type.
	l.add(null);//null is valid value for any type including String also.
	l.add(10);//Invalid CE, here l is what  type ,Its String type so we can add only String type. we cannot add any other type.
	          
}

But within the method we can add only String type of Object s to list.
By  mistake if we are trying to add to any other type then we will get CE.
***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:-
-----
PROGRAME=6
=========
EXPLANATION:-
============
1)public static void m1(ArrayList<?> l){}

We can call m1() method by passing the ArrayList of any type.

ArrayList <String> l=new ArrayList<String>();
m1(l); //valid.

ArrayList <Integer> l2=new ArrayList<Integer>();
m1(l2); //valid.

We need to define only 2 activities here...?
1)How to call this method...?
we can call this method by passing ArrayList of any type.


2)Within this method ,What activity we need to do...?
public static void m1(ArrayList<?> l)  // At run time we can pass any type it might be Student type,Integer Type,Customer Type, etc any type.
{
    l.add("hi");//Invalid CE
	l.add(null);//Vaid.
	l.add(10.5);.//Invalid CE
	          
}

Within the method we cannot add anything expect null.The reason is At run time we may pass String,Integer,Byte,Customer,Student.
null is allowed bocz null is valid value for any type..

Within the method we cannot add anything to the list Except null Bcoz we don t the type exactly.
null is allowed bocz null is valid value for any type..

These methods are best Suitable for Read only operations
Ex:-
public static void m1(ArrayList<?> l) 
{
      
	System.out.println(l);          
}

If we are going to Write something then this method are not suitable..
***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
EXPLANATION:-
============
1)public static void m1(ArrayList<? extends X>  l){}

Here X can be class or interface..

If X is a class--->We can call m1() method by passing ArrayList X type or its  Child classes.

If X is interface---->We can m1() method by  passing ArrayList X type or its implemented classes.

1)How can we call this method..?
If X is a class--->We can call m1() method by passing ArrayList X type or its  Child classes.

If X is interface---->We can m1() method by  passing ArrayList X type or its implemented classes.

2)Withihn the method what we can do....?
But within the method we can t add anything to the expect null.
Because we don t the type exactly..

We might pass any child class es of different type so.
Same for interface also..

This type of method best suitable for Read only operation.

***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:-
-----
PROGRAME=8
=========
EXPLANATION:-
============
1)public static void m1(ArrayList<? super X> l ){} //valid...

Wrong Terminology:- Super we can t use in the Generics, In the Bounded type..

At class level type parameter T we cannot use super.
But at the  method level with ? mark symbol  use super keyword we can use  its valid.

x can be class or  interface.
If X is a class--->We can call m1() method by passing eiether ArrayList of X  type or its  super  classes.
If X is interface----> If X is in interface we can call this method by passing ArrayList of X type or super class of implementation class of x.

If X is interface----> If X is in interface we can call this method by passing ArrayList of X type or implementation class of x.(Invalid)
                       Bcoz implementation is already covered in extends.

(38:54)///Time Page 56 in notes.
Ex:-  Runnable(I)---------------->Thread(class)----------------------->Object
                       (Implemented class of Runnable)         (super class of Thread)
1)How to call this method..?
We can call this method.


2)Within the method what we can do...?
public static void m1(ArrayList<?> l)  
{
   l.add();
   // Within the method we can add X type of Objects or Null to the list.   
   // Search Example for this..
}

***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
PROGRAME=9
=========
EXPLANATION:-
============
With ? mark symbol at the method level super keyword is allowed.
At class level with T super keyword is not allowed..

1)public static void m1(ArrayList<? super X> l ){} //valid Syntax only..

If X is a class---->We can call this m1() method by passing  X type or its super class es..

If X is interface---->
***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
EXPLANATION:-
============
Which of the following declarations are allowed?
1. ArrayList<String> l1=new ArrayList<String>();//(valid)
 
2. ArrayList<?> l2=new ArrayList<String>();//(valid)
 
3. ArrayList<?> l3=new ArrayList<Integer>();//(valid)

4. ArrayList<? extends Number> l4=new ArrayList<Integer>();//(valid)   Bcoz Integer is the child class of Number.


5. ArrayList<? extends Number> l5=new ArrayList<String>();(invalid)

Output:
Compile time error.
incompatible types Found : java.util.ArrayList<java.lang.String> Required: java.util.ArrayList<? extends java.lang.Number>

Bcoz String class is not the Child class of Number.


6.ArrayList<? super String> l5=new ArrayList<Object>(); //valid
Object is the super class of String.

7.ArrayList<? > l=new ArrayList<?>(); //Invalid

 Output:
 Compile time error
 Test.java:11: unexpected type
 found : ? 
 required: class or interface without bounds

8.ArrayList<?> l6=new ArrayList<? extends Number>();
Test.java:12: unexpected type
Found :? extends Number
Required: class or interface without bounds
ArrayList<?> l7=new ArrayList<?>();
 
 
 we can use ? symbol only on the declaration part i.e on the left side only.
 Right Hand side compulsary there sould be class or interface.
 
 import java.util.*;
 This concept is nothing But=============>Parent Reference =Child class Object();
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
