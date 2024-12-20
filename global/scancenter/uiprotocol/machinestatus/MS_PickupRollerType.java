/*    */ package global.scancenter.uiprotocol.machinestatus;
/*    */ 
/*    */ public enum MS_PickupRollerType
/*    */ {
/*  5 */   TRAY_MANUAL(0),
/*  6 */   TRAY_1(1),
/*  7 */   TRAY_2(2),
/*  8 */   TRAY_3(3),
/*  9 */   TRAY_4(4),
/* 10 */   ADF(5);
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   MS_PickupRollerType(int numVal) {
/* 16 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 21 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static MS_PickupRollerType findValueByCode(int code) {
/* 26 */     for (MS_PickupRollerType v : values()) {
/*    */       
/* 28 */       if (v.getCode() == code)
/* 29 */         return v; 
/*    */     } 
/* 31 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_PickupRollerType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */