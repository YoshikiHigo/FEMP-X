package unverified;

public class ClonePair12946 {

    String method1(String text,String toFind,String replaceBy){
      int pos=text.indexOf(toFind);
      if (pos == -1)   return text;
      StringBuffer result=new StringBuffer(text.length());
      while (pos >= 0) {
        result.append(text.substring(0,pos));
        result.append(replaceBy);
        text=text.substring(pos + toFind.length());
        pos=text.indexOf(toFind);
      }
      result.append(text);
      return (result.toString());
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
