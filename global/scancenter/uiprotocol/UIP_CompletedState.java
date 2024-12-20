/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ 
/*    */ public enum UIP_CompletedState
/*    */ {
/*  6 */   COMPLETED(0, "Job Completed"),
/*  7 */   CANCELLED(1, "Job Cancelled"),
/*  8 */   ABORTED(2, "Job Aborted");
/*    */   
/*    */   private int _numVal;
/*    */   
/*    */   private String _description;
/*    */   
/*    */   UIP_CompletedState(int numVal, String description) {
/* 15 */     this._numVal = numVal;
/* 16 */     this._description = description;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 21 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getDescription() {
/* 26 */     return this._description;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_CompletedState findValueByCode(int value) {
/* 31 */     for (UIP_CompletedState v : values()) {
/*    */       
/* 33 */       if (v.getCode() == value)
/* 34 */         return v; 
/*    */     } 
/* 36 */     return COMPLETED;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_CompletedState findValueByName(String value) {
/* 41 */     for (UIP_CompletedState v : values()) {
/* 42 */       if (v.name().equals(value))
/* 43 */         return v; 
/*    */     } 
/* 45 */     return COMPLETED;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_CompletedState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */