package all;

import java.util.*;

public class ClonePair6005 {

    String method1(String str,Properties props){
      if (str == null) {
        return null;
      }
      if (props == null) {
        return str;
      }
      StringBuilder retVal=new StringBuilder();
      int pos=0;
      int pos2;
      while ((pos2=str.indexOf("${",pos)) >= 0) {
        retVal.append(str.substring(pos,pos2));
        if ((pos2=str.indexOf("}",pos=pos2)) < 0) {
          return retVal.append(str.substring(pos)).toString();
        }
        String key=str.substring(pos + 2,pos2);
        String val=props.getProperty(key);
        if (val == null) {
          retVal.append("${").append(key).append('}');
        }
     else {
          retVal.append(val);
        }
        pos=pos2 + 1;
      }
      return retVal.append(str.substring(pos)).toString();
    }

    String method2(String orig,Properties props){
      if (orig == null || props == null || props.size() == 0)   return orig;
      int l_pos=orig.indexOf("${",0);
      while (l_pos != -1) {
        int r_pos=orig.indexOf('}',l_pos + 2);
        if (r_pos == -1)     break;
        String name=orig.substring(l_pos + 2,r_pos);
        String value=props.getProperty(name);
        if (value != null) {
          String begin=orig.substring(0,l_pos);
          orig=new StringBuilder().append(begin).append(value).append(orig.substring(r_pos + 1,orig.length())).toString();
          l_pos=orig.indexOf("${",begin.length() + value.length());
        }
     else     l_pos=orig.indexOf("${",l_pos + 2);
      }
      return orig;
    }
}
