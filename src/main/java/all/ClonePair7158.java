package all;

import java.util.*;

public class ClonePair7158 {

    String method1(Collection<String> c,String seperator){
      if (c == null || c.isEmpty()) {
        return "";
      }
      if (seperator == null) {
        seperator=", ";
      }
      final StringBuilder sb=new StringBuilder();
      for (  final String value : c) {
        sb.append(value);
        sb.append(seperator);
      }
      sb.delete(sb.length() - seperator.length(),sb.length());
      return sb.toString();
    }

    String method2(Collection<String> strings,String joinString){
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
}
