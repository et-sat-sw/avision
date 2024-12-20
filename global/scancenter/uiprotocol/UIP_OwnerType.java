/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ public enum UIP_OwnerType
/*    */ {
/*  5 */   LOCAL(0),
/*  6 */   SYSTEM(1),
/*  7 */   REMOTE(2),
/*  8 */   UNKNOW(65535);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   UIP_OwnerType(int numVal) {
/* 14 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 19 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_OwnerType findValueByCode(int code) {
/* 24 */     for (UIP_OwnerType v : values()) {
/* 25 */       if (v.getCode() == code)
/* 26 */         return v; 
/*    */     } 
/* 28 */     return UNKNOW;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_OwnerType findValueByName(String code) {
/* 33 */     for (UIP_OwnerType v : values()) {
/* 34 */       if (v.name().equals(code))
/* 35 */         return v; 
/*    */     } 
/* 37 */     return UNKNOW;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_OwnerType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */