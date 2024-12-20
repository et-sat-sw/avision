/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_RestoreSpecificData
/*    */ {
/*  5 */   SCANNER(0), PRINTER(1);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_RestoreSpecificData(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_RestoreSpecificData findValueByCode(int code) {
/* 21 */     for (MS_RestoreSpecificData v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_RestoreSpecificData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */