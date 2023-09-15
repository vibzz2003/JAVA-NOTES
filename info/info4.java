//access modifiers are of 4 types;
//private,default,protected and public 
//private: within the class and not outside it 
//default: within the package and not out of it and within the class also
//protected: within the package and outside the package using child class and witihin the class also
//public: everywhere

//private :
// a private class has a private data member and a private method and if we try to access it from outside the class
// it will show a compile time error
// and if u construct the class constructor private then u cant create an instance outside the class
// **IMP : A class cannot be private or protected except nested class**//


//default:
//if u dont use any modifier then it is treated as default. it is accessible within the package only
//gives moree accessibilty than private but is more restricted than public or protected
// if u create a package with its scope being default then u cannot use its method outside the package during import of package


//protected:
//protected access modiier is accessed within the package and outside also but thru INHERITANCE only
//it can be applied on data member. method or constructor but not on class
//more accessbility than default

// if we have created a class A with package pack1 and have created a protected method in that public class 
//then we will have to inherit the class to other clas if we wnat to access the method outside the class


//public:
//can be accessed everywhere


