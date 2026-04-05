package all;

public class ClonePair13141 {

    String method1(String input,String sub,String with){
      int fromIndex=0;
      int index=input.indexOf(sub,fromIndex);
      if (index == -1) {
        return input;
      }
      final StringBuilder buf=new StringBuilder(input.length() + with.length());
      do {
        buf.append(input.substring(fromIndex,index));
        buf.append(with);
        fromIndex=index + sub.length();
      }
     while ((index=input.indexOf(sub,fromIndex)) != -1);
      if (fromIndex < input.length()) {
        buf.append(input.substring(fromIndex,input.length()));
      }
      return buf.toString();
    }

    String method2(String subject,String original,String replacement){
      StringBuffer output=new StringBuffer();
      int p=0;
      int i;
      while ((i=subject.indexOf(original,p)) != -1) {
        output.append(subject.substring(p,i));
        output.append(replacement);
        p=i + original.length();
      }
      if (p < subject.length())   output.append(subject.substring(p));
      return output.toString();
    }
}
