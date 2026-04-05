package unverified;

public class ClonePair9814 {

    boolean method1(char[] o1,char[] o2){
      if (o1 == o2)   return true;
      if (o1 == null || o2 == null)   return false;
      int length=o1.length;
      if (length != o2.length)   return false;
      for (int index=0; index < length; index++) {
        if (!(o1[index] == o2[index]))     return false;
      }
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
