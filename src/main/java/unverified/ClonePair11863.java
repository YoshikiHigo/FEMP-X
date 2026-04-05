package unverified;

public class ClonePair11863 {

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

    String method2(String str,String strToReplace,String replaceStr){
      if (str == null || strToReplace == null || replaceStr == null)   return null;
      StringBuffer sb=new StringBuffer();
      for (int replaceIndex=-1; (replaceIndex=str.indexOf(strToReplace)) > -1; ) {
        sb.append(String.valueOf(str.substring(0,replaceIndex)) + String.valueOf(replaceStr));
        str=str.substring(replaceIndex + strToReplace.length());
      }
      sb.append(str);
      return sb.toString();
    }
}
