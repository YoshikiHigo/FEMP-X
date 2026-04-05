package all;

public class ClonePair7469 {

    String method1(String s,int width,char c){
      StringBuffer paddedString=new StringBuffer(width);
      int paddingNeeded;
      int len=s.length();
      int frontPadding;
      int tailPadding;
      int i;
      paddingNeeded=(width < len) ? 0 : (width - len);
      i=paddingNeeded / 2;
      frontPadding=i;
      tailPadding=i + (paddingNeeded % 2);
      for (i=0; i < frontPadding; i++)   paddedString.append(c);
      paddedString.append(s);
      for (i=0; i < tailPadding; i++)   paddedString.append(c);
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
