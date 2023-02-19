package tech.harmless.fileindexer;

import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import tech.harmless.fileindexer.resources.ResourceLoader;

public class App {
    protected static final Logger log = LogManager.getLogger();

    private static void setupLogger() {
        if (BuildConfig.DEBUG) {
            LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
            Configuration config = ctx.getConfiguration();
            LoggerConfig loggerConfig = config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
            loggerConfig.setLevel(Level.TRACE);
            ctx.updateLoggers();
        }
    }

    public static void main(String[] args) {
        App.setupLogger();

        log.info("NAME: " + BuildConfig.NAME);
        log.info("VERSION: " + BuildConfig.VERSION);
        log.info("DESCRIPTION: " + BuildConfig.DESCRIPTION);
        log.info("COMMIT_HASH: " + BuildConfig.COMMIT_HASH);
        log.info("DEBUG: " + BuildConfig.DEBUG);
        log.info("LICENSE: ");
        try {
            System.out.println(ResourceLoader.getString("LICENSE"));
        } catch (IOException ignored) {
            log.fatal("Could not find license!");
            System.exit(-1);
        }
    }
}
