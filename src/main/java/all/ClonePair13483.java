package all;

public class ClonePair13483 {

    String method1(String s,String what,String onWhat){
      if (s == null) {
        return null;
      }
      String res;
      int i;
      i=s.lastIndexOf(what);
      if (i < 0) {
        return s;
      }
      res=s.substring(0,i) + onWhat + s.substring(i + what.length());
      return res;
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
