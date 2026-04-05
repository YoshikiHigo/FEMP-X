package unverified;

public class ClonePair7415 {

    String method1(String s,int width,char c){
      StringBuffer paddedString=new StringBuffer(width);
      int paddingNeeded;
      int len=s.length();
      paddingNeeded=(width < len) ? 0 : (width - len);
      paddedString.append(s);
      for (int i=0; i < paddingNeeded; i++)   paddedString.append(c);
      return paddedString.toString();
    }

    String method2(String s,int width,char c){
      StringBuffer paddedString=new StringBuffer(width);
      int paddingNeeded;
      int len=s.length();
      paddingNeeded=(width < len) ? 0 : (width - len);
      for (int i=0; i < paddingNeeded; i++)   paddedString.append(c);
      paddedString.append(s);
      return paddedString.toString();
    }
}
