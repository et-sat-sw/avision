/*      */ package global.scancenter.commons;
/*      */ 
/*      */ import android.annotation.SuppressLint;
/*      */ import android.content.Context;
/*      */ import android.content.Intent;
/*      */ import android.hardware.usb.UsbDevice;
/*      */ import android.hardware.usb.UsbDeviceConnection;
/*      */ import android.hardware.usb.UsbEndpoint;
/*      */ import android.hardware.usb.UsbInterface;
/*      */ import android.net.DhcpInfo;
/*      */ import android.net.wifi.WifiInfo;
/*      */ import android.net.wifi.WifiManager;
/*      */ import android.os.Environment;
/*      */ import android.os.StatFs;
/*      */ import android.text.format.Formatter;
/*      */ import android.util.Base64;
/*      */ import android.util.Log;
/*      */ import java.io.BufferedInputStream;
/*      */ import java.io.BufferedOutputStream;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.BufferedWriter;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.FileReader;
/*      */ import java.io.FileWriter;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.InputStreamReader;
/*      */ import java.io.OutputStream;
/*      */ import java.lang.reflect.InvocationTargetException;
/*      */ import java.lang.reflect.Method;
/*      */ import java.net.InetAddress;
/*      */ import java.net.NetworkInterface;
/*      */ import java.net.SocketException;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.nio.ByteOrder;
/*      */ import java.nio.channels.FileChannel;
/*      */ import java.security.MessageDigest;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Date;
/*      */ import java.util.Enumeration;
/*      */ import java.util.zip.ZipEntry;
/*      */ import java.util.zip.ZipInputStream;
/*      */ import java.util.zip.ZipOutputStream;
/*      */ 
/*      */ 
/*      */ public class SCGlobal
/*      */ {
/*   53 */   private static String TAG = "SCGlobal";
/*      */   
/*      */   private static final String sCommonsVersion = "1.2.0";
/*   56 */   public static int adminID = 1;
/*      */   
/*      */   public static final boolean gNewFlow = false;
/*      */   
/*      */   public static final boolean gSimScan = false;
/*      */   
/*      */   public static final boolean useJNI = false;
/*      */   public static final int dataBufSize = 2097152;
/*      */   public static boolean gVM2Scan = false;
/*      */   public static boolean gStop = false;
/*      */   public static boolean gPackAndSend = false;
/*   67 */   public static Context gContext = null;
/*   68 */   public static int gJobCounter = 0;
/*      */   
/*      */   public static final String gDateTimeFormat = "yyyy-MM-dd hh:mm:ss";
/*      */   
/*   72 */   public static final String PATH_ROOT = Environment.getExternalStorageDirectory()
/*   73 */     .getAbsolutePath();
/*   74 */   public static final String PATH_SCAN_DATA = PATH_ROOT + "/DCIM/Local/TmpImg/";
/*   75 */   public static final String PATH_SMART_IMAGE_DATA = PATH_ROOT + "/DCIM/Local/SmartImage/";
/*   76 */   public static final String PATH_THUMBNAIL = PATH_ROOT + "/DCIM/Local/Thumbnail/";
/*   77 */   public static final String PATH_PACK_DATA = PATH_ROOT + "/DCIM/Local/OutImg/";
/*   78 */   public static final String PATH_THUMB_BACKUP = PATH_ROOT + "/DCIM/Local/Thumb_Backup/";
/*      */   public static final String COMPANY_NAME = "global";
/*   80 */   public static final String PATH_EXTERNAL_DATA = PATH_ROOT + "/ExtData/" + "global" + "/";
/*   81 */   public static final String PATH_NETWORK_PRINT = PATH_ROOT + "/NetPrint/";
/*   82 */   public static final String PATH_APPLICATION_DATA = PATH_ROOT + "/MyAppData/";
/*      */   
/*   84 */   public static final String PATH_PUBLIC_FOLDER = PATH_ROOT + "/PublicFolder/";
/*   85 */   public static final String PATH_LOG_FILE = PATH_ROOT + "/Log/";
/*   86 */   public static final String PATH_BACKUP_DB = PATH_ROOT + "/Backup/";
/*   87 */   public static final String PATH_WEBPAGE = PATH_ROOT + "/Android/data/global.scancenter.jobmgr/Webpage/";
/*      */   
/*   89 */   public static final String PATH_DOWNLOAD = PATH_ROOT + "/Download/";
/*   90 */   public static final String PATH_HW_DB = PATH_ROOT + "/Hanvon/db/";
/*   91 */   public static final String PATH_HW_OUTPUT = PATH_ROOT + "/Hanvon/output/";
/*   92 */   public static final String PATH_HW_MERGE = PATH_ROOT + "/Hanvon/merge/";
/*   93 */   public static final String PATH_HW_TEMP = PATH_ROOT + "/Hanvon/tmp/";
/*      */   public static final String PATH_DATA_LIBRARY = "/data/data/global.scancenter.jobmgr/lib/";
/*      */   public static final String PATH_SYSTEM_LIBRARY = "/system/lib/";
/*   96 */   public static final String AWIP_CAPABILITY_FILE = PATH_WEBPAGE + "getxmlcapability.xml";
/*   97 */   public static final String PATH_CUSTOM_DATA = PATH_ROOT + "/avi_custom/";
/*      */   public static final String WEB_UPLOAD_FILE_NAME = "FW.spf";
/*   99 */   public static final String DEVICE_CONFIG_FILE = PATH_CUSTOM_DATA + "config.bin";
/*  100 */   public static final String DEVICE_BOOT_ANIMATION = PATH_CUSTOM_DATA + "bootanimation.zip";
/*  101 */   public static final String CHECK_FIRSTRUN_FILE = PATH_CUSTOM_DATA + "boot.txt";
/*  102 */   public static final String WHITE_LIST_FILE = PATH_CUSTOM_DATA + "whitelist.awl";
/*      */   public static final String PATH_USB_STORAGE = "/usb_storage/USB_DISK0/DISK0_Partition0/";
/*      */   public static final String PATH_SCAN_TO = "/storage/scan/";
/*      */   public static final String PATH_STORAGE_COPY = "/storage/print/";
/*  106 */   public static final String PATH_SCAN_TO_CLOUD = PATH_ROOT + "/storage/cloud/";
/*      */   public static final String PATH_EXTERNAL_DRIVE_0 = "/usb_storage/USB_DISK1/DISK1_Partition0/";
/*      */   public static final String PATH_EXTERNAL_DRIVE_1 = "/usb_storage/USB_DISK1/DISK1_Partition1/";
/*      */   public static final String PATH_WATERMARK = "/storage/watermark";
/*  110 */   public static final String PATH_USBDOWNLOAD = PATH_ROOT + "/USBDownload/";
/*  111 */   public static final String PATH_ERRORITEM = PATH_ROOT + "/ErrorItem/";
/*  112 */   public static final String PATH_SSL_CERT = PATH_ROOT + "/Android/data/global.scancenter.jobmgr/CERT/";
/*      */   
/*      */   public static final int UI_PAGE_HOME = 0;
/*      */   
/*      */   public static final int UI_PAGE_COPY = 1;
/*      */   
/*      */   public static final int UI_PAGE_EMAIL = 2;
/*      */   
/*      */   public static final int UI_PAGE_SCAN = 3;
/*      */   
/*      */   public static final int UI_PAGE_PRINT_SAVE_JOB = 4;
/*      */   
/*      */   public static final int UI_PAGE_ID_COPY = 5;
/*      */   
/*      */   public static final int UI_PAGE_JOB_STATE = 6;
/*      */   
/*      */   public static final int UI_PAGE_MACHINE_STATE = 7;
/*      */   public static final int UI_PAGE_TRAY_CONTENT = 8;
/*      */   public static final int UI_PAGE_PREVIEW = 9;
/*      */   public static final int UI_PAGE_COPY_COUNT = 10;
/*      */   public static final int UI_PAGE_PROCESSING = 11;
/*      */   public static final int UI_PAGE_HOME_TWO = 12;
/*      */   public static final int UI_PAGE_PROCESSING_VIEW = 13;
/*      */   public static final int UI_PAGE_DROP_N_TAKE = 14;
/*      */   public static final int UI_PAGE_FAX = 15;
/*      */   public static final int UI_PAGE_FAST_COPY = 16;
/*      */   public static final int UI_PAGE_TICKET_COPY = 17;
/*      */   public static final int UI_PAGE_CLOUD_PRINT = 18;
/*      */   public static final int UI_PAGE_COUNT_INFO = 19;
/*      */   public static final int UI_PAGE_NORMAL_COPY = 20;
/*      */   public static final String ACTION_UIP_CHANGE_PAGE = "global.scancenter.action.UIP_CHANGE_PAGE";
/*      */   public static final String ACTION_UIP_CHANGE_PAGE_END = "global.scancenter.action.UIP_CHANGE_PAGE_END";
/*      */   public static final String EXTRA_SETTINGS_UI_PAGE = "global.scancenter.extra.SETTINGS_UI_PAGE";
/*      */   public static final int NET_BOTH_OFF = 0;
/*      */   public static final int NET_ETHER_ON = 1;
/*      */   public static final int NET_WIFI_ON = 2;
/*      */   public static final int NET_BOTH_ON = 3;
/*      */   public static final int CARD_VENDER_ID = 1035;
/*      */   public static final int CARD_PRODUCT_ID = 26169;
/*  151 */   public static final int[] WIFI_VENDER_ID = new int[] { 3034, 3034 };
/*  152 */   public static final int[] WIFI_PRODUCT_ID = new int[] { 33145, 51217 };
/*      */ 
/*      */   
/*  155 */   public static UsbDevice mDevice = null;
/*  156 */   public static UsbDeviceConnection mConnection = null;
/*  157 */   public static UsbEndpoint mEndpointOut = null;
/*  158 */   public static UsbEndpoint mEndpointIn = null;
/*  159 */   public static UsbInterface mInterface = null;
/*      */ 
/*      */   
/*  162 */   public static String sUIApk_Packname = "global.scancenter.ui";
/*  163 */   public static String sJobmgr_Packname = "global.scancenter.jobmgrVM3";
/*      */   
/*      */   public static final String ACTION_JOB_START = "global.scancenter.action.JOB_START";
/*      */   
/*      */   public static final String ACTION_JOB_STOP = "global.scancenter.action.JOB_STOP";
/*      */   
/*      */   public static final String ACTION_JOB_STATIC_TEMP = "global.scancenter.action.JOB_STATIC_TEMP";
/*      */   
/*      */   public static final String ACTION_JOB_FINISHED = "global.scancenter.action.JOB_FINISHED";
/*      */   
/*      */   public static final String ACTION_UI_MSG = "global.scancenter.action.UI_MSG";
/*      */   
/*      */   public static final String ACTION_STOP_JOBMGR = "global.scancenter.action.STOP_JOBMGR";
/*      */   
/*      */   public static final String ACTION_SCAN_START = "global.scancenter.action.SCAN_START";
/*      */   
/*      */   public static final String ACTION_SCAN_CHANGED = "global.scancenter.action.SCAN_CHANGED";
/*      */   
/*      */   public static final String ACTION_SCAN_STOP = "global.scancenter.action.SCAN_STOP";
/*      */   
/*      */   public static final String ACTION_SCAN_END = "global.scancenter.action.SCAN_END";
/*      */   
/*      */   public static final String ACTION_SCAN_FINISHED = "global.scancenter.action.SCAN_FINISHED";
/*      */   
/*      */   public static final String ACTION_FILEPACK_INITIAL = "global.scancenter.action.FILEPACK_INITIAL";
/*      */   
/*      */   public static final String ACTION_FILEPACK_START = "global.scancenter.action.FILEPACK_START";
/*      */   
/*      */   public static final String ACTION_FILEPACK_WRITE_DATA = "global.scancenter.action.FILEPACK_WRITE_DATA";
/*      */   
/*      */   public static final String ACTION_FILEPACK_CHANGED = "global.scancenter.action.FILEPACK_CHANGED";
/*      */   
/*      */   public static final String ACTION_FILEPACK_END = "global.scancenter.action.FILEPACK_END";
/*      */   
/*      */   public static final String ACTION_FILEPACK_FINISHED = "global.scancenter.action.FILEPACK_FINISHED";
/*      */   
/*      */   public static final String ACTION_FILEPACK_ALL = "global.scancenter.action.FILEPACK_ALL";
/*      */   
/*      */   public static final String ACTION_FILEPACK_ALL_END = "global.scancenter.action.FILEPACK_ALL_END";
/*      */   
/*      */   public static final String ACTION_FILEPACK_STOP = "global.scancenter.action.FILEPACK_STOP";
/*      */   
/*      */   public static final String ACTION_JOB_START_RESULT = "global.scancenter.action.JOB_START_RESULT";
/*      */   
/*      */   public static final String ACTION_JOB_STOP_RESULT = "global.scancenter.action.JOB_STOP_RESULT";
/*      */   
/*      */   public static final String ACTION_PRINT_CHANGED = "global.scancenter.action.PRINT_CHANGED";
/*      */   
/*      */   public static final String EXTRA_PRINT_PAGE_COUNT = "global.scancenter.extra.PRINT_PAGE_COUNT";
/*      */   
/*      */   public static final String EXTRA_PRINT_FILE_COUNT = "global.scancenter.extra.PRINT_FILE_COUNT";
/*      */   
/*      */   public static final String ACTION_MAKE_WATERMARK = "global.scancenter.action.MAKE_WATERMARK";
/*      */   
/*      */   public static final String EXTRA_WATERMARK_FONT = "global.scancenter.extra.WATERMARK_FONT";
/*      */   
/*      */   public static final String EXTRA_WATERMARK_WORD = "global.scancenter.extra.WATERMARK_WORD";
/*      */   
/*      */   public static final String EXTRA_WATERMARK_ANGLE = "global.scancenter.extra.WATERMARK_ANGLE";
/*      */   
/*      */   public static final String ACTION_FILEPACK_JPEG_INITIAL = "global.scancenter.action.FILEPACK_JPEG_INITIAL";
/*      */   
/*      */   public static final String ACTION_FILEPACK_JPEG_START = "global.scancenter.action.FILEPACK_JPEG_START";
/*      */   
/*      */   public static final String ACTION_FILEPACK_JPEG_WRITE_DATA = "global.scancenter.action.FILEPACK_JPEG_WRITE_DATA";
/*      */   
/*      */   public static final String ACTION_FILEPACK_JPEG_END = "global.scancenter.action.FILEPACK_JPEG_END";
/*      */   
/*      */   public static final String ACTION_FILEPACK_JPEG_ALL = "global.scancenter.action.FILEPACK_JPEG_ALL";
/*      */   
/*      */   public static final String ACTION_FILEPACK_JPEG_STOP = "global.scancenter.action.FILEPACK_JPEG_STOP";
/*      */   
/*      */   public static final String ACTION_USB_STORAGE_MOUNT = "global.scancenter.action.USB_STORAGE_MOUNT";
/*      */   
/*      */   public static final String ACTION_USB_STORAGE_UNMOUNT = "global.scancenter.action.USB_STORAGE_UNMOUNT";
/*      */   
/*      */   public static final String EXTRA_USB_STORAGE_VOLUME = "global.scancenter.extra.USB_STORAGE_VOLUME";
/*      */   
/*      */   public static final String ACTION_USB_STORAGE_SEARCH = "global.scancenter.action.USB_STORAGE_SEARCH";
/*      */   
/*      */   public static final String ACTION_USB_STORAGE_SEARCH_RESULT = "global.scancenter.action.USB_STORAGE_SEARCH_RESULT";
/*      */   
/*      */   public static final String EXTRA_USB_STORAGE_PATH_LIST = "global.scancenter.extra.USB_STORAGE_PATH_LIST";
/*      */   
/*      */   public static final String ACTION_SETTINGS_USB_PORT_ENABLE = "global.scancenter.action.SETTINGS_USB_PORT_ENABLE";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_PORT_ENABLE = "global.scancenter.extra.SETTINGS_USB_PORT_ENABLE";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_PORT_NUMBER = "global.scancenter.extra.SETTINGS_USB_PORT_NUMBER";
/*      */   
/*      */   public static final String ACTION_USB_STORAGE_SAVELOG = "global.scancenter.action.USB_STORAGE_SAVELOG";
/*      */   
/*      */   public static final String ACTION_USB_STORAGE_SAVELOG_RESULT = "global.scancenter.action.USB_STORAGE_SAVELOG_RESULT";
/*      */   
/*      */   public static final String EXTRA_SAVELOG_RESULT = "global.scancenter.extra.SAVELOG_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_USB_UMOUNT = "global.scancenter.action.SETTINGS_USB_UMOUNT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_USB_RESULT = "global.scancenter.action.SETTINGS_USB_RESULT";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_VOLUME_PATH = "global.scancenter.extra.SETTINGS_USB_VOLUME_PATH";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_VOLUME_RESULT = "global.scancenter.extra.SETTINGS_USB_VOLUME_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SHELL_CMD = "global.scancenter.action.SETTINGS_SHELL_CMD";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_SHELL_CMD_LINE = "global.scancenter.extra.SETTINGS_SHELL_CMD_LINE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SHELL_CMD_RESULT = "global.scancenter.action.SETTINGS_SHELL_CMD_RESULT";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_SHELL_CMD_RESULT = "global.scancenter.extra.SETTINGS_SHELL_CMD_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_USB_MOUNT = "global.scancenter.action.SETTINGS_USB_MOUNT";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_MOUNT_CMD = "global.scancenter.extra.USB_STORAGE_MOUNT_CMD";
/*      */   
/*      */   public static final String ACTION_SETTINGS_USB_MOUNT_RESULT = "global.scancenter.action.USB_STORAGE_MOUNT_RESULT";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_MOUNT_RESULT = "global.scancenter.extra.SETTINGS_USB_MOUNT_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_USB_MOUNT_TEST = "global.scancenter.action.SETTINGS_USB_MOUNT_TEST";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_MOUNT_STR = "global.scancenter.extra.USB_STORAGE_MOUNT_STR";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_USB_MOUNT_OPT = "global.scancenter.extra.USB_STORAGE_MOUNT_OPT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_TIMEZONE = "global.scancenter.action.SETTINGS_SET_TIMEZONE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_TIMEZONENODISPLAY = "global.scancenter.action.SETTINGS_GET_TIMEZONENODISPLAY";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_TIMEZONENODISPLAY_RESULT = "global.scancenter.action.SETTINGS_GET_TIMEZONENODISPLAY_RESULT";
/*      */   
/*      */   public static final String EXTRA_TIMEZONENODISPLAY_LIST = "global.scancenter.extra.TIMEZONENODISPLAY_LIST";
/*      */   
/*      */   public static final String ACTION_USB_PERMISSION = "global.scancenter.action.USB_PERMISSION";
/*      */   
/*      */   public static final String ACTION_SEND_START = "global.scancenter.action.SEND_START";
/*      */   
/*      */   public static final String ACTION_SEND_WRITE_DATA = "global.scancenter.action.SEND_WRITE_DATA";
/*      */   
/*      */   public static final String ACTION_SEND_CHANGED = "global.scancenter.action.SEND_CHANGED";
/*      */   
/*      */   public static final String ACTION_SEND_STOP = "global.scancenter.action.SEND_STOP";
/*      */   
/*      */   public static final String ACTION_SEND_END = "global.scancenter.action.SEND_END";
/*      */   
/*      */   public static final String ACTION_SEND_FINISHED = "global.scancenter.action.SEND_FINISHED";
/*      */   
/*      */   public static final String ACTION_SEND_ALL = "global.scancenter.action.SEND_ALL";
/*      */   
/*      */   public static final String ACTION_SEND_ALL_END = "global.scancenter.action.SEND_ALL_END";
/*      */   
/*      */   public static final String ACTION_SEND_CONNECT_RESULT = "global.scancenter.action.SEND_CONNECT_RESULT";
/*      */   
/*      */   public static final String ACTION_SEND_FILENAME_EXIST = "global.scancenter.action.SEND_FILENAME_EXIST";
/*      */   
/*      */   public static final String ACTION_APPSCAN_START = "global.scancenter.action.APPSCAN_START";
/*      */   
/*      */   public static final String ACTION_APPSCAN_END = "global.scancenter.action.APPSCAN_END";
/*      */   
/*      */   public static final String ACTION_THUMB_MAKE_START = "global.scancenter.action.MAKETHUMB_START";
/*      */   
/*      */   public static final String ACTION_THUMB_MAKE_END = "global.scancenter.action.MAKETHUMB_END";
/*      */   
/*      */   public static final String ACTION_THUMB_REMOVE = "global.scancenter.action.THUMB_REMOVE";
/*      */   
/*      */   public static final String ACTION_THUMB_CROP = "global.scancenter.action.THUMB_CROP";
/*      */   
/*      */   public static final String ACTION_THUMB_ROTATE = "global.scancenter.action.THUMB_ROTATE";
/*      */   
/*      */   public static final String ACTION_THUMB_GET_START = "global.scancenter.action.THUMB_GET_START";
/*      */   
/*      */   public static final String ACTION_THUMB_GET_RESULT = "global.scancenter.action.THUMB_GET_RESULT";
/*      */   
/*      */   public static final String ACTION_LDAP_SEARCH_START = "global.scancenter.action.LDAPSEARCH_START";
/*      */   
/*      */   public static final String ACTION_LDAP_SEARCH_RESULT = "global.scancenter.action.LDAPSEARCH_RESULT";
/*      */   
/*      */   public static final String ACTION_SYSCFG_ETHER_GET = "global.scancenter.action.SYSCFG_ETHER_GET";
/*      */   
/*      */   public static final String ACTION_SYSCFG_ETHER_GET_RTN = "global.scancenter.action.SYSCFG_ETHER_GET_RTN";
/*      */   
/*      */   public static final String ACTION_SYSCFG_ETHER_SET = "global.scancenter.action.SYSCFG_ETHER_SET";
/*      */   
/*      */   public static final String ACTION_SYSCFG_ETHER_SET_RTN = "global.scancenter.action.SYSCFG_ETHER_SET_RTN";
/*      */   
/*      */   public static final String ACTION_SYSTEM_MSG = "global.scancenter.action.SYSTEM_MSG";
/*      */   
/*      */   public static final String ACTION_SYSTEM_GET_LOG = "global.scancenter.action.SYSTEM_GET_LOG";
/*      */   
/*      */   public static final String ACTION_AWIP_START = "global.scancenter.action.AWIP_START";
/*      */   
/*      */   public static final String ACTION_PCSCAN_START = "global.scancenter.action.PCSCAN_START";
/*      */   
/*      */   public static final String ACTION_PCSCAN_CHANGED = "global.scancenter.action.PCSCAN_CHANGED";
/*      */   
/*      */   public static final String ACTION_PCSCAN_FINISHED = "global.scancenter.action.PCSCAN_FINISHED";
/*      */   
/*      */   public static final String ACTION_LEARNING_START = "global.scancenter.action.LEARNING_START";
/*      */   
/*      */   public static final String ACTION_LEARNING_FINISHED = "global.scancenter.action.LEARNING_FINISHED";
/*      */   
/*      */   public static final String ACTION_UPDATE_SYSTEM = "global.scancenter.action.UPDATE_SYSTEM";
/*      */   
/*      */   public static final String ACTION_UPDATE_SYSTEM_REBOOT = "global.scancenter.action.UPDATE_SYSTEM_REBOOT";
/*      */   
/*      */   public static final String ACTION_UPDATE_SYSTEM_START = "global.scancenter.action.UPDATE_SYSTEM_START";
/*      */   
/*      */   public static final String ACTION_UPDATE_SYSTEM_FINISHED = "global.scancenter.action.UPDATE_SYSTEM_FINISHED";
/*      */   
/*      */   public static final String ACTION_UPDATE_SYSTEM_END = "global.scancenter.action.UPDATE_SYSTEM_END";
/*      */   
/*      */   public static final String ACTION_UPDATE_SYSTEM_ANDROID = "global.scancenter.action.UPDATE_SYSTEM_ANDROID";
/*      */   
/*      */   public static final String ACTION_NETA_PUTSERIALNO_FINISH = "global.scancenter.action.NETA_PUTSERIALNO_FINISH";
/*      */   
/*      */   public static final String ACTION_NETA_UPLOAD_FINISH = "global.scancenter.action.NETA_UPLOAD_FINISH";
/*      */   
/*      */   public static final String ACTION_UPDATE_FROM_WEBPAGE = "global.scancenter.action.UPDATE_FROM_WEBPAGE";
/*      */   
/*      */   public static final String ACTION_UPDATE_FROM_USBFLASH = "global.scancenter.action.UPDATE_FROM_USBFLASH";
/*      */   
/*      */   public static final String ACTION_UPDATE_FROM_USBFLASH_RESULT = "global.scancenter.action.UPDATE_FROM_USBFLASH_RESULT";
/*      */   
/*      */   public static final String EXTRA_USB_UPDATE_RESULT = "global.scancenter.extra.USB_UPDATE_RESULT";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_ACCOUNT = "global.scancenter.action.UPDATE_DB_ACCOUNT";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_CONFIGURE = "global.scancenter.action.UPDATE_DB_CONFIGURE";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_NETWORK = "global.scancenter.action.UPDATE_DB_NETWORK";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_DEFAULTSET = "global.scancenter.action.UPDATE_DB_DEFAULTSET";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_FOLDERLIST = "global.scancenter.action.UPDATE_DB_FOLDERLIST";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_SHORTCUTLIST = "global.scancenter.action.UPDATE_DB_SHORTCUTLIST";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_EMAILBOOK = "global.scancenter.action.UPDATE_DB_EMAILBOOK";
/*      */   
/*      */   public static final String ACTION_UPDATE_DB_GROUPBOOK = "global.scancenter.action.UPDATE_DB_GROUPBOOK";
/*      */   
/*      */   public static final String ACTION_WEB_UPDATING_START = "global.scancenter.action.WEB_UPDATING_START";
/*      */   
/*      */   public static final String ACTION_WEB_UPDATING_FINISHED = "global.scancenter.action.WEB_UPDATING_FINISHED";
/*      */   
/*      */   public static final String ACTION_SEND_DEBUG_MESSAGE = "global.scancenter.action.SEND_DEBUG_MESSAGE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_GENERAL = "global.scancenter.action.SETTINGS_GET_GENERAL";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_GENERAL_RESULT = "global.scancenter.action.SETTINGS_GET_GENERAL_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_GENERAL = "global.scancenter.action.SETTINGS_SET_GENERAL";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_ETHER = "global.scancenter.action.SETTINGS_GET_ETHER";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_ETHER_RESULT = "global.scancenter.action.SETTINGS_GET_ETHER_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_ETHER = "global.scancenter.action.SETTINGS_SET_ETHER";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIFI_ENABLE = "global.scancenter.action.SETTINGS_GET_WIFI_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIFI_ENABLE_RESULT = "global.scancenter.action.SETTINGS_GET_WIFI_ENABLE_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_WIFI_ENABLE = "global.scancenter.action.SETTINGS_SET_WIFI_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_ADD_WIFI = "global.scancenter.action.SETTINGS_ADD_WIFI";
/*      */   
/*      */   public static final String ACTION_SETTINGS_CONNECT_WIFI = "global.scancenter.action.SETTINGS_CONNECT_WIFI";
/*      */   
/*      */   public static final String ACTION_SETTINGS_CONNECT_WIFI_RESULT = "global.scancenter.action.SETTINGS_CONNECT_WIFI_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_FORGET_WIFI = "global.scancenter.action.SETTINGS_FORGET_WIFI";
/*      */   
/*      */   public static final String ACTION_SETTINGS_MODIFY_WIFI = "global.scancenter.action.SETTINGS_MODIFY_WIFI";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIFI_SCAN = "global.scancenter.action.SETTINGS_GET_WIFI_SCAN";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIFI_SCAN_RESULT = "global.scancenter.action.SETTINGS_GET_WIFI_SCAN_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_AP_MODE_ENABLE = "global.scancenter.action.SETTINGS_GET_AP_MODE_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_AP_MODE_ENABLE_RESULT = "global.scancenter.action.SETTINGS_GET_AP_MODE_ENABLE_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_AP_MODE_ENABLE = "global.scancenter.action.SETTINGS_SET_AP_MODE_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_WIFI_STATUS_CHANGE = "global.scancenter.action.SETTINGS_WIFI_STATUS_CHANGE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIFI_HOTSPOT = "global.scancenter.action.SETTINGS_GET_WIFI_HOTSPOT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIFI_HOTSPOT_RESULT = "global.scancenter.action.SETTINGS_GET_WIFI_HOTSPOT_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_WIFI_HOTSPOT = "global.scancenter.action.SETTINGS_SET_WIFI_HOTSPOT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_CONNECTED_WIFI_AP = "global.scancenter.action.SETTINGS_CONNECTED_WIFI_AP";
/*      */   
/*      */   public static final String ACTION_ANDROID_WIFI_AP_STATE_CHANGED = "android.net.wifi.WIFI_AP_STATE_CHANGED";
/*      */   
/*      */   public static final String ACTION_JOB_DELETE_START = "global.scancenter.action.ACTION_JOB_DELETE_START";
/*      */   
/*      */   public static final String ACTION_JOB_DELETE_END = "global.scancenter.action.ACTION_JOB_DELETE_END";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_WIFI_ENABLE = "global.scancenter.extra.SETTINGS_WIFI_ENABLE";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_AP_MODE_ENABLE = "global.scancenter.extra.SETTINGS_AP_MODE_ENABLE";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_WIFI_AP_LIST = "global.scancenter.extra.SETTINGS_WIFI_AP_LIST";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_WIFI_AP = "global.scancenter.extra.SETTINGS_WIFI_AP";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_WIFI_PASSWORD = "global.scancenter.extra.SETTINGS_WIFI_PASSWORD";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_WIFI_NEW_SSID = "global.scancenter.extra.SETTINGS_WIFI_NEW_SSID";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_WIFI_SECURITY_TYPE = "global.scancenter.extra.SETTINGS_WIFI_SECURITY_TYPE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_HOSTNAME = "global.scancenter.action.SETTINGS_SET_HOSTNAME";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_HOSTNAME_RESULT = "global.scancenter.action.SETTINGS_SET_HOSTNAME_RESULT";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_HOSTNAME = "global.scancenter.extra.SETTINGS_HOSTNAME";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_SET_HOSTNAME_RESULT = "global.scancenter.extra.SETTINGS_SET_HOSTNAME_RESULT";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_WIFI_SSID = "global.scancenter.extra.SETTINGS_WIFI_SSID";
/*      */   
/*      */   public static final String ACTION_NAVIGATION_BUTTON_SHOW = "global.scancenter.action.NAVIGATION_BUTTON_SHOW";
/*      */   
/*      */   public static final String ACTION_NAVIGATION_BUTTON_HIDE = "global.scancenter.action.NAVIGATION_BUTTON_HIDE";
/*      */   
/*      */   public static final String ACTION_NAVIGATION_BACK = "global.scancenter.action.NAVIGATION_BACK";
/*      */   
/*      */   public static final String ACTION_SYSTEM_POWEROFF = "global.scancenter.action.SYSTEM_POWEROFF";
/*      */   
/*      */   public static final String ACTION_SYSTEM_REBOOT = "global.scancenter.action.SYSTEM_REBOOT";
/*      */   
/*      */   public static final String ACTION_DO_REBOOT = "global.scancenter.action.DO_REBOOT";
/*      */   
/*      */   public static final String ACTION_SYSTEM_UPDATE = "global.scancenter.action.SYSTEM_UPDATE";
/*      */   
/*      */   public static final String ACTION_SCANNER_REBOOT = "global.scancenter.action.SCANNER_REBOOT";
/*      */   
/*      */   public static final String ACTION_ADMIN_OFF_LINE = "global.scancenter.action.ADMIN_OFF_LINE";
/*      */   
/*      */   public static final String ACTION_BACKUP_DATABASE = "global.scancenter.action.BACKUP_DATABASE";
/*      */   
/*      */   public static final String ACTION_BACK_TO_UI = "global.scancenter.action.BACK_TO_UI";
/*      */   
/*      */   public static final String ACTION_MOTION_UP = "global.scancenter.action.MOTION_UP";
/*      */   
/*      */   public static final String ACTION_UPDATE_UI_FACE_NOTIFICATION = "global.scancenter.action.UPDATE_UI_FACE_NOTIFICATION";
/*      */   
/*      */   public static final String EXTRA_UPDATE_ITEM = "global.scancenter.extra.UPDATE_ITEM";
/*      */   
/*      */   public static final int ServiceEnable = 0;
/*      */   
/*      */   public static final int AccountEnable = 1;
/*      */   
/*      */   public static final int SettingDisplay = 2;
/*      */   
/*      */   public static final int SaveJobUpdate = 3;
/*      */   
/*      */   public static final String ACTION_WEB_CONFIG_UPDATED = "global.scancenter.action.WEB_CONFIG_UPDATED";
/*      */   
/*      */   public static final String ACTION_DO_SCREEN_ON = "global.scancenter.action.DO_SCREEN_ON";
/*      */   
/*      */   public static final String ACTION_DO_SCREEN_OFF = "global.scancenter.action.DO_SCREEN_OFF";
/*      */   
/*      */   public static final String ACTION_AM_DEVICE_SHUTDOWN = "global.scancenter.action.AM_DEVICE_SHUTDOWN";
/*      */   
/*      */   public static final String ACTION_NETWORK_STATE = "global.scancenter.action.NETWORK_STATE";
/*      */   
/*      */   public static final String ACTION_NETWORK_UPDATE = "global.scancenter.action.NETWORK_UPDATE";
/*      */   
/*      */   public static final String ACTION_NETWORK_IP_CONFLICT = "global.scancenter.action.NETWORK_IP_CONFLICT";
/*      */   
/*      */   public static final String EXTRA_NETWORK_CONNECT = "global.scancenter.extra.NETWORK_CONNECT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_BRIGHTNESS = "global.scancenter.action.SETTINGS_SET_BRIGHTNESS";
/*      */   
/*      */   public static final String ACTION_SETTINGS_UPDATE_ETHER = "global.scancenter.action.SETTINGS_UPDATE_ETHER";
/*      */   
/*      */   public static final String ACTION_SETTINGS_UPDATE_DATE = "global.scancenter.action.SETTINGS_UPDATE_DATE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_UPDATE_TIME = "global.scancenter.action.SETTINGS_UPDATE_TIME";
/*      */   
/*      */   public static final String ACTION_SETTINGS_UPDATE_TIMEZONE = "global.scancenter.action.SETTINGS_UPDATE_TIMEZONE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_UPDATE_SLEEP = "global.scancenter.action.SETTINGS_UPDATE_SLEEP";
/*      */   
/*      */   public static final String ACTION_SETTINGS_UPDATE_LANGUAGE = "global.scancenter.action.SETTINGS_UPDATE_LANGUAGE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_ETHERNET_ENABLE = "global.scancenter.action.SETTINGS_GET_ETHERNET_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_ETHERNET_ENABLE_RESULT = "global.scancenter.action.SETTINGS_GET_ETHERNET_ENABLE_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_ETHERNET_ENABLE = "global.scancenter.action.SETTINGS_SET_ETHERNET_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_ETHERNET_INFO = "global.scancenter.action.SETTINGS_GET_ETHERNET_INFO";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_ETHERNET_INFO_RESULT = "global.scancenter.action.SETTINGS_GET_ETHERNET_INFO_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_ETHERNET_INFO = "global.scancenter.action.SETTINGS_SET_ETHERNET_INFO";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIRELESS_ENABLE = "global.scancenter.action.SETTINGS_GET_WIRELESS_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_WIRELESS_ENABLE_RESULT = "global.scancenter.action.SETTINGS_GET_WIRELESS_ENABLE_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_WIRELESS_ENABLE = "global.scancenter.action.SETTINGS_SET_WIRELESS_ENABLE";
/*      */   
/*      */   public static final String ACTION_SET_ETHERNET_ENABLE = "global.scancenter.action.SET_ETHERNET_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_NETWORK_ENABLE = "global.scancenter.action.SETTINGS_GET_NETWORK_ENABLE";
/*      */   
/*      */   public static final String ACTION_SETTINGS_GET_NETWORK_ENABLE_RESULT = "global.scancenter.action.SETTINGS_GET_NETWORK_ENABLE_RESULT";
/*      */   
/*      */   public static final String ACTION_SETTINGS_SET_NETWORK_ENABLE = "global.scancenter.action.SETTINGS_SET_NETWORK_ENABLE";
/*      */   
/*      */   public static final String ACTION_GET_NETWORK_STATE = "global.scancenter.action.GET_NETWORK_STATE";
/*      */   
/*      */   public static final String ACTION_GET_NETWORK_STATE_RESULT = "global.scancenter.action.GET_NETWORK_STATE_RESULT";
/*      */   
/*      */   public static final String EXTRA_SETTINGS_NETWORK_ENABLE = "global.scancenter.extra.SETTINGS_NETWORK_ENABLE";
/*      */   
/*      */   public static final String EXTRA_GET_IP = "global.scancenter.extra.GET_IP";
/*      */   
/*      */   public static final String ACTION_GET_NETWORK_SWITCH = "global.scancenter.action.GET_NETWORK_SWITCH";
/*      */   
/*      */   public static final String ACTION_GET_NETWORK_SWITCH_RESULT = "global.scancenter.action.GET_NETWORK_SWITCH_RESULT";
/*      */   
/*      */   public static final String ACTION_SEND_CLOUD_RESULTS = "global.scancenter.action.SEND_CLOUD_RESULTS";
/*      */   
/*      */   public static final String ACTION_UIP_ECO_ENERGY_SAVE = "global.scancenter.action.UIP_ECO_ENERGY_SAVE";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_READY = "global.scancenter.action.UIP_SYSTEM_READY";
/*      */   
/*      */   public static final String ACTION_UIP_GET_SYSTEM_READY = "global.scancenter.action.UIP_GET_SYSTEM_READY";
/*      */   
/*      */   public static final String ACTION_UIP_GET_SYSTEM_READY_RESULT = "global.scancenter.action.UIP_GET_SYSTEM_READY_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_SET_FIRST_BOOT_FINISH = "global.scancenter.action.UIP_SET_FIRST_BOOT_FINISH";
/*      */   
/*      */   public static final String ACTION_UIP_GET_FIRST_BOOT = "global.scancenter.action.UIP_GET_FIRST_BOOT";
/*      */   
/*      */   public static final String ACTION_UIP_GET_FIRST_BOOT_RESULT = "global.scancenter.action.UIP_GET_FIRST_BOOT_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_STATE_CHAGED = "global.scancenter.action.UIP_JOB_STATE_CHAGED";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_DETAIL_CHAGED = "global.scancenter.action.UIP_JOB_DETAIL_CHAGED";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_CHECK = "global.scancenter.action.UIP_JOB_CHECK";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_CHECK_RESULT = "global.scancenter.action.UIP_JOB_CHECK_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_GET_MACHINE_FAULTS = "global.scancenter.action.UIP_GET_MACHINE_FAULTS";
/*      */   
/*      */   public static final String ACTION_UIP_GET_MACHINE_FAULTS_RESULT = "global.scancenter.action.UIP_GET_MACHINE_FAULTS_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_DISPLAY_MACHINE_FAULTS = "global.scancenter.action.UIP_DISPLAY_MACHINE_FAULTS";
/*      */   
/*      */   public static final String ACTION_UIP_UPDATE_MACHINE_FAULTS = "global.scancenter.action.UIP_UPDATE_MACHINE_FAULTS";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_STATE_NOTIFICATION = "global.scancenter.action.UIP_JOB_STATE_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_STATUS_NOTIFICATION = "global.scancenter.action.UIP_JOB_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_PRINTER_STATUS_NOTIFICATION = "global.scancenter.action.UIP_PRINTER_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_SCANNER_STATUS_NOTIFICATION = "global.scancenter.action.UIP_SCANNER_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_STATUS_NOTIFICATION = "global.scancenter.action.UIP_SYSTEM_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_CSA6_STATUS_NOTIFICATION = "global.scancenter.action.UIP_CSA6_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_STATUS_NOTIFICATION = "global.scancenter.action.UIP_DROPNTAKE_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_FAX_STATUS_NOTIFICATION = "global.scancenter.action.UIP_FAX_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_RESPONSE_STATUS_NOTIFICATION = "global.scancenter.action.UIP_RESPONSE_STATUS_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_OPERATION_RESULT_NOTIFICATION = "global.scancenter.action.UIP_OPERATION_RESULT_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_STOP_NOTIFICATION = "global.scancenter.action.UIP_JOB_STOP_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_JOB_STATUS_WAIT_FOR_RESULT = "global.scancenter.action.UIP_JOB_STATUS_WAIT_FOR_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_DATA_ACCESS = "global.scancenter.action.UIP_DATA_ACCESS";
/*      */   
/*      */   public static final String ACTION_UIP_DATA_ACCESS_RESULTS = "global.scancenter.action.UIP_DATA_ACCESS_RESULTS";
/*      */   
/*      */   public static final String ACTION_UIP_ACCOUNT_SERVICE = "global.scancenter.action.UIP_ACCOUNT_SERVICE";
/*      */   
/*      */   public static final String ACTION_UIP_ACCOUNT_SERVICE_RESULTS = "global.scancenter.action.UIP_ACCOUNT_SERVICE_RESULTS";
/*      */   
/*      */   public static final String ACTION_UIP_MACHINE_STATUS_SERVICE = "global.scancenter.action.UIP_MACHINE_STATUS_SERVICE";
/*      */   
/*      */   public static final String ACTION_UIP_MACHINE_STATUS_SERVICE_RESULTS = "global.scancenter.action.UIP_MACHINE_STATUS_SERVICE_RESULTS";
/*      */   
/*      */   public static final String ACTION_UIP_NO_MATCH_PAPER_RESPONSE = "global.scancenter.action.UIP_NO_MATCH_PAPER_RESPONSE";
/*      */   
/*      */   public static final String ACTION_UIP_NO_MATCH_PAPER_RESPONSE_RESULT = "global.scancenter.action.UIP_NO_MATCH_PAPER_RESPONSE_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_RECOVER_SCANNER_ERROR = "global.scancenter.action.UIP_RECOVER_SCANNER_ERROR";
/*      */   
/*      */   public static final String ACTION_UIP_TRAY_RESET_NOTIFICATION = "global.scancenter.action.UIP_TRAY_RESET_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_TWOSIDE_RESET_NOTIFICATION = "global.scancenter.action.UIP_TWOSIDE_RESET_NOTIFICATION";
/*      */   
/*      */   public static final String ACTION_UIP_COLLECT_COPY_ASK_RESULT = "global.scancenter.action.UIP_COLLECT_COPY_ASK_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_CLOSE_ERROR = "global.scancenter.action.UIP_CLOSE_ERROR";
/*      */   
/*      */   public static final String ACTION_UIP_CARD_TOUCH_IN = "global.scancenter.action.UIP_CARD_TOUCH_IN";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_INITIALIZE = "global.scancenter.action.UIP_SYSTEM_INITIALIZE";
/*      */   
/*      */   public static final String ACTION_UIP_IDREGISTER_START = "global.scancenter.action.UIP_IDREGISTER_START";
/*      */   
/*      */   public static final String EXTRA_IDREGISTER_MODE = "global.scancenter.extra.IDREGISTER_MODE";
/*      */   
/*      */   public static final String ACTION_UIP_IDREGISTER_PROCESS1 = "global.scancenter.action.UIP_IDREGISTER_PROCESS1";
/*      */   
/*      */   public static final String ACTION_UIP_IDREGISTER_PROCESS2 = "global.scancenter.action.UIP_IDREGISTER_PROCESS2";
/*      */   
/*      */   public static final String ACTION_UIP_IDREGISTER_NG = "global.scancenter.action.UIP_IDREGISTER_NG";
/*      */   
/*      */   public static final String EXTRA_IDREGISTER_TYPE = "global.scancenter.extra.IDREGISTER_TYPE";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_ENTER = "global.scancenter.action.UIP_DROPNTAKE_ENTER";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_EXIT = "global.scancenter.action.UIP_DROPNTAKE_EXIT";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_CONTINUE = "global.scancenter.action.UIP_DROPNTAKE_CONTINUE";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_CONTINUE_EX = "global.scancenter.action.UIP_DROPNTAKE_CONTINUE_EX";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_CONTINUE_NEW = "global.scancenter.action.UIP_DROPNTAKE_CONTINUE_NEW";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_CONTINUE_DUPLEX_BY_SIMGLE = "global.scancenter.action.UIP_DROPNTAKE_CONTINUE_DUPLEX_BY_SIMGLE";
/*      */   
/*      */   public static final String ACTION_UIP_DROPNTAKE_RESPONSE_COPY_COUNT = "global.scancenter.action.UIP_DROPNTAKE_RESPONSE_COPY_COUNT";
/*      */   
/*      */   public static final String ACTION_UIP_APPLICATION_RESULTS = "global.scancenter.action.UIP_APPLICATION_RESULTS";
/*      */   
/*      */   public static final String ACTION_UIP_MSG_HIDDEN = "global.scancenter.action.UIP_MSG_HIDDEN";
/*      */   
/*      */   public static final String ACTION_UIP_MSG_ALL_RESET = "global.scancenter.action.UIP_MSG_ALL_RESET";
/*      */   
/*      */   public static final String ACTION_UIP_MSG_TIMEOUT = "global.scancenter.action.UIP_MSG_TIMEOUT";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_WAKE_UP = "global.scancenter.action.UIP_SYSTEM_WAKE_UP";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_TIMEOUT = "global.scancenter.action.UIP_SYSTEM_TIMEOUT";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_ENERGY_SAVE = "global.scancenter.action.UIP_SYSTEM_ENERGY_SAVE";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_ENERGY_SAVE_ECO = "global.scancenter.action.UIP_SYSTEM_ENERGY_SAVE_ECO";
/*      */   
/*      */   public static final String ACTION_UIP_WAIT_RESPONSE_TIMEOUT = "global.scancenter.action.UIP_WAIT_RESPONSE_TIMEOUT";
/*      */   
/*      */   public static final String ACTION_UIP_CONNECT_FAILED_RESULT = "global.scancenter.action.UIP_CONNECT_FAILED_RESULT";
/*      */   
/*      */   public static final String ACTION_UIP_REPORT_PRINT = "global.scancenter.action.UIP_REPORT_PRINT";
/*      */   
/*      */   public static final String ACTION_UIP_SERVICE_MODE = "global.scancenter.action.UIP_SERVICE_MODE";
/*      */   
/*      */   public static final String ACTION_UIP_TEXT_DISPLAY = "global.scancenter.action.UIP_TEXT_DISPLAY";
/*      */   
/*      */   public static final String ACTION_UIP_SYSTEM_DISCONNECTED = "global.scancenter.action.UIP_SYSTEM_DISCONNECTED";
/*      */   
/*      */   public static final String ACTION_INSTALL_CUSTOM_APK = "global.scancenter.action.INSTALL_CUSTOM_APK";
/*      */   
/*      */   public static final String ACTION_INSTALL_CUSTOM_APK_RESULT = "global.scancenter.action.INSTALL_CUSTOM_APK_RESULT";
/*      */   
/*      */   public static final String ACTION_UNINSTALL_CUSTOM_APK = "global.scancenter.action.UNINSTALL_CUSTOM_APK";
/*      */   
/*      */   public static final String ACTION_UNINSTALL_CUSTOM_APK_RESULT = "global.scancenter.action.UNINSTALL_CUSTOM_APK_RESULT";
/*      */   
/*      */   public static final String EXTRA_INSTALL_CUSTOM_APK_NAME = "global.scancenter.extra.INSTALL_CUSTOM_APK_NAME";
/*      */   
/*      */   public static final String EXTRA_INSTALL_CUSTOM_APK_RESULT = "global.scancenter.extra.INSTALL_CUSTOM_APK_RESULT";
/*      */   
/*      */   public static final String EXTRA_INSTALL_CUSTOM_APK_AUTORUN = "global.scancenter.extra.INSTALL_CUSTOM_APK_AUTORUN";
/*      */   
/*      */   public static final String EXTRA_INSTALL_CUSTOM_PACKAGE_NAME = "global.scancenter.extra.INSTALL_CUSTOM_PACKAGE_NAME";
/*      */   
/*      */   public static final String ACTION_INSTALLER_INSTALL = "global.installer.INSTALL";
/*      */   
/*      */   public static final String ACTION_INSTALLER_UNINSTALL = "global.installer.UNINSTALL";
/*      */   
/*      */   public static final String ACTION_WIFI_CONNECT_FAILED = "global.scancenter.action.WIFI_CONNECT_FAILED";
/*      */   
/*      */   public static final String ACTION_MACHINE_FAULT_OCCUR = "global.scancenter.action.MACHINE_FAULT_OCCUR";
/*      */   
/*      */   public static final String ACTION_MACHINE_FAULT_REMOVE = "global.scancenter.action.MACHINE_FAULT_REMOVE";
/*      */   
/*      */   public static final String EXTRA_MACHINE_FAULT_CODE = "global.scancenter.extra.MACHINE_FAULT_CODE";
/*      */   
/*      */   public static final String EXTRA_UIP_IS_COLLATE_COPY = "global.scancenter.extra.UIP_IS_COLLATE_COPY";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_THUMB_FRONT_PATH = "global.scancenter.extra.UIP_DROPNTAKE_THUMB_FRONT_PATH";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_THUMB_BACK_PATH = "global.scancenter.extra.UIP_DROPNTAKE_THUMB_BACK_PATH";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_SELECTED_SIDE = "global.scancenter.extra.UIP_DROPNTAKE_SELECTED_SIDE";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_JOB_CANCELED = "global.scancenter.extra.UIP_DROPNTAKE_JOB_CANCELED";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_COPY_COUNT = "global.scancenter.extra.UIP_DROPNTAKE_COPY_COUNT";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_COPY_DENSITY = "global.scancenter.extra.UIP_DROPNTAKE_COPY_DENSITY";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_BACK_THUMB_EXIST = "global.scancenter.extra.UIP_DROPNTAKE_BACK_THUMB_EXIST";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_PAGE_INFO = "global.scancenter.extra.UIP_DROPNTAKE_PAGE_INFO";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_TIMEOUT_PRINT = "global.scancenter.extra.UIP_DROPNTAKE_TIMEOUT_PRINT";
/*      */   
/*      */   public static final String EXTRA_UIP_RUNTEST_TYPE = "global.scancenter.extra.UIP_RUNTEST_TYPE";
/*      */   
/*      */   public static final String EXTRA_UIP_RUNTEST_COUNT = "global.scancenter.extra.UIP_RUNTEST_COUNT";
/*      */   
/*      */   public static final String EXTRA_UIP_DISPLAY_TEXT = "global.scancenter.extra.UIP_DISPLAY_TEXT";
/*      */   
/*      */   public static final String EXTRA_UIP_DISPLAY_TEMPA3 = "global.scancenter.extra.UIP_DISPLAY_TEMPA3";
/*      */   
/*      */   public static final String EXTRA_UIP_DISPLAY_TEMPA4 = "global.scancenter.extra.UIP_DISPLAY_TEMPA4";
/*      */   
/*      */   public static final String EXTRA_UIP_CARD_USER_ID = "global.scancenter.extra.UIP_CARD_USER_ID";
/*      */   
/*      */   public static final String EXTRA_UIP_SYSTEM_READY = "global.scancenter.extra.UIP_SYSTEM_READY";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_MAINCLASS = "global.scancenter.extra.UIP_MSG_MAINCLASS";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_SUBCLASS = "global.scancenter.extra.UIP_MSG_SUBCLASS";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_TYPE_CODE = "global.scancenter.extra.UIP_MSG_TYPE_CODE";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_STATUS_CODE = "global.scancenter.extra.UIP_MSG_STATUS_CODE";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_JOB_ID = "global.scancenter.extra.EXTRA_UIP_MSG_JOB_ID";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_JOB_EXIST = "global.scancenter.extra.EXTRA_UIP_MSG_JOB_EXIST";
/*      */   
/*      */   public static final String EXTRA_UPDATE_RESULT = "global.scancenter.extra.UPDATE_RESULT";
/*      */   
/*      */   public static final String EXTRA_UIP_JOB_TYPE = "global.scancenter.extra.UIP_JOB_TYPE";
/*      */   
/*      */   public static final String EXTRA_UIP_MACHINE_FAULT_LIST = "global.scancenter.extra.UIP_MACHINE_FAULT_LIST";
/*      */   
/*      */   public static final String EXTRA_UIP_ACCOUNT_SERVICE_TYPE = "global.scancenter.extra.UIP_ACCOUNT_SERVICE_TYPE";
/*      */   
/*      */   public static final String EXTRA_UIP_JOB_STATE = "global.scancenter.extra.UIP_JOB_STATE";
/*      */   
/*      */   public static final String EXTRA_UIP_JOB_STATE_EX = "global.scancenter.extra.UIP_JOB_STATE_EX";
/*      */   
/*      */   public static final String EXTRA_UIP_JOB_STATUS = "global.scancenter.extra.UIP_JOB_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_JOB_STATUS_EX = "global.scancenter.extra.UIP_JOB_STATUS_EX";
/*      */   
/*      */   public static final String EXTRA_UIP_PRINTER_STATUS = "global.scancenter.extra.UIP_PRINTER_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_PRINTER_STATUS_EX = "global.scancenter.extra.UIP_PRINTER_STATUS_EX";
/*      */   
/*      */   public static final String EXTRA_UIP_SCANNER_STATUS = "global.scancenter.extra.UIP_SCANNER_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_SCANNER_STATUS_EX = "global.scancenter.extra.UIP_SCANNER_STATUS_EX";
/*      */   
/*      */   public static final String EXTRA_UIP_SYSTEM_STATUS = "global.scancenter.extra.UIP_SYSTEM_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_CSA6_STATUS = "global.scancenter.extra.UIP_CSA6_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_FAX_STATUS = "global.scancenter.extra.UIP_FAX_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_DROPNTAKE_STATUS = "global.scancenter.extra.UIP_DROPNTAKE_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_RESPONSE_STATUS = "global.scancenter.extra.UIP_RESPONSE_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_RESPONSE_STATUS_CODE = "global.scancenter.extra.UIP_RESPONSE_STATUS_CODE";
/*      */   
/*      */   public static final String EXTRA_UIP_WAIT_FOR_RESULT = "global.scancenter.extra.UIP_WAIT_FOR_RESULT";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_TYPE = "global.scancenter.extra.EXTRA_UIP_MSG_TYPE";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_HAPPEN = "global.scancenter.extra.EXTRA_UIP_MSG_HAPPEN";
/*      */   
/*      */   public static final String EXTRA_UIP_MSG_PRIORITY = "global.scancenter.extra.UIP_MSG_PRIORITY";
/*      */   
/*      */   public static final String EXTRA_UIP_NOTIFY_TYPE = "global.scancenter.extra.UIP_NOTIFY_TYPE";
/*      */   
/*      */   public static final String EXTRA_UIP_EXTMSG_COUNT = "global.scancenter.extra.UIP_EXTMSG_COUNT";
/*      */   
/*      */   public static final String EXTRA_UIP_JOB_QUEUE_SIZE = "global.scancenter.extra.UIP_JOB_QUEUE_SIZE";
/*      */   
/*      */   public static final String EXTRA_UIP_SERVICE_CODE = "global.scancenter.extra.UIP_SERVICE_CODE";
/*      */   
/*      */   public static final String EXTRA_UIP_PAPER_SIZE = "global.scancenter.extra.UIP_PAPER_SIZE";
/*      */   
/*      */   public static final String EXTRA_UIP_MEDIA_TYPE = "global.scancenter.extra.UIP_MEDIA_TYPE";
/*      */   
/*      */   public static final String EXTRA_UIP_ERROR_TYPE = "global.scancenter.extra.UIP_ERROR_TYPE";
/*      */   
/*      */   public static final String EXTRA_UIP_ERROR_CODE_EX = "global.scancenter.extra.UIP_ERROR_CODE_EX";
/*      */   
/*      */   public static final String EXTRA_UIP_ERROR_CODE = "global.scancenter.extra.UIP_ERROR_CODE";
/*      */   
/*      */   public static final String EXTRA_UIP_ERROR_DIALOG = "global.scancenter.extra.UIP_ERROR_DIALOG";
/*      */   
/*      */   public static final String EXTRA_UIP_DEBUG_CODE = "global.scancenter.extra.UIP_DEBUG_CODE";
/*      */   
/*      */   public static final String EXTRA_UIP_NET_LOGIN_NAME = "global.scancenter.extra.UIP_NET_LOGIN_NAME";
/*      */   
/*      */   public static final String EXTRA_UIP_NET_PASSWORD = "global.scancenter.extra.UIP_NET_PASSWORD";
/*      */   
/*      */   public static final String EXTRA_UIP_USB_FLASH_STATUS = "global.scancenter.extra.UIP_USB_FLASH_STATUS";
/*      */   
/*      */   public static final String EXTRA_UIP_TRAY_STATUS_LIST = "global.scancenter.extra.UIP_TRAY_STATUS_LIST";
/*      */   
/*      */   public static final String EXTRA_UIP_TRAY_STATUS_LIST_EX = "global.scancenter.extra.UIP_TRAY_STATUS_LIST_EX";
/*      */   
/*      */   public static final String EXTRA_UIP_TRAY_STATUS = "global.scancenter.extra.UIP_TRAY_STATUS";
/*      */   public static final String EXTRA_UIP_TRAY_STATUS_EX = "global.scancenter.extra.UIP_TRAY_STATUS_EX";
/*      */   public static final String EXTRA_UIP_TRAY_ID = "global.scancenter.extra.UIP_TRAY_ID";
/*      */   public static final String EXTRA_UIP_TRAY_ID_EX = "global.scancenter.extra.UIP_TRAY_ID_EX";
/*      */   public static final String EXTRA_UIP_DEVICE_SETTING_SWITCH = "global.scancenter.extra.UIP_DEVICE_SETTING_SWITCH";
/*      */   public static final String EXTRA_UIP_DEVICE_ADF_STATUS = "global.scancenter.extra.UIP_DEVICE_ADF_STATUS";
/*      */   public static final String EXTRA_UIP_DEVICE_AVAILABLE = "global.scancenter.extra.UIP_DEVICE_AVAILABLE";
/*      */   public static final String EXTRA_UIP_ERROR_ID = "global.scancenter.extra.UIP_ERROR_ID";
/*      */   public static final String EXTRA_MS_ACTION_RESULT = "global.scancenter.extra.MS_ACTION_RESULT";
/*      */   public static final String EXTRA_MS_SERVICE_ENABLE = "global.scancenter.extra.MS_SERVICE_ENABLE";
/*      */   public static final String EXTRA_MS_SERVICE_SORTORDER = "global.scancenter.extra.MS_SERVICE_SORTORDER";
/*      */   public static final String EXTRA_MS_ACTION_MODE = "global.scancenter.extra.MS_ACTION_MODE";
/*      */   public static final String EXTRA_MS_ACTION_MODE_EX = "global.scancenter.extra.MS_ACTION_MODE_EX";
/*      */   public static final String EXTRA_MS_GENERAL_INFO = "global.scancenter.extra.MS_GENERAL_INFO";
/*      */   public static final String EXTRA_ETHERNET_CONNECT_STATUS = "global.scancenter.extra.ETHERNET_CONNECT_STATUS";
/*      */   public static final String EXTRA_WIFI_CONNECT_STATUS = "global.scancenter.extra.WIFI_CONNECT_STATUS";
/*      */   public static final String EXTRA_MS_INFORMATION_PRINTING = "global.scancenter.extra.MS_INFORMATION_PRINTING";
/*      */   public static final String EXTRA_MS_SUPPLY_STATUS = "global.scancenter.extra.MS_SUPPLY_STATUS";
/*      */   public static final String EXTRA_MS_BILLING_INFO = "global.scancenter.extra.MS_BILLING_INFO";
/*      */   public static final String EXTRA_MS_TIME_CLOCK = "global.scancenter.extra.MS_TIME_CLOCK";
/*      */   public static final String EXTRA_MS_SIZE_SPECIFICATION = "global.scancenter.extra.MS_SIZE_SPECIFICATION";
/*      */   public static final String EXTRA_MS_SWITCH_OPTION = "global.scancenter.extra.MS_SWITCH_OPTION";
/*      */   public static final String EXTRA_MS_PAD_TYPE = "global.scancenter.extra.MS_PAD_TYPE";
/*      */   public static final String EXTRA_MS_Serial_Number = "global.scancenter.extra.MS_Serial_Number";
/*      */   public static final String EXTRA_MS_RECALIBRATION = "global.scancenter.extra.MS_RECALIBRATION";
/*      */   public static final String EXTRA_MS_USB_MODE = "global.scancenter.extra.MS_USB_MODE";
/*      */   public static final String EXTRA_MS_PAPER_MISMATCH_CONFIRMATION = "global.scancenter.extra.MS_PAPER_MISMATCH_CONFIRMATION";
/*      */   public static final String EXTRA_MS_ADMIN_PASSWORD = "global.scancenter.extra.MS_ADMIN_PASSWORD";
/*      */   public static final String EXTRA_MS_RESET_COUNTER_TYPE = "global.scancenter.extra.MS_RESET_COUNTER_TYPE";
/*      */   public static final String EXTRA_MS_AIO_CONTROL = "global.scancenter.extra.MS_AIO_CONTROL";
/*      */   public static final String EXTRA_MS_STORAGE_CAPACITY = "global.scancenter.extra.MS_STORAGE_CAPACITY";
/*      */   public static final String EXTRA_MS_POWER_MODE = "global.scancenter.extra.MS_POWER_MODE";
/*      */   public static final String EXTRA_MS_PRINTER_EDGE_INFO = "global.scancenter.extra.MS_PRINTER_EDGE_INFO";
/*      */   public static final String EXTRA_MS_RESTORE_SPECIFIC_DATA = "global.scancenter.extra.MS_RESTORE_SPECIFIC_DATA";
/*      */   public static final String EXTRA_MS_DEFAULT_MODE = "global.scancenter.extra.MS_DEFAULT_MODE";
/*      */   public static final String EXTRA_MS_LANGUAGE_TYPE = "global.scancenter.extra.MS_LANGUAGE_TYPE";
/*      */   public static final String EXTRA_MS_SYSTEM_TIMEOUT = "global.scancenter.extra.MS_SYSTEM_TIMEOUT";
/*      */   public static final String EXTRA_MS_ENERGY_SAVE = "global.scancenter.extra.MS_ENERGY_SAVE";
/*      */   public static final String EXTRA_MS_AUTO_POWER_OFF = "global.scancenter.extra.MS_AUTO_POWER_OFF";
/*      */   public static final String EXTRA_MS_TRAY_ROLLER_TYPE = "global.scancenter.extra.MS_TRAY_ROLLER_TYPE";
/*      */   public static final String EXTRA_MS_FUSER_SERIAL_NUMBER = "global.scancenter.extra.MS_FUSER_SERIAL_NUMBER";
/*      */   public static final String EXTRA_MS_FAX_MODULE_SEND_COUNT = "global.scancenter.extra.MS_FAX_MODULE_SEND_COUNT";
/*      */   public static final String EXTRA_MS_HOST_NAME = "global.scancenter.extra.MS_HOST_NAME";
/*      */   public static final String EXTRA_MS_SMTP_INFO = "global.scancenter.extra.MS_SMTP_INFO";
/*      */   public static final String EXTRA_MS_SMTP_INFO_EX = "global.scancenter.extra.MS_SMTP_INFO_EX";
/*      */   public static final String EXTRA_MS_REPORT_PRINT_TYPE = "global.scancenter.extra.MS_REPORT_PRINT_TYPE";
/*      */   public static final String EXTRA_MS_LPH_PULSE = "global.scancenter.extra.MS_LPH_PULSE";
/*      */   public static final String EXTRA_MS_TRAY_ID = "global.scancenter.extra.MS_TRAY_ID";
/*      */   public static final String EXTRA_MS_SCHEDULE_RESTART_TIME = "global.scancenter.extra.MS_SCHEDULE_RESTART_TIME";
/*      */   public static final String EXTRA_MS_SELECT_PAPER_SIZE = "global.scancenter.extra.MS_SELECT_PAPER_SIZE";
/*      */   public static final String EXTRA_MS_FAX_MODULE_STATUS = "global.scancenter.extra.MS_FAX_MODULE_STATUS";
/*      */   public static final String EXTRA_UIP_ACCOUNT_IMPRESSION_TYPE = "global.scancenter.extra.UIP_ACCOUNT_IMPRESSION_TYPE";
/*      */   public static final String EXTRA_MS_HEATER_VALUE = "global.scancenter.extra.MS_HEATER_VALUE";
/*      */   public static final String EXTRA_MS_FLICKER_NOISE = "global.scancenter.extra.MS_FLICKER_NOISE";
/*      */   public static final String EXTRA_UIP_ACCOUNT_INFO = "global.scancenter.extra.UIP_ACCOUNT_INFO";
/*      */   public static final String EXTRA_UIP_LOGIN_RESULT = "global.scancenter.extra.UIP_LOGIN_RESULT";
/*      */   public static final String EXTRA_LOGIN_ERROR_CODE = "global.scancenter.extra.LOGIN_ERROR_CODE";
/*      */   public static final String EXTRA_UIP_ACCOUNT_LIST = "global.scancenter.extra.UIP_ACCOUNT_LIST";
/*      */   public static final String EXTRA_UIP_ACCOUNT_SWITCH_OPTION = "global.scancenter.extra.UIP_ACCOUNT_SWITCH_OPTION";
/*      */   public static final String EXTRA_UIP_LOGIN_USER = "global.scancenter.extra.UIP_LOGIN_USER";
/*      */   public static final String EXTRA_UIP_FOLDER_LIST = "global.scancenter.extra.UIP_FOLDER_LIST";
/*      */   public static final String EXTRA_UIP_FILE_LIST = "global.scancenter.extra.UIP_FILE_LIST";
/*      */   public static final String EXTRA_UIP_PROFILE_LIST = "global.scancenter.extra.UIP_PROFILE_LIST";
/*      */   public static final String EXTRA_UIP_PROFILE_NUMBER = "global.scancenter.extra.UIP_PROFILE_NUMBER";
/*      */   public static final String EXTRA_UIP_SAVED_JOB_LIST = "global.scancenter.extra.UIP_SAVED_JOB_LIST";
/*      */   public static final String EXTRA_UIP_USB_LIST = "global.scancenter.extra.UIP_USB_LIST";
/*      */   public static final String EXTRA_UIP_FILE_PATH = "global.scancenter.extra.UIP_FILE_PATH";
/*      */   public static final String EXTRA_UIP_FIRST_BOOT = "global.scancenter.extra.UIP_FIRST_BOOT";
/*      */   public static final String EXTRA_UIP_ACTIVE_JOB_TYPE = "global.scancenter.extra.UIP_ACTIVE_JOB_TYPE";
/*      */   public static final String EXTRA_UIP_ACTIVE_JOB_TYPE_EX = "global.scancenter.extra.UIP_ACTIVE_JOB_TYPE_EX";
/*      */   public static final String EXTRA_UIP_ACTIVE_JOB_LIST = "global.scancenter.extra.UIP_ACTIVE_JOB_LIST";
/*      */   public static final String EXTRA_UIP_ACTIVE_JOB_DETAIL = "global.scancenter.extra.UIP_ACTIVE_JOB_DETAIL";
/*      */   public static final String EXTRA_UIP_COMPLETED_JOB_LIST = "global.scancenter.extra.UIP_COMPLETED_JOB_LIST";
/*      */   public static final String EXTRA_UIP_ACTIVE_JOB_DELETE_RANGE = "global.scancenter.extra.UIP_ACTIVE_JOB_DELETE_RANGE";
/*      */   public static final String EXTRA_UIP_ACTIVE_JOB_CLEAN_TIME = "global.scancenter.extra.UIP_ACTIVE_JOB_CLEAN_TIME";
/*      */   public static final String EXTRA_SAVED_JOB_OPTIONS = "global.scancenter.extra.SAVED_JOB_OPTIONS";
/*      */   public static final String EXTRA_UIP_DATA_ACCESS_MODE = "global.scancenter.extra.UIP_DATA_ACCESS_MODE";
/*      */   public static final String EXTRA_UIP_DATA_ACCESS_MODE_EX = "global.scancenter.extra.UIP_DATA_ACCESS_MODE_EX";
/*      */   public static final String EXTRA_UIP_DATA_ACCESS_RESULT = "global.scancenter.extra.UIP_DATA_ACCESS_RESULT";
/*      */   public static final String EXTRA_DEBUG_MESSAGE = "global.scancenter.extra.DEBUG_MESSAGE";
/*      */   public static final String EXTRA_NETWORK_STATE = "global.scancenter.extra.NETWORK_STATE";
/*      */   public static final String EXTRA_NETWORK_IP_CONFLICT_MAC = "global.scancenter.extra.NETWORK_IP_CONFLICT_MAC";
/*      */   public static final String EXTRA_SETTINGS_DATE = "global.scancenter.extra.SETTINGS_DATE";
/*      */   public static final String EXTRA_SETTINGS_TIME = "global.scancenter.extra.SETTINGS_TIME";
/*      */   public static final String EXTRA_SETTINGS_TIMEZONE = "global.scancenter.extra.SETTINGS_TIMEZONE";
/*      */   public static final String EXTRA_SETTINGS_SLEEP = "global.scancenter.extra.SETTINGS_SLEEP";
/*      */   public static final String EXTRA_SETTINGS_LANGUAGE = "global.scancenter.extra.SETTINGS_LANGUAGE";
/*      */   public static final String EXTRA_SETTINGS_DHCP = "global.scancenter.extra.SETTINGS_DHCP";
/*      */   public static final String EXTRA_SETTINGS_IP = "global.scancenter.extra.SETTINGS_IP";
/*      */   public static final String EXTRA_SETTINGS_WINS_IP = "global.scancenter.extra.SETTINGS_WINS_IP";
/*      */   public static final String EXTRA_SETTINGS_ETHERNET_ENABLE = "global.scancenter.extra.SETTINGS_ETHERNET_ENABLE";
/*      */   public static final String EXTRA_SETTINGS_WIRELESS_ENABLE = "global.scancenter.extra.SETTINGS_WIRELESS_ENABLE";
/*      */   public static final String EXTRA_VERSION_NAME = "global.scancenter.extra.VERSION_NAME";
/*      */   public static final String EXTRA_VERSION_CODE = "global.scancenter.extra.VERSION_CODE";
/*      */   public static final String EXTRA_JOB_ID = "global.scancenter.extra.JOB_ID";
/*      */   public static final String EXTRA_JOB_MODE = "global.scancenter.extra.JOB_MODE";
/*      */   public static final String EXTRA_SCAN_PROGRESS = "global.scancenter.extra.SCAN_PROGRESS";
/*      */   public static final String EXTRA_SCAN_FILE_INFO = "global.scancenter.extra.SCAN_FILE_INFO";
/*      */   public static final String EXTRA_SCAN_FOLDER_PATH = "global.scancenter.extra.SCAN_FOLDER_PATH";
/*      */   public static final String EXTRA_SCAN_FILE_PATH = "global.scancenter.extra.SCAN_FILE_PATH";
/*      */   public static final String EXTRA_SCAN_FILE_COUNT = "global.scancenter.extra.SCAN_FILE_COUNT";
/*      */   public static final String EXTRA_SCAN_PAGE_COUNT = "global.scancenter.extra.SCAN_PAGE_COUNT";
/*      */   public static final String EXTRA_SCAN_ERROR = "global.scancenter.extra.scanerror";
/*      */   public static final String EXTRA_SCAN_START = "global.scancenter.extra.scanend";
/*      */   public static final String EXTRA_SCAN_END = "global.scancenter.extra.scanend";
/*      */   public static final String EXTRA_SCAN_TYPE = "global.scancenter.extra.scantype";
/*      */   public static final String EXTRA_SCAN_LIST = "global.scancenter.extra.scanlist";
/*      */   public static final String EXTRA_SCAN_TOTAL_COUNT = "global.scancenter.extra.scancount";
/*      */   public static final String EXTRA_PREVIEW_LIST = "global.scancenter.extra.previewlist";
/*      */   public static final String EXTRA_PREVIEW_INDEX = "global.scancenter.extra.previewindex";
/*      */   public static final String EXTRA_PREVIEW_FILE = "global.scancenter.extra.previewfile";
/*      */   public static final String EXTRA_FILEPACK_START = "global.scancenter.extra.packstart";
/*      */   public static final String EXTRA_FILEPACK_END = "global.scancenter.extra.packend";
/*      */   public static final String EXTRA_FILEPACK_NAME = "global.scancenter.extra.packname";
/*      */   public static final String EXTRA_FILEPACK_PROGRESS = "global.scancenter.extra.packprogress";
/*      */   public static final String EXTRA_FILEPACK_FILE_COUNT = "global.scancenter.extra.packedpage";
/*      */   public static final String EXTRA_FILEPACK_FILE_PATH = "global.scancenter.extra.packedfile";
/*      */   public static final String EXTRA_FILEPACK_LIST = "global.scancenter.extra.packlist";
/*      */   public static final String EXTRA_SEND_DESTINATION = "global.scancenter.extra.senddestination";
/*      */   public static final String EXTRA_SEND_DESTINATION_EX = "global.scancenter.extra.senddestination_ex";
/*      */   public static final String EXTRA_SCAN_OPTIONS = "global.scancenter.extra.scanoptions";
/*      */   public static final String EXTRA_SEND_OPTIONS = "global.scancenter.extra.sendoptions";
/*      */   public static final String EXTRA_COPY_OPTIONS = "global.scancenter.extra.copyoptions";
/*      */   public static final String EXTRA_EMAIL_OPTIONS = "global.scancenter.extra.emailoptions";
/*      */   public static final String EXTRA_FILING_OPTIONS = "global.scancenter.extra.filingoptions";
/*      */   public static final String EXTRA_FILING_NAME = "global.scancenter.extra.FILING_NAME";
/*      */   public static final String EXTRA_FILE_LIST = "global.scancenter.extra.filelist";
/*      */   public static final String EXTRA_FILE_INFO_LIST = "global.scancenter.extra.filelistinfo";
/*      */   public static final String EXTRA_MULTI_FEED_LIST = "global.scancenter.extra.multifeedlist";
/*      */   public static final String EXTRA_LAST_ERROR_CODE = "global.scancenter.extra.lasterrorcode";
/*      */   public static final String EXTRA_SEND_RESULT = "global.scancenter.extra.sendresult";
/*      */   public static final String EXTRA_SEND_FILE_COUNT = "global.scancenter.extra.sendfilepage";
/*      */   public static final String EXTRA_SEND_FILE_PATH = "global.scancenter.extra.sendfilename";
/*      */   public static final String EXTRA_EXECUTION_TIME = "global.scancenter.extra.executiontime";
/*      */   public static final String EXTRA_UI_MSG = "global.scancenter.extra.uimessage";
/*      */   public static final String EXTRA_RETURN_CODE = "global.scancenter.extra.errorcode";
/*      */   public static final String EXTRA_FILING_PROFILES = "global.scancenter.extra.filingprofiles";
/*      */   public static final String EXTRA_FILE_BLOCK_LENGTH = "global.scancenter.extra.fileblock";
/*      */   public static final String EXTRA_DROPBOX_AUTH_SESSION = "global.scancenter.extra.dropboxauthsession";
/*      */   public static final String EXTRA_LDAP_SEARCH_INFO = "global.scancenter.extra.ldapsearchinfo";
/*      */   public static final String EXTRA_FILING_JOB = "global.scancenter.extra.filingjob";
/*      */   public static final String EXTRA_EMAIL_JOB = "global.scancenter.extra.emailjob";
/*      */   public static final String EXTRA_COPY_JOB = "global.scancenter.extra.copyjob";
/*      */   public static final String EXTRA_NETWORK_INFO = "global.scancenter.extra.nerworkinfo";
/*      */   public static final String EXTRA_IMAGE_PROCESS_PAGE = "global.scancenter.extra.imageprocesspage";
/*      */   public static final String EXTRA_JOB_OPTIONS = "global.scancenter.extra.joboptions";
/*      */   public static final String EXTRA_OUTPUT_PATH = "global.scancenter.extra.outputpath";
/*      */   public static final String EXTRA_SEND_JOB = "global.scancenter.extra.sendjob";
/*      */   public static final String EXTRA_IMAGE_CROP_INFO = "global.scancenter.extra.imagecropinfo";
/*      */   public static final String EXTRA_IMAGE_ROTATE_DEGREE = "global.scancenter.extra.imagerotatedegree";
/*      */   public static final String EXTRA_SERVICE_ID = "global.scancenter.extra.SERVICE_ID";
/*      */   public static final String EXTRA_DRAWABLE_ICON = "global.scancenter.extra.DRAWABLE_ICON";
/*      */   public static final String EXTRA_PCSCAN_PAGE = "global.scancenter.extra.PCSCAN_PAGE";
/*      */   public static final String EXTRA_PCSCAN_STATUS = "global.scancenter.extra.PCSCAN_STATUS";
/*      */   public static final String EXTRA_UPDATE_PATH_LIST = "global.scancenter.extra.UPDATE_PATH_LIST";
/*      */   public static final String EXTRA_SCANNUMBERBYCOPY = "global.scancenter.extra.SCANNUMBERBYCOPY";
/*      */   public static final String EXTRA_PRINTNUMBERBYCOPY = "global.scancenter.extra.PRINTNUMBERBYCOPY";
/*      */   public static final String EXTRA_PRINTTOTALNUMBERBYCOPY = "global.scancenter.extra.PRINTTOTALNUMBERBYCOPY";
/*      */   public static final String EXTRA_SENDNUMBERBYCOPY = "global.scancenter.extra.SENDNUMBERBYCOPY";
/*      */   public static final String EXTRA_RECEIVENUMBERBYCOPY = "global.scancenter.extra.RECEIVENUMBERBYCOPY";
/*      */   public static final String EXTRA_FAX_OPTIONS = "global.scancenter.extra.FAX_OPTIONS";
/*      */   public static final String EXTRA_FAX_CONFIGURATION = "global.scancenter.extra.FAX_CONFIGURATION";
/*      */   public static final String EXTRA_ADDRESSBOOK_EMAIL_LIST = "global.scancenter.extra.ADDRESSBOOK_EMAIL_LIST";
/*      */   public static final String EXTRA_ADDRESSBOOK_GROUP_LIST = "global.scancenter.extra.ADDRESSBOOK_GROUP_LIST";
/*      */   public static final String EXTRA_ADDRESSBOOK_EMAIL = "global.scancenter.extra.ADDRESSBOOK_EMAIL";
/*      */   public static final String EXTRA_ADDRESSBOOK_GROUP = "global.scancenter.extra.ADDRESSBOOK_GROUP";
/*      */   public static final String EXTRA_LDAP_SEARCHKEYWORD = "global.scancenter.extra.LDAP_SEARCHKEYWORD";
/*      */   public static final String EXTRA_SETTINGS_BRIGHTNESS = "global.scancenter.extra.SETTINGS_BRIGHTNESS";
/*      */   public static final String EXTRA_PARSE_JSON_DATA = "global.scancenter.extra.PARSE_JSON_DATA";
/*      */   public static final String EXTRA_JOB_JSON_DATA = "global.scancenter.extra.JOB_JSON_DATA";
/*      */   public static final String PREF_SCAN_OPTIONS = "Pref_ScanOptions";
/*      */   public static final String PREF_SEND_OPTIONS = "Pref_SendOptions";
/*      */   public static final String PREF_EMAIL_OPTIONS = "Pref_FilingOptions";
/*      */   public static final String PREF_FILING_OPTIONS = "Pref_EmailOptions";
/*      */   public static final String PREF_COPY_OPTIONS = "Pref_CopyOptions";
/*      */   public static final String PREF_SEND_DESTINATION = "Pref_Destination";
/*      */   public static final String PREF_LIST_FILEINFO = "Pref_List_FileInfo";
/*      */   public static final String PREF_SCAN_LIST_STRING = "Pref_Scan_List_String";
/*      */   public static final String PREF_PREV_LIST_STRING = "Pref_Preview_List_String";
/*      */   public static final String PREF_SCANCAST_LIST = "Pref_Scancast_List";
/*      */   public static final String ACTION_GET_SCANNER_ERROR = "global.scancenter.action.GET_SCANNER_ERROR";
/*      */   public static final String ACTION_SCANNER_ERROR = "global.scancenter.action.SCANNER_ERROR";
/*      */   public static final String ACTION_ADMIN_ERROR = "global.scancenter.action.ADMIN_ERROR";
/*      */   public static final String EXTRA_ADMIN_ERROR = "global.scancenter.extra.ADMIN_ERROR";
/*      */   public static final String EXTRA_UNEXPECTED_ERROR = "global.scancenter.extra.UNEXPECTED_ERROR";
/*      */   public static final String EXTRA_QRCODE = "global.scancenter.extra.QRCODE";
/*      */   public static final String EXTRA_SCREEN_ON = "global.scancenter.extra.SCEEEN_ON";
/*      */   public static final String ACTION_SCANJOB_EXTRA_PROCESSING = "global.scancenter.action.SCANJOB_EXTRA_PROCESSING";
/*      */   public static final String EXTRA_SAVEPATH = "global.scancenter.extra.SAVEPATH";
/*      */   public static final String EXTRA_LOADPATH = "global.scancenter.extra.LOADPATH";
/*      */   public static final String ACTION_JOBMGR_PRINT = "global.scancenter.action.JOBMGR_PRINT";
/*      */   public static final String EXTRA_FILE_POSITION = "global.scancenter.extra.FILE_POSITION";
/*      */   public static final String EXTRA_PRINT_COUNT = "global.scancenter.extra.PRINT_COUNT";
/*      */   public static final String EXTRA_AUTOFIT = "global.scancenter.extra.AUTOFIT";
/*      */   public static final String EXTRA_DUPLEX = "global.scancenter.extra.DUPLEX";
/*      */   public static final String ACTION_GET_SYSTEM_USAGE_INFO = "global.scancenter.action.GET_SYSTEM_USAGE_INFO";
/*      */   public static final String ACTION_GET_SYSTEM_USAGE_INFO_RESULT = "global.scancenter.action.GET_SYSTEM_USAGE_INFO_RESULT";
/*      */   public static final String EXTRA_SYSTEM_INFO = "global.scancenter.extra.SYSTEM_INFO";
/*      */   public static final String EXTRA_GET_DATA = "global.scancenter.extra.GET_DATA";
/*      */   public static final String ACTION_OPEN_WEBVIEW_URL = "global.scancenter.action.OPEN_WEBVIEW_URL";
/*      */   public static final String ACTION_OPEN_WEBVIEW_URL_RESULT = "global.scancenter.action.OPEN_WEBVIEW_URL_RESULT";
/*      */   public static final String ACTION_SCAN_FILE_INFORMATION = "global.scancenter.action.SCAN_FILE_INFORMATION";
/*      */   public static final String EXTRA_URL = "global.scancenter.extra.URL";
/*      */   public static final String ACTION_UI_SETTING_DISPALY_DATA = "global.scancenter.action.UI_SETTING_DISPALY_DATA";
/*      */   public static final String EXTRA_WIFI_DISPLAY = "global.scancenter.extra.WIFI_DISPLAY";
/*      */   public static final String EXTRA_LANGUAGE_DISPLAY_LIST = "global.scancenter.extra.LANGUAGE_DISPLAY_LIST";
/*      */   public static final String EXTRA_COMPANY_NAME = "global.scancenter.extra.COMPANY_NAME";
/*      */   public static final String ACTION_UI_SETTING_DISPALY_DATA_RESULT = "global.scancenter.action.SETTING_DISPALY_DATA_RESULT";
/*      */   public static final String EXTRA_FACIAL_RECOGNITION = "global.scancenter.extra.FACIAL_RECOGNITION";
/*      */   public static final String EXTRA_CATEGORY = "global.scancenter.extra.CATEGORY";
/*      */   public static final String EXTRA_MODEL_NAME = "global.scancenter.extra.MODEL_NAME";
/*      */   public static final String EXTRA_EXIST_ADF = "global.scancenter.extra.EXIST_ADF";
/*      */   public static final String EXTRA_VENDOR_NAME = "global.scancenter.extra.VENDOR_NAME";
/*      */   public static final String EXTRA_VENDOR_NUMBER = "global.scancenter.extra.VENDOR_NUMBER";
/*      */   public static final String EXTRA_ENABLE_ACCOUNT = "global.scancenter.extra.ENABLE_ACCOUNT";
/*      */   public static final String EXTRA_FTP_CIFS_ENABLE = "global.scancenter.extra.FTP_CIFS_ENABLE";
/*      */   public static final String EXTRA_FAXFUNENABLE = "global.scancenter.extra.FAXFUNENABLE";
/*      */   public static final String EXTRA_CLOUDPRINTENABLE = "global.scancenter.extra.CLOUDPRINTENABLE";
/*      */   public static final String EXTRA_WEBPAGEPRINTENABLE = "global.scancenter.extra.WEBPAGEPRINTENABLE";
/*      */   public static final String EXTRA_TIMEZONENODISPLAY = "global.scancenter.extra.TIMEZONENODISPLAY";
/*      */   public static final String EXTRA_NORMALCOPYENABLE = "global.scancenter.extra.NORMALCOPYENABLE";
/*      */   public static final String EXTRA_FB_BACKGROUNDCOLOR = "global.scancenter.extra.FB_BACKGROUNDCOLOR";
/*      */   public static final String EXTRA_COPYENABLE = "global.scancenter.extra.COPYENABLE";
/*      */   public static final String EXTRA_EMAILENABLE = "global.scancenter.extra.EMAILENABLE";
/*      */   public static final String EXTRA_SCANENABLE = "global.scancenter.extra.SCANENABLE";
/*      */   public static final String EXTRA_IDCARDENABLE = "global.scancenter.extra.IDCARDENABLE";
/*      */   public static final String EXTRA_STORAGECOPYENABLE = "global.scancenter.extra.STORAGECOPYENABLE";
/*      */   public static final String EXTRA_SENDMETER = "global.scancenter.extra.SENDMETER";
/*      */   public static final String EXTRA_COLLATEROTATE = "global.scancenter.extra.COLLATEROTATE";
/*      */   public static final String EXTRA_LOCALSTORAGEENABLE = "global.scancenter.extra.LOCALSTORAGEENABLE";
/*      */   public static final String ACTION_UIAGENT_SEND_STATE = "global.scancenter.action.UIAGENT_SEND_STATE";
/*      */   public static final String EXTRA_UIAGENT_STATE_CODE = "global.scancenter.extra.UIAGENT_STATE_CODE";
/*      */   public static final String ACTION_UIAGENT_SEND_ERROR = "global.scancenter.action.UIAGENT_SEND_ERROR";
/*      */   public static final String EXTRA_UIAGENT_ERROR_CODE = "global.scancenter.extra.UIAGENT_ERROR_CODE";
/*      */   public static final String EXTRA_UIAGENT_MSG_HAPPEN = "global.scancenter.extra.EXTRA_UIAGENT_MSG_HAPPEN";
/*      */   public static final String EXTRA_UIAGENT_ERROR_MSG = "global.scancenter.extra.EXTRA_UIAGENT_ERROR_MSG";
/*      */   public static final String EXTRA_WIDTH = "global.scancenter.extra.WIDTH";
/*      */   public static final String EXTRA_HIGHT = "global.scancenter.extra.HIGHT";
/*      */   public static final String EXTRA_WIDTH_FRONT = "global.scancenter.extra.WIDTH_FRONT";
/*      */   public static final String EXTRA_HIGHT_FRONT = "global.scancenter.extra.HIGHT_FRONT";
/*      */   public static final String EXTRA_WIDTH_BACK = "global.scancenter.extra.WIDTH_BACK";
/*      */   public static final String EXTRA_HIGHT_BACK = "global.scancenter.extra.HIGHT_BACK";
/*      */   public static final String EXTRA_BLANKPAGECOUNT = "global.scancenter.extra.BLANKPAGECOUNT";
/*      */   public static final String EXTRA_DISPLAYBLANKPAGE = "global.scancenter.extra.DISPLAYBLANKPAGE";
/*      */   public static final String ACTION_TIMEOUT_BACKWARDS = "global.scancenter.action.TIMEOUT_BACKWARDS";
/*      */   public static final String EXTRA_COUNT_BACKWARDS = "global.scancenter.extra.COUNT_BACKWARDS";
/*      */   public static final String SEPARATOR = ",";
/*      */   public static final String ACTION_DISPLAY_ANDROID_POWEROFF = "global.scancenter.action.DISPLAY_ANDROID_POWEROFF";
/*      */   public static final String ACTION_DISPLAY_ANDROID_POWEROFF_RESULT = "global.scancenter.action.DISPLAY_ANDROID_POWEROFF_RESULT";
/*      */   public static final String EXTRA_ANDROID_POWEROFF_MODE = "global.scancenter.extra.ANDROID_POWEROFF_MODE";
/*      */   public static final String ACTION_SETTINGS_SET_IMEService_IQQI = "global.scancenter.action.SETTINGS_SET_IMEService_IQQI";
/*      */   public static final String ACTION_SETTINGS_SET_IMEService_IQQI_RESULT = "global.scancenter.action.SETTINGS_SET_IMEService_IQQI_RESULT";
/*      */   public static final String ACTION_SETTINGS_SET_IMEService_Latin = "global.scancenter.action.SETTINGS_SET_IMEService_Latin";
/*      */   public static final String ACTION_SETTINGS_SET_IMEService_Latin_RESULT = "global.scancenter.action.SETTINGS_SET_IMEService_Latin_RESULT";
/*      */   public static final String EXTRA_SETTINGS_SET_IMEService_IQQI_RESULT = "global.scancenter.extra.SETTINGS_SET_IMEService_IQQI_RESULT";
/*      */   public static final String EXTRA_SETTINGS_SET_IMEService_Latin_RESULT = "global.scancenter.extra.SETTINGS_SET_IMEService_Latin_RESULT";
/*      */   public static final String ACTION_SETTINGS_SET_LATINIME_SUBTYPE = "global.scancenter.extra.SETTINGS_SET_LATINIME_SUBTYPE";
/*      */   public static final String EXTRA_SETTINGS_SET_SUBTYPE = "global.scancenter.extra.SETTINGS_SET_SUBTYPE";
/*      */   public static final String ACTION_KEY_CANCELKEY = "global.scancenter.action.KEY_CANCELKEY";
/*      */   public static final String ACTION_KEY_HOMEKEY = "global.scancenter.action.KEY_HOMEKEY";
/*      */   public static final String ACTION_KEY_ENTERKEY = "global.scancenter.action.KEY_ENTERKEY";
/*      */   public static final String ACTION_FILE_PASSWORD_NEED = "global.scancenter.action.FILE_PASSWORD_NEED";
/*      */   public static final String ACTION_FILE_PASSWORD_NEED_RESULT = "global.scancenter.action.FILE_PASSWORD_NEED_RESULT";
/*      */   public static final String EXTRA_FILE_CANCEL = "global.scancenter.extra.FILE_CANCEL";
/*      */   public static final String EXTRA_FILE_PASSWORD = "global.scancenter.extra.FILE_PASSWORD";
/*      */   public static final String ACTION_EMMC_TEST = "global.scancenter.action.EMMC_TEST";
/*      */   public static final String ACTION_EMMC_TEST_RESULT = "global.scancenter.action.EMMC_TEST_RESULT";
/*      */   public static final String EXTRA_EMMC_COMMAND = "global.scancenter.extra._EMMC_COMMAND";
/*      */   public static final String EXTRA_EnableBlankDetect = "global.scancenter.extra.EnableBlankDetect";
/*      */   public static final String ACTION_LCD_TEST = "global.scancenter.action.LCD_TEST";
/*      */   public static final String ACTION_LCD_TEST_RESULT = "global.scancenter.action.LCD_TEST_RESULT";
/*      */   public static final String EXTRA_LCD_RESULT = "global.scancenter.extra.LCD_RESULT";
/*      */   public static final String ACTION_CLOUDPRINT_STARTJOB = "global.scancenter.action.CLOUDPRINT_STARTJOB";
/*      */   public static final String ACTION_CLOUDPRINT_STARTJOB_RESULT = "global.scancenter.action.CLOUDPRINT_STARTJOB_RESULT";
/*      */   public static final String ACTION_CLOUDPRINT_STOPJOB = "global.scancenter.action.CLOUDPRINT_STOPJOB";
/*      */   public static final String ACTION_CLOUDPRINT_DELETEJOB = "global.scancenter.action.CLOUDPRINT_DELETEJOB";
/*      */   public static final String ACTION_CLOUDPRINT_DELETEJOB_RESULT = "global.scancenter.action.CLOUDPRINT_DELETEJOB_RESULT";
/*      */   public static final String EXTRA_CLOUDPRINT_JOBLIST = "global.scancenter.extra.CLOUDPRINT_JOBLIST";
/*      */   public static final String EXTRA_CLOUDPRINT_JOB = "global.scancenter.extra.CLOUDPRINT_JOB";
/*      */   public static final String EXTRA_CLOUDPRINT_UPDATE_JOBLIST = "global.scancenter.extra.CLOUDPRINT_UPDATE_JOBLIST";
/*      */   public static final String EXTRA_MACHINEPASSWORD = "global.scancenter.extra.MACHINEPASSWORD";
/*      */   public static final String EXTRA_RESULT_MACHINELOOIN = "global.scancenter.extra.RESULT_MACHINELOOIN";
/*      */   public static final String ACTION_ADB_SWITCH_ON = "global.scancenter.action.ADB_SWITCH_ON";
/*      */   public static final String ACTION_ADB_SWITCH_OFF = "global.scancenter.action.ADB_SWITCH_OFF";
/*      */   public static final String ACTION_ADB_GET_STATUS = "global.scancenter.action.ADB_GET_STATUS";
/*      */   public static final String ACTION_ADB_GET_STATUS_RESULT = "global.scancenter.action.ADB_GET_STATUS_RESULT";
/*      */   public static final String EXTRA_ADB_STATUS = "global.scancenter.extra.ADB_STATUS";
/*      */   public static final String ACTION_JBIG_TEST = "global.scancenter.action.JBIG_TEST";
/*      */   public static final String EXTRA_FILE_INDEX = "global.scancenter.extra.FILE_INDEX";
/*      */   public static final String EXTRA_RETURN = "global.scancenter.extra.FILE_TEST_RETURN";
/*      */   public static final String EXTRA_TEST_START = "global.scancenter.extra.EST_START";
/*      */   public static final String ACTION_SEND_SLEEP_STATUS = "global.scancenter.action.SEND_SLEEP_STATUS";
/*      */   public static final String EXTRA_SLEEP_MODE = "global.scancenter.extra.SLEEP_MODE";
/*      */   public static final String ACTION_GET_USER_CERTIFICATE = "global.scancenter.action.GET_USER_CERTIFICATE";
/*      */   public static final String ACTION_GET_USER_CERTIFICATE_RESULT = "global.scancenter.action.GET_USER_CERTIFICATE_RESULT";
/*      */   public static final String ACTION_REMOVE_USER_CERTIFICATE = "global.scancenter.action.REMOVE_USER_CERTIFICATE";
/*      */   public static final String ACTION_REMOVE_USER_CERTIFICATE_RESULT = "global.scancenter.action.REMOVE_USER_CERTIFICATE_RESULT";
/*      */   public static final String EXTRA_USER_CERTIFICATE_LIST = "global.scancenter.extra.USER_CERTIFICATE_LIST";
/*      */   public static final String EXTRA_USER_CERTIFICATE_ALIAS = "global.scancenter.extra.USER_CERTIFICATE_ALIAS";
/*      */   public static final String EXTRA_REMOVE_USER_CERTIFICATE_RESULT = "global.scancenter.extra.REMOVE_USER_CERTIFICATE_RESULT";
/*      */   public static final String ACTION_ETH8021X_FINISH = "8021xfinish";
/*      */   public static final String sJobID = "JobID";
/*      */   public static final String sJobName = "JobName";
/*      */   public static final String sJobTimeStamp = "JobTimeStamp";
/*      */   public static final String sPrintFile = "PrintFile";
/*      */   public static final String ACTION_INSTANT_UPDATES = "global.scancenter.action.INSTANT_UPDATES";
/*      */   public static final String EXTRA_OCR_STATUS = "global.scancenter.extra.OCR_STATUS";
/*      */   public static final String ACTION_GET_WHITE_LIST = "global.scancenter.action.GET_WHITE_LIST";
/*      */   public static final String ACTION_GET_WHITE_LIST_RESULT = "global.scancenter.action.GET_WHITE_LIST_RESULT";
/*      */   public static final String EXTRA_WL_ENABLE_PLUGIN_FUNC = "global.scancenter.extra.WL_ENABLE_PLUGIN_FUNC";
/*      */   public static final String EXTRA_WL_PACKAGE_NAME = "global.scancenter.extra.WL_PACKAGE_NAME";
/*      */   public static final String EXTRA_SAVELOG_ENABLE = "global.scancenter.extra.SAVELOG_ENABLE";
/*      */   public static final String EXTRA_SAVEPACKET_ENABLE = "global.scancenter.extra.SAVEPACKET_ENABLE";
/*      */   public static final String EXTRA_PLUGIN_ENABLE = "global.scancenter.extra.PLUGIN_ENABLE";
/*      */   public static final String EXTRA_PLUGIN_SWITCH_ENABLE = "global.scancenter.extra.PLUGIN_SWITCH_ENABLE";
/*      */   public static final String EXTRA_UI_PACKAGE_NAME = "global.scancenter.extra.UI_PACKAGE_NAME";
/*      */   public static final String EXTRA_UI_SWITCH = "global.scancenter.extra.UI_SWITCH";
/*      */   public static final String ACTION_MFP_ERROR = "global.scancenter.action.MFP_ERROR";
/*      */   public static final String EXTRA_ERROR_CODE = "global.scancenter.extra.ERROR_CODE";
/*      */   public static final String EXTRA_ERROR_TYPE = "global.scancenter.extra.ERROR_TYPE";
/*      */   public static final String EXTRA_ERROR_STATE = "global.scancenter.extra.ERROR_STATE";
/*      */   public static final String ACTION_SHOW_GLOBAL_DIALOG = "global.scancenter.action.SHOW_GLOBAL_DIALOG";
/*      */   public static final String ACTION_VNC_SERVER_START = "global.scancenter.action.VNC_SERVER_START";
/*      */   public static final String EXTRA_VNC_PKG_NAME = "global.scancenter.extra.VNC_PKG_NAME";
/*      */   public static final String EXTRA_VNC_PORT = "global.scancenter.extra.VNC_PORT";
/*      */   public static final String EXTRA_VNC_PASSWORD = "global.scancenter.extra.VNC_PASSWORD";
/*      */   public static final String ACTION_VNC_SERVER_STOP = "global.scancenter.action.VNC_SERVER_STOP";
/*      */   public static final String ACTION_VNC_SERVER_GET_STATUS = "global.scancenter.action.VNC_SERVER_GET_STATUS";
/*      */   public static final String ACTION_VNC_SERVER_GET_STATUS_RESULT = "global.scancenter.action.VNC_SERVER_GET_STATUS_RESULT";
/*      */   public static final String EXTRA_VNC_SERVER_STATUS = "global.scancenter.extra.VNC_SERVER_STATUS";
/*      */   public static final String ACTION_GET_NFC_EXTERNAL_USE = "global.scancenter.action.GET_NFC_EXTERNAL_USE";
/*      */   public static final String ACTION_GET_NFC_EXTERNAL_USE_RESULT = "global.scancenter.action.GET_NFC_EXTERNAL_USE_RESULT";
/*      */   public static final String ACTION_SET_NFC_EXTERNAL_USE = "global.scancenter.action.SET_NFC_EXTERNAL_USE";
/*      */   public static final String EXTRA_NFC_EXTERNAL_ENABLE = "global.scancenter.extra.NFC_EXTERNAL_ENABLE";
/*      */   public static final String ACTION_GET_NFC_POLLING_INTERVAL = "global.scancenter.action.GET_NFC_POLLING_INTERVAL";
/*      */   public static final String ACTION_GET_NFC_POLLING_INTERVAL_RESULT = "global.scancenter.action.GET_NFC_POLLING_INTERVAL_RESULT";
/*      */   public static final String ACTION_SET_NFC_POLLING_INTERVAL = "global.scancenter.action.SET_NFC_POLLING_INTERVAL";
/*      */   public static final String EXTRA_POLLING_INTERVAL_VALUE = "global.scancenter.extra.POLLING_INTERVAL_VALUE";
/*      */   public static final String ACTION_NFC_NOTIFICATION = "global.scancenter.action.NFC_NOTIFICATION";
/*      */   public static final String EXTRA_NFC_CARD_ID = "global.scancenter.extra.NFC_CARD_ID";
/*      */   public static final String EXTRA_SNMP_ENABLE = "global.scancenter.extra.SNMP_ENABLE";
/*      */   public static final String EXTRA_SNMP_ENABLEV1V2C = "global.scancenter.extra.SNMP_ENABLEV1V2C";
/*      */   public static final String EXTRA_SNMP_COMMUNITYNAME = "global.scancenter.extra.SNMP_COMMUNITYNAME";
/*      */   public static final String EXTRA_SNMP_ENABLEV3 = "global.scancenter.extra.SNMP_ENABLEV3";
/*      */   public static final String EXTRA_SNMP_USERNAME = "global.scancenter.extra.SNMP_USERNAME";
/*      */   public static final String EXTRA_SNMP_AUTHTYPE = "global.scancenter.extra.SNMP_AUTHTYPE";
/*      */   public static final String EXTRA_SNMP_AUTHPWD = "global.scancenter.extra.SNMP_AUTHPWD";
/*      */   public static final String EXTRA_SNMP_PRIVACYTYPE = "global.scancenter.extra.SNMP_PRIVACYTYPE";
/*      */   public static final String EXTRA_SNMP_PRIVACYPWD = "global.scancenter.extra.SNMP_PRIVACYPWD";
/*      */   public static final String EXTRA_SNMP_CONTEXTNAME = "global.scancenter.extra.SNMP_CONTEXTNAME";
/*      */   public static final String EXTRA_SHUTDOWN_PROGRAM = "global.scancenter.extra.SHUTDOWN_PROGRAM";
/*      */   public static final String ACTION_MANY_WIFI_DONGLE = "global.scancenter.action.MANY_WIFI_DONGLE";
/*      */   public static final String EXTRA_WIFI_DONGLE_COUNT = "global.scancenter.extra.EXTERNAL_WIFI_DONGLE_COUNT";
/*      */   public static final String ACTION_EXTERNAL_DEVICE = "global.scancenter.action.EXTERNAL_DEVICE";
/*      */   public static final String ACTION_EXTERNAL_DEVICE_RESULT = "global.scancenter.action.EXTERNAL_DEVICE_RESULT";
/*      */   public static final String EXTRA_EXTERNAL_DEVICE_HARDDRIVE = "global.scancenter.extra.EXTERNAL_DEVICE_HARDDRIVE";
/*      */   public static final String EXTRA_EXTERNAL_DEVICE_NFC = "global.scancenter.extra.EXTERNAL_DEVICE_NFC";
/*      */   public static final String EXTRA_EXTERNAL_KATUSHA_KEYBOARD = "global.scancenter.extra.EXTERNAL_KATUSHA_KEYBOARD";
/*      */   public static final String ACTION_GET_MEMORY_INFO = "global.scancenter.action.GET_MEMORY_INFO";
/*      */   public static final String ACTION_GET_MEMORY_INFO_RESULT = "global.scancenter.action.GET_MEMORY_INFO_RESULT";
/*      */   public static final String EXTRA_TOTOL_MEMORY_SIZE = "global.scancenter.extra.TOTOL_MEMORY_SIZE";
/*      */   public static final String EXTRA_AVAILABLE_MEMORY_SIZE = "global.scancenter.extra.AVAILABLE_MEMORY_SIZE";
/*      */   public static final String ACTION_SHOW_USBFUNCETIONLIST = "global.scancenter.action.SHOW_USBFUNCETIONLIST";
/*      */   public static final String EXTRA_HIDDENNETSWITCHPG = "global.scancenter.extra.HIDDENNETSWITCHPG";
/*      */   public static final String EXTRA_HTTPSEVERSW = "global.scancenter.extra.HTTPSEVERSW";
/*      */   public static final String EXTRA_HTTPSENABLE = "global.scancenter.extra.HTTPSENABLE";
/*      */   public static final String EXTRA_SNMPAGENTSW = "global.scancenter.extra.SNMPAGENTSW";
/*      */   public static final String EXTRA_MOPRIAPRINTSW = "global.scancenter.extra.MOPRIAPRINTSW";
/*      */   public static final String EXTRA_LPRSW = "global.scancenter.extra.LPRSW";
/*      */   public static final String EXTRA_RAWPRINTSW = "global.scancenter.extra.RAWPRINTSW";
/*      */   public static final String EXTRA_GDIPRINTSW = "global.scancenter.extra.GDIPRINTSW";
/*      */   public static final String EXTRA_RAWPORT = "global.scancenter.extra.RAWPORT";
/*      */   public static final String EXTRA_GDIPORT = "global.scancenter.extra.GDIPORT";
/*      */   public static final String EXTRA_MDNSPRINT = "global.scancenter.extra.MDNSPRINT";
/*      */   public static final String EXTRA_IPPPRINT = "global.scancenter.extra.IPPPRINT";
/*      */   public static final String EXTRA_SUPPORT_S3 = "global.scancenter.extra.SUPPORT_S3";
/*      */   public static final String ACTION_SETTINGS_CREDDLG = "global.settings.CREDDLG";
/*      */   public static final String ACTION_SETTINGS = "com.global.settings";
/*      */   public static final String ACTION_SETTINGS_CREDENTIALDIALOG = "com.global.settings.CredentialDialog";
/*      */   public static final String ACTION_SETTINGS_CREDDLG2 = "global.settings.CREDDLG2";
/*      */   public static final String ACTION_SETTINGS_ETH8021X = "global.settings.eth8021x";
/*      */   public static final String ACTION_SETTINGS_ETH8021XSETTINGS = "com.global.settings.Eth8021xSettings";
/*      */   public static final String ACTION_SETTINGS_WIFI8021X = "global.settings.Wifi8021xSettings";
/*      */   public static final String ACTION_SETTINGS_WIFI8021XSETTINGS = "com.global.settings.Wifi8021xSettings";
/*      */   public static final String EXTRA_USBINTERFACE_ENABLE = "global.scancenter.extra.USBINTERFACE_ENABLE";
/*      */   public static final String EXTRA_USB_DEVICE_OFF = "global.scancenter.extra.USB_DEVICE_OFF";
/*      */   public static final String ACTION_SETTINGS_GET_ETHERNET_EAP = "global.scancenter.action.SETTINGS_GET_ETHERNET_EAP";
/*      */   public static final String ACTION_SETTINGS_GET_ETHERNET_EAP_RESULT = "global.scancenter.action.SETTINGS_GET_ETHERNET_EAP_RESULT";
/*      */   public static final String ACTION_SETTINGS_SET_ETHERNET_EAP = "global.scancenter.action.SETTINGS_SET_ETHERNET_EAP";
/*      */   public static final String ACTION_SETTINGS_SET_ETHERNET_EAP_RESULT = "global.scancenter.action.SETTINGS_SET_ETHERNET_EAP_RESULT";
/*      */   public static final String EXTRA_SETTINGS_EAP_RESULT = "global.scancenter.extra.SETTINGS_EAP_RESULT";
/*      */   public static final String EXTRA_SETTINGS_EAP_ENABLE = "global.scancenter.extra.SETTINGS_EAP_ENABLE";
/*      */   public static final String EXTRA_SETTINGS_EAP_AUTH_MODE = "global.scancenter.extra.SETTINGS_EAP_AUTH_MODE";
/*      */   public static final String EXTRA_SETTINGS_EAP_P2_AUTH_MODE = "global.scancenter.extra.SETTINGS_EAP_P2_AUTH_MODE";
/*      */   public static final String EXTRA_SETTINGS_EAP_CLIENT_CA_SELECTED = "global.scancenter.extra.SETTINGS_EAP_CLIENT_CA_SELECTED";
/*      */   public static final String EXTRA_SETTINGS_EAP_CLIENT_KEY_PWD = "global.scancenter.extra.SETTINGS_EAP_CLIENT_KEY_PWD";
/*      */   public static final String EXTRA_SETTINGS_EAP_ROOT_CA_SELECTED = "global.scancenter.extra.SETTINGS_EAP_ROOT_CA_SELECTED";
/*      */   public static final String EXTRA_SETTINGS_EAP_USER_NAME = "global.scancenter.extra.SETTINGS_EAP_USER_NAME";
/*      */   public static final String EXTRA_SETTINGS_EAP_PASSWORD = "global.scancenter.extra.SETTINGS_EAP_PASSWORD";
/*      */   public static final String ACTION_SETTINGS_GET_EAP_CERTIFICATE = "global.scancenter.action.SETTINGS_GET_EAP_CERTIFICATE";
/*      */   public static final String ACTION_SETTINGS_GET_EAP_CERTIFICATE_RESULT = "global.scancenter.action.SETTINGS_GET_EAP_CERTIFICATE_RESULT";
/*      */   public static final String EXTRA_SETTINGS_EAP_ROOT_CA_ARRAY = "global.scancenter.extra.SETTINGS_EAP_ROOT_CA_ARRAY";
/*      */   public static final String EXTRA_SETTINGS_EAP_CLIENT_CA_ARRAY = "global.scancenter.extra.SETTINGS_EAP_CLIENT_CA_ARRAY";
/*      */   public static final String ACTION_SYSTEM_ENABLE_FIPS = "avision.scancenter.action.SYSTEM_ENABLE_FIPS";
/*      */   public static final String EXTRA_SYSTEM_ENABLE_FIPS = "avision.scancenter.extra.SYSTEM_ENABLE_FIPS";
/* 1288 */   public static final String[] mTimeZoneTable = new String[] { "Pacific/Majuro", "Pacific/Midway", "Pacific/Honolulu", "America/Anchorage", "America/Los_Angeles", "America/Tijuana", "America/Phoenix", "America/Chihuahua", "America/Denver", "America/Costa_Rica", "America/Chicago", "America/Mexico_City", "America/Regina", "America/Bogota", "America/New_York", "America/Caracas", "America/Barbados", "America/Halifax", "America/Manaus", "America/Santiago", "America/St_Johns", "America/Sao_Paulo", "America/Argentina/Buenos_Aires", "America/Godthab", "America/Montevideo", "Atlantic/South_Georgia", "Atlantic/Azores", "Atlantic/Cape_Verde", "Africa/Casablanca", "Europe/London", "Europe/Amsterdam", "Europe/Belgrade", "Europe/Brussels", "Europe/Sarajevo", "Africa/Windhoek", "Africa/Brazzaville", "Asia/Amman", "Europe/Athens", "Asia/Beirut", "Africa/Cairo", "Europe/Helsinki", "Asia/Jerusalem", "Europe/Minsk", "Africa/Harare", "Asia/Baghdad", "Europe/Moscow", "Asia/Kuwait", "Africa/Nairobi", "Asia/Tehran", "Asia/Baku", "Asia/Tbilisi", "Asia/Yerevan", "Asia/Dubai", "Asia/Kabul", "Asia/Karachi", "Asia/Oral", "Asia/Yekaterinburg", "Asia/Calcutta", "Asia/Colombo", "Asia/Katmandu", "Asia/Almaty", "Asia/Rangoon", "Asia/Krasnoyarsk", "Asia/Bangkok", "Asia/Jakarta", "Asia/Shanghai", "Asia/Hong_Kong", "Asia/Irkutsk", "Asia/Kuala_Lumpur", "Australia/Perth", "Asia/Taipei", "Asia/Seoul", "Asia/Tokyo", "Asia/Yakutsk", "Australia/Adelaide", "Australia/Darwin", "Australia/Brisbane", "Australia/Hobart", "Australia/Sydney", "Asia/Vladivostok", "Pacific/Guam", "Asia/Magadan", "Pacific/Auckland", "Pacific/Fiji", "Pacific/Tongatapu", "Europe/Kaliningrad", "Europe/Samara", "Asia/Omsk", "Asia/Kamchatka" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int ack = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int data = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int json = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String checkCompatibility() {
/* 1315 */     return "AM7640";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String byteArrayToHex(byte[] byteArray) {
/* 1335 */     char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
/*      */ 
/*      */ 
/*      */     
/* 1339 */     char[] resultCharArray = new char[byteArray.length * 2];
/*      */ 
/*      */     
/* 1342 */     int index = 0;
/* 1343 */     for (byte b : byteArray) {
/*      */       
/* 1345 */       resultCharArray[index++] = hexDigits[b >>> 4 & 0xF];
/* 1346 */       resultCharArray[index++] = hexDigits[b & 0xF];
/*      */     } 
/*      */     
/* 1349 */     StringBuilder ret = new StringBuilder();
/* 1350 */     for (char c : resultCharArray) {
/* 1351 */       ret.append(String.format("%s", new Object[] { Character.valueOf(c) }));
/*      */     } 
/*      */     
/* 1354 */     return ret.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public static byte[] readImageToBuffer(File file) {
/* 1359 */     if (!file.exists()) {
/*      */       
/* 1361 */       Log.w(TAG, "readImageToBuffer file not exist !!");
/* 1362 */       return null;
/*      */     } 
/*      */     
/* 1365 */     FileInputStream fis = null;
/* 1366 */     byte[] buffer = null;
/*      */     
/*      */     try {
/* 1369 */       fis = new FileInputStream(file);
/* 1370 */       buffer = new byte[fis.available()];
/* 1371 */       fis.read(buffer);
/*      */       
/* 1373 */       Log.i(TAG, "readImage buff size:" + buffer.length);
/* 1374 */       return buffer;
/*      */     }
/* 1376 */     catch (Exception ex) {
/*      */       
/* 1378 */       ex.printStackTrace();
/* 1379 */       return null;
/*      */     }
/* 1381 */     catch (OutOfMemoryError e) {
/*      */       
/* 1383 */       e.printStackTrace();
/* 1384 */       return null;
/*      */     
/*      */     }
/*      */     finally {
/*      */       
/* 1389 */       if (fis != null) {
/*      */         
/*      */         try {
/*      */           
/* 1393 */           fis.close();
/* 1394 */           fis = null;
/*      */         }
/* 1396 */         catch (IOException e) {
/*      */           
/* 1398 */           e.printStackTrace();
/*      */         } 
/*      */       }
/*      */       
/* 1402 */       buffer = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static byte[] readImageToBuffer(File file, int offset, int length) {
/* 1409 */     FileInputStream fis = null;
/* 1410 */     byte[] buffer = null;
/*      */     
/*      */     try {
/* 1413 */       fis = new FileInputStream(file);
/* 1414 */       buffer = new byte[fis.available()];
/* 1415 */       Log.d("SCGlobal", "scg -- file: " + file.getName() + ", offset: " + offset + ", length: " + length + ", buffer: " + buffer.length);
/*      */       
/* 1417 */       fis.read(buffer, offset, length);
/*      */       
/* 1419 */       return buffer;
/*      */     }
/* 1421 */     catch (Exception e) {
/*      */       
/* 1423 */       e.printStackTrace();
/* 1424 */       return null;
/*      */     }
/* 1426 */     catch (OutOfMemoryError e) {
/*      */       
/* 1428 */       e.printStackTrace();
/* 1429 */       return null;
/*      */     
/*      */     }
/*      */     finally {
/*      */       
/* 1434 */       if (fis != null) {
/*      */         
/*      */         try {
/*      */           
/* 1438 */           fis.close();
/* 1439 */           fis = null;
/*      */         }
/* 1441 */         catch (IOException e) {
/*      */           
/* 1443 */           e.printStackTrace();
/*      */         } 
/*      */       }
/*      */       
/* 1447 */       buffer = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static byte[] retrieveRawFromTiff(File file) {
/* 1454 */     byte[] buffer = null;
/*      */     
/*      */     try {
/* 1457 */       if (!file.getName().contains(".tif")) {
/* 1458 */         return null;
/*      */       }
/* 1460 */       buffer = readImageToBuffer(file);
/*      */       
/* 1462 */       int offset = 8;
/*      */ 
/*      */ 
/*      */       
/* 1466 */       byte[] bytes = new byte[4];
/* 1467 */       for (int i = 0; i < 4; i++)
/*      */       {
/* 1469 */         bytes[i] = buffer[i + 4];
/*      */       }
/*      */       
/* 1472 */       Log.i(TAG, "IFD offset:" + bytes[0] + " " + bytes[1] + " " + bytes[2] + " " + bytes[3]);
/*      */       
/* 1474 */       int size = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getInt() - offset;
/*      */ 
/*      */ 
/*      */       
/* 1478 */       Log.i(TAG, "***** buffer.length:" + buffer.length + ", size:" + size);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1485 */       return Arrays.copyOfRange(buffer, offset, size + offset);
/*      */     }
/* 1487 */     catch (Exception ex) {
/*      */       
/* 1489 */       ex.printStackTrace();
/* 1490 */       return null;
/*      */     }
/* 1492 */     catch (OutOfMemoryError e) {
/*      */       
/* 1494 */       e.printStackTrace();
/* 1495 */       return null;
/*      */     
/*      */     }
/*      */     finally {
/*      */       
/* 1500 */       buffer = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean makeDirectory(String path) {
/* 1507 */     boolean ret = true;
/*      */     
/*      */     try {
/* 1510 */       File fileFolder = new File(path);
/*      */       
/* 1512 */       if (!fileFolder.exists())
/*      */       {
/* 1514 */         ret = fileFolder.mkdirs();
/* 1515 */         Log.i(TAG, "make dir:" + path + " / " + ret);
/*      */       }
/*      */     
/* 1518 */     } catch (Exception e) {
/*      */       
/* 1520 */       ret = false;
/* 1521 */       e.printStackTrace();
/*      */     } 
/* 1523 */     return ret;
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean cleanDirectory(File dir) {
/* 1528 */     makeDirectory(dir.getAbsolutePath());
/*      */     
/*      */     try {
/* 1531 */       for (File fi : dir.listFiles())
/*      */       {
/* 1533 */         fi.delete();
/*      */       }
/* 1535 */       return true;
/*      */     }
/* 1537 */     catch (Exception e) {
/*      */       
/* 1539 */       e.printStackTrace();
/* 1540 */       return false;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static void copyFile(InputStream in, OutputStream out) throws IOException {
/* 1546 */     byte[] buffer = new byte[1024];
/*      */     
/*      */     try {
/*      */       int read;
/*      */       
/* 1551 */       while ((read = in.read(buffer)) != -1)
/*      */       {
/* 1553 */         out.write(buffer, 0, read);
/*      */       }
/*      */     }
/*      */     finally {
/*      */       
/* 1558 */       buffer = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean copyFile(File sourceFile, File destFile) throws IOException {
/* 1566 */     if (!destFile.exists()) {
/*      */       
/* 1568 */       Log.i(TAG, "start copyFile");
/* 1569 */       destFile.createNewFile();
/* 1570 */       FileChannel source = null;
/* 1571 */       FileChannel destination = null;
/*      */ 
/*      */       
/*      */       try {
/* 1575 */         source = (new FileInputStream(sourceFile)).getChannel();
/* 1576 */         destination = (new FileOutputStream(destFile, false)).getChannel();
/* 1577 */         destination.transferFrom(source, 0L, source.size());
/* 1578 */       } catch (Exception e) {
/* 1579 */         Log.i(TAG, "e : " + e);
/*      */       }
/*      */       finally {
/*      */         
/* 1583 */         if (source != null)
/* 1584 */           source.close(); 
/* 1585 */         if (destination != null) {
/* 1586 */           destination.close();
/*      */         }
/*      */       } 
/* 1589 */       Log.i(TAG, "end copyFile");
/* 1590 */       return true;
/*      */     } 
/*      */ 
/*      */     
/* 1594 */     Log.w(TAG, "copy file exist!!");
/*      */     
/* 1596 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean copyFile(File sourceFile, File destFile, boolean overwrite) throws IOException {
/* 1602 */     if (destFile.exists() && !overwrite) {
/*      */       
/* 1604 */       Log.w(TAG, "copy file exist!!");
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1609 */       Log.i(TAG, "start copyFile");
/*      */       
/* 1611 */       if (destFile.exists()) {
/*      */         
/* 1613 */         destFile.delete();
/* 1614 */         Log.i(TAG, "delete dest file !!");
/*      */       } 
/*      */       
/* 1617 */       destFile.createNewFile();
/* 1618 */       FileChannel source = null;
/* 1619 */       FileChannel destination = null;
/*      */ 
/*      */       
/*      */       try {
/* 1623 */         source = (new FileInputStream(sourceFile)).getChannel();
/* 1624 */         destination = (new FileOutputStream(destFile, false)).getChannel();
/* 1625 */         destination.transferFrom(source, 0L, source.size());
/*      */       }
/*      */       finally {
/*      */         
/* 1629 */         if (source != null)
/* 1630 */           source.close(); 
/* 1631 */         if (destination != null) {
/* 1632 */           destination.close();
/*      */         }
/*      */       } 
/* 1635 */       Log.i(TAG, "end copyFile");
/* 1636 */       return true;
/*      */     } 
/* 1638 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public static void startLogcatThread(String name, final int interval) {
/* 1643 */     final String filename = name;
/*      */     
/* 1645 */     (new Thread(new Runnable()
/*      */         {
/*      */ 
/*      */           
/*      */           public void run()
/*      */           {
/* 1651 */             Log.i(SCGlobal.TAG, "startLogcatThread");
/*      */ 
/*      */             
/*      */             while (true) {
/*      */               try {
/* 1656 */                 SCGlobal.saveLog2File(SCGlobal.PATH_WEBPAGE, filename, false);
/*      */               }
/* 1658 */               catch (IOException e) {
/*      */                 
/* 1660 */                 e.printStackTrace();
/*      */               } 
/*      */ 
/*      */               
/*      */               try {
/* 1665 */                 Thread.sleep(interval);
/*      */               }
/* 1667 */               catch (InterruptedException e) {
/*      */                 
/* 1669 */                 e.printStackTrace();
/*      */               } 
/*      */             } 
/*      */           }
/* 1673 */         })).start();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @SuppressLint({"SimpleDateFormat"})
/*      */   public static boolean saveLog2File(String path, String name, boolean appendDataTime) throws IOException {
/*      */     boolean ret;
/* 1681 */     makeDirectory(path);
/*      */ 
/*      */ 
/*      */     
/* 1685 */     Process process = (new ProcessBuilder(new String[0])).command(new String[] { "logcat", "-t", "65536", "-v", "time" }).redirectErrorStream(true).start();
/*      */ 
/*      */     
/* 1688 */     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
/*      */     
/* 1690 */     StringBuilder log = new StringBuilder();
/*      */     String line;
/* 1692 */     while ((line = bufferedReader.readLine()) != null) {
/*      */       
/* 1694 */       log.append(line);
/* 1695 */       log.append(System.getProperty("line.separator"));
/*      */     } 
/*      */     
/* 1698 */     BufferedWriter writer = null;
/*      */     
/*      */     try {
/* 1701 */       File logFile = null;
/* 1702 */       if (appendDataTime) {
/*      */         
/* 1704 */         SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
/* 1705 */         logFile = new File(path, "logcat_" + name + "_" + sdf.format(new Date()) + ".txt");
/*      */       }
/*      */       else {
/*      */         
/* 1709 */         logFile = new File(path, "logcat_" + name + ".txt");
/*      */       } 
/* 1711 */       writer = new BufferedWriter(new FileWriter(logFile));
/* 1712 */       writer.write(log.toString());
/* 1713 */       ret = true;
/*      */     }
/* 1715 */     catch (IOException e) {
/*      */       
/* 1717 */       e.printStackTrace();
/* 1718 */       ret = false;
/*      */     } finally {
/*      */ 
/*      */       
/*      */       try {
/*      */         
/* 1724 */         if (writer != null) {
/* 1725 */           writer.close();
/*      */         }
/* 1727 */       } catch (IOException e) {
/*      */         
/* 1729 */         e.printStackTrace();
/*      */       } 
/*      */     } 
/*      */     
/* 1733 */     return ret;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String encryptCode(String code) {
/* 1738 */     if (code != null && !code.equals(""))
/*      */     {
/* 1740 */       return Base64.encodeToString(Base64.encode(code.getBytes(), 0), 0);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1745 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String decryptCode(String code) {
/* 1751 */     if (code != null && !code.equals("")) {
/* 1752 */       return new String(Base64.decode(Base64.decode(code, 0), 0));
/*      */     }
/* 1754 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static byte[] decryptCodetobyte(String code) {
/* 1759 */     if (code != null && !code.equals("")) {
/* 1760 */       return Base64.decode(code, 0);
/*      */     }
/* 1762 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String strArrayJoiner(String[] arr, String separator) {
/* 1767 */     StringBuilder retVal = new StringBuilder();
/* 1768 */     for (int i = 0; i < arr.length; i++) {
/*      */       
/* 1770 */       if (i < arr.length - 1) {
/*      */         
/* 1772 */         retVal.append(arr[i]).append(separator);
/*      */       }
/*      */       else {
/*      */         
/* 1776 */         retVal.append(arr[i]);
/*      */       } 
/*      */     } 
/* 1779 */     return retVal.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getIpAddress() {
/*      */     try {
/* 1786 */       Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
/* 1787 */       while (en.hasMoreElements()) {
/*      */         
/* 1789 */         NetworkInterface intf = en.nextElement();
/* 1790 */         Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses();
/* 1791 */         while (enumIpAddr.hasMoreElements()) {
/*      */           
/* 1793 */           InetAddress inetAddress = enumIpAddr.nextElement();
/* 1794 */           if (!inetAddress.isLoopbackAddress() && inetAddress instanceof java.net.Inet4Address)
/*      */           {
/* 1796 */             String ipAddress = inetAddress.getHostAddress().toString();
/* 1797 */             Log.e("IP address", "" + ipAddress);
/* 1798 */             return ipAddress;
/*      */           }
/*      */         
/*      */         } 
/*      */       } 
/* 1803 */     } catch (SocketException ex) {
/*      */       
/* 1805 */       Log.e("Socket exception in GetIP Address of Utilities", ex.toString());
/*      */     }
/* 1807 */     catch (NullPointerException e) {
/*      */       
/* 1809 */       e.printStackTrace();
/*      */     } 
/* 1811 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getEthernetMacAddress() {
/* 1816 */     StringBuilder mac = new StringBuilder();
/* 1817 */     NetworkInterface NIC = null;
/*      */     
/*      */     try {
/* 1820 */       NIC = NetworkInterface.getByName("eth0");
/* 1821 */       if (NIC != null)
/*      */       {
/* 1823 */         byte[] buf = NIC.getHardwareAddress();
/* 1824 */         for (int i = 0; i < buf.length; i += 2) {
/*      */           
/* 1826 */           byte[] tmp = new byte[2];
/* 1827 */           tmp[0] = buf[i];
/* 1828 */           tmp[1] = buf[i + 1];
/* 1829 */           String str = bytesToHex(tmp);
/* 1830 */           mac.append(str.substring(0, 2)).append(":").append(str.substring(2, 4)).append(":");
/*      */         } 
/* 1832 */         if (mac.lastIndexOf(":") == mac.length() - 1)
/* 1833 */           mac = new StringBuilder(mac.substring(0, mac.length() - 1)); 
/* 1834 */         Log.i(TAG, "get MAC:" + mac);
/*      */         
/* 1836 */         return mac.toString();
/*      */       }
/*      */     
/* 1839 */     } catch (SocketException e) {
/*      */       
/* 1841 */       e.printStackTrace();
/*      */     }
/* 1843 */     catch (NullPointerException e) {
/*      */       
/* 1845 */       e.printStackTrace();
/*      */     } 
/*      */     
/* 1848 */     return mac.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getWiredIpAddress() {
/*      */     try {
/* 1855 */       NetworkInterface intf = NetworkInterface.getByName("eth0");
/* 1856 */       if (intf != null) {
/*      */         
/* 1858 */         Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses();
/* 1859 */         while (enumIpAddr.hasMoreElements())
/*      */         {
/* 1861 */           InetAddress inetAddress = enumIpAddr.nextElement();
/* 1862 */           if (!inetAddress.isLoopbackAddress() && inetAddress instanceof java.net.Inet4Address)
/*      */           {
/* 1864 */             return inetAddress.getHostAddress().toString();
/*      */           }
/*      */         }
/*      */       
/*      */       } 
/* 1869 */     } catch (SocketException ex) {
/*      */       
/* 1871 */       Log.e("Socket exception in Get Wired IP Address of Utilities", ex.toString());
/*      */     }
/* 1873 */     catch (NullPointerException e) {
/*      */       
/* 1875 */       e.printStackTrace();
/*      */     } 
/* 1877 */     return "";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getWirelessIpAddress() {
/*      */     try {
/* 1884 */       NetworkInterface intf = NetworkInterface.getByName("wlan0");
/* 1885 */       if (intf != null) {
/*      */         
/* 1887 */         Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses();
/* 1888 */         while (enumIpAddr.hasMoreElements())
/*      */         {
/* 1890 */           InetAddress inetAddress = enumIpAddr.nextElement();
/* 1891 */           if (!inetAddress.isLoopbackAddress() && inetAddress instanceof java.net.Inet4Address)
/*      */           {
/* 1893 */             return inetAddress.getHostAddress().toString();
/*      */           }
/*      */         }
/*      */       
/*      */       } 
/* 1898 */     } catch (SocketException ex) {
/*      */       
/* 1900 */       Log.e("Socket exception in Get Wireless IP Address of Utilities", ex.toString());
/*      */     }
/* 1902 */     catch (NullPointerException e) {
/*      */       
/* 1904 */       e.printStackTrace();
/*      */     } 
/* 1906 */     return "";
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getWirelessMacAddress(Context context) {
/* 1911 */     String wifiMac = "";
/* 1912 */     WifiManager wifiManager = (WifiManager)context.getSystemService("wifi");
/* 1913 */     if (wifiManager.isWifiEnabled()) {
/*      */       
/* 1915 */       WifiInfo wifiInfo = wifiManager.getConnectionInfo();
/* 1916 */       if (wifiInfo != null)
/*      */       {
/* 1918 */         wifiMac = wifiInfo.getMacAddress();
/* 1919 */         Log.i(TAG, "get wifi MAC:" + wifiMac);
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1924 */       boolean bRtn = wifiManager.setWifiEnabled(true);
/* 1925 */       if (bRtn) {
/*      */ 
/*      */         
/*      */         try {
/* 1929 */           Thread.sleep(1000L);
/*      */         }
/* 1931 */         catch (InterruptedException e) {
/*      */           
/* 1933 */           e.printStackTrace();
/*      */         } 
/* 1935 */         WifiInfo wifiInfo = wifiManager.getConnectionInfo();
/* 1936 */         if (wifiInfo != null) {
/*      */           
/* 1938 */           wifiMac = wifiInfo.getMacAddress();
/* 1939 */           Log.i(TAG, "get wifi MAC:" + wifiMac);
/*      */         } 
/* 1941 */         wifiManager.setWifiEnabled(false);
/*      */       } 
/*      */     } 
/*      */     
/* 1945 */     return wifiMac;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getWirelessConnectAp(Context context) {
/* 1950 */     WifiManager wifiManager = (WifiManager)context.getSystemService("wifi");
/* 1951 */     if (wifiManager.isWifiEnabled()) {
/*      */       
/* 1953 */       WifiInfo wifiInfo = wifiManager.getConnectionInfo();
/* 1954 */       if (wifiInfo != null)
/*      */       {
/* 1956 */         return wifiInfo.getSSID();
/*      */       }
/*      */     } 
/* 1959 */     return "";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String[] getWifiIpInfo(Context context) {
/* 1969 */     String[] addr = null;
/* 1970 */     WifiManager wifii = (WifiManager)context.getSystemService("wifi");
/* 1971 */     DhcpInfo dhcp = wifii.getDhcpInfo();
/*      */     
/* 1973 */     if (wifii.isWifiEnabled() && dhcp != null) {
/*      */       
/* 1975 */       addr = new String[5];
/* 1976 */       addr[0] = Formatter.formatIpAddress(dhcp.ipAddress);
/* 1977 */       addr[1] = Formatter.formatIpAddress(dhcp.netmask);
/* 1978 */       addr[2] = Formatter.formatIpAddress(dhcp.gateway);
/* 1979 */       addr[3] = Formatter.formatIpAddress(dhcp.dns1);
/* 1980 */       addr[4] = Formatter.formatIpAddress(dhcp.dns2);
/*      */     }
/*      */     else {
/*      */       
/* 1984 */       Log.w(TAG, "getDhcpInfo is failed!!");
/*      */     } 
/*      */     
/* 1987 */     return addr;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static float getJavaVMVersion() {
/* 1993 */     String sVMVersion = "";
/*      */     
/* 1995 */     float fVMVersion = 0.0F;
/*      */ 
/*      */     
/*      */     try {
/* 1999 */       sVMVersion = System.getProperty("java.vm.version");
/*      */       
/* 2001 */       Log.d(TAG, "sVMVersion= " + sVMVersion);
/*      */ 
/*      */       
/* 2004 */       sVMVersion = sVMVersion.substring(0, sVMVersion.lastIndexOf(".")) + sVMVersion.substring(sVMVersion.lastIndexOf(".") + 1);
/* 2005 */       fVMVersion = Float.parseFloat(sVMVersion);
/*      */       
/* 2007 */       Log.d(TAG, "fVMVersion= " + fVMVersion);
/*      */     }
/* 2009 */     catch (IndexOutOfBoundsException e) {
/*      */       
/* 2011 */       Log.e(TAG, "string get failure=> " + e.getMessage());
/*      */     }
/* 2013 */     catch (NumberFormatException e) {
/*      */       
/* 2015 */       Log.e(TAG, "float parse failure=> " + e.getMessage());
/*      */     } 
/*      */     
/* 2018 */     return fVMVersion;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ArrayList<String> getDnsIpAddr() {
/* 2031 */     Class<?> SystemProperties = null;
/*      */     
/*      */     try {
/* 2034 */       SystemProperties = Class.forName("android.os.SystemProperties");
/*      */     }
/* 2036 */     catch (ClassNotFoundException e) {
/*      */ 
/*      */       
/* 2039 */       e.printStackTrace();
/*      */     } 
/* 2041 */     Method method = null;
/*      */     
/*      */     try {
/* 2044 */       method = SystemProperties.getMethod("get", new Class[] { String.class });
/*      */     }
/* 2046 */     catch (NoSuchMethodException e) {
/*      */ 
/*      */       
/* 2049 */       e.printStackTrace();
/*      */     } 
/* 2051 */     ArrayList<String> servers = new ArrayList<String>();
/* 2052 */     for (String name : new String[] { "net.dns1", "net.dns2", "net.dns3", "net.dns4" }) {
/*      */       
/* 2054 */       String value = null;
/*      */       
/*      */       try {
/* 2057 */         value = (String)method.invoke(null, new Object[] { name });
/*      */       }
/* 2059 */       catch (IllegalArgumentException e) {
/*      */ 
/*      */         
/* 2062 */         e.printStackTrace();
/*      */       }
/* 2064 */       catch (IllegalAccessException e) {
/*      */ 
/*      */         
/* 2067 */         e.printStackTrace();
/*      */       }
/* 2069 */       catch (InvocationTargetException e) {
/*      */ 
/*      */         
/* 2072 */         e.printStackTrace();
/*      */       } 
/* 2074 */       if (value != null && !"".equals(value) && !servers.contains(value))
/* 2075 */         servers.add(value); 
/*      */     } 
/* 2077 */     return servers;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void showDebugLog(Context context, String msg) {
/* 2083 */     Intent i = new Intent("global.scancenter.action.SEND_DEBUG_MESSAGE");
/* 2084 */     i.putExtra("global.scancenter.extra.DEBUG_MESSAGE", msg);
/* 2085 */     context.sendBroadcast(i);
/*      */   }
/*      */ 
/*      */   
/*      */   public static long getAvailableSize() {
/* 2090 */     long RESERVED = 209715200L;
/* 2091 */     String path = Environment.getDataDirectory().getPath();
/* 2092 */     Log.i(TAG, "path: " + path);
/* 2093 */     File directory = new File(path);
/* 2094 */     if (!directory.exists()) {
/*      */       
/* 2096 */       Log.i(TAG, "folder is not exist");
/* 2097 */       return 0L;
/*      */     } 
/*      */     
/* 2100 */     StatFs statFs = new StatFs(path);
/* 2101 */     int blockSize = statFs.getBlockSize();
/* 2102 */     int availableBlocks = statFs.getAvailableBlocks();
/* 2103 */     long lAvailableSize = (availableBlocks * blockSize) - RESERVED;
/*      */     
/* 2105 */     if (lAvailableSize < 1024L) {
/*      */       
/* 2107 */       Log.w(TAG, "lImageBufferAvailableSize < 1024 byte");
/* 2108 */       lAvailableSize = 0L;
/*      */     }
/*      */     else {
/*      */       
/* 2112 */       Log.i(TAG, "available size:" + lAvailableSize);
/*      */     } 
/*      */     
/* 2115 */     return lAvailableSize;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String readTextFromFile(String fileName) {
/* 2120 */     StringBuilder outputText = new StringBuilder();
/* 2121 */     String line = "";
/*      */     
/*      */     try {
/* 2124 */       FileReader fileReader = new FileReader(fileName);
/* 2125 */       BufferedReader bufferedReader = new BufferedReader(fileReader);
/*      */       
/* 2127 */       while ((line = bufferedReader.readLine()) != null) {
/* 2128 */         outputText.append(line);
/*      */       }
/* 2130 */       Log.i(TAG, "readTextFromFile: " + outputText);
/* 2131 */       bufferedReader.close();
/*      */     }
/* 2133 */     catch (FileNotFoundException ex) {
/*      */       
/* 2135 */       ex.printStackTrace();
/*      */     }
/* 2137 */     catch (IOException ex) {
/*      */       
/* 2139 */       ex.printStackTrace();
/*      */     } 
/*      */     
/* 2142 */     return outputText.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public static int writeTextToFile(String fileName, String inputText, boolean delete, boolean append) {
/* 2147 */     if (delete) {
/*      */       
/* 2149 */       File f = new File(fileName);
/* 2150 */       if (f.exists()) f.delete();
/*      */     
/*      */     } 
/*      */     try {
/* 2154 */       FileWriter fileWriter = new FileWriter(fileName);
/* 2155 */       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
/* 2156 */       bufferedWriter.write(inputText);
/* 2157 */       bufferedWriter.close();
/*      */       
/* 2159 */       Log.i(TAG, "writeTextToFile OK");
/*      */       
/* 2161 */       return 0;
/*      */     }
/* 2163 */     catch (FileNotFoundException ex) {
/*      */       
/* 2165 */       ex.printStackTrace();
/* 2166 */       return -1;
/*      */     }
/* 2168 */     catch (IOException ex) {
/*      */       
/* 2170 */       ex.printStackTrace();
/* 2171 */       return -2;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static boolean zipFile(String sourcePath, String toLocation) {
/* 2176 */     int BUFFER = 2048;
/* 2177 */     boolean ret = false;
/* 2178 */     Log.i(TAG, "start zipFile");
/* 2179 */     Log.i(TAG, "src:" + sourcePath + ", dest:" + toLocation);
/* 2180 */     File sourceFile = new File(sourcePath);
/*      */     try {
/* 2182 */       BufferedInputStream origin = null;
/* 2183 */       FileOutputStream dest = new FileOutputStream(toLocation);
/* 2184 */       ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
/*      */       
/* 2186 */       if (sourceFile.isDirectory()) {
/* 2187 */         zipSubFolder(out, sourceFile, sourceFile.getParent().length());
/*      */       } else {
/* 2189 */         byte[] data = new byte[2048];
/* 2190 */         FileInputStream fi = new FileInputStream(sourcePath);
/* 2191 */         origin = new BufferedInputStream(fi, 2048);
/* 2192 */         ZipEntry entry = new ZipEntry(getLastPathComponent(sourcePath));
/* 2193 */         out.putNextEntry(entry);
/*      */         int count;
/* 2195 */         while ((count = origin.read(data, 0, 2048)) != -1) {
/* 2196 */           out.write(data, 0, count);
/*      */         }
/*      */       } 
/* 2199 */       out.close();
/* 2200 */       ret = true;
/* 2201 */     } catch (Exception e) {
/* 2202 */       e.printStackTrace();
/*      */     } 
/* 2204 */     Log.i(TAG, "end zipFile:" + ret);
/* 2205 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static void zipSubFolder(ZipOutputStream out, File folder, int basePathLength) throws IOException {
/* 2211 */     int BUFFER = 2048;
/*      */     
/* 2213 */     File[] fileList = folder.listFiles();
/* 2214 */     BufferedInputStream origin = null;
/* 2215 */     for (File file : fileList) {
/* 2216 */       if (file.isDirectory()) {
/* 2217 */         zipSubFolder(out, file, basePathLength);
/*      */       } else {
/* 2219 */         byte[] data = new byte[2048];
/* 2220 */         String unmodifiedFilePath = file.getPath();
/*      */         
/* 2222 */         String relativePath = unmodifiedFilePath.substring(basePathLength);
/* 2223 */         FileInputStream fi = new FileInputStream(unmodifiedFilePath);
/* 2224 */         origin = new BufferedInputStream(fi, 2048);
/* 2225 */         ZipEntry entry = new ZipEntry(relativePath);
/* 2226 */         out.putNextEntry(entry);
/*      */         int count;
/* 2228 */         while ((count = origin.read(data, 0, 2048)) != -1) {
/* 2229 */           out.write(data, 0, count);
/*      */         }
/* 2231 */         origin.close();
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static String getLastPathComponent(String filePath) {
/* 2243 */     String[] segments = filePath.split("/");
/* 2244 */     if (segments.length == 0)
/* 2245 */       return ""; 
/* 2246 */     String lastPathComponent = segments[segments.length - 1];
/* 2247 */     Log.i(TAG, "lastPathComponent:" + lastPathComponent);
/* 2248 */     return lastPathComponent;
/*      */   }
/*      */   
/* 2251 */   private static final char[] hexArray = "0123456789abcdef".toCharArray();
/*      */ 
/*      */   
/*      */   public static String bytesToHex(byte[] bytes) {
/* 2255 */     char[] hexChars = new char[bytes.length * 2];
/* 2256 */     for (int j = 0; j < bytes.length; j++) {
/*      */       
/* 2258 */       int v = bytes[j] & 0xFF;
/* 2259 */       hexChars[j * 2] = hexArray[v >>> 4];
/* 2260 */       hexChars[j * 2 + 1] = hexArray[v & 0xF];
/*      */     } 
/* 2262 */     return new String(hexChars);
/*      */   }
/*      */ 
/*      */   
/*      */   public static String bytesToString(byte[] bytes) {
/* 2267 */     StringBuilder str = new StringBuilder();
/* 2268 */     for (byte i : bytes) {
/* 2269 */       str.append(i).append(",");
/*      */     }
/* 2271 */     return str.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public static int cal2BytesToInt(byte[] src, int start, int len, ByteOrder order) {
/* 2276 */     int ret = 0;
/* 2277 */     if (src == null || start < 0 || src.length < start || src.length < start + len || len == 0) {
/* 2278 */       return 0;
/*      */     }
/* 2280 */     for (int i = 0; i < len; i++) {
/* 2281 */       if (order == ByteOrder.LITTLE_ENDIAN) {
/* 2282 */         ret += (src[start + i] & 0xFF) << 8 * i;
/*      */       } else {
/* 2284 */         ret += (src[start + i] & 0xFF) << 8 * (len - 1 - i);
/*      */       } 
/*      */     } 
/* 2287 */     return ret;
/*      */   }
/*      */   
/*      */   public static int byteToInt(byte[] data) {
/* 2291 */     int ret = 0;
/*      */     
/* 2293 */     if (data != null)
/* 2294 */       for (int i = 0; i < data.length; i++) {
/* 2295 */         ret = (int)(ret + (data[i] & 0xFF) * Math.pow(256.0D, i));
/*      */       } 
/* 2297 */     return ret;
/*      */   }
/*      */   
/* 2300 */   public static int logLevel = 4;
/* 2301 */   public static int iPacket = 0;
/*      */   public static void printDebugLog(String tag, int level, String str) {
/* 2303 */     if (level <= logLevel)
/* 2304 */       Log.d(tag, str); 
/*      */   }
/*      */   
/*      */   public static String additionalCodeing(int num) {
/* 2308 */     String ret = "";
/* 2309 */     if (num < 10) {
/* 2310 */       ret = "00" + num;
/* 2311 */     } else if (num < 100) {
/* 2312 */       ret = "0" + num;
/*      */     } else {
/* 2314 */       ret = String.valueOf(num);
/*      */     } 
/* 2316 */     return ret;
/*      */   }
/*      */   
/*      */   public static boolean savelog() {
/*      */     try {
/* 2321 */       saveLog2File(PATH_WEBPAGE, "test", false);
/* 2322 */     } catch (IOException e) {
/* 2323 */       e.printStackTrace();
/*      */     } 
/*      */ 
/*      */     
/* 2327 */     String log = "logcat_test.txt";
/* 2328 */     File f = new File(PATH_WEBPAGE + log);
/*      */ 
/*      */     
/* 2331 */     if (f.exists()) {
/*      */       try {
/* 2333 */         copyFile(f, new File(PATH_LOG_FILE + f.getName()), true);
/* 2334 */       } catch (IOException e) {
/* 2335 */         e.printStackTrace();
/*      */       } 
/*      */     }
/* 2338 */     File zipFile = new File(PATH_DOWNLOAD + "log.zip");
/* 2339 */     if (zipFile.exists()) {
/* 2340 */       printDebugLog(TAG, 2, "delete log zip file:" + zipFile.delete());
/*      */     } else {
/* 2342 */       printDebugLog(TAG, 2, "zip path:" + zipFile.getAbsolutePath());
/*      */     } 
/* 2344 */     boolean ret = zipFile(PATH_LOG_FILE, PATH_DOWNLOAD + "log.zip");
/*      */     
/* 2346 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean unZip(String srcPath) {
/* 2353 */     int BUFFER_SIZE = 4096;
/* 2354 */     BufferedOutputStream bufferedOutputStream = null;
/* 2355 */     FileInputStream fileInputStream = null;
/* 2356 */     ZipInputStream zipInputStream = null;
/*      */     
/*      */     try {
/* 2359 */       fileInputStream = new FileInputStream(srcPath);
/* 2360 */       zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));
/*      */       
/*      */       ZipEntry zipEntry;
/* 2363 */       while ((zipEntry = zipInputStream.getNextEntry()) != null) {
/*      */ 
/*      */         
/* 2366 */         String zipEntryName = zipEntry.getName();
/* 2367 */         String zipFile = PATH_WEBPAGE + zipEntryName;
/*      */ 
/*      */         
/* 2370 */         File file = new File(zipFile);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2375 */         if (zipEntry.isDirectory()) {
/*      */ 
/*      */           
/* 2378 */           file.mkdirs();
/*      */ 
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/* 2384 */         byte[] buffer = new byte[BUFFER_SIZE];
/* 2385 */         FileOutputStream fileOutputStream = new FileOutputStream(file, false);
/* 2386 */         bufferedOutputStream = new BufferedOutputStream(fileOutputStream, BUFFER_SIZE);
/*      */         
/*      */         int count;
/* 2389 */         while ((count = zipInputStream.read(buffer, 0, BUFFER_SIZE)) != -1)
/*      */         {
/* 2391 */           bufferedOutputStream.write(buffer, 0, count);
/*      */         }
/* 2393 */         bufferedOutputStream.flush();
/* 2394 */         bufferedOutputStream.close();
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2401 */       return true;
/*      */     }
/* 2403 */     catch (FileNotFoundException e) {
/*      */       
/* 2405 */       e.printStackTrace();
/* 2406 */       return false;
/*      */     }
/* 2408 */     catch (IOException e) {
/*      */       
/* 2410 */       e.printStackTrace();
/* 2411 */       return false;
/*      */     
/*      */     }
/*      */     finally {
/*      */       
/* 2416 */       if (bufferedOutputStream != null) {
/*      */         
/*      */         try {
/*      */           
/* 2420 */           bufferedOutputStream.close();
/*      */         }
/* 2422 */         catch (IOException e) {
/*      */           
/* 2424 */           e.printStackTrace();
/*      */         } 
/*      */       }
/*      */       
/* 2428 */       if (zipInputStream != null) {
/*      */         
/*      */         try {
/*      */           
/* 2432 */           zipInputStream.close();
/*      */         }
/* 2434 */         catch (IOException e) {
/*      */           
/* 2436 */           e.printStackTrace();
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static byte[] encryptDatabyHash(byte[] data, String type) {
/* 2445 */     byte[] ret = null;
/*      */     
/*      */     try {
/* 2448 */       if (data != null)
/*      */       
/*      */       { 
/* 2451 */         MessageDigest complete = MessageDigest.getInstance(type);
/* 2452 */         complete.update(data, 0, data.length);
/* 2453 */         ret = complete.digest(); }
/*      */       else
/*      */       
/* 2456 */       { Log.i(TAG, "data is null"); } 
/* 2457 */     } catch (Exception e) {
/* 2458 */       e.printStackTrace();
/*      */     } 
/*      */     
/* 2461 */     return ret;
/*      */   }
/*      */   
/*      */   public static String getCommonsVersion() {
/* 2465 */     return "1.2.0";
/*      */   }
/*      */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\SCGlobal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */