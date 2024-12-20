/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ public enum UIP_NotifyType
/*    */ {
/*  5 */   MESSAGE(0),
/*  6 */   DEVICE_ERROR(1),
/*  7 */   DEVICE_WARNING(2),
/*  8 */   FUNCTION_ERROR(3);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   UIP_NotifyType(int numVal) {
/* 14 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 19 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_NotifyType findValueByCode(int code) {
/* 24 */     for (UIP_NotifyType v : values()) {
/*    */       
/* 26 */       if (v.getCode() == code)
/* 27 */         return v; 
/*    */     } 
/* 29 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_NotifyType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */