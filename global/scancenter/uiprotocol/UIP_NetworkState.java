/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ public enum UIP_NetworkState
/*    */ {
/*  5 */   CONNECTED(0),
/*  6 */   DISCONNECTED(1),
/*  7 */   LINK_PLUG(2),
/*  8 */   LINK_UNPLUG(3),
/*  9 */   IP_CONFLICT(4),
/* 10 */   DHCP_NO_RESPONSE(5);
/*    */ 
/*    */   
/*    */   private int _numVal;
/*    */ 
/*    */   
/*    */   UIP_NetworkState(int numVal) {
/* 17 */     this._numVal = numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 22 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_NetworkState findValueByCode(int code) {
/* 27 */     for (UIP_NetworkState v : values()) {
/*    */       
/* 29 */       if (v.getCode() == code)
/* 30 */         return v; 
/*    */     } 
/* 32 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_NetworkState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */