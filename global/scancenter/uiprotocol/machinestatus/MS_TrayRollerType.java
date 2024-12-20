/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_TrayRollerType
/*    */ {
/*  5 */   TRAY1(1), TRAY2(2), TRAY3(3), TRAY4(4);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_TrayRollerType(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_TrayRollerType findValueByCode(int code) {
/* 21 */     for (MS_TrayRollerType v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_TrayRollerType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */