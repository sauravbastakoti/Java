What is garbage Collection?

The technique that handles deallocation of memory in java is known as Garbage collection in java. It works like this: when no references to an object exist, that object is assumed to be no longer needed, and the memory occupied by the object can be reclaimed. There is no explicit need to destroy objects as in C++. Garbage collection only occurs sporadically (if at all) during the execution of your program. It will not occur simply because one or more objects exist that are no longer used. Furthermore, different Java run-time implementations will take varying approaches to garbage collection, but for the most part, you should not have to think about it while writing your programs. Sometimes an object will need some function to perform some action after it is destroyed. For example, if an object is holding some non-Java resource such as a file handle or character font, then you might want to make sure these resources are freed before an object is destroyed. This type of operation is done using finalize() method.

Syntax:

protected void finalize( )

{

// finalization code here

}

The Java run time calls that method whenever it is about to recycle an object of that class. Inside the finalize( ) method, you will specify those actions that must be performed before an object is destroyed. The garbage collector runs periodically, checking for objects that are no longer referenced by any running state or indirectly through other referenced objects. Right before an asset is freed, the Java run time calls the finalize( ) method on the object.

Program::

public class GarbageCollection{

public static void main(String[] args){

    GarbageCollection g1 = new GarbageCollection();
    
    GarbageCollection g2 = new GarbageCollection();

    g1 = null;
    
    System.gc();

    g2 = null;
    
    Runtime.getRuntime().gc();
}
}