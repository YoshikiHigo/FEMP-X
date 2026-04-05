package unverified;

public class ClonePair9343 {

    String method1(String source1,String source2){
      String retVal="";
      if (source1.startsWith(source2))   retVal=source2;
     else   if (source2.startsWith(source1))   retVal=source1;
     else {
        int i=0;
        int lastSlashIndex=0;
        while (i < source1.length() && i < source2.length() && source1.charAt(i) == source2.charAt(i)) {
          if (source1.charAt(i) == '/')       lastSlashIndex=i;
          i++;
        }
        if (lastSlashIndex == -1)     retVal="";
     else     retVal=source1.substring(0,lastSlashIndex);
      }
      return retVal;
    }

    String method2(String e1,String e2){
      StringBuffer re=new StringBuffer();
      int e1Index=e1.length() - 1;
      int e2Index=e2.length() - 1;
      while (e1Index >= 0 && e2Index >= 0) {
        if (e1.charAt(e1Index) == e2.charAt(e2Index)) {
          re.insert(0,e1.charAt(e1Index));
        }
     else     break;
        e1Index--;
        e2Index--;
      }
      return re.toString();
    }
}
