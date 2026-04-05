package all;

public class ClonePair12274 {

    String method1(String strOrig,String strFind,String strReplace){
      if (strOrig == null) {
        return null;
      }
      StringBuffer sb=new StringBuffer(strOrig);
      String toReplace="";
      if (strReplace == null)   toReplace="";
     else   toReplace=strReplace;
      int pos=strOrig.length();
      while (pos > -1) {
        pos=strOrig.lastIndexOf(strFind,pos);
        if (pos > -1)     sb.replace(pos,pos + strFind.length(),toReplace);
        pos=pos - strFind.length();
      }
      return sb.toString();
    }

    String method2(String master_string,String search_data,String replace_data){
      if (search_data.equals(replace_data))   return master_string;
      int start_loc=0;
      int end_loc=0;
      try {
        start_loc=master_string.indexOf(search_data);
        while (start_loc >= 0) {
          end_loc=start_loc + search_data.length();
          master_string=master_string.substring(0,start_loc) + replace_data + master_string.substring(end_loc);
          start_loc=master_string.indexOf(search_data,start_loc + replace_data.length());
        }
      }
     catch (  Exception e) {
      }
      return master_string;
    }
}
