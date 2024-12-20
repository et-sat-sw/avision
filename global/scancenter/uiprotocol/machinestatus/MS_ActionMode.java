/*     */ package global.scancenter.uiprotocol.machinestatus;
/*     */ 
/*     */ public enum MS_ActionMode
/*     */ {
/*   5 */   GET_GENERAL_INFO(1),
/*   6 */   TRIGGER_INFORMATION_PAGE_PRINTING(2),
/*   7 */   GET_SUPPLIES_STATUS(3),
/*   8 */   GET_BILLING_INFORMATION(4),
/*   9 */   SET_REAL_TIME_CLOCK(5),
/*  10 */   GET_REAL_TIME_CLOCK(6),
/*  11 */   SET_SIZE_SPECIFICATION(7),
/*  12 */   GET_SIZE_SPECIFICATION(8),
/*  13 */   REQUEST_ENERGY_SAVE(9),
/*  14 */   REQUEST_WAKE_UP(10),
/*  15 */   SET_BACKUP_OPTION(11),
/*  16 */   GET_BACKUP_OPTION(12),
/*  17 */   RESET_PAD_COUNT(13),
/*  18 */   RESET_DEFAULT(14),
/*  19 */   SET_RECALIBRATION(15),
/*  20 */   SET_USB_MODE(16),
/*  21 */   GET_USB_MODE(17),
/*  22 */   GET_TRAY_STATUS(18),
/*  23 */   FORMAT_STORAGE(19),
/*  24 */   RESTART_MFP(20),
/*  25 */   SET_PAPER_MISMATCH_CONFIRMATION(21),
/*  26 */   GET_PAPER_MISMATCH_CONFIRMATION(22),
/*  27 */   RESET_ADMIN_PASSWORD(23),
/*  28 */   RESET_COUNT(24),
/*  29 */   RESET_FUSER_COUNT(25),
/*  30 */   SET_AIO_CONTROL(26),
/*  31 */   GET_AIO_CONTROL(27),
/*  32 */   SET_INTERRUPT_SETTING(28),
/*  33 */   GET_STORAGE_CAPACITY(29),
/*  34 */   PRINT_OFF(30),
/*  35 */   SET_POWER_MODE(31),
/*  36 */   SET_PRINTER_LEADING_SIDE_EDGE(32),
/*  37 */   GET_PRINTER_LEADING_SIDE_EDGE(33),
/*  38 */   GET_FUSER_POWER_MODE(34),
/*  39 */   SET_RESTORE_SPECIFIC_DATA(35),
/*  40 */   SET_PAPER_SIZE_CONFIRMATION(36),
/*  41 */   GET_PAPER_SIZE_CONFIRMATION(37),
/*  42 */   SET_CSA6_SCANNER_INSTALLATION(38),
/*  43 */   GET_CSA6_SCANNER_INSTALLATION(39),
/*  44 */   RESET_PICKUP_ROLLER_COUNT(40),
/*  45 */   RESET_FEED_ROLLER_COUNT(41),
/*  46 */   RESET_REVERSE_ROLLER_COUNT(42),
/*  47 */   GET_FUSER_SERIAL_NUMBER(43),
/*  48 */   GET_FAX_MODULE_SENT_COUNT(44),
/*  49 */   CHANGE_EP_INITIALIZATION(45),
/*  50 */   REQUEST_AUTO_POWER_OFF(46),
/*  51 */   NOTIFY_UI_STATUS(47),
/*  52 */   GET_ERROR_CODE_EXTENSION(48),
/*  53 */   ENABLE_DISABLE_JOB_SERVICE(49),
/*  54 */   SET_LPH_INTENSITY(50),
/*  55 */   GET_LPH_INTENSITY(51),
/*  56 */   GET_INFORMATION(52),
/*  57 */   GET_COUNTERS(53),
/*  58 */   GET_SUPPLIES_INFO(54),
/*  59 */   SET_SCHEDULE_RESTART(55),
/*  60 */   GET_SCHEDULE_RESTART(56),
/*  61 */   SET_SELECTABLE_PAPER_SIZE(57),
/*  62 */   GET_SPECIFIC_SUPPLY_STATUS(58),
/*  63 */   SET_HEATER(59),
/*  64 */   GET_HEATER(60),
/*  65 */   SET_FLICKER_NOISE(61),
/*  66 */   GET_FLICKER_NOISE(62),
/*  67 */   RESET_DEFAULT_ALL(63),
/*  68 */   GET_HOST_NAME(64),
/*  69 */   SET_HOST_NAME(65),
/*  70 */   GET_SMTP_INFO(66),
/*  71 */   SET_SMTP_INFO(67),
/*  72 */   SET_DEFAULT_MODE(68),
/*  73 */   GET_DEFAULT_MODE(69),
/*  74 */   GET_ENERGY_SAVE(70),
/*  75 */   SET_ENERGY_SAVE(71),
/*  76 */   GET_AUTO_POWER_OFF(72),
/*  77 */   SET_AUTO_POWER_OFF(73),
/*  78 */   GET_SYSTEM_TIMEOUT(74),
/*  79 */   SET_SYSTEM_TIMEOUT(75),
/*  80 */   GET_LANGUAGE_TYPE(76),
/*  81 */   SET_LANGUAGE_TYPE(77),
/*  82 */   GET_SERVICE_ENABLE(78),
/*  83 */   GET_FILTER_ENABLE(79),
/*  84 */   SET_FILTER_ENABLE(80),
/*  85 */   GET_RECALIBRATION(81),
/*  86 */   GET_FAX_MODULE_STATUS(82),
/*  87 */   SET_SERVICE_ENABLE(83),
/*  88 */   DRUM_CLEAN_UP(84),
/*  89 */   GET_LDAP_SETTING(85),
/*  90 */   SET_LDAP_SETTING(86),
/*  91 */   GET_SAVELOG_SETTING(87),
/*  92 */   SET_SAVELOG_SETTING(88),
/*  93 */   GET_SAVEPACKET_SETTING(89),
/*  94 */   SET_SAVEPACKET_SETTING(90),
/*  95 */   GET_PLUGIN_SETTING(91),
/*  96 */   SET_PLUGIN_SETTING(92),
/*  97 */   GET_SELECTABLE_PAPER_SIZE(93),
/*  98 */   GET_POWER_MODE(94),
/*  99 */   GET_CLEAN_CARBON(95),
/* 100 */   SET_CLEAN_CARBON(96),
/* 101 */   GET_VMAG(97),
/* 102 */   SET_VMAG(98),
/* 103 */   GET_UI_SWITCH(100),
/* 104 */   SET_UI_SWITCH(101),
/* 105 */   GET_SNMP(102),
/* 106 */   SET_SNMP(103),
/* 107 */   GET_USB_INTERFACE_ENABLE(104),
/* 108 */   SET_USB_INTERFACE_ENABLE(105),
/* 109 */   GET_NETWORK_PORT(106),
/* 110 */   SET_NETWORK_PORT(107),
/* 111 */   GET_USB_DEVICE_OFF(108),
/* 112 */   SET_USB_DEVICE_OFF(109);
/*     */ 
/*     */   
/*     */   private int _numVal;
/*     */ 
/*     */   
/*     */   MS_ActionMode(int numVal) {
/* 119 */     this._numVal = numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCode() {
/* 124 */     return this._numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public static MS_ActionMode findValueByCode(int code) {
/* 129 */     for (MS_ActionMode v : values()) {
/*     */       
/* 131 */       if (v.getCode() == code)
/* 132 */         return v; 
/*     */     } 
/* 134 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\machinestatus\MS_ActionMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */