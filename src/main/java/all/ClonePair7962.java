package all;

import java.util.*;

public class ClonePair7962 {

    Vector method1(String s,String token){
      Vector result=new Vector();
      int index;
      while ((s.length() > 0) && ((index=s.indexOf(token)) >= 0)) {
        String left=s.substring(0,index);
        result.add(left);
        s=s.substring(index + token.length());
      }
      if (s.length() > 0)   result.add(s);
      return result;
    }

    Vector method2(String sData,String sSplitter){
      Vector vtData=new Vector(10);
      if (sData.length() == 0)   return vtData;
      String data=sData;
      String item="";
      int len=sSplitter.length();
      while (data.length() > 0) {
        int next=data.indexOf(sSplitter);
        if (next != -1) {
          item=data.substring(0,next);
          if (next < data.length())       ;
          data=data.substring(next + len);
          vtData.addElement(item);
        }
     else {
          if (data.length() > 0)       vtData.addElement(data);
          break;
        }
      }
      return vtData;
    }
}
