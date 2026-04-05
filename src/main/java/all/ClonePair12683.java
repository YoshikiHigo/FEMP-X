package all;

public class ClonePair12683 {

    Class method1(String className){
      if (className.equals("void"))   return void.class;
     else   if (className.equals("boolean"))   return boolean.class;
     else   if (className.equals("char"))   return char.class;
     else   if (className.equals("byte"))   return byte.class;
     else   if (className.equals("short"))   return short.class;
     else   if (className.equals("int"))   return int.class;
     else   if (className.equals("long"))   return long.class;
     else   if (className.equals("float"))   return float.class;
     else   if (className.equals("double"))   return double.class;
     else   return null;
    }

    Class method2(String typeName){
      typeName=typeName.intern();
      if (typeName == "boolean")   return boolean.class;
      if (typeName == "byte")   return byte.class;
      if (typeName == "char")   return char.class;
      if (typeName == "short")   return short.class;
      if (typeName == "int")   return int.class;
      if (typeName == "long")   return long.class;
      if (typeName == "float")   return float.class;
      if (typeName == "double")   return double.class;
      if (typeName == "void")   return void.class;
      return null;
    }
}
