package tech.harmless.fileindexer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void appHasBuildConfig() {
        assertNotNull(BuildConfig.NAME);
        assertNotNull(BuildConfig.VERSION);
        assertNotNull(BuildConfig.DESCRIPTION);
        assertNotNull(BuildConfig.COMMIT_HASH);
    }
}
