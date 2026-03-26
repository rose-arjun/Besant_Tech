3-3-26:
-------

Introduction to Java
--------------------

Java is a high-level, object-oriented programming language. It is easy to learn and widely used for developing applications like web, mobile, and desktop.

Java was developed by James Gosling at Sun Microsystems in 1995. Later, Sun Microsystems was acquired by Oracle Corporation.

Java follows the principle:
“Write Once, Run Anywhere” (WORA)

Features of Java
----------------
Simple and easy to learn
Platform independent
Object-oriented
Secure
Robust (strong memory management)
Multithreaded
Portable
dynamic
distributed

4-3-26:
-------

Java code Execution:
             javac compiler                   JVM(interpred,JIT)
Source code ------------------> Byte code -------------------> Machine code
 .java                  .class
 
 Java( Platform Independent ) lang
 JVM( Platform dependent) machine
 
 
Java Program Structure
----------------------

A basic Java program contains:

Example:

class Demo {
    public static void main(String[] args) {
        System.out.println("Hello Rose");
    }
}

5-3-26:
-------

Data Types in Java
--------------------

Two types of data types in java:

Primitive Data Types
-
byte (1 byte)
short (2 bytes)
int (4 bytes)
float (4 bytes)
double (8 bytes)
char (2 bytes)
boolean (1 bytes)

Non-Primitive Data Types
-
String
Array
Class
interface

ASCII (American Standard Code for Information Interface)
-----

Keyword in java:
--------
Java keyword are reserved type

keyword:
--------
int – integer value store panna
float – decimal value
double – large decimal value
char – single character
boolean – true / false

Control Keywords
-
if – condition check
else – alternative condition
switch – multiple conditions
case – switch la use
break – loop/switch stop panna
continue – next iteration pogum

Loop Keywords
-
for – loop
while – condition loop
do – at least once execute

OOP Keywords
-
class – class create panna
object ❌ (keyword illa, concept da)
new – object create panna
this – current object refer panna
super – parent class refer panna
extends – inheritance
implements – interface use panna

Access Keywords
-
public – anywhere access
private – same class only
protected – same package + subclass

Other Important Keywords
-
static – class level variable/method
final – change panna mudiyathu
void – return value illa
return – value return panna
try, catch, finally – exception handling

Runtime Error and Compile Error:
-
Compile time - Error occures during compilation , like syntax error
Runtime - Error occurs during program execution, like logical or unexpected prob

Casting:
--
Casting means converting one data type into another data type
two type:
1. Widening casting(implicit casting)
 ex: byte->short-> int
2. Norrowing casting (Explicit casting)
 ex: doubele-> float

Variables in Java
-----------------
Variables are used to store data. like container

Example:

int a = 10;
String name = "Arjun";

Types of variables:

Local variable
Instance variable
Static variable

Operators in Java
------------------
Operators are used to perform operations.

Types:

1.Arithmetic (+, -, *, /,%)
2.Relational (==, !=, >, <)
3.Logical (&&, ||,!=)
4.Assignment (=,+=,-=,*=,/=)
5.bitwise (&,^,|)
6.shift (<<,>>)

9-3-26
-

Control Statements
-
Used to control program flow.

Conditional Statements
-
if
if-else
switch

Looping Statements
-
for
while
do-while
Array in Java

10-3-26
-
String:
------
String is a non-primitive data type.
It is used to store text (collection of characters).

String Function:
-
1. length()
2. toUpperCase()
3. toLowerCase()
4. chatAt()
5. equals()
6. concat()
7. subString()
8. contains()

Two type in String:
--
1. Mutable(Can Change)

2. Immutable( Cant change)
     we can define immutable str two way
        1. String literal
        2. using new keyword
         
18-3-26:
-
Mutable Sting(Can change the value)
  1. String Buffer (Slow thread safe)
  2. String Builder( fast - no thread safe

19-3-26:
--
Array is a collection of elements of same type.
Array start with zero index

1D array:
-
Example:

int[] arr = {1, 2, 3, 4};

2D array:
-
int [][] arr={1,2,3},{1,3,4};

Function:
-
20-3-26;
-
OOPs (Object-Oriented Programming System)

OOPs is a programming concept based on objects and classes.

Class and Object
Class → blueprint
Object → instance of class

Example:

class Student {
    int id;
    String name;
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Arjun";
    }
}

24-3-26:
-
Four Pillars of OOPs
1. Encapsulation

Binding data and methods into a single unit.


2. Inheritance

One class inherits properties of another class.

Example:

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

25-3-26
-
3. Polymorphism

One method behaves differently.

Types:

Method Overloading
Method Overriding

26-3-26
-
4. Abstraction

Hiding implementation details and showing only essential features.

Example:

abstract class Animal {
    abstract void sound();
}
