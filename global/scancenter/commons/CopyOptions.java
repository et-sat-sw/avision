/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.Log;
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
/*     */ public class CopyOptions
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public JobCategory category;
/*     */   public CO_PageLayout pageLayout;
/*     */   public CO_Merge merge;
/*     */   public CO_CopyOutput copyOutput;
/*     */   public CO_TwoSidedCopy twoSidedCopy;
/*     */   public boolean tonerSave;
/*     */   public CO_ReduceEnlarge reduceEnlarge;
/*     */   public int copyCount;
/*     */   public int customZoom;
/*     */   public int backgroundSuppression;
/*     */   public boolean watermark;
/*     */   public String watermarkStr;
/*     */   public int watermarkFont;
/*     */   public int watermarkAngle;
/*     */   public boolean bookCopy;
/*     */   public int bookMargin;
/*     */   public int sharpness;
/*     */   public int backgroundSuppressionLevel;
/*     */   public boolean rotateSide2;
/*     */   public CO_PaperTray paperTray;
/*     */   public CO_CoverPage coverPage;
/*     */   public CO_PaperTray trayForCoverPage;
/*     */   public boolean previewCopy;
/*     */   public boolean csa6Template;
/*     */   public String folderName;
/*     */   public String jobName;
/*     */   public CO_TrayPaperSize paperSize;
/*     */   public CO_MediaType mediaType;
/*     */   public String operator;
/*     */   public boolean autoFit;
/*     */   public boolean autoStart;
/*     */   public boolean interruptPrint;
/*     */   public int runDNT;
/*     */   public boolean autoContrast;
/*     */   public CO_PrintLocation printLocation;
/*     */   public CO_MixedModeHD mixedmodehd;
/*     */   public boolean extracopycnt;
/*     */   
/*     */   public CopyOptions() {
/*  91 */     this.id = 0;
/*  92 */     this.category = JobCategory.CopyDefault;
/*     */     
/*  94 */     this.pageLayout = CO_PageLayout.None;
/*     */     
/*  96 */     this.copyOutput = CO_CopyOutput.Collated;
/*  97 */     this.twoSidedCopy = CO_TwoSidedCopy.OneToOne;
/*  98 */     this.tonerSave = false;
/*  99 */     this.reduceEnlarge = CO_ReduceEnlarge.CustomZone;
/* 100 */     this.copyCount = 1;
/* 101 */     this.customZoom = 100;
/* 102 */     this.backgroundSuppression = 0;
/* 103 */     this.watermark = false;
/* 104 */     this.watermarkStr = "";
/* 105 */     this.watermarkFont = 32;
/* 106 */     this.watermarkAngle = 0;
/* 107 */     this.bookCopy = false;
/* 108 */     this.bookMargin = 5;
/*     */     
/* 110 */     this.sharpness = 3;
/* 111 */     this.backgroundSuppressionLevel = 5;
/* 112 */     this.rotateSide2 = false;
/*     */ 
/*     */     
/* 115 */     this.paperTray = CO_PaperTray.Tray1;
/*     */     
/* 117 */     this.coverPage = CO_CoverPage.Off;
/* 118 */     this.trayForCoverPage = CO_PaperTray.ManualTray;
/* 119 */     this.previewCopy = false;
/*     */     
/* 121 */     this.csa6Template = false;
/* 122 */     this.folderName = "Public";
/* 123 */     this.jobName = "Doc";
/* 124 */     this.paperSize = CO_TrayPaperSize.A4_SEF;
/* 125 */     this.mediaType = CO_MediaType.Normal;
/* 126 */     this.operator = "";
/* 127 */     this.interruptPrint = false;
/* 128 */     this.runDNT = 1;
/* 129 */     this.merge = CO_Merge.None;
/* 130 */     this.autoContrast = true;
/* 131 */     this.printLocation = CO_PrintLocation.Center;
/* 132 */     this.mixedmodehd = CO_MixedModeHD.LPI106;
/* 133 */     this.extracopycnt = false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   CopyOptions(Parcel in) {
/* 139 */     this.id = in.readInt();
/*     */     
/* 141 */     this.pageLayout = CO_PageLayout.valueOf(in.readString());
/*     */     
/* 143 */     this.copyOutput = CO_CopyOutput.valueOf(in.readString());
/* 144 */     this.twoSidedCopy = CO_TwoSidedCopy.valueOf(in.readString());
/* 145 */     this.tonerSave = (in.readInt() == 1);
/* 146 */     this.reduceEnlarge = CO_ReduceEnlarge.valueOf(in.readString());
/* 147 */     this.copyCount = in.readInt();
/* 148 */     this.customZoom = in.readInt();
/* 149 */     this.backgroundSuppression = in.readInt();
/* 150 */     this.watermark = (in.readInt() == 1);
/* 151 */     this.watermarkStr = in.readString();
/* 152 */     this.watermarkFont = in.readInt();
/* 153 */     this.watermarkAngle = in.readInt();
/* 154 */     this.bookCopy = (in.readInt() == 1);
/* 155 */     this.bookMargin = in.readInt();
/*     */     
/* 157 */     this.sharpness = in.readInt();
/* 158 */     this.backgroundSuppressionLevel = in.readInt();
/* 159 */     this.rotateSide2 = (in.readInt() == 1);
/*     */ 
/*     */     
/* 162 */     this.paperTray = CO_PaperTray.valueOf(in.readString());
/*     */     
/* 164 */     this.coverPage = CO_CoverPage.valueOf(in.readString());
/* 165 */     this.trayForCoverPage = CO_PaperTray.valueOf(in.readString());
/* 166 */     this.previewCopy = (in.readInt() == 1);
/*     */     
/* 168 */     this.csa6Template = (in.readInt() == 1);
/* 169 */     this.folderName = in.readString();
/* 170 */     this.jobName = in.readString();
/* 171 */     this.paperSize = CO_TrayPaperSize.valueOf(in.readString());
/* 172 */     this.mediaType = CO_MediaType.valueOf(in.readString());
/* 173 */     this.operator = in.readString();
/* 174 */     this.autoFit = (in.readInt() == 1);
/* 175 */     this.autoStart = (in.readInt() == 1);
/* 176 */     this.interruptPrint = (in.readInt() == 1);
/* 177 */     this.runDNT = in.readInt();
/* 178 */     this.merge = CO_Merge.valueOf(in.readString());
/* 179 */     this.autoContrast = (in.readInt() == 1);
/* 180 */     this.printLocation = CO_PrintLocation.valueOf(in.readString());
/* 181 */     this.mixedmodehd = CO_MixedModeHD.valueOf(in.readString());
/* 182 */     this.extracopycnt = (in.readInt() == 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/* 188 */     out.writeInt(this.id);
/*     */     
/* 190 */     out.writeString((this.pageLayout == null) ? "" : this.pageLayout.name());
/*     */     
/* 192 */     out.writeString((this.copyOutput == null) ? "" : this.copyOutput.name());
/* 193 */     out.writeString((this.twoSidedCopy == null) ? "" : this.twoSidedCopy.name());
/* 194 */     out.writeByte((byte)(this.tonerSave ? 1 : 0));
/* 195 */     out.writeString((this.reduceEnlarge == null) ? "" : this.reduceEnlarge.name());
/* 196 */     out.writeInt(this.copyCount);
/* 197 */     out.writeInt(this.customZoom);
/* 198 */     out.writeInt(this.backgroundSuppression);
/* 199 */     out.writeByte((byte)(this.watermark ? 1 : 0));
/* 200 */     out.writeString(this.watermarkStr);
/* 201 */     out.writeInt(this.watermarkFont);
/* 202 */     out.writeInt(this.watermarkAngle);
/* 203 */     out.writeByte((byte)(this.bookCopy ? 1 : 0));
/* 204 */     out.writeInt(this.bookMargin);
/*     */     
/* 206 */     out.writeInt(this.sharpness);
/* 207 */     out.writeInt(this.backgroundSuppressionLevel);
/* 208 */     out.writeByte((byte)(this.rotateSide2 ? 1 : 0));
/*     */ 
/*     */     
/* 211 */     out.writeString((this.paperTray == null) ? "" : this.paperTray.name());
/*     */     
/* 213 */     out.writeString((this.coverPage == null) ? "" : this.coverPage.name());
/* 214 */     out.writeString((this.trayForCoverPage == null) ? "" : this.trayForCoverPage.name());
/* 215 */     out.writeByte((byte)(this.previewCopy ? 1 : 0));
/*     */     
/* 217 */     out.writeByte((byte)(this.csa6Template ? 1 : 0));
/* 218 */     out.writeString(this.folderName);
/* 219 */     out.writeString(this.jobName);
/* 220 */     out.writeString((this.paperSize == null) ? "" : this.paperSize.name());
/* 221 */     out.writeString((this.mediaType == null) ? "" : this.mediaType.name());
/* 222 */     out.writeString(this.operator);
/* 223 */     out.writeByte((byte)(this.autoFit ? 1 : 0));
/* 224 */     out.writeByte((byte)(this.autoStart ? 1 : 0));
/* 225 */     out.writeByte((byte)(this.interruptPrint ? 1 : 0));
/* 226 */     out.writeInt(this.runDNT);
/* 227 */     out.writeString((this.merge == null) ? "" : this.merge.name());
/* 228 */     out.writeByte((byte)(this.autoContrast ? 1 : 0));
/* 229 */     out.writeString((this.printLocation == null) ? "" : this.printLocation.name());
/* 230 */     out.writeString((this.mixedmodehd == null) ? "" : this.mixedmodehd.name());
/* 231 */     out.writeByte((byte)(this.extracopycnt ? 1 : 0));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 237 */     return 0;
/*     */   }
/*     */   
/* 240 */   public static final Parcelable.Creator<CopyOptions> CREATOR = new Parcelable.Creator<CopyOptions>()
/*     */     {
/*     */       public CopyOptions createFromParcel(Parcel p)
/*     */       {
/* 244 */         return new CopyOptions(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public CopyOptions[] newArray(int size) {
/* 249 */         return new CopyOptions[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 257 */     return super.clone();
/*     */   }
/*     */   
/*     */   public enum CO_PageLayout
/*     */   {
/* 262 */     None(0), IDCard_UpDown(1), IDCard_DuplexCopy(2),
/* 263 */     IDCard_Multiple(3), IDCard_RightLeft(4), IDCard_SmartLayout(5);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_PageLayout(int numVal) {
/* 269 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 274 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_PageLayout findValueByCode(int code) {
/* 279 */       for (CO_PageLayout v : values()) {
/* 280 */         if (v.getCode() == code)
/* 281 */           return v; 
/*     */       } 
/* 283 */       Log.w("CO_PageLayout", "Find NULL, return None : " + code);
/* 284 */       return None;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_PageLayout findValueByName(String code) {
/* 289 */       for (CO_PageLayout v : values()) {
/* 290 */         if (v.name().equals(code))
/* 291 */           return v; 
/*     */       } 
/* 293 */       Log.w("CO_PageLayout", "Find NULL, return None : " + code);
/* 294 */       return None;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_Merge
/*     */   {
/* 300 */     None(0), Two_Up(1), Four_Up(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_Merge(int numVal) {
/* 306 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 311 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_Merge findValueByCode(int code) {
/* 316 */       for (CO_Merge v : values()) {
/* 317 */         if (v.getCode() == code)
/* 318 */           return v; 
/*     */       } 
/* 320 */       Log.w("CO_Merge", "Find NULL, return None : " + code);
/* 321 */       return None;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_Merge findValueByName(String code) {
/* 326 */       for (CO_Merge v : values()) {
/* 327 */         if (v.name().equals(code))
/* 328 */           return v; 
/*     */       } 
/* 330 */       Log.w("CO_Merge", "Find NULL, return None : " + code);
/* 331 */       return None;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_CopyOutput
/*     */   {
/* 337 */     Uncollated(0), Collated(1), RotateCollated(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_CopyOutput(int numVal) {
/* 343 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 348 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_CopyOutput findValueByCode(int code) {
/* 353 */       for (CO_CopyOutput v : values()) {
/* 354 */         if (v.getCode() == code)
/* 355 */           return v; 
/*     */       } 
/* 357 */       Log.w("CO_CopyOutput", "Find NULL, return Uncollated : " + code);
/* 358 */       return Uncollated;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_CopyOutput findValueByName(String code) {
/* 363 */       for (CO_CopyOutput v : values()) {
/* 364 */         if (v.name().equals(code))
/* 365 */           return v; 
/*     */       } 
/* 367 */       Log.w("CO_CopyOutput", "Find NULL, return Uncollated : " + code);
/* 368 */       return Uncollated;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_TwoSidedCopy
/*     */   {
/* 374 */     OneToOne(0), TwoToOne(1), OneToTwo(2),
/* 375 */     TwoToTwo(3), OneToOneBack(4), OneToTwoBack(5),
/* 376 */     TwoSidedRotate(6), OneToTwoSidedRotate(7);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_TwoSidedCopy(int numVal) {
/* 382 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 387 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_TwoSidedCopy findValueByCode(int code) {
/* 392 */       for (CO_TwoSidedCopy v : values()) {
/* 393 */         if (v.getCode() == code)
/* 394 */           return v; 
/*     */       } 
/* 396 */       Log.w("CO_TwoSidedCopy", "Find NULL, return OneToOne : " + code);
/* 397 */       return OneToOne;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_TwoSidedCopy findValueByName(String code) {
/* 402 */       for (CO_TwoSidedCopy v : values()) {
/* 403 */         if (v.name().equals(code))
/* 404 */           return v; 
/*     */       } 
/* 406 */       Log.w("CO_TwoSidedCopy", "Find NULL, return OneToOne : " + code);
/* 407 */       return OneToOne;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_ReduceEnlarge
/*     */   {
/* 413 */     FullPage(1), CustomZone(2), Auto(3);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_ReduceEnlarge(int numVal) {
/* 419 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 424 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_ReduceEnlarge findValueByCode(int code) {
/* 429 */       for (CO_ReduceEnlarge v : values()) {
/* 430 */         if (v.getCode() == code)
/* 431 */           return v; 
/*     */       } 
/* 433 */       Log.w("CO_ReduceEnlarge", "Find NULL, return CustomZone : " + code);
/* 434 */       return CustomZone;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_ReduceEnlarge findValueByName(String code) {
/* 439 */       for (CO_ReduceEnlarge v : values()) {
/* 440 */         if (v.name().equals(code))
/* 441 */           return v; 
/*     */       } 
/* 443 */       Log.w("CO_ReduceEnlarge", "Find NULL, return CustomZone : " + code);
/* 444 */       return CustomZone;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public enum CO_PaperTray
/*     */   {
/* 451 */     ManualTray(0), Tray1(1), Tray2(2), Tray3(3), Tray4(4), AutoSelect(255);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_PaperTray(int numVal) {
/* 457 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 462 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_PaperTray findValueByCode(int code) {
/* 467 */       for (CO_PaperTray v : values()) {
/* 468 */         if (v.getCode() == code)
/* 469 */           return v; 
/*     */       } 
/* 471 */       Log.w("CO_PaperTray", "Find NULL, return Tray1 : " + code);
/* 472 */       return Tray1;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_PaperTray findValueByName(String code) {
/* 477 */       for (CO_PaperTray v : values()) {
/* 478 */         if (v.name().equals(code))
/* 479 */           return v; 
/*     */       } 
/* 481 */       Log.w("CO_PaperTray", "Find NULL, return Tray1 : " + code);
/* 482 */       return Tray1;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_TrayPaperSize
/*     */   {
/* 488 */     A3_SEF(1), A4_SEF(2), A5_SEF(3), A6_SEF(4), C4_SEF(8),
/* 489 */     C5_SEF(9), C6_SEF(10), B4_SEF(11), B5_SEF(12), B6_SEF(13),
/* 490 */     ST_SEF(14), LTR_SEF(15), LGL_SEF(16), LG13_SEF(17), EXECUTIVE_SEF(20),
/* 491 */     PT_SEF(28), DLT_SEF(30), K8_SEF(31), K16_SEF(32), AUTO(40),
/* 492 */     OFICIO_SEF(45), CUSTOM(96), UNKNOWN(128), A4_LEF(130), A5_LEF(131),
/* 493 */     A6_LEF(132), B5_LEF(140), B6_LEF(141), ST_LEF(142), LTR_LEF(143),
/* 494 */     PT_LEF(156), K16_LEF(160);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_TrayPaperSize(int numVal) {
/* 500 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 505 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_TrayPaperSize findValueByCode(int code) {
/* 510 */       for (CO_TrayPaperSize v : values()) {
/* 511 */         if (v.getCode() == code)
/* 512 */           return v; 
/*     */       } 
/* 514 */       Log.w("CO_TrayPaperSize", "Find NULL, return UNKNOWN : " + code);
/* 515 */       return UNKNOWN;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_TrayPaperSize findValueByName(String code) {
/* 520 */       for (CO_TrayPaperSize v : values()) {
/* 521 */         if (v.name().equals(code))
/* 522 */           return v; 
/*     */       } 
/* 524 */       Log.w("CO_TrayPaperSize", "Find NULL, return UNKNOWN : " + code);
/* 525 */       return UNKNOWN;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_MediaType
/*     */   {
/* 531 */     Normal(0), Cardstock(1), Transparency(2), Envelope(3), Letterhead(4),
/* 532 */     Postcard(5), Labels(6), Coated(7), Plain(8), Preprinted(9),
/* 533 */     Bond(10), Recycled(11), Vellum(12), Rough(13), Color(14),
/* 534 */     Prepunched(15), SecondSide(16), Thick(17), HighQuality(18), Thin(19),
/* 535 */     Laser(20), Heavy(21), Unknown(255);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_MediaType(int numVal) {
/* 541 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 546 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_MediaType findValueByCode(int code) {
/* 551 */       for (CO_MediaType v : values()) {
/* 552 */         if (v.getCode() == code)
/* 553 */           return v; 
/*     */       } 
/* 555 */       Log.w("CO_MediaType", "Find NULL, return Unknown : " + code);
/* 556 */       return Unknown;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_MediaType findValueByName(String code) {
/* 561 */       for (CO_MediaType v : values()) {
/* 562 */         if (v.name().equals(code))
/* 563 */           return v; 
/*     */       } 
/* 565 */       Log.w("CO_MediaType", "Find NULL, return Unknown : " + code);
/* 566 */       return Unknown;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_CoverPage
/*     */   {
/* 572 */     Off(0), BlankCoverPage(1), NonblankCoverPage(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_CoverPage(int numVal) {
/* 578 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 583 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_CoverPage findValueByCode(int code) {
/* 588 */       for (CO_CoverPage v : values()) {
/* 589 */         if (v.getCode() == code)
/* 590 */           return v; 
/*     */       } 
/* 592 */       Log.w("CO_CoverPage", "Find NULL, return Off : " + code);
/* 593 */       return Off;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_CoverPage findValueByName(String code) {
/* 598 */       for (CO_CoverPage v : values()) {
/* 599 */         if (v.name().equals(code))
/* 600 */           return v; 
/*     */       } 
/* 602 */       Log.w("CO_CoverPage", "Find NULL, return Off : " + code);
/* 603 */       return Off;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_PrintLocation
/*     */   {
/* 609 */     Center(0), TopLeft(1), CenterXAxis(2), CenterYAxis(3);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     CO_PrintLocation(int numVal) {
/* 615 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 620 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_PrintLocation findValueByCode(int code) {
/* 625 */       for (CO_PrintLocation v : values()) {
/* 626 */         if (v.getCode() == code)
/* 627 */           return v; 
/*     */       } 
/* 629 */       Log.w("CO_PrintLocation", "Find NULL, return Off : " + code);
/* 630 */       return Center;
/*     */     }
/*     */ 
/*     */     
/*     */     public static CO_PrintLocation findValueByName(String code) {
/* 635 */       for (CO_PrintLocation v : values()) {
/* 636 */         if (v.name().equals(code))
/* 637 */           return v; 
/*     */       } 
/* 639 */       Log.w("CO_PrintLocation", "Find NULL, return Off : " + code);
/* 640 */       return Center;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum CO_MixedModeHD
/*     */   {
/* 646 */     LPI106, LPI141;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\CopyOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */