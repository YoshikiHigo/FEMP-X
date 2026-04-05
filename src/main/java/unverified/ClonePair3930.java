package unverified;

public class ClonePair3930 {

    String method1(String p_original,String[] p_old,String[] p_new){
      String x_latest=p_original;
      int x_start=0;
      StringBuffer x_buf=null;
      for (int i=0; i < p_old.length; i++) {
        while (x_start != -1) {
          x_start=x_latest.indexOf(p_old[i],x_start);
          if (x_start != -1) {
            x_buf=new StringBuffer(x_latest.length() + p_new[i].length());
            x_buf.append(x_latest);
            x_buf.replace(x_start,x_start + p_old[i].length(),p_new[i]);
            x_latest=x_buf.toString();
          }
        }
        x_start=0;
      }
      return x_latest;
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
