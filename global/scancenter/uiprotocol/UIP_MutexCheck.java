/*      */ package global.scancenter.uiprotocol;
/*      */ 
/*      */ import android.util.Log;
/*      */ import global.scancenter.commons.CopyOptions;
/*      */ import global.scancenter.commons.FaxOptions;
/*      */ import global.scancenter.commons.SCGlobal;
/*      */ import global.scancenter.commons.SavedJobOptions;
/*      */ import global.scancenter.commons.ScanOptions;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class UIP_MutexCheck
/*      */ {
/*      */   private static final String TAG = "MutexCheck";
/*      */   public static final int PARAMETERS_NULL = -1;
/*      */   public static final int MUTEXTYPE_NONE = 0;
/*      */   public static final int MUTEXTYPE_PAPERTRAY_REDUCEENLARGE = 1;
/*      */   public static final int MUTEXTYPE_PAPERTRAY_MERGE = 2;
/*      */   public static final int MUTEXTYPE_PAPERTRAY_ROTATECOLLATE = 3;
/*      */   public static final int MUTEXTYPE_PAPERTRAY_BOOKCOPY = 4;
/*      */   public static final int MUTEXTYPE_CUSTOMZOOM_MERGE = 5;
/*      */   public static final int MUTEXTYPE_CUSTOMZOOM_PAPERTRAY = 6;
/*      */   public static final int MUTEXTYPE_CUSTOMZOOM_BOOKCOPY = 7;
/*      */   public static final int MUTEXTYPE_MERGE_REDUCEENLARGE = 8;
/*      */   public static final int MUTEXTYPE_MERGE_PAPERTRAY = 9;
/*      */   public static final int MUTEXTYPE_MERGE_BOOKCOPY = 10;
/*      */   public static final int MUTEXTYPE_TWOSIDECOPY_MANUALTRAY = 11;
/*      */   public static final int MUTEXTYPE_MANUALTRAY_TWOSIDECOPY = 12;
/*      */   public static final int MUTEXTYPE_MEDIATYPE_TWOSIDECOPY = 13;
/*      */   public static final int MUTEXTYPE_BOOKCOPY_MERGE = 14;
/*      */   public static final int MUTEXTYPE_BOOKCOPY_REDUCEENLARGE = 15;
/*      */   public static final int MUTEXTYPE_BOOKCOPY_PAPERTRAY = 16;
/*      */   public static final int MUTEXTYPE_BOOKCOPY_PAPERSIZE = 17;
/*      */   public static final int MUTEXTYPE_TWOSIDECOPY_ROTATE2ND = 18;
/*      */   public static final int MUTEXTYPE_ROTATE2ND_TWOSIDECOPY = 19;
/*      */   public static final int MUTEXTYPE_ROTATECOLLATE_PAPERTRAY = 20;
/*      */   public static final int MUTEXTYPE_PAPERTRAY_AUTOFIT = 21;
/*      */   public static final int MUTEXTYPE_MERGE_AUTOFIT = 22;
/*      */   public static final int MUTEXTYPE_AUTOFIT_MERGE = 23;
/*      */   public static final int MUTEXTYPE_AUTOFIT_PAPERTRAY = 24;
/*      */   public static final int MUTEXTYPE_CUSTOMZOOM_REDUCEENLARGE = 25;
/*      */   public static final int MUTEXTYPE_COVERPAGE_COLLATION = 26;
/*      */   public static final int MUTEXTYPE_COLLATION_COVERPAGE = 27;
/*      */   public static final int MUTEXTYPE_PAPERTRAY_PAGELAYOUT = 28;
/*      */   public static final int MUTEXTYPE_CUSTOMZOOM_PAGELAYOUT = 29;
/*      */   public static final int MUTEXTYPE_PAGELAYOUT_REDUCEENLARGE = 30;
/*      */   public static final int MUTEXTYPE_PAGELAYOUT_PAPERTRAY = 31;
/*      */   public static final int MUTEXTYPE_PAGELAYOUT_BOOKCOPY = 32;
/*      */   public static final int MUTEXTYPE_BOOKCOPY_PAGELAYOUT = 33;
/*      */   public static final int MUTEXTYPE_PAGELAYOUT_AUTOFIT = 34;
/*      */   public static final int MUTEXTYPE_AUTOFIT_PAGELAYOUT = 35;
/*      */   public static final int MUTEXTYPE_PAGELAYOUT_MERGE = 36;
/*      */   public static final int MUTEXTYPE_MERGE_PAGELAYOUT = 37;
/*      */   public static final int MUTEXTYPE_COUNT_COVERPAGE = 38;
/*      */   public static final int MUTEXTYPE_COVERPAGE_PAPERTRAY = 39;
/*      */   public static final int MUTEXTYPE_PAPERTRAY_COVERPAGE = 40;
/*      */   public static final int MUTEXTYPE_COVERPAGE_MERGE = 41;
/*      */   public static final int MUTEXTYPE_MERGE_COVERPAGE = 42;
/*      */   public static final int MUTEXTYPE_COVERPAGE_COUNT = 43;
/*      */   public static final int MUTEXTYPE_AUTOFIT_CUSTOMZOOM = 44;
/*      */   public static final int MUTEXTYPE_CUSTOMZOOM_AUTOFIT = 45;
/*      */   public static final int MUTEXTYPE_TWOSIDECOPY_BOOKCOPY = 46;
/*      */   public static final int MUTEXTYPE_BOOKCOPY_TWOSIDECOPY = 47;
/*      */   public static final int MUTEXTYPE_IDCOPY_MANUALTRAY_CUSTOM = 101;
/*      */   public static final int MUTEXTYPE_CSA6_IDCOPY = 102;
/*      */   public static final int MUTEXTYPE_IDCOPY_MANUALTRAY = 103;
/*      */   public static final int MUTEXTYPE_MANUALTRAY_IDCOPY = 104;
/*      */   public static final int MUTEXTYPE_MEDIATYPE_IDCOPY = 105;
/*      */   public static final int MUTEXTYPE_BW_JPEG = 201;
/*      */   public static final int MUTEXTYPE_GRAY_BMP = 202;
/*      */   public static final int MUTEXTYPE_COLOR_BMP = 203;
/*      */   public static final int MUTEXTYPE_JPEG_BW = 204;
/*      */   public static final int MUTEXTYPE_BMP_COLORGRAY = 205;
/*      */   public static final int MUTEXTYPE_BW_QUALITY_NONE = 206;
/*      */   public static final int MUTEXTYPE_Bind_BookCopy_Off = 207;
/*      */   public static final int MUTEXTYPE_RESOLUTION_COLOR = 208;
/*      */   public static final int MUTEXTYPE_RESOLUTION_JPEG = 209;
/*      */   public static final int MUTEXTYPE_DESCREEN_ORIGINAL = 210;
/*      */   public static final int MUTEXTYPE_ORIGINAL_DESCREEN = 211;
/*      */   public static final int MUTEXTYPE_ORIGINAL_BookCopy_Off = 212;
/*      */   public static final int MUTEXTYPE_COLOR_RESOLUTION = 213;
/*      */   public static final int MUTEXTYPE_TWOSIDEPRINT_JPEG = 300;
/*      */   public static final int MUTEXTYPE_TWOSIDEPRINT_MANUALTRAY = 301;
/*      */   public static final int MUTEXTYPE_MANUALTRAY_TWOSIDEPRINT = 302;
/*      */   public static final int MUTEXTYPE_MEDIATYPE_TWOSIDEPRINT = 303;
/*      */   public static final int MUTEXTYPE_JPEG_TWOSIDEPRINT = 304;
/*      */   public static final int MUTEXTYPE_USB_CUSTOMSIZE = 305;
/*      */   public static final int MUTEXTYPE_COLOR_QUALITY = 400;
/*      */   public static final int MUTEXTYPE_QUALITY_COLOR = 401;
/*      */   
/*      */   public static ArrayList<Integer> forCopy(Object target, CopyOptions copyOptions, ArrayList<UIP_TrayStatusInfo> aTrayStatus) {
/*  124 */     ArrayList<Integer> iMutexCheck = new ArrayList<Integer>();
/*  125 */     if (copyOptions == null) {
/*      */       
/*  127 */       Log.w("forCopy", "params is null !!");
/*      */       
/*  129 */       iMutexCheck.add(Integer.valueOf(-1));
/*  130 */       return iMutexCheck;
/*      */     } 
/*      */     
/*  133 */     Log.i("forCopy", String.format("target:%s, paperTray:%s, reduceEnlarge:%s, pageLayout:%s, customZoom:%d, \npaperSize:%s, twoSideCopy:%s, copyOutput:%s, bookCopy:%s, rotateSide2:%s, \nmerge:%s ,coverPage:%s ,copyCount:%s ,autoFit:%s ,mediaType:%s", new Object[] { target, copyOptions.paperTray
/*      */ 
/*      */ 
/*      */             
/*  137 */             .name(), copyOptions.reduceEnlarge.name(), copyOptions.pageLayout.name(), Integer.valueOf(copyOptions.customZoom), copyOptions.paperSize, copyOptions.twoSidedCopy, copyOptions.copyOutput, 
/*  138 */             Boolean.valueOf(copyOptions.bookCopy), Boolean.valueOf(copyOptions.rotateSide2), copyOptions.merge, copyOptions.coverPage, 
/*  139 */             Integer.valueOf(copyOptions.copyCount), Boolean.valueOf(copyOptions.autoFit), copyOptions.mediaType }));
/*      */ 
/*      */     
/*  142 */     if (target instanceof CopyOptions.CO_ReduceEnlarge || target instanceof CopyOptions.CO_Merge || target instanceof CopyOptions.CO_PageLayout || target instanceof Integer || target instanceof CopyOptions.CO_CopyOutput || target instanceof Boolean) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  149 */       if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*      */         
/*  151 */         if (copyOptions.customZoom != 100) {
/*      */           
/*  153 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  154 */           addNewstMutex(iMutexCheck, 1);
/*      */         } 
/*      */         
/*  157 */         if (copyOptions.pageLayout != CopyOptions.CO_PageLayout.None) {
/*      */           
/*  159 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  160 */           addNewstMutex(iMutexCheck, 28);
/*      */         } 
/*      */         
/*  163 */         if (copyOptions.merge != CopyOptions.CO_Merge.None) {
/*      */           
/*  165 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  166 */           addNewstMutex(iMutexCheck, 2);
/*      */         } 
/*      */         
/*  169 */         if (copyOptions.copyOutput == CopyOptions.CO_CopyOutput.RotateCollated) {
/*      */           
/*  171 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  172 */           addNewstMutex(iMutexCheck, 3);
/*      */         } 
/*      */ 
/*      */         
/*  176 */         if (copyOptions.bookCopy) {
/*      */           
/*  178 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  179 */           addNewstMutex(iMutexCheck, 4);
/*      */         } 
/*      */ 
/*      */         
/*  183 */         if (copyOptions.autoFit) {
/*      */           
/*  185 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  186 */           addNewstMutex(iMutexCheck, 21);
/*      */         } 
/*      */       } 
/*      */       
/*  190 */       if (copyOptions.coverPage != CopyOptions.CO_CoverPage.Off && 
/*  191 */         copyOptions.copyOutput == CopyOptions.CO_CopyOutput.Uncollated) {
/*  192 */         copyOptions.coverPage = CopyOptions.CO_CoverPage.Off;
/*  193 */         addNewstMutex(iMutexCheck, 26);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  199 */     if (target instanceof CopyOptions.CO_PageLayout || target instanceof CopyOptions.CO_Merge || target instanceof CopyOptions.CO_PaperTray || target instanceof Boolean || target instanceof CopyOptions.CO_ReduceEnlarge)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  205 */       if (copyOptions.customZoom != 100) {
/*      */         
/*  207 */         if (copyOptions.pageLayout != CopyOptions.CO_PageLayout.None) {
/*      */           
/*  209 */           copyOptions.customZoom = 100;
/*  210 */           addNewstMutex(iMutexCheck, 29);
/*      */         } 
/*  212 */         if (copyOptions.merge != CopyOptions.CO_Merge.None) {
/*      */           
/*  214 */           copyOptions.customZoom = 100;
/*  215 */           addNewstMutex(iMutexCheck, 5);
/*      */         } 
/*      */         
/*  218 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*      */           
/*  220 */           copyOptions.customZoom = 100;
/*  221 */           addNewstMutex(iMutexCheck, 6);
/*      */         } 
/*      */         
/*  224 */         if (copyOptions.reduceEnlarge == CopyOptions.CO_ReduceEnlarge.Auto) {
/*      */           
/*  226 */           copyOptions.customZoom = 100;
/*  227 */           addNewstMutex(iMutexCheck, 25);
/*      */         } 
/*      */         
/*  230 */         if (copyOptions.autoFit) {
/*  231 */           copyOptions.customZoom = 100;
/*  232 */           addNewstMutex(iMutexCheck, 45);
/*      */         } 
/*      */         
/*  235 */         if (copyOptions.bookCopy) {
/*      */           
/*  237 */           Log.w("MutexCheck", "Mutex Happen:7");
/*  238 */           copyOptions.autoFit = true;
/*  239 */           copyOptions.reduceEnlarge = CopyOptions.CO_ReduceEnlarge.Auto;
/*  240 */           copyOptions.customZoom = 100;
/*  241 */           addNewstMutex(iMutexCheck, 7);
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  247 */     if (target instanceof CopyOptions.CO_ReduceEnlarge || target instanceof CopyOptions.CO_PaperTray || target instanceof Integer || target instanceof Boolean) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  252 */       if (copyOptions.pageLayout != CopyOptions.CO_PageLayout.None) {
/*      */ 
/*      */         
/*  255 */         if (copyOptions.customZoom != 100) {
/*      */           
/*  257 */           copyOptions.pageLayout = CopyOptions.CO_PageLayout.None;
/*  258 */           addNewstMutex(iMutexCheck, 30);
/*      */         } 
/*      */         
/*  261 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*      */           
/*  263 */           copyOptions.pageLayout = CopyOptions.CO_PageLayout.None;
/*  264 */           addNewstMutex(iMutexCheck, 31);
/*      */         } 
/*      */ 
/*      */         
/*  268 */         if (copyOptions.autoFit) {
/*      */           
/*  270 */           copyOptions.pageLayout = CopyOptions.CO_PageLayout.None;
/*  271 */           addNewstMutex(iMutexCheck, 34);
/*      */         } 
/*      */         
/*  274 */         if (copyOptions.bookCopy) {
/*      */           
/*  276 */           copyOptions.pageLayout = CopyOptions.CO_PageLayout.None;
/*  277 */           addNewstMutex(iMutexCheck, 32);
/*      */         } 
/*      */       } 
/*      */       
/*  281 */       if (copyOptions.merge != CopyOptions.CO_Merge.None) {
/*      */ 
/*      */         
/*  284 */         if (copyOptions.customZoom != 100) {
/*      */           
/*  286 */           copyOptions.merge = CopyOptions.CO_Merge.None;
/*  287 */           addNewstMutex(iMutexCheck, 8);
/*      */         } 
/*      */         
/*  290 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*      */           
/*  292 */           copyOptions.merge = CopyOptions.CO_Merge.None;
/*  293 */           addNewstMutex(iMutexCheck, 9);
/*      */         } 
/*      */ 
/*      */         
/*  297 */         if (copyOptions.autoFit) {
/*      */           
/*  299 */           copyOptions.merge = CopyOptions.CO_Merge.None;
/*  300 */           addNewstMutex(iMutexCheck, 22);
/*      */         } 
/*      */         
/*  303 */         if (copyOptions.bookCopy) {
/*      */           
/*  305 */           copyOptions.merge = CopyOptions.CO_Merge.None;
/*  306 */           addNewstMutex(iMutexCheck, 10);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  322 */     if (target instanceof CopyOptions.CO_PageLayout || target instanceof CopyOptions.CO_Merge || target instanceof CopyOptions.CO_PaperTray || target instanceof Integer) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  327 */       if (copyOptions.reduceEnlarge == CopyOptions.CO_ReduceEnlarge.Auto) {
/*      */         
/*  329 */         if (copyOptions.pageLayout != CopyOptions.CO_PageLayout.None) {
/*      */           
/*  331 */           copyOptions.autoFit = false;
/*  332 */           copyOptions.reduceEnlarge = CopyOptions.CO_ReduceEnlarge.CustomZone;
/*  333 */           addNewstMutex(iMutexCheck, 35);
/*      */         } 
/*      */         
/*  336 */         if (copyOptions.merge != CopyOptions.CO_Merge.None) {
/*      */           
/*  338 */           copyOptions.autoFit = false;
/*  339 */           copyOptions.reduceEnlarge = CopyOptions.CO_ReduceEnlarge.CustomZone;
/*  340 */           addNewstMutex(iMutexCheck, 23);
/*      */         } 
/*      */         
/*  343 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*      */           
/*  345 */           copyOptions.autoFit = false;
/*  346 */           copyOptions.reduceEnlarge = CopyOptions.CO_ReduceEnlarge.CustomZone;
/*  347 */           addNewstMutex(iMutexCheck, 24);
/*      */         } 
/*      */       } 
/*  350 */       if (copyOptions.autoFit && 
/*  351 */         copyOptions.customZoom != 100) {
/*  352 */         copyOptions.autoFit = false;
/*  353 */         addNewstMutex(iMutexCheck, 44);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  359 */     if (target instanceof CopyOptions.CO_PaperTray)
/*      */     {
/*  361 */       if (copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwo || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.TwoToTwo || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwoBack || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwoSidedRotate || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.TwoSidedRotate)
/*      */       {
/*      */ 
/*      */         
/*  365 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.ManualTray && (copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.A6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.B6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.PT_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.CUSTOM || copyOptions.mediaType == CopyOptions.CO_MediaType.Transparency || copyOptions.mediaType == CopyOptions.CO_MediaType.Bond || copyOptions.mediaType == CopyOptions.CO_MediaType.Cardstock)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  374 */           copyOptions.twoSidedCopy = CopyOptions.CO_TwoSidedCopy.OneToOne;
/*  375 */           addNewstMutex(iMutexCheck, 11);
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  381 */     if (target instanceof CopyOptions.CO_TwoSidedCopy) {
/*      */       
/*  383 */       if (copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.A6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.B6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.PT_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.CUSTOM)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*  388 */         if (copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwo || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.TwoToTwo || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwoBack || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwoSidedRotate || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.TwoSidedRotate) {
/*      */ 
/*      */ 
/*      */           
/*  392 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  393 */           addNewstMutex(iMutexCheck, 12);
/*      */         } 
/*      */       }
/*      */       
/*  397 */       if (copyOptions.mediaType == CopyOptions.CO_MediaType.Transparency || copyOptions.mediaType == CopyOptions.CO_MediaType.Bond || copyOptions.mediaType == CopyOptions.CO_MediaType.Cardstock)
/*      */       {
/*      */ 
/*      */         
/*  401 */         if (copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwo || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.TwoToTwo || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwoBack || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToTwoSidedRotate || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.TwoSidedRotate) {
/*      */ 
/*      */ 
/*      */           
/*  405 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  406 */           addNewstMutex(iMutexCheck, 13);
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  412 */     if (target instanceof CopyOptions.CO_ReduceEnlarge || target instanceof CopyOptions.CO_PageLayout || target instanceof CopyOptions.CO_Merge || target instanceof Integer || target instanceof CopyOptions.CO_PaperTray || target instanceof CopyOptions.CO_TrayPaperSize) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  419 */       if (copyOptions.bookCopy) {
/*      */         
/*  421 */         if (copyOptions.customZoom != 100) {
/*      */           
/*  423 */           Log.w("MutexCheck", "Mutex Happen:15");
/*  424 */           copyOptions.bookCopy = false;
/*  425 */           addNewstMutex(iMutexCheck, 15);
/*      */         } 
/*      */         
/*  428 */         if (copyOptions.pageLayout != CopyOptions.CO_PageLayout.None) {
/*      */           
/*  430 */           copyOptions.bookCopy = false;
/*  431 */           addNewstMutex(iMutexCheck, 33);
/*      */         } 
/*      */         
/*  434 */         if (copyOptions.merge != CopyOptions.CO_Merge.None) {
/*      */           
/*  436 */           copyOptions.bookCopy = false;
/*  437 */           addNewstMutex(iMutexCheck, 14);
/*      */         } 
/*      */ 
/*      */         
/*  441 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*      */           
/*  443 */           copyOptions.bookCopy = false;
/*  444 */           addNewstMutex(iMutexCheck, 16);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  458 */       if (copyOptions.coverPage != CopyOptions.CO_CoverPage.Off && 
/*  459 */         copyOptions.merge != CopyOptions.CO_Merge.None) {
/*  460 */         copyOptions.coverPage = CopyOptions.CO_CoverPage.Off;
/*  461 */         addNewstMutex(iMutexCheck, 41);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  467 */     if (target instanceof Boolean)
/*      */     {
/*  469 */       if (copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.OneToOne || copyOptions.twoSidedCopy == CopyOptions.CO_TwoSidedCopy.TwoToOne)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  477 */         if (copyOptions.bookCopy) {
/*      */           
/*  479 */           copyOptions.twoSidedCopy = CopyOptions.CO_TwoSidedCopy.OneToTwo;
/*  480 */           addNewstMutex(iMutexCheck, 46);
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  486 */     if (target instanceof CopyOptions.CO_TwoSidedCopy);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  509 */     if (target instanceof CopyOptions.CO_PaperTray) {
/*      */       
/*  511 */       if (copyOptions.copyOutput == CopyOptions.CO_CopyOutput.RotateCollated)
/*      */       {
/*  513 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*      */           
/*  515 */           copyOptions.copyOutput = CopyOptions.CO_CopyOutput.Collated;
/*  516 */           addNewstMutex(iMutexCheck, 20);
/*      */         } 
/*      */       }
/*      */       
/*  520 */       if (copyOptions.coverPage != CopyOptions.CO_CoverPage.Off && 
/*  521 */         copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*  522 */         copyOptions.coverPage = CopyOptions.CO_CoverPage.Off;
/*  523 */         addNewstMutex(iMutexCheck, 39);
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  530 */     if (target instanceof CopyOptions.CO_CoverPage)
/*      */     {
/*  532 */       if (copyOptions.coverPage != CopyOptions.CO_CoverPage.Off) {
/*  533 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.AutoSelect) {
/*  534 */           UIP_TrayStatusInfo temp = getTrayBySameMedia(aTrayStatus, copyOptions.trayForCoverPage);
/*  535 */           copyOptions.paperTray = temp.printerTray;
/*      */           
/*  537 */           addNewstMutex(iMutexCheck, 40);
/*      */         } 
/*      */         
/*  540 */         if (copyOptions.merge == CopyOptions.CO_Merge.Four_Up || copyOptions.merge == CopyOptions.CO_Merge.Two_Up) {
/*  541 */           copyOptions.merge = CopyOptions.CO_Merge.None;
/*  542 */           addNewstMutex(iMutexCheck, 42);
/*      */         } 
/*      */         
/*  545 */         if (copyOptions.copyOutput == CopyOptions.CO_CopyOutput.Uncollated) {
/*  546 */           copyOptions.copyOutput = CopyOptions.CO_CopyOutput.Collated;
/*  547 */           addNewstMutex(iMutexCheck, 27);
/*      */         } 
/*      */         
/*  550 */         if (copyOptions.copyCount == 1) {
/*  551 */           copyOptions.copyCount = 2;
/*  552 */           addNewstMutex(iMutexCheck, 38);
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*  557 */     if (target instanceof Integer) {
/*      */ 
/*      */       
/*  560 */       if (copyOptions.coverPage != CopyOptions.CO_CoverPage.Off)
/*      */       {
/*  562 */         if (copyOptions.copyCount == 1) {
/*      */           
/*  564 */           copyOptions.coverPage = CopyOptions.CO_CoverPage.Off;
/*  565 */           addNewstMutex(iMutexCheck, 43);
/*      */         } 
/*      */       }
/*      */       
/*  569 */       if (copyOptions.coverPage != CopyOptions.CO_CoverPage.Off)
/*      */       {
/*  571 */         if (copyOptions.copyOutput == CopyOptions.CO_CopyOutput.Uncollated) {
/*      */           
/*  573 */           copyOptions.coverPage = CopyOptions.CO_CoverPage.Off;
/*  574 */           addNewstMutex(iMutexCheck, 26);
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  580 */     if (target instanceof CopyOptions.CO_Merge)
/*      */     {
/*  582 */       if (copyOptions.pageLayout != CopyOptions.CO_PageLayout.None && 
/*  583 */         copyOptions.merge != CopyOptions.CO_Merge.None) {
/*  584 */         copyOptions.pageLayout = CopyOptions.CO_PageLayout.None;
/*  585 */         addNewstMutex(iMutexCheck, 36);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  590 */     if (target instanceof CopyOptions.CO_PageLayout)
/*      */     {
/*  592 */       if (copyOptions.merge != CopyOptions.CO_Merge.None && 
/*  593 */         copyOptions.pageLayout != CopyOptions.CO_PageLayout.None) {
/*  594 */         copyOptions.merge = CopyOptions.CO_Merge.None;
/*  595 */         addNewstMutex(iMutexCheck, 37);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  602 */     if (iMutexCheck.size() > 0) {
/*  603 */       for (Iterator<Integer> iterator = iMutexCheck.iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/*  604 */         Log.w("MutexCheck", "Mutex Happen:" + i); }
/*      */     
/*      */     }
/*  607 */     return iMutexCheck;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ArrayList<Integer> forIdCopy(Object target, CopyOptions copyOptions) {
/*  630 */     ArrayList<Integer> iMutexCheck = new ArrayList<Integer>();
/*      */     
/*  632 */     if (copyOptions == null) {
/*      */       
/*  634 */       Log.w("forIdCopy", "params is null !!");
/*      */       
/*  636 */       iMutexCheck.add(Integer.valueOf(-1));
/*  637 */       return iMutexCheck;
/*      */     } 
/*      */     
/*  640 */     Log.i("forIdCopy", String.format("target:%s, paperTray:%s, reduceEnlarge:%s, pageLayout:%s, customZoom:%d, paperSize:%s, twoSideCopy:%s, csa6Template:%s", new Object[] { target, copyOptions.paperTray
/*      */             
/*  642 */             .name(), copyOptions.reduceEnlarge.name(), copyOptions.pageLayout
/*  643 */             .name(), Integer.valueOf(copyOptions.customZoom), copyOptions.paperSize, copyOptions.twoSidedCopy, 
/*  644 */             Boolean.valueOf(copyOptions.csa6Template) }));
/*      */ 
/*      */     
/*  647 */     if (target instanceof CopyOptions.CO_PaperTray)
/*      */     {
/*  649 */       if (copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_DuplexCopy || copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_Multiple || copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_RightLeft || copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_UpDown)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*  654 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.ManualTray && copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.CUSTOM) {
/*      */ 
/*      */           
/*  657 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  658 */           addNewstMutex(iMutexCheck, 101);
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  664 */     if (target instanceof CopyOptions.CO_PageLayout)
/*      */     {
/*  666 */       if (copyOptions.csa6Template && copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_Multiple) {
/*      */         
/*  668 */         Log.w("MutexCheck", "Mutex Happen:102");
/*  669 */         copyOptions.pageLayout = CopyOptions.CO_PageLayout.IDCard_UpDown;
/*  670 */         addNewstMutex(iMutexCheck, 102);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  675 */     if (target instanceof CopyOptions.CO_PaperTray)
/*      */     {
/*  677 */       if (copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_DuplexCopy)
/*      */       {
/*  679 */         if (copyOptions.paperTray == CopyOptions.CO_PaperTray.ManualTray && (copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.A6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.B6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.PT_SEF || copyOptions.mediaType == CopyOptions.CO_MediaType.Transparency || copyOptions.mediaType == CopyOptions.CO_MediaType.Bond || copyOptions.mediaType == CopyOptions.CO_MediaType.Cardstock)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  687 */           copyOptions.pageLayout = CopyOptions.CO_PageLayout.IDCard_UpDown;
/*  688 */           addNewstMutex(iMutexCheck, 103);
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  694 */     if (target instanceof CopyOptions.CO_PageLayout)
/*      */     {
/*  696 */       if (copyOptions.paperTray == CopyOptions.CO_PaperTray.ManualTray && (copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.A6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.B6_SEF || copyOptions.paperSize == CopyOptions.CO_TrayPaperSize.PT_SEF))
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*  701 */         if (copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_DuplexCopy) {
/*      */           
/*  703 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  704 */           addNewstMutex(iMutexCheck, 104);
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*  710 */     if (target instanceof CopyOptions.CO_PageLayout)
/*      */     {
/*  712 */       if (copyOptions.mediaType == CopyOptions.CO_MediaType.Transparency || copyOptions.mediaType == CopyOptions.CO_MediaType.Bond || copyOptions.mediaType == CopyOptions.CO_MediaType.Cardstock)
/*      */       {
/*      */ 
/*      */         
/*  716 */         if (copyOptions.pageLayout == CopyOptions.CO_PageLayout.IDCard_DuplexCopy) {
/*      */           
/*  718 */           addNewstMutex(iMutexCheck, 105);
/*  719 */           copyOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*  724 */     if (iMutexCheck.size() > 0) {
/*  725 */       for (Iterator<Integer> iterator = iMutexCheck.iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/*  726 */         Log.w("MutexCheck", "Mutex Happen:" + i); }
/*      */     
/*      */     }
/*  729 */     return iMutexCheck;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ArrayList<Integer> forScanTo(Object target, ScanOptions scanOptions) {
/*  756 */     ArrayList<Integer> iMutexCheck = new ArrayList<Integer>();
/*      */     
/*  758 */     if (scanOptions == null) {
/*      */       
/*  760 */       SCGlobal.printDebugLog("MutexCheck", 1, "forScanTo: params is null !!");
/*      */       
/*  762 */       iMutexCheck.add(Integer.valueOf(-1));
/*  763 */       return iMutexCheck;
/*      */     } 
/*      */     
/*  766 */     SCGlobal.printDebugLog("MutexCheck", 3, "forScanTo :" + String.format("target:%s, fileFormat:%s, outputColor:%s, quality:%s, bind:%s, orientation:%s", new Object[] { target, scanOptions.fileFormat
/*  767 */             .name(), scanOptions.outputColor.name(), scanOptions.quality.name(), scanOptions.isBind
/*  768 */             .toString(), scanOptions.orientation.name() }));
/*      */     
/*  770 */     if (target instanceof ScanOptions.SO_FileFormat) {
/*      */ 
/*      */       
/*  773 */       if (scanOptions.outputColor == ScanOptions.SO_OutputColor.BW && scanOptions.fileFormat == ScanOptions.SO_FileFormat.JPEG) {
/*      */ 
/*      */         
/*  776 */         scanOptions.outputColor = ScanOptions.SO_OutputColor.Color;
/*  777 */         addNewstMutex(iMutexCheck, 201);
/*      */ 
/*      */         
/*  780 */         if (scanOptions.resolution == ScanOptions.SO_Resolution.dpi600) {
/*      */           
/*  782 */           scanOptions.resolution = ScanOptions.SO_Resolution.dpi300;
/*  783 */           addNewstMutex(iMutexCheck, 209);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  788 */       if (scanOptions.outputColor == ScanOptions.SO_OutputColor.Gray && scanOptions.fileFormat == ScanOptions.SO_FileFormat.BMP) {
/*      */ 
/*      */         
/*  791 */         scanOptions.outputColor = ScanOptions.SO_OutputColor.BW;
/*  792 */         addNewstMutex(iMutexCheck, 202);
/*      */       } 
/*      */ 
/*      */       
/*  796 */       if (scanOptions.outputColor == ScanOptions.SO_OutputColor.Color && scanOptions.fileFormat == ScanOptions.SO_FileFormat.BMP) {
/*      */ 
/*      */         
/*  799 */         scanOptions.outputColor = ScanOptions.SO_OutputColor.BW;
/*  800 */         addNewstMutex(iMutexCheck, 203);
/*      */       } 
/*      */     } 
/*      */     
/*  804 */     if (target instanceof ScanOptions.SO_OutputColor) {
/*      */ 
/*      */       
/*  807 */       if (scanOptions.fileFormat == ScanOptions.SO_FileFormat.JPEG && scanOptions.outputColor == ScanOptions.SO_OutputColor.BW) {
/*      */ 
/*      */         
/*  810 */         scanOptions.fileFormat = ScanOptions.SO_FileFormat.MPDF;
/*  811 */         addNewstMutex(iMutexCheck, 204);
/*      */       } 
/*      */ 
/*      */       
/*  815 */       if (scanOptions.fileFormat == ScanOptions.SO_FileFormat.BMP && (scanOptions.outputColor == ScanOptions.SO_OutputColor.Color || scanOptions.outputColor == ScanOptions.SO_OutputColor.Gray)) {
/*      */ 
/*      */         
/*  818 */         scanOptions.fileFormat = ScanOptions.SO_FileFormat.MPDF;
/*  819 */         addNewstMutex(iMutexCheck, 205);
/*      */       } 
/*      */ 
/*      */       
/*  823 */       if (scanOptions.resolution == ScanOptions.SO_Resolution.dpi600 && scanOptions.outputColor == ScanOptions.SO_OutputColor.Color) {
/*      */ 
/*      */         
/*  826 */         scanOptions.resolution = ScanOptions.SO_Resolution.dpi300;
/*  827 */         addNewstMutex(iMutexCheck, 208);
/*      */       } 
/*      */     } 
/*      */     
/*  831 */     if (target instanceof ScanOptions.SO_Quality)
/*      */     {
/*  833 */       if (scanOptions.outputColor == ScanOptions.SO_OutputColor.BW)
/*      */       {
/*  835 */         addNewstMutex(iMutexCheck, 206);
/*      */       }
/*      */     }
/*      */     
/*  839 */     if (target instanceof ScanOptions.SO_Resolution)
/*      */     {
/*  841 */       if (scanOptions.outputColor == ScanOptions.SO_OutputColor.Color && scanOptions.resolution == ScanOptions.SO_Resolution.dpi600) {
/*      */ 
/*      */         
/*  844 */         scanOptions.outputColor = ScanOptions.SO_OutputColor.BW;
/*  845 */         addNewstMutex(iMutexCheck, 213);
/*      */       } 
/*      */     }
/*      */     
/*  849 */     if (target instanceof Boolean)
/*      */     {
/*  851 */       if (!scanOptions.isBind.booleanValue() && scanOptions.orientation == ScanOptions.SO_Orientation.Auto) {
/*      */ 
/*      */         
/*  854 */         scanOptions.orientation = ScanOptions.SO_Orientation.Portrait;
/*  855 */         addNewstMutex(iMutexCheck, 207);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*  860 */     if (target instanceof Boolean && 
/*  861 */       scanOptions.originalType != ScanOptions.SO_OriginalType.Text && 
/*  862 */       scanOptions.descreen.booleanValue()) {
/*  863 */       scanOptions.originalType = ScanOptions.SO_OriginalType.Text;
/*  864 */       addNewstMutex(iMutexCheck, 211);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  869 */     if (target instanceof ScanOptions.SO_OriginalType && 
/*  870 */       scanOptions.descreen.booleanValue() && 
/*  871 */       scanOptions.originalType != ScanOptions.SO_OriginalType.Text) {
/*  872 */       scanOptions.descreen = Boolean.valueOf(false);
/*  873 */       addNewstMutex(iMutexCheck, 210);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  880 */     if (iMutexCheck.size() > 0) {
/*  881 */       for (Iterator<Integer> iterator = iMutexCheck.iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/*  882 */         Log.w("MutexCheck", "Mutex Happen:" + i); }
/*      */     
/*      */     }
/*  885 */     return iMutexCheck;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ArrayList<Integer> forReprint(Object target, SavedJobOptions savedJobOptions) {
/*  910 */     ArrayList<Integer> iMutexCheck = new ArrayList<Integer>();
/*      */     
/*  912 */     if (savedJobOptions == null) {
/*      */       
/*  914 */       Log.w("forReprint", "params is null !!");
/*      */       
/*  916 */       iMutexCheck.add(Integer.valueOf(-1));
/*  917 */       return iMutexCheck;
/*      */     } 
/*      */     
/*  920 */     Log.i("forReprint", String.format("target:%s, twoSidedPrint:%s, paperTray:%s, paperSize:%s, mediaType:%s, fileName:%s, source:%s", new Object[] { target, savedJobOptions.twoSidedPrint
/*  921 */             .name(), savedJobOptions.paperTray.name(), savedJobOptions.paperSize
/*  922 */             .name(), savedJobOptions.mediaType.name(), savedJobOptions.fileName, savedJobOptions.source
/*  923 */             .name() }));
/*      */     
/*  925 */     if (target instanceof String || target instanceof CopyOptions.CO_PaperTray)
/*      */     {
/*      */       
/*  928 */       if (savedJobOptions.twoSidedPrint != SavedJobOptions.SV_TwoSidedPrint.OneSided) {
/*      */         
/*  930 */         if (savedJobOptions.source == SavedJobOptions.SV_JobSource.USB && (savedJobOptions.fileName
/*  931 */           .toLowerCase().endsWith(".jpg") || savedJobOptions.fileName
/*  932 */           .toLowerCase().endsWith(".jpeg"))) {
/*      */           
/*  934 */           savedJobOptions.twoSidedPrint = SavedJobOptions.SV_TwoSidedPrint.OneSided;
/*  935 */           addNewstMutex(iMutexCheck, 300);
/*      */         } 
/*      */         
/*  938 */         if (savedJobOptions.paperTray == CopyOptions.CO_PaperTray.ManualTray && (savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.A6_SEF || savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.B6_SEF || savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.PT_SEF || savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.CUSTOM || savedJobOptions.mediaType == CopyOptions.CO_MediaType.Transparency || savedJobOptions.mediaType == CopyOptions.CO_MediaType.Bond || savedJobOptions.mediaType == CopyOptions.CO_MediaType.Cardstock)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  947 */           savedJobOptions.twoSidedPrint = SavedJobOptions.SV_TwoSidedPrint.OneSided;
/*  948 */           addNewstMutex(iMutexCheck, 301);
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*  953 */     if (target instanceof SavedJobOptions.SV_TwoSidedPrint) {
/*      */       
/*  955 */       if (savedJobOptions.paperTray == CopyOptions.CO_PaperTray.ManualTray && (savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.A6_SEF || savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.B6_SEF || savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.PT_SEF || savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.CUSTOM))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  961 */         if (savedJobOptions.twoSidedPrint != SavedJobOptions.SV_TwoSidedPrint.OneSided) {
/*      */           
/*  963 */           savedJobOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  964 */           addNewstMutex(iMutexCheck, 302);
/*      */         } 
/*      */       }
/*      */       
/*  968 */       if (savedJobOptions.mediaType == CopyOptions.CO_MediaType.Transparency || savedJobOptions.mediaType == CopyOptions.CO_MediaType.Bond || savedJobOptions.mediaType == CopyOptions.CO_MediaType.Cardstock)
/*      */       {
/*      */ 
/*      */         
/*  972 */         if (savedJobOptions.twoSidedPrint != SavedJobOptions.SV_TwoSidedPrint.OneSided) {
/*      */           
/*  974 */           savedJobOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  975 */           addNewstMutex(iMutexCheck, 303);
/*      */         } 
/*      */       }
/*      */       
/*  979 */       if (savedJobOptions.source == SavedJobOptions.SV_JobSource.USB && (savedJobOptions.fileName
/*  980 */         .toLowerCase().endsWith(".jpg") || savedJobOptions.fileName
/*  981 */         .toLowerCase().endsWith(".jpeg")))
/*      */       {
/*  983 */         if (savedJobOptions.twoSidedPrint != SavedJobOptions.SV_TwoSidedPrint.OneSided) {
/*      */           
/*  985 */           savedJobOptions.twoSidedPrint = SavedJobOptions.SV_TwoSidedPrint.OneSided;
/*  986 */           addNewstMutex(iMutexCheck, 304);
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/*  991 */     if (target instanceof CopyOptions.CO_TrayPaperSize)
/*      */     {
/*  993 */       if (savedJobOptions.source == SavedJobOptions.SV_JobSource.USB)
/*      */       {
/*  995 */         if (savedJobOptions.paperTray == CopyOptions.CO_PaperTray.ManualTray && savedJobOptions.paperSize == CopyOptions.CO_TrayPaperSize.CUSTOM) {
/*      */ 
/*      */           
/*  998 */           savedJobOptions.paperTray = CopyOptions.CO_PaperTray.Tray1;
/*  999 */           addNewstMutex(iMutexCheck, 305);
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/* 1004 */     if (iMutexCheck.size() > 0) {
/* 1005 */       for (Iterator<Integer> iterator = iMutexCheck.iterator(); iterator.hasNext(); ) { int i = ((Integer)iterator.next()).intValue();
/* 1006 */         Log.w("MutexCheck", "Mutex Happen:" + i); }
/*      */     
/*      */     }
/* 1009 */     return iMutexCheck;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int forFax(Object target, ScanOptions scanOptions, FaxOptions faxOptions) {
/* 1028 */     if (scanOptions == null || faxOptions == null) {
/*      */       
/* 1030 */       Log.w("forFax", "params is null !!");
/*      */       
/* 1032 */       return -1;
/*      */     } 
/*      */     
/* 1035 */     Log.i("forFax", String.format("target:%s, outputColor:%s, faxQuality:%s", new Object[] { target, scanOptions.outputColor
/* 1036 */             .name(), faxOptions.faxQuality.name() }));
/*      */     
/* 1038 */     if (target instanceof FaxOptions.FO_FaxQuality)
/*      */     {
/* 1040 */       if (scanOptions.outputColor == ScanOptions.SO_OutputColor.Color)
/*      */       {
/* 1042 */         if (faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Standard || faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Super_Fine || faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Photo || faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Auto) {
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1047 */           Log.w("MutexCheck", "Mutex Happen:400");
/* 1048 */           scanOptions.outputColor = ScanOptions.SO_OutputColor.BW;
/* 1049 */           return 400;
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/* 1054 */     if (target instanceof ScanOptions.SO_OutputColor)
/*      */     {
/* 1056 */       if (faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Standard || faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Super_Fine || faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Photo || faxOptions.faxQuality == FaxOptions.FO_FaxQuality.Auto)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 1061 */         if (scanOptions.outputColor == ScanOptions.SO_OutputColor.Color) {
/*      */           
/* 1063 */           Log.w("MutexCheck", "Mutex Happen:401");
/* 1064 */           faxOptions.faxQuality = FaxOptions.FO_FaxQuality.Fine;
/* 1065 */           return 401;
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/* 1070 */     return 0;
/*      */   }
/*      */   
/*      */   private static void addNewstMutex(ArrayList<Integer> mutexList, int mutexAdd) {
/* 1074 */     if (mutexList.size() > 0) {
/* 1075 */       if (!mutexList.contains(Integer.valueOf(mutexAdd)))
/* 1076 */         mutexList.add(Integer.valueOf(mutexAdd)); 
/*      */     } else {
/* 1078 */       mutexList.add(Integer.valueOf(mutexAdd));
/*      */     } 
/*      */   }
/*      */   
/*      */   private static UIP_TrayStatusInfo getTrayBySameMedia(ArrayList<UIP_TrayStatusInfo> traystatus, CopyOptions.CO_PaperTray targetTray) {
/* 1083 */     UIP_TrayStatusInfo temp = new UIP_TrayStatusInfo();
/* 1084 */     if (traystatus == null || traystatus.size() <= 0) {
/* 1085 */       return temp;
/*      */     }
/* 1087 */     Log.w("MutexCheck", "getTrayBySameMedia :" + traystatus.size());
/* 1088 */     for (UIP_TrayStatusInfo i : traystatus) {
/* 1089 */       if (targetTray == i.printerTray) {
/* 1090 */         temp = i;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/* 1095 */     for (UIP_TrayStatusInfo i : traystatus) {
/* 1096 */       if (temp.mediaType == i.mediaType) {
/* 1097 */         temp = i;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/* 1102 */     return temp;
/*      */   }
/*      */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_MutexCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */