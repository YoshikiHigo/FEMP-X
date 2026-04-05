package all;

public class ClonePair877 {

    boolean method1(byte[] one,byte[] two){
      if (one.length != two.length)   return false;
     else {
        for (int x=0; x < one.length; x++) {
          if (one[x] != two[x])       return false;
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
