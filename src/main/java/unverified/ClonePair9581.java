package unverified;

public class ClonePair9581 {

    boolean method1(char[] str1,char[] str2){
      if (str1 == str2)   return true;
      if (str1.length != str2.length)   return false;
      for (int i=0; i < str1.length; ++i)   if (str1[i] != str2[i])   return false;
      return true;
    }

    boolean method2(char[] a1,char[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (a1[i] != a2[i])   return false;
      return true;
    }
}
