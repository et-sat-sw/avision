/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_AioControl
/*    */ {
/*  5 */   CONTROL_DEFAULT(0), CONTROL_NORMAL(1), CONTROL_STOP_PRINT(2), CONTROL_SLOW(3);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_AioControl(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_AioControl findValueByCode(int code) {
/* 21 */     for (MS_AioControl v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_AioControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */