package all;

import java.util.*;

public class ClonePair7159 {

    String method1(Collection<String> strings,String joinString){
      StringBuilder str=new StringBuilder();
      if (joinString == null) {
        joinString="";
      }
      if (strings != null) {
        Iterator<String> iterator=strings.iterator();
        while (iterator.hasNext()) {
          str.append(iterator.next());
          if (iterator.hasNext()) {
            str.append(joinString);
          }
        }
      }
      return str.toString();
    }

    String method2(Collection<String> array,String join){
      if (array == null || array.size() == 0) {
        return "";
      }
      if (join == null) {
        join="";
      }
      StringBuilder ret=new StringBuilder();
      int count=0;
      Iterator<String> iterator=array.iterator();
      while (iterator.hasNext()) {
        if (count != 0) {
          ret.append(join);
        }
        String next=iterator.next();
        ret.append(next);
        count++;
      }
      return ret.toString();
    }
}
