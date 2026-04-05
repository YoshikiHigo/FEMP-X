package unverified;

import java.util.*;

public class ClonePair8025 {

    String method1(Collection items){
      String string="";
      for (Iterator i=items.iterator(); i.hasNext(); ) {
        string+=i.next();
        if (i.hasNext()) {
          string+=",";
        }
      }
      return string;
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
