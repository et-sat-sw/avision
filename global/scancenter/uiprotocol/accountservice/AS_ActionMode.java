/*    */ package global.scancenter.uiprotocol.accountservice;
/*    */ 
/*    */ public enum AS_ActionMode
/*    */ {
/*  5 */   NEW_USER(24577), DELETE_USER(24578), SET_PASSWORD(24579), GET_PASSWORD(24580), SET_USER_ROLE(24581),
/*  6 */   SET_USAGE_LIMITS(24582), GET_USAGE_LIMITS(24583), RESET_USED_COUNT(24584),
/*  7 */   GENERATE_REPORT(24585), SET_ACCOUNTING_FEATURE(24586), GET_ACCOUNTING_FEATURE(24587),
/*  8 */   RESET_TO_DEFAULT(24588), GET_USER_ROLE(24589), GET_ALL_ACCOUNTS(24590),
/*  9 */   GET_ALL_USER_ROLE(24591), SET_OVER_QUOTA(24592), GET_OVER_QUOTA(24593),
/* 10 */   INSTALL_ACCOUNTING(24594), CLONE_ACCOUNTING(24595), BIND_PIN(24596),
/* 11 */   QUERY_ACCOUNT_BY_PIN(24597);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   AS_ActionMode(int numVal) {
/* 17 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 22 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static AS_ActionMode findValueByCode(int code) {
/* 27 */     for (AS_ActionMode v : values()) {
/*    */       
/* 29 */       if (v.getCode() == code)
/* 30 */         return v; 
/*    */     } 
/* 32 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\accountservice\AS_ActionMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */