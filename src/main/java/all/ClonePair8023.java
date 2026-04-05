package all;

import java.util.*;

public class ClonePair8023 {

    String method1(Collection values){
      StringBuffer s=new StringBuffer();
      Iterator i=values.iterator();
      while (i.hasNext()) {
        s.append("'").append(i.next()).append("'");
        if (i.hasNext()) {
          s.append(", ");
        }
      }
      return s.toString();
    }

    String method2(Collection attributes){
      StringBuffer attrs=new StringBuffer();
      Iterator attributeIt=attributes.iterator();
      while (attributeIt.hasNext()) {
        if (attrs.length() != 0) {
          attrs.append(", ");
        }
        attrs.append(attributeIt.next());
      }
      return attrs.toString();
    }
}
