//A java package is a group of similar types of classes, interfaces and sub-packages.
//Package in java can be categorized in two form, built-in package and user-defined package.
//There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

//1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.
//2) Java package provides access protection.
//3) Java package removes naming collision.

//example to run and compile package:
//To Compile: javac -d . Simple.java
//To Run: java mypack.Simple  where mypack is the package and simple is the class

//The -d is a switch that tells the compiler where to put the class file i.e. it represents destination. 
//The . represents the current folder.

//There are three ways to access the package from outside the package.
//import package.*;
//import package.classname;
//fully qualified name.



//import package.classname;
//save by B.java  
//package mypack;  
//import pack.A;  
  
//class B{  
//  public static void main(String args[]){  
//   A obj = new A();  
//   obj.msg();  
//  }  
//}  


//fully qualified name.
//save by B.java  
//package mypack;  
//class B{  
//  public static void main(String args[]){  
//   pack.A obj = new pack.A();//using fully qualified name  
//   obj.msg();  
//  }  
//} 

//Note: If you import a package, subpackages will not be imported.
//If you import a package, all the classes and interface of that 
//package will be imported excluding the classes and interfaces of the subpackages. 
//Hence, you need to import the subpackage as well.



//SUBPACKAGE:
//The standard of defining package is domain.company.package 
//e.g. com.javatpoint.bean or org.sssit.dao.







import java.sql.*;
public class Demo{
   public static void main(String ags[])throws SQLException{
        Class.forName("");
        Connection con = getConnection("");
        Statement stmt = createStatement("");
        query q = enquire
   }
}