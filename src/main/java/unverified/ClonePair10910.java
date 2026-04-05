package unverified;

public class ClonePair10910 {

    String method1(String someString,int number,String fillString){
      if (someString.length() < number) {
        StringBuffer sb=new StringBuffer();
        sb.append(someString);
        int totalLength=someString.length();
        while (totalLength < number) {
          sb.append(fillString);
          totalLength+=fillString.length();
        }
        return sb.toString();
      }
      return someString;
    }

    String method2(String str,int newLength,String paddingString){
      if ((newLength <= str.length()) || (paddingString.length() == 0)) {
        return str;
      }
      StringBuffer buff=new StringBuffer(newLength);
      buff.append(str);
      int diff=newLength - str.length();
      while (diff > 0) {
        if (diff > paddingString.length()) {
          diff=paddingString.length();
        }
        buff.append(paddingString.substring(0,diff));
        diff=newLength - buff.length();
      }
      return buff.toString();
    }
}
