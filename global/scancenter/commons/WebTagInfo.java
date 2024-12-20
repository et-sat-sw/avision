/*      */ package global.scancenter.commons;
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
/*      */ public class WebTagInfo
/*      */ {
/*      */   public static final int WEBERR_RECEIVEJOBID = -99;
/*      */   public static final int WEBERR_INI = -1;
/*      */   public static final int WEBERR_OK = 0;
/*      */   public static final int WEBERR_SYSBUSY = 1;
/*      */   public static final int WEBERR_MAXLIMIT = 2;
/*      */   public static final int WEBERR_NODELMAIL = 3;
/*      */   public static final int WEBERR_NODELSCANOPTION = 4;
/*      */   public static final int WEBERR_INVALIDPARA = 5;
/*      */   public static final int WEBERR_FLASHFAIL = 6;
/*      */   public static final int WEBERR_UPLOADFAIL = 7;
/*      */   public static final int WEBERR_WIFICONNFAIL = 8;
/*      */   public static final int WEBERR_DUPLICATE_PROFILENAME = 9;
/*      */   public static final int WEBERR_DUPLICATE_ADDRNAME = 10;
/*      */   public static final int WEBERR_DUPLICATE_GROUPNAME = 11;
/*      */   public static final int WEBERR_DUPLICATE_ACCOUNTNAME = 12;
/*      */   public static final int WEBERR_LDAP_SEARCH_FAILED = 13;
/*      */   public static final int WEBERR_DUPLICATE_SHORTCUTNAME = 14;
/*      */   public static final int WEBERR_DUPLICATE_LDAPNAME = 15;
/*      */   public static final int WEBERR_MAXLIMIT_PROFILE = 16;
/*      */   public static final int WEBERR_MAXLIMIT_ADDR = 17;
/*      */   public static final int WEBERR_MAXLIMIT_GROUP = 18;
/*      */   public static final int WEBERR_MAXLIMIT_ACCOUNT = 19;
/*      */   public static final int WEBERR_MAXLIMIT_SHORTCUT = 20;
/*      */   public static final int WEBERR_MAXLIMIT_LDAP = 21;
/*      */   public static final int WEBERR_ITEM_NOT_EXIST = 22;
/*      */   public static final int WEBERR_UPDATE_SCANNER_FW_FAILED_1 = 23;
/*      */   public static final int WEBERR_UPDATE_SCANNER_FW_FAILED_2 = 24;
/*      */   public static final int WEBERR_UPDATE_SCANNER_FW_FAILED_3 = 25;
/*      */   public static final int WEBERR_UPDATE_SCANNER_FW_FAILED_5 = 26;
/*      */   public static final int WEBERR_UPDATE_SYSTEM_FW_FAILED_6 = 27;
/*      */   public static final int WEBERR_FW_VERIFICATION_CHECK_FAIL = 28;
/*      */   public static final int WEBERR_UPDATE_SYSTEM_FW_FAILED_8 = 29;
/*      */   public static final int WEBERR_UPDATE_SYSTEM_FW_FAILED_9 = 30;
/*      */   public static final int WEBERR_UPDATE_SYSTEM_FW_FAILED_10 = 31;
/*      */   public static final int WEBERR_FW_IS_INCOMPLETE = 32;
/*      */   public static final int WEBERR_FW_CHECKSUM_ERROR = 33;
/*      */   public static final int WEBERR_INVALID_FW = 34;
/*      */   public static final int WEBERR_UNABLE_TO_RECEIVE_DATA = 36;
/*      */   public static final int WEBERR_DATA_LENGTH_IS_INCORRECT = 37;
/*      */   public static final int WEBERR_DISPLAY_MESSAGE = 99;
/*      */   public static final int WEBERR_ASK_REBOOT = 999;
/*      */   public static final int DATA_INCORRECT = 401;
/*      */   public static final int WEBERR_FW_UPDATE_ERROR = 100200;
/*      */   public static final int WEBERR_WEB_PAGE_LOAD_ERROR = 100202;
/*      */   public static final int WEBERR_IMPORTED_FILE_ERROR = 102111;
/*      */   public static final int WEBERR_DATABASE_WRITE_FAIL = 111002;
/*      */   public static final int WEBERR_DATABASE_READ_FAIL = 111003;
/*      */   public static final int WEBERR_INVALID_CERTIFICATE_FILE = 111004;
/*      */   public static final int WEBERR_UPDATE_SUBMIT_FAIL = 113001;
/*      */   public static final int WEBERR_INVAILD_INPUT = 113002;
/*      */   public static final int WEBERR_FAIL_TO_ADD = 113003;
/*      */   public static final int WEBERR_FAIL_TO_DELETE = 113004;
/*      */   public static final int WEBERR_FAIL_TO_MODIFY = 113005;
/*      */   public static final int WEBERR_EXCEED_LIMATION = 113008;
/*      */   public static final int WEBERR_NAME_DUPLICATED = 113009;
/*      */   public static final int WEBERR_IMPORTED_FILE_ERROR1 = 114001;
/*      */   public static final int WEBERR_IMPORTED_FILE_ERROR2 = 114002;
/*      */   public static final int WEBERR_ACCOUNT_LOGIN_FAIL = 115001;
/*      */   public static final int WEBERR_FWUPDATE_FAIL = 49153;
/*      */   public static final int INFO_MACHINE_STATUS = 1001;
/*      */   public static final int INFO_HOST_NAME = 1002;
/*      */   public static final int INFO_WEB_VERSION = 1003;
/*      */   public static final int INFO_SERIAL_NUMBER = 1004;
/*      */   public static final int INFO_IP_ADDRESS = 1005;
/*      */   public static final int INFO_SYSTEM_FW_VERSION = 1006;
/*      */   public static final int INFO_MAC_ADDRESS = 1007;
/*      */   public static final int INFO_ENGINE_VERSION = 1008;
/*      */   public static final int INFO_TONER_REMAIN = 1009;
/*      */   public static final int INFO_FAXBOARD_VERSION = 1010;
/*      */   public static final int INFO_WIFI_MAC_ADDRESS = 1011;
/*      */   public static final int INFO_UI_FW_VERSION = 1012;
/*      */   public static final int INFO_WIFI_SSID = 1013;
/*      */   public static final int INFO_WIFI_IP_ADDRESS = 1014;
/*      */   public static final int INFO_MANUFACTURER = 1015;
/*      */   public static final int INFO_MODEL_NAME = 1016;
/*      */   public static final int INFO_TRAYCOUNT = 1017;
/*      */   public static final int INFO_TRAY_NUMBER = 1018;
/*      */   public static final int INFO_TRAY_STATUS = 1019;
/*      */   public static final int INFO_TRAY_PAPERSIZE = 1020;
/*      */   public static final int INFO_TRAY_MEDIA = 1021;
/*      */   public static final int INFO_SCANNER_VERSION = 1025;
/*      */   public static final int INFO_SYSTEM_LAUGUAGE = 1026;
/*      */   public static final int INFO_EXIST_ADF = 1027;
/*      */   public static final int LOGIN_USER_ROLE = 1101;
/*      */   public static final int LOGIN_STATUS = 1102;
/*      */   public static final int SERVICE_LOGINSTATUS = 1103;
/*      */   public static final int BILLING_FlatbedPageScan2Copy = 1201;
/*      */   public static final int BILLING_AdfPageScan2Copy = 1202;
/*      */   public static final int BILLING_LargePageCountFromCopy = 1203;
/*      */   public static final int BILLING_SmallPageCountFromCopy = 1204;
/*      */   public static final int BILLING_OverallLargePageCount = 1205;
/*      */   public static final int BILLING_OverallSmallPageCount = 1206;
/*      */   public static final int BILLING_OverallPageCount = 1207;
/*      */   public static final int BILLING_LargePageCountOfThisLot = 1208;
/*      */   public static final int BILLING_SmallPageCountOfThisLot = 1209;
/*      */   public static final int BILLING_PrintPageCountOfThisToner = 1210;
/*      */   public static final int BILLING_ScanPageCountFromFlatbed = 1211;
/*      */   public static final int BILLING_ScanPageCountFromAdf = 1212;
/*      */   public static final int BILLING_AdfPadCount = 1213;
/*      */   public static final int BILLING_ScannerModuleScanTime = 1214;
/*      */   public static final int BILLING_TotalPageCountOfthisLot = 1215;
/*      */   public static final int BILLING_FlatbedSmallPageScan2Copy = 1216;
/*      */   public static final int BILLING_FlatbedLargePageScan2Copy = 1217;
/*      */   public static final int BILLING_ADFSmallPageScan2Copy = 1218;
/*      */   public static final int BILLING_ADFLargePageScan2Copy = 1219;
/*      */   public static final int BILLING_SmallPageCntFromFlatbed = 1220;
/*      */   public static final int BILLING_LargePageCntFromFlatbed = 1221;
/*      */   public static final int BILLING_SmallPageCntFromADF = 1222;
/*      */   public static final int BILLING_LargePageCntFromADF = 1223;
/*      */   public static final int BILLING_SmallPageCntOfLotFlatbed = 1224;
/*      */   public static final int BILLING_LargePageCntOfLotFlatbed = 1225;
/*      */   public static final int BILLING_ScanPageCntOfLotFlatbed = 1226;
/*      */   public static final int BILLING_SmallPageCntOfLotADF = 1227;
/*      */   public static final int BILLING_LargePageCntOfLotADF = 1228;
/*      */   public static final int BILLING_ScanPageCntOfLotADF = 1229;
/*      */   public static final int BILLING_FaxLargePageCountSent = 1230;
/*      */   public static final int BILLING_FaxSmallPageCountSent = 1231;
/*      */   public static final int BILLING_FaxTotalPageCountSent = 1232;
/*      */   public static final int BILLING_FaxModuleErrorCount = 1233;
/*      */   public static final int BILLING_TonerSerialNumber = 1234;
/*      */   public static final int BILLING_EPSerialNumber = 1235;
/*      */   public static final int BILLING_FuserSerialNumber = 1236;
/*      */   public static final int BILLING_SysBootTime = 1237;
/*      */   public static final int BILLING_EpRemain = 1238;
/*      */   public static final int BILLING_FuserRemain = 1239;
/*      */   public static final int BILLING_ADFSimplexPageScan2Copy = 1240;
/*      */   public static final int BILLING_ADFDuplexPageScan2Copy = 1241;
/*      */   public static final int BILLING_ScanSimplexPageCountFromADF = 1242;
/*      */   public static final int BILLING_ScanDuplexPageCountFromADF = 1243;
/*      */   public static final int BILLING_TonerModel = 1244;
/*      */   public static final int BILLING_TonerLifeTime = 1245;
/*      */   public static final int BILLING_TonerPageRemain = 1246;
/*      */   public static final int BILLING_TonerPagePrinted = 1247;
/*      */   public static final int BILLING_EPModel = 1248;
/*      */   public static final int BILLING_EPLifeTime = 1249;
/*      */   public static final int BILLING_EPPageRemain = 1250;
/*      */   public static final int BILLING_EPPagePrinted = 1251;
/*      */   public static final int BILLING_DrumRemain = 1252;
/*      */   public static final int BILLING_DrumModel = 1253;
/*      */   public static final int BILLING_DrumLifeTime = 1254;
/*      */   public static final int BILLING_DrumPageRemain = 1255;
/*      */   public static final int BILLING_DrumPagePrinted = 1256;
/*      */   public static final int BILLING_DrumSerialNumber = 1257;
/*      */   public static final int ACCOUNT_OVER_QUOTA = 1301;
/*      */   public static final int ACCOUNT_MAX_LIMIT = 1302;
/*      */   public static final int ACCOUNT_TOTAL_COUNT = 1303;
/*      */   public static final int ACCOUNT_NAME_LIST = 1304;
/*      */   public static final int ACCOUNT_ROLE_LIST = 1305;
/*      */   public static final int ACCOUNT_ID_LIST = 1306;
/*      */   public static final int ACCOUNT_USER_NAME = 1308;
/*      */   public static final int ACCOUNT_PRINT_IMPRESSION = 1309;
/*      */   public static final int ACCOUNT_PRINT_USED = 1310;
/*      */   public static final int ACCOUNT_PRINT_REMAIN = 1311;
/*      */   public static final int ACCOUNT_COPY_IMPRESSION = 1312;
/*      */   public static final int ACCOUNT_COPY_USED = 1313;
/*      */   public static final int ACCOUNT_COPY_REMAIN = 1314;
/*      */   public static final int ACCOUNT_PASSWORD = 1315;
/*      */   public static final int ACCOUNT_PASSWORD2 = 1316;
/*      */   public static final int ACCOUNT_FAX_SENT = 1317;
/*      */   public static final int ACCOUNT_FAX_USED = 1318;
/*      */   public static final int ACCOUNT_FAX_REMAIN = 1319;
/*      */   public static final int ACCOUNT_AUTH_MODE = 1320;
/*      */   public static final int ACCOUNT_NEW_USER_ROLE = 1321;
/*      */   public static final int ACCOUNT_EDIT_USER_ROLE = 1322;
/*      */   public static final int SERVICE_PASSWORD = 1323;
/*      */   public static final int SERVICE_CHANGE_PASSWORD_PROMPT = 1324;
/*      */   public static final int ACCOUNT_ENABLE_RESET_QUOTA = 1325;
/*      */   public static final int ACCOUNT_RESET_QUOTA_DAY = 1326;
/*      */   public static final int JOBS_ACTIVEJOBLISTTOTAL = 1502;
/*      */   public static final int JOBS_ACTIVEJOBLIST_ID = 1503;
/*      */   public static final int JOBS_ACTIVEJOBLIST_TYPE = 1504;
/*      */   public static final int JOBS_ACTIVEJOBLIST_OWNER = 1505;
/*      */   public static final int JOBS_ACTIVEJOBLIST_NAME = 1506;
/*      */   public static final int JOBS_ACTIVEJOBLIST_STATUS = 1507;
/*      */   public static final int JOBS_CITEM = 1508;
/*      */   public static final int JOBS_AVAILABLE = 1512;
/*      */   public static final int JOBS_TOTALMEM = 1513;
/*      */   public static final int JOBS_AVAILABLEMEM = 1514;
/*      */   public static final int JOBS_SAVEDFOLDERLIST_ID = 1515;
/*      */   public static final int JOBS_SAVEDFOLDERTOTAL = 1516;
/*      */   public static final int JOBS_SAVEDFOLDERLIST_NAME = 1517;
/*      */   public static final int JOBS_SAVEDFOLDERNAME = 1518;
/*      */   public static final int JOBS_SAVEDJOBTOTAL = 1519;
/*      */   public static final int JOBS_SAVEDJOBLIST_ID = 1520;
/*      */   public static final int JOBS_SAVEDJOBLIST_SECURITY = 1521;
/*      */   public static final int JOBS_SAVEDJOBLIST_NAME = 1522;
/*      */   public static final int JOBS_SAVEDJOBLIST_PAPERSIZE = 1523;
/*      */   public static final int JOBS_SAVEDJOBLIST_PAGES = 1525;
/*      */   public static final int JOBS_SAVEDJOBSNAMELIST = 1526;
/*      */   public static final int JOBS_SAVEDFOLDERNAMELIST = 1527;
/*      */   public static final int JOBDETAIL_JOBTYPE = 1528;
/*      */   public static final int JOBDETAIL_TIME = 1529;
/*      */   public static final int JOBDETAIL_PAPERSIZE = 1530;
/*      */   public static final int JOBDETAIL_MEDIA = 1531;
/*      */   public static final int JOBDETAIL_PRINTTRAY = 1532;
/*      */   public static final int JOBDETAIL_TWOSIDE = 1533;
/*      */   public static final int JOBDETAIL_EMAILFIRSTADR = 1534;
/*      */   public static final int JOBDETAIL_EMAILCOUNT = 1535;
/*      */   public static final int JOBDETAIL_SCANDEST = 1536;
/*      */   public static final int JOBDETAIL_JOBINFOID = 1537;
/*      */   public static final int JOBS_CATALOGINDEX = 1538;
/*      */   public static final int JOBS_SCHEDULE_CLR_ENABLE = 1539;
/*      */   public static final int JOBS_FRMIMMEDACTIVENUM = 1509;
/*      */   public static final int JOBS_DELETE_SCHEDULE_CLR_DAYS = 1510;
/*      */   public static final int JOBS_IMMEDIATE_CLEANUP = 1511;
/*      */   public static final int EMAIL_DEF_SUBJECT = 2001;
/*      */   public static final int EMAIL_DEF_FROM = 2002;
/*      */   public static final int EMAIL_DEF_MESSAGE = 2003;
/*      */   public static final int EMAIL_DEF_REPLY = 2004;
/*      */   public static final int EMAIL_DEF_FILENAME = 2005;
/*      */   public static final int EMAIL_DEF_SEPARATION = 2006;
/*      */   public static final int EMAIL_DEF_COLOR = 2007;
/*      */   public static final int EMAIL_DEF_DUPLEX = 2008;
/*      */   public static final int EMAIL_DEF_FILEFORMAT = 2009;
/*      */   public static final int EMAIL_DEF_DENSITY = 2010;
/*      */   public static final int EMAIL_DEF_CONTRAST = 2011;
/*      */   public static final int EMAIL_DEF_RESOLUTION = 2012;
/*      */   public static final int EMAIL_DEF_QUALITY = 2013;
/*      */   public static final int EMAIL_DEF_PAPERSIZE = 2014;
/*      */   public static final int EMAIL_DEF_ORIENTATION = 2015;
/*      */   public static final int EMAIL_DEF_PREVIEW = 2016;
/*      */   public static final int FILING_DEF_PROTOCOL = 3001;
/*      */   public static final int FILING_DEF_URL = 3002;
/*      */   public static final int FILING_DEF_PORT = 3003;
/*      */   public static final int FILING_DEF_FILENAME = 3004;
/*      */   public static final int FILING_DEF_SUBFOLDER = 3005;
/*      */   public static final int FILING_DEF_PASSIVE = 3006;
/*      */   public static final int FILING_DEF_DUPLEX = 3007;
/*      */   public static final int FILING_DEF_FILEFORMAT = 3008;
/*      */   public static final int FILING_DEF_COLOR = 3009;
/*      */   public static final int FILING_DEF_DENSITY = 3010;
/*      */   public static final int FILING_DEF_SHARPNESS = 3011;
/*      */   public static final int FILING_DEF_CONTRAST = 3012;
/*      */   public static final int FILING_DEF_SATURATION = 3013;
/*      */   public static final int FILING_DEF_RESOLUTION = 3014;
/*      */   public static final int FILING_DEF_QUALITY = 3015;
/*      */   public static final int FILING_DEF_PAPERSIZE = 3016;
/*      */   public static final int FILING_DEF_ORIENTATION = 3017;
/*      */   public static final int FILING_DEF_PREVIEW = 3018;
/*      */   public static final int FILING_FOLDER_LIST_COUNTS = 4001;
/*      */   public static final int FILING_FOLDER_DISPLAY_TO_WEB = 4002;
/*      */   public static final int FILING_FOLDER_ERROR_MSG_NUMBER = 4003;
/*      */   public static final int FILING_FOLDER_MAX_SIZE = 4004;
/*      */   public static final int FILING_FOLDER_TYPE_LIST = 4005;
/*      */   public static final int FILING_FOLDER_NAME_LIST = 4006;
/*      */   public static final int FILING_FOLDER_ID_LIST = 4007;
/*      */   public static final int FILING_FOLDER_URL_LIST = 4008;
/*      */   public static final int FILING_FOLDER_PORT_LIST = 4009;
/*      */   public static final int FILING_FOLDER_COPY_ID = 4010;
/*      */   public static final int FILING_FOLDER_NAME = 4011;
/*      */   public static final int FILING_FOLDER_URL = 4012;
/*      */   public static final int FILING_FOLDER_PORT = 4013;
/*      */   public static final int FILING_FOLDER_LOGINNAME = 4014;
/*      */   public static final int FILING_FOLDER_PASSWORD = 4015;
/*      */   public static final int FILING_FOLDER_PASSWORD2 = 4016;
/*      */   public static final int FILING_FOLDER_PROTOCOL = 4017;
/*      */   public static final int FILING_FOLDER_COPY_ACTION = 4018;
/*      */   public static final int Filing_STFSMBv1 = 4114;
/*      */   public static final int Filing_STFSMBv2 = 4115;
/*      */   public static final int Filing_SecurityMode = 4116;
/*      */   public static final int EMAIL_ADDRESS_NAME_LIST = 5001;
/*      */   public static final int EMAIL_ADDRESS_MAIL_LIST = 5002;
/*      */   public static final int EMAIL_ADDRESS_ID_LIST = 5003;
/*      */   public static final int EMAIL_ADDRESS_DESCRIPT_LIST = 5004;
/*      */   public static final int EMAIL_ADDRESS_COUNTS = 5005;
/*      */   public static final int EMAIL_ADDRESS_NAME = 5006;
/*      */   public static final int EMAIL_ADDRESS_MAIL = 5007;
/*      */   public static final int EMAIL_ADDRESS_DESCRIPT = 5008;
/*      */   public static final int EMAIL_ADDRESS_FAXNUM = 5009;
/*      */   public static final int EMAIL_ADDRESS_FAXNUM_LIST = 5010;
/*      */   public static final int ADDRESS_BOOK_CHANGE = 5051;
/*      */   public static final int DYNMAPADDRBOOK_NAMES = 5052;
/*      */   public static final int DYNMAPADDRBOOK_VALUE = 5053;
/*      */   public static final int ADDRESS_BOOK_MAP_NAMEINDEX = 5054;
/*      */   public static final int ADDRESS_BOOK_MAP_MAILINDEX = 5055;
/*      */   public static final int ADDRESS_BOOK_MAP_FAXINDEX = 5056;
/*      */   public static final int EMAIL_GROUP_NAME_LIST = 5101;
/*      */   public static final int EMAIL_GROUP_ID_LIST = 5102;
/*      */   public static final int EMAIL_GROUP_DESCRIPT_LIST = 5103;
/*      */   public static final int EMAIL_GROUP_COUNTS = 5104;
/*      */   public static final int EMAIL_GROUP_MAILID_LIST = 5105;
/*      */   public static final int EMAIL_GROUP_NAME = 5106;
/*      */   public static final int EMAIL_GROUP_DESCRIPT = 5107;
/*      */   public static final int SHORTCUT_NAMELIST = 6001;
/*      */   public static final int SHORTCUT_TYPELIST = 6002;
/*      */   public static final int SHORTCUT_IDLIST = 6003;
/*      */   public static final int SHORTCUT_COUNTS = 6004;
/*      */   public static final int SHORTCUT_EMAIL_NAME = 6101;
/*      */   public static final int SHORTCUT_EMAIL_FROM = 6102;
/*      */   public static final int SHORTCUT_EMAIL_SUBJECT = 6103;
/*      */   public static final int SHORTCUT_EMAIL_DUPLEX = 6104;
/*      */   public static final int SHORTCUT_EMAIL_COLOR = 6105;
/*      */   public static final int SHORTCUT_EMAIL_MESSAGE = 6106;
/*      */   public static final int SHORTCUT_EMAIL_FILENAME = 6107;
/*      */   public static final int SHORTCUT_EMAIL_REPLYTO = 6108;
/*      */   public static final int SHORTCUT_EMAIL_SIGNATURE = 6109;
/*      */   public static final int SHORTCUT_EMAIL_SIGNATURETEXT = 6110;
/*      */   public static final int SHORTCUT_EMAIL_FILEFORMAT = 6111;
/*      */   public static final int SHORTCUT_EMAIL_SEPARATION = 6112;
/*      */   public static final int SHORTCUT_EMAIL_DENSITY = 6113;
/*      */   public static final int SHORTCUT_EMAIL_SHARPNESS = 6114;
/*      */   public static final int SHORTCUT_EMAIL_CONTRAST = 6115;
/*      */   public static final int SHORTCUT_EMAIL_SATURATION = 6116;
/*      */   public static final int SHORTCUT_EMAIL_RESOLUTION = 6117;
/*      */   public static final int SHORTCUT_EMAIL_QUALITY = 6118;
/*      */   public static final int SHORTCUT_EMAIL_PAPERSIZE = 6119;
/*      */   public static final int SHORTCUT_EMAIL_ORIENTATION = 6120;
/*      */   public static final int SHORTCUT_EMAIL_PREVIEW = 6121;
/*      */   public static final int SHORTCUT_EMAIL_TOM_IDLIST = 6122;
/*      */   public static final int SHORTCUT_EMAIL_TOG_IDLIST = 6123;
/*      */   public static final int SHORTCUT_EMAIL_CCM_IDLIST = 6124;
/*      */   public static final int SHORTCUT_EMAIL_CCG_IDLIST = 6125;
/*      */   public static final int SHORTCUT_EMAIL_BCCM_IDLIST = 6126;
/*      */   public static final int SHORTCUT_EMAIL_BCCG_IDLIST = 6127;
/*      */   public static final int SHORTCUT_FILING_NAME = 6201;
/*      */   public static final int SHORTCUT_FILING_PROTOCOL = 6202;
/*      */   public static final int SHORTCUT_FILING_URL = 6203;
/*      */   public static final int SHORTCUT_FILING_PORT = 6204;
/*      */   public static final int SHORTCUT_FILING_LOGINNAME = 6205;
/*      */   public static final int SHORTCUT_FILING_PASSWORD = 6206;
/*      */   public static final int SHORTCUT_FILING_FILENAME = 6207;
/*      */   public static final int SHORTCUT_FILING_SUBFOLDER = 6208;
/*      */   public static final int SHORTCUT_FILING_PASSIVE = 6209;
/*      */   public static final int SHORTCUT_FILING_DUPLEX = 6210;
/*      */   public static final int SHORTCUT_FILING_FILEFORMAT = 6211;
/*      */   public static final int SHORTCUT_FILING_COLOR = 6212;
/*      */   public static final int SHORTCUT_FILING_DENSITY = 6213;
/*      */   public static final int SHORTCUT_FILING_SHARPNESS = 6214;
/*      */   public static final int SHORTCUT_FILING_CONTRAST = 6215;
/*      */   public static final int SHORTCUT_FILING_SATURATION = 6216;
/*      */   public static final int SHORTCUT_FILING_RESOLUTION = 6217;
/*      */   public static final int SHORTCUT_FILING_QUALITY = 6218;
/*      */   public static final int SHORTCUT_FILING_PAPERSIZE = 6219;
/*      */   public static final int SHORTCUT_FILING_ORIENTATION = 6220;
/*      */   public static final int SHORTCUT_FILING_PREVIEW = 6221;
/*      */   public static final int STORAGE_FOLDER_TOTAL = 7001;
/*      */   public static final int STORAGE_FOLDER_ID_LIST = 7002;
/*      */   public static final int STORAGE_FOLDER_NAME_LIST = 7003;
/*      */   public static final int STORAGE_IMMEDIATE_CLEANUP = 7004;
/*      */   public static final int STORAGE_DELETE_TIME_DAYS = 7005;
/*      */   public static final int STORAGE_JOB_LIST_COUNT = 7006;
/*      */   public static final int STORAGE_JOB_LIST_TYPE = 7007;
/*      */   public static final int STORAGE_JOB_LIST_NAME = 7008;
/*      */   public static final int STORAGE_JOB_LIST_DATE = 7009;
/*      */   public static final int STORAGE_JOB_LIST_SIZE = 7010;
/*      */   public static final int STORAGE_FILE_LIST_COUNT = 7011;
/*      */   public static final int STORAGE_FILE_LIST_TYPE = 7012;
/*      */   public static final int STORAGE_FILE_LIST_NAME = 7013;
/*      */   public static final int STORAGE_FILE_LIST_DATE = 7014;
/*      */   public static final int STORAGE_FILE_LIST_SIZE = 7015;
/*      */   public static final int STORAGE_JOB_DELETE_ALL_NAME = 7016;
/*      */   public static final int STORAGE_SHOW_TEMP = 7017;
/*      */   public static final int STORAGE_SHOW_MBOX = 7018;
/*      */   public static final int STORAGE_DELETE_FOLDER_NAME_LIST = 7019;
/*      */   public static final int STORAGE_CURRENT_FOLDER_NAME = 7020;
/*      */   public static final int STORAGE_CURRENT_JOB_NAME = 7021;
/*      */   public static final int STORAGE_CURRENT_FILE_NAME = 7022;
/*      */   public static final int STORAGE_SCHEDULE_DELETE_ENABLED = 7023;
/*      */   public static final int STORAGE_FRMIMMEDNUM = 7025;
/*      */   public static final int STORAGE_REMAININGBUFFERSIZE = 7026;
/*      */   public static final int STORAGE_CHECKJOBDOWNLOADSTATUS = 7027;
/*      */   public static final int PRINT_SELECTED_PAPER_SIZE = 7101;
/*      */   public static final int PRINT_SELECTED_DUPLEX_MODE = 7102;
/*      */   public static final int SELECTED_SECURITY_COPY_ON_OFF = 7201;
/*      */   public static final int SECURITYCIFS_URL = 7202;
/*      */   public static final int SECURITYCIFS_PORT = 7203;
/*      */   public static final int SECURITYCIFS_LOGINNAME = 7204;
/*      */   public static final int SECURITYCIFS_PW = 7205;
/*      */   public static final int SECURITYCIFS_REPW = 7206;
/*      */   public static final int ADMINCENTER_URL = 7301;
/*      */   public static final int ADMINCENTER_ONOFF = 7302;
/*      */   public static final int CLOUDSERVER_URL = 7311;
/*      */   public static final int APLUSENABLE = 7502;
/*      */   public static final int ACCOUNTENABLE = 7503;
/*      */   public static final int FTPCIFSENABLE = 7504;
/*      */   public static final int FAXFUNENABLE = 7505;
/*      */   public static final int CLOUDPRINTENABLE = 7506;
/*      */   public static final int WEBPAGEHEADERPRINTENABLE = 7508;
/*      */   public static final int NORMALCOPYENABLE = 7509;
/*      */   public static final int COPYENABLE = 7510;
/*      */   public static final int EMAILENABLE = 7511;
/*      */   public static final int WEBPAGEHEADERSCANENABLE = 7512;
/*      */   public static final int IDCARDENABLE = 7513;
/*      */   public static final int WEBPAGESTORAGEJOBENABLE = 7514;
/*      */   public static final int WEBPAGEHEADERJOBENABLE = 7515;
/*      */   public static final int SCANMFPSTORAGEENABLE = 7516;
/*      */   public static final int SERVICE_COPY = 7601;
/*      */   public static final int SERVICE_STORAGECOPY = 7602;
/*      */   public static final int SERVICE_SCAN = 7603;
/*      */   public static final int SERVICE_RESAVEDJOB = 7604;
/*      */   public static final int SERVICE_IDCARD = 7605;
/*      */   public static final int SERVICE_EMAIL = 7606;
/*      */   public static final int SERVICE_CSA6 = 7607;
/*      */   public static final int SERVICE_DROPNTAKE = 7608;
/*      */   public static final int SERVICE_FAX = 7609;
/*      */   public static final int SERVICE_FAST_COPY = 7610;
/*      */   public static final int SERVICE_TICKET_COPY = 7611;
/*      */   public static final int SERVICE_CLOUDPRINT = 7612;
/*      */   public static final int SERVICE_NORMALCOPY = 7613;
/*      */   public static final int SERVICE_COPY_LOCK = 7614;
/*      */   public static final int SERVICE_STORAGECOPY_LOCK = 7615;
/*      */   public static final int SERVICE_SCAN_LOCK = 7616;
/*      */   public static final int SERVICE_RESAVEDJOB_LOCK = 7617;
/*      */   public static final int SERVICE_IDCARD_LOCK = 7618;
/*      */   public static final int SERVICE_EMAIL_LOCK = 7619;
/*      */   public static final int SERVICE_CSA6_LOCK = 7620;
/*      */   public static final int SERVICE_DROPNTAKE_LOCK = 7621;
/*      */   public static final int SERVICE_FAX_LOCK = 7622;
/*      */   public static final int SERVICE_FAST_COPY_LOCK = 7623;
/*      */   public static final int SERVICE_TICKET_COPY_LOCK = 7624;
/*      */   public static final int SERVICE_CLOUDPRINT_LOCK = 7625;
/*      */   public static final int SERVICE_NORMALCOPY_LOCK = 7626;
/*      */   public static final int SERVICE_PLUGIN = 7627;
/*      */   public static final int SERVICE_PLUGIN_LOCK = 7628;
/*      */   public static final int Clone_ENABLE_DEVICE_SET = 7701;
/*      */   public static final int Clone_ENABLE_SERVICE_SET = 7702;
/*      */   public static final int Clone_ENABLE_NETWORK_SET = 7703;
/*      */   public static final int Clone_ENABLE_REGISTRATION = 7704;
/*      */   public static final int Clone_ENABLE_TIMEOUT_SET = 7705;
/*      */   public static final int Clone_ENABLE_FTP_CIFS = 7706;
/*      */   public static final int Clone_ENABLE_ACCOUNT = 7707;
/*      */   public static final int WEBVIEW_URL = 7801;
/*      */   public static final int CATEGORY = 7804;
/*      */   public static final int FuserSN = 7901;
/*      */   public static final int GENERAL_POWER_SAVING = 8001;
/*      */   public static final int GENERAL_TIME = 8002;
/*      */   public static final int GENERAL_DATE = 8003;
/*      */   public static final int GENERAL_LANGUAGE = 8004;
/*      */   public static final int GENERAL_TIMEZONE = 8005;
/*      */   public static final int NETWORK_DHCP = 9001;
/*      */   public static final int NETWORK_IPADDRESS0 = 9002;
/*      */   public static final int NETWORK_IPADDRESS1 = 9003;
/*      */   public static final int NETWORK_IPADDRESS2 = 9004;
/*      */   public static final int NETWORK_IPADDRESS3 = 9005;
/*      */   public static final int NETWORK_SMADDRESS0 = 9006;
/*      */   public static final int NETWORK_SMADDRESS1 = 9007;
/*      */   public static final int NETWORK_SMADDRESS2 = 9008;
/*      */   public static final int NETWORK_SMADDRESS3 = 9009;
/*      */   public static final int NETWORK_GWADDRESS0 = 9010;
/*      */   public static final int NETWORK_GWADDRESS1 = 9011;
/*      */   public static final int NETWORK_GWADDRESS2 = 9012;
/*      */   public static final int NETWORK_GWADDRESS3 = 9013;
/*      */   public static final int NETWORK_DNSADDRESS0 = 9014;
/*      */   public static final int NETWORK_DNSADDRESS1 = 9015;
/*      */   public static final int NETWORK_DNSADDRESS2 = 9016;
/*      */   public static final int NETWORK_DNSADDRESS3 = 9017;
/*      */   public static final int NETWORK_DNS2ADDRESS0 = 9018;
/*      */   public static final int NETWORK_DNS2ADDRESS1 = 9019;
/*      */   public static final int NETWORK_DNS2ADDRESS2 = 9020;
/*      */   public static final int NETWORK_DNS2ADDRESS3 = 9021;
/*      */   public static final int NETWORK_WINSADDRESS0 = 9022;
/*      */   public static final int NETWORK_WINSADDRESS1 = 9023;
/*      */   public static final int NETWORK_WINSADDRESS2 = 9024;
/*      */   public static final int NETWORK_WINSADDRESS3 = 9025;
/*      */   public static final int NETWORK_WINS2ADDRESS0 = 9026;
/*      */   public static final int NETWORK_WINS2ADDRESS1 = 9027;
/*      */   public static final int NETWORK_WINS2ADDRESS2 = 9028;
/*      */   public static final int NETWORK_WINS2ADDRESS3 = 9029;
/*      */   public static final int NETWORK_WINS_DNS = 9030;
/*      */   public static final int NETWORK_ENABLED = 9031;
/*      */   public static final int NETWORK_DOMAIN_NAME = 9032;
/*      */   public static final int NETWORK_MAILSERVER_ADDRESS = 9101;
/*      */   public static final int NETWORK_SMTP_PORT = 9102;
/*      */   public static final int NETWORK_MAIL_AUTHENTICATION = 9103;
/*      */   public static final int NETWORK_MAIL_ENCRYPT = 9126;
/*      */   public static final int NETWORK_MAIL_LOGINNAME = 9104;
/*      */   public static final int NETWORK_MAIL_PASSWORD = 9105;
/*      */   public static final int IP_FILTER_ENABLE = 9106;
/*      */   public static final int IP_FILTER_MODE = 9107;
/*      */   public static final int IP_FILTER_STARTIP0 = 9108;
/*      */   public static final int IP_FILTER_ENDIP0 = 9109;
/*      */   public static final int IP_FILTER_STARTIP1 = 9110;
/*      */   public static final int IP_FILTER_ENDIP1 = 9111;
/*      */   public static final int IP_FILTER_STARTIP2 = 9112;
/*      */   public static final int IP_FILTER_ENDIP2 = 9113;
/*      */   public static final int IP_FILTER_STARTIP3 = 9114;
/*      */   public static final int IP_FILTER_ENDIP3 = 9115;
/*      */   public static final int MAC_FILTER_MACADDRESS0 = 9116;
/*      */   public static final int MAC_FILTER_MACADDRESS1 = 9117;
/*      */   public static final int MAC_FILTER_MACADDRESS2 = 9118;
/*      */   public static final int MAC_FILTER_MACADDRESS3 = 9119;
/*      */   public static final int MAC_FILTER_MACADDRESS4 = 9120;
/*      */   public static final int MAC_FILTER_MACADDRESS5 = 9121;
/*      */   public static final int MAC_FILTER_MACADDRESS6 = 9122;
/*      */   public static final int MAC_FILTER_MACADDRESS7 = 9123;
/*      */   public static final int MAC_FILTER_MACADDRESS8 = 9124;
/*      */   public static final int MAC_FILTER_MACADDRESS9 = 9125;
/*      */   public static final int TIME_ZONE = 9127;
/*      */   public static final int TIMEZONE_LIST_ID = 9128;
/*      */   public static final int TIMEZONE_LIST_GMT = 9129;
/*      */   public static final int CURRENT_TIME = 9130;
/*      */   public static final int NETWORK_EAP_ENABLE = 9141;
/*      */   public static final int NETWORK_EAP_AUTH_MODE = 9142;
/*      */   public static final int NETWORK_EAP_P2_AUTH_MODE = 9143;
/*      */   public static final int NETWORK_EAP_CLIENT_CA_SELECTED = 9144;
/*      */   public static final int NETWORK_EAP_CLIENT_KEY_PWD = 9145;
/*      */   public static final int NETWORK_EAP_ROOT_CA_SELECTED = 9146;
/*      */   public static final int NETWORK_EAP_USER_NAME = 9147;
/*      */   public static final int NETWORK_EAP_PASSWORD = 9148;
/*      */   public static final int NETWORK_EAP_ROOTCA_LIST = 9149;
/*      */   public static final int NETWORK_EAP_CLIENT_LIST = 9150;
/*      */   public static final int NETWORK_WIFI_EAP_ENABLE = 9161;
/*      */   public static final int NETWORK_WIFI_EAP_AUTH_MODE = 9162;
/*      */   public static final int NETWORK_WIFI_EAP_P2_AUTH_MODE = 9163;
/*      */   public static final int NETWORK_WIFI_EAP_CLIENT_CA_SELECTED = 9164;
/*      */   public static final int NETWORK_WIFI_EAP_CLIENT_KEY_PWD = 9165;
/*      */   public static final int NETWORK_WIFI_EAP_ROOT_CA_SELECTED = 9166;
/*      */   public static final int NETWORK_WIFI_EAP_USER_NAME = 9167;
/*      */   public static final int NETWORK_WIFI_EAP_PASSWORD = 9168;
/*      */   public static final int NETWORK_WIFI_EAP_ROOTCA_LIST = 9169;
/*      */   public static final int NETWORK_WIFI_EAP_CLIENT_LIST = 9170;
/*      */   public static final int Network_SMTP2Address = 9181;
/*      */   public static final int Network_Smtp2_Port = 9182;
/*      */   public static final int Network_SMTPTimeout = 9183;
/*      */   public static final int Network_SmtpReplayTo = 9184;
/*      */   public static final int Network_WiFiDHCP = 9501;
/*      */   public static final int Network_WiFiIP00 = 9502;
/*      */   public static final int Network_WiFiIP01 = 9503;
/*      */   public static final int Network_WiFiIP02 = 9504;
/*      */   public static final int Network_WiFiIP03 = 9505;
/*      */   public static final int Network_WiFiSM00 = 9506;
/*      */   public static final int Network_WiFiSM01 = 9507;
/*      */   public static final int Network_WiFiSM02 = 9508;
/*      */   public static final int Network_WiFiSM03 = 9509;
/*      */   public static final int Network_WiFiGW00 = 9510;
/*      */   public static final int Network_WiFiGW01 = 9511;
/*      */   public static final int Network_WiFiGW02 = 9512;
/*      */   public static final int Network_WiFiGW03 = 9513;
/*      */   public static final int Network_WiFiDnsUse = 9514;
/*      */   public static final int Network_WiFiDNS00 = 9515;
/*      */   public static final int Network_WiFiDNS01 = 9516;
/*      */   public static final int Network_WiFiDNS02 = 9517;
/*      */   public static final int Network_WiFiDNS03 = 9518;
/*      */   public static final int Network_WiFiDNS10 = 9519;
/*      */   public static final int Network_WiFiDNS11 = 9520;
/*      */   public static final int Network_WiFiDNS12 = 9521;
/*      */   public static final int Network_WiFiDNS13 = 9522;
/*      */   public static final int Network_WiFiWINS00 = 9523;
/*      */   public static final int Network_WiFiWINS01 = 9524;
/*      */   public static final int Network_WiFiWINS02 = 9525;
/*      */   public static final int Network_WiFiWINS03 = 9526;
/*      */   public static final int Network_WiFiWINS10 = 9527;
/*      */   public static final int Network_WiFiWINS11 = 9528;
/*      */   public static final int Network_WiFiWINS12 = 9529;
/*      */   public static final int Network_WiFiWINS13 = 9530;
/*      */   public static final int Network_WiFiDomainName = 9531;
/*      */   public static final int Network_WifiStatus = 9532;
/*      */   public static final int Network_DynWifiList_SSID = 9533;
/*      */   public static final int Network_DynWifiList_IsPwd = 9534;
/*      */   public static final int Network_DynWifiList_AuthMode = 9535;
/*      */   public static final int Network_DynWifiList_Channel = 9536;
/*      */   public static final int Network_DynWifiList_SignalStrength = 9537;
/*      */   public static final int Network_DynWifiList_Connected = 9538;
/*      */   public static final int Network_DynWifiList_Encryption = 9539;
/*      */   public static final int Network_DynWifiList_GetCounts = 9540;
/*      */   public static final int Network_SSID = 9551;
/*      */   public static final int Network_WifiPwd = 9552;
/*      */   public static final int Network_AuthMode = 9553;
/*      */   public static final int Network_Encryption = 9554;
/*      */   public static final int Network_Keyindex = 9555;
/*      */   public static final int HIDDENNETSWITCHPG = 9601;
/*      */   public static final int HTTPSEVERSW = 9602;
/*      */   public static final int HTTPSENABLE = 9603;
/*      */   public static final int SNMPAGENTSW = 9604;
/*      */   public static final int MOPRIAPRINTSW = 9605;
/*      */   public static final int LPRSW = 9606;
/*      */   public static final int RAWPRINTSW = 9607;
/*      */   public static final int GDIPRINTSW = 9608;
/*      */   public static final int RAWPORT = 9609;
/*      */   public static final int GDIPORT = 9610;
/*      */   public static final int IPPSW = 9611;
/*      */   public static final int LDAP_AUTH_URL = 12101;
/*      */   public static final int LDAP_AUTH_PORT = 12102;
/*      */   public static final int LDAP_AUTH_DOMAIN_1 = 12103;
/*      */   public static final int LDAP_AUTH_AUTHTYPE = 12104;
/*      */   public static final int LDAP_AUTH_CERT_NAME = 12105;
/*      */   public static final int LDAP_AUTH_SEARCH_ROOT = 12106;
/*      */   public static final int LDAP_AUTH_SEARCH_ATTRIBUTE = 12107;
/*      */   public static final int LDAP_AUTH_OBTAINE_MAIL = 12108;
/*      */   public static final int LDAP_AUTH_SEARCH_NAME = 12109;
/*      */   public static final int LDAP_AUTH_TIMEOUT = 12110;
/*      */   public static final int LDAP_AUTH_SettingLoginName = 12111;
/*      */   public static final int LDAP_AUTH_SettingPassword = 12112;
/*      */   public static final int LDAP_AUTH_SEARCH_AUTHTYPE = 12113;
/*      */   public static final int METERINFO_SCHEDULE = 12201;
/*      */   public static final int METERINFO_UPLOADDEST = 12202;
/*      */   public static final int METERINFO_JOBNAME = 12203;
/*      */   public static final int METERINFO_SERVERURL = 12204;
/*      */   public static final int METERINFO_SERVERPORT = 12205;
/*      */   public static final int METERINFO_SERVERLOGINNAME = 12206;
/*      */   public static final int METERINFO_SERVERPASSWORD = 12207;
/*      */   public static final int METERINFO_ENCRYPTTYPE = 12208;
/*      */   public static final int METERINFO_AUTHTYPE = 12209;
/*      */   public static final int METERINFO_MAILSUBJECT = 12210;
/*      */   public static final int METERINFO_MAILFROM = 12211;
/*      */   public static final int METERINFO_MAILTO = 12212;
/*      */   public static final int METERINFO_MAILCC = 12213;
/*      */   public static final int METERINFO_MAILBCC = 12214;
/*      */   public static final int METERINFO_MAILREPLYTO = 12215;
/*      */   public static final int METERINFO_MAILMSG = 12216;
/*      */   public static final int METERINFO_MAILTODISPNAME = 12217;
/*      */   public static final int METERINFO_HOSTNAME = 12218;
/*      */   public static final int SENDMETER_ENABLE = 12219;
/*      */   public static final int SENDMETER_ONOFF = 12220;
/*      */   public static final int Plugin_PluginSwitch = 12301;
/*      */   public static final int Plugin_UIPackageName = 12302;
/*      */   public static final int Plugin_EnableCustomUI = 12303;
/*      */   public static final int Plugin_PlugInProfile_Names = 12304;
/*      */   public static final int Plugin_PlugInProfile_PackageNames = 12305;
/*      */   public static final int Plugin_PlugInProfile_Seq = 12306;
/*      */   public static final int Plugin_PlugInProfile_GetCounts = 12307;
/*      */   public static final int Plugin_AppSeqID = 12308;
/*      */   public static final int Plugin_PlugInEnable = 12309;
/*      */   public static final int Ntp_NtpServer = 12401;
/*      */   public static final int SNMP_SNMPEnable = 12501;
/*      */   public static final int SNMP_snmpEnableV1V2 = 12502;
/*      */   public static final int SNMP_snmpCommunity = 12503;
/*      */   public static final int SNMP_snmpEnableV3 = 12504;
/*      */   public static final int SNMP_snmpUser = 12505;
/*      */   public static final int SNMP_snmpAuthType = 12506;
/*      */   public static final int SNMP_snmpAuthPwd = 12507;
/*      */   public static final int SNMP_snmpPrivType = 12508;
/*      */   public static final int SNMP_snmpPrivPwd = 12509;
/*      */   public static final int SNMP_snmpContextName = 12510;
/*      */   public static final int UsbInterfaceOnOff = 12610;
/*      */   public static final int UsbDeviceOnOff = 12611;
/*      */   public static final int SYSLOG_SYSLOGDISPLAY = 15501;
/*      */   public static final int SYSLOG_SYSLOGENABLE = 15502;
/*      */   public static final int SYSLOG_SYSLOGIP = 15503;
/*      */   public static final int SYSLOG_SYSLOGPORT = 15504;
/*      */   public static final int SYSLOG_SYSLOGMAXMSGPRIORITY = 15505;
/*      */   public static final int WEBRD = 0;
/*      */   public static final int WEBWR = 1;
/*      */   public static final int WEBDEL = 2;
/*      */   public static final int WEBEXPORT = 3;
/*      */   public static final int WEBIMPORT = 4;
/*      */   public static final String WEBSTRING_OK = "OK";
/*      */   public static final String WEBSTRING_FILEISEXIST = "FILEISNOTEXIST";
/*      */   public static final String WEBSTRING_BUFFERFULL = "BUFFERFULL";
/*  795 */   public static String[] actionNames = new String[] { "LOGIN", "GeneralSubmit", "NetworkSubmit", "EmailDefaultSubmit", "FilingDefaultSubmit", "FilingProfileEdit", "FilingProfileDel", "NewFolderSubmit", "EditFolderSubmit", "FilingProfileCopy", "FTPTEST", "CIFSTEST", "CreateNewFolder", "DeleteCustomFolder", "AllFolderAllJobsDelete", "ScheduleDelJobs", "SingleFolderDelAllJobs", "JobOPEN", "JobDELETE", "FileDELETE", "ShowCustomFolderFile", "BackToPublic", "RefreshJobList", "SingleJobDelAllFiles", "BackToJobList", "RefreshFileList", "SetAccountMode", "SetOverQuota", "AccountProfileEdit", "AccountProfileDel", "NewAccount", "ApplyEdit", "ResetAllLimit", "ResetPrintLimit", "ResetCopyLimit", "ResetFaxLimit", "ApplyMyAccount", "EnterMyAccount", "SetHostName", "TcpIpSubmit", "SmtpApply", "SMTPTEST", "EmailAddressEdit", "EmailAddressDel", "EmailAddressNew", "EmailAddressApply", "EmailGroupEdit", "EmailGroupDel", "EmailGroupNew", "EmailGroupApply", "ShortcutProfileEdit", "ShortcutProfileDel", "ShortcutProfileNew", "ShortcutProfileApply", "PublicFolderDel", "PublicFolderDeleteAll", "PublicFolderSerachPin", "SetSecurityCopy", "DeleteActiveJob", "ChangeCataLog", "AllActiveJobsDelete", "ScheduleDelActiveJobs", "CreateNewSavedFolder", "DeleteSavedFolder", "ShowSavedFolderFile", "DeleteSavedJob", "RefreshSavedJobList", "GoToJobInfo", "SetAdminCenter", "SetWebviewURL", "ServiceEnableSubmit", "MapImportADR", "NetSecuritySetup", "REUSAGEDATA", "REDEFAULT", "TimeZoneApply", "GetUsageData", "Reset_Fuser_Count", "Service_Login", "SetServicePwd", "NetPtclSettingSubmit", "SetCloudServer", "AutoReboot", "AuthLDAPSettingSubmit", "SendMeterSchedule", "SendMeterImmediate", "RemoveLDAPAuthCert", "InstallPackageSubmit", "UninstallPlugIn", "SetPlugIn", "NtpSubmit", "SnmpSetting", "USBcontrol", "WifiSubmit", "WifiScanAP", "SyslogSubmit", "ResetQuotaSet" };
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  818 */   public static int[] actionTypes = new int[] { 1, 1, 1, 1, 1, 0, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 0, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 0, 2, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  843 */   public static String[] actionNames2 = new String[] { "FileDOWNLOAD", "LogDOWNLOAD", "SubmitPrintJob", "EXPORT", "CLONING", "REPORT", "ScreenCap", "JobDOWNLOAD" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  852 */   public static int[] actionTypes2 = new int[] { 3, 3, 4, 3, 3, 3, 3, 3 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  862 */   public static String[] tagNames_Billing = new String[] { "FlatbedPageScan2Copy", "AdfPageScan2Copy", "LargePageCountFromCopy", "SmallPageCountFromCopy", "OverallLargePageCount", "OverallSmallPageCount", "OVerallPageCount", "LargePageCountOfThisLot", "SmallPageCountOfThisLot", "PrintPageCountOfThisToner", "ScanPageCountFromFlatbed", "ScanPageCountFromAdf", "AdfPadCount", "ScannerModuleScanTime", "TotalPageCountOfthisLot", "FlatbedSmallPageScan2Copy", "FlatbedLargePageScan2Copy", "ADFSmallPageScan2Copy", "ADFLargePageScan2Copy", "SmallPageCntFromFlatbed", "LargePageCntFromFlatbed", "SmallPageCntFromADF", "LargePageCntFromADF", "SmallPageCntOfLotFlatbed", "LargePageCntOfLotFlatbed", "ScanPageCntOfLotFlatbed", "SmallPageCntOfLotADF", "LargePageCntOfLotADF", "ScanPageCntOfLotADF", "FaxLargePageCountSent", "FaxSmallPageCountSent", "FaxTotalPageCountSent", "FaxModuleErrorCount", "TonerSerialNumber", "EPSerialNumber", "FuserSerialNumber", "DrumSerialNumber", "SysBootTime", "EpRemain", "FuserRemain", "DrumRemain", "ADFSimplexPageScan2Copy", "ADFDuplexPageScan2Copy", "ScanSimplexPageCountFromADF", "ScanDuplexPageCountFromADF", "TonerModel", "TonerLifeTime", "TonerPageRemain", "TonerPagePrinted", "EPModel", "EPLifeTime", "EPPageRemain", "EPPagePrinted", "DrumModel", "DrumLifeTime", "DrumPageRemain", "DrumPagePrinted" };
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
/*      */   
/*  881 */   public static int[] tagTypes_Billing = new int[] { 1201, 1202, 1203, 1204, 1205, 1206, 1207, 1208, 1209, 1210, 1211, 1212, 1213, 1214, 1215, 1216, 1217, 1218, 1219, 1220, 1221, 1222, 1223, 1224, 1225, 1226, 1227, 1228, 1229, 1230, 1231, 1232, 1233, 1234, 1235, 1236, 1257, 1237, 1238, 1239, 1252, 1240, 1241, 1242, 1243, 1244, 1245, 1246, 1247, 1248, 1249, 1250, 1251, 1253, 1254, 1255, 1256 };
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  904 */   public static String[] tagNames_Info = new String[] { "MachineStatus", "HostName", "WebpageVer", "SerialNumber", "IpAddr", "SystemVersion", "MacAdrs", "EngineVersion", "TonerRemain", "FaxBoardVersion", "WifiMacAdrs", "UiBoardFwVer", "WIFISSID", "WifiIpAddr", "Manufacturer", "DeviceModelName", "TrayCount", "Tray_Number", "Tray_Status", "Tray_PaperSize", "Tray_Media", "ScannerVersion", "SystemLanguage", "FuserSN", "ExistADF" };
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
/*  915 */   public static int[] tagTypes_Info = new int[] { 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010, 1011, 1012, 1013, 1014, 1015, 1016, 1017, 1018, 1019, 1020, 1021, 1025, 1026, 7901, 1027 };
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
/*  927 */   public static String[] tagNames_Login = new String[] { "UserRole", "bLogin", "Service_LoginStatus" };
/*      */   
/*  929 */   public static int[] tagTypes_Login = new int[] { 1101, 1102, 1103 };
/*      */   
/*  931 */   public static String[] tagNames_AddrBook = new String[] { "AddrBookChang", "DynMapAddrBook_Names", "DynMapAddrBook_Value", "MapAdrNameIndex", "MapAdrEmailIndex", "MapAdrFaxIndex" };
/*      */ 
/*      */ 
/*      */   
/*  935 */   public static int[] tagTypes_AddrBook = new int[] { 5051, 5052, 5053, 5054, 5055, 5056 };
/*      */ 
/*      */ 
/*      */   
/*  939 */   public static String[] tagNames_Account = new String[] { "AccountingMode", "AccountOverQuota", "MaxAccountTotal", "WebAccountTotalCnt", "Account_Name", "Account_Role", "Account_ID", "WebAccountUserName", "PrintedImpressions", "PrintedUsed", "PrintRemain", "CopiedImpressions", "CopiedUsed", "CopyRemain", "WebAccountPassword", "WebAccountReTypePassword", "FaxImagesSent", "FaxImagesUsed", "FaxImageRemain", "NewUserRole", "EditUserRole", "Service_Pw", "ServiceChangePwPrompt", "EnableResetQuota", "ResetQuotaDay" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  946 */   public static int[] tagTypes_Account = new int[] { 1320, 1301, 1302, 1303, 1304, 1305, 1306, 1308, 1309, 1310, 1311, 1312, 1313, 1314, 1315, 1316, 1317, 1318, 1319, 1321, 1322, 1323, 1324, 1325, 1326 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  953 */   public static String[] tagNames_EmailDef = new String[] { "DfEFrom", "DfESubject", "DfEDuplex", "DfEColor", "DfEMessage", "DfEAttName", "DfEReplyTo", "DfESignature", "DfESignatureText", "DfEAttFormat", "DfESeparation", "DfEDensity", "DfESharpness", "DfEContrast", "DfESaturation", "DfEResolution", "DfEQuality", "DfEPsize", "DfEOrientation", "DfEPreview" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  959 */   public static int[] tagTypes_EmailDef = new int[] { 2002, 2001, 2008, 2007, 2003, 2005, 2004, 0, 0, 2009, 2006, 2010, 0, 2011, 0, 2012, 2013, 2014, 2015, 2016 };
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
/*  972 */   public static String[] tagNames_FilingDef = new String[] { "DfFProtocol", "DfFUrl", "DfFPort", "DfFFileName", "DfFSubfolder", "DfFPassive", "DfFDuplex", "DfFAttFormat", "DfFColor", "DfFDensity", "DfFSharpness", "DfFContrast", "DfFSaturation", "DfFResolution", "DfFQuality", "DfFPsize", "DfFOrientation", "DfFPreview" };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  977 */   public static int[] tagTypes_FilingDef = new int[] { 3001, 3002, 3003, 3004, 3005, 3006, 3007, 3008, 3009, 3010, 0, 3012, 0, 3014, 3015, 3016, 3017, 3018 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  987 */   public static String[] tagNames_FilingFolder = new String[] { "ProfileListCount", "Display2Web", "ErrorMsgNum", "MaxScan2", "FilingFolderList_Type", "FilingFolderList_Name", "FilingFolderList_ID", "FilingFolderList_URL", "FilingFolderList_Port", "WebCopyID", "FilingName", "FilingUrl", "FilingPort", "FilingLoginName", "FilingLoginPwd", "FilingLoginRetypePwd", "frmProtocol", "COPY", "STFSMBv1", "STFSMBv2", "SecurityMode" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  995 */   public static int[] tagTypes_FilingFolder = new int[] { 4001, 4002, 4003, 4004, 4005, 4006, 4007, 4008, 4009, 4010, 4011, 4012, 4013, 4014, 4015, 4016, 4017, 4018, 4114, 4115, 4116 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1003 */   public static String[] tagNames_EmailAddr = new String[] { "AddrBookEmail_Names", "AddrBookEmail_Mail", "AddrBookEmail_Seq", "AddrBookEmail_Descs", "AddrBookEmail_GetCounts", "EmailName", "EmailAddress", "EmailDescription", "AddrBookEmail_FaxNum", "EmailFaxNum" };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1008 */   public static int[] tagTypes_EmailAddr = new int[] { 5001, 5002, 5003, 5004, 5005, 5006, 5007, 5008, 5010, 5009 };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1013 */   public static String[] tagNames_EmailGroup = new String[] { "AddrBookGroup_Names", "AddrBookGroup_Seq", "AddrBookGroup_Descs", "AddrBookGroup_GetCounts", "GroupName", "GroupDescription", "GroupSeq" };
/*      */ 
/*      */ 
/*      */   
/* 1017 */   public static int[] tagTypes_EmailGroup = new int[] { 5101, 5102, 5103, 5104, 5106, 5107, 5105 };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1022 */   public static String[] tagNames_Shortcut = new String[] { "Shortcut_Names", "Shortcut_Type", "Shortcut_Seq", "Shortcut_GetCounts" };
/*      */ 
/*      */   
/* 1025 */   public static int[] tagTypes_Shortcut = new int[] { 6001, 6002, 6003, 6004 };
/*      */ 
/*      */   
/* 1028 */   public static String[] tagNames_ShortcutEmail = new String[] { "SCEProfileName", "SCEFrom", "SCESubject", "SCEDuplex", "SCEColor", "SCEMessage", "SCEAttName", "SCEReplyTo", "SCESignature", "SCESignatureText", "SCEAttFormat", "SCESeparation", "SCEDensity", "SCESharpness", "SCEContrast", "SCESaturation", "SCEResolution", "SCEQuality", "SCEPsize", "SCEOrientation", "SCEPreview", "ToMSeq", "ToGSeq", "CcMSeq", "CcGSeq", "BccMSeq", "BccGSeq" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1035 */   public static int[] tagTypes_ShortcutEmail = new int[] { 6101, 6102, 6103, 6104, 6105, 6106, 6107, 6108, 6109, 6110, 6111, 6112, 6113, 0, 6115, 0, 6117, 6118, 6119, 6120, 6121, 6122, 6123, 6124, 6125, 6126, 6127 };
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
/* 1051 */   public static String[] tagNames_ShortcutFiling = new String[] { "SCFProfileName", "SCFProtocol", "SCFUrl", "SCFPort", "SCFLoginName", "SCFPassword", "SCFFileName", "SCFSubfolder", "SCFPassive", "SCFDuplex", "SCFAttFormat", "SCFColor", "SCFDensity", "SCFSharpness", "SCFContrast", "SCFSaturation", "SCFResolution", "SCFQuality", "SCFPsize", "SCFOrientation", "SCFPreview" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1057 */   public static int[] tagTypes_ShortcutFiling = new int[] { 6201, 6202, 6203, 6204, 6205, 6206, 6207, 6208, 6209, 6210, 6211, 6212, 6213, 0, 6215, 0, 6217, 6218, 6219, 6220, 6221 };
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
/* 1069 */   public static String[] tagNames_PublicFolder = new String[] { "ScanFolderTotal", "LocalScanFolderList_ID", "LocalScanFolderList_Name", "frmImmedNum", "DeleteTimeDays", "frmImmediate", "PublicFolderListCount", "PublicFolderList_Type", "PublicFolderList_Name", "PublicFolderList_Date", "PublicFolderList_Size", "ScanFileListOfOneJobCount", "ScanFileListOfOneJob_Type", "ScanFileListOfOneJob_Name", "ScanFileListOfOneJob_Date", "ScanFileListOfOneJob_Size", "JobDelAllName", "show_temp", "show_mbox", "CustomFolderNameList", "ScanCustomFolderName", "JobName", "FileName", "EnableScanScheduleCLR", "RemainingBufferSize", "CheckJobDownloadStatus" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1079 */   public static int[] tagTypes_PublicFolder = new int[] { 7001, 7002, 7003, 7025, 7005, 7004, 7006, 7007, 7008, 7009, 7010, 7011, 7012, 7013, 7014, 7015, 7016, 7017, 7018, 7019, 7020, 7021, 7022, 7023, 7026, 7027 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1089 */   public static String[] tagNames_Print = new String[] { "PaperSize", "Duplex" };
/* 1090 */   public static int[] tagTypes_Print = new int[] { 7101, 7102 };
/*      */ 
/*      */   
/* 1093 */   public static String[] tagNames_SetSecurityCopy = new String[] { "SecurityCopyOnOFF", "SecurityCIFS_URL", "SecurityCIFS_Port", "SecurityCIFS_Loginname", "SecurityCIFS_Pw", "SecurityCIFS_rePw" };
/*      */ 
/*      */ 
/*      */   
/* 1097 */   public static int[] tagTypes_SetSecurityCopy = new int[] { 7201, 7202, 7203, 7204, 7205, 7206 };
/*      */ 
/*      */ 
/*      */   
/* 1101 */   public static String[] tagNames_Clone = new String[] { "EnableDeviceSet", "EnableServiceSet", "EnableNetworkSet", "EnableRegistration", "EnableTimeoutSet", "EnableFTPCIFS", "EnableAccount" };
/*      */ 
/*      */   
/* 1104 */   public static int[] tagTypes_Clone = new int[] { 7701, 7702, 7703, 7704, 7705, 7706, 7707 };
/*      */ 
/*      */ 
/*      */   
/* 1108 */   public static String[] tagNames_ServiceRegistration = new String[] { "ServiceCopy", "ServiceStorageCopy", "ServiceScan", "ServiceReSavedJob", "ServiceIDCard", "ServiceEmail", "ServiceCSA6", "ServiceDropNTake", "ServiceFax", "ServiceFastCopy", "ServiceTicketCopy", "ServiceCloudPrint", "ServiceNormalCopy", "LockCopy", "LockEmail", "LockReSavedJob", "LockIDCard", "LockScan", "LockFax", "LockCloudPrint", "LockCSA6", "LockFastCopy", "LockDropNTake", "LockTicketCopy", "LockNormalCopy", "ServicePlugIn", "LockPlugIn" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1117 */   public static int[] tagTypes_ServiceRegistration = new int[] { 7601, 7602, 7603, 7604, 7605, 7606, 7607, 7608, 7609, 7610, 7611, 7612, 7613, 7614, 7619, 7617, 7618, 7616, 7622, 7625, 7620, 7623, 7621, 7624, 7626, 7627, 7628 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1124 */   public static String[] tagNames_Jobs = new String[] { "ActiveJobListTotal", "ActiveJobList_ID", "ActiveJobList_Type", "ActiveJobList_Owner", "ActiveJobList_Name", "ActiveJobList_Status", "Citem", "CataLogIndex", "frmImmedActiveNum", "DeleteActiveTimeDays", "EnableJobScheduleCLR", "JobsFrmImmediate", "Available", "TotalMem", "AvailableMem", "SavedFolderList_ID", "SavedFolderNameList", "SavedFolderTotal", "SavedFolderList_Name", "SavedFolderName", "SavedJobTotal", "SavedJobList_ID", "SavedJobList_Security", "SavedJobList_Name", "SavedJobList_PaperSize", "SavedJobList_Pages", "SavedJobsNameList", "JobDetail_JobType", "JobDetail_Time", "JobDetail_PaperSize", "JobDetail_Media", "JobDetail_PrintTray", "JobDetail_TwoSide", "JobDetail_EmailFirstAdr", "JobDetail_EmailCount", "JobDetail_ScanDest", "JobInfoID" };
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1148 */   public static int[] tagTypes_Jobs = new int[] { 1502, 1503, 1504, 1505, 1506, 1507, 1508, 1538, 1509, 1510, 1539, 1511, 1512, 1513, 1514, 1515, 1527, 1516, 1517, 1518, 1519, 1520, 1521, 1522, 1523, 1525, 1526, 1528, 1529, 1530, 1531, 1532, 1533, 1534, 1535, 1536, 1537 };
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1173 */   public static String[] tagNames_General = new String[] { "PowerSaving", "DeviceTime", "DeviceDate", "DisplayLanguage", "TimeZone" };
/*      */ 
/*      */   
/* 1176 */   public static int[] tagTypes_General = new int[] { 8001, 8002, 8003, 8004, 8005 };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1181 */   public static String[] tagNames_Network = new String[] { "Tcp_DHCP", "AutoGetWINSDNS", "IpAddr0", "IpAddr1", "IpAddr2", "IpAddr3", "NetMask0", "NetMask1", "NetMask2", "NetMask3", "GateWay0", "GateWay1", "GateWay2", "GateWay3", "PrimaryDnsServer0", "PrimaryDnsServer1", "PrimaryDnsServer2", "PrimaryDnsServer3", "SecondaryDnsServer0", "SecondaryDnsServer1", "SecondaryDnsServer2", "SecondaryDnsServer3", "PrimaryWins0", "PrimaryWins1", "PrimaryWins2", "PrimaryWins3", "SecondaryWins0", "SecondaryWins1", "SecondaryWins2", "SecondaryWins3", "EnableNetwork", "DomainName", "PrimarySmtpServer", "SmtpPort", "EnableSmtpAuthentication", "MailEncrypt", "SmtpLoginName", "SmtpPassword", "Filter", "FilterMode", "IP_FILTER_StartIp0", "IP_FILTER_EndIp0", "IP_FILTER_StartIp1", "IP_FILTER_EndIp1", "IP_FILTER_StartIp2", "IP_FILTER_EndIp2", "IP_FILTER_StartIp3", "IP_FILTER_EndIp3", "MAC_FILTER_MacAddress0", "MAC_FILTER_MacAddress1", "MAC_FILTER_MacAddress2", "MAC_FILTER_MacAddress3", "MAC_FILTER_MacAddress4", "MAC_FILTER_MacAddress5", "MAC_FILTER_MacAddress6", "MAC_FILTER_MacAddress7", "MAC_FILTER_MacAddress8", "MAC_FILTER_MacAddress9", "Time_Zone", "TimeZone_ID", "TimeZone_GMTStr", "Current_Time", "ucEnable8021xSupplicant", "eEAPAuthMode", "eEAPP2AuthMode", "cClientCASelected", "szClientKeyPwd", "cRootCASelected", "szUserName", "szPassword", "RootCer_LIST", "ClientCer_LIST", "wifi_ucEnable8021xSupplicant", "wifi_eEAPAuthMode", "wifi_eEAPP2AuthMode", "wifi_cClientCASelected", "wifi_szClientKeyPwd", "wifi_cRootCASelected", "wifi_szUserName", "wifi_szPassword", "wifi_RootCer_LIST", "wifi_ClientCer_LIST", "SecondarySmtpServer", "SmtpPort2", "SMTPTimeout", "SmtpReplayTo" };
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1203 */   public static int[] tagTypes_Network = new int[] { 9001, 9030, 9002, 9003, 9004, 9005, 9006, 9007, 9008, 9009, 9010, 9011, 9012, 9013, 9014, 9015, 9016, 9017, 9018, 9019, 9020, 9021, 9022, 9023, 9024, 9025, 9026, 9027, 9028, 9029, 9031, 9032, 9101, 9102, 9103, 9126, 9104, 9105, 9106, 9107, 9108, 9109, 9110, 9111, 9112, 9113, 9114, 9115, 9116, 9117, 9118, 9119, 9120, 9121, 9122, 9123, 9124, 9125, 9127, 9128, 9129, 9130, 9141, 9142, 9143, 9144, 9145, 9146, 9147, 9148, 9149, 9150, 9161, 9162, 9163, 9164, 9165, 9166, 9167, 9168, 9169, 9170, 9181, 9182, 9183, 9184 };
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1245 */   public static String[] tagNames_Network_Wifi = new String[] { "WiFiDHCP", "WiFiIP00", "WiFiIP01", "WiFiIP02", "WiFiIP03", "WiFiSM00", "WiFiSM01", "WiFiSM02", "WiFiSM03", "WiFiGW00", "WiFiGW01", "WiFiGW02", "WiFiGW03", "WiFiDnsUse", "WiFiDNS00", "WiFiDNS01", "WiFiDNS02", "WiFiDNS03", "WiFiDNS10", "WiFiDNS11", "WiFiDNS12", "WiFiDNS13", "WiFiWINS00", "WiFiWINS01", "WiFiWINS02", "WiFiWINS03", "WiFiWINS10", "WiFiWINS11", "WiFiWINS12", "WiFiWINS13", "WiFiDomainName", "WifiStatus", "DynWifiList_SSID", "DynWifiList_IsPwd", "DynWifiList_IsPwd", "DynWifiList_AuthMode", "DynWifiList_Channel", "DynWifiList_SignalStrength", "DynWifiList_Connected", "DynWifiList_Encryption", "DynWifiList_GetCounts", "SSID", "WifiPwd", "AuthMode", "Encryption", "Keyindex" };
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
/* 1257 */   public static int[] tagTypes_Network_Wifi = new int[] { 9501, 9502, 9503, 9504, 9505, 9506, 9507, 9508, 9509, 9510, 9511, 9512, 9513, 9514, 9515, 9516, 9517, 9518, 9519, 9520, 9521, 9522, 9523, 9524, 9525, 9526, 9527, 9528, 9529, 9530, 9531, 9532, 9533, 9534, 9534, 9535, 9536, 9537, 9538, 9539, 9540, 9551, 9552, 9553, 9554, 9555 };
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
/* 1268 */   public static String[] tagNames_Special_display = new String[] { "Webview_URL", "Category" };
/*      */   
/* 1270 */   public static int[] tagTypes_Special_display = new int[] { 7801, 7804 };
/*      */ 
/*      */   
/* 1273 */   public static String[] tagNames_Setting_PortNumber = new String[] { "HiddenNetSwitchPg", "HttpSeverSW", "HttpsEnable", "SNMPAgentSW", "MopriaPrintSW", "LprSW", "RawPrintSW", "GDIPrintSW", "RawPort", "GDIPort", "IPPSW" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1279 */   public static int[] tagTypes_Setting_PortNumber = new int[] { 9601, 9602, 9603, 9604, 9605, 9606, 9607, 9608, 9609, 9610, 9611 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1285 */   public static String[] tagNames_Extural_URL = new String[] { "AdminCenter_URL", "APlusOnOFF", "CloudServer_URL" };
/*      */   
/* 1287 */   public static int[] tagTypes_Extural_URL = new int[] { 7301, 7302, 7311 };
/*      */   
/* 1289 */   public static String[] tagNames_Properties_Item = new String[] { "APlusEnable", "AccountEnable", "FTPCIFSEnable", "FaxFunEnable", "CloudPrintEnable", "WebpageHeaderPrintEnable", "NormalCopyEnable", "CopyEnable", "EmailEnable", "WebpageHeaderScanEnable", "IDCardEnable", "WebpageStorageJobEnable", "SendMeterEnable", "WebpageHeaderJobEnable", "ScanMFPstorageEnable" };
/*      */ 
/*      */ 
/*      */   
/* 1293 */   public static int[] tagTypes_Properties_Item = new int[] { 7502, 7503, 7504, 7505, 7506, 7508, 7509, 7510, 7511, 7512, 7513, 7514, 12219, 7515, 7516 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1299 */   public static String[] tagNames_AuthLdapSrv = new String[] { "AuthLDAPSettingUrl", "AuthLDAPSettingPort", "AuthLDAPSettingDomain1", "AuthLDAPSettingAuthType", "LDAPAuthCertName", "AuthLDAPSettingSearchRoot", "AuthLDAPSettingSearchAttribute", "AuthLDAPSettingObtainEmail", "AuthLDAPSettingSearchName", "AuthLDAPSettingTimeOut", "AuthLDAPSettingLoginName", "AuthLDAPSettingPassword", "LDAPSettingAuthType" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1305 */   public static int[] tagTypes_AuthLdapSrv = new int[] { 12101, 12102, 12103, 12104, 12105, 12106, 12107, 12108, 12109, 12110, 12111, 12112, 12113 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1311 */   public static String[] tagNames_MeterInfo = new String[] { "MeterInforSchedule", "MeterInforUploadDest", "MeterInforJobName", "MeterInforServerUrl", "MeterInforServerPort", "MeterInforServerLoginName", "MeterInforServerPassword", "MeterInforEncryptType", "MeterInforAuthType", "MeterInformailSubject", "MeterInforMailFrom", "MeterInforMailto", "MeterInforMailCc", "MeterInforMailBcc", "MeterInformailReplyto", "MeterInforMailMsg", "MeterInforMailtoDispname", "MeterInforHostname", "SendMeterOnOFF" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1318 */   public static int[] tagTypes_MeterInfo = new int[] { 12201, 12202, 12203, 12204, 12205, 12206, 12207, 12208, 12209, 12210, 12211, 12212, 12213, 12214, 12215, 12216, 12217, 12218, 12220 };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1325 */   public static String[] tagNames_Plugin = new String[] { "PluginSwitch", "UIPackageName", "EnableCustomUI", "PlugInProfile_Names", "PlugInProfile_PackageNames", "PlugInProfile_Seq", "PlugInProfile_GetCounts", "AppSeqID", "PlugInEnable" };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1330 */   public static int[] tagTypes_Plugin = new int[] { 12301, 12302, 12303, 12304, 12305, 12306, 12307, 12308, 12309 };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1335 */   public static String[] tagNames_Ntp = new String[] { "NtpServer" };
/*      */ 
/*      */ 
/*      */   
/* 1339 */   public static int[] tagTypes_Ntp = new int[] { 12401 };
/*      */ 
/*      */ 
/*      */   
/* 1343 */   public static String[] tagNames_Snmp = new String[] { "SNMPEnable", "snmpEnableV1V2", "snmpCommunity", "snmpEnableV3", "snmpUser", "snmpAuthType", "snmpAuthPwd", "snmpPrivType", "snmpPrivPwd", "snmpContextName" };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1348 */   public static int[] tagTypes_Snmp = new int[] { 12501, 12502, 12503, 12504, 12505, 12506, 12507, 12508, 12509, 12510 };
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 1353 */   public static String[] tagNames_USBcontrol = new String[] { "UsbInterfaceOnOff", "UsbDeviceOnOff" };
/*      */ 
/*      */ 
/*      */   
/* 1357 */   public static int[] tagTypes_USBcontrol = new int[] { 12610, 12611 };
/*      */ 
/*      */ 
/*      */   
/* 1361 */   public static String[] tagNames_Syslog = new String[] { "SyslogShowHide", "SyslogEnable", "SyslogIP", "SyslogPort", "SyslogMaxMsgPriority" };
/*      */ 
/*      */ 
/*      */   
/* 1365 */   public static int[] tagTypes_Syslog = new int[] { 15501, 15502, 15503, 15504, 15505 };
/*      */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\WebTagInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */