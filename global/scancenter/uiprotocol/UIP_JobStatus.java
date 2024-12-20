/*     */ package global.scancenter.uiprotocol;
/*     */ 
/*     */ 
/*     */ public enum UIP_JobStatus
/*     */ {
/*   6 */   WAIT_NEXT_SCAN(1, 1, 0, 1, 0, "Wait for next scanning", 0),
/*   7 */   WAIT_ERROR_HANDLE_MEMORY_FULL(2, 11, 10, 0, 2, "Wait for error handling(Memory Full)", 0),
/*   8 */   WAIT_ERROR_HANDLE_SCAN_ERROR(3, 99, 0, 1, 2, "Wait for error handling(Scan Error)", 0),
/*   9 */   WAIT_PREVIEW(4, 1, 0, 1, 0, "Wait for preview", 0),
/*  10 */   WAIT_ERROR_HANDLE_PDF_EXCEED_SIZE(5, 11, 30, 0, 2, "Wait for error handling(PDF file exceed max pages)", 0),
/*  11 */   WAIT_DROPNTAKE_COPY_COUNT(6, 11, 0, 0, 0, "Wait for UI response copy count", 0),
/*  12 */   WAIT_NEXT_PRINT(7, 1, 0, 1, 0, "Wait for next printing", 0),
/*  13 */   EXTRACOPYCNT(8, 1, 0, 1, 0, "Extra copy count", 0),
/*  14 */   MEMORY_FULL(4097, 1, 10, 0, 2, "Memory full error", 0),
/*  15 */   STORAGE_RW_FAIL(4098, 11, 10, 0, 2, "Storage RW fail", 0),
/*  16 */   CONNECT_FAIL(4099, 11, 10, 0, 2, "Device connect fail", 0),
/*  17 */   LIMIT_REACHED(4100, 11, 10, 0, 2, "Limits Reached", 0),
/*  18 */   TRAY_NOT_SUIT(4101, 11, 10, 0, 2, "Tray not suit", 0),
/*  19 */   FOLDER_NOT_EXISTED(4102, 11, 10, 0, 2, "Folder is not existed", 0),
/*  20 */   JOB_NAME_IS_EXISTED(4103, 11, 10, 0, 2, "Job Name is existed", 0),
/*  21 */   CHANGE_SETTING(8193, 11, 10, 0, 2, "Change setting", 0),
/*  22 */   IMAGE_PROCESSING_ERROR(8449, 11, 10, 0, 2, "Image processing error", 0),
/*  23 */   MULTICARD_DETECTED_ERROR(8450, 11, 10, 0, 2, "Multicard detected error", 0),
/*  24 */   IDCARD_COPY_FAILED(8451, 11, 10, 0, 2, "ID card copy fail", 0),
/*  25 */   SIMPLEX_PRINT_REPLACE_DUPLEX(12289, 99, 0, 1, 2, "Duplex printing replaced by simplex", 0),
/*  26 */   NO_SUFFICIENT_PRIVILEGE(12290, 11, 10, 0, 2, "No sufficient privilege (for CSA6)", 0),
/*  27 */   IMAGES_ARE_BLANK_PAGES(12291, 12, 10, 0, 2, "The images are blank pages", 0),
/*  28 */   THUMB_READY_FOR_DROPNTAKE(16385, 99, 0, 1, 0, "Thumbnail ready for Drop N Take", 0),
/*  29 */   CAN_NOT_PRINT_PDF_FILE(28673, 11, 10, 0, 0, "Cannot print the PDF file", 0),
/*  30 */   JOB_NUMBER_LIMIT_REACHED(28674, 11, 10, 0, 2, "Job number limitation reached", 0),
/*  31 */   PAGE_READY_TO_PROCESS(32769, 99, 0, 1, 0, "Page ready to process", 0),
/*  32 */   NO_MORE_PAGES_TO_PROCESS(32770, 99, 0, 1, 0, "No more pages to process", 0),
/*  33 */   DATA_READY_FOR_FTP(36865, 11, 0, 1, 0, "Data ready for FTP", 0),
/*  34 */   DATA_READY_FOR_EMAIL(36866, 99, 0, 1, 0, "Data ready for Email", 0),
/*  35 */   UNABLE_TO_DISPATCH_EMAIL(36867, 99, 10, 0, 0, "Unable to dispatch Email", 0),
/*  36 */   WAIT_ERROR_HANDLE_EXCEED_ATTACHMENT(36868, 50, 30, 0, 0, "Wait for error handling(Exceed the Attachment", 0),
/*  37 */   PAGE_READY_FOR_SCAN_APP(36869, 99, 0, 1, 0, "Page ready for Scan to App", 0),
/*  38 */   COMMUNICATION_ERROR(40961, 11, 10, 0, 0, "Communication error", 0),
/*  39 */   FW_UPDATE(49153, 99, 0, 1, 0, "FW to update", 0),
/*  40 */   PREPARE_COPY(61441, 6, 2, 0, 0, "Preparing to copy...", 0),
/*  41 */   UNDEFINED_ERROR(65535, 11, 0, 1, 3, "Undefined error", 0);
/*     */   
/*     */   private int _numVal;
/*     */   
/*     */   private int _priority;
/*     */   private int _timeout;
/*     */   private int _reserve;
/*     */   private String _description;
/*     */   private int _id;
/*     */   private int _type;
/*     */   
/*     */   UIP_JobStatus(int numVal, int priority, int timeout, int reserve, int type, String description, int id) {
/*  53 */     this._numVal = numVal;
/*  54 */     this._priority = priority;
/*  55 */     this._timeout = timeout;
/*  56 */     this._reserve = reserve;
/*  57 */     this._type = type;
/*  58 */     this._description = description;
/*  59 */     this._id = id;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCode() {
/*  64 */     return this._numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPriority() {
/*  69 */     return this._priority;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTimeout() {
/*  74 */     return this._timeout;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescription() {
/*  79 */     return this._description;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getStringId() {
/*  84 */     return this._id;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getType() {
/*  89 */     return this._type;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getReserve() {
/*  94 */     return this._reserve;
/*     */   }
/*     */   
/*     */   public static UIP_JobStatus findValueByCode(int value) {
/*  98 */     for (UIP_JobStatus v : values()) {
/*     */       
/* 100 */       if (v.getCode() == value)
/* 101 */         return v; 
/*     */     } 
/* 103 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_JobStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */