/*     */ package global.scancenter.uiprotocol;
/*     */ 
/*     */ 
/*     */ public enum UIP_PrinterStatus
/*     */ {
/*   6 */   PRINTER_MODULE_ERROR(1, 139, 3, 0, 1, 3, "Printer Module Error"),
/*   7 */   NO_CARTRIDGE(4, 146, 5, 0, 1, 3, "No Toner"),
/*   8 */   NO_WASTE_TONER_CAN(6, 147, 5, 0, 1, 3, "No Waste Toner Can"),
/*   9 */   DRUM_LIFE_NEAR_END(8, 160, 10, 15, 1, 3, "Develop Unit Life Near End"),
/*  10 */   DRUM_LIFE_END(9, 157, 9, 0, 1, 3, "Develop Unit Life End"),
/*  11 */   FUSER_LIFE_END(10, 156, 9, 0, 1, 3, "Fuser Life End"),
/*  12 */   FUSER_LOW(11, 159, 10, 15, 1, 3, "Fuser Low"),
/*  13 */   TRAY_1_OPEN(13, 1530, 7, 0, 1, 3, "Tray 1 Open"),
/*  14 */   TRAY_2_OPEN(14, 1531, 7, 0, 1, 3, "Tray 2 Open"),
/*  15 */   TRAY_3_OPEN(15, 1532, 7, 0, 1, 3, "Tray 3 Open"),
/*  16 */   TRAY_4_OPEN(16, 1533, 7, 0, 1, 3, "Tray 4 Open"),
/*  17 */   TRAY_1_LIFTING(18, 1534, 12, 0, 1, 1, "Tray 1 Lifting"),
/*  18 */   TRAY_2_LIFTING(19, 1535, 12, 0, 1, 1, "Tray 2 Lifting"),
/*  19 */   TRAY_3_LIFTING(20, 1536, 12, 0, 1, 1, "Tray 3 Lifting"),
/*  20 */   TRAY_4_LIFTING(21, 1537, 12, 0, 1, 1, "Tray 4 Lifting"),
/*  21 */   MANUAL_TRAY_EMPTY(22, 154, 7, 0, 1, 3, "Manual Tray Empty "),
/*  22 */   TRAY_1_EMPTY(23, 1526, 7, 0, 1, 3, "Tray 1 Empty"),
/*  23 */   TRAY_2_EMPTY(24, 1527, 7, 0, 1, 3, "Tray 2 Empty"),
/*  24 */   TRAY_3_EMPTY(25, 1528, 7, 0, 1, 3, "Tray 3 Empty"),
/*  25 */   TRAY_4_EMPTY(26, 1529, 7, 0, 1, 3, "Tray 4 Empty"),
/*  26 */   PRINTER_PAPER_JAM_01(28, 1593, 5, 0, 1, 3, "Printer Paper Jam 01"),
/*  27 */   PRINTER_PAPER_JAM_02(29, 1593, 5, 0, 1, 3, "Printer Paper Jam 02"),
/*  28 */   PRINTER_PAPER_JAM_03(30, 1593, 5, 0, 1, 3, "Printer Paper Jam 03"),
/*  29 */   PRINTER_PAPER_JAM_04(31, 1593, 5, 0, 1, 3, "Printer Paper Jam 04"),
/*  30 */   PRINTER_PAPER_JAM_05(32, 1593, 5, 0, 1, 3, "Printer Paper Jam 05"),
/*  31 */   PRINTER_PAPER_JAM_06(33, 1593, 5, 0, 1, 3, "Printer Paper Jam 06"),
/*  32 */   PRINTER_PAPER_JAM_07(34, 1593, 5, 0, 1, 3, "Printer Paper Jam 07"),
/*  33 */   PRINTER_PAPER_JAM_08(35, 1593, 5, 0, 1, 3, "Printer Paper Jam 08"),
/*  34 */   PRINTER_PAPER_JAM_09(36, 1593, 5, 0, 1, 3, "Printer Paper Jam 09"),
/*  35 */   PRINTER_PAPER_JAM_10(37, 1593, 5, 0, 1, 3, "Printer Paper Jam 10"),
/*  36 */   PRINTER_PAPER_JAM_11(38, 1593, 5, 0, 1, 3, "Printer Paper Jam 11"),
/*  37 */   PAPER_MISMATCH(41, 1577, 5, 0, 1, 3, "Paper Mismatch"),
/*  38 */   FRONT_COVER_OPEN(42, 149, 5, 0, 1, 3, "Front Cover Open"),
/*  39 */   SIDE_DOOR_OPEN(43, 150, 5, 0, 1, 3, "Side Door Open"),
/*  40 */   TRAY_2_COVER_OPEN(44, 1546, 5, 0, 1, 3, "Tray 2 Cover Open"),
/*  41 */   TONER_EMPTY(45, 155, 5, 0, 1, 3, "Toner Empty"),
/*  42 */   TONER_LOW(46, 158, 10, 15, 0, 1, "Toner Low"),
/*  43 */   RUNTIME_ERROR(49, 164, 4, 0, 1, 3, "Runtime Error"),
/*  44 */   MULTIFEED_ERROR(50, 1578, 5, 0, 1, 3, "Continue feed error"),
/*  45 */   FUSER_ERROR(51, 166, 4, 0, 1, 3, "Fuser Error"),
/*  46 */   NO_EP(52, 167, 5, 0, 1, 3, "No Develop Unit"),
/*  47 */   NO_TONER(53, 146, 5, 0, 1, 3, "No Toner"),
/*  48 */   PRINTER_PAPER_JAM_12(54, 1593, 5, 0, 1, 3, "Printer Paper Jam 12"),
/*  49 */   PRINTER_PAPER_JAM_13(55, 1593, 5, 0, 1, 3, "Printer Paper Jam 13"),
/*  50 */   PRINTER_PAPER_JAM_14(56, 1593, 5, 0, 1, 3, "Printer Paper Jam 14"),
/*  51 */   PRINTER_PAPER_JAM_15(57, 1593, 5, 0, 1, 3, "Printer Paper Jam 15"),
/*  52 */   PRINTER_PAPER_JAM_16(58, 1593, 5, 0, 1, 3, "Printer Paper Jam 16"),
/*  53 */   PRINTER_PAPER_JAM_17(59, 1593, 5, 0, 1, 3, "Printer Paper Jam 17"),
/*  54 */   PRINTER_PAPER_JAM_18(60, 1593, 5, 0, 1, 3, "Printer Paper Jam 18"),
/*  55 */   PRINTER_PAPER_JAM_19(61, 1593, 5, 0, 1, 3, "Printer Paper Jam 19"),
/*  56 */   PRINTER_PAPER_JAM_20(62, 1593, 5, 0, 1, 3, "Printer Paper Jam 20"),
/*  57 */   PRINTER_PAPER_JAM_21(63, 1593, 5, 0, 1, 3, "Printer Paper Jam 21"),
/*  58 */   PRINTER_PAPER_JAM_22(64, 1593, 5, 0, 1, 3, "Printer Paper Jam 22"),
/*  59 */   EP_LIFE_END(65, 157, 9, 0, 1, 3, "Develop Unit Life End"),
/*  60 */   FUSER_NEAR_END(66, 159, 10, 15, 0, 3, "Fuser Near End"),
/*  61 */   EP_NEAR_END(67, 160, 10, 15, 0, 3, "Develop Unit Near End"),
/*  62 */   FAN_1_FAIL(68, 1579, 10, 0, 1, 1, "Fan 1 Fail"),
/*  63 */   FAN_2_FAIL(69, 1580, 10, 0, 1, 1, "Fan 2 Fail"),
/*  64 */   FAN_3_FAIL(70, 1581, 10, 0, 1, 1, "Fan 3 Fail"),
/*  65 */   FAN_4_FAIL(71, 1582, 10, 0, 1, 1, "Fan 4 Fail"),
/*  66 */   FAN_5_FAIL(72, 1583, 10, 0, 1, 1, "Fan 5 Fail"),
/*  67 */   EP_SENSOR_FAILS(73, 169, 9, 0, 1, 1, "Develop Unit Sensor Fails"),
/*  68 */   NO_MATCH_PAPER(74, 163, 6, 0, 1, 3, "No Match Paper"),
/*  69 */   WASTE_TONER_CAN_FULL(75, 172, 5, 0, 1, 3, "Waste Toner Can Full"),
/*  70 */   WASTE_TONER_CAN_NEAR_FULL(76, 173, 10, 15, 0, 3, "Waste Toner Can Near Full"),
/*  71 */   MANUAL_TRAY_ERROR(77, 1545, 5, 0, 1, 3, "Manual Tray error"),
/*  72 */   TRAY_1_ERROR(78, 1541, 5, 0, 1, 3, "TRAY 1 error"),
/*  73 */   TRAY_2_ERROR(79, 1542, 5, 0, 1, 3, "TRAY 2 error"),
/*  74 */   TRAY_3_ERROR(80, 1543, 5, 0, 1, 3, "TRAY 3 error"),
/*  75 */   TRAY_4_ERROR(81, 1544, 5, 0, 1, 3, "TRAY 4 error"),
/*  76 */   EP_SENSOR_FAILS_1611(87, 170, 8, 0, 1, 0, "Toner Empty 1611"),
/*  77 */   TRAY_3_COVER_OPEN(88, 1547, 5, 0, 1, 3, "Tray 3 Cover Open"),
/*  78 */   MANUAL_TRAY_OVERLOADED(89, 1584, 5, 0, 1, 3, "Manual Tray Overloaded"),
/*  79 */   TRAY_1_OVERLOADED(90, 1585, 5, 0, 1, 3, "Tray 1 Overloaded"),
/*  80 */   TRAY_2_OVERLOADED(91, 1586, 5, 0, 1, 3, "Tray 2 Overloaded"),
/*  81 */   TRAY_3_OVERLOADED(92, 1587, 5, 0, 1, 3, "Tray 3 Overloaded"),
/*  82 */   TRAY_4_OVERLOADED(93, 1588, 5, 0, 1, 3, "Tray 4 Overloaded"),
/*  83 */   PRINTER_PAPER_JAM_23(94, 1593, 5, 0, 1, 3, "Printer Paper Jam 23"),
/*  84 */   TONER_CARTRIDGE_ERROR(95, 183, 6, 0, 1, 3, "Toner cartridge error"),
/*  85 */   AUTO_TEMPERATURE_ADJUSTMENT(96, 1552, 5, 0, 1, 3, "Auto temperature adjustment"),
/*  86 */   INVALID_EP(97, 1553, 6, 0, 1, 3, "Invalid Develop Unit"),
/*  87 */   MANUAL_TRAY_SIZE(257, 0, 99, 0, 1, 0, "Manual Tray size"),
/*  88 */   TRAY_1_SIZE(258, 0, 99, 0, 1, 0, "TRAY1 size"),
/*  89 */   TRAY_2_SIZE(259, 0, 99, 0, 1, 0, "TRAY2 size"),
/*  90 */   TRAY_3_SIZE(260, 0, 99, 0, 1, 0, "TRAY3 size"),
/*  91 */   TRAY_4_SIZE(261, 0, 99, 0, 1, 0, "TRAY4 size"),
/*  92 */   PRINTING(262, 36, 98, 0, 1, 0, "Printing"),
/*  93 */   PROCESSING(263, 37, 99, 0, 1, 0, "Processing"),
/*  94 */   NOTIFY_TO_SET_PAPER_SIZE(512, 0, 99, 0, 1, 0, "Notify to Set Paper Size"),
/*  95 */   NOTIFY_TRAY_STATUS_UPDATED(513, 0, 99, 0, 1, 0, "Notify Tray Status Updated"),
/*  96 */   CUTOVER_DNT(768, 0, 99, 0, 0, 0, "Cutover DNT"),
/*  97 */   PAPER_EMPTY(769, 0, 50, 0, 0, 2, "Paper empty");
/*     */   
/*     */   private int _numVal;
/*     */   
/*     */   private String _description;
/*     */   
/*     */   private int _id;
/*     */   private int _priority;
/*     */   private int _timeout;
/*     */   private int _reserve;
/*     */   private int _type;
/*     */   
/*     */   UIP_PrinterStatus(int numVal, int id, int priority, int timeout, int reserve, int type, String description) {
/* 110 */     this._numVal = numVal;
/* 111 */     this._description = description;
/* 112 */     this._id = id;
/* 113 */     this._priority = priority;
/* 114 */     this._timeout = timeout;
/* 115 */     this._reserve = reserve;
/* 116 */     this._type = type;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCode() {
/* 121 */     return this._numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescription() {
/* 126 */     return this._description;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getStringId() {
/* 131 */     return this._id;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getPriority() {
/* 136 */     return this._priority;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getTimeout() {
/* 141 */     return this._timeout;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getReserve() {
/* 146 */     return this._reserve;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getType() {
/* 151 */     return this._type;
/*     */   }
/*     */ 
/*     */   
/*     */   public static UIP_PrinterStatus findValueByCode(int value) {
/* 156 */     for (UIP_PrinterStatus v : values()) {
/*     */       
/* 158 */       if (v.getCode() == value)
/* 159 */         return v; 
/*     */     } 
/* 161 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_PrinterStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */