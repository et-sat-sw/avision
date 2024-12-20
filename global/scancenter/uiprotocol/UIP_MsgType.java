/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ public enum UIP_MsgType
/*    */ {
/*  5 */   SYSTEM_STATUS(61440),
/*  6 */   JOB_STATE(16384),
/*  7 */   JOB_STATUS(16385),
/*  8 */   DNT_STATUS(16386),
/*  9 */   PRINTER_STATUS(8193),
/* 10 */   SCANNER_STATUS(8449),
/* 11 */   CSA6_STATUS(8450),
/* 12 */   FAX_STATUS(8705),
/* 13 */   USB_STATUS(8961),
/* 14 */   RESPONSE_STATUS(12289);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   UIP_MsgType(int numVal) {
/* 20 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 25 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_MsgType findValueByCode(int code) {
/* 30 */     for (UIP_MsgType v : values()) {
/*    */       
/* 32 */       if (v.getCode() == code)
/* 33 */         return v; 
/*    */     } 
/* 35 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_MsgType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */