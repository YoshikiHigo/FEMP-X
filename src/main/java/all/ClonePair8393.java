package all;

import java.util.*;

public class ClonePair8393 {

    String[] method1(String str,int delim,String trailing){
      Vector items=new Vector(15);
      int last=0;
      int index=0;
      int len=str.length();
      while (index < len) {
        if (str.charAt(index) == delim) {
          items.add(str.substring(last,index));
          last=index + 1;
        }
        index++;
      }
      if (last != len)   items.add(str.substring(last));
      if (trailing != null && trailing.length() != 0)   items.add(trailing);
      String[] result=new String[items.size()];
      items.copyInto(result);
      return result;
    }

    String[] method2(String str,int delim,String trailing){
      Vector<String> items=new Vector<String>(15);
      int last=0;
      int index=0;
      int len=str.length();
      while (index < len) {
        if (str.charAt(index) == delim) {
          items.add(str.substring(last,index));
          last=index + 1;
        }
        index++;
      }
      if (last != len)   items.add(str.substring(last));
      if (trailing != null && trailing.length() != 0)   items.add(trailing);
      String[] result=new String[items.size()];
      items.copyInto(result);
      return result;
    }
}
