package unverified;

public class ClonePair11190 {

    int method1(String str,String sub){
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
