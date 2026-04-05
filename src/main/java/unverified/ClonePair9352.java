package unverified;

public class ClonePair9352 {

    int method1(String string,String other){
      if (null == string)   return 0;
      if (null == other)   return 0;
      if (0 >= string.length())   return 0;
      if (0 >= other.length())   return 0;
      int count=0;
      int index=0;
      while ((index <= string.length() - other.length()) && (-1 != (index=string.indexOf(other,index)))) {
        count++;
        index+=other.length();
      }
      return count;
    }

    int method2(String str,String sub){
      if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
        return 0;
      }
      int count=0, pos=0, idx=0;
      while ((idx=str.indexOf(sub,pos)) != -1) {
        ++count;
        pos=idx + sub.length();
      }
      return count;
    }
}
