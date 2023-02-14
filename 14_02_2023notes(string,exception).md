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













