String s = "java";
String name =  new String("hai");




immutable -> can't change

StringBuffer name =  new StringBuffer("hai");

StringBuffer

StringBuilder name =  new StringBuilder("hai");

StringBuilder

String: IF content is fixed, and won't be changed frequently, we can go for string


StringBuffer: IF content is not fixed, and will be changed frequently,but thread safety required


StringBuilder: IF content is not fixed, and will be changed frequently,but thread safety not  required


------

String name =  new String("java");

name.concat("world");

sysout(name);

-------------------------------EXCEPTION --------------

Throwable class -> root for java exception hierarchy 


exception: in most cases, exception are caused by our program  and these are recoverable 

Eg: read data from a remote file @ london file @runtime ,if file not there, file not found exception 
suppose file not found exception, then we can provide a local file and we can continue the program normally

ERROR:  
  caused due to lack of resources -- Eg: out of memory error 
  mostly not caused by our programs, these are non recoverable 












