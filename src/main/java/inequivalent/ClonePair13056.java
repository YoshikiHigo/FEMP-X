package inequivalent;

public class ClonePair13056 {

    boolean method1(String address) {
        if (address == null) {
            return false;
        }
        boolean hasCharacters = address.trim().length() > 0;
        boolean hasAt = address.contains("@");
        if (!hasCharacters || !hasAt) return false;
        String[] parts = address.trim().split("@", 2);
        boolean mainPartNotEmpty = parts[0].trim().length() > 0;
        boolean hostPartNotEmpty = parts[1].trim().length() > 0;
        return mainPartNotEmpty && hostPartNotEmpty;
    }

    boolean method2(String aEmailAddress) {
        if (aEmailAddress == null) return false;
        String[] tokens = aEmailAddress.split("@");
        return tokens.length == 2 && !tokens[0].equals("") && !tokens[1].equals("");
    }
}
