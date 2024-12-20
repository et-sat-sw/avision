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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MS_BillingInfo
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public long flatbedPageScan2Copy;
/*     */   public long adfPageScan2Copy;
/*     */   public long largePageCountFromCopy;
/*     */   public long smallPageCountFromCopy;
/*     */   public long flatbedSmallPageScan2Copy;
/*     */   public long flatbedLargePageScan2Copy;
/*     */   public long adfSmallPageScan2Copy;
/*     */   public long adfLargePageScan2Copy;
/*     */   public long totalPageCountFromCopy;
/*     */   public long colorPageScanFromFlatbed;
/*     */   public long colorPageScanFromAdf;
/*     */   public long largeColorPagePrintCount;
/*     */   public long smallColorPagePrintCount;
/*     */   public long colorCopyErrorCount;
/*     */   public long overallLargePageCount;
/*     */   public long overallSmallPageCount;
/*     */   public long overallPageCount;
/*     */   public long largePageCountOfThisLot;
/*     */   public long smallPageCountOfThisLot;
/*     */   public long printPageCountOfThisToner;
/*     */   public long printPageCountOfThisEp;
/*     */   public long totalErrorCount;
/*     */   public long pickupRollerOfTray1;
/*     */   public long pickupRollerOfTray2;
/*     */   public long pickupRollerOfTray3;
/*     */   public long pickupRollerOfTray4;
/*     */   public long pickupRollerOfManualTray;
/*     */   public long feedRollerOfTray1;
/*     */   public long feedRollerOfTray2;
/*     */   public long feedRollerOfTray3;
/*     */   public long feedRollerOfTray4;
/*     */   public long reverseRollerOfTray1;
/*     */   public long reverseRollerOfTray2;
/*     */   public long reverseRollerOfTray3;
/*     */   public long reverseRollerOfTray4;
/*     */   public long padOfManualTray;
/*     */   public long totalPageCountOfThisLot;
/*     */   public long scanPageCountFromFlatbed;
/*     */   public long scanPageCountFromAdf;
/*     */   public long adfPadCount;
/*     */   public long scannerModuleScanTime;
/*     */   public long totalErrorCounts;
/*     */   public long pickupRollerOfADFCount;
/*     */   public long smallPageCountFromFlatbed;
/*     */   public long largePageCountFromFlatbed;
/*     */   public long smallPageCountFromADF;
/*     */   public long largePageCountFromADF;
/*     */   public long scanPageCountOfLotFlatbed;
/*     */   public long smallPageCountOfLotFlatbed;
/*     */   public long largePageCountOfLotFlatbed;
/*     */   public long scanPageCountOfLotADF;
/*     */   public long smallPageCountOfLotADF;
/*     */   public long largePageCountOfLotADF;
/*     */   public long RunTimeOfEP;
/*     */   public long totalPaperJam;
/*     */   public long faxLargePageCountSent;
/*     */   public long faxSmallPageCountSent;
/*     */   public long faxTotalPageCountSent;
/*     */   public long faxModuleErrCnt;
/*     */   public long adfSimplexPageScan2Copy;
/*     */   public long adfDuplexPageScan2Copy;
/*     */   public long scanSimplexPageCntFromADF;
/*     */   public long scanDuplexPageCntFromADF;
/*     */   public long continuePowerOnTime;
/*     */   
/*     */   public MS_BillingInfo() {
/*  86 */     this.flatbedPageScan2Copy = 0L;
/*  87 */     this.adfPageScan2Copy = 0L;
/*  88 */     this.largePageCountFromCopy = 0L;
/*  89 */     this.smallPageCountFromCopy = 0L;
/*  90 */     this.flatbedSmallPageScan2Copy = 0L;
/*  91 */     this.flatbedLargePageScan2Copy = 0L;
/*  92 */     this.adfSmallPageScan2Copy = 0L;
/*  93 */     this.adfLargePageScan2Copy = 0L;
/*  94 */     this.totalPageCountFromCopy = 0L;
/*     */     
/*  96 */     this.colorPageScanFromFlatbed = 0L;
/*  97 */     this.colorPageScanFromAdf = 0L;
/*  98 */     this.largeColorPagePrintCount = 0L;
/*  99 */     this.smallColorPagePrintCount = 0L;
/* 100 */     this.colorCopyErrorCount = 0L;
/* 101 */     this.overallLargePageCount = 0L;
/* 102 */     this.overallSmallPageCount = 0L;
/* 103 */     this.overallPageCount = 0L;
/* 104 */     this.largePageCountOfThisLot = 0L;
/* 105 */     this.smallPageCountOfThisLot = 0L;
/* 106 */     this.printPageCountOfThisToner = 0L;
/* 107 */     this.printPageCountOfThisEp = 0L;
/* 108 */     this.totalErrorCount = 0L;
/* 109 */     this.pickupRollerOfTray1 = 0L;
/* 110 */     this.pickupRollerOfTray2 = 0L;
/* 111 */     this.pickupRollerOfTray3 = 0L;
/* 112 */     this.pickupRollerOfTray4 = 0L;
/* 113 */     this.pickupRollerOfManualTray = 0L;
/* 114 */     this.feedRollerOfTray1 = 0L;
/* 115 */     this.feedRollerOfTray2 = 0L;
/* 116 */     this.feedRollerOfTray3 = 0L;
/* 117 */     this.feedRollerOfTray4 = 0L;
/* 118 */     this.reverseRollerOfTray1 = 0L;
/* 119 */     this.reverseRollerOfTray2 = 0L;
/* 120 */     this.reverseRollerOfTray3 = 0L;
/* 121 */     this.reverseRollerOfTray4 = 0L;
/* 122 */     this.padOfManualTray = 0L;
/* 123 */     this.totalPageCountOfThisLot = 0L;
/* 124 */     this.scanPageCountFromFlatbed = 0L;
/* 125 */     this.scanPageCountFromAdf = 0L;
/* 126 */     this.adfPadCount = 0L;
/* 127 */     this.scannerModuleScanTime = 0L;
/* 128 */     this.totalErrorCounts = 0L;
/* 129 */     this.pickupRollerOfADFCount = 0L;
/* 130 */     this.smallPageCountFromFlatbed = 0L;
/* 131 */     this.largePageCountFromFlatbed = 0L;
/* 132 */     this.smallPageCountFromADF = 0L;
/* 133 */     this.largePageCountFromADF = 0L;
/* 134 */     this.scanPageCountOfLotFlatbed = 0L;
/* 135 */     this.smallPageCountOfLotFlatbed = 0L;
/* 136 */     this.largePageCountOfLotFlatbed = 0L;
/* 137 */     this.scanPageCountOfLotADF = 0L;
/* 138 */     this.smallPageCountOfLotADF = 0L;
/* 139 */     this.largePageCountOfLotADF = 0L;
/* 140 */     this.RunTimeOfEP = 0L;
/*     */     
/* 142 */     this.faxLargePageCountSent = 0L;
/* 143 */     this.faxSmallPageCountSent = 0L;
/* 144 */     this.faxTotalPageCountSent = 0L;
/*     */     
/* 146 */     this.adfSimplexPageScan2Copy = 0L;
/* 147 */     this.adfDuplexPageScan2Copy = 0L;
/* 148 */     this.scanSimplexPageCntFromADF = 0L;
/* 149 */     this.scanDuplexPageCntFromADF = 0L;
/* 150 */     this.continuePowerOnTime = 0L;
/*     */   }
/*     */ 
/*     */   
/*     */   MS_BillingInfo(Parcel in) {
/* 155 */     this.flatbedPageScan2Copy = in.readLong();
/* 156 */     this.adfPageScan2Copy = in.readLong();
/* 157 */     this.largePageCountFromCopy = in.readLong();
/* 158 */     this.smallPageCountFromCopy = in.readLong();
/* 159 */     this.flatbedSmallPageScan2Copy = in.readLong();
/* 160 */     this.flatbedLargePageScan2Copy = in.readLong();
/* 161 */     this.adfSmallPageScan2Copy = in.readLong();
/* 162 */     this.adfLargePageScan2Copy = in.readLong();
/* 163 */     this.totalPageCountFromCopy = in.readLong();
/*     */     
/* 165 */     this.colorPageScanFromFlatbed = in.readLong();
/* 166 */     this.colorPageScanFromAdf = in.readLong();
/* 167 */     this.largeColorPagePrintCount = in.readLong();
/* 168 */     this.smallColorPagePrintCount = in.readLong();
/* 169 */     this.colorCopyErrorCount = in.readLong();
/* 170 */     this.overallLargePageCount = in.readLong();
/* 171 */     this.overallSmallPageCount = in.readLong();
/* 172 */     this.overallPageCount = in.readLong();
/* 173 */     this.largePageCountOfThisLot = in.readLong();
/* 174 */     this.smallPageCountOfThisLot = in.readLong();
/* 175 */     this.printPageCountOfThisToner = in.readLong();
/* 176 */     this.printPageCountOfThisEp = in.readLong();
/* 177 */     this.totalErrorCount = in.readLong();
/* 178 */     this.pickupRollerOfTray1 = in.readLong();
/* 179 */     this.pickupRollerOfTray2 = in.readLong();
/* 180 */     this.pickupRollerOfTray3 = in.readLong();
/* 181 */     this.pickupRollerOfTray4 = in.readLong();
/* 182 */     this.pickupRollerOfManualTray = in.readLong();
/* 183 */     this.feedRollerOfTray1 = in.readLong();
/* 184 */     this.feedRollerOfTray2 = in.readLong();
/* 185 */     this.feedRollerOfTray3 = in.readLong();
/* 186 */     this.feedRollerOfTray4 = in.readLong();
/* 187 */     this.reverseRollerOfTray1 = in.readLong();
/* 188 */     this.reverseRollerOfTray2 = in.readLong();
/* 189 */     this.reverseRollerOfTray3 = in.readLong();
/* 190 */     this.reverseRollerOfTray4 = in.readLong();
/* 191 */     this.padOfManualTray = in.readLong();
/* 192 */     this.totalPageCountOfThisLot = in.readLong();
/* 193 */     this.scanPageCountFromFlatbed = in.readLong();
/* 194 */     this.scanPageCountFromAdf = in.readLong();
/* 195 */     this.adfPadCount = in.readLong();
/* 196 */     this.scannerModuleScanTime = in.readLong();
/* 197 */     this.totalErrorCounts = in.readLong();
/* 198 */     this.pickupRollerOfADFCount = in.readLong();
/* 199 */     this.smallPageCountFromFlatbed = in.readLong();
/* 200 */     this.largePageCountFromFlatbed = in.readLong();
/* 201 */     this.smallPageCountFromADF = in.readLong();
/* 202 */     this.largePageCountFromADF = in.readLong();
/* 203 */     this.scanPageCountOfLotFlatbed = in.readLong();
/* 204 */     this.smallPageCountOfLotFlatbed = in.readLong();
/* 205 */     this.largePageCountOfLotFlatbed = in.readLong();
/* 206 */     this.scanPageCountOfLotADF = in.readLong();
/* 207 */     this.smallPageCountOfLotADF = in.readLong();
/* 208 */     this.largePageCountOfLotADF = in.readLong();
/* 209 */     this.RunTimeOfEP = in.readLong();
/*     */     
/* 211 */     this.faxLargePageCountSent = in.readLong();
/* 212 */     this.faxSmallPageCountSent = in.readLong();
/* 213 */     this.faxTotalPageCountSent = in.readLong();
/*     */     
/* 215 */     this.adfSimplexPageScan2Copy = in.readLong();
/* 216 */     this.adfDuplexPageScan2Copy = in.readLong();
/* 217 */     this.scanSimplexPageCntFromADF = in.readLong();
/* 218 */     this.scanDuplexPageCntFromADF = in.readLong();
/* 219 */     this.continuePowerOnTime = in.readLong();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/* 225 */     out.writeLong(this.flatbedPageScan2Copy);
/* 226 */     out.writeLong(this.adfPageScan2Copy);
/* 227 */     out.writeLong(this.largePageCountFromCopy);
/* 228 */     out.writeLong(this.smallPageCountFromCopy);
/* 229 */     out.writeLong(this.flatbedSmallPageScan2Copy);
/* 230 */     out.writeLong(this.flatbedLargePageScan2Copy);
/* 231 */     out.writeLong(this.adfSmallPageScan2Copy);
/* 232 */     out.writeLong(this.adfLargePageScan2Copy);
/* 233 */     out.writeLong(this.totalPageCountFromCopy);
/*     */     
/* 235 */     out.writeLong(this.colorPageScanFromFlatbed);
/* 236 */     out.writeLong(this.colorPageScanFromAdf);
/* 237 */     out.writeLong(this.largeColorPagePrintCount);
/* 238 */     out.writeLong(this.smallColorPagePrintCount);
/* 239 */     out.writeLong(this.colorCopyErrorCount);
/* 240 */     out.writeLong(this.overallLargePageCount);
/* 241 */     out.writeLong(this.overallSmallPageCount);
/* 242 */     out.writeLong(this.overallPageCount);
/* 243 */     out.writeLong(this.largePageCountOfThisLot);
/* 244 */     out.writeLong(this.smallPageCountOfThisLot);
/* 245 */     out.writeLong(this.printPageCountOfThisToner);
/* 246 */     out.writeLong(this.printPageCountOfThisEp);
/* 247 */     out.writeLong(this.totalErrorCount);
/* 248 */     out.writeLong(this.pickupRollerOfTray1);
/* 249 */     out.writeLong(this.pickupRollerOfTray2);
/* 250 */     out.writeLong(this.pickupRollerOfTray3);
/* 251 */     out.writeLong(this.pickupRollerOfTray4);
/* 252 */     out.writeLong(this.pickupRollerOfManualTray);
/* 253 */     out.writeLong(this.feedRollerOfTray1);
/* 254 */     out.writeLong(this.feedRollerOfTray2);
/* 255 */     out.writeLong(this.feedRollerOfTray3);
/* 256 */     out.writeLong(this.feedRollerOfTray4);
/* 257 */     out.writeLong(this.reverseRollerOfTray1);
/* 258 */     out.writeLong(this.reverseRollerOfTray2);
/* 259 */     out.writeLong(this.reverseRollerOfTray3);
/* 260 */     out.writeLong(this.reverseRollerOfTray4);
/* 261 */     out.writeLong(this.padOfManualTray);
/* 262 */     out.writeLong(this.totalPageCountOfThisLot);
/* 263 */     out.writeLong(this.scanPageCountFromFlatbed);
/* 264 */     out.writeLong(this.scanPageCountFromAdf);
/* 265 */     out.writeLong(this.adfPadCount);
/* 266 */     out.writeLong(this.scannerModuleScanTime);
/* 267 */     out.writeLong(this.totalErrorCounts);
/* 268 */     out.writeLong(this.pickupRollerOfADFCount);
/* 269 */     out.writeLong(this.smallPageCountFromFlatbed);
/* 270 */     out.writeLong(this.largePageCountFromFlatbed);
/* 271 */     out.writeLong(this.smallPageCountFromADF);
/* 272 */     out.writeLong(this.largePageCountFromADF);
/* 273 */     out.writeLong(this.scanPageCountOfLotFlatbed);
/* 274 */     out.writeLong(this.smallPageCountOfLotFlatbed);
/* 275 */     out.writeLong(this.largePageCountOfLotFlatbed);
/* 276 */     out.writeLong(this.scanPageCountOfLotADF);
/* 277 */     out.writeLong(this.smallPageCountOfLotADF);
/* 278 */     out.writeLong(this.largePageCountOfLotADF);
/* 279 */     out.writeLong(this.RunTimeOfEP);
/*     */     
/* 281 */     out.writeLong(this.faxLargePageCountSent);
/* 282 */     out.writeLong(this.faxSmallPageCountSent);
/* 283 */     out.writeLong(this.faxTotalPageCountSent);
/*     */     
/* 285 */     out.writeLong(this.adfSimplexPageScan2Copy);
/* 286 */     out.writeLong(this.adfDuplexPageScan2Copy);
/* 287 */     out.writeLong(this.scanSimplexPageCntFromADF);
/* 288 */     out.writeLong(this.scanDuplexPageCntFromADF);
/* 289 */     out.writeLong(this.continuePowerOnTime);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 295 */     return 0;
/*     */   }
/*     */   
/* 298 */   public static final Parcelable.Creator<MS_BillingInfo> CREATOR = new Parcelable.Creator<MS_BillingInfo>()
/*     */     {
/*     */       public MS_BillingInfo createFromParcel(Parcel p)
/*     */       {
/* 302 */         return new MS_BillingInfo(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public MS_BillingInfo[] newArray(int size) {
/* 307 */         return new MS_BillingInfo[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 315 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_BillingInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */