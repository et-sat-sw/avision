/*     */ package global.scancenter.uiprotocol.machinestatus;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MS_GeneralInfo
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public String deviceModel;
/*     */   public String serialNumber;
/*     */   public String systemVersion;
/*     */   public String engineVersion;
/*     */   public String faxBoardVersion;
/*     */   public String tonerSerialNumber;
/*     */   public String ePSerialNumber;
/*     */   public String fuserSerialNumber;
/*     */   public String drumSerialNumber;
/*     */   public String vendorName;
/*     */   public String hostName;
/*     */   public String ipAddress;
/*     */   public String macAddress;
/*     */   public String wifiIpAddress;
/*     */   public String wifiMacAddress;
/*     */   public String wifiSsid;
/*     */   public String webVersion;
/*     */   public String uiVersion;
/*     */   public String jmVersion;
/*     */   public String scannerVersion;
/*     */   public String vID;
/*     */   public String pID;
/*     */   public String tray3N4FwVersion;
/*     */   public String fPGAFwVersion;
/*     */   public String cSA6FwVersion;
/*     */   
/*     */   public MS_GeneralInfo() {}
/*     */   
/*     */   MS_GeneralInfo(Parcel in) {
/*  43 */     this.deviceModel = in.readString();
/*  44 */     this.serialNumber = in.readString();
/*  45 */     this.systemVersion = in.readString();
/*  46 */     this.engineVersion = in.readString();
/*  47 */     this.faxBoardVersion = in.readString();
/*  48 */     this.tonerSerialNumber = in.readString();
/*  49 */     this.ePSerialNumber = in.readString();
/*  50 */     this.fuserSerialNumber = in.readString();
/*  51 */     this.vendorName = in.readString();
/*  52 */     this.hostName = in.readString();
/*  53 */     this.ipAddress = in.readString();
/*  54 */     this.macAddress = in.readString();
/*  55 */     this.wifiIpAddress = in.readString();
/*  56 */     this.wifiMacAddress = in.readString();
/*  57 */     this.wifiSsid = in.readString();
/*  58 */     this.webVersion = in.readString();
/*  59 */     this.uiVersion = in.readString();
/*  60 */     this.jmVersion = in.readString();
/*  61 */     this.scannerVersion = in.readString();
/*  62 */     this.vID = in.readString();
/*  63 */     this.pID = in.readString();
/*  64 */     this.tray3N4FwVersion = in.readString();
/*  65 */     this.fPGAFwVersion = in.readString();
/*  66 */     this.cSA6FwVersion = in.readString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/*  72 */     out.writeString(this.deviceModel);
/*  73 */     out.writeString(this.serialNumber);
/*  74 */     out.writeString(this.systemVersion);
/*  75 */     out.writeString(this.engineVersion);
/*  76 */     out.writeString(this.faxBoardVersion);
/*  77 */     out.writeString(this.tonerSerialNumber);
/*  78 */     out.writeString(this.ePSerialNumber);
/*  79 */     out.writeString(this.fuserSerialNumber);
/*  80 */     out.writeString(this.vendorName);
/*  81 */     out.writeString(this.hostName);
/*  82 */     out.writeString(this.ipAddress);
/*  83 */     out.writeString(this.macAddress);
/*  84 */     out.writeString(this.wifiIpAddress);
/*  85 */     out.writeString(this.wifiMacAddress);
/*  86 */     out.writeString(this.wifiSsid);
/*  87 */     out.writeString(this.webVersion);
/*  88 */     out.writeString(this.uiVersion);
/*  89 */     out.writeString(this.jmVersion);
/*  90 */     out.writeString(this.scannerVersion);
/*  91 */     out.writeString(this.vID);
/*  92 */     out.writeString(this.pID);
/*  93 */     out.writeString(this.tray3N4FwVersion);
/*  94 */     out.writeString(this.fPGAFwVersion);
/*  95 */     out.writeString(this.cSA6FwVersion);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 101 */     return 0;
/*     */   }
/*     */   
/* 104 */   public static final Parcelable.Creator<MS_GeneralInfo> CREATOR = new Parcelable.Creator<MS_GeneralInfo>()
/*     */     {
/*     */       public MS_GeneralInfo createFromParcel(Parcel p)
/*     */       {
/* 108 */         return new MS_GeneralInfo(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public MS_GeneralInfo[] newArray(int size) {
/* 113 */         return new MS_GeneralInfo[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 121 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_GeneralInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */