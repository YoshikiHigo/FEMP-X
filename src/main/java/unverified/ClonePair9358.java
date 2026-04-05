package unverified;

public class ClonePair9358 {

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
