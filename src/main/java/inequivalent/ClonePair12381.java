package inequivalent;

public class ClonePair12381 {

    String method1(String name) {
        String lowerName = name.toLowerCase();
        String[] pieces = lowerName.split("_");
        if (pieces.length == 1) {
            return lowerName;
        }
        StringBuffer result = new StringBuffer(pieces[0]);
        for (int i = 1; i < pieces.length; i++) {
            result.append(Character.toUpperCase(pieces[i].charAt(0)));
            result.append(pieces[i].substring(1));
        }
        return result.toString();
    }

    String method2(String str) {
        String returnStr = "";
        str = str.toLowerCase();
        String[] arr = str.split("_");
        returnStr += arr[0];
        for (int i = 1; i < arr.length; i++) {
            StringBuilder strbu = new StringBuilder(arr[i]);
            strbu.setCharAt(0, Character.toTitleCase(arr[i].charAt(0)));
            returnStr += strbu.toString();
        }
        return returnStr;
    }
}
