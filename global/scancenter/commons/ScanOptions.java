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
/*     */ public class ScanOptions
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public String operator;
/*     */   public JobCategory category;
/*     */   public SO_OriginalType originalType;
/*     */   public SO_Resolution resolution;
/*     */   public SO_OutputColor outputColor;
/*     */   public SO_OriginalSize originalSize;
/*     */   public SO_TwoSidedScan twoSidedScan;
/*     */   public SO_FileFormat fileFormat;
/*     */   public SO_Quality quality;
/*     */   public SO_Orientation orientation;
/*     */   public Boolean isPreview;
/*     */   public Boolean isBind;
/*     */   public int contrast;
/*     */   public int density;
/*     */   public int sharpness;
/*     */   public SO_BlankDetect blankDetect;
/*     */   public Boolean enableBlankDetect;
/*     */   public Boolean autoCropDeskew;
/*     */   public Boolean autoOrientation;
/*     */   public Boolean ultrasonic;
/*     */   public SO_MultiFeedCtrl multiFeedCtrl;
/*     */   public String fileName;
/*     */   public SO_ReverseMode reverseMode;
/*     */   public int saturation;
/*     */   public int customWidth;
/*     */   public int customHeight;
/*     */   public Boolean backgroundRemove;
/*     */   public Boolean descreen;
/*     */   public Boolean colormatch;
/*     */   public int gamma;
/*     */   public SO_MoreBind morebind;
/*     */   
/*     */   public ScanOptions() {
/*  50 */     this.category = JobCategory.Default;
/*  51 */     this.originalType = SO_OriginalType.Text;
/*  52 */     this.resolution = SO_Resolution.dpi200;
/*  53 */     this.outputColor = SO_OutputColor.Color;
/*  54 */     this.originalSize = SO_OriginalSize.A4_SEF;
/*  55 */     this.twoSidedScan = SO_TwoSidedScan.TwoSided;
/*  56 */     this.fileFormat = SO_FileFormat.JPEG;
/*  57 */     this.quality = SO_Quality.Higher;
/*  58 */     this.orientation = SO_Orientation.Portrait;
/*     */     
/*  60 */     this.isPreview = Boolean.valueOf(false);
/*  61 */     this.isBind = Boolean.valueOf(false);
/*  62 */     this.contrast = 3;
/*  63 */     this.density = 3;
/*  64 */     this.sharpness = 3;
/*  65 */     this.blankDetect = SO_BlankDetect.Strong;
/*  66 */     this.enableBlankDetect = Boolean.valueOf(false);
/*  67 */     this.autoCropDeskew = Boolean.valueOf(false);
/*  68 */     this.autoOrientation = Boolean.valueOf(false);
/*  69 */     this.ultrasonic = Boolean.valueOf(true);
/*  70 */     this.multiFeedCtrl = SO_MultiFeedCtrl.StopScan;
/*  71 */     this.fileName = "Doc";
/*  72 */     this.reverseMode = SO_ReverseMode.Off;
/*  73 */     this.saturation = 3;
/*  74 */     this.customWidth = 2970;
/*  75 */     this.customHeight = 2100;
/*  76 */     this.backgroundRemove = Boolean.valueOf(false);
/*  77 */     this.descreen = Boolean.valueOf(false);
/*  78 */     this.colormatch = Boolean.valueOf(false);
/*  79 */     this.gamma = 220;
/*  80 */     this.morebind = SO_MoreBind.Off;
/*     */   }
/*     */ 
/*     */   
/*     */   ScanOptions(Parcel in) {
/*  85 */     this.id = in.readInt();
/*  86 */     this.operator = in.readString();
/*  87 */     this.category = JobCategory.valueOf(in.readString());
/*  88 */     this.originalType = SO_OriginalType.valueOf(in.readString());
/*  89 */     this.resolution = SO_Resolution.valueOf(in.readString());
/*  90 */     this.outputColor = SO_OutputColor.valueOf(in.readString());
/*  91 */     this.originalSize = SO_OriginalSize.valueOf(in.readString());
/*  92 */     this.twoSidedScan = SO_TwoSidedScan.valueOf(in.readString());
/*  93 */     this.fileFormat = SO_FileFormat.valueOf(in.readString());
/*  94 */     this.quality = SO_Quality.valueOf(in.readString());
/*  95 */     this.orientation = SO_Orientation.valueOf(in.readString());
/*     */     
/*  97 */     this.isPreview = Boolean.valueOf((in.readByte() == 1));
/*  98 */     this.isBind = Boolean.valueOf((in.readByte() == 1));
/*  99 */     this.contrast = in.readInt();
/* 100 */     this.density = in.readInt();
/* 101 */     this.sharpness = in.readInt();
/* 102 */     this.blankDetect = SO_BlankDetect.valueOf(in.readString());
/* 103 */     this.enableBlankDetect = Boolean.valueOf((in.readByte() == 1));
/* 104 */     this.autoCropDeskew = Boolean.valueOf((in.readByte() == 1));
/* 105 */     this.autoOrientation = Boolean.valueOf((in.readByte() == 1));
/* 106 */     this.ultrasonic = Boolean.valueOf((in.readByte() == 1));
/* 107 */     this.multiFeedCtrl = SO_MultiFeedCtrl.valueOf(in.readString());
/* 108 */     this.fileName = in.readString();
/* 109 */     this.reverseMode = SO_ReverseMode.valueOf(in.readString());
/* 110 */     this.saturation = in.readInt();
/* 111 */     this.customWidth = in.readInt();
/* 112 */     this.customHeight = in.readInt();
/* 113 */     this.backgroundRemove = Boolean.valueOf((in.readByte() == 1));
/* 114 */     this.descreen = Boolean.valueOf((in.readByte() == 1));
/* 115 */     this.colormatch = Boolean.valueOf((in.readByte() == 1));
/* 116 */     this.gamma = in.readInt();
/* 117 */     this.morebind = SO_MoreBind.valueOf(in.readString());
/*     */   }
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
/*     */   public void writeToParcel(Parcel out, int flag) {
/* 152 */     out.writeInt(this.id);
/* 153 */     out.writeString(this.operator);
/* 154 */     out.writeString((this.category == null) ? "" : this.category.name());
/* 155 */     out.writeString((this.originalType == null) ? "" : this.originalType.name());
/* 156 */     out.writeString((this.resolution == null) ? "" : this.resolution.name());
/* 157 */     out.writeString((this.outputColor == null) ? "" : this.outputColor.name());
/* 158 */     out.writeString((this.originalSize == null) ? "" : this.originalSize.name());
/* 159 */     out.writeString((this.twoSidedScan == null) ? "" : this.twoSidedScan.name());
/* 160 */     out.writeString((this.fileFormat == null) ? "" : this.fileFormat.name());
/* 161 */     out.writeString((this.quality == null) ? "" : this.quality.name());
/* 162 */     out.writeString((this.orientation == null) ? "" : this.orientation.name());
/*     */     
/* 164 */     out.writeByte((byte)(this.isPreview.booleanValue() ? 1 : 0));
/* 165 */     out.writeByte((byte)(this.isBind.booleanValue() ? 1 : 0));
/* 166 */     out.writeInt(this.contrast);
/* 167 */     out.writeInt(this.density);
/* 168 */     out.writeInt(this.sharpness);
/* 169 */     out.writeString((this.blankDetect == null) ? "" : this.blankDetect.name());
/* 170 */     out.writeByte((byte)(this.enableBlankDetect.booleanValue() ? 1 : 0));
/* 171 */     out.writeByte((byte)(this.autoCropDeskew.booleanValue() ? 1 : 0));
/* 172 */     out.writeByte((byte)(this.autoOrientation.booleanValue() ? 1 : 0));
/* 173 */     out.writeByte((byte)(this.ultrasonic.booleanValue() ? 1 : 0));
/* 174 */     out.writeString((this.multiFeedCtrl == null) ? "" : this.multiFeedCtrl.name());
/* 175 */     out.writeString(this.fileName);
/* 176 */     out.writeString((this.reverseMode == null) ? "" : this.reverseMode.name());
/* 177 */     out.writeInt(this.saturation);
/* 178 */     out.writeInt(this.customWidth);
/* 179 */     out.writeInt(this.customHeight);
/* 180 */     out.writeByte((byte)(this.backgroundRemove.booleanValue() ? 1 : 0));
/* 181 */     out.writeByte((byte)(this.descreen.booleanValue() ? 1 : 0));
/* 182 */     out.writeByte((byte)(this.colormatch.booleanValue() ? 1 : 0));
/* 183 */     out.writeInt(this.gamma);
/* 184 */     out.writeString((this.morebind == null) ? "" : this.morebind.name());
/*     */   }
/*     */   
/* 187 */   public static final Parcelable.Creator<ScanOptions> CREATOR = new Parcelable.Creator<ScanOptions>()
/*     */     {
/*     */       public ScanOptions createFromParcel(Parcel p)
/*     */       {
/* 191 */         return new ScanOptions(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public ScanOptions[] newArray(int size) {
/* 196 */         return new ScanOptions[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 203 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public enum SO_OriginalType
/*     */   {
/* 209 */     None(-1), Text(0), Photo(1), Mixed(2), DotMatrix(3);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_OriginalType(int numVal) {
/* 215 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 220 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_OriginalType findValueByCode(int code) {
/* 225 */       for (SO_OriginalType v : values()) {
/* 226 */         if (v.getCode() == code)
/* 227 */           return v; 
/*     */       } 
/* 229 */       Log.w("SO_OriginalType", "Find NULL, return Text : " + code);
/* 230 */       return Text;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_OriginalType findValueByName(String code) {
/* 235 */       for (SO_OriginalType v : values()) {
/* 236 */         if (v.name().equals(code))
/* 237 */           return v; 
/*     */       } 
/* 239 */       Log.w("SO_OriginalType", "Find NULL, return Text : " + code);
/* 240 */       return Text;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_Resolution
/*     */   {
/* 246 */     dpi75(4, "75"),
/* 247 */     dpi100(5, "100"),
/* 248 */     dpi150(0, "150"),
/* 249 */     dpi200(3, "200"),
/* 250 */     dpi300(1, "300"),
/* 251 */     dpi400(6, "400"),
/* 252 */     dpi600(2, "600");
/*     */     
/*     */     private int _numVal;
/*     */     
/*     */     private String _strVal;
/*     */     
/*     */     SO_Resolution(int numVal, String strVal) {
/* 259 */       this._numVal = numVal;
/* 260 */       this._strVal = strVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 265 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getRealValue() {
/* 270 */       return Integer.parseInt(this._strVal, 10);
/*     */     }
/*     */ 
/*     */     
/*     */     public String getValue() {
/* 275 */       return this._strVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_Resolution findValueByCode(int code) {
/* 280 */       for (SO_Resolution v : values()) {
/* 281 */         if (v.getCode() == code)
/* 282 */           return v; 
/*     */       } 
/* 284 */       Log.w("SO_Resolution", "Find NULL, return dpi150 : " + code);
/* 285 */       return dpi150;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_Resolution findValueByName(String code) {
/* 290 */       for (SO_Resolution v : values()) {
/* 291 */         if (v.getValue().equals(code))
/* 292 */           return v; 
/*     */       } 
/* 294 */       Log.w("SO_Resolution", "Find NULL, return dpi150 : " + code);
/* 295 */       return dpi150;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public enum SO_OutputColor
/*     */   {
/* 302 */     Color(2), Gray(1), BW(0);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_OutputColor(int numVal) {
/* 308 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 313 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_OutputColor findValueByCode(int code) {
/* 318 */       for (SO_OutputColor v : values()) {
/* 319 */         if (v.getCode() == code)
/* 320 */           return v; 
/*     */       } 
/* 322 */       Log.w("SO_OutputColor", "Find NULL, return Gray : " + code);
/* 323 */       return Gray;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_OutputColor findValueByName(String code) {
/* 328 */       for (SO_OutputColor v : values()) {
/* 329 */         if (v.name().equals(code))
/* 330 */           return v; 
/*     */       } 
/* 332 */       Log.w("SO_OutputColor", "Find NULL, return Gray : " + code);
/* 333 */       return Gray;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_OriginalSize
/*     */   {
/* 339 */     A3_SEF(1), A4_SEF(2), A5_SEF(3), A6_SEF(4), C4_SEF(8),
/* 340 */     C5_SEF(9), C6_SEF(10), B4_SEF(11), B5_SEF(12), B6_SEF(13),
/* 341 */     ST_SEF(14), LTR_SEF(15), LGL_SEF(16), LG13_SEF(17), EXECUTIVE_SEF(20),
/* 342 */     PT_SEF(28), DLT_SEF(30), K8_SEF(31), K16_SEF(32), AUTO(40),
/* 343 */     OFICIO_SEF(45), CUSTOM(96), UNKNOWN(128), A4_LEF(130), A5_LEF(131),
/* 344 */     A6_LEF(132), B5_LEF(140), B6_LEF(141), ST_LEF(142), LTR_LEF(143),
/* 345 */     PT_LEF(156), K16_LEF(160);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_OriginalSize(int numVal) {
/* 351 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 356 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_OriginalSize findValueByCode(int code) {
/* 361 */       for (SO_OriginalSize v : values()) {
/*     */         
/* 363 */         if (v.getCode() == code) {
/* 364 */           return v;
/*     */         }
/*     */       } 
/* 367 */       Log.w("SO_OriginalSize", "Find NULL, return A4_SEF : " + code);
/* 368 */       return A4_SEF;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_OriginalSize findValueByName(String code) {
/* 373 */       for (SO_OriginalSize v : values()) {
/* 374 */         if (v.name().equals(code))
/* 375 */           return v; 
/*     */       } 
/* 377 */       Log.w("SO_OriginalSize", "Find NULL, return A4_SEF : " + code);
/* 378 */       return A4_SEF;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_TwoSidedScan
/*     */   {
/* 384 */     OneSided(0), TwoSided(1), TwoSided_Rotate(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_TwoSidedScan(int numVal) {
/* 390 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 395 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_TwoSidedScan findValueByCode(int code) {
/* 400 */       for (SO_TwoSidedScan v : values()) {
/* 401 */         if (v.getCode() == code)
/* 402 */           return v; 
/*     */       } 
/* 404 */       Log.w("SO_TwoSidedScan", "Find NULL, return OneSided : " + code);
/* 405 */       return OneSided;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_TwoSidedScan findValueByName(String code) {
/* 410 */       for (SO_TwoSidedScan v : values()) {
/* 411 */         if (v.name().equals(code))
/* 412 */           return v; 
/*     */       } 
/* 414 */       Log.w("SO_TwoSidedScan", "Find NULL, return OneSided : " + code);
/* 415 */       return OneSided;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_FileFormat
/*     */   {
/* 421 */     JPEG(0),
/* 422 */     PDF(1),
/* 423 */     MPDF(2),
/* 424 */     TIFF(4),
/* 425 */     BMP(5),
/* 426 */     SPDF(7),
/* 427 */     OFD(12),
/* 428 */     MTIFF(13);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_FileFormat(int numVal) {
/* 434 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 439 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_FileFormat findValueByCode(int code) {
/* 444 */       for (SO_FileFormat v : values()) {
/* 445 */         if (v.getCode() == code)
/* 446 */           return v; 
/*     */       } 
/* 448 */       Log.w("SO_FileFormat", "Find NULL, return JPEG : " + code);
/* 449 */       return JPEG;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_FileFormat findValueByName(String code) {
/* 454 */       for (SO_FileFormat v : values()) {
/* 455 */         if (v.name().equals(code))
/* 456 */           return v; 
/*     */       } 
/* 458 */       Log.w("SO_FileFormat", "Find NULL, return JPEG : " + code);
/* 459 */       return JPEG;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_Quality
/*     */   {
/* 465 */     Normal(0), Higher(1), Highest(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_Quality(int numVal) {
/* 471 */       this._numVal = numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 476 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_Quality findValueByCode(int code) {
/* 481 */       for (SO_Quality v : values()) {
/* 482 */         if (v.getCode() == code)
/* 483 */           return v; 
/*     */       } 
/* 485 */       Log.w("SO_Quality", "Find NULL, return Higher : " + code);
/* 486 */       return Higher;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_Quality findValueByName(String code) {
/* 491 */       for (SO_Quality v : values()) {
/* 492 */         if (v.name().equals(code))
/* 493 */           return v; 
/*     */       } 
/* 495 */       Log.w("SO_Quality", "Find NULL, return Higher : " + code);
/* 496 */       return Higher;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_MultiFeedCtrl
/*     */   {
/* 502 */     ContinueScan(1), StopScan(2), StopScanAndEjectPaper(3);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_MultiFeedCtrl(int numval) {
/* 508 */       this._numVal = numval;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 513 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_MultiFeedCtrl findValueByCode(int code) {
/* 518 */       for (SO_MultiFeedCtrl v : values()) {
/* 519 */         if (v.getCode() == code)
/* 520 */           return v; 
/*     */       } 
/* 522 */       Log.w("SO_MultiFeedCtrl", "Find NULL, return StopScan : " + code);
/* 523 */       return StopScan;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_MultiFeedCtrl findValueByName(String code) {
/* 528 */       for (SO_MultiFeedCtrl v : values()) {
/* 529 */         if (v.name().equals(code))
/* 530 */           return v; 
/*     */       } 
/* 532 */       Log.w("SO_MultiFeedCtrl", "Find NULL, return StopScan : " + code);
/* 533 */       return StopScan;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_ReverseMode
/*     */   {
/* 539 */     Off(0), FrontSide(1), RearSide(2), TwoSide(3);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_ReverseMode(int numval) {
/* 545 */       this._numVal = numval;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 550 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_ReverseMode findValueByCode(int code) {
/* 555 */       for (SO_ReverseMode v : values()) {
/* 556 */         if (v.getCode() == code)
/* 557 */           return v; 
/*     */       } 
/* 559 */       Log.w("SO_ReverseMode", "Find NULL, return Off : " + code);
/* 560 */       return Off;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_ReverseMode findValueByName(String code) {
/* 565 */       for (SO_ReverseMode v : values()) {
/* 566 */         if (v.name().equals(code))
/* 567 */           return v; 
/*     */       } 
/* 569 */       Log.w("SO_ReverseMode", "Find NULL, return Off : " + code);
/* 570 */       return Off;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_Orientation
/*     */   {
/* 576 */     Portrait(0),
/* 577 */     Landscape(1),
/* 578 */     Auto(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_Orientation(int numval) {
/* 584 */       this._numVal = numval;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 589 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_Orientation findValueByCode(int code) {
/* 594 */       for (SO_Orientation v : values()) {
/* 595 */         if (v.getCode() == code)
/* 596 */           return v; 
/*     */       } 
/* 598 */       Log.w("SO_Orientation", "Find NULL, return Portrait : " + code);
/* 599 */       return Portrait;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_Orientation findValueByName(String code) {
/* 604 */       for (SO_Orientation v : values()) {
/* 605 */         if (v.name().equals(code))
/* 606 */           return v; 
/*     */       } 
/* 608 */       Log.w("SO_Orientation", "Find NULL, return Portrait : " + code);
/* 609 */       return Portrait;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_BlankDetect
/*     */   {
/* 615 */     Off(0),
/* 616 */     Weak(3),
/* 617 */     Medium(2),
/* 618 */     Strong(1);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_BlankDetect(int numval) {
/* 624 */       this._numVal = numval;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 629 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_BlankDetect findValueByCode(int code) {
/* 634 */       for (SO_BlankDetect v : values()) {
/* 635 */         if (v.getCode() == code)
/* 636 */           return v; 
/*     */       } 
/* 638 */       Log.w("SO_BlankDetect", "Find NULL, return Portrait : " + code);
/* 639 */       return Strong;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_BlankDetect findValueByName(String code) {
/* 644 */       for (SO_BlankDetect v : values()) {
/* 645 */         if (v.name().equals(code))
/* 646 */           return v; 
/*     */       } 
/* 648 */       Log.w("SO_BlankDetect", "Find NULL, return Portrait : " + code);
/* 649 */       return Strong;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum SO_MoreBind
/*     */   {
/* 655 */     Off(0),
/* 656 */     On(1),
/* 657 */     Mixed(2);
/*     */     
/*     */     private int _numVal;
/*     */ 
/*     */     
/*     */     SO_MoreBind(int numval) {
/* 663 */       this._numVal = numval;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getCode() {
/* 668 */       return this._numVal;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_MoreBind findValueByCode(int code) {
/* 673 */       for (SO_MoreBind v : values()) {
/* 674 */         if (v.getCode() == code)
/* 675 */           return v; 
/*     */       } 
/* 677 */       Log.w("SO_MoreBind", "Find NULL, return Portrait : " + code);
/* 678 */       return Off;
/*     */     }
/*     */ 
/*     */     
/*     */     public static SO_MoreBind findValueByName(String code) {
/* 683 */       for (SO_MoreBind v : values()) {
/* 684 */         if (v.name().equals(code))
/* 685 */           return v; 
/*     */       } 
/* 687 */       Log.w("SO_MoreBind", "Find NULL, return Portrait : " + code);
/* 688 */       return Off;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 696 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\ScanOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */