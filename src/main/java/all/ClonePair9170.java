package all;

public class ClonePair9170 {

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
