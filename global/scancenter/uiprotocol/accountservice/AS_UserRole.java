/*    */ package global.scancenter.uiprotocol.accountservice;
/*    */ 
/*    */ public enum AS_UserRole
/*    */ {
/*  5 */   SYSTEM_ADMIN(0), ACCOUNT_ADMIN(1), USER(2);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   AS_UserRole(int numVal) {
/* 11 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 16 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static AS_UserRole findValueByCode(int code) {
/* 21 */     for (AS_UserRole v : values()) {
/*    */       
/* 23 */       if (v.getCode() == code)
/* 24 */         return v; 
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\accountservice\AS_UserRole.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */