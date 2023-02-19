package tech.harmless.fileindexer.resources;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;

public class ResourceLoader {
    private static final ResourceLoader instance = new ResourceLoader();

    @NotNull public static String getString(@NotNull String name) throws IOException {
        try (InputStream stream = instance.getClass().getResourceAsStream(name)) {
            assert stream != null;
            byte[] raw = stream.readAllBytes();
            return new String(raw, StandardCharsets.UTF_8);
        }
    }
}
