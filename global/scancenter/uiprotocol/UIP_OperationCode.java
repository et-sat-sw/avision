/*     */ package global.scancenter.uiprotocol;
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum UIP_OperationCode
/*     */ {
/*   7 */   OPERATION_OK(1, 99, 0, 0, 0, "Operation OK"),
/*   8 */   OPERATION_WITH_INVALID_PARAMETERS(2, 99, 0, 0, 2, "Operation with invalid parameters"),
/*   9 */   OPERATION_FAILED(3, 11, 0, 0, 2, "Operation failed"),
/*  10 */   OPERATION_NOT_SUPPORTED(4, 99, 0, 0, 2, "Operation not supported"),
/*  11 */   WRONG_CHECK_SUM_DETECTED(5, 99, 0, 0, 2, "Wrong check sum detected"),
/*  12 */   MFP_NOT_READY(7, 11, 10, 0, 2, "MFP not ready"),
/*  13 */   SYSTEM_NOT_READY(8, 99, 0, 0, 2, "System not ready"),
/*  14 */   RESOURCES_CONFLICT(4097, 99, 0, 0, 2, "Resources conflict"),
/*  15 */   STORAGE_FULL(4098, 11, 10, 0, 2, "Storage full"),
/*  16 */   STORAGE_NOT_EXISTED(4099, 99, 0, 0, 2, "Storage not existed"),
/*  17 */   STORAGE_RW_FAIL(4100, 11, 0, 0, 2, "Storage RW Fail"),
/*  18 */   MEMORY_FULL(4101, 99, 0, 0, 2, "Memory Full"),
/*  19 */   ADF_PAPER_JAM(8449, 99, 0, 1, 2, "ADF paper jam"),
/*  20 */   ADF_COVER_OPEN(8450, 99, 0, 1, 2, "ADF cover open"),
/*  21 */   WATERMARK_FAIL(12289, 99, 0, 0, 2, "Watermark fail"),
/*  22 */   TRAY_NOT_SUIT(12290, 50, 10, 0, 2, "Tray not suit"),
/*  23 */   JOB_CONFLICT_WITH_PRINTING_JOB(12291, 99, 0, 0, 2, "Job conflict with printing job"),
/*  24 */   TRAY_NOT_READY(12292, 11, 10, 0, 2, "Tray not ready"),
/*  25 */   CANNOT_ENTER_INTERRUPT_PRINT(12293, 11, 10, 0, 2, "Cannot enter interrupt print"),
/*  26 */   EXTERNAL_PRINTER_NOT_CONNECTED(20481, 99, 0, 0, 2, "External printer not connected"),
/*  27 */   EXTERNAL_PRINTER_BUSY(20482, 99, 0, 0, 2, "External printer busy"),
/*  28 */   OPERATION_NOT_AUTHORIZED(24577, 99, 0, 0, 2, "Operation not authorized"),
/*  29 */   ACCOUNT_NOT_FOUND(24578, 99, 0, 0, 2, "Account not found"),
/*  30 */   ACCOUNT_EXISTED_ALREADY(24579, 99, 0, 0, 2, "Account existed already"),
/*  31 */   ACCOUNT_FULL(24580, 99, 0, 0, 2, "Account full"),
/*  32 */   ACCOUNT_CANNOT_BE_DELETED(24581, 99, 0, 0, 2, "Account cannot be deleted"),
/*  33 */   IMPRESSION_LIMITED(24582, 11, 10, 0, 3, "Impression limited"),
/*  34 */   FOLDER_EXISTED_ALREADY(28673, 99, 0, 0, 2, "Folder existed already"),
/*  35 */   FOLDER_NOT_EXISTED(28674, 50, 10, 0, 2, "Folder not existed"),
/*  36 */   JOB_NOT_EXISTED(28675, 99, 0, 0, 2, "Job not existed"),
/*  37 */   JOB_EXISTED_ALREADY(28676, 99, 0, 0, 2, "Job existed already"),
/*  38 */   FOLDER_CANNOT_BE_DELETED(28677, 99, 0, 0, 2, "Folder cannot be deleted"),
/*  39 */   JOB_IN_USE(28678, 99, 0, 0, 2, "Job in use"),
/*  40 */   FILE_NOT_OPENED(28679, 99, 0, 0, 2, "File not opened"),
/*  41 */   END_OF_FILE(28680, 99, 0, 0, 2, "End of file"),
/*  42 */   FILE_NOT_FOUND(28681, 50, 10, 0, 2, "File not found"),
/*  43 */   FILE_OPENED(28682, 99, 0, 0, 2, "File opened"),
/*  44 */   INVALID_PATH(28683, 99, 0, 0, 2, "Invalid path"),
/*  45 */   USB_FLASH_NOT_READY(28684, 99, 0, 0, 2, "USB flash not ready"),
/*  46 */   INVALID_PASSWORD(28685, 11, 10, 0, 2, "Invalid password"),
/*  47 */   PDF_FILE_SIZE_OVER_LIMITATION(28686, 50, 10, 0, 2, "PDF file size over limitation"),
/*  48 */   FOLDER_NUMBER_LIMITATION_REACHED(28687, 99, 0, 0, 2, "Folder number limitation reached"),
/*  49 */   JOB_IS_CANCELLING(36865, 99, 0, 0, 2, "Job is cancelling"),
/*  50 */   DATA_NOT_READY(36866, 99, 0, 0, 2, "Data not ready"),
/*  51 */   END_OF_PAGE(36867, 99, 0, 0, 2, "End of page"),
/*  52 */   NO_FAX_TRANSMISSION(40961, 99, 0, 0, 2, "No FAX transmission"),
/*  53 */   RESET_FAILED(45057, 99, 0, 0, 2, "Reset failed"),
/*  54 */   SYSTEM_NOT_IDLE(45058, 99, 0, 0, 2, "System not idle"),
/*  55 */   PAPER_EMPTY_JOB_ABORT(45059, 11, 0, 1, 2, "Paper empty. Job abort"),
/*  56 */   NO_MATCH_PAPER_JOB_ABORT(45060, 11, 0, 1, 2, "No match paper. Job abort"),
/*  57 */   PAPER_NO_SUPPORT(45061, 99, 0, 0, 2, "Paper no support"),
/*  58 */   RESTORE_FAIL(45062, 11, 10, 0, 2, "Restore Fail"),
/*  59 */   TRANSMISSION_STALL(53249, 99, 0, 0, 2, "Transmission stall"),
/*  60 */   ALL_PIPES_OCCUPIED(53250, 99, 0, 0, 2, "All pipes occupied"),
/*  61 */   PIPE_NOT_FOUND(53251, 99, 0, 0, 2, "Pipe not found"),
/*  62 */   EXCEED_EMAIL_RECIPIENTS_LIMIT(16777217, 11, 10, 0, 2, "Exceed allowable limit"),
/*  63 */   NO_EMAIL_RECIPIENTS(16777218, 11, 10, 0, 2, "No recipients added"),
/*  64 */   NO_EMAIL_FROM_ADDRESS(16777219, 11, 10, 0, 2, "No from address added"),
/*  65 */   LOGIN_FAILED(16777220, 11, 0, 0, 2, "Login failed"),
/*  66 */   NO_ENTRIES_FOUND(16777229, 11, 10, 0, 2, "No entries found"),
/*  67 */   USB_FLASH_NOT_FOUND(16777232, 11, 10, 0, 2, "USB flash disk not found"),
/*  68 */   GROUP_MEMBER_EXCEED_LIMIT(16777234, 11, 10, 0, 2, "Number of group member exceeds limitation"),
/*  69 */   SCANTO_JOB_TRANSFER_FAILED(16777235, 11, 0, 0, 2, "Scan To job transfer failed"),
/*  70 */   ADF_TRAY_EMPTY(16777236, 11, 0, 0, 2, "ADF Tray Empty"),
/*     */   
/*  72 */   INVALID_LOGIN_NAME_PASSWORD(16777238, 11, 30, 0, 2, "Invalid login name or password"),
/*  73 */   SETTING_FAILED(16777241, 11, 0, 0, 2, "Setting failed"),
/*  74 */   JOB_FAIL_IN_INTERRUPT_PRINT(16777242, 99, 0, 0, 2, "This function can not be done in interrupt print"),
/*  75 */   ADDRESS_BOOK_EXCEED_LIMIT(16777248, 11, 10, 0, 2, "Number of address book exceeds limitation"),
/*  76 */   GROUP_EXCEED_LIMIT(16777249, 11, 10, 0, 2, "Number of groups exceeds limitation"),
/*  77 */   ERROR_IN_PRINT_PDF_OVER_32MB(16777254, 11, 10, 0, 2, "Error in printing PDF file over 32 MB"),
/*     */   
/*  79 */   ONLY_DISPLAY_FIRST_100_FILE(16777256, 11, 10, 0, 2, "Note:Only the first 100 files will be displayed in the list"),
/*  80 */   AUTO_SELECT_NOT_SUPPORT_A6(16777257, 99, 0, 0, 2, "Warning: Auto-Select doest not support A6 size. Please change to Manual"),
/*  81 */   JOB_NUMBER_EXCEED_SYSTEM_LIMIT(16777259, 11, 10, 0, 2, "Exceeds the system limit. Please add a new folder"),
/*     */   
/*  83 */   STORAGE_SIZE_EXCEED_SYSTEM_LIMIT(16777261, 11, 10, 0, 2, "Exceeds the system limit. Please delete unnecessary files"),
/*  84 */   ONLY_DISPLAY_FIRST_500_CONTRACTS(16777263, 11, 10, 0, 2, "Only the first 500 contacts will be displayed in the list"),
/*  85 */   SCANTO_CONNECTION_FAILED(16777264, 11, 10, 0, 2, "Connection failed"),
/*  86 */   DELETE_FILE_FAILED(16777280, 50, 10, 0, 2, "Delete file fail"),
/*  87 */   RESET_DEFAULT_FAILED(16777296, 11, 10, 0, 2, "Reset default failed"),
/*  88 */   RESET_PAD_COUNT_FAILED(16777297, 11, 10, 0, 2, "Reset pad count failed"),
/*  89 */   RECALIBRATION_FAILED(16777298, 11, 0, 0, 2, "Recalibration failed"),
/*  90 */   RESET_PAGE_COUNT_FAILED(16777299, 11, 10, 0, 2, "Reset page count failed"),
/*  91 */   RESET_FUSER_COUNT_FAILED(16777300, 11, 10, 0, 2, "Reset fuser count failed"),
/*  92 */   OPERATION_NG(268435456, 99, 0, 0, 2, "Operation NG"),
/*  93 */   OPERATION_TIMEOUT(268435457, 99, 0, 0, 2, "Operation timeout"),
/*  94 */   OPERATION_NG_2(268435458, 99, 0, 0, 2, "Data Buffer Not Enough"),
/*  95 */   OPERATION_NG_3(268435459, 99, 0, 0, 2, "Invalid Parameter"),
/*  96 */   OPERATION_NG_4(268435460, 99, 0, 0, 2, "Buffer Allocate Fail"),
/*  97 */   OPERATION_NG_5(268435461, 99, 0, 0, 2, "File Not Opened"),
/*  98 */   OPERATION_NG_6(268435462, 99, 0, 0, 2, "Send Request Fail"),
/*  99 */   OPERATION_NG_7(268435463, 99, 0, 0, 2, "Request Array Full");
/*     */   
/*     */   private int _numVal;
/*     */   
/*     */   private String _description;
/*     */   private int _priority;
/*     */   private int _timeout;
/*     */   private int _reserve;
/*     */   private int _type;
/*     */   
/*     */   UIP_OperationCode(int numVal, int priority, int timeout, int reserve, int type, String description) {
/* 110 */     this._numVal = numVal;
/* 111 */     this._description = description;
/* 112 */     this._priority = priority;
/* 113 */     this._timeout = timeout;
/* 114 */     this._reserve = reserve;
/* 115 */     this._type = type;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescription() {
/* 120 */     return this._description;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCode() {
/* 125 */     return this._numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPriority() {
/* 130 */     return this._priority;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTimeout() {
/* 135 */     return this._timeout;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getReserve() {
/* 140 */     return this._reserve;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getType() {
/* 145 */     return this._type;
/*     */   }
/*     */ 
/*     */   
/*     */   public static UIP_OperationCode findValueByCode(int code) {
/* 150 */     for (UIP_OperationCode v : values()) {
/*     */       
/* 152 */       if (v.getCode() == code)
/* 153 */         return v; 
/*     */     } 
/* 155 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_OperationCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */