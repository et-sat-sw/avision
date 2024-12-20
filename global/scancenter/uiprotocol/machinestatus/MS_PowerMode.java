/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_PowerMode
/*    */ {
/*  5 */   NORMAL(0),
/*  6 */   ECONOMY(1),
/*    */   
/*  8 */   OFF(255);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_PowerMode(int numVal) {
/* 14 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 19 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_PowerMode findValueByCode(int code) {
/* 24 */     for (MS_PowerMode v : values()) {
/*    */       
/* 26 */       if (v.getCode() == code)
/* 27 */         return v; 
/*    */     } 
/* 29 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_PowerMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */