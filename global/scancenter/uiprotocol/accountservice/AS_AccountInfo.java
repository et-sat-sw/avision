/*     */ package global.scancenter.uiprotocol.accountservice;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ public class AS_AccountInfo
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public String operator;
/*     */   public String userName;
/*     */   public String password;
/*     */   public AS_UserRole userRole;
/*     */   public int printedMaxSize;
/*     */   public int copiedMaxSize;
/*     */   public int colorCopiedMaxSize;
/*     */   public int faxSentMaxSize;
/*     */   public int printedUsage;
/*     */   public int copiedUsage;
/*     */   public int colorCopiedUsage;
/*     */   public int faxSentUsage;
/*     */   public AS_ImpressionType impressionType;
/*     */   public String PIN;
/*     */   
/*     */   public AS_AccountInfo() {
/*  26 */     this.id = 0;
/*  27 */     this.operator = "";
/*  28 */     this.userName = "";
/*  29 */     this.password = "";
/*  30 */     this.userRole = AS_UserRole.USER;
/*  31 */     this.printedMaxSize = 10000;
/*  32 */     this.copiedMaxSize = 10000;
/*  33 */     this.colorCopiedMaxSize = 10000;
/*  34 */     this.faxSentMaxSize = 10000;
/*  35 */     this.printedUsage = 0;
/*  36 */     this.copiedUsage = 0;
/*  37 */     this.colorCopiedUsage = 0;
/*  38 */     this.faxSentUsage = 0;
/*  39 */     this.impressionType = AS_ImpressionType.USAGE_LIMITS_ALL;
/*  40 */     this.PIN = "";
/*     */   }
/*     */ 
/*     */   
/*     */   AS_AccountInfo(Parcel in) {
/*  45 */     this.id = in.readInt();
/*  46 */     this.operator = in.readString();
/*  47 */     this.userName = in.readString();
/*  48 */     this.password = in.readString();
/*  49 */     this.userRole = AS_UserRole.valueOf(in.readString());
/*  50 */     this.printedMaxSize = in.readInt();
/*  51 */     this.copiedMaxSize = in.readInt();
/*  52 */     this.colorCopiedMaxSize = in.readInt();
/*  53 */     this.faxSentMaxSize = in.readInt();
/*  54 */     this.printedUsage = in.readInt();
/*  55 */     this.copiedUsage = in.readInt();
/*  56 */     this.colorCopiedUsage = in.readInt();
/*  57 */     this.faxSentUsage = in.readInt();
/*  58 */     this.impressionType = AS_ImpressionType.valueOf(in.readString());
/*  59 */     this.PIN = in.readString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/*  65 */     out.writeInt(this.id);
/*  66 */     out.writeString(this.operator);
/*  67 */     out.writeString(this.userName);
/*  68 */     out.writeString(this.password);
/*  69 */     out.writeString((this.userRole == null) ? "" : this.userRole.name());
/*  70 */     out.writeInt(this.printedMaxSize);
/*  71 */     out.writeInt(this.copiedMaxSize);
/*  72 */     out.writeInt(this.colorCopiedMaxSize);
/*  73 */     out.writeInt(this.faxSentMaxSize);
/*  74 */     out.writeInt(this.printedUsage);
/*  75 */     out.writeInt(this.copiedUsage);
/*  76 */     out.writeInt(this.colorCopiedUsage);
/*  77 */     out.writeInt(this.faxSentUsage);
/*  78 */     out.writeString((this.impressionType == null) ? "" : this.impressionType.name());
/*  79 */     out.writeString(this.PIN);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/*  85 */     return 0;
/*     */   }
/*     */   
/*  88 */   public static final Parcelable.Creator<AS_AccountInfo> CREATOR = new Parcelable.Creator<AS_AccountInfo>()
/*     */     {
/*     */       public AS_AccountInfo createFromParcel(Parcel p)
/*     */       {
/*  92 */         return new AS_AccountInfo(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public AS_AccountInfo[] newArray(int size) {
/*  97 */         return new AS_AccountInfo[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 105 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\accountservice\AS_AccountInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */