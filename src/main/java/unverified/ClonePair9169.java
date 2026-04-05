package unverified;

public class ClonePair9169 {

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
      if (str == null || str.length() == 0 || sub == null || sub.length() == 0) {
        return 0;
      }
      int count=0;
      int idx=0;
      while ((idx=str.indexOf(sub,idx)) != -1) {
        count++;
        idx+=sub.length();
      }
      return count;
    }
}
