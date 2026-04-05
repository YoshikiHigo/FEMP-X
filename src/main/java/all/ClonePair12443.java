package all;

public class ClonePair12443 {

    String method1(String name){
      String lowerName=name.toLowerCase();
      String[] pieces=lowerName.split("_");
      if (pieces.length == 1) {
        return lowerName;
      }
      StringBuffer result=new StringBuffer(pieces[0]);
      for (int i=1; i < pieces.length; i++) {
        result.append(Character.toUpperCase(pieces[i].charAt(0)));
        result.append(pieces[i].substring(1));
      }
      return result.toString();
    }

    String method2(String fieldName){
      String strings[]=fieldName.split("_");
      String outString=strings[0].toLowerCase();
      for (int i=1; i < strings.length; i++) {
        outString+=strings[i].substring(0,1).toUpperCase() + strings[i].substring(1,strings[i].length()).toLowerCase();
      }
      return outString;
    }
}
