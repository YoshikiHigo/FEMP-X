package unverified;

public class ClonePair5380 {

    int method1(String source,String charSet,int startFrom){
      for (int i=startFrom; i < source.length(); i++) {
        if (charSet.indexOf(source.charAt(i)) >= 0)     return i;
      }
      return -1;
    }

    int method2(String subject,String chars,int start){
      for (int i=start; i < subject.length(); ++i)   if (chars.indexOf(subject.charAt(i)) != -1)   return i;
      return -1;
    }
}
