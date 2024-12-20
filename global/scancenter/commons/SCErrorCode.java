/*     */ package global.scancenter.commons;
/*     */ 
/*     */ 
/*     */ public enum SCErrorCode
/*     */ {
/*   6 */   UPDATE_SCANNER_FW_FAILED_1(100001, "Update scanner FW failed"),
/*   7 */   UPDATE_SCANNER_FW_FAILED_2(100002, "Update scanner FW failed"),
/*   8 */   UPDATE_SCANNER_FW_FAILED_3(100003, "Update scanner FW failed"),
/*   9 */   UPDATE_SCANNER_FW_FAILED_5(100005, "Update scanner FW failed"),
/*  10 */   UPDATE_SYSTEM_FW_FAILED_6(100006, "Update system FW failed"),
/*  11 */   FW_VERIFICATION_CHECK_FAIL(100007, "FW verification check fail"),
/*  12 */   UPDATE_SYSTEM_FW_FAILED_8(100008, "Update system FW failed"),
/*  13 */   UPDATE_SYSTEM_FW_FAILED_9(100009, "Update system FW failed"),
/*  14 */   UPDATE_SYSTEM_FW_FAILED_10(100010, "Update system FW failed"),
/*     */   
/*  16 */   FW_UPDATE_ERROR(100200, "Fw update error"),
/*  17 */   WEB_PAGE_LOAD_ERROR(100202, "Web page load error"),
/*     */   
/*  19 */   FW_IS_INCOMPLETE(101004, "FW is incomplete"),
/*  20 */   FW_CHECKSUM_ERROR(101005, "FW checksum error"),
/*  21 */   INVALID_FW(101006, "Invalid FW"),
/*     */   
/*  23 */   DATA_IS_LOST(102105, "Failed to delete or modify this item because it does not exist."),
/*     */   
/*  25 */   SCAN_OK(110000, "Scan OK"),
/*  26 */   SCANNER_NOT_FOUND(110001, "Scanner not found"),
/*  27 */   SCAN_STOP_MANUAL(110002, "Stop scan by user"),
/*  28 */   SCAN_ADF_EMPTY(111001, "ADF is empty"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  34 */   ADMIN_CENTER_110111(110111, "Admin center URL is invalid. Please check URL content."),
/*  35 */   ADMIN_CENTER_110112(110112, "Failed to connect to Admin center server. Please check server settings and network connectivity."),
/*  36 */   ADMIN_CENTER_110113(110113, "Connection is broken and fail to communicate with Admin center server. Please check server is running and network connectivity."),
/*     */ 
/*     */   
/*  39 */   DATABASE_WRITE_FAIL(111002, "Database write fail"),
/*  40 */   DATABASE_READ_FAIL(111003, "Database read fail"),
/*  41 */   OPEN_DELETE_FILE_FAILED(111004, "Open file or delete file failed"),
/*     */   
/*  43 */   SCAN_DELETE_FILE_FAILED(111005, "Scan delete file failed"),
/*  44 */   SCAN_CREATE_FILE_FAILED(111006, "Scan create file failed"),
/*  45 */   SCAN_WRITE_FILE_FAILED(111007, "Scan write file failed"),
/*  46 */   SCAN_CLOSE_FILE_FAILED(111008, "Scan close file failed"),
/*  47 */   SCAN_DEST_IS_EMPTY(111009, "Destination is empty"),
/*  48 */   SCAN_PROGRESS(112000, "Scan progress"),
/*  49 */   SCAN_PARAM_ERROR(112005, "Scan parameter check error"),
/*  50 */   SCAN_ALLOCATE_MEMORY_FAILED(112006, "Scan allocate memory failed"),
/*  51 */   SCAN_CANCEL(112010, "Scan cancel"),
/*  52 */   SCAN_PAPER_JAM(112013, "Scan paper jam"),
/*  53 */   SCAN_COVER_OPEN(112014, "Scan cover open"),
/*  54 */   SCAN_ADF_NO_PAPER(112015, "Scan no paper in ADF"),
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
/*  68 */   UPDATE_SPF_FAIL_2(101012, "SPF file is invalid. Please confirm SPF file is correct and try again."),
/*  69 */   UPDATE_SPF_FAIL_6(101016, "SPF file is invalid. Please confirm SPF file is correct and try again."),
/*  70 */   UPDATE_SPF_FAIL_7(101017, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*  71 */   UPDATE_SYSTEM_FW_FAIL_1(101021, "SPF file is invalid. Please confirm SPF file is correct and try again."),
/*  72 */   UPDATE_SYSTEM_FW_FAIL_2(101022, "SPF file is invalid. Please confirm SPF file is correct and try again."),
/*  73 */   UPDATE_SYSTEM_FW_FAIL_3(101023, "SPF file is invalid. Please confirm SPF file is correct and try again."),
/*  74 */   UPDATE_SYSTEM_FW_FAIL_4(101024, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*  75 */   UPDATE_SYSTEM_FW_FAIL_5(101025, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*  76 */   UPDATE_SYSTEM_FW_FAIL_7(101027, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*  77 */   UPDATE_SYSTEM_FW_FAIL_8(101028, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*  78 */   UPDATE_SCANNER_FW_FAIL_1(101031, "SPF file is invalid. Please check SPF file and try again."),
/*  79 */   UPDATE_SCANNER_FW_FAIL_2(101032, "SPF file is invalid. Please check SPF file and try again."),
/*  80 */   UPDATE_SCANNER_FW_FAIL_3(101033, "SPF file is invalid. Please check SPF file and try again."),
/*  81 */   UPDATE_SCANNER_FW_FAIL_4(101034, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*  82 */   UPDATE_SCANNER_FW_FAIL_5(101035, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*  83 */   UPDATE_SCANNER_FW_FAIL_7(101037, "Failed to update SPF file. Please try again. If the problem persists, please call service personnel for help."),
/*     */   
/*  85 */   CLOUD_SITE_NAME_ERROR_102601(102601, "set IME to fail"),
/*     */   
/*  87 */   SCAN_UNKNOWN_ERROR(112999, "Scan unknown error"),
/*     */   
/*  89 */   UPDATE_SUBMIT_FAIL(113001, "update fail (Submit fail)"),
/*  90 */   INVAILD_INPUT(113002, "Invaild input."),
/*  91 */   FAIL_TO_ADD(113003, "Fail to add."),
/*  92 */   FAIL_TO_DELETE(113004, "Fail to delete."),
/*  93 */   FAIL_TO_MODIFY(113005, "Fail to modify."),
/*  94 */   EXCEED_LIMATION(113008, "Exceed maximum limation."),
/*  95 */   NAME_DUPLICATED(113009, "Name is duplicated."),
/*     */   
/*  97 */   SCAN_MULTI_FEED(113101, "Scan multi feed"),
/*  98 */   SCAN_NEXT_PAGE_MISS_FEED(113211, "Scan next page miss feed"),
/*     */   
/* 100 */   IMPORTED_FILE_ERROR1(114001, "Imported file error"),
/* 101 */   IMPORTED_FILE_ERROR2(114002, "Imported file error"),
/*     */   
/* 103 */   ACCOUNT_LOGIN_FAIL(115001, "Account login fail"),
/*     */   
/* 105 */   SCAN_UNEXPECTED_ERROR(119001, "Unexpected error occured"),
/*     */   
/* 107 */   SMART_IMAGE_OK(120000, "Smart image OK"),
/* 108 */   SMART_IMAGE_SO_FILE_NOT_FOUND(120001, "Smart image scan options file not found"),
/* 109 */   SMART_IMAGE_READ_SO_FILE_FAILED(120002, "Smart image read scan options file failed"),
/* 110 */   SMART_IMAGE_UNKNOW(124000, "Smart image unknow error"),
/* 111 */   SMART_IMAGE_LOWMEMORY(124001, "Smart image not enough memory to perform operation"),
/* 112 */   SMART_IMAGE_NOTSUPPORT(124002, "Smart image not support"),
/* 113 */   SMART_IMAGE_BADVALUE(124003, "Smart image data parameter out of range"),
/* 114 */   SMART_IMAGE_EXCEPTION(124004, "Smart image exception error of the command"),
/* 115 */   SMART_IMAGE_FAILED(124005, "Smart image failed"),
/* 116 */   SMART_IMAGE_OUTOFDATENUMBER(124006, "Smart image serial number is out of date"),
/* 117 */   SMART_IMAGE_ILLEGALINPUTBUFFER(124007, "Smart image illegal input buffer"),
/*     */   
/* 119 */   HTTP_CLIENT_SEND_DATA_FAILED(179204, "Please check the problem with your System Administrator or check your network environment"),
/*     */   
/* 121 */   COPY_OK(210000, "Copy OK"),
/* 122 */   COPY_STOPPED(210005, "Copy job be stopped"),
/*     */   
/* 124 */   STORAGE_PRINT_OK(220000, "Storage print OK"),
/*     */   
/* 126 */   SEND_FILE_OK(300000, "Send file OK"),
/* 127 */   SEND_CONNECT_OK(300001, "Send connect OK"),
/* 128 */   SEND_FILE_FAILED(300002, "Send file failed"),
/* 129 */   SEND_CONNECT_FAILED(300003, "Send connect failed"),
/* 130 */   SEND_INIT_FAILED(300004, "Send initial failed"),
/* 131 */   SEND_STOPPED(300005, "Send job be stopped"),
/* 132 */   SEND_LOGIN_FAILED(300006, "Send job login failed"),
/* 133 */   SEND_MAKEDIR_FAILED(300007, "Send job directory failed"),
/* 134 */   SEND_NO_SPACE(300008, "Send job has not enough space"),
/* 135 */   SEND_DUPLICATED_NAME(300009, "Send job meet duplicated file name"),
/* 136 */   SEND_CLOSE_CONNECT_FAILED(300010, "Send job close connection failed"),
/*     */   
/* 138 */   EMAIL_SEND_OK(310000, "Email send OK"),
/* 139 */   EMAIL_SEND_FAILED(310001, "Send Email failed"),
/* 140 */   EMAIL_SEND_TIMEOUT(310002, "Send Email timeout"),
/* 141 */   EMAIL_SEND_FAILED_EX(310009, "Send Email failed ex"),
/* 142 */   EMAIL_SEND_STOPPED(310010, "Email be stopped"),
/* 143 */   EMAIL_CONNECT_OK(311000, "Email connect OK"),
/* 144 */   EMAIL_CONNECT_FAILED(311001, "Email connect failed"),
/* 145 */   EMAIL_SERVER_SETUP_FAILED(311002, "Email server setup failed"),
/* 146 */   EMAIL_SEND_PROGRESS(313000, "Email send progress"),
/*     */   
/* 148 */   FTP_SEND_OK(410000, "FTP send OK"),
/* 149 */   FTP_INIT_FAILED(410001, "FTP initial failed"),
/* 150 */   FTP_SEND_STOPPED(410010, "FTP be stopped"),
/* 151 */   FTP_CONNECT_OK(411000, "FTP connect OK"),
/* 152 */   FTP_LOGIN_FAILED(411001, "FTP login failed"),
/* 153 */   FTP_ENABLE_PASV_FAILED(411002, "FTP enable passive mode failed"),
/* 154 */   FTP_DISABLE_PASV_FAILED(411003, "FTP disable passive mode failed"),
/* 155 */   FTP_MAKE_DIR_FAILED(411004, "FTP make directory failed"),
/* 156 */   FTP_READY_STORE_FAILED(412001, "FTP ready to store failed"),
/* 157 */   FTP_TRANS_BUFF_FAILED(412002, "FTP transfer image to buffer failed"),
/* 158 */   FTP_SEND_DATA_FAILED(412003, "FTP send data failed"),
/* 159 */   FTP_SEND_PROGRESS(413000, "FTP send progress"),
/*     */   
/* 161 */   CIFS_SEND_OK(420000, "CIFS send OK"),
/* 162 */   CIFS_DAEMON_INIT_FAILED(420001, "CIFS daemon initial failed"),
/* 163 */   CIFS_INIT_FAILED(420002, "CIFS initial failed"),
/* 164 */   CIFS_SEND_STOPPED(420010, "CIFS be stopped"),
/* 165 */   CIFS_CONNECT_OK(421000, "CIFS connect OK"),
/* 166 */   CIFS_CONNECT_FAILED(421001, "CIFS connect failed"),
/* 167 */   CIFS_CLOSE_CONN_FAILED(421002, "CIFS close connection failed"),
/* 168 */   CIFS_DESTROY_FAILED(421003, "CIFS destroy failed"),
/* 169 */   CIFS_CREATE_DIR_FAILED(422001, "CIFS create directory failed"),
/* 170 */   CIFS_CREATE_FILE_FAILED(422002, "CIFS create file failed"),
/* 171 */   CIFS_DUPL_FILE_NAME(422003, "CIFS duplicate file name"),
/* 172 */   CIFS_TRANS_BUFF_FAILED(422004, "CIFS transfer image to buffer failed"),
/* 173 */   CIFS_SEND_DATA_FAILED(422005, "CIFS send data failed"),
/* 174 */   CIFS_CLOSE_FILE_FAILED(422006, "CIFS close file failed"),
/* 175 */   CIFS_SEND_PROGRESS(423000, "CIFS send progress"),
/*     */   
/* 177 */   USB_SEND_OK(430000, "USB send OK"),
/* 178 */   USB_SEND_STOPPED(430010, "USB be stopped"),
/* 179 */   USB_CREATE_DIR_FAILED(431001, "USB create directory failed"),
/* 180 */   USB_NO_SPACE(431002, "USB space is not enough"),
/* 181 */   USB_CREATE_FILE_FAILED(432001, "USB create file failed"),
/* 182 */   USB_DUPL_FILE_NAME(432002, "USB duplicate file name"),
/* 183 */   USB_TRANS_BUFF_FAILED(432003, "USB transfer image to buffer failed"),
/* 184 */   USB_SEND_DATA_FAILED(432004, "USB send data failed"),
/* 185 */   USB_CLOSE_FILE_FAILED(432005, "USB close file failed"),
/* 186 */   USB_SEND_PROGRESS(433000, "USB send progress"),
/*     */   
/* 188 */   PUBLIC_FOLDER_SEND_OK(440000, "Public folder send OK"),
/* 189 */   PUBLIC_FOLDER_SEND_STOPPED(440010, "Public folder be stopped"),
/* 190 */   PUBLIC_FOLDER_CREATE_DIR_FAILED(441001, "Public folder create directory failed"),
/* 191 */   PUBLIC_FOLDER_NO_SPACE(441002, "Public folder space is not enough"),
/* 192 */   PUBLIC_FOLDER_CREATE_FILE_FAILED(442001, "Public folder create file failed"),
/* 193 */   PUBLIC_FOLDER_DUPL_FILE_NAME(442002, "Public folder duplicate file name"),
/* 194 */   PUBLIC_FOLDER_TRANS_BUFF_FAILED(442003, "Public folder transfer image to buffer failed"),
/* 195 */   PUBLIC_FOLDER_SEND_DATA_FAILED(442004, "Public folder send data failed"),
/* 196 */   PUBLIC_FOLDER_CLOSE_FILE_FAILED(442005, "Public folder close file failed"),
/* 197 */   PUBLIC_FOLDER_SEND_PROGRESS(443000, "Public folder send progress"),
/*     */   
/* 199 */   AWIP_SEND_OK(450000, "AWIP send file OK"),
/* 200 */   AWIP_START_CONN_FAILED(450001, "AWIP start connect failed"),
/* 201 */   AWIP_NEW_FILE_FAILED(450002, "AWIP new file failed"),
/* 202 */   AWIP_TRANS_BUFF_FAILED(450003, "AWIP transfer image to buffer failed"),
/* 203 */   AWIP_SEND_FILE_FAILED(450004, "AWIP send file failed"),
/* 204 */   AWIP_END_FILE_FAILED(450005, "AWIP end file failed"),
/* 205 */   AWIP_END_CONN_FAILED(450006, "AWIP end connect failed"),
/* 206 */   AWIP_SEND_STOPPED(450010, "AWIP be stopped"),
/* 207 */   AWIP_CONNECT_OK(451000, "AWIP connect OK"),
/* 208 */   AWIP_SEND_PROGRESS(453000, "AWIP send progress"),
/*     */   
/* 210 */   LOCAL_STORAGE_SEND_OK(460000, "Local storage send OK"),
/* 211 */   LOCAL_STORAGE_SEND_STOPPED(460010, "Local storage be stopped"),
/* 212 */   LOCAL_STORAGE_CREATE_DIR_FAILED(461001, "Local storage create directory failed"),
/* 213 */   LOCAL_STORAGE_NO_SPACE(461002, "Local storage space is not enough"),
/* 214 */   LOCAL_STORAGE_CREATE_FILE_FAILED(462001, "Local storage create file failed"),
/* 215 */   LOCAL_STORAGE_DUPL_FILE_NAME(462002, "Local storage duplicate file name"),
/* 216 */   LOCAL_STORAGE_TRANS_BUFF_FAILED(462003, "Local storage transfer image to buffer failed"),
/* 217 */   LOCAL_STORAGE_SEND_DATA_FAILED(462004, "Local storage send data failed"),
/* 218 */   LOCAL_STORAGE_CLOSE_FILE_FAILED(462005, "Local storage close file failed"),
/* 219 */   LOCAL_STORAGE_SEND_PROGRESS(463000, "Local storage send progress"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 224 */   SUCCESS(0, "Success"),
/*     */   
/* 226 */   ADF_HOMEPOSITON_ERROR(2, "ADF Home Position Error"),
/* 227 */   FB_LAMP_ERROR(7, "Flatbed Lamp Error"),
/* 228 */   FB_DRAM_RW_TEST_ERROR(10, "FB DRAM Read Write Test Error"),
/* 229 */   USB_DRAM_RW_TEST_ERROR(14, "USB DRAM Read Write Test Error"),
/* 230 */   SCSI_DRAM_RW_TEST_ERROR(15, "SCSI DRAM Read Write Test Error"),
/* 231 */   UART_DRAM_RW_TEST_ERROR(16, "UART DRAM Read Write Test Error"),
/* 232 */   MOTOR_STALL(17, "Motro Stall"),
/* 233 */   COMMAND_ERROR(18, "Command Error"),
/* 234 */   LEARNING_ERROR(19, "Learning Error"),
/* 235 */   DONWLOAD_FW_ERROR(20, "Download FW Error"),
/* 236 */   FB_COVER_OPEN(21, "FB Cover Open"),
/* 237 */   LAMP_OFF_ERROR(22, "Lamp Off Error"),
/* 238 */   FLASH_RW_TEST_ERROR(23, "Flashrom Read Write Test Error"),
/* 239 */   BTM_AFE_LVDS_TEST_ERROR(24, "ADF Bottom Head AFE LVDS Test Error"),
/* 240 */   TOP_AFE_LVDS_TEST_ERROR(25, "ADF Top Head AFE LVDS Test Error"),
/* 241 */   THIRD_AFE_LVDS_TEST_ERROR(26, "Third Head AFE LVDS Test Error"),
/* 242 */   PAGE_CHAIN_FEED(32, "Page Chain Feed"),
/*     */   
/* 244 */   LOCK_ERROR(2008, "Lock Error"),
/* 245 */   ADF_PAPER_JAM(2013, "Paper Jam"),
/*     */ 
/*     */ 
/*     */   
/* 249 */   ADF_COVER_OPEN(2014, "ADF Cover Open"),
/* 250 */   NVRAM_RW_TEST_ERROR(2024, "NVRAM Read Write Test Error"),
/* 251 */   ULTRASONIC_ERROR(2036, "Ultrasonic Error"),
/* 252 */   AFE_RW_TEST_ERROR(2037, "ADF Bottom Head AFE Test Error"),
/*     */ 
/*     */   
/* 255 */   FB_HOMEPOSITON_ERROR(3001, "FB Home Position Error"),
/* 256 */   DRAM_RW_TEST_ERROR(3003, "DRAM Read Write Test Error"),
/* 257 */   ADF_DRAM_RW_TEST_ERROR(3004, "ADF DRAM Read Write Test Error"),
/* 258 */   FB_LIGHT_CHECK_ERROR(3005, "FB Light Check Error"),
/* 259 */   ADF_LIGHT_CHECK_ERROR(3006, "ADF Light Check Error"),
/* 260 */   THIRD_LIGHT_CHECK_ERROR(3010, "Third Head Light Check error"),
/* 261 */   ADF_MULTIFEED(3101, "Multiple Feed"),
/* 262 */   DOC_MISSFEED(3211, "Document missfeed"),
/*     */ 
/*     */   
/* 265 */   HTTP_CLIENT_556001(556001, "HTTP server URL is invalid. Please check URL content."),
/* 266 */   HTTP_CLIENT_556002(556002, "Failed to connect to HTTP server. Please check server settings and network connectivity."),
/* 267 */   HTTP_CLIENT_556003(556003, "Connection is broken and fail to send header to HTTP server. Please check server is running and network connectivity."),
/* 268 */   HTTP_CLIENT_556004(556004, "Connection is broken and fail to send data to HTTP server. Please check server is running and network connectivity."),
/* 269 */   HTTP_CLIENT_556005(556005, "Connection is broken and fail to receive data from HTTP server. Please check server is running and network connectivity."),
/* 270 */   HTTP_CLIENT_556006(556006, "The size of received data from HTTP server is wrong. Please check server is running and network connectivity."),
/*     */ 
/*     */   
/* 273 */   NETWORK_INITIAL_FAILED(590000, "Device internal failure\nReboot Machine."),
/* 274 */   NETWORK_START_CONNECT_FAILED(590001, "Device internal failure\nReboot Machine."),
/* 275 */   NETWORK_START_NEWFILE_FAILED(590002, "Device internal failure\nReboot Machine."),
/* 276 */   NETWORK_SENDDATA_FAILED(590003, "Device internal failure\nReboot Machine."),
/* 277 */   NETWORK_SENDDATA2_FAILED(590004, "Device internal failure\nReboot Machine."),
/* 278 */   NETWORK_CONNECT_FAILED(590005, "Device internal failure\nReboot Machine."),
/* 279 */   NETWORK_END_CONNECT_FAILED(590006, "Device internal failure\nReboot Machine."),
/* 280 */   NETWORK_ABORT(590007, "Device internal failure\nReboot Machine."),
/*     */   
/* 282 */   SMTP_INITIAL_FAILED(590300, "Device internal failure\nReboot Machine."),
/* 283 */   SMTP_START_CONNECT_FAILED(590301, "Device internal failure\nReboot Machine."),
/* 284 */   SMTP_START_NEWFILE_FAILED(590302, "Device internal failure\nReboot Machine."),
/* 285 */   SMTP_SENDDATA_FAILED(590303, "Device internal failure\nReboot Machine."),
/* 286 */   SMTP_SENDDATA2_FAILED(590304, "Device internal failure\nReboot Machine."),
/* 287 */   SMTP_CONNECT_FAILED(590305, "Device internal failure\nReboot Machine."),
/* 288 */   SMTP_END_CONNECT_FAILED(590306, "Device internal failure\nReboot Machine."),
/* 289 */   SMTP_ABORT(590307, "Device internal failure\nReboot Machine."),
/*     */   
/* 291 */   FTP_INITIAL_FAILED(590400, "Device internal failure\nReboot Machine."),
/* 292 */   FTP_START_CONNECT_FAILED(590401, "Device internal failure\nReboot Machine."),
/* 293 */   FTP_START_NEWFILE_FAILED(590402, "Device internal failure\nReboot Machine."),
/* 294 */   FTP_SENDDATA_FAILED(590403, "Device internal failure\nReboot Machine."),
/* 295 */   FTP_SENDDATA2_FAILED(590404, "Device internal failure\nReboot Machine."),
/* 296 */   FTP_CONNECT_FAILED(590405, "Device internal failure\nReboot Machine."),
/* 297 */   FTP_END_CONNECT_FAILED(590406, "Device internal failure\nReboot Machine."),
/* 298 */   FTP_ABORT(590407, "Device internal failure\nReboot Machine."),
/*     */   
/* 300 */   CIFS_INITIAL_FAILED(590600, "Device internal failure\nReboot Machine."),
/* 301 */   CIFS_START_CONNECT_FAILED(590601, "Device internal failure\nReboot Machine."),
/* 302 */   CIFS_START_NEWFILE_FAILED(590602, "Device internal failure\nReboot Machine."),
/* 303 */   CIFS_SENDDATA_FAILED(590603, "Device internal failure\nReboot Machine."),
/* 304 */   CIFS_SENDDATA2_FAILED(590604, "Device internal failure\nReboot Machine."),
/* 305 */   CIFS_CONNECTED_FAILED(590605, "Device internal failure\nReboot Machine."),
/* 306 */   CIFS_END_CONNECT_FAILED(590606, "Device internal failure\nReboot Machine."),
/* 307 */   CIFS_ABORT(590607, "Device internal failure\nReboot Machine."),
/*     */   
/* 309 */   NETWORK2_INITIAL_FAILED(591000, "Device internal failure\nReboot Machine."),
/* 310 */   NETWORK2_START_CONNECT_FAILED(591001, "Device internal failure\nReboot Machine."),
/* 311 */   NETWORK2_START_NEWFILE_FAILED(591002, "Device internal failure\nReboot Machine."),
/* 312 */   NETWORK2_SENDDATA_FAILED(591003, "Device internal failure\nReboot Machine."),
/* 313 */   NETWORK2_SENDDATA2_FAILED(591004, "Device internal failure\nReboot Machine."),
/* 314 */   NETWORK2_CONNECT_FAILED(591005, "Device internal failure\nReboot Machine."),
/* 315 */   NETWORK2_END_CONNECT_FAILED(591006, "Device internal failure\nReboot Machine."),
/* 316 */   NETWORK2_ABORT(591007, "Device internal failure\nReboot Machine."),
/*     */   
/* 318 */   LDAP_CONNECTION_FAIL(597001, "LDAP connection fail."),
/* 319 */   LDAP_LOGIN_FAIL(597001, "LDAP account & Password is wrong."),
/* 320 */   LDAP_SEARCH_FAIL(597001, "LDAP search fail."),
/*     */   
/* 322 */   WIRELESS_CONNECTION_FAIL(597001, "Wireless connection fail."),
/*     */   
/* 324 */   SMTP_NULL_SERVER(592301, "Mail server is NULL"),
/*     */   
/* 326 */   SMTP_CONNECTED_OK(530000, "Test SMTP connection successfully"),
/* 327 */   SMTP_NULL_HANDLE(530001, "Device internal failure\nReboot machine"),
/* 328 */   SMTP_CONNECT_TO_SERVER_FAILED(530002, "Fail to connect mail server"),
/* 329 */   SMTP_LOGIN_FAILED(531001, "SMTP login name or password error"),
/* 330 */   SMTP_AUTH_UNSCUCCESSFUL(531535, "Authentication unsuccessful"),
/* 331 */   SMTP_421_UNAVAILABLE_0(530421, "Server is not available"),
/* 332 */   SMTP_421_UNAVAILABLE_1(531421, "Server is not available"),
/* 333 */   SMTP_421_UNAVAILABLE_2(532421, "Server is not available"),
/* 334 */   SMTP_421_UNAVAILABLE_3(533421, "Server is not available"),
/* 335 */   SMTP_421_UNAVAILABLE_4(534421, "Server is not available"),
/* 336 */   SMTP_421_UNAVAILABLE_6(536421, "Server is not available"),
/* 337 */   SMTP_ACCOUNT_NOT_MATCH(530440, "The account of from and login must be same"),
/* 338 */   SMTP_450_UNAVAILABLE_2(532450, "Mailbox is unavailable"),
/* 339 */   SMTP_450_UNAVAILABLE_3(533450, "Mailbox is unavailable"),
/* 340 */   SMTP_451_REQUEST_ABORTED_2(532451, "Local error in processing"),
/* 341 */   SMTP_451_REQUEST_ABORTED_3(533451, "Local error in processing"),
/* 342 */   SMTP_451_REQUEST_ABORTED_4(534451, "Local error in processing"),
/* 343 */   SMTP_451_REQUEST_ABORTED_5(535451, "Local error in processing"),
/* 344 */   SMTP_451_REQUEST_ABORTED_7(537451, "Local error in processing"),
/* 345 */   SMTP_452_INSUFFICIENT_STORAGE_3(533452, "Insufficient system storage"),
/* 346 */   SMTP_452_INSUFFICIENT_STORAGE_5(535452, "Insufficient system storage"),
/* 347 */   SMTP_452_INSUFFICIENT_STORAGE_7(537452, "Insufficient system storage"),
/* 348 */   SMTP_501_PARAMETER_ERROR_1(531501, "Check \"From\" or \"To\" address or contact admin."),
/* 349 */   SMTP_501_PARAMETER_ERROR_2(532501, "Check \"From\" or \"To\" address or contact admin."),
/* 350 */   SMTP_501_PARAMETER_ERROR_3(533501, "Check \"From\" or \"To\" address or contact admin."),
/* 351 */   SMTP_501_PARAMETER_ERROR_4(534501, "Check \"From\" or \"To\" address or contact admin."),
/* 352 */   SMTP_504_COMMAND_ERROR(531504, "Check \"From\" or \"To\" address or contact admin."),
/* 353 */   SMTP_550_UNAVAILABLE(533550, "Check \"To\" address"),
/* 354 */   SMTP_551_UNAVAILABLE(533551, "1. Check \"To\"\n2. \"From\" and \"To\" are different"),
/* 355 */   SMTP_552_EXCEED_STORAGE_3(533552, "Exceed storage allocation"),
/* 356 */   SMTP_552_EXCEED_STORAGE_5(535552, "Exceed storage allocation"),
/* 357 */   SMTP_552_EXCEED_STORAGE_7(537552, "Exceed storage allocation"),
/* 358 */   SMTP_553_UNAVAILABLE(533553, "Check \"To\" address"),
/* 359 */   SMTP_554_UNAVAILABLE_4(534554, "Transaction fail\nContact admin."),
/* 360 */   SMTP_554_UNAVAILABLE_5(535554, "Transaction fail\nContact admin."),
/* 361 */   SMTP_554_UNAVAILABLE_7(537554, "Transaction fail\nContact admin."),
/* 362 */   SMTP_CONNECT_BROKEN(538001, "Connection is broken in transmitting"),
/* 363 */   SMTP_NO_FILE_NAME(538002, "No file name"),
/* 364 */   SMTP_TLS_NOT_AVAILABLE(531999, "TLS not available due to temporary reason"),
/*     */   
/* 366 */   FTP_CONNECTED_OK(540000, "Test FTP connection successfully"),
/* 367 */   FTP_UNAVAILABLE_1(540001, "Device internal failure\nReboot machine"),
/* 368 */   FTP_UNAVAILABLE_2(540008, "Device internal failure\nReboot machine"),
/* 369 */   FTP_UNAVAILABLE_3(540009, "Device internal failure\nReboot machine"),
/* 370 */   FTP_UNAVAILABLE_4(540010, "Device internal failure\nReboot machine"),
/* 371 */   FTP_UNAVAILABLE_5(540011, "Device internal failure\nReboot machine"),
/* 372 */   FTP_UNAVAILABLE_6(540012, "Device internal failure\nReboot machine"),
/* 373 */   FTP_UNAVAILABLE_7(540013, "Device internal failure\nReboot machine"),
/* 374 */   FTP_UNAVAILABLE_8(540014, "Device internal failure\nReboot machine"),
/* 375 */   FTP_UNAVAILABLE_9(540018, "Device internal failure\nReboot machine"),
/* 376 */   FTP_UNAVAILABLE_10(540022, "Device internal failure\nReboot machine"),
/* 377 */   FTP_UNAVAILABLE_11(540023, "Device internal failure\nReboot machine"),
/* 378 */   FTP_UNAVAILABLE_12(540024, "Device internal failure\nReboot machine"),
/* 379 */   FTP_UNAVAILABLE_13(540025, "Device internal failure\nReboot machine"),
/* 380 */   FTP_UNAVAILABLE_14(540026, "Device internal failure\nReboot machine"),
/* 381 */   FTP_UNAVAILABLE_15(543501, "Device internal failure\nReboot machine"),
/* 382 */   FTP_UNAVAILABLE_16(545501, "Device internal failure\nReboot machine"),
/* 383 */   FTP_UNAVAILABLE_17(545504, "Device internal failure\nReboot machine"),
/* 384 */   FTP_CONNECT_SERVER_FAIL_1(540002, "Fail to connect FTP server"),
/* 385 */   FTP_CONNECT_SERVER_FAIL_2(540003, "Fail to connect FTP server"),
/* 386 */   FTP_LOGIN_NAME_ERROR(540004, "FTP login name error"),
/* 387 */   FTP_PASSWORD_ERROR(540005, "FTP password incorrect"),
/* 388 */   FTP_PATH_NOT_AVAILABLE(540006, "The FTP's path is not available"),
/* 389 */   FTP_TIME_OUT(540007, "Time out or file name is NULL"),
/*     */   
/* 391 */   FTP_CONNECT_BROKEN(540015, "Connection is broken in transmitting"),
/* 392 */   FTP_RENAME_FILE_FAIL(540016, "File exist, rename fail"),
/* 393 */   FTP_SERVICE_READY_IN_MINUTES(540120, "Service ready in (n) minutes"),
/* 394 */   FTP_COMMAND_EXCEED_1(540019, "Command exceeds max. size of 256\n Reboot machine"),
/* 395 */   FTP_COMMAND_EXCEED_2(541001, "Command exceeds max. size of 256\n Reboot machine"),
/* 396 */   FTP_COMMAND_EXCEED_3(542001, "Command exceeds max. size of 256\n Reboot machine"),
/* 397 */   FTP_COMMAND_EXCEED_4(543001, "Command exceeds max. size of 256\n Reboot machine"),
/* 398 */   FTP_COMMAND_EXCEED_5(544001, "Command exceeds max. size of 256\n Reboot machine"),
/* 399 */   FTP_COMMAND_EXCEED_6(545001, "Command exceeds max. size of 256\n Reboot machine"),
/* 400 */   FTP_COMMAND_EXCEED_7(546001, "Command exceeds max. size of 256\n Reboot machine"),
/* 401 */   FTP_COMMAND_EXCEED_8(547001, "Command exceeds max. size of 256\n Reboot machine"),
/* 402 */   FTP_COMMAND_EXCEED_9(548001, "Command exceeds max. size of 256\n Reboot machine"),
/* 403 */   FTP_COMMAND_TRANSFER_FAIL_1(540020, "The command transfer fails"),
/* 404 */   FTP_COMMAND_TRANSFER_FAIL_2(541002, "The command transfer fails"),
/* 405 */   FTP_COMMAND_TRANSFER_FAIL_3(542002, "The command transfer fails"),
/* 406 */   FTP_COMMAND_TRANSFER_FAIL_4(543002, "The command transfer fails"),
/* 407 */   FTP_COMMAND_TRANSFER_FAIL_5(544002, "The command transfer fails"),
/* 408 */   FTP_COMMAND_TRANSFER_FAIL_6(545002, "The command transfer fails"),
/* 409 */   FTP_COMMAND_TRANSFER_FAIL_7(546002, "The command transfer fails"),
/* 410 */   FTP_COMMAND_TRANSFER_FAIL_8(547002, "The command transfer fails"),
/* 411 */   FTP_COMMAND_TRANSFER_FAIL_9(548002, "The command transfer fails"),
/* 412 */   FTP_COMMAND_READ_FAIL_1(540021, "The command reply read fails"),
/* 413 */   FTP_COMMAND_READ_FAIL_2(541003, "The command reply read fails"),
/* 414 */   FTP_COMMAND_READ_FAIL_3(542003, "The command reply read fails"),
/* 415 */   FTP_COMMAND_READ_FAIL_4(543003, "The command reply read fails"),
/* 416 */   FTP_COMMAND_READ_FAIL_5(544003, "The command reply read fails"),
/* 417 */   FTP_COMMAND_READ_FAIL_6(545003, "The command reply read fails"),
/* 418 */   FTP_COMMAND_READ_FAIL_7(546003, "The command reply read fails"),
/* 419 */   FTP_COMMAND_READ_FAIL_8(547003, "The command reply read fails"),
/* 420 */   FTP_COMMAND_READ_FAIL_9(548003, "The command reply read fails"),
/* 421 */   FTP_COMMAND_READ_FAIL_10(549001, "The command reply read fails"),
/* 422 */   FTP_SERVER_NOT_REPLY_1(541004, "The FTP server don't reply message"),
/* 423 */   FTP_SERVER_NOT_REPLY_2(542004, "The FTP server don't reply message"),
/* 424 */   FTP_SERVER_NOT_REPLY_3(543004, "The FTP server don't reply message"),
/* 425 */   FTP_SERVER_NOT_REPLY_4(544004, "The FTP server don't reply message"),
/* 426 */   FTP_SERVER_NOT_REPLY_5(545004, "The FTP server don't reply message"),
/* 427 */   FTP_SERVER_NOT_REPLY_6(546004, "The FTP server don't reply message"),
/* 428 */   FTP_SERVER_NOT_REPLY_7(547004, "The FTP server don't reply message"),
/* 429 */   FTP_SERVER_NOT_REPLY_8(548004, "The FTP server don't reply message"),
/* 430 */   FTP_FILE_TRANSFER_FAIL(546005, "File transfer fail"),
/* 431 */   FTP_421_UNAVAILABLE_0(540421, "Too many connections from this IP"),
/* 432 */   FTP_421_UNAVAILABLE_1(541421, "Too many connections from this IP"),
/* 433 */   FTP_421_UNAVAILABLE_2(542421, "Too many connections from this IP"),
/* 434 */   FTP_421_UNAVAILABLE_3(543421, "Too many connections from this IP"),
/* 435 */   FTP_421_UNAVAILABLE_4(544421, "Too many connections from this IP"),
/* 436 */   FTP_421_UNAVAILABLE_5(545421, "Too many connections from this IP"),
/* 437 */   FTP_421_UNAVAILABLE_6(546421, "Too many connections from this IP"),
/* 438 */   FTP_421_UNAVAILABLE_8(548421, "Too many connections from this IP"),
/* 439 */   FTP_FILE_EXIST_AND_LOCKED_1(544450, "The file already exists and locked by Windows"),
/* 440 */   FTP_FILE_EXIST_AND_LOCKED_2(546450, "The file already exists and locked by Windows"),
/* 441 */   FTP_FILE_EXIST_AND_LOCKED_3(548450, "The file already exists and locked by Windows"),
/* 442 */   FTP_SAPCE_INSUFFICIENT_1(546452, "Storage space is insufficient"),
/* 443 */   FTP_SAPCE_INSUFFICIENT_2(548452, "Storage space is insufficient"),
/* 444 */   FTP_500_UNAVAILABLE_0(540500, "FTP error\nContact your FTP server admin."),
/* 445 */   FTP_500_UNAVAILABLE_1(541500, "FTP error\nContact your FTP server admin."),
/* 446 */   FTP_500_UNAVAILABLE_2(542500, "FTP error\nContact your FTP server admin."),
/* 447 */   FTP_500_UNAVAILABLE_3(543500, "FTP error\nContact your FTP server admin."),
/* 448 */   FTP_500_UNAVAILABLE_4(544500, "FTP error\nContact your FTP server admin."),
/* 449 */   FTP_500_UNAVAILABLE_5(545500, "FTP error\nContact your FTP server admin."),
/* 450 */   FTP_500_UNAVAILABLE_6(546500, "FTP error\nContact your FTP server admin."),
/* 451 */   FTP_500_UNAVAILABLE_7(547500, "FTP error\nContact your FTP server admin."),
/* 452 */   FTP_501_UNAVAILABLE_0(540501, "Check your input parameters"),
/* 453 */   FTP_501_UNAVAILABLE_1(541501, "Check your input parameters"),
/* 454 */   FTP_501_UNAVAILABLE_2(542501, "Check your input parameters"),
/* 455 */   FTP_501_UNAVAILABLE_4(544501, "Check your input parameters"),
/* 456 */   FTP_501_UNAVAILABLE_6(546501, "Check your input parameters"),
/* 457 */   FTP_502_UNAVAILABLE_0(540502, "The server does not support this command"),
/* 458 */   FTP_502_UNAVAILABLE_1(541502, "The server does not support this command"),
/* 459 */   FTP_502_UNAVAILABLE_2(542502, "The server does not support this command"),
/* 460 */   FTP_502_UNAVAILABLE_4(544502, "The server does not support this command"),
/* 461 */   FTP_550_UNAVAILABLE_1(541550, "File is unavailable"),
/* 462 */   FTP_550_UNAVAILABLE_2(542550, "File is unavailable"),
/* 463 */   FTP_550_UNAVAILABLE_6(546550, "File is unavailable"),
/* 464 */   FTP_FILE_NAME_NOT_ALLOW_1(546553, "File name is not allowed"),
/* 465 */   FTP_FILE_NAME_NOT_ALLOW_2(548553, "File name is not allowed"),
/* 466 */   FTP_DIR_NOT_EMPTY(540550, "Directory not empty"),
/*     */ 
/*     */   
/* 469 */   HTTP_CLIENT_555401(555401, "Certification fail(555401)"),
/* 470 */   CIFS_CONNECTED_OK(560000, "Test CIFS connection successfully"),
/* 471 */   CIFS_LOGIN_FAILED(560033, "Logon Failure"),
/* 472 */   CIFS_ERROR_SHARE_FOLDER(561032, "Error share folder name"),
/* 473 */   CIFS_ERROR_SHARE_PATH(561003, "Error share path"),
/* 474 */   CIFS_ERROR_ACCOUNT_PASSWORD(561012, "Error account name or password or date is worng"),
/* 475 */   CIFS_NO_AUTH_TO_MAKE_DIR(561019, "No authority to create directory"),
/* 476 */   CIFS_NO_AUTH_TO_WRITE_FILE(564019, "No authority to write file"),
/* 477 */   CIFS_DUPLICATE_DIR_NAME(561183, "Duplicate directory name"),
/* 478 */   CIFS_DUPLICATE_FILE_NAME(564183, "Duplicate file name"),
/* 479 */   CIFS_FILE_IN_USE(561034, "File in use"),
/* 480 */   CIFS_SERVICE_NOT_READY(563021, "CIFS service is not ready"),
/* 481 */   CIFS_GENERAL_ERROR(563031, "General error"),
/* 482 */   CIFS_DISK_FULL(563039, "Disk is full"),
/* 483 */   CIFS_SERVER_BUSY(562088, "Server is busy, try again later"),
/* 484 */   CIFS_PARAMETER_ERROR(560003, "Parameter error"),
/* 485 */   CIFS_MORE_DATA(561234, "More data"),
/* 486 */   CIFS_ALLOCATE_MEMORY_FAILED(569001, "Allocate memory failure"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 491 */   GOOGLE_DRIVE_OK(610000, "Google drive OK"),
/*     */   
/* 493 */   SHARE_POINT_OK(620000, "Share point OK"),
/*     */   
/* 495 */   DROPBOX_OK(630000, "Send to Dropbox OK"),
/*     */   
/* 497 */   EVERNOTE_OK(640000, "Send to Evernote OK"),
/* 498 */   EVERNOTE_UNKNOWN(640001, "No information available about the error"),
/* 499 */   EVERNOTE_BAD_DATA_FORMAT(640002, "The format of the request data was incorrect"),
/* 500 */   EVERNOTE_PERMISSION_DENIED(640003, "Not permitted to perform action"),
/* 501 */   EVERNOTE_INTERNAL_ERROR(640004, "Unexpected problem with the service"),
/* 502 */   EVERNOTE_DATA_REQUIRED(640005, "A required parameter/field was absent"),
/* 503 */   EVERNOTE_LIMIT_REACHED(640006, "Operation denied due to data model limit"),
/* 504 */   EVERNOTE_QUOTA_REACHED(640007, "Operation denied due to user storage limit"),
/* 505 */   EVERNOTE_INVALID_AUTH(640008, "Username and/or password incorrect"),
/* 506 */   EVERNOTE_AUTH_EXPIRED(640009, "Authentication token expired"),
/* 507 */   EVERNOTE_DATA_CONFLICT(640010, "Change denied due to data model conflict"),
/* 508 */   EVERNOTE_ENML_VALIDATION(640011, "Content of submitted note was malformed"),
/* 509 */   EVERNOTE_SHARD_UNAVAILABLE(640012, "Service shard with account data is temporarily down"),
/* 510 */   EVERNOTE_LEN_TOO_SHORT(640013, "Operation denied due to data model limit, where something such as a string length was too short"),
/* 511 */   EVERNOTE_LEN_TOO_LONG(640014, "Operation denied due to data model limit, where something such as a string length was too long"),
/* 512 */   EVERNOTE_TOO_FEW(640015, "Operation denied due to data model limit, where there were too few of something"),
/* 513 */   EVERNOTE_TOO_MANY(640016, "Operation denied due to data model limit, where there were too many of something"),
/* 514 */   EVERNOTE_UNSUPPORTED_OPERATION(640017, "Operation denied because it is currently unsupported"),
/* 515 */   EVERNOTE_TAKEN_DOWN(640018, "Operation denied because access to the corresponding object is prohibited in response to a take-down notice"),
/* 516 */   EVERNOTE_RATE_LIMIT_REACHED(640019, "Operation denied because the calling application has reached its hourly API call limit for this user"),
/*     */   
/* 518 */   CLOUD_SEND_START(650000, "Start send to cloud"),
/*     */   
/* 520 */   MENU_OK(700000, "Menu OK ??"),
/*     */   
/* 522 */   ETHERNET_SETUP_OK(710000, "Ethernet setup OK"),
/* 523 */   ETHERNET_SETUP_FAILED(710001, "Ethernet setup failed !!"),
/* 524 */   ETHERNET_GETINFO_OK(711000, "Ethernet get info OK"),
/* 525 */   ETHERNET_GETINFO_FAILED(711001, "Ethernet get info failed !!"),
/*     */   
/* 527 */   WIFI_SETUP_OK(720000, "Wifi setup OK"),
/* 528 */   WIFI_SETUP_FAILED(720001, "Wifi setup failed !!"),
/* 529 */   WIFI_GETINFO_OK(721000, "Wifi get info OK"),
/* 530 */   WIFI_GETINFO_FAILED(721001, "Wifi get info failed !!"),
/*     */   
/* 532 */   LDAP_SETUP_OK(730000, "LDAP setup OK"),
/*     */   
/* 534 */   FILE_PACKER_OK(810000, "File packer OK"),
/* 535 */   FILE_PACKER_FAILED(810001, "File packer failed !!"),
/* 536 */   FILE_PACKER_TRANS_BUFF_FAILED(810002, "File packer transfer image to buffer failed !!"),
/* 537 */   FILE_PACKER_TIMEOUT(810009, "File packer timeout"),
/* 538 */   FILE_PACKER_STOPPED(810010, "File packer be stopped"),
/* 539 */   FILE_PACKER_PROGRESS(811000, "File packer progress"),
/*     */   
/* 541 */   IMAGE_PROCESS_OK(820000, "Image processing OK"),
/* 542 */   IMAGE_PROCESS_FAILED(820001, "Image processing failed"),
/* 543 */   IMAGE_PROCESS_PROGRESS(821000, "Image processing progress"),
/*     */   
/* 545 */   THUMB_IMAGE_CREATE_OK(830000, "Create thumbnail images OK"),
/* 546 */   THUMB_IMAGE_CREATE_FAILED(830001, "Create thumbnail images failed !!"),
/* 547 */   THUMB_IMAGE_BEEN_STOPPED(830002, "Create thumbnail images had been stopped !!"),
/* 548 */   THUMB_IMAGE_WRONG_INDEX(830009, "Wrong preview list index !!"),
/* 549 */   THUMB_IMAGE_INSERT_OK(831000, "Insert thumbnail images OK"),
/* 550 */   THUMB_IMAGE_INSERT_FAILED(831001, "Insert thumbnail images failed !!"),
/* 551 */   THUMB_IMAGE_REMOVE_OK(832000, "Remove thumbnail images OK"),
/* 552 */   THUMB_IMAGE_REMOVE_FAILED(832001, "Remove thumbnail images failed !!"),
/* 553 */   THUMB_IMAGE_CROP_OK(833000, "Crop thumbnail images OK"),
/* 554 */   THUMB_IMAGE_CROP_FAILED(833001, "Crop thumbnail images failed !!"),
/* 555 */   THUMB_IMAGE_CROP_EXCEED_SIZE(833002, "Crop size exceed source image size !!"),
/* 556 */   THUMB_IMAGE_ROTATE_OK(834000, "Rotate thumbnail images OK"),
/* 557 */   THUMB_IMAGE_ROTATE_FAILED(834001, "Rotate thumbnail images failed !!"),
/*     */   
/* 559 */   SYS_JOB_FINISHED(900000, "Job finished"),
/* 560 */   SYS_SCAN_SERVICE_NOT_FOUND(900001, "Scan service not found !!"),
/* 561 */   SYS_FILEPACK_SERVICE_NOT_FOUND(900002, "File Pack service not found !!"),
/* 562 */   SYS_SEND_SERVICE_NOT_FOUND(900003, "Send service not found !!"),
/* 563 */   SYS_CIFS_SERVICE_NOT_FOUND(900004, "CIFS service not found !!"),
/* 564 */   SYS_AWIP_SERVICE_NOT_FOUND(900005, "AWIP service not found !!"),
/* 565 */   SYS_LDAP_SEARCH_SERVICE_NOT_FOUND(900006, "LDAP search service not found !!"),
/* 566 */   SYS_STORAGE_PERMISSION_NOT_DEFINED(900020, "Write storage permission not definded !!"),
/*     */   
/* 568 */   SYS_GOTO_SLEEP(910001, "System goto sleep mode"),
/* 569 */   LDAP_SEARCH_OK(920000, "LDAP search OK"),
/* 570 */   LDAP_SEARCH_FAILED(920001, "LDAP search failed"),
/* 571 */   JOBMGR_INIT_FAILED(930000, "Job Manager initial failed !!"),
/* 572 */   UNEXPECTED_ERROR(999999, "Unexpected error !!");
/*     */   
/*     */   private int _numVal;
/*     */   
/*     */   private String _description;
/*     */   
/*     */   SCErrorCode(int numVal, String description) {
/* 579 */     this._numVal = numVal;
/* 580 */     this._description = description;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getCode() {
/* 585 */     return this._numVal;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescription() {
/* 590 */     return this._description;
/*     */   }
/*     */ 
/*     */   
/*     */   public static SCErrorCode findValueByCode(int value) {
/* 595 */     for (SCErrorCode v : values()) {
/*     */       
/* 597 */       if (v.getCode() == value)
/* 598 */         return v; 
/*     */     } 
/* 600 */     return UNEXPECTED_ERROR;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\SCErrorCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */