TOPIC:-ACESS MODIFIER 
--------
VIDEO NO=4
-----------
NUMBER OF PICTURES=NULL
------------------
VIDEO COMPLETED=YES
-----------------
**************************************************************************************
IMPORTANT EXAMPLES:-7,
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
All Data Base operation related class and interface are grouped into SQL package.

All classes and interafces related to file read and write operation are grouped into IO package.


To improve modularity of the application.
meaning is ordering and delivering the application.
we can biforgate into into loan module,Account module, 
***************************-----END of--->1<--------***************************
Example=2
=========
NOTE:-
-----
PROGRAME=2
=========
EXPLANATION:-
============
It is an encapsulation mechanism to group related classes and interfaces into a single
unit which is nothing but package.
All classes and interface which are required for data base operation are grouped into single package
called SQL package

All classes and interface which are usefull for file IO operation are grouped into separate package 
which is nothing but java.Io package.
***************************-----END of--->2<--------***************************
Example=3
=========
NOTE:-
-----
PROGRAME=3
=========
EXPLANATION:-
============
class {}
deault acess modifier means we can acess within the package.
outside people we cannot acess.

package is a java keyword.
***************************-----END of--->3<--------***************************
Example=4
=========
NOTE:-
-----
 source file saving in desktop only.
 It compiles fine so .class file will be generated in current woring directory(i.e desktop).

PROGRAME=4
=========
 package com.java.Vinay.Tution;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac Test.java

C:\Users\dell1\Desktop>java Test
Error: Could not find or load main class Test

EXPLANATION:-
============

   C:\Users\dell1\Desktop>javac Test.java    ---->can use normal command to compile the source file

  C:\Users\dell1\Desktop>java Test         ---->caannot run  reason find out.
  Error: Could not find or load main class Test


Note:- NO package folder,and subfolder will be created.
by using
javac command
***************************-----END of--->4<--------***************************
Example=5
=========
NOTE:-
-----
  saving the source file in Desktop only.

 


PROGRAME=5
=========
 package com.java.Vinay.Tution;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello");
	}
}
 
C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>java Test
Error: Could not find or load main class Test

 
EXPLANATION:-
============
C:\Users\dell1\Desktop>javac -d . Test.java //-->Using this command creates a package folder in 
                                         //current working directory as the source file is saved in Desktop
        As-->C:\Users\dell1\Desktop\com\java\Vinay\Tution

		Note it creates the .class file in the last folder-->Tution

C:\Users\dell1\Desktop>java Test                 //--->But using this command
Error: Could not find or load main class Test   //---> we cannnot Run the java programe find the reason 
 


 javac -d . Test.java

 -d --->destination/directory to place generated .class files
      Note:-source file will be saved in Current working directory.
 
 .   -->(dot) means current working directory

  

  -d . Test.java ---->together we take it means
 
        read from reverse side 
In the current working directory 
create a package folder with the corresponding packages
 
 com      --->(current working directory)
 --->java
      --->Vinay
          --->Tution-->Test.class file

and place the Test.class file.

***************************-----END of--->5<--------***************************
Example=6
=========
NOTE:- CWD=current working directory
-----
PROGRAME=6
=========
EXPLANATION:-
============
case 1:-
javac Test.java
         Generated .class file will be placed in the current working directory

		  CWD
		    -->Test.class 

 case 2:-
 
 javac -d . Test.java
   
    Note :-source file will be placed in CWD
   
   Generated .class file will be placed in the correponding package structure in CWD
  
 com      --->(current working directory)
 --->java
      --->Vinay
          --->Tution-->Test.class file

***************************-----END of--->6<--------***************************
Example=7
=========
NOTE:-
-----
PROGRAME=7
=========
 package com.java;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac -d . Test.java


EXPLANATION:-
============
 If the CWD already contains 

 com
    --java
 
 It automatically places the .class files there.
 It won t create a new folder
 ----------------------------------------------------------------------
 How to check the generated .class files from cmd window along with time
 
C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>cd com

C:\Users\dell1\Desktop\com>cd java

C:\Users\dell1\Desktop\com\java>dir
 Volume in drive C has no label.
 Volume Serial Number is 380F-2235

 Directory of C:\Users\dell1\Desktop\com\java

01-12-2016  14:48    <DIR>          .
01-12-2016  14:48    <DIR>          ..
01-12-2016  14:48               416 Test.class ///------------>See here
               1 File(s)            416 bytes
               2 Dir(s)  14,061,707,264 bytes free
***************************-----END of--->7<--------***************************
Example=8
=========
NOTE:- Meaning for -d
-----
 javac 

      -d <directory>             Specify where to place generated class files
PROGRAME=8
=========
EXPLANATION:-
============
***************************-----END of--->8<--------***************************
Example=9
=========
NOTE:-
-----
If the corresponding package structure is not already avaliable then this commnad itself will create
corresponding package structure.

PROGRAME=9
=========
 package com.java.Vinay.Tution.Programes;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac -d . Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
Case 1:-
 In the current working directory it will create a package 
 com
 --->java
       --->Vinay
	          --->Tution
			         --->Programes
 Case 2:-
 In the current working directory it will create a package 
 Assume only these folders are there remaining are deleted.

 com
 --->java
       --->Vinay
               //---> continue from here           
 	   already till Programes packages is there so compiler will 
	   start creating next folder in that same CWD.it won t create new folders
  com
 --->java
       --->Vinay
	          //---> continue from here           
	           --->Tution
			          --->Programes

 Special case:-(Very important case)
 If the frist folder is not there it won t check for the remaining folder
 it will create new Package folder
 Ex:- 
                    //-->Here com is missing so it won t check remaining it will create new 
 --->java
       --->Vinay
	          --->Tution
			         --->Programes   

  compiler will create a new package folder structure coz frist folder is missing(com).
      
com
  --->java
        --->Vinay
   	          --->Tution
	   		         --->Programes

***************************-----END of--->9<--------***************************
Example=10
=========
NOTE:-
-----
PROGRAME=10
=========
 package com.java;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello");
	}
}



C:\Users\dell1\Desktop>javac -d I: Test.java

C:\Users\dell1\Desktop>

EXPLANATION:-
============
 C:\Users\dell1\Desktop>javac -d . Test.java
        Replace . (dot) with any Drive name uppper case and lower case both works same

==========>
      C:\Users\dell1\Desktop>javac -d I: Test.java 
     
***************************-----END of--->10<--------***************************
Example=11
=========
NOTE:-
-----
PROGRAME=11
=========
 package com.java.Vinay.Tution.Programes;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello");
	}
}


C:\Users\dell1\Desktop>javac -d z: Test.java
javac: directory not found: z:
Usage: javac <options> <source files>
use -help for a list of possible options

EXPLANATION:-
============
 javac -d z: Test.java
  If there s no directory it won t create new directory it will give CE.
  If the specified directory is not avaliable we will will get CE.

  If z: colon not avalible we ll Get CE saying directory not found z:
***************************-----END of--->11<--------***************************
Example=12                         How to run java Programe
=========
NOTE:-
-----
PROGRAME=12
=========
package com.java.Vinay.Tution.Programes;
package pack1.pack2.pack3;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello java good morning");
	}
}
 
 
C:\Users\dell1\Desktop>javac -d . Test.java
Test.java:2: error: class, interface, or enum expected
package pack1.pack2.pack3;
^
1 error

EXPLANATION:-
============
In any java source file there can be at most  1 package statement,i.e more than 1 package statement is not
allowed otherwise we ll get CE.
***************************-----END of--->12<--------***************************
Example=13
=========
NOTE:-
-----
PROGRAME=13
=========
 import java.util.*;
package com.java.Vinay.Tution.Programes;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello java good morning");
	}
}
 

C:\Users\dell1\Desktop>javac Test.java
Test.java:2: error: class, interface, or enum expected
package com.java.Vinay.Tution.Programes;
^
1 error

C:\Users\dell1\Desktop>javac -d . Test.java
Test.java:2: error: class, interface, or enum expected
package com.java.Vinay.Tution.Programes;
^
1 error

EXPLANATION:-
============
 javac Test.java //This command results same
                 // even though we are not compiling in package statement style.

 javac -d . Test.java//This command results same

***************************-----END of--->13<--------***************************
Example=14
=========
NOTE:-
-----
PROGRAME=14
=========
 import java.util.*;
package com.java.Vinay.Tution.Programes;
class Test
{
	public static void main(String[] args)
	{
	System.out.println("hello java good morning");
	}
}
 

C:\Users\dell1\Desktop>javac Test.java
Test.java:2: error: class, interface, or enum expected
package com.java.Vinay.Tution.Programes;
^
1 error

C:\Users\dell1\Desktop>javac -d . Test.java
Test.java:2: error: class, interface, or enum expected
package com.java.Vinay.Tution.Programes;
^
1 error

EXPLANATION:-
============
 In any java programe the frist non comment statement should be 
 package statemetnt(if it s avaliable other wise we ll get CE).
***************************-----END of--->14<--------***************************
Example=15
=========
NOTE:-
-----
PROGRAME=15
=========
EXPLANATION:-
============
In any java programe the order of writing the programe is recomended in this style
package statement
import statement
class/interface/enum/

Note:-
package statement (should be frist if avaliable/and must be only one package statement)

import statement
(it should come after the package statemetn and contain any number of import statement,eiether 0 also ok )


class/interface/enum/
Any number of classes or interfaces even empty source file is valid.

 



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
