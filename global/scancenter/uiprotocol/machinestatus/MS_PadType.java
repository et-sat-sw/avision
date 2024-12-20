/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_PadType
/*    */ {
/*  5 */   RESET_COUNT_MODE_ADF(0), RESET_COUNT_MODE_MANUAL_TRAY(5);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_PadType(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_PadType findValueByCode(int code) {
/* 21 */     for (MS_PadType v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_PadType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */