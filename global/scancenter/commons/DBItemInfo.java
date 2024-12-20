/*     */ package global.scancenter.commons;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DBItemInfo
/*     */   implements Cloneable
/*     */ {
/*     */   public Object clone() throws CloneNotSupportedException {
/*   9 */     return super.clone();
/*     */   }
/*     */   
/*  12 */   public static int adminID = 1;
/*     */ 
/*     */   
/*     */   public class ItemConfigInfo
/*     */     implements Cloneable
/*     */   {
/*     */     public int id;
/*     */     
/*     */     public String info_model;
/*     */     
/*     */     public String info_manufact;
/*     */     
/*     */     public String info_ui_ver;
/*     */     
/*     */     public String info_web_ver;
/*     */     
/*     */     public String info_sys_ver;
/*     */     
/*     */     public String info_scan_ver;
/*     */     
/*     */     public String info_scan_ver2;
/*     */     
/*     */     public String info_serial;
/*     */     
/*     */     public String info_mac_addr;
/*     */     
/*     */     public String info_wifi_mac;
/*     */     public int info_page_count;
/*     */     public int info_page_count2;
/*     */     public int info_page_count3;
/*     */     public String info_host_name;
/*     */     public String info_config_ver;
/*     */     public int cfg_set_config;
/*     */     public int cfg_time_zone;
/*     */     public int cfg_language;
/*     */     public int cfg_sleep_time;
/*     */     public int cfg_reset_time;
/*     */     public String cfg_time;
/*     */     public String cfg_date;
/*     */     public String cfg_wins_server;
/*     */     public int cfg_auto_poweroff;
/*     */     public int cfg_power_mode;
/*     */     public int cfg_size_spec;
/*     */     public int cfg_default_mode;
/*     */     public String cfg_aplus_url;
/*     */     public int cfg_aplus_enable;
/*     */     public String cfg_webview_url;
/*     */     public boolean cfg_enable_admin_center;
/*     */     public int cfg_tray_confirm;
/*     */     public int cfg_tray_0_size;
/*     */     public int cfg_tray_0_type;
/*     */     public int cfg_tray_1_size;
/*     */     public int cfg_tray_1_type;
/*     */     public int cfg_tray_2_size;
/*     */     public int cfg_tray_2_type;
/*     */     public int cfg_tray_3_size;
/*     */     public int cfg_tray_3_type;
/*     */     public int cfg_tray_4_size;
/*     */     public int cfg_tray_4_type;
/*     */     public int cfg_first_boot;
/*     */     public String cfg_date_time;
/*     */     public int cfg_schedule_restart;
/*     */     public int cfg_display_bright;
/*     */     public int cfg_save_temp;
/*     */     public int cfg_csa6_temp;
/*     */     public int cfg_aio_control;
/*     */     public int cfg_heater;
/*     */     public String smtp_url;
/*     */     public int smtp_port;
/*     */     public String smtp_user;
/*     */     public String smtp_password;
/*     */     public int smtp_auth;
/*     */     public int smtp_encrypt;
/*     */     public int acc_auth_mode;
/*     */     public int acc_over_quota_mode;
/*     */     public String acc_admin_name;
/*     */     public String acc_admin_pswd;
/*     */     public int scan_clean_enabled;
/*     */     public int scan_clean_time;
/*     */     public int secu_copy_enabled;
/*     */     public String secu_copy_url;
/*     */     public int secu_copy_port;
/*     */     public String secu_copy_user;
/*     */     public String secu_copy_password;
/*     */     public int job_clean_time;
/*     */     public int enable_copy;
/*     */     public int enable_scan;
/*     */     public int enable_reprint;
/*     */     public int enable_storage_copy;
/*     */     public int enable_id_card;
/*     */     public int enable_email;
/*     */     public int enable_fax;
/*     */     public int enable_dnt;
/*     */     public int enable_csa6;
/*     */     public int enable_fast_copy;
/*     */     public int enable_ticket_copy;
/*     */     public int enable_cloud_print;
/*     */     public int enable_normal_copy;
/*     */     public int enable_plug_in;
/*     */     public int filter_enable;
/*     */     public int filter_mode;
/*     */     public int filter_ip_max;
/*     */     public int filter_mac_max;
/*     */     public int recalibration;
/*     */     public int select_paper_size;
/*     */     public int eth_enable;
/*     */     public int eth_dhcp;
/*     */     public String eth_ip;
/*     */     public String eth_subnet;
/*     */     public String eth_gateway;
/*     */     public String eth_dns;
/*     */     public String eth_wins;
/*     */     public int wifi_mode;
/*     */     public String wifi_ap_ssid;
/*     */     public int wifi_ap_auth;
/*     */     public String wifi_sta_ssid;
/*     */     public int wifi_sta_auth;
/*     */     public boolean machine_first_open;
/*     */     
/*     */     public Object clone() throws CloneNotSupportedException {
/* 132 */       return super.clone();
/*     */     }
/*     */   }
/*     */   
/*     */   public class ItemPublicFolder implements Cloneable {
/*     */     public int id;
/*     */     public String file_name;
/*     */     public String random_name;
/* 140 */     public int owner = DBItemInfo.adminID;
/*     */ 
/*     */     
/*     */     public String pin;
/*     */ 
/*     */     
/*     */     public int page_count;
/*     */ 
/*     */     
/*     */     public String modify_time;
/*     */ 
/*     */ 
/*     */     
/*     */     public Object clone() throws CloneNotSupportedException {
/* 154 */       return super.clone();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public class ItemAccountInfo
/*     */     implements Cloneable
/*     */   {
/*     */     public int id;
/*     */     public String name;
/*     */     public String password;
/*     */     public String email;
/*     */     public String auth_cloud;
/*     */     public String auth_copy;
/*     */     public String auth_email;
/*     */     public String auth_filing;
/*     */     public String auth_fax;
/*     */     
/*     */     public Object clone() throws CloneNotSupportedException {
/* 173 */       return super.clone();
/*     */     }
/*     */   }
/*     */   
/*     */   public class ItemEmailInfo implements Cloneable {
/*     */     public int id;
/* 179 */     public String name = "";
/* 180 */     public String email = "";
/* 181 */     public int owner = DBItemInfo.adminID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Object clone() throws CloneNotSupportedException {
/* 191 */       return super.clone();
/*     */     }
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
/*     */   public class ItemShortcutInfo
/*     */     implements Cloneable
/*     */   {
/* 219 */     public String name = "";
/* 220 */     public JobCategory category = JobCategory.Default;
/* 221 */     public DBItemInfo.ItemScanOptions scanOptions = new DBItemInfo.ItemScanOptions();
/* 222 */     public DBItemInfo.ItemSendOptions sendOptions = new DBItemInfo.ItemSendOptions();
/* 223 */     public DBItemInfo.ItemCopyOptions copyOptions = new DBItemInfo.ItemCopyOptions();
/* 224 */     public String description = "";
/* 225 */     public int owner = DBItemInfo.adminID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Object clone() throws CloneNotSupportedException {
/* 240 */       return super.clone();
/*     */     }
/*     */   }
/*     */   
/*     */   public class ItemFolderInfo
/*     */     implements Cloneable
/*     */   {
/*     */     public int id;
/* 248 */     public String name = "";
/* 249 */     public DBItemInfo.ItemScanOptions scanOptions = new DBItemInfo.ItemScanOptions();
/* 250 */     public DBItemInfo.ItemSendOptions sendOptions = new DBItemInfo.ItemSendOptions();
/* 251 */     public int count = 0;
/* 252 */     public int owner = DBItemInfo.adminID;
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
/*     */     public Object clone() throws CloneNotSupportedException {
/* 265 */       return super.clone();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public class ItemScanOptions
/*     */     extends ScanOptions
/*     */   {
/* 274 */     public int owner = DBItemInfo.adminID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class ItemSendOptions
/*     */     extends SendOptions
/*     */   {
/* 285 */     public int owner = DBItemInfo.adminID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class ItemCopyOptions
/*     */     extends CopyOptions
/*     */   {
/* 296 */     public int owner = DBItemInfo.adminID;
/*     */     
/*     */     public int preset_1;
/*     */     
/*     */     public int preset_2;
/*     */     
/*     */     public int preset_3;
/*     */     
/*     */     public int preset_4;
/*     */     
/*     */     public int preset_5;
/*     */     public int preset_6;
/*     */     public int preset_7;
/*     */     public int preset_8;
/*     */     public int preset_9;
/*     */     public int preset_10;
/*     */   }
/*     */   
/*     */   public static class ItemFaxOptions
/*     */     extends FaxOptions
/*     */   {
/* 317 */     public int owner = DBItemInfo.adminID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class ItemDefaultSetting
/*     */   {
/* 327 */     public DBItemInfo.ItemScanOptions scanOptions = new DBItemInfo.ItemScanOptions();
/* 328 */     public DBItemInfo.ItemSendOptions sendOptions = new DBItemInfo.ItemSendOptions();
/* 329 */     public DBItemInfo.ItemCopyOptions copyOptions = new DBItemInfo.ItemCopyOptions();
/* 330 */     public DBItemInfo.ItemFaxOptions faxOptions = new DBItemInfo.ItemFaxOptions();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\DBItemInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */