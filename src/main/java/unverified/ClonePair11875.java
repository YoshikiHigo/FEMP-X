package unverified;

public class ClonePair11875 {

    String method1(String the_str,String the_old,String the_new){
      if ((the_str == null) || (the_old == null) || (the_new == null)) {
        return null;
      }
      int indx=the_str.lastIndexOf(the_old);
      if (indx >= 0) {
        String firstPart=the_str.substring(0,indx);
        String lastPart=the_str.substring(indx + the_old.length());
        return firstPart + the_new + lastPart;
      }
      return the_str;
    }

    String method2(String haystack,String needle,String replace){
      boolean issub=false;
      if (haystack == null || needle == null || replace == null)   return null;
      if (replace.indexOf(needle) > -1)   issub=true;
      int offset=0;
      while (true) {
        int pos=haystack.indexOf(needle,offset);
        if (pos > -1) {
          if (issub && haystack.indexOf(replace,offset) == pos) {
            offset=pos + 1;
            continue;
          }
          haystack=haystack.substring(0,pos) + replace + haystack.substring(pos + needle.length());
        }
     else     break;
      }
      return haystack;
    }
}
