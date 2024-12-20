/*    */ package global.scancenter.UiAgent;
/*    */ 
/*    */ public enum UiAgent_State
/*    */ {
/*  5 */   UNKNOWN(-1),
/*  6 */   READY(0),
/*  7 */   IDLE(1),
/*  8 */   WARMUP(2),
/*  9 */   START(3),
/* 10 */   QUEUING(4),
/* 11 */   PROCESSING(5),
/* 12 */   PAUSE(6),
/* 13 */   CANCELLING(7),
/* 14 */   ABORTED(8),
/* 15 */   CANCELLED(9),
/* 16 */   END(10),
/* 17 */   SCANNING(11),
/* 18 */   PRINTING(12),
/* 19 */   UPDATE(13),
/* 20 */   SLEEP(14),
/* 21 */   SUSPEND(15),
/* 22 */   RESUME(16),
/* 23 */   PREPARE_SUSPEND(17),
/* 24 */   SUSPEND_FAIL(18),
/* 25 */   PREPARE_RESUME(19),
/* 26 */   SYSTEM_NOT_CONNECTED(20),
/* 27 */   BUSY(21),
/* 28 */   PREPARE_SLEEP(22),
/* 29 */   PREPARE_WARMUP(23),
/* 30 */   SENDING(24),
/* 31 */   RECEIVING(25);
/*    */   
/*    */   int code;
/*    */ 
/*    */   
/*    */   UiAgent_State(int code) {
/* 37 */     this.code = code;
/*    */   }
/*    */   
/*    */   public static UiAgent_State findValueByName(String value) {
/* 41 */     for (UiAgent_State v : values()) {
/* 42 */       if (v.name().equals(value))
/* 43 */         return v; 
/*    */     } 
/* 45 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\commons.jar!\global\scancenter\UiAgent\UiAgent_State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */