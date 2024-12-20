/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_UsbMode
/*    */ {
/*  5 */   AUTO_MODE(1), PICT_BRIDGE_MODE(5);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_UsbMode(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_UsbMode findValueByCode(int code) {
/* 21 */     for (MS_UsbMode v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_UsbMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */