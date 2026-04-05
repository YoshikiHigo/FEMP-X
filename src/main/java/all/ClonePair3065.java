package all;

import java.util.ArrayList;
import java.util.Vector;

public class ClonePair3065 {

    String[] method1(String str,String delim){
      if (str.length() < 1)   return new String[0];
      Vector strs=new Vector();
      int dlen=delim.length();
      int previdx=0;
      do {
        int didx=str.indexOf(delim,previdx);
        if (didx >= 0) {
          strs.add(str.substring(previdx,didx));
        }
     else     if (previdx < str.length()) {
          strs.add(str.substring(previdx));
        }
        previdx=didx + dlen;
      }
     while (previdx >= dlen);
      String[] strarr=new String[strs.size()];
      for (int i=0; i < strarr.length; i++) {
        strarr[i]=(String)strs.elementAt(i);
      }
      return strarr;
    }

    String[] method2(String string,String separator){
      int separatorLength=separator.length();
      if (string.indexOf(separator) == -1) {
        if (string.length() == 0) {
          String[] array={};
          return array;
        }
     else {
          String[] array={string};
          return array;
        }
      }
      ArrayList<String> v=new ArrayList<String>();
      int index1=0;
      int index2=0;
      while (true) {
        index2=string.indexOf(separator,index1 + separatorLength);
        if (index2 == -1)     break;
        v.add(string.substring(index1,index2));
        index1=index2 + separatorLength;
      }
      v.add(string.substring(index1));
      String[] array=new String[v.size()];
      for (int i=0; i < v.size(); i++) {
        array[i]=(String)v.get(i);
      }
      return array;
    }
}
