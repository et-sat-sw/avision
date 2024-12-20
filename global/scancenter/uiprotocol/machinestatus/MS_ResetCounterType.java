/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_ResetCounterType
/*    */ {
/*  5 */   RESET_PAGE_COUNT(0), RESET_ADF_SCAN_COUNT(1), RESET_FB_SCAN_COUNT(2), RESET_PC_SCAN_COUNT(3),
/*  6 */   RESET_EP_COUNT(4), RESET_TONER_COUNT(5), RESET_PRINT_ERROR_COUNT(6),
/*  7 */   RESET_SCAN_ERROR_COUNT(7), RESET_PRINTER_JAM_COUNT(8), ADF_PAPER_JAM_COUNT(9),
/*  8 */   MFP_ERROR_COUNT(10), FAX_MODULE_ERROR_COUNT(11);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_ResetCounterType(int numVal) {
/* 14 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 19 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_ResetCounterType findValueByCode(int code) {
/* 24 */     for (MS_ResetCounterType v : values()) {
/*    */       
/* 26 */       if (v.getCode() == code)
/* 27 */         return v; 
/*    */     } 
/* 29 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_ResetCounterType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */