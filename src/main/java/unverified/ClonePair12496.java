package unverified;

public class ClonePair12496 {

    String method1(String string,String oldPattern,String newPattern){
      if (string == null)   return string;
      int oldIndex=string.indexOf(oldPattern);
      if (oldIndex < 0)   return string;
      StringBuffer returnVal=new StringBuffer();
      int start=0;
      do {
        returnVal.append(string.substring(start,oldIndex));
        returnVal.append(newPattern);
        start=oldIndex + oldPattern.length();
        oldIndex=string.indexOf(oldPattern,start);
      }
     while (oldIndex > 0);
      returnVal.append(string.substring(start));
      return returnVal.toString();
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
