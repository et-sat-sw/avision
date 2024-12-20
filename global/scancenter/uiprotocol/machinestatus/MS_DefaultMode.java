/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_DefaultMode
/*    */ {
/*  5 */   HOME(0),
/*  6 */   COPY(1),
/*  7 */   SCAN(2),
/*  8 */   EMAIL(3),
/*  9 */   FAX(4),
/* 10 */   ID_CARD_COPY(5),
/* 11 */   STORAGE_COPY(6),
/* 12 */   PRINT_SAVED_JOB(7),
/* 13 */   DROP_N_TAKE(8),
/* 14 */   FAST_COPY(9),
/* 15 */   TICKET_COPY(10),
/* 16 */   CLOUD_PRINT(11),
/* 17 */   NORMAL_COPY(12);
/*    */ 
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_DefaultMode(int numVal) {
/* 24 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 29 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_DefaultMode findValueByCode(int code) {
/* 34 */     for (MS_DefaultMode v : values()) {
/*    */       
/* 36 */       if (v.getCode() == code)
/* 37 */         return v; 
/*    */     } 
/* 39 */     return COPY;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_DefaultMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */