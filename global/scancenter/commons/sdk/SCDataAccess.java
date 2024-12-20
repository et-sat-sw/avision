/*     */ package global.scancenter.commons.sdk;
/*     */ 
/*     */ import android.content.BroadcastReceiver;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.IntentFilter;
/*     */ import android.os.Handler;
/*     */ import android.os.HandlerThread;
/*     */ import android.os.Looper;
/*     */ import android.util.Log;
/*     */ import global.scancenter.commons.CopyOptions;
/*     */ import global.scancenter.commons.JsonConstant;
/*     */ import global.scancenter.commons.MailServerInfo;
/*     */ import global.scancenter.uiprotocol.UIP_AccessMode;
/*     */ import global.scancenter.uiprotocol.UIP_TrayStatusInfo;
/*     */ import global.scancenter.uiprotocol.machinestatus.MS_ActionMode;
/*     */ import java.util.ArrayList;
/*     */ import org.json.JSONArray;
/*     */ import org.json.JSONException;
/*     */ import org.json.JSONObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SCDataAccess
/*     */ {
/*     */   private static final int ACTION_OK = 0;
/*     */   private static final int ACTION_TIMEOUT = -1007;
/*     */   private static final int WRONG_PARAMETERS = -1098;
/*     */   private static final String TAG = "SCDataAccess";
/*  34 */   private static Context mContext = null;
/*  35 */   private static Handler mHandler = null;
/*  36 */   private int TIMEOUT = 15;
/*  37 */   private int INTERVAL = 200;
/*  38 */   private int gErrCode = 0;
/*     */   private boolean bWait = false;
/*  40 */   private MailServerInfo mMailServerInfo = null;
/*  41 */   private ArrayList<UIP_TrayStatusInfo> mAvailableTray = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private BroadcastReceiver dataReceiver;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private BroadcastReceiver msReceiver;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private BroadcastReceiver responseReceiver;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList<UIP_TrayStatusInfo> getAvailableTray() {
/*  81 */     mContext.registerReceiver(this.dataReceiver, new IntentFilter("global.scancenter.action.UIP_DATA_ACCESS_RESULTS"), null, mHandler);
/*     */ 
/*     */ 
/*     */     
/*  85 */     Intent i = new Intent("global.scancenter.action.UIP_DATA_ACCESS");
/*  86 */     i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true);
/*  87 */     i.putExtra("global.scancenter.extra.UIP_DATA_ACCESS_MODE_EX", UIP_AccessMode.DEV_GetAvailableTray.getCode());
/*  88 */     mContext.sendBroadcast(i);
/*     */     
/*  90 */     if (waitBR() > 1000 / this.INTERVAL * this.TIMEOUT) {
/*     */       
/*  92 */       Log.w("SCDataAccess", "action timeout !!");
/*  93 */       this.gErrCode = -1007;
/*  94 */       return null;
/*     */     } 
/*     */     
/*  97 */     return this.mAvailableTray;
/*     */   }
/*     */ 
/*     */   
/*     */   public MailServerInfo getMailServerInfo() {
/* 102 */     mContext.registerReceiver(this.msReceiver, new IntentFilter("global.scancenter.action.UIP_MACHINE_STATUS_SERVICE_RESULTS"), null, mHandler);
/*     */ 
/*     */     
/* 105 */     Log.i("SCDataAccess", "getMailServerInfo 1");
/* 106 */     Intent i = new Intent("global.scancenter.action.UIP_MACHINE_STATUS_SERVICE");
/* 107 */     i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true);
/* 108 */     i.putExtra("global.scancenter.extra.MS_ACTION_MODE_EX", MS_ActionMode.GET_SMTP_INFO.getCode());
/* 109 */     mContext.sendBroadcast(i);
/*     */     
/* 111 */     if (waitBR() > 1000 / this.INTERVAL * this.TIMEOUT) {
/*     */       
/* 113 */       Log.w("SCDataAccess", "action timeout !!");
/* 114 */       this.gErrCode = -1007;
/* 115 */       return null;
/*     */     } 
/* 117 */     Log.i("SCDataAccess", "getMailServerInfo 2");
/* 118 */     return this.mMailServerInfo;
/*     */   }
/*     */ 
/*     */   
/*     */   public int setMailServerInfo(MailServerInfo info) {
/* 123 */     mContext.registerReceiver(this.msReceiver, new IntentFilter("global.scancenter.action.UIP_MACHINE_STATUS_SERVICE_RESULTS"), null, mHandler);
/*     */ 
/*     */ 
/*     */     
/* 127 */     JSONObject jsonObject = new JSONObject();
/*     */     
/*     */     try {
/* 130 */       jsonObject.put(JsonConstant.EO_ServerUrl, (info.ServerUrl == null) ? "" : info.ServerUrl);
/* 131 */       jsonObject.put(JsonConstant.EO_Port, info.Port);
/* 132 */       jsonObject.put(JsonConstant.EO_LoginName, (info.LoginName == null) ? "" : info.LoginName);
/* 133 */       jsonObject.put(JsonConstant.EO_Password, (info.Password == null) ? "" : info.Password);
/* 134 */       jsonObject.put(JsonConstant.EO_EnableAuth, info.EnableAuth);
/* 135 */       jsonObject.put(JsonConstant.EO_EncryptType, info.EncryptType);
/*     */     }
/* 137 */     catch (JSONException e) {
/*     */       
/* 139 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 142 */     Intent i = new Intent("global.scancenter.action.UIP_MACHINE_STATUS_SERVICE");
/* 143 */     i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true);
/* 144 */     i.putExtra("global.scancenter.extra.MS_ACTION_MODE_EX", MS_ActionMode.SET_SMTP_INFO.getCode());
/* 145 */     i.putExtra("global.scancenter.extra.MS_SMTP_INFO_EX", jsonObject.toString());
/* 146 */     mContext.sendBroadcast(i);
/*     */     
/* 148 */     if (waitBR() > 1000 / this.INTERVAL * this.TIMEOUT) {
/*     */       
/* 150 */       Log.w("SCDataAccess", "action timeout !!");
/* 151 */       this.gErrCode = -1007;
/* 152 */       return this.gErrCode;
/*     */     } 
/*     */     
/* 155 */     return this.gErrCode;
/*     */   }
/*     */   
/* 158 */   public SCDataAccess(Context context) { this.dataReceiver = new BroadcastReceiver()
/*     */       {
/*     */ 
/*     */         
/*     */         public void onReceive(Context context, Intent intent)
/*     */         {
/* 164 */           String action = intent.getAction();
/* 165 */           final Intent i = intent;
/* 166 */           Log.i("SCDataAccess", "dataReceiver Action: " + action);
/*     */           
/* 168 */           (new Thread(new Runnable()
/*     */               {
/*     */ 
/*     */                 
/*     */                 public void run()
/*     */                 {
/* 174 */                   int mode = i.getIntExtra("global.scancenter.extra.UIP_DATA_ACCESS_MODE_EX", 0);
/* 175 */                   UIP_AccessMode accessMode = UIP_AccessMode.findValueByCode(mode);
/*     */                   
/* 177 */                   if (accessMode != null) {
/*     */                     
/* 179 */                     switch (accessMode) {
/*     */                       case GET_SMTP_INFO:
/* 181 */                         SCDataAccess.this.gErrCode = i.getIntExtra("global.scancenter.extra.UIP_DATA_ACCESS_RESULT", 0);
/* 182 */                         Log.i("SCDataAccess", "DEV_GetAvailableTray 1");
/*     */ 
/*     */                         
/*     */                         try {
/* 186 */                           Log.i("SCDataAccess", "DEV_GetAvailableTray 2");
/*     */                           
/* 188 */                           if (SCDataAccess.this.mAvailableTray != null) {
/*     */                             
/* 190 */                             SCDataAccess.this.mAvailableTray.clear();
/*     */                           }
/*     */                           else {
/*     */                             
/* 194 */                             SCDataAccess.this.mAvailableTray = new ArrayList();
/*     */                           } 
/*     */                           
/* 197 */                           JSONArray jsonArray = new JSONArray(i.getStringExtra("global.scancenter.extra.UIP_TRAY_STATUS_LIST_EX"));
/* 198 */                           for (int i = 0; i < jsonArray.length(); i++) {
/*     */                             
/* 200 */                             JSONObject obj = jsonArray.getJSONObject(i);
/* 201 */                             UIP_TrayStatusInfo info = new UIP_TrayStatusInfo();
/* 202 */                             info.printerTray = CopyOptions.CO_PaperTray.findValueByCode(obj.getInt(JsonConstant.CO_PaperTray));
/* 203 */                             info.paperSize = CopyOptions.CO_TrayPaperSize.findValueByCode(obj.getInt(JsonConstant.CO_PaperSize));
/* 204 */                             info.mediaType = CopyOptions.CO_MediaType.findValueByCode(obj.getInt(JsonConstant.CO_MediaType));
/* 205 */                             SCDataAccess.this.mAvailableTray.add(info);
/*     */                           } 
/* 207 */                           Log.i("SCDataAccess", "DEV_GetAvailableTray 3");
/*     */                         }
/* 209 */                         catch (JSONException e) {
/*     */                           
/* 211 */                           SCDataAccess.this.gErrCode = -1098;
/* 212 */                           e.printStackTrace();
/*     */                         } 
/*     */                         break;
/*     */                     } 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   } else {
/* 221 */                     Log.w("SCDataAccess", "accessnMode is NULL !!");
/*     */                   } 
/* 223 */                   SCDataAccess.mContext.unregisterReceiver(SCDataAccess.this.dataReceiver);
/* 224 */                   SCDataAccess.this.bWait = false;
/*     */                 }
/* 226 */               })).start();
/*     */         }
/*     */       };
/*     */     
/* 230 */     this.msReceiver = new BroadcastReceiver()
/*     */       {
/*     */ 
/*     */         
/*     */         public void onReceive(Context context, Intent intent)
/*     */         {
/* 236 */           String action = intent.getAction();
/* 237 */           final Intent i = intent;
/* 238 */           Log.i("SCDataAccess", "dataReceiver Action: " + action);
/*     */           
/* 240 */           (new Thread(new Runnable()
/*     */               {
/*     */ 
/*     */                 
/*     */                 public void run()
/*     */                 {
/* 246 */                   int mode = i.getIntExtra("global.scancenter.extra.MS_ACTION_MODE_EX", 0);
/* 247 */                   MS_ActionMode actionMode = MS_ActionMode.findValueByCode(mode);
/*     */                   
/* 249 */                   if (actionMode != null) {
/*     */                     
/* 251 */                     switch (actionMode) {
/*     */                       case GET_SMTP_INFO:
/* 253 */                         SCDataAccess.this.gErrCode = i.getIntExtra("global.scancenter.extra.MS_ACTION_RESULT", 0);
/* 254 */                         Log.i("SCDataAccess", "GET_SMTP_INFO 1");
/*     */ 
/*     */                         
/*     */                         try {
/* 258 */                           Log.i("SCDataAccess", "GET_SMTP_INFO 2");
/* 259 */                           JSONObject jsonObj = new JSONObject(i.getStringExtra("global.scancenter.extra.MS_SMTP_INFO_EX"));
/* 260 */                           SCDataAccess.this.mMailServerInfo = new MailServerInfo();
/* 261 */                           SCDataAccess.this.mMailServerInfo.ServerUrl = jsonObj.getString(JsonConstant.EO_ServerUrl);
/* 262 */                           SCDataAccess.this.mMailServerInfo.Port = jsonObj.getInt(JsonConstant.EO_Port);
/* 263 */                           SCDataAccess.this.mMailServerInfo.LoginName = jsonObj.getString(JsonConstant.EO_LoginName);
/* 264 */                           SCDataAccess.this.mMailServerInfo.Password = jsonObj.getString(JsonConstant.EO_Password);
/* 265 */                           SCDataAccess.this.mMailServerInfo.EnableAuth = jsonObj.getBoolean(JsonConstant.EO_EnableAuth);
/* 266 */                           SCDataAccess.this.mMailServerInfo.EncryptType = jsonObj.getInt(JsonConstant.EO_EncryptType);
/* 267 */                           Log.i("SCDataAccess", "GET_SMTP_INFO 3");
/*     */                         }
/* 269 */                         catch (JSONException e) {
/*     */                           
/* 271 */                           SCDataAccess.this.gErrCode = -1098;
/* 272 */                           e.printStackTrace();
/*     */                         } 
/*     */                         break;
/*     */                       
/*     */                       case SET_SMTP_INFO:
/* 277 */                         SCDataAccess.this.gErrCode = i.getIntExtra("global.scancenter.extra.MS_ACTION_RESULT", 0);
/*     */                         break;
/*     */                     } 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   } else {
/* 285 */                     Log.w("SCDataAccess", "actionMode is NULL !!");
/*     */                   } 
/* 287 */                   SCDataAccess.mContext.unregisterReceiver(SCDataAccess.this.msReceiver);
/* 288 */                   SCDataAccess.this.bWait = false;
/*     */                 }
/* 290 */               })).start();
/*     */         }
/*     */       };
/*     */     
/* 294 */     this.responseReceiver = new BroadcastReceiver()
/*     */       {
/*     */ 
/*     */         
/*     */         public void onReceive(Context context, Intent intent)
/*     */         {
/* 300 */           String action = intent.getAction();
/* 301 */           final Intent i = intent;
/* 302 */           Log.i("SCDataAccess", "responseReceiver Action: " + action);
/*     */           
/* 304 */           (new Thread(new Runnable()
/*     */               {
/*     */ 
/*     */                 
/*     */                 public void run()
/*     */                 {
/* 310 */                   SCDataAccess.this.gErrCode = i.getIntExtra("global.scancenter.extra.UIP_RESPONSE_STATUS_CODE", -1098);
/* 311 */                   SCDataAccess.mContext.unregisterReceiver(SCDataAccess.this.responseReceiver);
/* 312 */                   SCDataAccess.this.bWait = false;
/*     */                 }
/* 318 */               })).start(); }
/*     */       };
/*     */     mContext = context;
/*     */     HandlerThread handlerThread = new HandlerThread("ht");
/*     */     handlerThread.start();
/*     */     Looper looper = handlerThread.getLooper();
/* 324 */     mHandler = new Handler(looper); } private int waitBR() { this.bWait = true;
/* 325 */     int c = 0;
/*     */     
/*     */     do {
/* 328 */       Log.i("SCDataAccess", "wait " + c);
/* 329 */       if (c > 1000 / this.INTERVAL * this.TIMEOUT)
/* 330 */         break;  c++;
/*     */ 
/*     */       
/*     */       try {
/* 334 */         Thread.sleep(this.INTERVAL);
/*     */       }
/* 336 */       catch (InterruptedException e) {
/*     */         
/* 338 */         e.printStackTrace();
/*     */       }
/*     */     
/* 341 */     } while (this.bWait);
/*     */     
/* 343 */     return c; }
/*     */ 
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\sdk\SCDataAccess.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */