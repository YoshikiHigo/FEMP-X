package unverified;

public class ClonePair11864 {

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

    String method2(String text,String fromText,String toText){
      if (text == null || fromText == null || toText == null) {
        return null;
      }
      final StringBuffer buf=new StringBuffer(128);
      int pos=0;
      int pos2=0;
      while (true) {
        pos=text.indexOf(fromText,pos2);
        if (pos == 0) {
          buf.append(toText);
          pos2=fromText.length();
        }
     else     if (pos > 0) {
          buf.append(text.substring(pos2,pos));
          buf.append(toText);
          pos2=pos + fromText.length();
        }
     else {
          buf.append(text.substring(pos2));
          break;
        }
      }
      return buf.toString();
    }
}
