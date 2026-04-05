package unverified;

public class ClonePair12080 {

    String method1(String text,String replace,String with){
      if (text == null)   return null;
      int li=0;
      int l=replace.length();
      int i=text.indexOf(replace,li);
      if (i < 0)   return text;
      StringBuffer aWorkString=new StringBuffer(text.length() + 1);
      while (i >= 0) {
        if (i > li)     aWorkString.append(text.substring(li,i));
        aWorkString.append(with);
        li=i + l;
        i=text.indexOf(replace,li);
      }
      aWorkString.append(text.substring(li));
      return aWorkString.toString();
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
