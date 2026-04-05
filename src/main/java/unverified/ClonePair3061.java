package unverified;

import java.util.StringTokenizer;
import java.util.Vector;

public class ClonePair3061 {

    String[] method1(String s,String seperator){
      if (s == null || s.equals(""))   return null;
      StringTokenizer st=new StringTokenizer(s,seperator);
      Vector vec=new Vector();
      while (st.hasMoreTokens()) {
        vec.addElement(st.nextToken());
      }
      String[] array=new String[vec.size()];
      vec.copyInto(array);
      return array;
    }

    String[] method2(String strSrc,String seperator){
      String[] arr=null;
      if (strSrc == null || strSrc.equals(""))   return arr;
      StringTokenizer tokenizer=new StringTokenizer(strSrc,seperator);
      arr=new String[tokenizer.countTokens()];
      int i=0;
      while (tokenizer.hasMoreTokens()) {
        arr[i]=tokenizer.nextToken();
        i++;
      }
      return arr;
    }
}
