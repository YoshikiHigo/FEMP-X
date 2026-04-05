package unverified;

public class ClonePair2643 {

    boolean method1(byte[] a,byte[] b){
      for (int i=0; i < a.length && i < b.length; i++)   if (a[i] != b[i])   return false;
      return a.length == b.length;
    }

    boolean method2(byte[] name1,byte[] name2){
      if (name1.length != name2.length)   return false;
      if (name1 == name2)   return true;
      for (int i=name1.length; --i >= 0; )   if (name1[i] != name2[i])   return false;
      return true;
    }
}
