/*      */ package global.scancenter.commons;
/*      */ 
/*      */ import android.os.Parcel;
/*      */ import android.os.Parcelable;
/*      */ import org.json.JSONException;
/*      */ import org.json.JSONObject;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class APlusMgrInfo
/*      */   implements Parcelable
/*      */ {
/*   14 */   public String _Clone = "Clone Data";
/*   15 */   public String _Information = "Information";
/*      */   
/*   17 */   public String _FilingProfile = "FilingProfile";
/*      */   
/*   19 */   public String _DeviceGeneral = "DeviceGeneral";
/*   20 */   public String _DeviceFunctionLock = "DeviceFunctionLock";
/*   21 */   public String _DeviceAdminCenter = "DeviceAdminCenter";
/*   22 */   public String _AccountManagement = "AccountManagement";
/*      */ 
/*      */ 
/*      */   
/*   26 */   public String _MailServer = "MailServer";
/*   27 */   public String _LDAPServer = "LDAPServer";
/*      */   
/*   29 */   public String _EmailDefault = "EmailDefault";
/*   30 */   public String _FilingDefault = "FilingDefault";
/*      */   
/*   32 */   public String _Header = "Header";
/*   33 */   public String _Class = "Class";
/*   34 */   public String _Array = "Array";
/*      */   
/*   36 */   public String _ModelName = "ModelName";
/*   37 */   public String _HostName = "HostName";
/*   38 */   public String _SerialNumber = "SerialNumber";
/*   39 */   public String _FWVersion = "FWVersion";
/*      */   
/*   41 */   public String _ProfileType = "ProfileType";
/*   42 */   public String _ProfileOwner = "ProfileOwner";
/*   43 */   public String _PersonalAccount = "PersonalAccount";
/*   44 */   public String _ProfileName = "ProfileName";
/*   45 */   public String _URLProtocol = "URLProtocol";
/*   46 */   public String _URLDestination = "URLDestination";
/*   47 */   public String _LoginName = "LoginName";
/*   48 */   public String _Password = "Password";
/*   49 */   public String _Port = "Port";
/*   50 */   public String _PassiveMode = "PassiveMode";
/*   51 */   public String _ReportToEmail = "ReportToEmail";
/*   52 */   public String _FileName = "FileName";
/*   53 */   public String _Preview = "Preview";
/*   54 */   public String _OriginalSize = "OriginalSize";
/*   55 */   public String _ColorMode = "ColorMode";
/*   56 */   public String _Resolution = "Resolution";
/*   57 */   public String _ScanSide = "ScanSide";
/*   58 */   public String _DocumentType = "DocumentType";
/*   59 */   public String _QualityFileSize = "QualityFileSize";
/*   60 */   public String _FileFormat = "FileFormat";
/*   61 */   public String _Density = "Density";
/*   62 */   public String _Contrast = "Contrast";
/*   63 */   public String _AutoOrientation = "AutoOrientation";
/*   64 */   public String _RemoveBlankPage = "RemoveBlankPage";
/*   65 */   public String _MultiFeedDetection = "MultiFeedDetection";
/*      */ 
/*      */   
/*   68 */   public String _NTPServer = "NTPServer";
/*   69 */   public String _TimeZone = "TimeZone";
/*   70 */   public String _PowerSavingTime = "PowerSavingTime";
/*   71 */   public String _AutoPowerOffTime = "AutoPowerOffTime";
/*   72 */   public String _EnableAutoPowerOff = "EnableAutoPowerOff";
/*   73 */   public String _EnableEthernetWakelock = "EnableEthernetWakelock";
/*   74 */   public String _ScreenOffTime = "ScreenOffTime";
/*   75 */   public String _DeviceEmailAddr = "DeviceEmailAddr";
/*   76 */   public String _AdminLoginName = "AdminLoginName";
/*   77 */   public String _AdminPassword = "AdminPassword";
/*   78 */   public String _AdminEmailAddr = "AdminEmailAddr";
/*      */   
/*   80 */   public String _ScanToUSB = "ScanToUSB";
/*   81 */   public String _ScanToPublicFolder = "ScanToPublicFolder";
/*   82 */   public String _ScanToEmail = "ScanToEmail";
/*   83 */   public String _ScanToFTP = "ScanToFTP";
/*   84 */   public String _ScanToCIFS = "ScanToCIFS";
/*   85 */   public String _ScanToGoogleDrive = "ScanToGoogleDrive";
/*   86 */   public String _ScanToDropbox = "ScanToDropbox";
/*   87 */   public String _ScanToEvernote = "ScanToEvernote";
/*   88 */   public String _ScanToPC = "ScanToPC";
/*   89 */   public String _ScanToPrinter = "ScanToPrinter";
/*   90 */   public String _Shortcut = "Shortcut";
/*   91 */   public String _APMode = "APMode";
/*      */   
/*   93 */   public String _AdminCenterURL = "AdminCenterURL";
/*   94 */   public String _EnableAdminLog = "EnableAdminLog";
/*   95 */   public String _AdminLogByMail = "AdminLogByMail";
/*      */   
/*   97 */   public String _EnableSecurityMgmt = "EnableSecurityMgmt";
/*   98 */   public String _EnableGuestAccount = "EnableGuestAccount";
/*   99 */   public String _EnableLDAPAuth = "EnableLDAPAuth";
/*      */   
/*  101 */   public String _UserName = "UserName";
/*  102 */   public String _EmailAddr = "EmailAddr";
/*  103 */   public String _LDAPAuth = "LDAPAuth";
/*      */   
/*  105 */   public String _SMTPServer = "SMTPServer";
/*  106 */   public String _AuthMethod = "AuthMethod";
/*  107 */   public String _Encrypt = "Encrypt";
/*      */   
/*  109 */   public String _LDAPServerName = "LDAPServerName";
/*  110 */   public String _SearchRoot = "SearchRoot";
/*  111 */   public String _SearchAttr = "SearchAttr";
/*  112 */   public String _EmailAddrAttr = "EmailAddrAttr";
/*  113 */   public String _SearchNameFrom = "SearchNameFrom";
/*  114 */   public String _Timeout = "Timeout";
/*  115 */   public String _AuthType = "AuthType";
/*      */   
/*  117 */   public String _Subject = "Subject";
/*  118 */   public String _From = "From";
/*  119 */   public String _ReplyTo = "ReplyTo";
/*  120 */   public String _FileSeparation = "FileSeparation";
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  125 */   public String _ProductName = "ProductName";
/*  126 */   public String _ProductSN = "ProductSN";
/*      */ 
/*      */   
/*  129 */   public String _TimeStamp = "TimeStamp";
/*  130 */   public String _VendorName = "VendorName";
/*  131 */   public String _VID = "VID";
/*  132 */   public String _PID = "PID";
/*  133 */   public String _MFP_IP = "MFP_IP";
/*  134 */   public String _MFP_NET = "MFP_NET";
/*  135 */   public String _MFP_MAC = "MFP_MAC";
/*  136 */   public String _MFP_MASK = "MFP_MASK";
/*  137 */   public String _TonerSN = "TonerSN";
/*  138 */   public String _EP_SN = "EP_SN";
/*  139 */   public String _FuserSN = "FuserSN";
/*  140 */   public String _PowerOnCount = "PowerOnCount";
/*  141 */   public String _OverallPowerOnTime = "OverallPowerOnTime";
/*  142 */   public String _OverallSleepTime = "OverallSleepTime";
/*  143 */   public String _OverallIdleTime = "OverallIdleTime";
/*  144 */   public String _ContinuePowerOnTime = "ContinuePowerOnTime";
/*  145 */   public String _FwVersion = "FwVersion";
/*  146 */   public String _SystemVersion = "SystemVersion";
/*  147 */   public String _EngineVersion = "EngineVersion";
/*  148 */   public String _ScanFwVersion = "ScanFwVersion";
/*  149 */   public String _FaxboardVersion = "FaxboardVersion";
/*  150 */   public String _UI_Version = "UI_Version";
/*  151 */   public String _HomepageVersion = "HomepageVersion";
/*  152 */   public String _Tray3N4_FirmwareVersion = "Tray3/4_FirmwareVersion";
/*  153 */   public String _FPGA_FirmwareVersion = "FPGA_FirmwareVersion";
/*  154 */   public String _CSA6_FirmwareVersion = "CSA6_FirmwareVersion";
/*  155 */   public String _CopyTotalTimes = "CopyTotalTimes";
/*  156 */   public String _FB_LargePageScannedToCopy = "FB_LargePageScannedToCopy";
/*  157 */   public String _FB_SmallPageScannedToCopy = "FB_SmallPageScannedToCopy";
/*  158 */   public String _FB_TotalPageScannedToCopy = "FB_TotalPageScannedToCopy";
/*  159 */   public String _ADF_LargePageScannedToCopy = "ADF_LargePageScannedToCopy";
/*  160 */   public String _ADF_SmallPageScannedToCopy = "ADF_SmallPageScannedToCopy";
/*  161 */   public String _ADF_TotalPageScannedToCopy = "ADF_TotalPageScannedToCopy";
/*  162 */   public String _LargePageCountFromCopy = "LargePageCountFromCopy";
/*  163 */   public String _SmallPageCountFromCopy = "SmallPageCountFromCopy";
/*  164 */   public String _LargePageCountFromPCPrint = "LargePageCountFromPCPrint";
/*  165 */   public String _SmallPageCountFromPCPrint = "SmallPageCountFromPCPrint";
/*  166 */   public String _OverallLargePageCount = "OverallLargePageCount";
/*  167 */   public String _OverallSmallPageCount = "OverallSmallPageCount";
/*  168 */   public String _OverallPageCount = "OverallPageCount";
/*  169 */   public String _LargePageCountOfThisLot = "LargePageCountOfThisLot";
/*  170 */   public String _SmallPageCountOfThisLot = "SmallPageCountOfThisLot";
/*  171 */   public String _PrintLargePageCountOfThisToner = "PrintLargePageCountOfThisToner";
/*  172 */   public String _PrintSmallPageCountOfThisToner = "PrintSmallPageCountOfThisToner";
/*  173 */   public String _PrintLargePageCountOfThisEP = "PrintLargePageCountOfThisEP";
/*  174 */   public String _PrintSmallPageCountOfThisEP = "PrintSmallPageCountOfThisEP";
/*  175 */   public String _PrintRunningTimeOfThisEP = "PrintRunningTimeOfThisEP";
/*  176 */   public String _PrintLargePageCountOfThisFuser = "PrintLargePageCountOfThisFuser";
/*  177 */   public String _PrintSmallPageCountOfThisFuser = "PrintSmallPageCountOfThisFuser";
/*  178 */   public String _TotalPaperJamCount = "TotalPaperJamCount";
/*  179 */   public String _MultifeedCount = "MultifeedCount";
/*  180 */   public String _Jam01_Count = "Jam01_Count";
/*  181 */   public String _Jam02_Count = "Jam02_Count";
/*  182 */   public String _Jam03_Count = "Jam03_Count";
/*  183 */   public String _Jam04_Count = "Jam04_Count";
/*  184 */   public String _Jam05_Count = "Jam05_Count";
/*  185 */   public String _Jam06_Count = "Jam06_Count";
/*  186 */   public String _Jam07_Count = "Jam07_Count";
/*  187 */   public String _Jam08_Count = "Jam08_Count";
/*  188 */   public String _Jam09_Count = "Jam09_Count";
/*  189 */   public String _Jam10_Count = "Jam10_Count";
/*  190 */   public String _Jam11_Count = "Jam11_Count";
/*  191 */   public String _Jam12_Count = "Jam12_Count";
/*  192 */   public String _Jam13_Count = "Jam13_Count";
/*  193 */   public String _Jam14_Count = "Jam14_Count";
/*  194 */   public String _Jam15_Count = "Jam15_Count";
/*  195 */   public String _Jam16_Count = "Jam16_Count";
/*  196 */   public String _Jam17_Count = "Jam17_Count";
/*  197 */   public String _Jam18_Count = "Jam18_Count";
/*  198 */   public String _Jam19_Count = "Jam19_Count";
/*  199 */   public String _Jam20_Count = "Jam20_Count";
/*  200 */   public String _Jam21_Count = "Jam21_Count";
/*  201 */   public String _Jam22_Count = "Jam22_Count";
/*  202 */   public String _Jam23_Count = "Jam23_Count";
/*  203 */   public String _JobCountForSimplexLargePage = "JobCountForSimplexLargePage";
/*  204 */   public String _JobCountForSimplexSmallPage = "JobCountForSimplexSmallPage";
/*  205 */   public String _JobCountForDuplexLargePage = "JobCountForDuplexLargePage";
/*  206 */   public String _JobCountForDuplexSmallPage = "JobCountForDuplexSmallPage";
/*  207 */   public String _PageCountFor3percTonerConsumeRate = "PageCountFor3%TonerConsumeRate";
/*  208 */   public String _PageCountFor5percTonerConsumeRate = "PageCountFor5%TonerConsumeRate";
/*  209 */   public String _PageCountFor7percTonerConsumeRate = "PageCountFor7%TonerConsumeRate";
/*  210 */   public String _PageCountFor10percTonerConsumeRate = "PageCountFor10%TonerConsumeRate";
/*  211 */   public String _PageCountFor20percTonerConsumeRate = "PageCountFor20%TonerConsumeRate";
/*  212 */   public String _PageCountFor50percTonerConsumeRate = "PageCountFor50%TonerConsumeRate";
/*  213 */   public String _PageCountOver50percTonerConsumeRate = "PageCountOver50%TonerConsumeRate";
/*  214 */   public String _PickupRollerOfTray1 = "PickupRollerOfTray1";
/*  215 */   public String _PickupRollerOfTray2 = "PickupRollerOfTray2";
/*  216 */   public String _PickupRollerOfTray3 = "PickupRollerOfTray3";
/*  217 */   public String _PickupRollerOfTray4 = "PickupRollerOfTray4";
/*  218 */   public String _PickupRollerOfTrayM = "PickupRollerOfTrayM";
/*  219 */   public String _FeedRollerOfTray1 = "FeedRollerOfTray1";
/*  220 */   public String _FeedRollerOfTray2 = "FeedRollerOfTray2";
/*  221 */   public String _FeedRollerOfTray3 = "FeedRollerOfTray3";
/*  222 */   public String _FeedRollerOfTray4 = "FeedRollerOfTray4";
/*  223 */   public String _ReverseRollerOfTray1 = "ReverseRollerOfTray1";
/*  224 */   public String _ReverseRollerOfTray2 = "ReverseRollerOfTray2";
/*  225 */   public String _ReverseRollerOfTray3 = "ReverseRollerOfTray3";
/*  226 */   public String _ReverseRollerOfTray4 = "ReverseRollerOfTray4";
/*  227 */   public String _PadOfManualTray = "PadOfManualTray";
/*  228 */   public String _ScanPageCountFromPCScan = "ScanPageCountFromPCScan";
/*  229 */   public String _PCScanTime = "PCScanTime";
/*  230 */   public String _LargePageCountFromFB = "LargePageCountFromFB";
/*  231 */   public String _SmallPageCountFromFB = "SmallPageCountFromFB";
/*  232 */   public String _TotalPageCountFromFB = "TotalPageCountFromFB";
/*  233 */   public String _LargePageCountFromADF = "LargePageCountFromADF";
/*  234 */   public String _SmallPageCountFromADF = "SmallPageCountFromADF";
/*  235 */   public String _TotalPageCountFromADF = "TotalPageCountFromADF";
/*  236 */   public String _LargePageCountOfThisLotFromFB = "LargePageCountOfThisLotFromFB";
/*  237 */   public String _SmallPageCountOfThisLotFromFB = "SmallPageCountOfThisLotFromFB";
/*  238 */   public String _TotalPageCountOfThisLotFromFB = "TotalPageCountOfThisLotFromFB";
/*  239 */   public String _LargePageCountOfThisLotFromADF = "LargePageCountOfThisLotFromADF";
/*  240 */   public String _SmallPageCountOfThisLotFromADF = "SmallPageCountOfThisLotFromADF";
/*  241 */   public String _TotalPageCountOfThisLotFromADF = "TotalPageCountOfThisLotFromADF";
/*  242 */   public String _TotalPageCountOfThisLot = "TotalPageCountOfThisLot";
/*      */   
/*  244 */   public String _SimplexPageCountFromADF = "SimplexPageCountFromADF";
/*  245 */   public String _DuplexPageCountFromADF = "DuplexPageCountFromADF";
/*  246 */   public String _ADF_SimplexPageScannedToCopy = "ADF_SimplexPageScannedToCopy";
/*  247 */   public String _ADF_DuplexPageScannedToCopy = "ADF_DuplexPageScannedToCopy";
/*      */   
/*  249 */   public String _PadOfADF = "PadOfADF";
/*  250 */   public String _PickupRollerOfADF = "PickupRollerOfADF";
/*  251 */   public String _ADF_PaperJamCount = "ADF_PaperJamCount";
/*  252 */   public String _ScannerModuleScanTime = "ScannerModuleScanTime";
/*  253 */   public String _LargePageCountSend = "LargePageCountSend";
/*  254 */   public String _SmallPageCountSend = "SmallPageCountSend";
/*  255 */   public String _TotalPageCountSend = "TotalPageCountSend";
/*  256 */   public String _MFP_ErrorCount = "MFP_ErrorCount";
/*  257 */   public String _RuntimeErrorCount = "RuntimeErrorCount";
/*  258 */   public String _FuserErrorCount = "FuserErrorCount";
/*  259 */   public String _ScannerModuleErrorCount = "ScannerModuleErrorCount";
/*  260 */   public String _ScannerLampErrorCount = "ScannerLampErrorCount";
/*  261 */   public String _MotorErrorCount = "MotorErrorCount";
/*  262 */   public String _PrinterModuleErrorCount = "PrinterModuleErrorCount";
/*  263 */   public String _WasteTonerCanFullCount = "WasteTonerCanFullCount";
/*  264 */   public String _FaxModuleErrorCount = "FaxModuleErrorCount";
/*  265 */   public String _Online = "Online";
/*  266 */   public String _JobType = "JobType";
/*  267 */   public String _JobID = "JobID";
/*  268 */   public String _JobSource = "JobSource";
/*  269 */   public String _BigPageVolume = "BigPageVolume";
/*  270 */   public String _SmallPageVolume = "SmallPageVolume";
/*  271 */   public String _BigPaperVolumne = "BigPaperVolumne";
/*  272 */   public String _SmallPaperVolumne = "SmallPaperVolumne";
/*  273 */   public String _TargetImageMode = "TargetImageMode";
/*  274 */   public String _TargetImageResolution = "TargetImageResolution";
/*  275 */   public String _TargetImageFormat = "TargetImageFormat";
/*  276 */   public String _JobToDest = "JobToDest";
/*  277 */   public String _JobResult = "JobResult";
/*  278 */   public String _JobName = "JobName";
/*  279 */   public String _OrderNumber = "OrderNumber";
/*  280 */   public String _Origin = "Origin";
/*  281 */   public String _Type = "Type";
/*  282 */   public String _Message = "Message";
/*  283 */   public String _Description = "Description";
/*  284 */   public String _ProductionDate = "ProductionDate";
/*      */   
/*  286 */   public String _ErrorCode = "ErrorCode";
/*  287 */   public String _ErrorMsg = "ErrorMsg";
/*  288 */   public String _ErrorMessage = "ErrorMessage";
/*      */ 
/*      */   
/*  291 */   public String _Model = "Model";
/*  292 */   public String _SN = "SN";
/*      */   
/*  294 */   public String _TonerUsageRemain = "TonerUsageRemain";
/*  295 */   public String _EPUsageRemain = "EPUsageRemain";
/*  296 */   public String _FuserUsageRemain = "FuserUsageRemain";
/*  297 */   public String _TrayStatus = "TrayStatus";
/*  298 */   public String _TrayName = "TrayName";
/*  299 */   public String _Status = "Status";
/*  300 */   public String _PaperSize = "PaperSize";
/*  301 */   public String _MediaType = "MediaType";
/*  302 */   public String _MachineStatus = "MachineStatus";
/*  303 */   public String _TonerModelName = "TonerModelName";
/*  304 */   public String _EPModelName = "EPModelName";
/*  305 */   public String _TonerLifeTime = "TonerLifeTime";
/*  306 */   public String _EPLifeTime = "EPLifeTime";
/*  307 */   public String _TonerPageRemain = "TonerPageRemain";
/*  308 */   public String _EPPageRemain = "EPPageRemain";
/*  309 */   public String _TonerPagePrinted = "TonerPagePrinted";
/*  310 */   public String _EPPagePrinted = "EPPagePrinted";
/*      */   
/*      */   public int id;
/*      */   
/*      */   public int nErrorCode;
/*      */   
/*      */   public String TimeStamp;
/*      */   
/*      */   public String HostName;
/*      */   
/*      */   public String ProductName;
/*      */   
/*      */   public String ProductSN;
/*      */   
/*      */   public String UserName;
/*      */   
/*      */   public int DEVICE_VID;
/*      */   
/*      */   public int DEVICE_PID;
/*      */   
/*      */   public int ABILITY_Version;
/*      */   
/*      */   public int ABILITY_ABILITY_Size;
/*      */   
/*      */   public String ABILITY_VendorName;
/*      */   
/*      */   public String ABILITY_ModelName;
/*      */   
/*      */   public String ABILITY_FWVersion;
/*      */   
/*      */   public int ABILITY_BaseRes;
/*      */   
/*      */   public int ABILITY_FlatbedMaxWidth;
/*      */   
/*      */   public int ABILITY_FlatbedMaxLength;
/*      */   
/*      */   public int ABILITY_ADFMaxWidth;
/*      */   
/*      */   public int ABILITY_ADFMaxLength;
/*      */   
/*      */   public int ABILITY_XPAMaxWidth;
/*      */   
/*      */   public int ABILITY_XPAMaxLength;
/*      */   
/*      */   public int ABILITY_FlatbedMinWidth;
/*      */   
/*      */   public int ABILITY_FlatbedMinLength;
/*      */   
/*      */   public int ABILITY_ADFMinWidth;
/*      */   
/*      */   public int ABILITY_ADFMinLength;
/*      */   
/*      */   public int ABILITY_XPAMinWidth;
/*      */   
/*      */   public int ABILITY_XPAMinLength;
/*      */   
/*      */   public int ABILITY_LongPageLengthIndex;
/*      */   
/*      */   public int ABILITY_ImageType;
/*      */   
/*      */   public int ABILITY_DeviceType;
/*      */   
/*      */   public int ABILITY_ScanMethod;
/*      */   
/*      */   public int ABILITY_OpticalRes;
/*      */   
/*      */   public int ABILITY_ADFMotorRes;
/*      */   
/*      */   public int ABILITY_FlatbedMotorRes;
/*      */   
/*      */   public int ABILITY_LineartPixelBound;
/*      */   
/*      */   public int ABILITY_GrayPixelBound;
/*      */   
/*      */   public int ABILITY_ColorPixelBound;
/*      */   
/*      */   public int ABILITY_HalftonePixelBound;
/*      */   public int ABILITY_DiffusionPixelBound;
/*      */   public int ABILITY_Gray4bitsPixelBound;
/*      */   public int ABILITY_ButtonFunctionNumber;
/*      */   public int ABILITY_MinimumRes;
/*      */   public long ABILITY_ScannerCapability0;
/*      */   public long ABILITY_ScannerCapability1;
/*      */   public long ABILITY_ScannerCapability2;
/*      */   public long ABILITY_ScannerCapability3;
/*      */   public long ABILITY_ScannerCapability4;
/*      */   public int CtrlID;
/*      */   public int Version;
/*      */   public int Size;
/*      */   public int PadScanCount;
/*      */   public int ADFSingleModeScanCount;
/*      */   public int ADFDuplexModeScanCount;
/*      */   public int FletbedScanCount;
/*      */   public int LeadingEdgeFletbed;
/*      */   public int SideEdgeFletbed;
/*      */   public int LeadingEdgeADFFrontPage;
/*      */   public int SideEdgeADFFrontPage;
/*      */   public int LeadingEdgeADFRearPage;
/*      */   public int SideEdgeADFRearPage;
/*      */   public int BornMonth;
/*      */   public int BornDay;
/*      */   public int BornYear;
/*      */   public int FirstScanMonth;
/*      */   public int FirstScanDay;
/*      */   public int FirstScanYear;
/*      */   public int VerticalMagnification;
/*      */   public int HorizontalMagnification;
/*      */   public int CCDType;
/*      */   public int ScanSpeed;
/*      */   public int PowerSavingTime;
/*      */   public int RollerCount;
/*      */   public long MultifeedCount;
/*      */   public int JamCount;
/*      */   public String IdentifyInfo;
/*      */   public String FormalName;
/*      */   public int PreFeed;
/*      */   public int PreFeedTime;
/*      */   public int FunctionIndex;
/*      */   public int PowerOffTime;
/*      */   public int PowerOnTime;
/*      */   public int ReverseRollerCount;
/*      */   public int PickupRollerCount;
/*      */   public String SpfVersion;
/*      */   public String FwVersion;
/*      */   public String HomepageVersion;
/*      */   public String ScanFwVersion;
/*      */   public String NetworkMode;
/*      */   public String WiredIP;
/*      */   public String WiredMAC;
/*      */   public String WirelessIP;
/*      */   public String WirelessMAC;
/*      */   public String DateTime;
/*      */   public String LoginUser;
/*      */   public String ScanToDest;
/*      */   public String ScanSource;
/*      */   public String ScanOptionProfile;
/*      */   public String Filename;
/*      */   public int TotalPageCount;
/*      */   public int TotalFileCount;
/*      */   public int TotalFileSize;
/*      */   public int TotalTime;
/*      */   public String OriginalSize;
/*      */   public String ColorMode;
/*      */   public String Resolution;
/*      */   public String ScanSide;
/*      */   public String DocumentType;
/*      */   public String QualityFileSize;
/*      */   public String FileFormat;
/*      */   public int Density;
/*      */   public int Contrast;
/*      */   public String AutoOrientation;
/*      */   public String RemoveBlankPage;
/*      */   public String MultiFeedDetection;
/*      */   public String VendorName;
/*      */   public String VID;
/*      */   public String PID;
/*      */   public String MFP_IP;
/*      */   public String MFP_NET;
/*      */   public String MFP_MAC;
/*      */   public String MFP_MASK;
/*      */   public String TonerSN;
/*      */   public String EP_SN;
/*      */   public String FuserSN;
/*      */   public long PowerOnCount;
/*      */   public String OverallPowerOnTime;
/*      */   public String OverallSleepTime;
/*      */   public String OverallIdleTime;
/*      */   public String ContinuePowerOnTime;
/*      */   public String EngineVersion;
/*      */   public String SystemVersion;
/*      */   public String FaxboardVersion;
/*      */   public String UI_Version;
/*      */   public String Tray3N4_FirmwareVersion;
/*      */   public String FPGA_FirmwareVersion;
/*      */   public String CSA6_FirmwareVersion;
/*      */   public String CopyTotalTimes;
/*      */   public long FB_LargePageScannedToCopy;
/*      */   public long FB_SmallPageScannedToCopy;
/*      */   public long FB_TotalPageScannedToCopy;
/*      */   public long ADF_LargePageScannedToCopy;
/*      */   public long ADF_SmallPageScannedToCopy;
/*      */   public long ADF_TotalPageScannedToCopy;
/*      */   public long LargePageCountFromCopy;
/*      */   public long SmallPageCountFromCopy;
/*      */   public long LargePageCountFromPCPrint;
/*      */   public long SmallPageCountFromPCPrint;
/*      */   public long OverallLargePageCount;
/*      */   public long OverallSmallPageCount;
/*      */   public long OverallPageCount;
/*      */   public long LargePageCountOfThisLot;
/*      */   public long SmallPageCountOfThisLot;
/*      */   public long PrintLargePageCountOfThisToner;
/*      */   public long PrintSmallPageCountOfThisToner;
/*      */   public long PrintLargePageCountOfThisEP;
/*      */   public long PrintSmallPageCountOfThisEP;
/*      */   public long PrintRunningTimeOfThisEP;
/*      */   public long PrintLargePageCountOfThisFuser;
/*      */   public long PrintSmallPageCountOfThisFuser;
/*      */   public long TotalPaperJamCount;
/*      */   public long Jam01_Count;
/*      */   public long Jam02_Count;
/*      */   public long Jam03_Count;
/*      */   public long Jam04_Count;
/*      */   public long Jam05_Count;
/*      */   public long Jam06_Count;
/*      */   public long Jam07_Count;
/*      */   public long Jam08_Count;
/*      */   public long Jam09_Count;
/*      */   public long Jam10_Count;
/*      */   public long Jam11_Count;
/*      */   public long Jam12_Count;
/*      */   public long Jam13_Count;
/*      */   public long Jam14_Count;
/*      */   public long Jam15_Count;
/*      */   public long Jam16_Count;
/*      */   public long Jam17_Count;
/*      */   public long Jam18_Count;
/*      */   public long Jam19_Count;
/*      */   public long Jam20_Count;
/*      */   public long Jam21_Count;
/*      */   public long Jam22_Count;
/*      */   public long Jam23_Count;
/*      */   public long JobCountForSimplexLargePage;
/*      */   public long JobCountForSimplexSmallPage;
/*      */   public long JobCountForDuplexLargePage;
/*      */   public long JobCountForDuplexSmallPage;
/*      */   public String PageCountFor3percTonerConsumeRate;
/*      */   public String PageCountFor5percTonerConsumeRate;
/*      */   public String PageCountFor7percTonerConsumeRate;
/*      */   public String PageCountFor10percTonerConsumeRate;
/*      */   public String PageCountFor20percTonerConsumeRate;
/*      */   public String PageCountFor50percTonerConsumeRate;
/*      */   public String PageCountOver50percTonerConsumeRate;
/*      */   public long PickupRollerOfTray1;
/*      */   public long PickupRollerOfTray2;
/*      */   public long PickupRollerOfTray3;
/*      */   public long PickupRollerOfTray4;
/*      */   public long PickupRollerOfTrayM;
/*      */   public long FeedRollerOfTray1;
/*      */   public long FeedRollerOfTray2;
/*      */   public long FeedRollerOfTray3;
/*      */   public long FeedRollerOfTray4;
/*      */   public long ReverseRollerOfTray1;
/*      */   public long ReverseRollerOfTray2;
/*      */   public long ReverseRollerOfTray3;
/*      */   public long ReverseRollerOfTray4;
/*      */   public long PadOfManualTray;
/*      */   public long ScanPageCountFromPCScan;
/*      */   public long PCScanTime;
/*      */   public long LargePageCountFromFB;
/*      */   public long SmallPageCountFromFB;
/*      */   public long TotalPageCountFromFB;
/*      */   public long LargePageCountFromADF;
/*      */   public long SmallPageCountFromADF;
/*      */   public long TotalPageCountFromADF;
/*      */   public long LargePageCountOfThisLotFromFB;
/*      */   public long SmallPageCountOfThisLotFromFB;
/*      */   public long TotalPageCountOfThisLotFromFB;
/*      */   public long LargePageCountOfThisLotFromADF;
/*      */   public long SmallPageCountOfThisLotFromADF;
/*      */   public long TotalPageCountOfThisLotFromADF;
/*      */   public long TotalPageCountOfThisLot;
/*      */   public long SimplexPageCountFromADF;
/*      */   public long DuplexPageCountFromADF;
/*      */   public long ADF_SimplexPageScannedToCopy;
/*      */   public long ADF_DuplexPageScannedToCopy;
/*      */   public long PadOfADF;
/*      */   public long PickupRollerOfADF;
/*      */   public long ADF_PaperJamCount;
/*      */   public long ScannerModuleScanTime;
/*      */   public long LargePageCountSend;
/*      */   public long SmallPageCountSend;
/*      */   public long TotalPageCountSend;
/*      */   public long MFP_ErrorCount;
/*      */   public long RuntimeErrorCount;
/*      */   public long FuserErrorCount;
/*      */   public long ScannerModuleErrorCount;
/*      */   public long ScannerLampErrorCount;
/*      */   public long MotorErrorCount;
/*      */   public long PrinterModuleErrorCount;
/*      */   public long WasteTonerCanFullCount;
/*      */   public long FaxModuleErrorCount;
/*      */   public String Online;
/*      */   public String JobType;
/*      */   public String JobID;
/*      */   public String JobSource;
/*      */   public int BigPageVolume;
/*      */   public int SmallPageVolume;
/*      */   public int BigPaperVolumne;
/*      */   public int SmallPaperVolumne;
/*      */   public String TargetImageMode;
/*      */   public String TargetImageResolution;
/*      */   public String TargetImageFormat;
/*      */   public String JobToDest;
/*      */   public String JobResult;
/*      */   public String JobName;
/*      */   public String OrderNumber;
/*      */   public int ErrorCode;
/*      */   public String ErrorMsg;
/*      */   public String ErrorMessage;
/*      */   public int Origin;
/*      */   public int Type;
/*      */   public String Message;
/*      */   public String Description;
/*      */   public String Model;
/*      */   public String SN;
/*      */   public String TonerUsageRemain;
/*      */   public String EPUsageRemain;
/*      */   public String FuserUsageRemain;
/*      */   public String TrayStatus;
/*      */   public String TrayName;
/*      */   public String Status;
/*      */   public String PaperSize;
/*      */   public String MediaType;
/*      */   public String MachineStatus;
/*      */   public String TonerModelName;
/*      */   public String EPModelName;
/*      */   public String TonerLifeTime;
/*      */   public String EPLifeTime;
/*      */   public int TonerPageRemain;
/*      */   public int EPPageRemain;
/*      */   public int TonerPagePrinted;
/*      */   public int EPPagePrinted;
/*      */   public String ProductionDate;
/*      */   public String Drum_SN;
/*      */   public String DrumModelName;
/*      */   public String DrumLifeTime;
/*      */   public int DrumPageRemain;
/*      */   public int DrumPagePrinted;
/*      */   public String DrumUsageRemain;
/*  640 */   public String _Drum_SN = "Drum_SN";
/*  641 */   public String _DrumModelName = "DrumModelName";
/*  642 */   public String _DrumLifeTime = "DrumLifeTime";
/*  643 */   public String _DrumPageRemain = "DrumPageRemain";
/*  644 */   public String _DrumPagePrinted = "DrumPagePrinted";
/*  645 */   public String _DrumUsageRemain = "DrumUsageRemain";
/*      */ 
/*      */   
/*      */   public APlusMgrInfo() {
/*  649 */     this.id = 0;
/*  650 */     this.nErrorCode = 0;
/*      */     
/*  652 */     this.TimeStamp = "2016-08-31 15:15:15";
/*  653 */     this.HostName = "AM7850i-F00299";
/*  654 */     this.ProductName = "AM7850i";
/*  655 */     this.ProductSN = "A083696258640008";
/*  656 */     this.UserName = "admin";
/*      */     
/*  658 */     this.VendorName = "AVISION";
/*  659 */     this.VID = "638";
/*  660 */     this.PID = "2c47";
/*  661 */     this.MFP_IP = "10.1.21.8";
/*  662 */     this.MFP_MAC = "00:02:32:f0:02:99";
/*  663 */     this.TonerSN = "00270990*500*AS1508240051";
/*  664 */     this.EP_SN = null;
/*  665 */     this.FuserSN = "";
/*  666 */     this.PowerOnCount = 86L;
/*  667 */     this.OverallPowerOnTime = "0";
/*  668 */     this.OverallSleepTime = "983";
/*  669 */     this.OverallIdleTime = "0";
/*  670 */     this.ContinuePowerOnTime = "984";
/*  671 */     this.FwVersion = "0.69.1";
/*  672 */     this.EngineVersion = "1402131460";
/*  673 */     this.SystemVersion = "2012110190";
/*  674 */     this.FaxboardVersion = "N/A";
/*  675 */     this.UI_Version = "0.69.1";
/*  676 */     this.HomepageVersion = "0.31";
/*  677 */     this.Tray3N4_FirmwareVersion = "N/A";
/*  678 */     this.FPGA_FirmwareVersion = "49";
/*  679 */     this.CSA6_FirmwareVersion = "N/A";
/*  680 */     this.CopyTotalTimes = "0";
/*  681 */     this.FB_LargePageScannedToCopy = 0L;
/*  682 */     this.FB_SmallPageScannedToCopy = 0L;
/*  683 */     this.FB_TotalPageScannedToCopy = 0L;
/*  684 */     this.ADF_LargePageScannedToCopy = 0L;
/*  685 */     this.ADF_SmallPageScannedToCopy = 0L;
/*  686 */     this.ADF_TotalPageScannedToCopy = 0L;
/*  687 */     this.LargePageCountFromCopy = 0L;
/*  688 */     this.SmallPageCountFromCopy = 479L;
/*  689 */     this.LargePageCountFromPCPrint = 0L;
/*  690 */     this.SmallPageCountFromPCPrint = 86L;
/*  691 */     this.OverallLargePageCount = 0L;
/*  692 */     this.OverallSmallPageCount = 814L;
/*  693 */     this.OverallPageCount = 814L;
/*  694 */     this.LargePageCountOfThisLot = 0L;
/*  695 */     this.SmallPageCountOfThisLot = 86L;
/*  696 */     this.PrintLargePageCountOfThisToner = 0L;
/*  697 */     this.PrintSmallPageCountOfThisToner = 983L;
/*  698 */     this.PrintLargePageCountOfThisEP = 0L;
/*  699 */     this.PrintSmallPageCountOfThisEP = 984L;
/*  700 */     this.PrintRunningTimeOfThisEP = 3225L;
/*  701 */     this.PrintLargePageCountOfThisFuser = 23L;
/*  702 */     this.PrintSmallPageCountOfThisFuser = 984L;
/*  703 */     this.TotalPaperJamCount = 115L;
/*  704 */     this.MultifeedCount = 13L;
/*  705 */     this.Jam01_Count = 0L;
/*  706 */     this.Jam02_Count = 8L;
/*  707 */     this.Jam03_Count = 0L;
/*  708 */     this.Jam04_Count = 0L;
/*  709 */     this.Jam05_Count = 0L;
/*  710 */     this.Jam06_Count = 26L;
/*  711 */     this.Jam07_Count = 40L;
/*  712 */     this.Jam08_Count = 4L;
/*  713 */     this.Jam09_Count = 37L;
/*  714 */     this.Jam10_Count = 0L;
/*  715 */     this.Jam11_Count = 0L;
/*  716 */     this.Jam12_Count = 0L;
/*  717 */     this.Jam13_Count = 0L;
/*  718 */     this.Jam14_Count = 0L;
/*  719 */     this.Jam15_Count = 0L;
/*  720 */     this.Jam16_Count = 0L;
/*  721 */     this.Jam17_Count = 0L;
/*  722 */     this.Jam18_Count = 0L;
/*  723 */     this.Jam19_Count = 0L;
/*  724 */     this.Jam20_Count = 0L;
/*  725 */     this.Jam21_Count = 0L;
/*  726 */     this.Jam22_Count = 0L;
/*  727 */     this.Jam23_Count = 0L;
/*  728 */     this.JobCountForSimplexLargePage = 0L;
/*  729 */     this.JobCountForSimplexSmallPage = 393L;
/*  730 */     this.JobCountForDuplexLargePage = 0L;
/*  731 */     this.JobCountForDuplexSmallPage = 263L;
/*  732 */     this.PageCountFor3percTonerConsumeRate = "146";
/*  733 */     this.PageCountFor5percTonerConsumeRate = "148";
/*  734 */     this.PageCountFor7percTonerConsumeRate = "53";
/*  735 */     this.PageCountFor10percTonerConsumeRate = "93";
/*  736 */     this.PageCountFor20percTonerConsumeRate = "82";
/*  737 */     this.PageCountFor50percTonerConsumeRate = "29";
/*  738 */     this.PageCountOver50percTonerConsumeRate = "0";
/*  739 */     this.PickupRollerOfTray1 = 906L;
/*  740 */     this.PickupRollerOfTray2 = 35L;
/*  741 */     this.PickupRollerOfTray3 = 0L;
/*  742 */     this.PickupRollerOfTray4 = 0L;
/*  743 */     this.PickupRollerOfTrayM = 44L;
/*  744 */     this.FeedRollerOfTray1 = 906L;
/*  745 */     this.FeedRollerOfTray2 = 35L;
/*  746 */     this.FeedRollerOfTray3 = 0L;
/*  747 */     this.FeedRollerOfTray4 = 0L;
/*  748 */     this.ReverseRollerOfTray1 = 906L;
/*  749 */     this.ReverseRollerOfTray2 = 35L;
/*  750 */     this.ReverseRollerOfTray3 = 0L;
/*  751 */     this.ReverseRollerOfTray4 = 0L;
/*  752 */     this.PadOfManualTray = 44L;
/*  753 */     this.ScanPageCountFromPCScan = 0L;
/*  754 */     this.PCScanTime = 0L;
/*  755 */     this.LargePageCountFromFB = 0L;
/*  756 */     this.SmallPageCountFromFB = 0L;
/*  757 */     this.TotalPageCountFromFB = 0L;
/*  758 */     this.LargePageCountFromADF = 0L;
/*  759 */     this.SmallPageCountFromADF = 0L;
/*  760 */     this.TotalPageCountFromADF = 0L;
/*  761 */     this.LargePageCountOfThisLotFromFB = 0L;
/*  762 */     this.SmallPageCountOfThisLotFromFB = 0L;
/*  763 */     this.TotalPageCountOfThisLotFromFB = 0L;
/*  764 */     this.LargePageCountOfThisLotFromADF = 0L;
/*  765 */     this.SmallPageCountOfThisLotFromADF = 0L;
/*  766 */     this.TotalPageCountOfThisLotFromADF = 0L;
/*  767 */     this.TotalPageCountOfThisLot = 0L;
/*  768 */     this.SimplexPageCountFromADF = 0L;
/*  769 */     this.DuplexPageCountFromADF = 0L;
/*  770 */     this.ADF_SimplexPageScannedToCopy = 0L;
/*  771 */     this.ADF_DuplexPageScannedToCopy = 0L;
/*  772 */     this.PadOfADF = 0L;
/*  773 */     this.PickupRollerOfADF = 0L;
/*  774 */     this.ADF_PaperJamCount = 0L;
/*  775 */     this.ScannerModuleScanTime = 0L;
/*  776 */     this.LargePageCountSend = 0L;
/*  777 */     this.SmallPageCountSend = 0L;
/*  778 */     this.TotalPageCountSend = 0L;
/*  779 */     this.MFP_ErrorCount = 3225L;
/*  780 */     this.RuntimeErrorCount = 23L;
/*  781 */     this.FuserErrorCount = 0L;
/*  782 */     this.ScannerModuleErrorCount = 389L;
/*  783 */     this.ScannerLampErrorCount = 0L;
/*  784 */     this.MotorErrorCount = 0L;
/*  785 */     this.PrinterModuleErrorCount = 0L;
/*  786 */     this.WasteTonerCanFullCount = 0L;
/*  787 */     this.FaxModuleErrorCount = 0L;
/*      */     
/*  789 */     this.JobType = "Scan";
/*  790 */     this.JobID = "0";
/*  791 */     this.JobSource = "PrinterDriver";
/*  792 */     this.BigPageVolume = 0;
/*  793 */     this.SmallPageVolume = 0;
/*  794 */     this.BigPaperVolumne = 0;
/*  795 */     this.SmallPaperVolumne = 0;
/*  796 */     this.TargetImageMode = "Color";
/*  797 */     this.TargetImageResolution = "600";
/*  798 */     this.TargetImageFormat = "JPEG";
/*  799 */     this.JobToDest = "10.1.21.6/yita";
/*  800 */     this.JobResult = "OK";
/*  801 */     this.JobName = "NA";
/*  802 */     this.OrderNumber = "NA";
/*      */     
/*  804 */     this.Origin = 2;
/*  805 */     this.Type = 3;
/*  806 */     this.Message = "";
/*  807 */     this.Description = "";
/*  808 */     this.Model = "AM7850i";
/*  809 */     this.SN = "0000000000000000";
/*      */     
/*  811 */     this.ErrorCode = 0;
/*  812 */     this.ErrorMsg = "NA";
/*  813 */     this.ErrorMessage = "";
/*      */     
/*  815 */     this.TonerUsageRemain = "0";
/*  816 */     this.EPUsageRemain = "0";
/*  817 */     this.FuserUsageRemain = "0";
/*      */     
/*  819 */     this.TrayStatus = "";
/*  820 */     this.TrayName = "Tray1";
/*  821 */     this.Status = "0%";
/*  822 */     this.PaperSize = "A4SEF";
/*  823 */     this.MediaType = "Plain";
/*  824 */     this.MachineStatus = "01";
/*      */     
/*  826 */     this.TonerModelName = "";
/*  827 */     this.EPModelName = "";
/*  828 */     this.TonerLifeTime = "";
/*  829 */     this.EPLifeTime = "";
/*  830 */     this.TonerPageRemain = 0;
/*  831 */     this.EPPageRemain = 0;
/*  832 */     this.TonerPagePrinted = 0;
/*  833 */     this.EPPagePrinted = 0;
/*      */     
/*  835 */     this.Drum_SN = "";
/*  836 */     this.DrumModelName = "";
/*  837 */     this.DrumLifeTime = "";
/*  838 */     this.DrumPageRemain = 0;
/*  839 */     this.DrumPagePrinted = 0;
/*  840 */     this.DrumUsageRemain = "0";
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   APlusMgrInfo(Parcel in) {
/*  846 */     this.id = in.readInt();
/*  847 */     this.nErrorCode = in.readInt();
/*      */     
/*  849 */     this.TimeStamp = in.readString();
/*  850 */     this.HostName = in.readString();
/*  851 */     this.ProductName = in.readString();
/*  852 */     this.ProductSN = in.readString();
/*  853 */     this.UserName = in.readString();
/*      */     
/*  855 */     this.VendorName = in.readString();
/*  856 */     this.VID = in.readString();
/*  857 */     this.PID = in.readString();
/*  858 */     this.MFP_IP = in.readString();
/*  859 */     this.MFP_MAC = in.readString();
/*  860 */     this.TonerSN = in.readString();
/*  861 */     this.EP_SN = in.readString();
/*  862 */     this.FuserSN = in.readString();
/*  863 */     this.PowerOnCount = in.readLong();
/*  864 */     this.OverallPowerOnTime = in.readString();
/*  865 */     this.OverallSleepTime = in.readString();
/*  866 */     this.OverallIdleTime = in.readString();
/*  867 */     this.ContinuePowerOnTime = in.readString();
/*  868 */     this.FwVersion = in.readString();
/*  869 */     this.EngineVersion = in.readString();
/*  870 */     this.SystemVersion = in.readString();
/*  871 */     this.FaxboardVersion = in.readString();
/*  872 */     this.UI_Version = in.readString();
/*  873 */     this.HomepageVersion = in.readString();
/*  874 */     this.Tray3N4_FirmwareVersion = in.readString();
/*  875 */     this.FPGA_FirmwareVersion = in.readString();
/*  876 */     this.CSA6_FirmwareVersion = in.readString();
/*  877 */     this.CopyTotalTimes = in.readString();
/*  878 */     this.FB_LargePageScannedToCopy = in.readLong();
/*  879 */     this.FB_SmallPageScannedToCopy = in.readLong();
/*  880 */     this.FB_TotalPageScannedToCopy = in.readLong();
/*  881 */     this.ADF_LargePageScannedToCopy = in.readLong();
/*  882 */     this.ADF_SmallPageScannedToCopy = in.readLong();
/*  883 */     this.ADF_TotalPageScannedToCopy = in.readLong();
/*  884 */     this.LargePageCountFromCopy = in.readLong();
/*  885 */     this.SmallPageCountFromCopy = in.readLong();
/*  886 */     this.LargePageCountFromPCPrint = in.readLong();
/*  887 */     this.SmallPageCountFromPCPrint = in.readLong();
/*  888 */     this.OverallLargePageCount = in.readLong();
/*  889 */     this.OverallSmallPageCount = in.readLong();
/*  890 */     this.OverallPageCount = in.readLong();
/*  891 */     this.LargePageCountOfThisLot = in.readLong();
/*  892 */     this.SmallPageCountOfThisLot = in.readLong();
/*  893 */     this.PrintLargePageCountOfThisToner = in.readLong();
/*  894 */     this.PrintSmallPageCountOfThisToner = in.readLong();
/*  895 */     this.PrintLargePageCountOfThisEP = in.readLong();
/*  896 */     this.PrintSmallPageCountOfThisEP = in.readLong();
/*  897 */     this.PrintRunningTimeOfThisEP = in.readLong();
/*  898 */     this.PrintLargePageCountOfThisFuser = in.readLong();
/*  899 */     this.PrintSmallPageCountOfThisFuser = in.readLong();
/*  900 */     this.TotalPaperJamCount = in.readLong();
/*  901 */     this.MultifeedCount = in.readLong();
/*  902 */     this.Jam01_Count = in.readLong();
/*  903 */     this.Jam02_Count = in.readLong();
/*  904 */     this.Jam03_Count = in.readLong();
/*  905 */     this.Jam04_Count = in.readLong();
/*  906 */     this.Jam05_Count = in.readLong();
/*  907 */     this.Jam06_Count = in.readLong();
/*  908 */     this.Jam07_Count = in.readLong();
/*  909 */     this.Jam08_Count = in.readLong();
/*  910 */     this.Jam09_Count = in.readLong();
/*  911 */     this.Jam10_Count = in.readLong();
/*  912 */     this.Jam11_Count = in.readLong();
/*  913 */     this.Jam12_Count = in.readLong();
/*  914 */     this.Jam13_Count = in.readLong();
/*  915 */     this.Jam14_Count = in.readLong();
/*  916 */     this.Jam15_Count = in.readLong();
/*  917 */     this.Jam16_Count = in.readLong();
/*  918 */     this.Jam17_Count = in.readLong();
/*  919 */     this.Jam18_Count = in.readLong();
/*  920 */     this.Jam19_Count = in.readLong();
/*  921 */     this.Jam20_Count = in.readLong();
/*  922 */     this.Jam21_Count = in.readLong();
/*  923 */     this.Jam22_Count = in.readLong();
/*  924 */     this.Jam23_Count = in.readLong();
/*  925 */     this.JobCountForSimplexLargePage = in.readLong();
/*  926 */     this.JobCountForSimplexSmallPage = in.readLong();
/*  927 */     this.JobCountForDuplexLargePage = in.readLong();
/*  928 */     this.JobCountForDuplexSmallPage = in.readLong();
/*  929 */     this.PageCountFor3percTonerConsumeRate = in.readString();
/*  930 */     this.PageCountFor5percTonerConsumeRate = in.readString();
/*  931 */     this.PageCountFor7percTonerConsumeRate = in.readString();
/*  932 */     this.PageCountFor10percTonerConsumeRate = in.readString();
/*  933 */     this.PageCountFor20percTonerConsumeRate = in.readString();
/*  934 */     this.PageCountFor50percTonerConsumeRate = in.readString();
/*  935 */     this.PageCountOver50percTonerConsumeRate = in.readString();
/*  936 */     this.PickupRollerOfTray1 = in.readLong();
/*  937 */     this.PickupRollerOfTray2 = in.readLong();
/*  938 */     this.PickupRollerOfTray3 = in.readLong();
/*  939 */     this.PickupRollerOfTray4 = in.readLong();
/*  940 */     this.PickupRollerOfTrayM = in.readLong();
/*  941 */     this.FeedRollerOfTray1 = in.readLong();
/*  942 */     this.FeedRollerOfTray2 = in.readLong();
/*  943 */     this.FeedRollerOfTray3 = in.readLong();
/*  944 */     this.FeedRollerOfTray4 = in.readLong();
/*  945 */     this.ReverseRollerOfTray1 = in.readLong();
/*  946 */     this.ReverseRollerOfTray2 = in.readLong();
/*  947 */     this.ReverseRollerOfTray3 = in.readLong();
/*  948 */     this.ReverseRollerOfTray4 = in.readLong();
/*  949 */     this.PadOfManualTray = in.readLong();
/*  950 */     this.ScanPageCountFromPCScan = in.readLong();
/*  951 */     this.PCScanTime = in.readLong();
/*  952 */     this.LargePageCountFromFB = in.readLong();
/*  953 */     this.SmallPageCountFromFB = in.readLong();
/*  954 */     this.TotalPageCountFromFB = in.readLong();
/*  955 */     this.LargePageCountFromADF = in.readLong();
/*  956 */     this.SmallPageCountFromADF = in.readLong();
/*  957 */     this.TotalPageCountFromADF = in.readLong();
/*  958 */     this.LargePageCountOfThisLotFromFB = in.readLong();
/*  959 */     this.SmallPageCountOfThisLotFromFB = in.readLong();
/*  960 */     this.TotalPageCountOfThisLotFromFB = in.readLong();
/*  961 */     this.LargePageCountOfThisLotFromADF = in.readLong();
/*  962 */     this.SmallPageCountOfThisLotFromADF = in.readLong();
/*  963 */     this.TotalPageCountOfThisLotFromADF = in.readLong();
/*  964 */     this.TotalPageCountOfThisLot = in.readLong();
/*  965 */     this.SimplexPageCountFromADF = in.readLong();
/*  966 */     this.DuplexPageCountFromADF = in.readLong();
/*  967 */     this.ADF_SimplexPageScannedToCopy = in.readLong();
/*  968 */     this.ADF_DuplexPageScannedToCopy = in.readLong();
/*  969 */     this.PadOfADF = in.readLong();
/*  970 */     this.PickupRollerOfADF = in.readLong();
/*  971 */     this.ADF_PaperJamCount = in.readLong();
/*  972 */     this.ScannerModuleScanTime = in.readLong();
/*  973 */     this.LargePageCountSend = in.readLong();
/*  974 */     this.SmallPageCountSend = in.readLong();
/*  975 */     this.TotalPageCountSend = in.readLong();
/*  976 */     this.MFP_ErrorCount = in.readLong();
/*  977 */     this.RuntimeErrorCount = in.readLong();
/*  978 */     this.FuserErrorCount = in.readLong();
/*  979 */     this.ScannerModuleErrorCount = in.readLong();
/*  980 */     this.ScannerLampErrorCount = in.readLong();
/*  981 */     this.MotorErrorCount = in.readLong();
/*  982 */     this.PrinterModuleErrorCount = in.readLong();
/*  983 */     this.WasteTonerCanFullCount = in.readLong();
/*  984 */     this.FaxModuleErrorCount = in.readLong();
/*      */     
/*  986 */     this.JobType = in.readString();
/*  987 */     this.JobID = in.readString();
/*  988 */     this.JobSource = in.readString();
/*  989 */     this.BigPageVolume = in.readInt();
/*  990 */     this.SmallPageVolume = in.readInt();
/*  991 */     this.BigPaperVolumne = in.readInt();
/*  992 */     this.SmallPaperVolumne = in.readInt();
/*  993 */     this.TargetImageMode = in.readString();
/*  994 */     this.TargetImageResolution = in.readString();
/*  995 */     this.TargetImageFormat = in.readString();
/*  996 */     this.JobToDest = in.readString();
/*  997 */     this.JobResult = in.readString();
/*  998 */     this.JobName = in.readString();
/*  999 */     this.OrderNumber = in.readString();
/*      */     
/* 1001 */     this.Origin = in.readInt();
/* 1002 */     this.Type = in.readInt();
/* 1003 */     this.Message = in.readString();
/* 1004 */     this.Description = in.readString();
/*      */     
/* 1006 */     this.ErrorCode = in.readInt();
/* 1007 */     this.ErrorMsg = in.readString();
/*      */     
/* 1009 */     this.TonerUsageRemain = in.readString();
/* 1010 */     this.EPUsageRemain = in.readString();
/* 1011 */     this.FuserUsageRemain = in.readString();
/*      */     
/* 1013 */     this.ErrorMessage = in.readString();
/* 1014 */     this.TrayName = in.readString();
/* 1015 */     this.Status = in.readString();
/* 1016 */     this.PaperSize = in.readString();
/* 1017 */     this.MediaType = in.readString();
/* 1018 */     this.MachineStatus = in.readString();
/*      */     
/* 1020 */     this.TonerModelName = in.readString();
/* 1021 */     this.EPModelName = in.readString();
/* 1022 */     this.TonerLifeTime = in.readString();
/* 1023 */     this.EPLifeTime = in.readString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1029 */     String log = "[JsonInfo]\nid:" + this.id + ", nErrorCode:" + this.nErrorCode + ", TimeStamp:" + this.TimeStamp + ", HostName:" + this.HostName + ", ProductName:" + this.ProductName + ", ProductSN:" + this.ProductSN + ", UserName:" + this.UserName + ", VendorName:" + this.VendorName + ", VID:" + this.VID + ", PID:" + this.PID + ", MFP_IP:" + this.MFP_IP + ", MFP_MAC:" + this.MFP_MAC + ", TonerSN:" + this.TonerSN + ", EP_SN:" + this.EP_SN + ", FuserSN:" + this.FuserSN + ", PowerOnCount:" + this.PowerOnCount + ", OverallPowerOnTime:" + this.OverallPowerOnTime + ", OverallSleepTime:" + this.OverallSleepTime + ", OverallIdleTime:" + this.OverallIdleTime + ", ContinuePowerOnTime:" + this.ContinuePowerOnTime + ", FwVersion:" + this.FwVersion + ", SystemVersion:" + this.SystemVersion + ", EngineVersion:" + this.EngineVersion + ", FaxboardVersion:" + this.FaxboardVersion + ", UI_Version:" + this.UI_Version + ", HomepageVersion:" + this.HomepageVersion + ", Tray3/4_FirmwareVersion:" + this.Tray3N4_FirmwareVersion + ", FPGA_FirmwareVersion:" + this.FPGA_FirmwareVersion + ", CSA6_FirmwareVersion:" + this.CSA6_FirmwareVersion + ", CopyTotalTimes:" + this.CopyTotalTimes + ", FB_LargePageScannedToCopy:" + this.FB_LargePageScannedToCopy + ", FB_SmallPageScannedToCopy:" + this.FB_SmallPageScannedToCopy + ", FB_TotalPageScannedToCopy:" + this.FB_TotalPageScannedToCopy + ", ADF_LargePageScannedToCopy:" + this.ADF_LargePageScannedToCopy + ", ADF_SmallPageScannedToCopy:" + this.ADF_SmallPageScannedToCopy + ", ADF_TotalPageScannedToCopy:" + this.ADF_TotalPageScannedToCopy + ", LargePageCountFromCopy:" + this.LargePageCountFromCopy + ", SmallPageCountFromCopy:" + this.SmallPageCountFromCopy + ", LargePageCountFromPCPrint:" + this.LargePageCountFromPCPrint + ", SmallPageCountFromPCPrint:" + this.SmallPageCountFromPCPrint + ", OverallLargePageCount:" + this.OverallLargePageCount + ", OverallSmallPageCount:" + this.OverallSmallPageCount + ", OverallPageCount:" + this.OverallPageCount + ", LargePageCountOfThisLot:" + this.LargePageCountOfThisLot + ", SmallPageCountOfThisLot:" + this.SmallPageCountOfThisLot + ", PrintLargePageCountOfThisToner:" + this.PrintLargePageCountOfThisToner + ", PrintSmallPageCountOfThisToner:" + this.PrintSmallPageCountOfThisToner + ", PrintLargePageCountOfThisEP:" + this.PrintLargePageCountOfThisEP + ", PrintSmallPageCountOfThisEP:" + this.PrintSmallPageCountOfThisEP + ", PrintRunningTimeOfThisEP:" + this.PrintRunningTimeOfThisEP + ", PrintLargePageCountOfThisFuser:" + this.PrintLargePageCountOfThisFuser + ", PrintSmallPageCountOfThisFuser:" + this.PrintSmallPageCountOfThisFuser + ", TotalPaperJamCount:" + this.TotalPaperJamCount + ", MultifeedCount:" + this.MultifeedCount + ", Jam01_Count:" + this.Jam01_Count + ", Jam02_Count:" + this.Jam02_Count + ", Jam03_Count:" + this.Jam03_Count + ", Jam04_Count:" + this.Jam04_Count + ", Jam05_Count:" + this.Jam05_Count + ", Jam06_Count:" + this.Jam06_Count + ", Jam07_Count:" + this.Jam07_Count + ", Jam08_Count:" + this.Jam08_Count + ", Jam09_Count:" + this.Jam09_Count + ", Jam10_Count:" + this.Jam10_Count + ", Jam11_Count:" + this.Jam11_Count + ", Jam12_Count:" + this.Jam12_Count + ", Jam13_Count:" + this.Jam13_Count + ", Jam14_Count:" + this.Jam14_Count + ", Jam15_Count:" + this.Jam15_Count + ", Jam16_Count:" + this.Jam16_Count + ", Jam17_Count:" + this.Jam17_Count + ", Jam18_Count:" + this.Jam18_Count + ", Jam19_Count:" + this.Jam19_Count + ", Jam20_Count:" + this.Jam20_Count + ", Jam21_Count:" + this.Jam21_Count + ", Jam22_Count:" + this.Jam22_Count + ", Jam23_Count:" + this.Jam23_Count + ", JobCountForSimplexLargePage:" + this.JobCountForSimplexLargePage + ", JobCountForSimplexSmallPage:" + this.JobCountForSimplexSmallPage + ", JobCountForDuplexLargePage:" + this.JobCountForDuplexLargePage + ", JobCountForDuplexSmallPage:" + this.JobCountForDuplexSmallPage + ", PageCountFor3%TonerConsumeRate:" + this.PageCountFor3percTonerConsumeRate + ", PageCountFor5%TonerConsumeRate:" + this.PageCountFor5percTonerConsumeRate + ", PageCountFor7%TonerConsumeRate:" + this.PageCountFor7percTonerConsumeRate + ", PageCountFor10%TonerConsumeRate:" + this.PageCountFor10percTonerConsumeRate + ", PageCountFor20%TonerConsumeRate:" + this.PageCountFor20percTonerConsumeRate + ", PageCountFor50%TonerConsumeRate:" + this.PageCountFor50percTonerConsumeRate + ", PageCountOver50%TonerConsumeRate:" + this.PageCountOver50percTonerConsumeRate + ", PickupRollerOfTray1:" + this.PickupRollerOfTray1 + ", PickupRollerOfTray2:" + this.PickupRollerOfTray2 + ", PickupRollerOfTray3:" + this.PickupRollerOfTray3 + ", PickupRollerOfTray4:" + this.PickupRollerOfTray4 + ", PickupRollerOfTrayM:" + this.PickupRollerOfTrayM + ", FeedRollerOfTray1:" + this.FeedRollerOfTray1 + ", FeedRollerOfTray2:" + this.FeedRollerOfTray2 + ", FeedRollerOfTray3:" + this.FeedRollerOfTray3 + ", FeedRollerOfTray4:" + this.FeedRollerOfTray4 + ", ReverseRollerOfTray1:" + this.ReverseRollerOfTray1 + ", ReverseRollerOfTray2:" + this.ReverseRollerOfTray2 + ", ReverseRollerOfTray3:" + this.ReverseRollerOfTray3 + ", ReverseRollerOfTray4:" + this.ReverseRollerOfTray4 + ", PadOfManualTray:" + this.PadOfManualTray + ", ScanPageCountFromPCScan:" + this.ScanPageCountFromPCScan + ", PCScanTime:" + this.PCScanTime + ", LargePageCountFromFB:" + this.LargePageCountFromFB + ", SmallPageCountFromFB:" + this.SmallPageCountFromFB + ", TotalPageCountFromFB:" + this.TotalPageCountFromFB + ", LargePageCountFromADF:" + this.LargePageCountFromADF + ", SmallPageCountFromADF:" + this.SmallPageCountFromADF + ", TotalPageCountFromADF:" + this.TotalPageCountFromADF + ", LargePageCountOfThisLotFromFB:" + this.LargePageCountOfThisLotFromFB + ", SmallPageCountOfThisLotFromFB:" + this.SmallPageCountOfThisLotFromFB + ", TotalPageCountOfThisLotFromFB:" + this.TotalPageCountOfThisLotFromFB + ", LargePageCountOfThisLotFromADF:" + this.LargePageCountOfThisLotFromADF + ", SmallPageCountOfThisLotFromADF:" + this.SmallPageCountOfThisLotFromADF + ", TotalPageCountOfThisLotFromADF:" + this.TotalPageCountOfThisLotFromADF + ", TotalPageCountOfThisLot:" + this.TotalPageCountOfThisLot + ", SimplexPageCountFromADF:" + this.SimplexPageCountFromADF + ", DuplexPageCountFromADF:" + this.DuplexPageCountFromADF + ", ADF_SimplexPageScannedToCopy:" + this.ADF_SimplexPageScannedToCopy + ", ADF_DuplexPageScannedToCopy:" + this.ADF_DuplexPageScannedToCopy + ", PadOfADF:" + this.PadOfADF + ", PickupRollerOfADF:" + this.PickupRollerOfADF + ", ADF_PaperJamCount:" + this.ADF_PaperJamCount + ", ScannerModuleScanTime:" + this.ScannerModuleScanTime + ", LargePageCountSend:" + this.LargePageCountSend + ", SmallPageCountSend:" + this.SmallPageCountSend + ", TotalPageCountSend:" + this.TotalPageCountSend + ", MFP_ErrorCount:" + this.MFP_ErrorCount + ", RuntimeErrorCount:" + this.RuntimeErrorCount + ", FuserErrorCount:" + this.FuserErrorCount + ", ScannerModuleErrorCount:" + this.ScannerModuleErrorCount + ", ScannerLampErrorCount:" + this.ScannerLampErrorCount + ", MotorErrorCount:" + this.MotorErrorCount + ", PrinterModuleErrorCount:" + this.PrinterModuleErrorCount + ", WasteTonerCanFullCount:" + this.WasteTonerCanFullCount + ", FaxModuleErrorCount:" + this.FaxModuleErrorCount + ", JobType:" + this.JobType + ", JobID:" + this.JobID + ", JobSource:" + this.JobSource + ", BigPageVolume:" + this.BigPageVolume + ", SmallPageVolume:" + this.SmallPageVolume + ", BigPaperVolumne:" + this.BigPaperVolumne + ", SmallPaperVolumne:" + this.SmallPaperVolumne + ", TargetImageMode:" + this.TargetImageMode + ", TargetImageResolution:" + this.TargetImageResolution + ", TargetImageFormat:" + this.TargetImageFormat + ", JobToDest:" + this.JobToDest + ", JobResult:" + this.JobResult + ", JobName:" + this.JobName + ", OrderNumber:" + this.OrderNumber + ", Origin:" + this.Origin + ", Type:" + this.Type + ", Message:" + this.Message + ", Description:" + this.Description + ", ErrorCode:" + this.ErrorCode + ", ErrorMsg:" + this.ErrorMsg + ", ErrorMessage:" + this.ErrorMessage + ", TonerUsageRemain:" + this.TonerUsageRemain + ", EPUsageRemain:" + this.EPUsageRemain + ", FuserUsageRemain:" + this.FuserUsageRemain + ", TonerModelName:" + this.TonerModelName + ", EPModelName:" + this.EPModelName + ", TonerLifeTime:" + this.TonerLifeTime + ", EPLifeTime:" + this.EPLifeTime + ", TonerPageRemain:" + this.TonerPageRemain + ", EPPageRemain:" + this.EPPageRemain + ", TonerPagePrinted:" + this.TonerPagePrinted + ", EPPagePrinted:" + this.EPPagePrinted;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1206 */     return log;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeToParcel(Parcel out, int flag) {
/* 1212 */     out.writeInt(this.nErrorCode);
/* 1213 */     out.writeInt(this.id);
/*      */     
/* 1215 */     out.writeString(this.TimeStamp);
/* 1216 */     out.writeString(this.HostName);
/* 1217 */     out.writeString(this.ProductName);
/* 1218 */     out.writeString(this.ProductSN);
/* 1219 */     out.writeString(this.UserName);
/*      */     
/* 1221 */     out.writeString(this.VendorName);
/* 1222 */     out.writeString(this.VID);
/* 1223 */     out.writeString(this.PID);
/* 1224 */     out.writeString(this.MFP_IP);
/* 1225 */     out.writeString(this.MFP_MAC);
/* 1226 */     out.writeString(this.TonerSN);
/* 1227 */     out.writeString(this.EP_SN);
/* 1228 */     out.writeString(this.FuserSN);
/* 1229 */     out.writeLong(this.PowerOnCount);
/* 1230 */     out.writeString(this.OverallPowerOnTime);
/* 1231 */     out.writeString(this.OverallSleepTime);
/* 1232 */     out.writeString(this.OverallIdleTime);
/* 1233 */     out.writeString(this.ContinuePowerOnTime);
/* 1234 */     out.writeString(this.FwVersion);
/* 1235 */     out.writeString(this.EngineVersion);
/* 1236 */     out.writeString(this.SystemVersion);
/* 1237 */     out.writeString(this.FaxboardVersion);
/* 1238 */     out.writeString(this.UI_Version);
/* 1239 */     out.writeString(this.HomepageVersion);
/* 1240 */     out.writeString(this.Tray3N4_FirmwareVersion);
/* 1241 */     out.writeString(this.FPGA_FirmwareVersion);
/* 1242 */     out.writeString(this.CSA6_FirmwareVersion);
/* 1243 */     out.writeString(this.CopyTotalTimes);
/* 1244 */     out.writeLong(this.FB_LargePageScannedToCopy);
/* 1245 */     out.writeLong(this.FB_SmallPageScannedToCopy);
/* 1246 */     out.writeLong(this.FB_TotalPageScannedToCopy);
/* 1247 */     out.writeLong(this.ADF_LargePageScannedToCopy);
/* 1248 */     out.writeLong(this.ADF_SmallPageScannedToCopy);
/* 1249 */     out.writeLong(this.ADF_TotalPageScannedToCopy);
/* 1250 */     out.writeLong(this.LargePageCountFromCopy);
/* 1251 */     out.writeLong(this.SmallPageCountFromCopy);
/* 1252 */     out.writeLong(this.LargePageCountFromPCPrint);
/* 1253 */     out.writeLong(this.SmallPageCountFromPCPrint);
/* 1254 */     out.writeLong(this.OverallLargePageCount);
/* 1255 */     out.writeLong(this.OverallSmallPageCount);
/* 1256 */     out.writeLong(this.OverallPageCount);
/* 1257 */     out.writeLong(this.LargePageCountOfThisLot);
/* 1258 */     out.writeLong(this.SmallPageCountOfThisLot);
/* 1259 */     out.writeLong(this.PrintLargePageCountOfThisToner);
/* 1260 */     out.writeLong(this.PrintSmallPageCountOfThisToner);
/* 1261 */     out.writeLong(this.PrintLargePageCountOfThisEP);
/* 1262 */     out.writeLong(this.PrintSmallPageCountOfThisEP);
/* 1263 */     out.writeLong(this.PrintRunningTimeOfThisEP);
/* 1264 */     out.writeLong(this.PrintLargePageCountOfThisFuser);
/* 1265 */     out.writeLong(this.PrintSmallPageCountOfThisFuser);
/* 1266 */     out.writeLong(this.TotalPaperJamCount);
/* 1267 */     out.writeLong(this.MultifeedCount);
/* 1268 */     out.writeLong(this.Jam01_Count);
/* 1269 */     out.writeLong(this.Jam02_Count);
/* 1270 */     out.writeLong(this.Jam03_Count);
/* 1271 */     out.writeLong(this.Jam04_Count);
/* 1272 */     out.writeLong(this.Jam05_Count);
/* 1273 */     out.writeLong(this.Jam06_Count);
/* 1274 */     out.writeLong(this.Jam07_Count);
/* 1275 */     out.writeLong(this.Jam08_Count);
/* 1276 */     out.writeLong(this.Jam09_Count);
/* 1277 */     out.writeLong(this.Jam10_Count);
/* 1278 */     out.writeLong(this.Jam11_Count);
/* 1279 */     out.writeLong(this.Jam12_Count);
/* 1280 */     out.writeLong(this.Jam13_Count);
/* 1281 */     out.writeLong(this.Jam14_Count);
/* 1282 */     out.writeLong(this.Jam15_Count);
/* 1283 */     out.writeLong(this.Jam16_Count);
/* 1284 */     out.writeLong(this.Jam17_Count);
/* 1285 */     out.writeLong(this.Jam18_Count);
/* 1286 */     out.writeLong(this.Jam19_Count);
/* 1287 */     out.writeLong(this.Jam20_Count);
/* 1288 */     out.writeLong(this.Jam21_Count);
/* 1289 */     out.writeLong(this.Jam22_Count);
/* 1290 */     out.writeLong(this.Jam23_Count);
/* 1291 */     out.writeLong(this.JobCountForSimplexLargePage);
/* 1292 */     out.writeLong(this.JobCountForSimplexSmallPage);
/* 1293 */     out.writeLong(this.JobCountForDuplexLargePage);
/* 1294 */     out.writeLong(this.JobCountForDuplexSmallPage);
/* 1295 */     out.writeString(this.PageCountFor3percTonerConsumeRate);
/* 1296 */     out.writeString(this.PageCountFor5percTonerConsumeRate);
/* 1297 */     out.writeString(this.PageCountFor7percTonerConsumeRate);
/* 1298 */     out.writeString(this.PageCountFor10percTonerConsumeRate);
/* 1299 */     out.writeString(this.PageCountFor20percTonerConsumeRate);
/* 1300 */     out.writeString(this.PageCountFor50percTonerConsumeRate);
/* 1301 */     out.writeString(this.PageCountOver50percTonerConsumeRate);
/* 1302 */     out.writeLong(this.PickupRollerOfTray1);
/* 1303 */     out.writeLong(this.PickupRollerOfTray2);
/* 1304 */     out.writeLong(this.PickupRollerOfTray3);
/* 1305 */     out.writeLong(this.PickupRollerOfTray4);
/* 1306 */     out.writeLong(this.PickupRollerOfTrayM);
/* 1307 */     out.writeLong(this.FeedRollerOfTray1);
/* 1308 */     out.writeLong(this.FeedRollerOfTray2);
/* 1309 */     out.writeLong(this.FeedRollerOfTray3);
/* 1310 */     out.writeLong(this.FeedRollerOfTray4);
/* 1311 */     out.writeLong(this.ReverseRollerOfTray1);
/* 1312 */     out.writeLong(this.ReverseRollerOfTray2);
/* 1313 */     out.writeLong(this.ReverseRollerOfTray3);
/* 1314 */     out.writeLong(this.ReverseRollerOfTray4);
/* 1315 */     out.writeLong(this.PadOfManualTray);
/* 1316 */     out.writeLong(this.ScanPageCountFromPCScan);
/* 1317 */     out.writeLong(this.PCScanTime);
/* 1318 */     out.writeLong(this.LargePageCountFromFB);
/* 1319 */     out.writeLong(this.SmallPageCountFromFB);
/* 1320 */     out.writeLong(this.TotalPageCountFromFB);
/* 1321 */     out.writeLong(this.LargePageCountFromADF);
/* 1322 */     out.writeLong(this.SmallPageCountFromADF);
/* 1323 */     out.writeLong(this.TotalPageCountFromADF);
/* 1324 */     out.writeLong(this.LargePageCountOfThisLotFromFB);
/* 1325 */     out.writeLong(this.SmallPageCountOfThisLotFromFB);
/* 1326 */     out.writeLong(this.TotalPageCountOfThisLotFromFB);
/* 1327 */     out.writeLong(this.LargePageCountOfThisLotFromADF);
/* 1328 */     out.writeLong(this.SmallPageCountOfThisLotFromADF);
/* 1329 */     out.writeLong(this.TotalPageCountOfThisLotFromADF);
/* 1330 */     out.writeLong(this.TotalPageCountOfThisLot);
/* 1331 */     out.writeLong(this.SimplexPageCountFromADF);
/* 1332 */     out.writeLong(this.DuplexPageCountFromADF);
/* 1333 */     out.writeLong(this.ADF_SimplexPageScannedToCopy);
/* 1334 */     out.writeLong(this.ADF_DuplexPageScannedToCopy);
/* 1335 */     out.writeLong(this.PadOfADF);
/* 1336 */     out.writeLong(this.PickupRollerOfADF);
/* 1337 */     out.writeLong(this.ADF_PaperJamCount);
/* 1338 */     out.writeLong(this.ScannerModuleScanTime);
/* 1339 */     out.writeLong(this.LargePageCountSend);
/* 1340 */     out.writeLong(this.SmallPageCountSend);
/* 1341 */     out.writeLong(this.TotalPageCountSend);
/* 1342 */     out.writeLong(this.MFP_ErrorCount);
/* 1343 */     out.writeLong(this.RuntimeErrorCount);
/* 1344 */     out.writeLong(this.FuserErrorCount);
/* 1345 */     out.writeLong(this.ScannerModuleErrorCount);
/* 1346 */     out.writeLong(this.ScannerLampErrorCount);
/* 1347 */     out.writeLong(this.MotorErrorCount);
/* 1348 */     out.writeLong(this.PrinterModuleErrorCount);
/* 1349 */     out.writeLong(this.WasteTonerCanFullCount);
/* 1350 */     out.writeLong(this.FaxModuleErrorCount);
/*      */     
/* 1352 */     out.writeString(this.JobType);
/* 1353 */     out.writeString(this.JobID);
/* 1354 */     out.writeString(this.JobSource);
/* 1355 */     out.writeInt(this.BigPageVolume);
/* 1356 */     out.writeInt(this.SmallPageVolume);
/* 1357 */     out.writeInt(this.BigPaperVolumne);
/* 1358 */     out.writeInt(this.SmallPaperVolumne);
/* 1359 */     out.writeString(this.TargetImageMode);
/* 1360 */     out.writeString(this.TargetImageResolution);
/* 1361 */     out.writeString(this.TargetImageFormat);
/* 1362 */     out.writeString(this.JobToDest);
/* 1363 */     out.writeString(this.JobResult);
/* 1364 */     out.writeString(this.JobName);
/* 1365 */     out.writeString(this.OrderNumber);
/*      */     
/* 1367 */     out.writeInt(this.Origin);
/* 1368 */     out.writeInt(this.Type);
/* 1369 */     out.writeString(this.Message);
/* 1370 */     out.writeString(this.Description);
/*      */     
/* 1372 */     out.writeInt(this.ErrorCode);
/* 1373 */     out.writeString(this.ErrorMsg);
/*      */     
/* 1375 */     out.writeString(this.TonerUsageRemain);
/* 1376 */     out.writeString(this.EPUsageRemain);
/* 1377 */     out.writeString(this.FuserUsageRemain);
/*      */     
/* 1379 */     out.writeString(this.ErrorMessage);
/* 1380 */     out.writeString(this.TrayStatus);
/* 1381 */     out.writeString(this.TrayName);
/* 1382 */     out.writeString(this.Status);
/* 1383 */     out.writeString(this.PaperSize);
/* 1384 */     out.writeString(this.MediaType);
/* 1385 */     out.writeString(this.MachineStatus);
/*      */     
/* 1387 */     out.writeString(this.TonerModelName);
/* 1388 */     out.writeString(this.EPModelName);
/* 1389 */     out.writeString(this.TonerLifeTime);
/* 1390 */     out.writeString(this.EPLifeTime);
/* 1391 */     out.writeInt(this.TonerPageRemain);
/* 1392 */     out.writeInt(this.EPPageRemain);
/* 1393 */     out.writeInt(this.TonerPagePrinted);
/* 1394 */     out.writeInt(this.EPPagePrinted);
/*      */   }
/*      */   
/* 1397 */   public static final Parcelable.Creator<APlusMgrInfo> CREATOR = new Parcelable.Creator<APlusMgrInfo>()
/*      */     {
/*      */       public APlusMgrInfo createFromParcel(Parcel p)
/*      */       {
/* 1401 */         return new APlusMgrInfo(p);
/*      */       }
/*      */ 
/*      */       
/*      */       public APlusMgrInfo[] newArray(int size) {
/* 1406 */         return new APlusMgrInfo[size];
/*      */       }
/*      */     };
/*      */ 
/*      */ 
/*      */   
/*      */   public int describeContents() {
/* 1413 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Object clone() throws CloneNotSupportedException {
/* 1419 */     return super.clone();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int SetDefaultErrorCode(int value) {
/* 1425 */     this.nErrorCode = value;
/* 1426 */     return this.nErrorCode;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int GetLastErrorCode() {
/* 1432 */     return this.nErrorCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public String SetIntToString(int value) {
/* 1437 */     String str = "";
/* 1438 */     str = String.valueOf(value);
/* 1439 */     return str;
/*      */   }
/*      */ 
/*      */   
/*      */   public int GetIntByString(String str) {
/* 1444 */     int value = 0;
/* 1445 */     if (str != null && !str.isEmpty()) {
/*      */       
/*      */       try
/*      */       {
/* 1449 */         value = Integer.parseInt(str);
/*      */       }
/* 1451 */       catch (NumberFormatException e)
/*      */       {
/* 1453 */         e.printStackTrace();
/* 1454 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1459 */       this.nErrorCode = 1;
/*      */     } 
/* 1461 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String SetBooleanToString(boolean value) {
/* 1466 */     String str = "";
/* 1467 */     str = value ? "On" : "Off";
/* 1468 */     return str;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean GetBooleanByString(String str) {
/* 1473 */     boolean value = false;
/* 1474 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1476 */       if (str.equals("Off"))
/*      */       {
/* 1478 */         value = false;
/*      */       }
/* 1480 */       else if (str.equals("On"))
/*      */       {
/* 1482 */         value = true;
/*      */       }
/*      */       else
/*      */       {
/* 1486 */         value = false;
/* 1487 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1492 */       this.nErrorCode = 1;
/*      */     } 
/* 1494 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String SetPasswordToString(String str) {
/* 1499 */     String string = "";
/* 1500 */     if (str != null && !str.isEmpty()) {
/*      */       
/*      */       try
/*      */       {
/* 1504 */         string = SCGlobal.encryptCode(str);
/*      */       }
/* 1506 */       catch (Exception e)
/*      */       {
/*      */         
/* 1509 */         e.printStackTrace();
/* 1510 */         e.getStackTrace();
/* 1511 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1516 */       this.nErrorCode = 1;
/*      */     } 
/* 1518 */     return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public String GetPasswordByString(String str) {
/* 1523 */     String string = "";
/* 1524 */     if (str != null && !str.isEmpty()) {
/*      */       
/*      */       try
/*      */       {
/* 1528 */         string = SCGlobal.decryptCode(str);
/*      */       }
/* 1530 */       catch (IllegalArgumentException e)
/*      */       {
/*      */         
/* 1533 */         e.printStackTrace();
/* 1534 */         e.getStackTrace();
/* 1535 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1540 */       this.nErrorCode = 1;
/*      */     } 
/* 1542 */     return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_ScreenOffTime(int value) {
/* 1547 */     String string = "";
/* 1548 */     switch (value)
/*      */     
/*      */     { case 0:
/* 1551 */         string = "3Min";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1567 */         return string;case 1: string = "5Min"; return string;case 2: string = "10Min"; return string;case 3: string = "Never"; return string; }  string = "Never"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_ScreenOffTime(String str, int nDefault) {
/* 1572 */     int value = nDefault;
/* 1573 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1575 */       if (str.equals("3Min"))
/*      */       {
/* 1577 */         value = 0;
/*      */       }
/* 1579 */       else if (str.equals("5Min"))
/*      */       {
/* 1581 */         value = 1;
/*      */       }
/* 1583 */       else if (str.equals("10Min"))
/*      */       {
/* 1585 */         value = 2;
/*      */       }
/* 1587 */       else if (str.equals("Never"))
/*      */       {
/* 1589 */         value = 3;
/*      */       }
/*      */       else
/*      */       {
/* 1593 */         value = nDefault;
/* 1594 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1599 */       this.nErrorCode = 1;
/*      */     } 
/* 1601 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_AuthMethod(String str) {
/* 1606 */     String string = "";
/* 1607 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1609 */       if (str.equals("0"))
/*      */       {
/* 1611 */         string = "None";
/*      */       }
/* 1613 */       else if (str.equals("1"))
/*      */       {
/* 1615 */         string = "SMTP";
/*      */       }
/* 1617 */       else if (str.equals("2"))
/*      */       {
/* 1619 */         string = "POP3";
/*      */       }
/*      */       else
/*      */       {
/* 1623 */         string = "None";
/* 1624 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1629 */       this.nErrorCode = 1;
/*      */     } 
/* 1631 */     return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Get_AuthMethod(String str) {
/* 1636 */     String string = "";
/* 1637 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1639 */       if (str.equals("None"))
/*      */       {
/* 1641 */         string = "0";
/*      */       }
/* 1643 */       else if (str.equals("SMTP"))
/*      */       {
/* 1645 */         string = "1";
/*      */       }
/* 1647 */       else if (str.equals("POP3"))
/*      */       {
/* 1649 */         string = "2";
/*      */       }
/*      */       else
/*      */       {
/* 1653 */         string = "0";
/* 1654 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1659 */       this.nErrorCode = 1;
/*      */     } 
/* 1661 */     return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_Encrypt(String str) {
/* 1666 */     String string = "";
/* 1667 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1669 */       if (str.equals("0"))
/*      */       {
/* 1671 */         string = "None";
/*      */       }
/* 1673 */       else if (str.equals("1"))
/*      */       {
/* 1675 */         string = "TLS/STARTTLS";
/*      */       }
/* 1677 */       else if (str.equals("2"))
/*      */       {
/* 1679 */         string = "SSL";
/*      */       }
/*      */       else
/*      */       {
/* 1683 */         string = "None";
/* 1684 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1689 */       this.nErrorCode = 1;
/*      */     } 
/* 1691 */     return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Get_Encrypt(String str) {
/* 1696 */     String string = "";
/* 1697 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1699 */       if (str.equals("None"))
/*      */       {
/* 1701 */         string = "0";
/*      */       }
/* 1703 */       else if (str.equals("STARTTLS"))
/*      */       {
/* 1705 */         string = "1";
/*      */       }
/* 1707 */       else if (str.equals("SSL"))
/*      */       {
/* 1709 */         string = "2";
/*      */       }
/*      */       else
/*      */       {
/* 1713 */         string = "0";
/* 1714 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1719 */       this.nErrorCode = 1;
/*      */     } 
/* 1721 */     return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_AuthType(int value) {
/* 1726 */     String string = "";
/* 1727 */     switch (value)
/*      */     
/*      */     { case 0:
/* 1730 */         string = "Anonymous";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1743 */         return string;case 1: string = "Simple"; return string;case 2: string = "SimpleSSL"; return string; }  string = "Anonymous"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_AuthType(String str, int nDefault) {
/* 1748 */     int value = nDefault;
/* 1749 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1751 */       if (str.equals("Anonymous"))
/*      */       {
/* 1753 */         value = 0;
/*      */       }
/* 1755 */       else if (str.equals("Simple"))
/*      */       {
/* 1757 */         value = 1;
/*      */       }
/* 1759 */       else if (str.equals("SimpleSSL"))
/*      */       {
/* 1761 */         value = 2;
/*      */       }
/*      */       else
/*      */       {
/* 1765 */         value = nDefault;
/* 1766 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1771 */       this.nErrorCode = 1;
/*      */     } 
/* 1773 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_URLProtocol(int value) {
/* 1778 */     String string = "";
/* 1779 */     switch (value)
/*      */     
/*      */     { case -1:
/* 1782 */         string = "None";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1834 */         return string;case 0: string = "Copy"; return string;case 1: string = "Email"; return string;case 2: string = "FTP"; return string;case 3: string = "CIFS"; return string;case 4: string = "USB"; return string;case 5: string = "PublicFolder"; return string;case 6: string = "AwipApp"; return string;case 7: string = "Dropbox"; return string;case 8: string = "Evernote"; return string;case 9: string = "Cloud"; return string;case 10: string = "GoogleDrive"; return string;case 11: string = "LocalStorage"; return string;case 12: string = "SharePoint"; return string;case 13: string = "Printer"; return string;case 14: string = "FTPS"; return string; }  string = "FTP"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_URLProtocol(String str, int nDefault) {
/* 1839 */     int value = nDefault;
/* 1840 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1842 */       if (str.equals("None"))
/*      */       {
/* 1844 */         value = -1;
/*      */       }
/* 1846 */       else if (str.equals("Copy"))
/*      */       {
/* 1848 */         value = 0;
/*      */       }
/* 1850 */       else if (str.equals("Email"))
/*      */       {
/* 1852 */         value = 1;
/*      */       }
/* 1854 */       else if (str.equals("FTP"))
/*      */       {
/* 1856 */         value = 2;
/*      */       }
/* 1858 */       else if (str.equals("CIFS"))
/*      */       {
/* 1860 */         value = 3;
/*      */       }
/* 1862 */       else if (str.equals("USB"))
/*      */       {
/* 1864 */         value = 4;
/*      */       }
/* 1866 */       else if (str.equals("PublicFolder"))
/*      */       {
/* 1868 */         value = 5;
/*      */       }
/* 1870 */       else if (str.equals("AwipApp"))
/*      */       {
/* 1872 */         value = 6;
/*      */       }
/* 1874 */       else if (str.equals("Dropbox"))
/*      */       {
/* 1876 */         value = 7;
/*      */       }
/* 1878 */       else if (str.equals("Evernote"))
/*      */       {
/* 1880 */         value = 8;
/*      */       }
/* 1882 */       else if (str.equals("Cloud"))
/*      */       {
/* 1884 */         value = 9;
/*      */       }
/* 1886 */       else if (str.equals("GoogleDrive"))
/*      */       {
/* 1888 */         value = 10;
/*      */       }
/* 1890 */       else if (str.equals("LocalStorage"))
/*      */       {
/* 1892 */         value = 11;
/*      */       }
/* 1894 */       else if (str.equals("SharePoint"))
/*      */       {
/* 1896 */         value = 12;
/*      */       }
/* 1898 */       else if (str.equals("Printer"))
/*      */       {
/* 1900 */         value = 13;
/*      */       }
/* 1902 */       else if (str.equals("FTPS"))
/*      */       {
/* 1904 */         value = 14;
/*      */       }
/*      */       else
/*      */       {
/* 1908 */         value = nDefault;
/* 1909 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1914 */       this.nErrorCode = 1;
/*      */     } 
/* 1916 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String SetIntToBooleanString(int value, int nCompare) {
/* 1921 */     String str = "";
/* 1922 */     str = (value == nCompare) ? "On" : "Off";
/* 1923 */     return str;
/*      */   }
/*      */ 
/*      */   
/*      */   public int GetIntByBooleanString(String str, int nDefault) {
/* 1928 */     int value = 0;
/* 1929 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1931 */       if (str.equals("Off"))
/*      */       {
/* 1933 */         value = 0;
/*      */       }
/* 1935 */       else if (str.equals("On"))
/*      */       {
/* 1937 */         value = 1;
/*      */       }
/*      */       else
/*      */       {
/* 1941 */         value = nDefault;
/* 1942 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 1947 */       this.nErrorCode = 1;
/*      */     } 
/* 1949 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_FileSeparation(int value) {
/* 1954 */     String string = "";
/* 1955 */     switch (value)
/*      */     
/*      */     { case 0:
/* 1958 */         string = "Unlimited";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1983 */         return string;case 1: string = "1MB"; return string;case 3: string = "3MB"; return string;case 5: string = "5MB"; return string;case 10: string = "10MB"; return string;case 20: string = "20MB"; return string;case 30: string = "30MB"; return string; }  string = "Unlimited"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_FileSeparation(String str, int nDefault) {
/* 1988 */     int value = nDefault;
/* 1989 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 1991 */       if (str.equals("Unlimited"))
/*      */       {
/* 1993 */         value = 0;
/*      */       }
/* 1995 */       else if (str.equals("1MB"))
/*      */       {
/* 1997 */         value = 1;
/*      */       }
/* 1999 */       else if (str.equals("3MB"))
/*      */       {
/* 2001 */         value = 3;
/*      */       }
/* 2003 */       else if (str.equals("5MB"))
/*      */       {
/* 2005 */         value = 5;
/*      */       }
/* 2007 */       else if (str.equals("10MB"))
/*      */       {
/* 2009 */         value = 10;
/*      */       }
/* 2011 */       else if (str.equals("20MB"))
/*      */       {
/* 2013 */         value = 20;
/*      */       }
/* 2015 */       else if (str.equals("30MB"))
/*      */       {
/* 2017 */         value = 30;
/*      */       }
/*      */       else
/*      */       {
/* 2021 */         value = nDefault;
/* 2022 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2027 */       this.nErrorCode = 1;
/*      */     } 
/* 2029 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_Port(int value) {
/* 2034 */     return SetIntToString(value);
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_Port(String str) {
/* 2039 */     return GetIntByString(str);
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_PassiveMode(boolean value) {
/* 2044 */     return SetBooleanToString(value);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean Get_PassiveMode(String str) {
/* 2049 */     return GetBooleanByString(str);
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_Preview(boolean value) {
/* 2054 */     return SetBooleanToString(value);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean Get_Preview(String str) {
/* 2059 */     return GetBooleanByString(str);
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_OriginalSize(int value) {
/* 2064 */     String string = "";
/* 2065 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2068 */         string = "Auto";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2090 */         return string;case 1: string = "4000x6000"; return string;case 2: string = "5000x7000"; return string;case 3: string = "8270x11690"; return string;case 4: string = "8500x11000"; return string;case 5: string = "8500x14000"; return string; }  string = "8270x11690"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_OriginalSize(String str, int nDefault) {
/* 2095 */     int value = nDefault;
/* 2096 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2098 */       if (str.equals("Auto"))
/*      */       {
/* 2100 */         value = 0;
/*      */       }
/* 2102 */       else if (str.equals("4000x6000"))
/*      */       {
/* 2104 */         value = 1;
/*      */       }
/* 2106 */       else if (str.equals("5000x7000"))
/*      */       {
/* 2108 */         value = 2;
/*      */       }
/* 2110 */       else if (str.equals("8270x11690"))
/*      */       {
/* 2112 */         value = 3;
/*      */       }
/* 2114 */       else if (str.equals("8500x11000"))
/*      */       {
/* 2116 */         value = 4;
/*      */       }
/* 2118 */       else if (str.equals("8500x14000"))
/*      */       {
/* 2120 */         value = 5;
/*      */       }
/*      */       else
/*      */       {
/* 2124 */         value = nDefault;
/* 2125 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2130 */       this.nErrorCode = 1;
/*      */     } 
/* 2132 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_ColorMode(int value) {
/* 2137 */     String string = "";
/* 2138 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2141 */         string = "B/W";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2154 */         return string;case 1: string = "Gray"; return string;case 2: string = "Color"; return string; }  string = "Color"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_ColorMode(String str, int nDefault) {
/* 2159 */     int value = nDefault;
/* 2160 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2162 */       if (str.equals("B/W"))
/*      */       {
/* 2164 */         value = 0;
/*      */       }
/* 2166 */       else if (str.equals("Gray"))
/*      */       {
/* 2168 */         value = 1;
/*      */       }
/* 2170 */       else if (str.equals("Color"))
/*      */       {
/* 2172 */         value = 2;
/*      */       }
/*      */       else
/*      */       {
/* 2176 */         value = nDefault;
/* 2177 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2182 */       this.nErrorCode = 1;
/*      */     } 
/* 2184 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_Resolution(int value) {
/* 2189 */     String string = "";
/* 2190 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2193 */         string = "150x150";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2209 */         return string;case 1: string = "200x200"; return string;case 2: string = "300x300"; return string;case 3: string = "600x600"; return string; }  string = "200x200"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_Resolution(String str, int nDefault) {
/* 2214 */     int value = nDefault;
/* 2215 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2217 */       if (str.equals("150x150"))
/*      */       {
/* 2219 */         value = 0;
/*      */       }
/* 2221 */       else if (str.equals("200x200"))
/*      */       {
/* 2223 */         value = 1;
/*      */       }
/* 2225 */       else if (str.equals("300x300"))
/*      */       {
/* 2227 */         value = 2;
/*      */       }
/* 2229 */       else if (str.equals("600x600"))
/*      */       {
/* 2231 */         value = 3;
/*      */       }
/*      */       else
/*      */       {
/* 2235 */         value = nDefault;
/* 2236 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2241 */       this.nErrorCode = 1;
/*      */     } 
/* 2243 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_ScanSide(int value) {
/* 2248 */     String string = "";
/* 2249 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2252 */         string = "Simplex-Down";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2265 */         return string;case 1: string = "Simplex-Up"; return string;case 2: string = "Duplex"; return string; }  string = "Simplex-Down"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_ScanSide(String str, int nDefault) {
/* 2270 */     int value = nDefault;
/* 2271 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2273 */       if (str.equals("Simplex-Down"))
/*      */       {
/* 2275 */         value = 0;
/*      */       }
/* 2277 */       else if (str.equals("Simplex-Up"))
/*      */       {
/* 2279 */         value = 1;
/*      */       }
/* 2281 */       else if (str.equals("Duplex"))
/*      */       {
/* 2283 */         value = 2;
/*      */       }
/*      */       else
/*      */       {
/* 2287 */         value = nDefault;
/* 2288 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2293 */       this.nErrorCode = 1;
/*      */     } 
/* 2295 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_DocumentType(int value) {
/* 2300 */     String string = "";
/* 2301 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2304 */         string = "Text";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2317 */         return string;case 1: string = "Photo"; return string;case 2: string = "Mixed"; return string; }  string = "Mixed"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_DocumentType(String str, int nDefault) {
/* 2322 */     int value = nDefault;
/* 2323 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2325 */       if (str.equals("Text"))
/*      */       {
/* 2327 */         value = 0;
/*      */       }
/* 2329 */       else if (str.equals("Photo"))
/*      */       {
/* 2331 */         value = 1;
/*      */       }
/* 2333 */       else if (str.equals("Mixed"))
/*      */       {
/* 2335 */         value = 2;
/*      */       }
/*      */       else
/*      */       {
/* 2339 */         value = nDefault;
/* 2340 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2345 */       this.nErrorCode = 1;
/*      */     } 
/* 2347 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_QualityFileSize(int value) {
/* 2352 */     String string = "";
/* 2353 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2356 */         string = "Normal";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2369 */         return string;case 1: string = "Higher"; return string;case 2: string = "Highest"; return string; }  string = "Higher"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_QualityFileSize(String str, int nDefault) {
/* 2374 */     int value = nDefault;
/* 2375 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2377 */       if (str.equals("Normal"))
/*      */       {
/* 2379 */         value = 0;
/*      */       }
/* 2381 */       else if (str.equals("Higher"))
/*      */       {
/* 2383 */         value = 1;
/*      */       }
/* 2385 */       else if (str.equals("Highest"))
/*      */       {
/* 2387 */         value = 2;
/*      */       }
/*      */       else
/*      */       {
/* 2391 */         value = nDefault;
/* 2392 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2397 */       this.nErrorCode = 1;
/*      */     } 
/* 2399 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_FileFormat(int value) {
/* 2404 */     String string = "";
/* 2405 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2408 */         string = "JPEG";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2427 */         return string;case 1: string = "PDF"; return string;case 2: string = "MPDF"; return string;case 3: string = "TIFF"; return string;case 4: string = "MTIFF"; return string; }  string = "MPDF"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_FileFormat(String str, int nDefault) {
/* 2432 */     int value = nDefault;
/* 2433 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2435 */       if (str.equals("JPEG"))
/*      */       {
/* 2437 */         value = 0;
/*      */       }
/* 2439 */       else if (str.equals("PDF"))
/*      */       {
/* 2441 */         value = 1;
/*      */       }
/* 2443 */       else if (str.equals("MPDF"))
/*      */       {
/* 2445 */         value = 2;
/*      */       }
/* 2447 */       else if (str.equals("TIFF"))
/*      */       {
/* 2449 */         value = 3;
/*      */       }
/* 2451 */       else if (str.equals("MTIFF"))
/*      */       {
/* 2453 */         value = 4;
/*      */       }
/*      */       else
/*      */       {
/* 2457 */         value = nDefault;
/* 2458 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2463 */       this.nErrorCode = 1;
/*      */     } 
/* 2465 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_Density(int value) {
/* 2470 */     String string = "";
/* 2471 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2474 */         string = "-3";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2499 */         return string;case 1: string = "-2"; return string;case 2: string = "-1"; return string;case 3: string = "0"; return string;case 4: string = "1"; return string;case 5: string = "2"; return string;case 6: string = "3"; return string; }  string = "0"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_Density(String str, int nDefault) {
/* 2504 */     int value = nDefault;
/* 2505 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2507 */       if (str.equals("-3"))
/*      */       {
/* 2509 */         value = 0;
/*      */       }
/* 2511 */       else if (str.equals("-2"))
/*      */       {
/* 2513 */         value = 1;
/*      */       }
/* 2515 */       else if (str.equals("-1"))
/*      */       {
/* 2517 */         value = 2;
/*      */       }
/* 2519 */       else if (str.equals("0"))
/*      */       {
/* 2521 */         value = 3;
/*      */       }
/* 2523 */       else if (str.equals("1"))
/*      */       {
/* 2525 */         value = 4;
/*      */       }
/* 2527 */       else if (str.equals("2"))
/*      */       {
/* 2529 */         value = 5;
/*      */       }
/* 2531 */       else if (str.equals("3"))
/*      */       {
/* 2533 */         value = 6;
/*      */       }
/*      */       else
/*      */       {
/* 2537 */         value = nDefault;
/* 2538 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2543 */       this.nErrorCode = 1;
/*      */     } 
/* 2545 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_Contrast(int value) {
/* 2550 */     String string = "";
/* 2551 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2554 */         string = "-2";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2573 */         return string;case 1: string = "-1"; return string;case 2: string = "0"; return string;case 3: string = "1"; return string;case 4: string = "2"; return string; }  string = "0"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_Contrast(String str, int nDefault) {
/* 2578 */     int value = nDefault;
/* 2579 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2581 */       if (str.equals("-2"))
/*      */       {
/* 2583 */         value = 0;
/*      */       }
/* 2585 */       else if (str.equals("-1"))
/*      */       {
/* 2587 */         value = 1;
/*      */       }
/* 2589 */       else if (str.equals("0"))
/*      */       {
/* 2591 */         value = 2;
/*      */       }
/* 2593 */       else if (str.equals("1"))
/*      */       {
/* 2595 */         value = 3;
/*      */       }
/* 2597 */       else if (str.equals("2"))
/*      */       {
/* 2599 */         value = 4;
/*      */       }
/*      */       else
/*      */       {
/* 2603 */         value = nDefault;
/* 2604 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2609 */       this.nErrorCode = 1;
/*      */     } 
/* 2611 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_AutoOrientation(boolean value) {
/* 2616 */     return SetBooleanToString(value);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean Get_AutoOrientation(String str) {
/* 2621 */     return GetBooleanByString(str);
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_RemoveBlankPage(int value) {
/* 2626 */     String string = "";
/* 2627 */     switch (value)
/*      */     
/*      */     { case 0:
/* 2630 */         string = "0%";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2649 */         return string;case 1: string = "25%"; return string;case 2: string = "50%"; return string;case 3: string = "75%"; return string;case 4: string = "100%"; return string; }  string = "0%"; this.nErrorCode = 1; return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public int Get_RemoveBlankPage(String str, int nDefault) {
/* 2654 */     int value = nDefault;
/* 2655 */     if (str != null && !str.isEmpty()) {
/*      */       
/* 2657 */       if (str.equals("0%"))
/*      */       {
/* 2659 */         value = 0;
/*      */       }
/* 2661 */       else if (str.equals("25%"))
/*      */       {
/* 2663 */         value = 1;
/*      */       }
/* 2665 */       else if (str.equals("50%"))
/*      */       {
/* 2667 */         value = 2;
/*      */       }
/* 2669 */       else if (str.equals("75%"))
/*      */       {
/* 2671 */         value = 3;
/*      */       }
/* 2673 */       else if (str.equals("100%"))
/*      */       {
/* 2675 */         value = 4;
/*      */       }
/*      */       else
/*      */       {
/* 2679 */         value = nDefault;
/* 2680 */         this.nErrorCode = 1;
/*      */       }
/*      */     
/*      */     } else {
/*      */       
/* 2685 */       this.nErrorCode = 1;
/*      */     } 
/* 2687 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String Set_MultiFeedDetection(boolean value) {
/* 2692 */     return SetBooleanToString(value);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean Get_MultiFeedDetection(String str) {
/* 2697 */     return GetBooleanByString(str);
/*      */   }
/*      */ 
/*      */   
/*      */   public String GetAdminCenterLog(int nBlankSpaces) {
/* 2702 */     String string = "";
/*      */ 
/*      */     
/* 2705 */     boolean bResult = true;
/* 2706 */     JSONObject jsonObj = new JSONObject();
/*      */ 
/*      */     
/*      */     try {
/* 2710 */       jsonObj.put(this._TimeStamp, this.TimeStamp);
/* 2711 */       jsonObj.put(this._HostName, this.HostName);
/* 2712 */       jsonObj.put(this._ProductName, this.ProductName);
/* 2713 */       jsonObj.put(this._ProductSN, this.ProductSN);
/* 2714 */       jsonObj.put(this._UserName, this.UserName);
/*      */       
/* 2716 */       jsonObj.put(this._VendorName, this.VendorName);
/* 2717 */       jsonObj.put(this._VID, this.VID);
/* 2718 */       jsonObj.put(this._PID, this.PID);
/* 2719 */       jsonObj.put(this._MFP_IP, this.MFP_IP);
/* 2720 */       jsonObj.put(this._MFP_MAC, this.MFP_MAC);
/* 2721 */       jsonObj.put(this._TonerSN, this.TonerSN);
/* 2722 */       jsonObj.put(this._EP_SN, this.EP_SN);
/* 2723 */       jsonObj.put(this._FuserSN, this.FuserSN);
/* 2724 */       jsonObj.put(this._PowerOnCount, this.PowerOnCount);
/* 2725 */       jsonObj.put(this._OverallPowerOnTime, this.OverallPowerOnTime);
/* 2726 */       jsonObj.put(this._OverallSleepTime, this.OverallSleepTime);
/* 2727 */       jsonObj.put(this._OverallIdleTime, this.OverallIdleTime);
/* 2728 */       jsonObj.put(this._ContinuePowerOnTime, this.ContinuePowerOnTime);
/* 2729 */       jsonObj.put(this._FwVersion, this.FwVersion);
/* 2730 */       jsonObj.put(this._EngineVersion, this.EngineVersion);
/* 2731 */       jsonObj.put(this._SystemVersion, this.SystemVersion);
/* 2732 */       jsonObj.put(this._FaxboardVersion, this.FaxboardVersion);
/* 2733 */       jsonObj.put(this._UI_Version, this.UI_Version);
/* 2734 */       jsonObj.put(this._HomepageVersion, this.HomepageVersion);
/* 2735 */       jsonObj.put(this._Tray3N4_FirmwareVersion, this.Tray3N4_FirmwareVersion);
/* 2736 */       jsonObj.put(this._FPGA_FirmwareVersion, this.FPGA_FirmwareVersion);
/* 2737 */       jsonObj.put(this._CSA6_FirmwareVersion, this.CSA6_FirmwareVersion);
/* 2738 */       jsonObj.put(this._CopyTotalTimes, this.CopyTotalTimes);
/* 2739 */       jsonObj.put(this._FB_LargePageScannedToCopy, this.FB_LargePageScannedToCopy);
/* 2740 */       jsonObj.put(this._FB_SmallPageScannedToCopy, this.FB_SmallPageScannedToCopy);
/* 2741 */       jsonObj.put(this._FB_TotalPageScannedToCopy, this.FB_TotalPageScannedToCopy);
/* 2742 */       jsonObj.put(this._ADF_LargePageScannedToCopy, this.ADF_LargePageScannedToCopy);
/* 2743 */       jsonObj.put(this._ADF_SmallPageScannedToCopy, this.ADF_SmallPageScannedToCopy);
/* 2744 */       jsonObj.put(this._ADF_TotalPageScannedToCopy, this.ADF_TotalPageScannedToCopy);
/* 2745 */       jsonObj.put(this._LargePageCountFromCopy, this.LargePageCountFromCopy);
/* 2746 */       jsonObj.put(this._SmallPageCountFromCopy, this.SmallPageCountFromCopy);
/* 2747 */       jsonObj.put(this._LargePageCountFromPCPrint, this.LargePageCountFromPCPrint);
/* 2748 */       jsonObj.put(this._SmallPageCountFromPCPrint, this.SmallPageCountFromPCPrint);
/* 2749 */       jsonObj.put(this._OverallLargePageCount, this.OverallLargePageCount);
/* 2750 */       jsonObj.put(this._OverallSmallPageCount, this.OverallSmallPageCount);
/* 2751 */       jsonObj.put(this._OverallPageCount, this.OverallPageCount);
/* 2752 */       jsonObj.put(this._LargePageCountOfThisLot, this.LargePageCountOfThisLot);
/* 2753 */       jsonObj.put(this._SmallPageCountOfThisLot, this.SmallPageCountOfThisLot);
/* 2754 */       jsonObj.put(this._PrintLargePageCountOfThisToner, this.PrintLargePageCountOfThisToner);
/* 2755 */       jsonObj.put(this._PrintSmallPageCountOfThisToner, this.PrintSmallPageCountOfThisToner);
/* 2756 */       jsonObj.put(this._PrintLargePageCountOfThisEP, this.PrintLargePageCountOfThisEP);
/* 2757 */       jsonObj.put(this._PrintSmallPageCountOfThisEP, this.PrintSmallPageCountOfThisEP);
/* 2758 */       jsonObj.put(this._PrintRunningTimeOfThisEP, this.PrintRunningTimeOfThisEP);
/* 2759 */       jsonObj.put(this._PrintLargePageCountOfThisFuser, this.PrintLargePageCountOfThisFuser);
/* 2760 */       jsonObj.put(this._PrintSmallPageCountOfThisFuser, this.PrintSmallPageCountOfThisFuser);
/* 2761 */       jsonObj.put(this._TotalPaperJamCount, this.TotalPaperJamCount);
/* 2762 */       jsonObj.put(this._MultifeedCount, this.MultifeedCount);
/* 2763 */       jsonObj.put(this._Jam01_Count, this.Jam01_Count);
/* 2764 */       jsonObj.put(this._Jam02_Count, this.Jam02_Count);
/* 2765 */       jsonObj.put(this._Jam03_Count, this.Jam03_Count);
/* 2766 */       jsonObj.put(this._Jam04_Count, this.Jam04_Count);
/* 2767 */       jsonObj.put(this._Jam05_Count, this.Jam05_Count);
/* 2768 */       jsonObj.put(this._Jam06_Count, this.Jam06_Count);
/* 2769 */       jsonObj.put(this._Jam07_Count, this.Jam07_Count);
/* 2770 */       jsonObj.put(this._Jam08_Count, this.Jam08_Count);
/* 2771 */       jsonObj.put(this._Jam09_Count, this.Jam09_Count);
/* 2772 */       jsonObj.put(this._Jam10_Count, this.Jam10_Count);
/* 2773 */       jsonObj.put(this._Jam11_Count, this.Jam11_Count);
/* 2774 */       jsonObj.put(this._Jam12_Count, this.Jam12_Count);
/* 2775 */       jsonObj.put(this._Jam13_Count, this.Jam13_Count);
/* 2776 */       jsonObj.put(this._Jam14_Count, this.Jam14_Count);
/* 2777 */       jsonObj.put(this._Jam15_Count, this.Jam15_Count);
/* 2778 */       jsonObj.put(this._Jam16_Count, this.Jam16_Count);
/* 2779 */       jsonObj.put(this._Jam17_Count, this.Jam17_Count);
/* 2780 */       jsonObj.put(this._Jam18_Count, this.Jam18_Count);
/* 2781 */       jsonObj.put(this._Jam19_Count, this.Jam19_Count);
/* 2782 */       jsonObj.put(this._Jam20_Count, this.Jam20_Count);
/* 2783 */       jsonObj.put(this._Jam21_Count, this.Jam21_Count);
/* 2784 */       jsonObj.put(this._Jam22_Count, this.Jam22_Count);
/* 2785 */       jsonObj.put(this._Jam23_Count, this.Jam23_Count);
/* 2786 */       jsonObj.put(this._JobCountForSimplexLargePage, this.JobCountForSimplexLargePage);
/* 2787 */       jsonObj.put(this._JobCountForSimplexSmallPage, this.JobCountForSimplexSmallPage);
/* 2788 */       jsonObj.put(this._JobCountForDuplexLargePage, this.JobCountForDuplexLargePage);
/* 2789 */       jsonObj.put(this._JobCountForDuplexSmallPage, this.JobCountForDuplexSmallPage);
/* 2790 */       jsonObj.put(this._PageCountFor3percTonerConsumeRate, this.PageCountFor3percTonerConsumeRate);
/* 2791 */       jsonObj.put(this._PageCountFor5percTonerConsumeRate, this.PageCountFor5percTonerConsumeRate);
/* 2792 */       jsonObj.put(this._PageCountFor7percTonerConsumeRate, this.PageCountFor7percTonerConsumeRate);
/* 2793 */       jsonObj.put(this._PageCountFor10percTonerConsumeRate, this.PageCountFor10percTonerConsumeRate);
/* 2794 */       jsonObj.put(this._PageCountFor20percTonerConsumeRate, this.PageCountFor20percTonerConsumeRate);
/* 2795 */       jsonObj.put(this._PageCountFor50percTonerConsumeRate, this.PageCountFor50percTonerConsumeRate);
/* 2796 */       jsonObj.put(this._PageCountOver50percTonerConsumeRate, this.PageCountOver50percTonerConsumeRate);
/* 2797 */       jsonObj.put(this._PickupRollerOfTray1, this.PickupRollerOfTray1);
/* 2798 */       jsonObj.put(this._PickupRollerOfTray2, this.PickupRollerOfTray2);
/* 2799 */       jsonObj.put(this._PickupRollerOfTray3, this.PickupRollerOfTray3);
/* 2800 */       jsonObj.put(this._PickupRollerOfTray4, this.PickupRollerOfTray4);
/* 2801 */       jsonObj.put(this._PickupRollerOfTrayM, this.PickupRollerOfTrayM);
/* 2802 */       jsonObj.put(this._FeedRollerOfTray1, this.FeedRollerOfTray1);
/* 2803 */       jsonObj.put(this._FeedRollerOfTray2, this.FeedRollerOfTray2);
/* 2804 */       jsonObj.put(this._FeedRollerOfTray3, this.FeedRollerOfTray3);
/* 2805 */       jsonObj.put(this._FeedRollerOfTray4, this.FeedRollerOfTray4);
/* 2806 */       jsonObj.put(this._ReverseRollerOfTray1, this.ReverseRollerOfTray1);
/* 2807 */       jsonObj.put(this._ReverseRollerOfTray2, this.ReverseRollerOfTray2);
/* 2808 */       jsonObj.put(this._ReverseRollerOfTray3, this.ReverseRollerOfTray3);
/* 2809 */       jsonObj.put(this._ReverseRollerOfTray4, this.ReverseRollerOfTray4);
/* 2810 */       jsonObj.put(this._PadOfManualTray, this.PadOfManualTray);
/* 2811 */       jsonObj.put(this._ScanPageCountFromPCScan, this.ScanPageCountFromPCScan);
/* 2812 */       jsonObj.put(this._PCScanTime, this.PCScanTime);
/* 2813 */       jsonObj.put(this._LargePageCountFromFB, this.LargePageCountFromFB);
/* 2814 */       jsonObj.put(this._SmallPageCountFromFB, this.SmallPageCountFromFB);
/* 2815 */       jsonObj.put(this._TotalPageCountFromFB, this.TotalPageCountFromFB);
/* 2816 */       jsonObj.put(this._LargePageCountFromADF, this.LargePageCountFromADF);
/* 2817 */       jsonObj.put(this._SmallPageCountFromADF, this.SmallPageCountFromADF);
/* 2818 */       jsonObj.put(this._TotalPageCountFromADF, this.TotalPageCountFromADF);
/* 2819 */       jsonObj.put(this._LargePageCountOfThisLotFromFB, this.LargePageCountOfThisLotFromFB);
/* 2820 */       jsonObj.put(this._SmallPageCountOfThisLotFromFB, this.SmallPageCountOfThisLotFromFB);
/* 2821 */       jsonObj.put(this._TotalPageCountOfThisLotFromFB, this.TotalPageCountOfThisLotFromFB);
/* 2822 */       jsonObj.put(this._LargePageCountOfThisLotFromADF, this.LargePageCountOfThisLotFromADF);
/* 2823 */       jsonObj.put(this._SmallPageCountOfThisLotFromADF, this.SmallPageCountOfThisLotFromADF);
/* 2824 */       jsonObj.put(this._TotalPageCountOfThisLotFromADF, this.TotalPageCountOfThisLotFromADF);
/* 2825 */       jsonObj.put(this._TotalPageCountOfThisLot, this.TotalPageCountOfThisLot);
/* 2826 */       jsonObj.put(this._SimplexPageCountFromADF, this.SimplexPageCountFromADF);
/* 2827 */       jsonObj.put(this._DuplexPageCountFromADF, this.DuplexPageCountFromADF);
/* 2828 */       jsonObj.put(this._ADF_SimplexPageScannedToCopy, this.ADF_SimplexPageScannedToCopy);
/* 2829 */       jsonObj.put(this._ADF_DuplexPageScannedToCopy, this.ADF_DuplexPageScannedToCopy);
/* 2830 */       jsonObj.put(this._PadOfADF, this.PadOfADF);
/* 2831 */       jsonObj.put(this._PickupRollerOfADF, this.PickupRollerOfADF);
/* 2832 */       jsonObj.put(this._ADF_PaperJamCount, this.ADF_PaperJamCount);
/* 2833 */       jsonObj.put(this._ScannerModuleScanTime, this.ScannerModuleScanTime);
/* 2834 */       jsonObj.put(this._LargePageCountSend, this.LargePageCountSend);
/* 2835 */       jsonObj.put(this._SmallPageCountSend, this.SmallPageCountSend);
/* 2836 */       jsonObj.put(this._TotalPageCountSend, this.TotalPageCountSend);
/* 2837 */       jsonObj.put(this._MFP_ErrorCount, this.MFP_ErrorCount);
/* 2838 */       jsonObj.put(this._RuntimeErrorCount, this.RuntimeErrorCount);
/* 2839 */       jsonObj.put(this._FuserErrorCount, this.FuserErrorCount);
/* 2840 */       jsonObj.put(this._ScannerModuleErrorCount, this.ScannerModuleErrorCount);
/* 2841 */       jsonObj.put(this._ScannerLampErrorCount, this.ScannerLampErrorCount);
/* 2842 */       jsonObj.put(this._MotorErrorCount, this.MotorErrorCount);
/* 2843 */       jsonObj.put(this._PrinterModuleErrorCount, this.PrinterModuleErrorCount);
/* 2844 */       jsonObj.put(this._WasteTonerCanFullCount, this.WasteTonerCanFullCount);
/* 2845 */       jsonObj.put(this._FaxModuleErrorCount, this.FaxModuleErrorCount);
/* 2846 */       jsonObj.put(this._JobType, this.JobType);
/* 2847 */       jsonObj.put(this._JobID, this.JobID);
/* 2848 */       jsonObj.put(this._JobSource, this.JobSource);
/* 2849 */       jsonObj.put(this._BigPageVolume, this.BigPageVolume);
/* 2850 */       jsonObj.put(this._SmallPageVolume, this.SmallPageVolume);
/* 2851 */       jsonObj.put(this._BigPaperVolumne, this.BigPaperVolumne);
/* 2852 */       jsonObj.put(this._SmallPaperVolumne, this.SmallPaperVolumne);
/* 2853 */       jsonObj.put(this._TargetImageMode, this.TargetImageMode);
/* 2854 */       jsonObj.put(this._TargetImageResolution, this.TargetImageResolution);
/* 2855 */       jsonObj.put(this._TargetImageFormat, this.TargetImageFormat);
/*      */       
/* 2857 */       jsonObj.put(this._JobToDest, this.JobToDest);
/* 2858 */       jsonObj.put(this._JobResult, this.JobResult);
/* 2859 */       jsonObj.put(this._JobName, this.JobName);
/* 2860 */       jsonObj.put(this._OrderNumber, this.OrderNumber);
/*      */       
/* 2862 */       jsonObj.put(this._Origin, this.Origin);
/* 2863 */       jsonObj.put(this._Type, this.Type);
/* 2864 */       jsonObj.put(this._Message, this.Message);
/* 2865 */       jsonObj.put(this._Description, this.Description);
/*      */       
/* 2867 */       jsonObj.put(this._Model, this.Model);
/* 2868 */       jsonObj.put(this._SN, this.SN);
/* 2869 */       jsonObj.put(this._JobSource, this.JobSource);
/* 2870 */       jsonObj.put(this._MachineStatus, this.MachineStatus);
/*      */       
/* 2872 */       jsonObj.put(this._TonerModelName, this.TonerModelName);
/* 2873 */       jsonObj.put(this._EPModelName, this.EPModelName);
/* 2874 */       jsonObj.put(this._TonerLifeTime, this.TonerLifeTime);
/* 2875 */       jsonObj.put(this._EPLifeTime, this.EPLifeTime);
/* 2876 */       jsonObj.put(this._TonerPageRemain, this.TonerPageRemain);
/* 2877 */       jsonObj.put(this._EPPageRemain, this.EPPageRemain);
/* 2878 */       jsonObj.put(this._TonerPagePrinted, this.TonerPagePrinted);
/* 2879 */       jsonObj.put(this._EPPagePrinted, this.EPPagePrinted);
/*      */       
/* 2881 */       jsonObj.put(this._Drum_SN, this.Drum_SN);
/* 2882 */       jsonObj.put(this._DrumModelName, this.DrumModelName);
/* 2883 */       jsonObj.put(this._DrumLifeTime, this.DrumLifeTime);
/* 2884 */       jsonObj.put(this._DrumPageRemain, this.DrumPageRemain);
/* 2885 */       jsonObj.put(this._DrumPagePrinted, this.DrumPagePrinted);
/* 2886 */       jsonObj.put(this._DrumUsageRemain, this.DrumUsageRemain);
/*      */     
/*      */     }
/* 2889 */     catch (JSONException e) {
/*      */       
/* 2891 */       e.printStackTrace();
/* 2892 */       bResult = false;
/* 2893 */       this.nErrorCode = 1;
/*      */     } 
/* 2895 */     if (bResult == true) {
/*      */       
/*      */       try {
/*      */         
/* 2899 */         if (nBlankSpaces > 0)
/*      */         {
/* 2901 */           string = jsonObj.toString(nBlankSpaces);
/*      */         }
/*      */         else
/*      */         {
/* 2905 */           string = jsonObj.toString();
/*      */         }
/*      */       
/* 2908 */       } catch (JSONException e1) {
/*      */         
/* 2910 */         e1.printStackTrace();
/* 2911 */         string = "";
/* 2912 */         this.nErrorCode = 1;
/*      */       } 
/*      */     }
/*      */     
/* 2916 */     return string;
/*      */   }
/*      */ 
/*      */   
/*      */   public String GetAdminCenterJobinformation(int nBlankSpaces) {
/* 2921 */     String string = "";
/*      */ 
/*      */     
/* 2924 */     boolean bResult = true;
/* 2925 */     JSONObject jsonObj = new JSONObject();
/*      */     
/*      */     try {
/* 2928 */       jsonObj.put("TimeStamp", this.TimeStamp);
/* 2929 */       jsonObj.put("HostName", this.HostName);
/* 2930 */       jsonObj.put("Model", this.ProductName);
/* 2931 */       jsonObj.put("SN", this.ProductSN);
/* 2932 */       jsonObj.put("JobID", this.JobID);
/* 2933 */       jsonObj.put("JobSource", "PrinterDriver");
/* 2934 */       jsonObj.put("UserName", "ta");
/*      */     }
/* 2936 */     catch (JSONException e) {
/*      */       
/* 2938 */       e.printStackTrace();
/* 2939 */       bResult = false;
/* 2940 */       this.nErrorCode = 1;
/*      */     } 
/* 2942 */     if (bResult == true) {
/*      */       
/*      */       try {
/*      */         
/* 2946 */         if (nBlankSpaces > 0)
/*      */         {
/* 2948 */           string = jsonObj.toString(nBlankSpaces);
/*      */         }
/*      */         else
/*      */         {
/* 2952 */           string = jsonObj.toString();
/*      */         }
/*      */       
/* 2955 */       } catch (JSONException e1) {
/*      */         
/* 2957 */         e1.printStackTrace();
/* 2958 */         string = "";
/* 2959 */         this.nErrorCode = 1;
/*      */       } 
/*      */     }
/*      */     
/* 2963 */     return string;
/*      */   }
/*      */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\APlusMgrInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */