module tech.harmless.fileindexer {
    // Annotations
    requires static lombok;
    requires static org.jetbrains.annotations;
    requires static com.github.spotbugs.annotations;

    // Java
    requires java.base;

    // Logging
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
}
