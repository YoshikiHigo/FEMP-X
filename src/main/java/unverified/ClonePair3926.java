package unverified;

public class ClonePair3926 {

    String method1(String text,String[] pattern,String[] replace){
      int startIndex;
      int foundIndex;
      StringBuffer result=new StringBuffer();
      for (int i=0; i < pattern.length; i++) {
        startIndex=0;
        result.setLength(0);
        while ((foundIndex=text.indexOf(pattern[i],startIndex)) >= 0) {
          result.append(text.substring(startIndex,foundIndex));
          result.append(replace[i]);
          startIndex=foundIndex + pattern[i].length();
        }
        result.append(text.substring(startIndex));
        text=result.toString();
      }
      return text;
    }

    String method2(String str,String[] from_strs,String[] to_strs){
      StringBuffer res=null;
      int pos=0;
      while (true) {
        int min_match_pos=Integer.MAX_VALUE;
        int match_index=-1;
        for (int i=0; i < from_strs.length; i++) {
          int pt=str.indexOf(from_strs[i],pos);
          if (pt != -1) {
            if (pt < min_match_pos) {
              min_match_pos=pt;
              match_index=i;
            }
          }
        }
        if (match_index == -1) {
          if (res == null) {
            return (str);
          }
          res.append(str.substring(pos));
          return (res.toString());
        }
     else {
          if (res == null) {
            res=new StringBuffer(str.length() * 2);
          }
          if (min_match_pos > pos) {
            res.append(str.substring(pos,min_match_pos));
          }
          res.append(to_strs[match_index]);
          pos=min_match_pos + from_strs[match_index].length();
        }
      }
    }
}
