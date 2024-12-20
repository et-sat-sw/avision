/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_SwitchOption
/*    */ {
/*  5 */   ENABLE(1), DISABLE(0);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_SwitchOption(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_SwitchOption findValueByCode(int code) {
/* 21 */     for (MS_SwitchOption v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_SwitchOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */