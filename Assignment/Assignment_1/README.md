Reflection in Java
Reflection is the ability of a program to analyze itself. The java.lang.reflect package provides the ability to obtain the information about the fields,constructors,methods, and modifiers of a class.Normally such information is needed to build software tools that enable us to do work with Java Beans components. The tools use reflection to determine dynamically the characteristics of a component.
Java reflection is useful because it supports dynamic retrieval of information about classes and data structures by name, and allows for their manipulation wityhin an executing Java program.This feature is extremely powerful and has no equivalent in other convectional languages such as C,C++,Fortan,or pascal.
Advantages of Reflection

Extensibility features
Debugging & Testing tools
Drawbacks of Reflection

Reflection is a powerful tool to inspect the code.It helps in debugging .Its can be used to modify the runtime behavior of the application running in JVM. But it should not be used often, because it is comes with some disadvantages.
Performance Overhead
Security Restrictions
Exposure of Internals
// A simple Java program to demonstrate the use of reflection
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
 
// class whose object is to be created
class Test
{
   // creating a private field
   private String s;
 
   // creating a public constructor
   public Test()  {  s = "GeeksforGeeks"; }
 
   // Creating a public method with no arguments
   public void method1()  {
       System.out.println("The string is " + s);
   }
 
   // Creating a public method with int as argument
   public void method2(int n)  {
       System.out.println("The number is " + n);
   }
 
   // creating a private method
   private void method3() {
       System.out.println("Private method invoked");
   }
}
 
class Demo
{
   public static void main(String args[]) throws Exception
   {
       // Creating object whose property is to be checked
       Test obj = new Test();
 
       // Creating class object from the object using
       // getclass method
       Class cls = obj.getClass();
       System.out.println("The name of class is " +
                           cls.getName());
 
       // Getting the constructor of the class through the
       // object of the class
       Constructor constructor = cls.getConstructor();
       System.out.println("The name of constructor is " +
                           constructor.getName());
 
       System.out.println("The public methods of class are : ");
 
       // Getting methods of the class through the object
       // of the class by using getMethods
       Method[] methods = cls.getMethods();
 
       // Printing method names
       for (Method method:methods)
           System.out.println(method.getName());
 
       // creates object of desired method by providing the
       // method name and parameter class as arguments to
       // the getDeclaredMethod
       Method methodcall1 = cls.getDeclaredMethod("method2",
                                                int.class);
 
       // invokes the method at runtime
       methodcall1.invoke(obj, 19);
 
       // creates object of the desired field by providing
       // the name of field as argument to the 
       // getDeclaredField method
       Field field = cls.getDeclaredField("s");
 
       // allows the object to access the field irrespective
       // of the access specifier used with the field
       field.setAccessible(true);
 
       // takes object and the new value to be assigned
       // to the field as arguments
       field.set(obj, "JAVA");
 
       // Creates object of desired method by providing the
       // method name as argument to the getDeclaredMethod
       Method methodcall2 = cls.getDeclaredMethod("method1");
 
       // invokes the method at runtime
       methodcall2.invoke(obj);
 
       // Creates object of the desired method by providing
       // the name of method as argument to the 
       // getDeclaredMethod method
       Method methodcall3 = cls.getDeclaredMethod("method3");
 
       // allows the object to access the method irrespective 
       // of the access specifier used with the method
       methodcall3.setAccessible(true);
 
       // invokes the method at runtime
       methodcall3.invoke(obj);
   }
}
image
