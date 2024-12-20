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
/*     */ 
/*     */ 
/*     */ public class SavedJobOptions
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public String operator;
/*     */   public String folderName;
/*     */   public String name;
/*     */   public String fileName;
/*     */   public String password;
/*     */   public int copyCount;
/*     */   public SV_TwoSidedPrint twoSidedPrint;
/*     */   public CopyOptions.CO_PaperTray paperTray;
/*     */   public int id;
/*     */   public SV_JobSource source;
/*     */   public CopyOptions.CO_TrayPaperSize paperSize;
/*     */   public CopyOptions.CO_MediaType mediaType;
/*     */   
/*     */   public SavedJobOptions() {
/*  31 */     this.operator = "";
/*  32 */     this.name = "";
/*  33 */     this.folderName = "Public";
/*  34 */     this.fileName = "";
/*  35 */     this.password = "";
/*  36 */     this.copyCount = 1;
/*  37 */     this.twoSidedPrint = SV_TwoSidedPrint.OneSided;
/*  38 */     this.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  39 */     this.source = SV_JobSource.LocalStorage;
/*  40 */     this.paperSize = CopyOptions.CO_TrayPaperSize.AUTO;
/*  41 */     this.mediaType = CopyOptions.CO_MediaType.Normal;
/*     */   }
/*     */ 
/*     */   
/*     */   SavedJobOptions(Parcel in) {
/*  46 */     this.operator = in.readString();
/*  47 */     this.folderName = in.readString();
/*  48 */     this.name = in.readString();
/*  49 */     this.fileName = in.readString();
/*  50 */     this.password = in.readString();
/*  51 */     this.copyCount = in.readInt();
/*  52 */     this.twoSidedPrint = SV_TwoSidedPrint.valueOf(in.readString());
/*  53 */     this.paperTray = CopyOptions.CO_PaperTray.valueOf(in.readString());
/*  54 */     this.id = in.readInt();
/*  55 */     this.source = SV_JobSource.valueOf(in.readString());
/*  56 */     this.paperSize = CopyOptions.CO_TrayPaperSize.valueOf(in.readString());
/*  57 */     this.mediaType = CopyOptions.CO_MediaType.valueOf(in.readString());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/*  63 */     out.writeString(this.operator);
/*  64 */     out.writeString(this.folderName);
/*  65 */     out.writeString(this.name);
/*  66 */     out.writeString(this.fileName);
/*  67 */     out.writeString(this.password);
/*  68 */     out.writeInt(this.copyCount);
/*  69 */     out.writeString((this.twoSidedPrint == null) ? "" : this.twoSidedPrint.name());
/*  70 */     out.writeString((this.paperTray == null) ? "" : this.paperTray.name());
/*  71 */     out.writeInt(this.id);
/*  72 */     out.writeString((this.source == null) ? "" : this.source.name());
/*  73 */     out.writeString((this.paperSize == null) ? "" : this.paperSize.name());
/*  74 */     out.writeString((this.mediaType == null) ? "" : this.mediaType.name());
/*     */   }
/*     */   
/*     */   public enum SV_JobSource
/*     */   {
/*  79 */     LocalStorage(0), USB(1), ExternalStorage(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SV_JobSource(int numVal) {
/*  85 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/*  90 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SV_JobSource findValueByCode(int code) {
/*  95 */       for (SV_JobSource v : values()) {
/*     */         
/*  97 */         if (v.getCode() == code)
/*  98 */           return v; 
/*     */       } 
/* 100 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SV_JobSource findValueByName(String name) {
/* 105 */       for (SV_JobSource v : values()) {
/*     */         
/* 107 */         if (v.name().equals(name))
/* 108 */           return v; 
/*     */       } 
/* 110 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SV_TwoSidedPrint
/*     */   {
/* 116 */     OneSided(0), TwoSided(1), TwoSided_Rotate(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SV_TwoSidedPrint(int numVal) {
/* 122 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 127 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SV_TwoSidedPrint findValueByCode(int code) {
/* 132 */       for (SV_TwoSidedPrint v : values()) {
/*     */         
/* 134 */         if (v.getCode() == code)
/* 135 */           return v; 
/*     */       } 
/* 137 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SV_TwoSidedPrint findValueByName(String name) {
/* 142 */       for (SV_TwoSidedPrint v : values()) {
/*     */         
/* 144 */         if (v.name().equals(name))
/* 145 */           return v; 
/*     */       } 
/* 147 */       return null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 154 */     return 0;
/*     */   }
/*     */   
/* 157 */   public static final Parcelable.Creator<SavedJobOptions> CREATOR = new Parcelable.Creator<SavedJobOptions>()
/*     */     {
/*     */       public SavedJobOptions createFromParcel(Parcel p)
/*     */       {
/* 161 */         return new SavedJobOptions(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public SavedJobOptions[] newArray(int size) {
/* 166 */         return new SavedJobOptions[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 174 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\SavedJobOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */