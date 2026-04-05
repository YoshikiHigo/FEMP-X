package all;

import java.util.*;

public class ClonePair7844 {

    List<String> method1(String source,String delimiter){
      if (source == null || source.trim().length() == 0)   return null;
      String[] tkns=source.split(delimiter);
      return Arrays.asList(tkns);
    }

    List<String> method2(String s,String denotation){
      if (s != null && s.length() > 0) {
        List<String> list=new ArrayList<String>();
        String ss[]=s.split(denotation);
        for (int i=0; i < ss.length; i++) {
          String str=ss[i].trim();
          list.add(str);
        }
        return list;
      }
      return null;
    }
}
