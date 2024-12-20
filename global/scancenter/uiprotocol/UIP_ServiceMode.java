/*     */ package global.scancenter.uiprotocol;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum UIP_ServiceMode
/*     */ {
/*   8 */   RunTest_SCNST_End(0, ""),
/*   9 */   RunTest_SCNST_Start(1, ""),
/*     */ 
/*     */   
/*  12 */   RunTest_PRNST_End(4096, ""),
/*  13 */   RunTest_PRNST_MTray(4097, ""),
/*  14 */   RunTest_PRNST_Tray1(4098, ""),
/*  15 */   RunTest_PRNST_Tray2(4099, ""),
/*  16 */   RunTest_PRNST_Tray3(4100, ""),
/*  17 */   RunTest_PRNST_Tray4(4101, ""),
/*  18 */   RunTest_PRNST_Other(4102, ""),
/*     */ 
/*     */   
/*  21 */   RunTest_PRNRIT_End(8192, ""),
/*  22 */   RunTest_PRNRIT_MTray(8193, ""),
/*  23 */   RunTest_PRNRIT_Tray1(8194, ""),
/*  24 */   RunTest_PRNRIT_Tray2(8195, ""),
/*  25 */   RunTest_PRNRIT_Tray3(8196, ""),
/*  26 */   RunTest_PRNRIT_Tray4(8197, ""),
/*  27 */   RunTest_PRNRIT_Other(8198, ""),
/*     */ 
/*     */   
/*  30 */   RunTest_PRNTC_MTray(12288, ""),
/*  31 */   RunTest_PRNTC_Tray1(12289, ""),
/*  32 */   RunTest_PRNTC_Tray2(12290, ""),
/*  33 */   RunTest_PRNTC_Tray3(12291, ""),
/*  34 */   RunTest_PRNTC_Tray4(12292, ""),
/*     */ 
/*     */   
/*  37 */   RunTest_SHWFT_Off(16384, ""),
/*  38 */   RunTest_SHWFT_On(16385, ""),
/*     */ 
/*     */   
/*  41 */   RunTest_CPYRIT_End(20480, ""),
/*  42 */   RunTest_CPYRIT_ADF(20481, ""),
/*  43 */   RunTest_CPYRIT_FB(20482, ""),
/*     */ 
/*     */   
/*  46 */   RunTest_CPYTST_End(24576, ""),
/*  47 */   RunTest_CPYTST_ADF(24577, ""),
/*  48 */   RunTest_CPYTST_FB(24578, ""),
/*     */ 
/*     */   
/*  51 */   RunTest_SIGTX_End(28672, ""),
/*  52 */   RunTest_SIGTX_OffHook(28673, ""),
/*  53 */   RunTest_SIGTX_144v17(28674, ""),
/*  54 */   RunTest_SIGTX_120v17(28675, ""),
/*  55 */   RunTest_SIGTX_96v17(28676, ""),
/*  56 */   RunTest_SIGTX_72v17(28677, ""),
/*  57 */   RunTest_SIGTX_96v29(28678, ""),
/*  58 */   RunTest_SIGTX_72v29(28679, ""),
/*  59 */   RunTest_SIGTX_48v27(28680, ""),
/*  60 */   RunTest_SIGTX_24v27(28681, ""),
/*  61 */   RunTest_SIGTX_v21(28682, ""),
/*  62 */   RunTest_SIGTX_336v34(28683, ""),
/*  63 */   RunTest_SIGTX_312v34(28684, ""),
/*  64 */   RunTest_SIGTX_288v34(28685, ""),
/*  65 */   RunTest_SIGTX_264v34(28686, ""),
/*  66 */   RunTest_SIGTX_240v34(28687, ""),
/*  67 */   RunTest_SIGTX_216v34(28688, ""),
/*  68 */   RunTest_SIGTX_192v34(28689, ""),
/*  69 */   RunTest_SIGTX_168v34(28690, ""),
/*  70 */   RunTest_SIGTX_144v34(28691, ""),
/*  71 */   RunTest_SIGTX_120v34(28692, ""),
/*  72 */   RunTest_SIGTX_96v34(28693, ""),
/*  73 */   RunTest_SIGTX_72v34(28694, ""),
/*  74 */   RunTest_SIGTX_48v34(28695, ""),
/*  75 */   RunTest_SIGTX_24v34(28696, ""),
/*     */ 
/*     */   
/*  78 */   RunTest_DLTST_End(32768, ""),
/*  79 */   RunTest_DLTST_10PPS(32769, ""),
/*  80 */   RunTest_DLTST_20PPS(32770, ""),
/*  81 */   RunTest_SIGTX_DTMF(32771, ""),
/*     */ 
/*     */   
/*  84 */   RunTest_SQEP_MTray(36864, ""),
/*  85 */   RunTest_SQEP_Tray1(36865, ""),
/*  86 */   RunTest_SQEP_Tray2(36866, ""),
/*  87 */   RunTest_SQEP_Tray3(36867, ""),
/*  88 */   RunTest_SQEP_Tray4(36868, ""),
/*     */ 
/*     */   
/*  91 */   RunTest_DQEP_MTray(40960, ""),
/*  92 */   RunTest_DQEP_Tray1(40961, ""),
/*  93 */   RunTest_DQEP_Tray2(40962, ""),
/*  94 */   RunTest_DQEP_Tray3(40963, ""),
/*  95 */   RunTest_DQEP_Tray4(40964, ""),
/*     */ 
/*     */   
/*  98 */   RunTest_USBHT_SigStpDscr(45056, ""),
/*  99 */   RunTest_USBHT_PTNAK(45057, ""),
/* 100 */   RunTest_USBHT_PTJ(45058, ""),
/* 101 */   RunTest_USBHT_PTK(45059, ""),
/* 102 */   RunTest_USBHT_PTP(45060, ""),
/* 103 */   RunTest_USBHT_HSR(45061, "");
/*     */   
/*     */   private int _numVal;
/*     */   
/*     */   private String _description;
/*     */   
/*     */   UIP_ServiceMode(int numVal, String description) {
/* 110 */     this._numVal = numVal;
/* 111 */     this._description = description;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCode() {
/* 116 */     return this._numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescription() {
/* 121 */     return this._description;
/*     */   }
/*     */ 
/*     */   
/*     */   public static UIP_ServiceMode findValueByCode(int value) {
/* 126 */     for (UIP_ServiceMode v : values()) {
/*     */       
/* 128 */       if (v.getCode() == value)
/* 129 */         return v; 
/*     */     } 
/* 131 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_ServiceMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */