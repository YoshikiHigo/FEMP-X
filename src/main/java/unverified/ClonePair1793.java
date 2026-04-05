package unverified;

import java.util.List;

public class ClonePair1793 {

    String method1(List elements){
      if (elements == null || elements.isEmpty())   return "";
      String str="[";
      int size=elements.size();
      for (int i=0; i < size; i++)   str+="'" + elements.get(i).toString() + "',";
      return str.substring(0,str.length() - 1) + "]";
    }

    String method2(List list){
      if ((list == null) || (list.size() == 0)) {
        return "";
      }
      StringBuffer buffer=new StringBuffer();
      buffer.append("(");
      buffer.append(list.get(0).toString());
      for (int i=1; i < list.size(); i++) {
        buffer.append(", ");
        buffer.append(list.get(i).toString());
      }
      buffer.append(")");
      return buffer.toString();
    }
}
