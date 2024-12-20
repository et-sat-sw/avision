/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_ReportPrintType
/*    */ {
/*  5 */   DEMO_PAGE(0),
/*  6 */   SYSTEM_CONFIGURATION_REPORT(1),
/*  7 */   SYSTEM_MENU_MAP(2),
/*  8 */   SYSTEM_USAGE_REPORT(3),
/*  9 */   SYSTEM_INFORMATION_REPORT(4),
/* 10 */   STORAGE_LIST_REPORT(5),
/* 11 */   FAX_ACTIVITY_REPORT(6),
/* 12 */   ADDRESS_BOOK(7),
/* 13 */   BLOCK_FAX(8),
/* 14 */   NETWORK_SETTINGS_REPORT(9),
/* 15 */   SUPPLIESPAGE_REPORT(16),
/* 16 */   SMTP_REPORT(4097),
/* 17 */   FTP_REPORT(4098),
/* 18 */   CIFS_REPORT(4099),
/* 19 */   SEND_METER(4100);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_ReportPrintType(int numVal) {
/* 25 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 30 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_ReportPrintType findValueByCode(int code) {
/* 35 */     for (MS_ReportPrintType v : values()) {
/*    */       
/* 37 */       if (v.getCode() == code)
/* 38 */         return v; 
/*    */     } 
/* 40 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_ReportPrintType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */