package equivalent;

public class ClonePair12509 {
    String method1(String searchIn, String beginString, String endString) {
        int beginpos = searchIn.indexOf(beginString);
        int endpos = -1;
        if (beginpos != -1) {
            endpos = searchIn.substring(beginpos + beginString.length()).indexOf(endString);
            if (endpos != -1) {
                return searchIn.substring(beginpos + beginString.length(), beginpos + beginString.length() + endpos);
            }
        }
        return null;
    }

    String method2(String line, String openChunk, String closeChunk) {
        int index = 0;
        int closeIndex = -1;
        int oc_length = openChunk.length();
        int cc_length = closeChunk.length();
        String temp_attr = null;
        if ((index = line.indexOf(openChunk, index)) != -1) {
            closeIndex = line.indexOf(closeChunk, (index + oc_length));
            if (closeIndex != -1) {
                temp_attr = line.substring(index + oc_length, closeIndex);
                return temp_attr;
            }
        }
        return null;
    }
}
