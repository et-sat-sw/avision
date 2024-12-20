/*    */ package global.scancenter.uiprotocol;
/*    */ 
/*    */ 
/*    */ public enum UIP_JobState
/*    */ {
/*  6 */   UNKNOWN(0, 99, 0, 1, 3, "Unknown", 0),
/*  7 */   START(1, 99, 0, 1, 0, "Job Start", 0),
/*  8 */   PROCESSING(2, 99, 0, 1, 0, "Job Processing", 0),
/*  9 */   END(3, 99, 0, 1, 0, "Job End", 0),
/* 10 */   QUEUING(4, 99, 0, 1, 0, "Job Queuing", 0),
/* 11 */   PAUSE(5, 99, 0, 1, 0, "Job Pause", 0),
/* 12 */   CANCELLING(6, 99, 0, 1, 0, "Job Cancelling", 0),
/* 13 */   ABORTED(7, 99, 0, 1, 0, "Job Aborted", 0),
/* 14 */   CANCELLED(8, 99, 0, 1, 0, "Job Cancelled", 0);
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
/*    */   UIP_JobState(int numVal, int priority, int timeout, int reserve, int type, String description, int id) {
/* 27 */     this._numVal = numVal;
/* 28 */     this._description = description;
/* 29 */     this._id = id;
/* 30 */     this._priority = priority;
/* 31 */     this._timeout = timeout;
/* 32 */     this._reserve = reserve;
/* 33 */     this._type = type;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getCode() {
/* 38 */     return this._numVal;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getDescription() {
/* 43 */     return this._description;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getStringId() {
/* 48 */     return this._id;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getPriority() {
/* 53 */     return this._priority;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getTimeout() {
/* 58 */     return this._timeout;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getReserve() {
/* 63 */     return this._reserve;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getType() {
/* 68 */     return this._type;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_JobState findValueByCode(int value) {
/* 73 */     for (UIP_JobState v : values()) {
/* 74 */       if (v.getCode() == value)
/* 75 */         return v; 
/*    */     } 
/* 77 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public static UIP_JobState findValueByName(String value) {
/* 82 */     for (UIP_JobState v : values()) {
/* 83 */       if (v.name().equals(value))
/* 84 */         return v; 
/*    */     } 
/* 86 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_JobState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */