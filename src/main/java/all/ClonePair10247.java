package all;

public class ClonePair10247 {

    int method1(String str,String s){
      if (str == null || s == null)   return -1;
      if (str.length() < s.length())   return -1;
      int pos=str.indexOf(s);
      if (pos > -1)   return pos;
      return str.toLowerCase().lastIndexOf(s.toLowerCase());
    }

    int method2(String str,String s){
      if (str == null || s == null)   return -1;
      if (str.length() < s.length())   return -1;
      int pos=str.indexOf(s);
      if (pos > -1)   return pos;
      return str.toLowerCase().indexOf(s.toLowerCase());
    }
}
