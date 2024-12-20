/*     */ package global.scancenter.uiprotocol;
/*     */ 
/*     */ public enum UIP_AccessMode {
/*   4 */   SVJ_NewFolder(1),
/*   5 */   SVJ_DeleteFolder(2),
/*   6 */   SVJ_GetFolderList(3),
/*   7 */   SVJ_DeleteJob(4),
/*   8 */   SVJ_GetJobList(5),
/*   9 */   SVJ_GetUsbEntryList(6),
/*  10 */   SVJ_GetLastUsbEntryList(7),
/*  11 */   SVJ_NewUsbFolder(8),
/*     */   
/*  13 */   SCT_GetFile(20),
/*  14 */   SCT_GetFileList(21),
/*  15 */   SCT_GetJobList(22),
/*  16 */   SCT_GetFolderList(23),
/*  17 */   SCT_NewFolder(24),
/*  18 */   SCT_DeleteFile(25),
/*  19 */   SCT_DeleteJob(26),
/*  20 */   SCT_DeleteFolder(27),
/*  21 */   SCT_EmptyOutFolder(28),
/*  22 */   SCT_DeleteAllJob(29),
/*  23 */   SCT_DeleteJobByDate(30),
/*  24 */   SCT_SetAutoCleanJob(31),
/*  25 */   SCT_DisableAutoCleanJob(32),
/*  26 */   SCT_GetProfileList(33),
/*     */   
/*  28 */   ADB_GetEmailList(40),
/*  29 */   ADB_GetGroupList(41),
/*  30 */   ADB_NewEmail(42),
/*  31 */   ADB_UpdateEmail(43),
/*  32 */   ADB_DeleteEmail(44),
/*  33 */   ADB_NewGroup(45),
/*  34 */   ADB_UpdateGroup(46),
/*  35 */   ADB_DeleteGroup(47),
/*     */   
/*  37 */   FAX_GetConfig(60),
/*  38 */   FAX_SetConfig(61),
/*     */   
/*  40 */   SYS_UsbStatus(70),
/*  41 */   SYS_CSA6Status(71),
/*  42 */   SYS_UsbReflash(72),
/*     */   
/*  44 */   ACJ_GetJobList(80),
/*  45 */   ACJ_GetJobDetail(81),
/*  46 */   ACJ_DeleteJob(82),
/*  47 */   ACJ_DeleteAllJob(83),
/*  48 */   ACJ_GetCompletedJobList(84),
/*  49 */   ACJ_DeleteJobByDate(85),
/*  50 */   ACJ_DeleteJobByType(86),
/*  51 */   ACJ_SetAutoCleanTime(87),
/*     */   
/*  53 */   DEV_GetAvailableTray(100),
/*  54 */   DEV_GetTrayInfo(101),
/*  55 */   DEV_SetTrayInfo(102),
/*  56 */   DEV_SetAllTrayInfo(103),
/*  57 */   DEV_GetNoMatchPaperInfo(104),
/*  58 */   DEV_SetSpoolerSwitch(105),
/*  59 */   DEV_GetSpoolerSwitch(106),
/*  60 */   DEV_GetPrinterAvailable(107),
/*  61 */   DEV_EnforcePrint(108),
/*  62 */   DEV_SetScannerAutoDetection(109),
/*  63 */   DEV_RecoverScannerError(110),
/*  64 */   DEV_GetAdfStatus(111),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   ACC_GetUserList(130),
/*  70 */   ACC_NewUser(131),
/*  71 */   ACC_GetUserInfo(132),
/*  72 */   ACC_SetUserInfo(133),
/*  73 */   ACC_UpdateUser(134),
/*  74 */   ACC_DeleteUsers(135),
/*  75 */   ACC_SetPassword(136),
/*  76 */   ACC_SetUsageLimit(137),
/*  77 */   ACC_GetAuthMode(138),
/*  78 */   ACC_SetAuthMode(139),
/*  79 */   ACC_GetOverQuota(140),
/*  80 */   ACC_SetOverQuota(141),
/*  81 */   ACC_ResetUsageCount(142),
/*  82 */   ACC_ResetToDefault(143),
/*  83 */   ACC_GetPassword(144),
/*  84 */   ACC_GetUserByPin(145),
/*  85 */   ACC_CheckLogin(146),
/*  86 */   ACC_CheckMachinePwd(147),
/*  87 */   ACC_GetCloudPrintJob(148),
/*     */   
/*  89 */   DEF_GetCopyService(160),
/*  90 */   DEF_SetCopyService(161),
/*  91 */   DEF_GetScanService(162),
/*  92 */   DEF_SetScanService(163),
/*  93 */   DEF_GetEmailService(164),
/*  94 */   DEF_SetEmailService(165),
/*  95 */   DEF_GetFaxService(166),
/*  96 */   DEF_SetFaxService(167),
/*  97 */   DEF_GetIdCardService(168),
/*  98 */   DEF_SetIdCardService(169),
/*  99 */   DEF_GetFastCopyService(170),
/* 100 */   DEF_SetFastCopyService(171),
/* 101 */   DEF_GetTicketCopyService(172),
/* 102 */   DEF_SetTicketCopyService(173),
/* 103 */   DEF_GetNormalCopyService(174),
/* 104 */   DEF_SetNormalCopyService(175),
/* 105 */   DEF_GetStorageCopyService(176),
/* 106 */   DEF_SetStorageCopyService(177),
/*     */   
/* 108 */   DEF_GetEnableBlankDetect(190),
/* 109 */   DEF_SetEnableBlankDetect(191),
/*     */   
/* 111 */   ACC_Logout(200),
/*     */   
/* 113 */   LDAP_GetEmailList(220);
/*     */ 
/*     */   
/*     */   private int _numVal;
/*     */ 
/*     */   
/*     */   UIP_AccessMode(int numVal) {
/* 120 */     this._numVal = numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCode() {
/* 125 */     return this._numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public static UIP_AccessMode findValueByCode(int code) {
/* 130 */     for (UIP_AccessMode v : values()) {
/*     */       
/* 132 */       if (v.getCode() == code)
/* 133 */         return v; 
/*     */     } 
/* 135 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_AccessMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */