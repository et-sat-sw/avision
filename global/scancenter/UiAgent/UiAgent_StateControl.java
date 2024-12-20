/*     */ package global.scancenter.UiAgent;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import global.scancenter.uiprotocol.UIP_MachineFault;
/*     */ 
/*     */ public class UiAgent_StateControl
/*     */   extends UIP_MachineFault
/*     */   implements Parcelable, Cloneable {
/*     */   public String error_code;
/*     */   public int priority;
/*     */   public int type;
/*     */   public int timeout;
/*     */   public int time;
/*     */   public int manually_close;
/*     */   public int display_state;
/*     */   public String note;
/*     */   public String errorinfo;
/*     */   public int web_string_id;
/*     */   
/*     */   public UiAgent_StateControl() {
/*  22 */     this.error_code = "";
/*  23 */     this.priority = 100;
/*  24 */     this.type = errorType.Error.getCode();
/*  25 */     this.timeout = 0;
/*  26 */     this.time = 0;
/*  27 */     this.manually_close = 0;
/*  28 */     this.display_state = DisplayState.Ready.getCode();
/*  29 */     this.note = "";
/*  30 */     this.errorinfo = "";
/*  31 */     this.web_string_id = -1;
/*     */   }
/*     */   
/*     */   protected UiAgent_StateControl(Parcel in) {
/*  35 */     this.error_code = in.readString();
/*  36 */     this.priority = in.readInt();
/*  37 */     this.type = in.readInt();
/*  38 */     this.timeout = in.readInt();
/*  39 */     this.time = in.readInt();
/*  40 */     this.manually_close = in.readInt();
/*  41 */     this.display_state = in.readInt();
/*  42 */     this.note = in.readString();
/*  43 */     this.errorinfo = in.readString();
/*  44 */     this.web_string_id = in.readInt();
/*     */   }
/*     */   
/*  47 */   public static final Parcelable.Creator<UiAgent_StateControl> CREATOR = new Parcelable.Creator<UiAgent_StateControl>()
/*     */     {
/*     */       public UiAgent_StateControl createFromParcel(Parcel in) {
/*  50 */         return new UiAgent_StateControl(in);
/*     */       }
/*     */ 
/*     */       
/*     */       public UiAgent_StateControl[] newArray(int size) {
/*  55 */         return new UiAgent_StateControl[size];
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   public int describeContents() {
/*  61 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel dest, int flags) {
/*  66 */     dest.writeString(this.error_code);
/*  67 */     dest.writeInt(this.priority);
/*  68 */     dest.writeInt(this.type);
/*  69 */     dest.writeInt(this.timeout);
/*  70 */     dest.writeInt(this.time);
/*  71 */     dest.writeInt(this.manually_close);
/*  72 */     dest.writeInt(this.display_state);
/*  73 */     dest.writeString(this.note);
/*  74 */     dest.writeString(this.errorinfo);
/*  75 */     dest.writeInt(this.web_string_id);
/*     */   }
/*     */   
/*     */   public enum errorType {
/*  79 */     Error(1), Warning(2), FunctionError(4), Information(8);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     errorType(int numVal) {
/*  85 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/*  90 */       return this._numVal;
/*     */     }
/*     */     
/*     */     public static errorType findValue(String value) {
/*  94 */       for (errorType v : values()) {
/*     */         
/*  96 */         if (v.name().equals(value))
/*  97 */           return v; 
/*     */       } 
/*  99 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum DisplayState {
/* 104 */     Close(0), Ready(1), Display(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     DisplayState(int numVal) {
/* 110 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 115 */       return this._numVal;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum errorInfo {
/* 120 */     JobID, JobType, TrayName, PaperSize, MediaType, Other, ErrorMsg;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\UiAgent\UiAgent_StateControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */