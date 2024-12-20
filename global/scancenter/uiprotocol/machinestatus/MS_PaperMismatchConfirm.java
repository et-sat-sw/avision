/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_PaperMismatchConfirm
/*    */ {
/*  5 */   CONTINUE_PRINT(1), USER_CONFIRM(5);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_PaperMismatchConfirm(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_PaperMismatchConfirm findValueByCode(int code) {
/* 21 */     for (MS_PaperMismatchConfirm v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_PaperMismatchConfirm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */