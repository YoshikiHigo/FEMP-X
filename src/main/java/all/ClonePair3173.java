package all;

public class ClonePair3173 {

    String method1(String s,String a_find,boolean a_includeFind){
      if (s == null) {
        return null;
      }
      if (a_find == null) {
        return s;
      }
      int l_index=s.indexOf(a_find);
      if (l_index == -1) {
        return s;
      }
      if (!a_includeFind) {
        l_index+=a_find.length();
      }
      return s.substring(l_index,s.length());
    }

    String method2(String str,String prefix,boolean ignoreCase){
      if (str == null)   return null;
      if (prefix == null)   return str;
      if (ignoreCase) {
        if (str.toLowerCase().startsWith(prefix.toLowerCase())) {
          return str.substring(prefix.length());
        }
      }
     else {
        if (str.startsWith(prefix)) {
          return str.substring(prefix.length());
        }
      }
      return str;
    }
}
