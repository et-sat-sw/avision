/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_EnergySave
/*    */ {
/*  5 */   MIN_5(5),
/*  6 */   MIN_15(15),
/*  7 */   MIN_30(30),
/*  8 */   HOUR_1(60),
/*  9 */   HOUR_2(120),
/* 10 */   HOUR_4(240),
/* 11 */   OFF(65535);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_EnergySave(int numVal) {
/* 17 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 22 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_EnergySave findValueByCode(int code) {
/* 27 */     for (MS_EnergySave v : values()) {
/*    */       
/* 29 */       if (v.getCode() == code)
/* 30 */         return v; 
/*    */     } 
/* 32 */     return HOUR_4;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_EnergySave.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */