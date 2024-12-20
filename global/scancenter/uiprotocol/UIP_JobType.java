/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ public enum UIP_JobType
/*    */ {
/*  5 */   UNKNOWN(0),
/*  6 */   PC_SCAN(1),
/*  7 */   PC_PRINT(2),
/*  8 */   COPY(3),
/*  9 */   FAX_SEND(4),
/* 10 */   INCOMING_FAX(5),
/* 11 */   STORAGE_COPY(6),
/* 12 */   COLOR_COPY(7),
/* 13 */   REPRINT_JOB(8),
/* 14 */   REPORT_PRINT(9),
/* 15 */   STORAGE_PRINT(10),
/* 16 */   EMAIL(11),
/* 17 */   WORKFLOW_SCANNING(12),
/* 18 */   FAX_SCAN(13),
/* 19 */   FAX_PRINT(14),
/* 20 */   SYSTEM_MAINTAIN(15),
/* 21 */   EMAIL_SEND(16),
/* 22 */   FTP_SEND(17),
/* 23 */   PC_FAX(18),
/* 24 */   ID_CARD_COPY(19),
/* 25 */   CIFS_SEND(20),
/* 26 */   FTP_SCAN(21),
/* 27 */   CIFS_SCAN(22),
/* 28 */   IMPORTANT_REPORT_PRINT(23),
/* 29 */   SCAN_TO_FLASH(24),
/* 30 */   CUSTOMIZED_WORKFLOW(25),
/* 31 */   EXTERNAL_SCANNER_COPY(26),
/* 32 */   APP_SCAN(27),
/* 33 */   COPY_SEPARATE(28),
/* 34 */   PRINT_MOBILE(29),
/* 35 */   PRINT_CLOUD(30),
/* 36 */   PRINT_CLOUD_BY_NUMBER(31),
/* 37 */   SCAN_TO_EMAIL(32),
/* 38 */   SCAN_TO_MOBILE(33),
/* 39 */   PRINT_CLOUD_PAID(34),
/* 40 */   CLOUD_SCAN(35),
/* 41 */   PRINT_CLOUD_ID_CARD(36),
/* 42 */   PRINT_CLOUD_BY_NUMBER_ID_CARD(37),
/* 43 */   PRINT_CLOUD_PAID_ID_CARD(38);
/*    */ 
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */ 
/*    */   
/*    */   UIP_JobType(int numVal) {
/* 51 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 56 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_JobType findValueByCode(int code) {
/* 61 */     for (UIP_JobType v : values()) {
/* 62 */       if (v.getCode() == code)
/* 63 */         return v; 
/*    */     } 
/* 65 */     return UNKNOWN;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_JobType findValueByName(String code) {
/* 70 */     for (UIP_JobType v : values()) {
/* 71 */       if (v.name().equals(code))
/* 72 */         return v; 
/*    */     } 
/* 74 */     return UNKNOWN;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_JobType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */