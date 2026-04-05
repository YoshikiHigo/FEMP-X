package unverified;

public class ClonePair11870 {

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

    String method2(String s,String oldSub,String newSub){
      if ((s == null) || (oldSub == null) || (newSub == null)) {
        return null;
      }
      int y=s.indexOf(oldSub);
      if (y >= 0) {
        StringBuilder sb=new StringBuilder();
        int length=oldSub.length();
        int x=0;
        while (x <= y) {
          sb.append(s.substring(x,y));
          sb.append(newSub);
          x=y + length;
          y=s.indexOf(oldSub,x);
        }
        sb.append(s.substring(x));
        return sb.toString();
      }
     else {
        return s;
      }
    }
}
