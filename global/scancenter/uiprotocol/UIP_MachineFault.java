/*     */ package global.scancenter.uiprotocol;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ public class UIP_MachineFault
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int mainClass;
/*     */   public int subClass;
/*     */   public int showOrHidden;
/*     */   public int priority;
/*     */   public int errorCode;
/*     */   public int debugCode;
/*     */   public int webStrId;
/*     */   public int timeout;
/*     */   public int reserve;
/*     */   public int extension;
/*     */   public int stop;
/*     */   public int time;
/*     */   public int type;
/*     */   public String description;
/*     */   public int MachineFaults;
/*     */   
/*     */   public UIP_MachineFault() {
/*  27 */     this.mainClass = 0;
/*  28 */     this.subClass = 0;
/*  29 */     this.showOrHidden = 1;
/*  30 */     this.priority = 9;
/*  31 */     this.errorCode = 0;
/*  32 */     this.debugCode = 0;
/*  33 */     this.webStrId = 0;
/*  34 */     this.timeout = 0;
/*  35 */     this.reserve = 0;
/*  36 */     this.extension = 0;
/*  37 */     this.stop = 0;
/*  38 */     this.time = 0;
/*  39 */     this.type = 0;
/*  40 */     this.description = "";
/*  41 */     this.MachineFaults = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   UIP_MachineFault(Parcel in) {
/*  46 */     this.mainClass = in.readInt();
/*  47 */     this.subClass = in.readInt();
/*  48 */     this.showOrHidden = in.readInt();
/*  49 */     this.priority = in.readInt();
/*  50 */     this.errorCode = in.readInt();
/*  51 */     this.debugCode = in.readInt();
/*  52 */     this.webStrId = in.readInt();
/*  53 */     this.timeout = in.readInt();
/*  54 */     this.reserve = in.readInt();
/*  55 */     this.extension = in.readInt();
/*  56 */     this.stop = in.readInt();
/*  57 */     this.time = in.readInt();
/*  58 */     this.type = in.readInt();
/*  59 */     this.description = in.readString();
/*  60 */     this.MachineFaults = in.readInt();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/*  66 */     out.writeInt(this.mainClass);
/*  67 */     out.writeInt(this.subClass);
/*  68 */     out.writeInt(this.showOrHidden);
/*  69 */     out.writeInt(this.priority);
/*  70 */     out.writeInt(this.errorCode);
/*  71 */     out.writeInt(this.debugCode);
/*  72 */     out.writeInt(this.webStrId);
/*  73 */     out.writeInt(this.timeout);
/*  74 */     out.writeInt(this.reserve);
/*  75 */     out.writeInt(this.extension);
/*  76 */     out.writeInt(this.stop);
/*  77 */     out.writeInt(this.time);
/*  78 */     out.writeInt(this.type);
/*  79 */     out.writeString(this.description);
/*  80 */     out.writeInt(this.MachineFaults);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/*  86 */     return 0;
/*     */   }
/*     */   
/*  89 */   public static final Parcelable.Creator<UIP_MachineFault> CREATOR = new Parcelable.Creator<UIP_MachineFault>()
/*     */     {
/*     */       public UIP_MachineFault createFromParcel(Parcel p)
/*     */       {
/*  93 */         return new UIP_MachineFault(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public UIP_MachineFault[] newArray(int size) {
/*  98 */         return new UIP_MachineFault[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 105 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_MachineFault.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */