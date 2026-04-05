package all;

public class ClonePair9954 {

    Object method1(Object[] objects){
      if (objects.length == 0)   return null;
      Class currClass;
      Object currObject;
      int i=0;
      Object mostSuperObject=objects[i];
      while (mostSuperObject == null || mostSuperObject.equals(""))   if (i >= objects.length - 1)   return null;
     else   mostSuperObject=objects[++i];
      Class mostSuperClass=mostSuperObject.getClass();
      for (int n=i + 1; n < objects.length; n++) {
        currObject=objects[n];
        if (currObject == null || currObject.equals(""))     continue;
        currClass=currObject.getClass();
        if (currClass.isAssignableFrom(mostSuperClass)) {
          mostSuperClass=currClass;
          mostSuperObject=currObject;
        }
     else     if (mostSuperClass.isAssignableFrom(currClass))     ;
     else     return null;
      }
      return mostSuperObject;
    }

    Object method2(Object[] objects){
      if (objects.length == 0)   return null;
      Class currClass;
      Object currObject;
      int i=0;
      Object mostSuperObject=objects[i];
      while (mostSuperObject == null || mostSuperObject instanceof String)   if (i >= objects.length - 1)   return null;
     else   mostSuperObject=objects[++i];
      Class mostSuperClass=mostSuperObject.getClass();
      for (int n=i + 1; n < objects.length; n++) {
        currObject=objects[n];
        if (currObject == null || currObject.equals(""))     continue;
        currClass=currObject.getClass();
        if (currClass.isAssignableFrom(mostSuperClass)) {
          mostSuperClass=currClass;
          mostSuperObject=currObject;
        }
     else     if (mostSuperClass.isAssignableFrom(currClass))     ;
     else     return null;
      }
      return mostSuperObject;
    }
}
