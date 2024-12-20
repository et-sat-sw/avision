/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ 
/*    */ public enum UIP_CSA6Status
/*    */ {
/*  6 */   IMAGES_SCANNED(4096, 0, 0, 0, 1, 0, ""),
/*  7 */   SCANNER_ATTACHED(4097, 0, 0, 0, 1, 0, "CSA6 scanner attached to MFP"),
/*  8 */   SCANNER_DETACHED(8193, 0, 0, 0, 1, 0, "CSA6 scanner detached from MFP"),
/*  9 */   PAPER_JAM(4098, 177, 5, 0, 1, 3, "CSA6 paper jam"),
/* 10 */   MEMORY_ERROR(4099, 178, 5, 0, 1, 3, "CSA6 memory error"),
/* 11 */   TIMEOUT_ERROR(4100, 179, 5, 0, 1, 3, "CSA6 Scan timeout"),
/* 12 */   START_SCANNING(4101, 180, 99, 0, 1, 0, "CSA6 Start Scanning");
/*    */   
/*    */   private int _numVal;
/*    */   
/*    */   private String _description;
/*    */   
/*    */   private int _id;
/*    */   private int _priority;
/*    */   private int _timeout;
/*    */   private int _reserve;
/*    */   private int _type;
/*    */   
/*    */   UIP_CSA6Status(int numVal, int id, int priority, int timeout, int reserve, int type, String description) {
/* 25 */     this._numVal = numVal;
/* 26 */     this._description = description;
/* 27 */     this._id = id;
/* 28 */     this._priority = priority;
/* 29 */     this._timeout = timeout;
/* 30 */     this._reserve = reserve;
/* 31 */     this._type = type;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 36 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getDescription() {
/* 41 */     return this._description;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getStringId() {
/* 46 */     return this._id;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getPriority() {
/* 51 */     return this._priority;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getTimeout() {
/* 56 */     return this._timeout;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getReserve() {
/* 61 */     return this._reserve;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getType() {
/* 66 */     return this._type;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_CSA6Status findValueByCode(int value) {
/* 71 */     for (UIP_CSA6Status v : values()) {
/*    */       
/* 73 */       if (v.getCode() == value)
/* 74 */         return v; 
/*    */     } 
/* 76 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_CSA6Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */