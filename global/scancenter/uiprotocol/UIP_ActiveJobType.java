/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ public enum UIP_ActiveJobType
/*    */ {
/*  5 */   ALL(0),
/*  6 */   COPY(1),
/*  7 */   SCAN(2),
/*  8 */   PRINT(3),
/*  9 */   FAX(4),
/* 10 */   EMAIL(5);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   UIP_ActiveJobType(int numVal) {
/* 16 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 21 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_ActiveJobType findValueByCode(int code) {
/* 26 */     for (UIP_ActiveJobType v : values()) {
/*    */       
/* 28 */       if (v.getCode() == code)
/* 29 */         return v; 
/*    */     } 
/* 31 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_ActiveJobType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */