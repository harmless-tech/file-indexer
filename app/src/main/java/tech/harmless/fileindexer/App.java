package tech.harmless.fileindexer;

import java.io.IOException;
import tech.harmless.fileindexer.resources.ResourceLoader;

public class App {

    public static void main(String[] args) {
        System.out.println("NAME: " + BuildConfig.NAME);
        System.out.println("VERSION: " + BuildConfig.VERSION);
        System.out.println("DESCRIPTION: " + BuildConfig.DESCRIPTION);
        System.out.println("COMMIT_HASH: " + BuildConfig.COMMIT_HASH);
        System.out.println("DEBUG: " + BuildConfig.DEBUG);
        System.out.println("LICENSE: ");
        try {
            System.out.println(ResourceLoader.getString("LICENSE"));
        } catch (IOException ignored) {
            System.err.println("Could not find license!");
        }
        System.out.println();
    }
}
