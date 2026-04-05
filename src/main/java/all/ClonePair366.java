package all;

public class ClonePair366 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length) {
        System.out.println("Length error: " + b1.length + " != "+ b2.length);
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          System.out.println("Value error at " + i + " : "+ b1[i]+ " != "+ b2[i]);
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] name1,byte[] name2){
      if (name1.length != name2.length)   return false;
      if (name1 == name2)   return true;
      for (int i=name1.length; --i >= 0; )   if (name1[i] != name2[i])   return false;
      return true;
    }
}
