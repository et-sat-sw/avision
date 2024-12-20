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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FaxConfigurations
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public int nFaxCountry;
/*     */   public int nFaxTonePulse;
/*     */   public int nFaxRingNumber;
/*     */   public int nFaxSpeakerVolume;
/*     */   public int nFaxDialToneDetect;
/*     */   public int nFaxECM;
/*     */   public int nFaxCodecDisable;
/*     */   public int nFaxForwardTx;
/*     */   public String strFaxForwardNumber;
/*     */   public String strFaxForwardEmail;
/*     */   public String strFaxForwardFrom;
/*     */   public String strFaxForwardSubject;
/*     */   public int nFaxLocalPrint;
/*     */   public int nFaxDefaultOutputOption;
/*     */   public int nFaxReduceSplit;
/*     */   public int nFaxFooter;
/*     */   public int nFaxTransmitReport;
/*     */   public int nFaxStartRateType;
/*     */   public int nFaxSendHeaderText;
/*     */   public String strFaxHeaderName;
/*     */   public String strFaxHeaderNumber;
/*     */   public int nFaxRedialTimeInterval;
/*     */   public int nFaxRedialAttempts;
/*     */   public int nFaxConnectionTime;
/*     */   public int nFaxTxLevel;
/*     */   public int nFaxSpeedDisplay;
/*     */   public int nFaxProtocolReport;
/*     */   public int nFaxRxMode;
/*     */   
/*     */   public FaxConfigurations() {
/*  71 */     this.nFaxCountry = 0;
/*  72 */     this.nFaxTonePulse = 0;
/*  73 */     this.nFaxRingNumber = 5;
/*  74 */     this.nFaxSpeakerVolume = 2;
/*  75 */     this.nFaxDialToneDetect = 0;
/*  76 */     this.nFaxECM = 1;
/*  77 */     this.nFaxCodecDisable = 0;
/*  78 */     this.nFaxForwardTx = 0;
/*  79 */     this.strFaxForwardNumber = "";
/*  80 */     this.strFaxForwardEmail = "";
/*  81 */     this.strFaxForwardFrom = "";
/*  82 */     this.strFaxForwardSubject = "Forward Fax";
/*  83 */     this.nFaxLocalPrint = 1;
/*  84 */     this.nFaxDefaultOutputOption = 0;
/*  85 */     this.nFaxReduceSplit = 0;
/*  86 */     this.nFaxFooter = 1;
/*  87 */     this.nFaxTransmitReport = 2;
/*  88 */     this.nFaxStartRateType = 1;
/*  89 */     this.nFaxSendHeaderText = 1;
/*  90 */     this.strFaxHeaderName = "";
/*  91 */     this.strFaxHeaderNumber = "";
/*  92 */     this.nFaxRedialTimeInterval = 2;
/*  93 */     this.nFaxRedialAttempts = 2;
/*  94 */     this.nFaxConnectionTime = 90;
/*  95 */     this.nFaxTxLevel = 13;
/*  96 */     this.nFaxSpeedDisplay = 0;
/*  97 */     this.nFaxProtocolReport = 0;
/*  98 */     this.nFaxRxMode = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   FaxConfigurations(Parcel in) {
/* 103 */     this.id = in.readInt();
/* 104 */     this.nFaxCountry = in.readInt();
/* 105 */     this.nFaxTonePulse = in.readInt();
/* 106 */     this.nFaxRingNumber = in.readInt();
/* 107 */     this.nFaxSpeakerVolume = in.readInt();
/* 108 */     this.nFaxDialToneDetect = in.readInt();
/* 109 */     this.nFaxECM = in.readInt();
/* 110 */     this.nFaxCodecDisable = in.readInt();
/* 111 */     this.nFaxForwardTx = in.readInt();
/* 112 */     this.strFaxForwardNumber = in.readString();
/* 113 */     this.strFaxForwardEmail = in.readString();
/* 114 */     this.strFaxForwardFrom = in.readString();
/* 115 */     this.strFaxForwardSubject = in.readString();
/* 116 */     this.nFaxLocalPrint = in.readInt();
/* 117 */     this.nFaxDefaultOutputOption = in.readInt();
/* 118 */     this.nFaxReduceSplit = in.readInt();
/* 119 */     this.nFaxFooter = in.readInt();
/* 120 */     this.nFaxTransmitReport = in.readInt();
/* 121 */     this.nFaxStartRateType = in.readInt();
/* 122 */     this.nFaxSendHeaderText = in.readInt();
/* 123 */     this.strFaxHeaderName = in.readString();
/* 124 */     this.strFaxHeaderNumber = in.readString();
/* 125 */     this.nFaxRedialTimeInterval = in.readInt();
/* 126 */     this.nFaxRedialAttempts = in.readInt();
/* 127 */     this.nFaxConnectionTime = in.readInt();
/* 128 */     this.nFaxTxLevel = in.readInt();
/* 129 */     this.nFaxSpeedDisplay = in.readInt();
/* 130 */     this.nFaxProtocolReport = in.readInt();
/* 131 */     this.nFaxRxMode = in.readInt();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/* 137 */     out.writeInt(this.id);
/* 138 */     out.writeInt(this.nFaxCountry);
/* 139 */     out.writeInt(this.nFaxTonePulse);
/* 140 */     out.writeInt(this.nFaxRingNumber);
/* 141 */     out.writeInt(this.nFaxSpeakerVolume);
/* 142 */     out.writeInt(this.nFaxDialToneDetect);
/* 143 */     out.writeInt(this.nFaxECM);
/* 144 */     out.writeInt(this.nFaxCodecDisable);
/* 145 */     out.writeInt(this.nFaxForwardTx);
/* 146 */     out.writeString(this.strFaxForwardNumber);
/* 147 */     out.writeString(this.strFaxForwardEmail);
/* 148 */     out.writeString(this.strFaxForwardFrom);
/* 149 */     out.writeString(this.strFaxForwardSubject);
/* 150 */     out.writeInt(this.nFaxLocalPrint);
/* 151 */     out.writeInt(this.nFaxDefaultOutputOption);
/* 152 */     out.writeInt(this.nFaxReduceSplit);
/* 153 */     out.writeInt(this.nFaxFooter);
/* 154 */     out.writeInt(this.nFaxTransmitReport);
/* 155 */     out.writeInt(this.nFaxStartRateType);
/* 156 */     out.writeInt(this.nFaxSendHeaderText);
/* 157 */     out.writeString(this.strFaxHeaderName);
/* 158 */     out.writeString(this.strFaxHeaderNumber);
/* 159 */     out.writeInt(this.nFaxRedialTimeInterval);
/* 160 */     out.writeInt(this.nFaxRedialAttempts);
/* 161 */     out.writeInt(this.nFaxConnectionTime);
/* 162 */     out.writeInt(this.nFaxTxLevel);
/* 163 */     out.writeInt(this.nFaxSpeedDisplay);
/* 164 */     out.writeInt(this.nFaxProtocolReport);
/* 165 */     out.writeInt(this.nFaxRxMode);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 171 */     return 0;
/*     */   }
/*     */   
/* 174 */   public static final Parcelable.Creator<FaxConfigurations> CREATOR = new Parcelable.Creator<FaxConfigurations>()
/*     */     {
/*     */       public FaxConfigurations createFromParcel(Parcel p)
/*     */       {
/* 178 */         return new FaxConfigurations(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public FaxConfigurations[] newArray(int size) {
/* 183 */         return new FaxConfigurations[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 191 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\FaxConfigurations.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */