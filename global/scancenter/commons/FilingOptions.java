/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FilingOptions
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public int category;
/*     */   public String operator;
/*     */   public String fileName;
/*     */   public String folderName;
/*     */   public int protocol;
/*     */   public String URL;
/*     */   public int port;
/*     */   public String loginName;
/*     */   public String password;
/*     */   public String subFolder;
/*     */   public Boolean bSSL;
/*     */   public Boolean passiveMode;
/*     */   public int overwrite;
/*     */   public String PIN;
/*     */   public int confirmationReport;
/*     */   public Boolean bSMBv1;
/*     */   public Boolean bSMBv2;
/*     */   public Boolean bSMBv3;
/*     */   public int iNTLMVer;
/*     */   
/*     */   public FilingOptions() {
/*  37 */     this.category = 0;
/*  38 */     this.operator = "";
/*  39 */     this.fileName = "Doc";
/*  40 */     this.folderName = "";
/*  41 */     this.protocol = 0;
/*  42 */     this.URL = "";
/*  43 */     this.port = 21;
/*  44 */     this.loginName = "";
/*  45 */     this.password = "";
/*  46 */     this.subFolder = "";
/*  47 */     this.bSSL = Boolean.valueOf(false);
/*  48 */     this.passiveMode = Boolean.valueOf(false);
/*  49 */     this.overwrite = 1;
/*  50 */     this.PIN = "";
/*  51 */     this.confirmationReport = 0;
/*  52 */     this.bSMBv1 = Boolean.valueOf(true);
/*  53 */     this.bSMBv2 = Boolean.valueOf(true);
/*  54 */     this.bSMBv3 = Boolean.valueOf(true);
/*  55 */     this.iNTLMVer = 1;
/*     */   }
/*     */ 
/*     */   
/*     */   FilingOptions(Parcel in) {
/*  60 */     this.id = in.readInt();
/*  61 */     this.category = in.readInt();
/*  62 */     this.operator = in.readString();
/*  63 */     this.fileName = in.readString();
/*  64 */     this.folderName = in.readString();
/*  65 */     this.protocol = in.readInt();
/*  66 */     this.URL = in.readString();
/*  67 */     this.port = in.readInt();
/*  68 */     this.loginName = in.readString();
/*  69 */     this.password = in.readString();
/*  70 */     this.subFolder = in.readString();
/*  71 */     this.bSSL = Boolean.valueOf((in.readByte() != 0));
/*  72 */     this.passiveMode = Boolean.valueOf((in.readByte() != 0));
/*  73 */     this.overwrite = in.readInt();
/*  74 */     this.PIN = in.readString();
/*  75 */     this.confirmationReport = in.readInt();
/*  76 */     this.bSMBv1 = Boolean.valueOf((in.readByte() != 0));
/*  77 */     this.bSMBv2 = Boolean.valueOf((in.readByte() != 0));
/*  78 */     this.bSMBv3 = Boolean.valueOf((in.readByte() != 0));
/*  79 */     this.iNTLMVer = in.readInt();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flag) {
/*  85 */     out.writeInt(this.id);
/*  86 */     out.writeInt(this.category);
/*  87 */     out.writeString(this.operator);
/*  88 */     out.writeString(this.fileName);
/*     */     
/*  90 */     out.writeString(this.folderName);
/*  91 */     out.writeInt(this.protocol);
/*  92 */     out.writeString(this.URL);
/*  93 */     out.writeInt(this.port);
/*  94 */     out.writeString(this.loginName);
/*  95 */     out.writeString(this.password);
/*  96 */     out.writeString(this.subFolder);
/*  97 */     out.writeByte((byte)(this.bSSL.booleanValue() ? 1 : 0));
/*  98 */     out.writeByte((byte)(this.passiveMode.booleanValue() ? 1 : 0));
/*  99 */     out.writeInt(this.overwrite);
/* 100 */     out.writeString(this.PIN);
/* 101 */     out.writeInt(this.confirmationReport);
/* 102 */     out.writeByte((byte)(this.bSMBv1.booleanValue() ? 1 : 0));
/* 103 */     out.writeByte((byte)(this.bSMBv2.booleanValue() ? 1 : 0));
/* 104 */     out.writeByte((byte)(this.bSMBv3.booleanValue() ? 1 : 0));
/* 105 */     out.writeInt(this.iNTLMVer);
/*     */   }
/*     */   
/* 108 */   public static final Parcelable.Creator<FilingOptions> CREATOR = new Parcelable.Creator<FilingOptions>()
/*     */     {
/*     */       public FilingOptions createFromParcel(Parcel p)
/*     */       {
/* 112 */         return new FilingOptions(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public FilingOptions[] newArray(int size) {
/* 117 */         return new FilingOptions[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 124 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 131 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\FilingOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */