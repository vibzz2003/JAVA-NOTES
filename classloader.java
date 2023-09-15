//Java ClassLoader is an abstract class. It belongs to a java.lang package.
// It loads classes from different resources. Java ClassLoader is used to load the classes at run time
//In other words, JVM performs the linking process at runtime. 
// Classes are loaded into the JVM according to need.
//Types
//    (1) Bootstrap (or) Primordial Class Loader -  Parent of all the others. 
//    (2) Extension (or) Platform Class Loader - load classes that are an extension of the standard core Java classes
//    (3) System (or) Application Class Loader - loads our own files in the classpath//
//
//When JVM request for a class, it invokes a loadClass() method of the java.lang.ClassLoader class by passing the fully classified name of the class.
//The loadClass() method calls for findLoadedClass() method to check that the class has been already loaded or not.
//It is required to avoid loading the class multiple times.
//If the class is already loaded, it delegates the request to parent ClassLoader to load the class.
//
//
public class classloader{
    public static void main(String args[]){
        System.out.println(classloader.class.getClassLoader());
        System.out.println(classloader.class.getClassLoader.getParent());
        System.out.println(String.class.getClassLoader());
    }

}