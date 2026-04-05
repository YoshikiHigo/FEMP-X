package unverified;

public class ClonePair9858 {

    boolean method1(char[] ch1,char[] ch2){
      if (ch1.length != ch2.length)   return false;
      for (int i=0; i < ch2.length; i++) {
        if (ch1[i] != ch2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(char[] a1,char[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (a1[i] != a2[i])   return false;
      return true;
    }
}
