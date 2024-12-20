/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ public enum UIP_AccountServiceType
/*    */ {
/*  5 */   ACC_NewUser(24577),
/*  6 */   ACC_DeleteUsers(24578),
/*  7 */   ACC_SetPassword(24579),
/*  8 */   ACC_GgetPassword(24580),
/*  9 */   ACC_SetUserRole(24581),
/* 10 */   ACC_SetUsageLimits(24582),
/* 11 */   ACC_GetUsageLimits(24583),
/* 12 */   ACC_ResetUsedCount(24584),
/* 13 */   ACC_GenerateReport(24585),
/* 14 */   ACC_SetAccountFeature(24586),
/* 15 */   ACC_GetAccountFeature(24587),
/* 16 */   ACC_Reset2Default(24588),
/* 17 */   ACC_GetUserRole(24589),
/* 18 */   ACC_GetAllAccounts(24590),
/* 19 */   ACC_GetAallUserRole(24591),
/* 20 */   ACC_SetOverQuota(24592),
/* 21 */   ACC_GetOverQuota(24593),
/* 22 */   ACC_InstallAccounting(24594),
/* 23 */   ACC_CloneAccounting(24595);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   UIP_AccountServiceType(int numVal) {
/* 29 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 34 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_AccountServiceType findValueByCode(int code) {
/* 39 */     for (UIP_AccountServiceType v : values()) {
/*    */       
/* 41 */       if (v.getCode() == code)
/* 42 */         return v; 
/*    */     } 
/* 44 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_AccountServiceType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */