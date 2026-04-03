package inequivalent;

public class ClonePair3646 {

    String method1(String permalink, String[] blogEntryExtensions) {
        if (permalink == null) {
            return null;
        }
        boolean matchesExtension = false;
        for (int i = 0; i < blogEntryExtensions.length; i++) {
            String blogEntryExtension = blogEntryExtensions[i];
            if (permalink.matches(blogEntryExtension)) {
                matchesExtension = true;
                break;
            }
        }
        if (!matchesExtension) {
            return null;
        }
        int indexOfSlash = permalink.lastIndexOf("/");
        if (indexOfSlash == -1) {
            return permalink;
        } else {
            String sanitizedPermalink = permalink.substring(indexOfSlash + 1);
            if (sanitizedPermalink.startsWith("..")) {
                sanitizedPermalink = sanitizedPermalink.substring(2);
            } else if (sanitizedPermalink.startsWith(".")) {
                sanitizedPermalink = sanitizedPermalink.substring(1);
            }
            return sanitizedPermalink;
        }
    }

    String method2(String permalink, String[] blogEntryExtensions) {
        if (permalink == null) {
            return null;
        }
        boolean matchesExtension = false;
        for (int i = 0; i < blogEntryExtensions.length; i++) {
            String blogEntryExtension = blogEntryExtensions[i];
            if (permalink.matches(blogEntryExtension)) {
                matchesExtension = true;
                break;
            }
        }
        if (!matchesExtension) {
            return null;
        }
        int indexOfSlash = permalink.lastIndexOf("/");
        if (indexOfSlash == -1) {
            indexOfSlash = permalink.lastIndexOf("\\");
        }
        if (indexOfSlash == -1) {
            return permalink;
        } else {
            String sanitizedPermalink = permalink.substring(indexOfSlash + 1);
            if (sanitizedPermalink.startsWith("..")) {
                sanitizedPermalink = sanitizedPermalink.substring(2);
            } else if (sanitizedPermalink.startsWith(".")) {
                sanitizedPermalink = sanitizedPermalink.substring(1);
            }
            return sanitizedPermalink;
        }
    }
}
