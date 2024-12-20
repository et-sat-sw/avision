/*    */ package global.scancenter.uiprotocol.accountservice;
/*    */ 
/*    */ public enum AS_ImpressionType
/*    */ {
/*  5 */   USAGE_LIMITS_PRINTED(0), USAGE_LIMITS_COPY(1), USAGE_LIMITS_COLOR_COPY(2), USAGE_LIMITS_FAX_IMAGE(3),
/*  6 */   USAGE_LIMITS_ALL(65535);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   AS_ImpressionType(int numVal) {
/* 12 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 17 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static AS_ImpressionType findValueByCode(int code) {
/* 22 */     for (AS_ImpressionType v : values()) {
/*    */       
/* 24 */       if (v.getCode() == code)
/* 25 */         return v; 
/*    */     } 
/* 27 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\accountservice\AS_ImpressionType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */