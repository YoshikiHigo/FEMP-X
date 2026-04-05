package all;

import java.util.ArrayList;
import java.util.List;

public class ClonePair13293 {

    String[] method1(String string,int splitSize){
      ArrayList<String> stringArray=new ArrayList<String>();
      while (string.length() > 0) {
        if (string.length() > splitSize) {
          stringArray.add(string.substring(0,splitSize));
          string=string.substring(splitSize,string.length());
        }
     else {
          stringArray.add(string);
          string="";
        }
      }
      return stringArray.toArray(new String[]{});
    }

    String[] method2(String data,int interval){
      List<String> dataPiece=new ArrayList<String>();
      int addedOffset;
      for (int offset=0; offset < data.length(); offset+=addedOffset) {
        String subData=data.substring(offset,Math.min(data.length(),(offset + interval)));
        addedOffset=subData.lastIndexOf('\n');
        if (addedOffset >= 0) {
          subData=subData.substring(0,addedOffset);
          ++addedOffset;
        }
     else {
          addedOffset=interval;
        }
        dataPiece.add(subData);
      }
      String[] result=new String[dataPiece.size()];
      dataPiece.toArray(result);
      return result;
    }
}
