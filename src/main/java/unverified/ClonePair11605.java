package unverified;

public class ClonePair11605 {

    String method1(String input,String oldString,String newString){
      if (input == null || input.length() == 0 || input.indexOf(oldString,0) < 0) {
        return input;
      }
     else {
        int i=0;
        int j=0;
        int oldLength=oldString.length();
        StringBuffer buffer=new StringBuffer();
        while ((i=input.indexOf(oldString,i)) >= 0) {
          buffer.append(input.substring(j,i)).append(newString);
          j=(i+=oldLength);
        }
        input=buffer.append(input.substring(j)).toString();
        buffer=null;
        return input;
      }
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
