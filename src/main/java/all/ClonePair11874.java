package all;

public class ClonePair11874 {

    String method1(String string,int i){
      int cutpos=string.length() - i;
      if (cutpos < 0)   return string;
      return string.substring(cutpos);
    }

    String method2(String longName,int maxLength){
      char[] vowels=new char[]{'a','e','i','o','u'};
      String shortName=longName;
      while (shortName.length() > maxLength) {
        int index=-1;
        for (int i=0; i < vowels.length; i++) {
          int lastIndex=shortName.lastIndexOf(vowels[i]);
          if (lastIndex > index) {
            index=lastIndex;
          }
        }
        if (index == -1) {
          break;
        }
        String firstPart=shortName.substring(0,index);
        String lastPart=shortName.substring(index + 1,shortName.length());
        shortName=firstPart + lastPart;
      }
      if (shortName.length() > maxLength) {
        shortName=shortName.substring(0,maxLength);
      }
      return shortName;
    }
}
