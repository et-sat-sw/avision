/*    */ package global.scancenter.uiprotocol.accountservice;
/*    */ 
/*    */ public enum AS_SwitchOption
/*    */ {
/*  5 */   DISABLE(0), LOCAL(1), APLUSMANAGER(2), LDAP(3);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   AS_SwitchOption(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static AS_SwitchOption findValueByCode(int code) {
/* 21 */     for (AS_SwitchOption v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return DISABLE;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\accountservice\AS_SwitchOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */