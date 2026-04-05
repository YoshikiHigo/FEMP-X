package unverified;

public class ClonePair9806 {

    boolean method1(char[] a,char[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }

    boolean method2(char[] first,char[] second){
      if (first == second)   return true;
      if (first == null || second == null)   return false;
      if (first.length != second.length)   return false;
      for (int i=first.length; --i >= 0; )   if (first[i] != second[i])   return false;
      return true;
    }
}
