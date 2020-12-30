module main {
  requires mylibrary;
  requires java.logging;
  provides java.lang.System.LoggerFinder
      with logger.SystemOutLoggerFinder;
  opens packt.java9.deep.moduledemo.main;
}