package unverified;

public class ClonePair9167 {

    int method1(String string,String sub){
      if (string == null || string.length() == 0 || sub == null || sub.length() == 0)   return 0;
      int count=0;
      int index=0;
      while ((index=string.indexOf(sub,index)) != -1) {
        count++;
        index+=sub.length();
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
