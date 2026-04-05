package all;

public class ClonePair11262 {

    int method1(String str,String sub){
      if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
        return 0;
      }
      int count=0;
      int pos=0;
      int idx;
      while ((idx=str.indexOf(sub,pos)) != -1) {
        ++count;
        pos=idx + sub.length();
      }
      return count;
    }

    int method2(String source,String find){
      if (source == null || source.length() == 0 || find == null || find.length() == 0) {
        return 0;
      }
      int count=0;
      int pos=source.indexOf(find,0);
      while (pos != -1) {
        ++count;
        pos=source.indexOf(find,pos + 1);
      }
      return count;
    }
}
