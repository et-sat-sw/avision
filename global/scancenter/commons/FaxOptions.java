/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ public class FaxOptions
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public String operator;
/*     */   public String securityPin;
/*     */   public String[] phoneNumbers;
/*     */   public FO_FaxQuality faxQuality;
/*     */   public JobCategory category;
/*     */   public String sHeader;
/*     */   public String sHeaderPhoneNumber;
/*     */   public boolean bFooter;
/*     */   public int iTxLevel;
/*     */   public boolean bECM;
/*     */   public FO_StartingRate startingRate;
/*     */   public int iRedialCount;
/*     */   public int iRedialInterval;
/*     */   public FO_Report protocolReport;
/*     */   public FO_Report transmitReport;
/*     */   public FO_Country country;
/*     */   public boolean bForwardEmail;
/*     */   public String[] group_phoneNumbers;
/*     */   
/*     */   public FaxOptions() {
/*  31 */     this.operator = "";
/*  32 */     this.securityPin = "";
/*  33 */     this.phoneNumbers = new String[0];
/*  34 */     this.faxQuality = FO_FaxQuality.Standard;
/*  35 */     this.category = JobCategory.Default;
/*  36 */     this.sHeader = "";
/*  37 */     this.sHeaderPhoneNumber = "";
/*  38 */     this.bFooter = true;
/*  39 */     this.iTxLevel = -13;
/*  40 */     this.bECM = true;
/*  41 */     this.startingRate = FO_StartingRate.bps9600;
/*  42 */     this.iRedialCount = 2;
/*  43 */     this.iRedialInterval = 4;
/*  44 */     this.protocolReport = FO_Report.Off;
/*  45 */     this.transmitReport = FO_Report.Off;
/*  46 */     this.country = FO_Country.Taiwan;
/*  47 */     this.bForwardEmail = false;
/*  48 */     this.group_phoneNumbers = new String[0];
/*     */   }
/*     */ 
/*     */   
/*     */   FaxOptions(Parcel in) {
/*  53 */     this.id = in.readInt();
/*  54 */     this.operator = in.readString();
/*  55 */     this.securityPin = in.readString();
/*  56 */     this.phoneNumbers = in.createStringArray();
/*  57 */     this.faxQuality = FO_FaxQuality.valueOf(in.readString());
/*  58 */     this.category = JobCategory.valueOf(in.readString());
/*  59 */     this.sHeader = in.readString();
/*  60 */     this.sHeaderPhoneNumber = in.readString();
/*  61 */     this.bFooter = (in.readByte() == 1);
/*  62 */     this.iTxLevel = in.readInt();
/*  63 */     this.bECM = (in.readByte() == 1);
/*  64 */     this.startingRate = FO_StartingRate.valueOf(in.readString());
/*  65 */     this.iRedialCount = in.readInt();
/*  66 */     this.iRedialInterval = in.readInt();
/*  67 */     this.protocolReport = FO_Report.valueOf(in.readString());
/*  68 */     this.transmitReport = FO_Report.valueOf(in.readString());
/*  69 */     this.country = FO_Country.valueOf(in.readString());
/*  70 */     this.bForwardEmail = (in.readByte() == 1);
/*  71 */     this.group_phoneNumbers = in.createStringArray();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/*  77 */     out.writeInt(this.id);
/*  78 */     out.writeString(this.operator);
/*  79 */     out.writeString(this.securityPin);
/*  80 */     out.writeStringArray(this.phoneNumbers);
/*  81 */     out.writeString((this.faxQuality == null) ? "" : this.faxQuality.name());
/*  82 */     out.writeString((this.category == null) ? "" : this.category.name());
/*  83 */     out.writeString(this.sHeader);
/*  84 */     out.writeString(this.sHeaderPhoneNumber);
/*  85 */     out.writeByte((byte)(this.bFooter ? 1 : 0));
/*  86 */     out.writeInt(this.iTxLevel);
/*  87 */     out.writeByte((byte)(this.bECM ? 1 : 0));
/*  88 */     out.writeString((this.startingRate == null) ? "" : this.startingRate.name());
/*  89 */     out.writeInt(this.iRedialCount);
/*  90 */     out.writeInt(this.iRedialInterval);
/*  91 */     out.writeString((this.protocolReport == null) ? "" : this.protocolReport.name());
/*  92 */     out.writeString((this.transmitReport == null) ? "" : this.transmitReport.name());
/*  93 */     out.writeString((this.country == null) ? "" : this.country.name());
/*  94 */     out.writeByte((byte)(this.bForwardEmail ? 1 : 0));
/*  95 */     out.writeStringArray(this.group_phoneNumbers);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 101 */     return 0;
/*     */   }
/*     */   
/* 104 */   public static final Parcelable.Creator<FaxOptions> CREATOR = new Parcelable.Creator<FaxOptions>()
/*     */     {
/*     */       public FaxOptions createFromParcel(Parcel p)
/*     */       {
/* 108 */         return new FaxOptions(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public FaxOptions[] newArray(int size) {
/* 113 */         return new FaxOptions[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 121 */     return super.clone();
/*     */   }
/*     */   
/*     */   public enum FO_FaxQuality
/*     */   {
/* 126 */     Standard(0), Fine(1), Super_Fine(2), Photo(3), Auto(4);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     FO_FaxQuality(int numVal) {
/* 132 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 137 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static FO_FaxQuality findValueByCode(int code) {
/* 142 */       for (FO_FaxQuality v : values()) {
/*     */         
/* 144 */         if (v.getCode() == code)
/* 145 */           return v; 
/*     */       } 
/* 147 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum FO_StartingRate
/*     */   {
/* 153 */     bps4800(0), bps9600(1), bps14400(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     FO_StartingRate(int numVal) {
/* 159 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 164 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static FO_StartingRate findValueByCode(int code) {
/* 169 */       for (FO_StartingRate v : values()) {
/*     */         
/* 171 */         if (v.getCode() == code)
/* 172 */           return v; 
/*     */       } 
/* 174 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum FO_Report
/*     */   {
/* 180 */     Error(0), On(1), Off(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     FO_Report(int numVal) {
/* 186 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 191 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static FO_Report findValueByCode(int code) {
/* 196 */       for (FO_Report v : values()) {
/*     */         
/* 198 */         if (v.getCode() == code)
/* 199 */           return v; 
/*     */       } 
/* 201 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum FO_Country {
/* 206 */     CNTRY_USA(1),
/* 207 */     CNTRY_Germany(2),
/* 208 */     Taiwan(3),
/* 209 */     China(4),
/* 210 */     Singapore(5),
/* 211 */     Malaysia(6),
/* 212 */     Thailand(7),
/* 213 */     Indonesia(8),
/* 214 */     Korea(9),
/* 215 */     SouthAfrica(10),
/* 216 */     Austria(11),
/* 217 */     Switzerland(12),
/* 218 */     Russia(13),
/* 219 */     India(14),
/* 220 */     Philippines(15),
/* 221 */     Vietnam(16);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     FO_Country(int numVal) {
/* 227 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 232 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static FO_Country findValueByCode(int code) {
/* 237 */       for (FO_Country v : values()) {
/*     */         
/* 239 */         if (v.getCode() == code)
/* 240 */           return v; 
/*     */       } 
/* 242 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\FaxOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */