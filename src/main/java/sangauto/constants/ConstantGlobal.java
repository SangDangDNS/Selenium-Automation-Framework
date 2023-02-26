package sangauto.constants;

import sangauto.supports.PropertiesSupports;

public class ConstantGlobal {
    static {
        PropertiesSupports.loadAllFiles();
    }

    public final static String BROWSER = PropertiesSupports.getValue("BROWSER");
    public final static boolean HEADLESS = Boolean.parseBoolean(PropertiesSupports.getValue("HEADLESS"));
    public final static String URL = PropertiesSupports.getValue("URL");
    public final static String USERNAME = PropertiesSupports.getValue("USERNAME");
    public final static String PASSWORD = PropertiesSupports.getValue("PASSWORD");
    public final static long STEP_TIME = Long.parseLong(PropertiesSupports.getValue("STEP_TIME"));
    public final static long EXPLICIT_TIMEOUT = Long.parseLong(PropertiesSupports.getValue("EXPLICIT_TIMEOUT"));
    public final static long PAGE_LOAD_TIMEOUT = Long.parseLong(PropertiesSupports.getValue("PAGE_LOAD_TIMEOUT"));
    public final static String ENV = PropertiesSupports.getValue("ENV");
    public final static String SCREENSHOT_FAIL = PropertiesSupports.getValue("SCREENSHOT_FAIL");
    public final static String SCREENSHOT_PASS = PropertiesSupports.getValue("SCREENSHOT_PASS");
    public final static String SCREENSHOT_STEP = PropertiesSupports.getValue("SCREENSHOT_STEP");
    public final static String RECORD_VIDEO = PropertiesSupports.getValue("RECORD_VIDEO");
    public final static String RECORD_VIDEO_PATH = PropertiesSupports.getValue("RECORD_VIDEO_PATH");
}
