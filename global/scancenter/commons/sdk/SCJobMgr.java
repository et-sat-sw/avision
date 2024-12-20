/*      */ package global.scancenter.commons.sdk;
/*      */ 
/*      */ import android.content.BroadcastReceiver;
/*      */ import android.content.Context;
/*      */ import android.content.Intent;
/*      */ import android.content.IntentFilter;
/*      */ import android.os.Handler;
/*      */ import android.os.HandlerThread;
/*      */ import android.os.Looper;
/*      */ import android.util.Log;
/*      */ import global.scancenter.UiAgent.UiAgent_Error;
/*      */ import global.scancenter.UiAgent.UiAgent_State;
/*      */ import global.scancenter.UiAgent.UiAgent_StateControl;
/*      */ import global.scancenter.commons.CopyOptions;
/*      */ import global.scancenter.commons.EmailOptions;
/*      */ import global.scancenter.commons.FilingOptions;
/*      */ import global.scancenter.commons.JsonConstant;
/*      */ import global.scancenter.commons.SCDestination;
/*      */ import global.scancenter.commons.SCGlobal;
/*      */ import global.scancenter.commons.SavedJobOptions;
/*      */ import global.scancenter.commons.ScanOptions;
/*      */ import global.scancenter.uiprotocol.UIP_AccessMode;
/*      */ import global.scancenter.uiprotocol.UIP_JobState;
/*      */ import global.scancenter.uiprotocol.UIP_JobStatus;
/*      */ import global.scancenter.uiprotocol.UIP_OperationCode;
/*      */ import global.scancenter.uiprotocol.UIP_TrayStatusInfo;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.Serializable;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import org.json.JSONArray;
/*      */ import org.json.JSONException;
/*      */ import org.json.JSONObject;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class SCJobMgr
/*      */ {
/*      */   private static final int ACTION_OK = 0;
/*      */   private static final int NULL_SCAN_OPTIONS = 65793;
/*      */   private static final int NULL_COPY_OPTIONS = 65794;
/*      */   private static final int NULL_EMAIL_OPTIONS = 65795;
/*      */   private static final int NULL_FILING_OPTIONS = 65796;
/*      */   private static final int NULL_DESTINATION = 65797;
/*      */   private static final int INVALID_DESTINATION = 65798;
/*      */   private static final int WITHOUT_INITIAL_PARAM = 65799;
/*      */   private static final int PARAMETER_ERROR = 65800;
/*      */   private static final int RUNTIME_ERROR = 65801;
/*      */   private static final int PAPERSIZE_ERROR = 65808;
/*      */   private static final int MKDIR_ERROR = 65809;
/*      */   private static final int NULL_SAVEJOB_OPTIONS = 65813;
/*      */   private static final int UNKNOWN_ERROR = 65945;
/*      */   private static final String TAG = "SCJobMgr";
/*   63 */   private static Context mContext = null;
/*   64 */   private static Handler mHandler = null;
/*      */   private static final int TIMEOUT = 15;
/*      */   private static final int INTERVAL = 200;
/*   67 */   private static long gClassID = 0L;
/*   68 */   private static int gErrCode = 0;
/*   69 */   private static int gJobID = 0;
/*      */   private static SCDestination gDestination;
/*      */   private static boolean bWait = false;
/*   72 */   private static OnJobProcListener mProcListener = null;
/*   73 */   private static OnJobStopListener mStopListener = null;
/*   74 */   private static OnCopyProcListener mCopyListener = null;
/*   75 */   private static OnScanProcListener mScanListener = null;
/*   76 */   private static OnSystemProcListener mSystemListener = null;
/*   77 */   private static OnErrorProcListener mErrorListener = null;
/*   78 */   private static ArrayList<UIP_TrayStatusInfo> trayList = null;
/*   79 */   private static int data_access = -1;
/*   80 */   private static String system_usage_info = "";
/*      */ 
/*      */   
/*      */   private static boolean bUIResponse = false;
/*      */   
/*   85 */   static ArrayList<UiAgent_StateControl> MachineFault = new ArrayList<UiAgent_StateControl>();
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
/*      */   public static final int BIND_CONTINUE = 0;
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
/*      */   public static final int BIND_FINISH = 1;
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
/*      */   public static final int BIND_ABORT = 2;
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
/*      */   public static final int JOB_PROCESSING = 2;
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
/*      */   public static final int JOB_END = 3;
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
/*      */   public static final int JOB_QUEUING = 4;
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
/*      */   public static final int JOB_CANCELLING = 6;
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
/*      */   public static final int JOB_ABORTED = 7;
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
/*      */   public static final int JOB_CANCELLED = 8;
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
/*      */   public SCJobMgr(Context context, OnErrorProcListener oErr) {
/* 1230 */     this.stopReceiver = new BroadcastReceiver()
/*      */       {
/*      */ 
/*      */         
/*      */         public void onReceive(Context context, Intent intent)
/*      */         {
/* 1236 */           String action = intent.getAction();
/* 1237 */           final Intent i = intent;
/* 1238 */           Log.i("SCJobMgr", "stopReceiver Action: " + action);
/*      */           
/* 1240 */           (new Thread(new Runnable()
/*      */               {
/*      */ 
/*      */                 
/*      */                 public void run()
/*      */                 {
/* 1246 */                   SCJobMgr.gErrCode = i.getIntExtra("global.scancenter.extra.UIP_RESPONSE_STATUS_CODE", 65945);
/* 1247 */                   if (SCJobMgr.mStopListener != null) {
/*      */                     
/* 1249 */                     SCJobMgr.mStopListener.onResult(SCJobMgr.gErrCode);
/* 1250 */                     SCJobMgr.mStopListener = null;
/* 1251 */                     SCJobMgr.mContext.unregisterReceiver(SCJobMgr.this.stopReceiver);
/*      */                   } 
/*      */                 }
/* 1254 */               })).start();
/*      */         }
/*      */       };
/*      */     
/* 1258 */     this.scanStatusReceiver = new BroadcastReceiver()
/*      */       {
/*      */         
/*      */         public void onReceive(Context context, Intent intent)
/*      */         {
/* 1263 */           String action = intent.getAction();
/* 1264 */           final Intent i = intent;
/* 1265 */           Log.i("SCJobMgr", "scanStatusReceiver Action: " + action);
/*      */           
/* 1267 */           (new Thread(new Runnable()
/*      */               {
/*      */ 
/*      */ 
/*      */                 
/*      */                 public void run()
/*      */                 {
/*      */                   try {
/* 1275 */                     if (SCJobMgr.mScanListener == null) {
/* 1276 */                       Log.w("SCJobMgr", "ScanListener is NULL !!");
/*      */                       
/*      */                       return;
/*      */                     } 
/* 1280 */                     int filesize = i.getIntExtra("global.scancenter.extra.SCAN_FILE_COUNT", 0);
/* 1281 */                     String filepath = i.getStringExtra("global.scancenter.extra.SCAN_FOLDER_PATH");
/* 1282 */                     String filelist = i.getStringExtra("global.scancenter.extra.filelist");
/* 1283 */                     Log.i("SCJobMgr", "file count:" + filesize);
/* 1284 */                     Log.i("SCJobMgr", "file path:" + filepath);
/* 1285 */                     Log.i("SCJobMgr", "file list:" + filelist);
/*      */                     
/* 1287 */                     if (filesize > 0 && !filepath.equals("") && !filelist.equals("")) {
/* 1288 */                       SCJobMgr.mScanListener.onFileInfo(filesize, filepath, filelist);
/*      */                     }
/*      */                   }
/* 1291 */                   catch (Exception e) {
/*      */                     
/* 1293 */                     e.printStackTrace();
/*      */                   } finally {
/* 1295 */                     SCJobMgr.mContext.unregisterReceiver(SCJobMgr.this.scanStatusReceiver);
/*      */                   } 
/*      */                 }
/* 1298 */               })).start();
/*      */         }
/*      */       };
/*      */     
/* 1302 */     this.jobStatusReceiver = new BroadcastReceiver()
/*      */       {
/*      */         
/*      */         public void onReceive(Context context, Intent intent)
/*      */         {
/* 1307 */           String action = intent.getAction();
/* 1308 */           final Intent i = intent;
/* 1309 */           Log.i("SCJobMgr", "jobStatusReceiver Action: " + action);
/*      */           
/* 1311 */           (new Thread(new Runnable()
/*      */               {
/*      */                 
/*      */                 public void run()
/*      */                 {
/* 1316 */                   int s = i.getIntExtra("global.scancenter.extra.UIP_JOB_STATUS_EX", 0);
/* 1317 */                   UIP_JobStatus status = UIP_JobStatus.findValueByCode(s);
/*      */                   
/* 1319 */                   if (status != null)
/*      */                   {
/* 1321 */                     switch (status) {
/*      */                       case NOMATCHINGPAPER:
/* 1323 */                         Log.i("SCJobMgr", "enter WAIT_NEXT_SCAN");
/* 1324 */                         Looper.prepare();
/* 1325 */                         if (SCJobMgr.mProcListener != null) SCJobMgr.mProcListener.onBind();
/*      */                         
/* 1327 */                         SCJobMgr.bWait = false;
/*      */                         break;
/*      */                     } 
/*      */ 
/*      */ 
/*      */                   
/*      */                   }
/*      */                 }
/* 1335 */               })).start();
/*      */         }
/*      */       };
/*      */     
/* 1339 */     this.jobStateReceiver = new BroadcastReceiver()
/*      */       {
/*      */         
/*      */         public void onReceive(Context context, Intent intent)
/*      */         {
/* 1344 */           String action = intent.getAction();
/* 1345 */           final Intent i = intent;
/* 1346 */           Log.i("SCJobMgr", "jobStateReceiver Action: " + action);
/*      */           
/* 1348 */           (new Thread(new Runnable()
/*      */               {
/*      */                 
/*      */                 public void run()
/*      */                 {
/* 1353 */                   UiAgent_State s = (UiAgent_State)i.getSerializableExtra("global.scancenter.extra.UIAGENT_STATE_CODE");
/* 1354 */                   if (s == null) {
/* 1355 */                     Log.w("SCJobMgr", "job state is NULL !!");
/*      */                     
/*      */                     return;
/*      */                   } 
/* 1359 */                   Log.i("SCJobMgr", "JobState." + s.name());
/* 1360 */                   switch (s) {
/*      */                     case NOMATCHINGPAPER:
/* 1362 */                       SCJobMgr.mProcListener.onProgress(UIP_JobState.PROCESSING.getCode());
/*      */                       break;
/*      */                     case null:
/* 1365 */                       SCJobMgr.mProcListener.onProgress(UIP_JobState.CANCELLING.getCode());
/*      */                       break;
/*      */                     case null:
/* 1368 */                       SCJobMgr.mProcListener.onProgress(UIP_JobState.QUEUING.getCode());
/*      */                       break;
/*      */                     case null:
/* 1371 */                       SCJobMgr.mProcListener.onProgress(UIP_JobState.ABORTED.getCode());
/* 1372 */                       SCJobMgr.mProcListener.onResult(0);
/* 1373 */                       SCJobMgr.finish();
/*      */                       break;
/*      */                     case null:
/* 1376 */                       SCJobMgr.mProcListener.onProgress(UIP_JobState.CANCELLED.getCode());
/* 1377 */                       SCJobMgr.mProcListener.onResult(0);
/* 1378 */                       SCJobMgr.finish();
/*      */                       break;
/*      */                     case null:
/* 1381 */                       SCJobMgr.mProcListener.onProgress(UIP_JobState.END.getCode());
/*      */                       
/* 1383 */                       SCJobMgr.mProcListener.onResult(0);
/* 1384 */                       SCJobMgr.finish();
/*      */                       break;
/*      */                   } 
/*      */ 
/*      */                 
/*      */                 }
/* 1390 */               })).start();
/*      */         }
/*      */       };
/*      */     
/* 1394 */     this.SystemReceiver = new BroadcastReceiver()
/*      */       {
/*      */         public void onReceive(Context context, Intent intent)
/*      */         {
/* 1398 */           final String action = intent.getAction();
/* 1399 */           Log.w("SCJobMgr", "action : " + action);
/*      */           
/* 1401 */           if (SCJobMgr.mSystemListener == null) {
/* 1402 */             Log.w("SCJobMgr", "ProcListener is NULL !!");
/*      */             
/*      */             return;
/*      */           } 
/* 1406 */           (new Thread(new Runnable()
/*      */               {
/*      */                 public void run() {
/* 1409 */                   if (action.equals("global.scancenter.action.DISPLAY_ANDROID_POWEROFF") && SCJobMgr
/* 1410 */                     .mSystemListener != null) {
/*      */                     try {
/* 1412 */                       SCJobMgr.mSystemListener.sendPowerOffKey();
/* 1413 */                     } catch (Exception e) {
/* 1414 */                       e.printStackTrace();
/*      */                     }
/*      */                   
/*      */                   }
/*      */                 }
/* 1419 */               })).start();
/*      */         }
/*      */       }; mContext = context; mErrorListener = oErr; gClassID = System.currentTimeMillis(); Log.i("SCJobMgr", gClassID + ": SCJobMgr constructor"); HandlerThread handlerThread = new HandlerThread("ht"); handlerThread.start(); Looper looper = handlerThread.getLooper(); mHandler = new Handler(looper); try { IntentFilter filter = new IntentFilter(); filter.addAction("global.scancenter.action.UIP_OPERATION_RESULT_NOTIFICATION"); filter.addAction("global.scancenter.action.UIP_WAIT_RESPONSE_TIMEOUT"); mContext.registerReceiver(responseReceiver, filter, null, mHandler); filter = new IntentFilter(); filter.addAction("global.scancenter.action.UIAGENT_SEND_STATE"); filter.addAction("global.scancenter.action.UIP_JOB_STATUS_NOTIFICATION"); mContext.registerReceiver(this.jobStateReceiver, filter, null, mHandler); filter = new IntentFilter(); filter.addAction("global.scancenter.action.UIAGENT_SEND_ERROR"); mContext.registerReceiver(ErrorReceiver, filter, null, mHandler); filter = new IntentFilter(); filter.addAction("global.scancenter.action.DISPLAY_ANDROID_POWEROFF"); mContext.registerReceiver(this.SystemReceiver, filter, null, mHandler); filter = new IntentFilter(); filter.addAction("global.scancenter.action.UIP_GET_MACHINE_FAULTS_RESULT"); filter.addAction("global.scancenter.action.UIP_UPDATE_MACHINE_FAULTS"); mContext.registerReceiver(uiResponseReceiver, filter, null, mHandler); } catch (Exception e) { e.printStackTrace(); }  SCGlobal.makeDirectory(SCGlobal.PATH_ROOT + "/ExtData/"); SCGlobal.makeDirectory(SCGlobal.PATH_EXTERNAL_DATA);
/*      */   }
/* 1423 */   public void setMatchPaperTray(int jobId, CopyOptions.CO_PaperTray selectTray) { Log.i("SCJobMgr", gClassID + ": setMatchPaperTray " + jobId + " " + selectTray); if (selectTray == null) { Log.w("SCJobMgr", "select tray is null !!"); return; }  Intent i = new Intent("global.scancenter.action.UIP_NO_MATCH_PAPER_RESPONSE"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.JOB_ID", jobId); i.putExtra("global.scancenter.extra.UIP_TRAY_ID_EX", selectTray.getCode()); mContext.sendBroadcast(i); } public void setBindAction(int action) { Log.i("SCJobMgr", gClassID + ": setScanAction " + action); Intent i = new Intent("global.scancenter.action.UIP_JOB_STATUS_WAIT_FOR_RESULT"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.UIP_WAIT_FOR_RESULT", action); i.putExtra("global.scancenter.extra.senddestination_ex", gDestination.getCode()); mContext.sendBroadcast(i); } public void stopJob(int id, OnJobStopListener listener) { Log.i("SCJobMgr", gClassID + ": stop job"); mStopListener = listener; if (mContext == null) { Log.w("SCJobMgr", "context is null"); if (listener != null) listener.onResult(UIP_OperationCode.OPERATION_WITH_INVALID_PARAMETERS.getCode());  return; }  mContext.registerReceiver(this.stopReceiver, new IntentFilter("global.scancenter.action.UIP_JOB_STOP_NOTIFICATION"), null, mHandler); Intent i = new Intent("global.scancenter.action.UIP_DATA_ACCESS"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.UIP_DATA_ACCESS_MODE_EX", UIP_AccessMode.ACJ_DeleteJob.getCode()); i.putExtra("global.scancenter.extra.JOB_ID", id); mContext.sendBroadcast(i); } public int startJob(SCDestination destination, ScanOptions scanOptions, EmailOptions emailOptions, OnJobProcListener jobListener) { Log.i("SCJobMgr", gClassID + ": start Email job"); if (mContext == null) return 65799;  if (destination != SCDestination.Email) return 65798;  if (destination == null) return 65797;  if (scanOptions == null) return 65793;  if (destination == SCDestination.Email && emailOptions == null) return 65795;  gDestination = destination; mProcListener = jobListener; JSONObject jsonObject = new JSONObject(); try { jsonObject.put(JsonConstant.Job_Destination, destination.getCode()); jsonObject.put(JsonConstant.SO_Contrast, scanOptions.contrast); jsonObject.put(JsonConstant.SO_CustomHeight, scanOptions.customHeight); jsonObject.put(JsonConstant.SO_CustomWidth, scanOptions.customWidth); jsonObject.put(JsonConstant.SO_Density, scanOptions.density); jsonObject.put(JsonConstant.SO_Saturation, scanOptions.saturation); jsonObject.put(JsonConstant.SO_Sharpness, scanOptions.sharpness); jsonObject.put(JsonConstant.SO_EnableBlankDetect, scanOptions.enableBlankDetect); jsonObject.put(JsonConstant.SO_FileFormat, scanOptions.fileFormat.getCode()); jsonObject.put(JsonConstant.SO_FileName, (scanOptions.fileName == null) ? "" : scanOptions.fileName); jsonObject.put(JsonConstant.SO_IsBind, scanOptions.isBind); jsonObject.put(JsonConstant.SO_Operator, (scanOptions.operator == null) ? "" : scanOptions.operator); jsonObject.put(JsonConstant.SO_Orientation, scanOptions.orientation.getCode()); jsonObject.put(JsonConstant.SO_OriginalSize, scanOptions.originalSize.getCode()); jsonObject.put(JsonConstant.SO_OriginalType, scanOptions.originalType.getCode()); jsonObject.put(JsonConstant.SO_OutputColor, scanOptions.outputColor.getCode()); jsonObject.put(JsonConstant.SO_Quality, scanOptions.quality.getCode()); jsonObject.put(JsonConstant.SO_Resolution, scanOptions.resolution.getCode()); jsonObject.put(JsonConstant.SO_TwoSideScan, scanOptions.twoSidedScan.getCode()); switch (destination) { case NOMATCHINGPAPER: jsonObject.put(JsonConstant.EO_ToList, new JSONArray(Arrays.asList((emailOptions.to == null) ? new String[0] : emailOptions.to))); jsonObject.put(JsonConstant.EO_CcList, new JSONArray(Arrays.asList((emailOptions.cc == null) ? new String[0] : emailOptions.cc))); jsonObject.put(JsonConstant.EO_BccList, new JSONArray(Arrays.asList((emailOptions.bcc == null) ? new String[0] : emailOptions.bcc))); jsonObject.put(JsonConstant.EO_Subject, (emailOptions.subject == null) ? "" : emailOptions.subject); jsonObject.put(JsonConstant.EO_Body, (emailOptions.body == null) ? "" : emailOptions.body); jsonObject.put(JsonConstant.EO_From, (emailOptions.from == null) ? "" : emailOptions.from); jsonObject.put(JsonConstant.EO_Reply, (emailOptions.reply == null) ? "" : emailOptions.reply); jsonObject.put(JsonConstant.EO_Separation, emailOptions.separation); jsonObject.put(JsonConstant.EO_ServerUrl, (emailOptions.mailServerInfo.ServerUrl == null) ? "" : emailOptions.mailServerInfo.ServerUrl); jsonObject.put(JsonConstant.EO_Port, emailOptions.mailServerInfo.Port); jsonObject.put(JsonConstant.EO_LoginName, (emailOptions.mailServerInfo.LoginName == null) ? "" : emailOptions.mailServerInfo.LoginName); jsonObject.put(JsonConstant.EO_Password, (emailOptions.mailServerInfo.Password == null) ? "" : emailOptions.mailServerInfo.Password); jsonObject.put(JsonConstant.EO_EnableAuth, emailOptions.mailServerInfo.EnableAuth); jsonObject.put(JsonConstant.EO_EncryptType, emailOptions.mailServerInfo.EncryptType); break; }  } catch (JSONException e) { e.printStackTrace(); return 65800; }  Intent i = new Intent("global.scancenter.action.JOB_START"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.JOB_JSON_DATA", jsonObject.toString()); i.putExtra("global.scancenter.extra.JOB_MODE", 9); mContext.sendBroadcast(i); if (waitBR() > 75) { Log.w("SCJobMgr", "action timeout !!"); gErrCode = 65537; return gErrCode; }  int ret = 0; switch (gErrCode) { case 1: gErrCode = 0; ret = gJobID; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435456: ret = 65536; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435457: ret = 65537; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; }  ret = 65536 + gErrCode; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; } public int startJob(SCDestination destination, ScanOptions scanOptions, FilingOptions filingOptions, OnJobProcListener jobListener) { Log.i("SCJobMgr", gClassID + ": start Filing job"); if (mContext == null) return 65799;  if (destination != SCDestination.FTP && destination != SCDestination.CIFS && destination != SCDestination.USB) return 65798;  if (destination == null) return 65797;  if (scanOptions == null) return 65793;  if ((destination == SCDestination.FTP || destination == SCDestination.CIFS) && filingOptions == null) return 65796;  gDestination = destination; mProcListener = jobListener; JSONObject jsonObject = new JSONObject(); try { jsonObject.put(JsonConstant.Job_Destination, destination.getCode()); jsonObject.put(JsonConstant.SO_Contrast, scanOptions.contrast); jsonObject.put(JsonConstant.SO_CustomHeight, scanOptions.customHeight); jsonObject.put(JsonConstant.SO_CustomWidth, scanOptions.customWidth); jsonObject.put(JsonConstant.SO_Density, scanOptions.density); jsonObject.put(JsonConstant.SO_Saturation, scanOptions.saturation); jsonObject.put(JsonConstant.SO_Sharpness, scanOptions.sharpness); jsonObject.put(JsonConstant.SO_EnableBlankDetect, scanOptions.enableBlankDetect); jsonObject.put(JsonConstant.SO_FileFormat, scanOptions.fileFormat.getCode()); jsonObject.put(JsonConstant.SO_FileName, (scanOptions.fileName == null) ? "" : scanOptions.fileName); jsonObject.put(JsonConstant.SO_IsBind, scanOptions.isBind); jsonObject.put(JsonConstant.SO_Operator, (scanOptions.operator == null) ? "" : scanOptions.operator); jsonObject.put(JsonConstant.SO_Orientation, scanOptions.orientation.getCode()); jsonObject.put(JsonConstant.SO_OriginalSize, scanOptions.originalSize.getCode()); jsonObject.put(JsonConstant.SO_OriginalType, scanOptions.originalType.getCode()); jsonObject.put(JsonConstant.SO_OutputColor, scanOptions.outputColor.getCode()); jsonObject.put(JsonConstant.SO_Quality, scanOptions.quality.getCode()); jsonObject.put(JsonConstant.SO_Resolution, scanOptions.resolution.getCode()); jsonObject.put(JsonConstant.SO_TwoSideScan, scanOptions.twoSidedScan.getCode()); switch (destination) { case null: case null: jsonObject.put(JsonConstant.FO_URL, (filingOptions.URL == null) ? "" : filingOptions.URL); jsonObject.put(JsonConstant.FO_Port, filingOptions.port); jsonObject.put(JsonConstant.FO_LoginName, (filingOptions.loginName == null) ? "" : filingOptions.loginName); jsonObject.put(JsonConstant.FO_Password, (filingOptions.password == null) ? "" : filingOptions.password); jsonObject.put(JsonConstant.FO_SubFolder, (filingOptions.subFolder == null) ? "" : filingOptions.subFolder); jsonObject.put(JsonConstant.FO_BSSL, filingOptions.bSSL); jsonObject.put(JsonConstant.FO_PassiveMode, filingOptions.passiveMode); jsonObject.put(JsonConstant.FO_Overwrite, filingOptions.overwrite); break; }  } catch (JSONException e) { e.printStackTrace(); return 65800; }  Intent i = new Intent("global.scancenter.action.JOB_START"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.JOB_JSON_DATA", jsonObject.toString()); i.putExtra("global.scancenter.extra.JOB_MODE", 9); mContext.sendBroadcast(i); if (waitBR() > 75) { Log.w("SCJobMgr", "action timeout !!"); gErrCode = 65537; return gErrCode; }  int ret = 0; switch (gErrCode) { case 1: gErrCode = 0; ret = gJobID; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435456: ret = 65536; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435457: ret = 65537; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; }  ret = 65536 + gErrCode; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; } public int startJob(SCDestination destination, ScanOptions scanOptions, CopyOptions copyOptions, OnJobProcListener jobListener, OnCopyProcListener copyListener) { Log.i("SCJobMgr", gClassID + ": start Copy job"); if (mContext == null) return 65799;  if (destination != SCDestination.Copy && destination != SCDestination.IdCardCopy) return 65798;  if (destination == null) return 65797;  if (scanOptions == null) return 65793;  if (destination == SCDestination.Copy && copyOptions == null) return 65794;  gDestination = destination; mProcListener = jobListener; mCopyListener = copyListener; JSONObject jsonObject = new JSONObject(); try { jsonObject.put(JsonConstant.Job_Destination, destination.getCode()); jsonObject.put(JsonConstant.SO_Contrast, scanOptions.contrast); jsonObject.put(JsonConstant.SO_CustomHeight, scanOptions.customHeight); jsonObject.put(JsonConstant.SO_CustomWidth, scanOptions.customWidth); jsonObject.put(JsonConstant.SO_Density, scanOptions.density); jsonObject.put(JsonConstant.SO_Saturation, scanOptions.saturation); jsonObject.put(JsonConstant.SO_Sharpness, scanOptions.sharpness); jsonObject.put(JsonConstant.SO_EnableBlankDetect, scanOptions.enableBlankDetect); jsonObject.put(JsonConstant.SO_FileFormat, scanOptions.fileFormat.getCode()); jsonObject.put(JsonConstant.SO_FileName, (scanOptions.fileName == null) ? "" : scanOptions.fileName); jsonObject.put(JsonConstant.SO_IsBind, scanOptions.isBind); jsonObject.put(JsonConstant.SO_Operator, (scanOptions.operator == null) ? "" : scanOptions.operator); jsonObject.put(JsonConstant.SO_Orientation, scanOptions.orientation.getCode()); jsonObject.put(JsonConstant.SO_OriginalSize, scanOptions.originalSize.getCode()); jsonObject.put(JsonConstant.SO_OriginalType, scanOptions.originalType.getCode()); jsonObject.put(JsonConstant.SO_OutputColor, scanOptions.outputColor.getCode()); jsonObject.put(JsonConstant.SO_Quality, scanOptions.quality.getCode()); jsonObject.put(JsonConstant.SO_Resolution, scanOptions.resolution.getCode()); jsonObject.put(JsonConstant.SO_TwoSideScan, scanOptions.twoSidedScan.getCode()); switch (destination) { case null: jsonObject.put(JsonConstant.CO_BackSuppression, copyOptions.backgroundSuppression); jsonObject.put(JsonConstant.CO_BackSuppressionLevel, copyOptions.backgroundSuppressionLevel); jsonObject.put(JsonConstant.CO_BookCopy, copyOptions.bookCopy); jsonObject.put(JsonConstant.CO_BookMargin, copyOptions.bookMargin); jsonObject.put(JsonConstant.CO_CopyCount, copyOptions.copyCount); jsonObject.put(JsonConstant.CO_CoverPage, copyOptions.coverPage.getCode()); jsonObject.put(JsonConstant.CO_Csa6Template, copyOptions.csa6Template); jsonObject.put(JsonConstant.CO_CustomZoom, copyOptions.customZoom); jsonObject.put(JsonConstant.CO_ID, copyOptions.id); jsonObject.put(JsonConstant.CO_PreviewCopy, copyOptions.previewCopy); jsonObject.put(JsonConstant.CO_RotateSide2, copyOptions.rotateSide2); jsonObject.put(JsonConstant.CO_TonerSave, copyOptions.tonerSave); jsonObject.put(JsonConstant.CO_Watermark, copyOptions.watermark); jsonObject.put(JsonConstant.CO_CopyOutput, copyOptions.copyOutput.getCode()); jsonObject.put(JsonConstant.CO_FolderName, (copyOptions.folderName == null) ? "" : copyOptions.folderName); jsonObject.put(JsonConstant.CO_JobName, (copyOptions.jobName == null) ? "" : copyOptions.jobName); jsonObject.put(JsonConstant.CO_MediaType, copyOptions.mediaType.getCode()); jsonObject.put(JsonConstant.CO_Operator, (copyOptions.operator == null) ? "" : copyOptions.operator); jsonObject.put(JsonConstant.CO_PageLayout, copyOptions.pageLayout.getCode()); jsonObject.put(JsonConstant.CO_PaperSize, copyOptions.paperSize.getCode()); jsonObject.put(JsonConstant.CO_PaperTray, copyOptions.paperTray.getCode()); jsonObject.put(JsonConstant.CO_ReduceEnlarge, copyOptions.reduceEnlarge.getCode()); jsonObject.put(JsonConstant.CO_TrayForCoverPage, copyOptions.trayForCoverPage.getCode()); jsonObject.put(JsonConstant.CO_TwoSideCopy, copyOptions.twoSidedCopy.getCode()); break; }  } catch (JSONException e) { e.printStackTrace(); return 65800; }  Intent i = new Intent("global.scancenter.action.JOB_START"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.JOB_JSON_DATA", jsonObject.toString()); i.putExtra("global.scancenter.extra.JOB_MODE", 9); mContext.sendBroadcast(i); if (waitBR() > 75) { Log.w("SCJobMgr", "action timeout !!"); gErrCode = 65537; return gErrCode; }  int ret = 0; switch (gErrCode) { case 1: gErrCode = 0; ret = gJobID; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435456: ret = 65536; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435457: ret = 65537; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; }  ret = 65536 + gErrCode; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; } private static BroadcastReceiver ErrorReceiver = new BroadcastReceiver()
/*      */     {
/*      */       public void onReceive(Context context, Intent intent)
/*      */       {
/* 1427 */         Intent i = intent;
/* 1428 */         UiAgent_Error error = (UiAgent_Error)i.getSerializableExtra("global.scancenter.extra.UIAGENT_ERROR_CODE");
/* 1429 */         int enable = i.getIntExtra("global.scancenter.extra.EXTRA_UIP_MSG_HAPPEN", 0);
/*      */         
/* 1431 */         if (error == null) {
/* 1432 */           Log.w("SCJobMgr", "error is null !!");
/*      */           
/*      */           return;
/*      */         } 
/* 1436 */         if (enable == 1)
/* 1437 */           switch (error)
/*      */           
/*      */           { case NOMATCHINGPAPER:
/* 1440 */               if (SCJobMgr.mCopyListener != null) {
/* 1441 */                 int id = i.getIntExtra("global.scancenter.extra.JOB_ID", 0);
/* 1442 */                 UIP_TrayStatusInfo tray_status = (UIP_TrayStatusInfo)i.getSerializableExtra("global.scancenter.extra.UIP_TRAY_STATUS");
/* 1443 */                 if (tray_status != null) {
/*      */                   try {
/* 1445 */                     JSONObject match_paper = new JSONObject();
/* 1446 */                     match_paper.put("id", id);
/* 1447 */                     match_paper.put(JsonConstant.P_PaperTray, tray_status.printerTray);
/* 1448 */                     match_paper.put(JsonConstant.P_PaperSize, tray_status.paperSize);
/* 1449 */                     match_paper.put(JsonConstant.P_MediaType, tray_status.mediaType);
/* 1450 */                     SCJobMgr.mCopyListener.onNoMatchPaper(match_paper);
/* 1451 */                     Log.i("SCJobMgr", "NO_MATCH_PAPER : " + match_paper.toString());
/* 1452 */                   } catch (JSONException e) {
/* 1453 */                     e.printStackTrace();
/*      */                   }  break;
/*      */                 } 
/* 1456 */                 Log.i("SCJobMgr", "tray_status is null"); break;
/*      */               } 
/* 1458 */               Log.w("SCJobMgr", "CopyListener is NULL !!"); break; }  
/*      */       }
/*      */     };
/*      */   public int startJob(ScanOptions scanOptions, FilingOptions filingOptions, SCDestination destination, OnJobProcListener jobListener) { Log.i("SCJobMgr", gClassID + ": start Scan job"); if (mContext == null) return 65799;  if (scanOptions == null) return 65793;  if (filingOptions == null) return 65796;  gDestination = destination; mProcListener = jobListener; try { mContext.registerReceiver(this.scanStatusReceiver, new IntentFilter("global.scancenter.action.SCAN_FILE_INFORMATION"), null, mHandler); } catch (Exception e) { e.printStackTrace(); finish(); return 65801; }  filingOptions.subFolder = filingOptions.subFolder.equals("") ? "Public" : filingOptions.subFolder; JSONObject jsonObject = new JSONObject(); try { jsonObject.put(JsonConstant.Job_Destination, destination.getCode()); jsonObject.put(JsonConstant.SO_Contrast, scanOptions.contrast); jsonObject.put(JsonConstant.SO_CustomHeight, scanOptions.customHeight); jsonObject.put(JsonConstant.SO_CustomWidth, scanOptions.customWidth); jsonObject.put(JsonConstant.SO_Density, scanOptions.density); jsonObject.put(JsonConstant.SO_Saturation, scanOptions.saturation); jsonObject.put(JsonConstant.SO_Sharpness, scanOptions.sharpness); jsonObject.put(JsonConstant.SO_EnableBlankDetect, scanOptions.enableBlankDetect); jsonObject.put(JsonConstant.SO_FileFormat, scanOptions.fileFormat.getCode()); jsonObject.put(JsonConstant.SO_FileName, (scanOptions.fileName == null) ? "" : scanOptions.fileName); jsonObject.put(JsonConstant.SO_IsBind, scanOptions.isBind); jsonObject.put(JsonConstant.SO_Operator, (scanOptions.operator == null) ? "" : scanOptions.operator); jsonObject.put(JsonConstant.SO_Orientation, scanOptions.orientation.getCode()); jsonObject.put(JsonConstant.SO_OriginalSize, scanOptions.originalSize.getCode()); jsonObject.put(JsonConstant.SO_OriginalType, scanOptions.originalType.getCode()); jsonObject.put(JsonConstant.SO_OutputColor, scanOptions.outputColor.getCode()); jsonObject.put(JsonConstant.SO_Quality, scanOptions.quality.getCode()); jsonObject.put(JsonConstant.SO_Resolution, scanOptions.resolution.getCode()); jsonObject.put(JsonConstant.SO_TwoSideScan, scanOptions.twoSidedScan.getCode()); jsonObject.put(JsonConstant.FO_URL, (filingOptions.URL == null) ? "" : filingOptions.URL); jsonObject.put(JsonConstant.FO_Port, filingOptions.port); jsonObject.put(JsonConstant.FO_LoginName, (filingOptions.loginName == null) ? "" : filingOptions.loginName); jsonObject.put(JsonConstant.FO_Password, (filingOptions.password == null) ? "" : filingOptions.password); jsonObject.put(JsonConstant.FO_SubFolder, filingOptions.subFolder); jsonObject.put(JsonConstant.FO_BSSL, filingOptions.bSSL); jsonObject.put(JsonConstant.FO_PassiveMode, filingOptions.passiveMode); jsonObject.put(JsonConstant.FO_Overwrite, filingOptions.overwrite); } catch (JSONException e) { e.printStackTrace(); return 65800; }  Intent i = new Intent("global.scancenter.action.JOB_START"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.JOB_JSON_DATA", jsonObject.toString()); i.putExtra("global.scancenter.extra.JOB_MODE", 9); mContext.sendBroadcast(i); if (waitBR() > 75) { Log.w("SCJobMgr", "action timeout !!"); gErrCode = 65537; return gErrCode; }  int ret = 0; switch (gErrCode) { case 1: gErrCode = 0; ret = gJobID; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435456: ret = 65536; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435457: ret = 65537; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; }  ret = 65536 + gErrCode; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; }
/*      */   public int startJob(SavedJobOptions savedJobOptions, SCDestination destination, OnJobProcListener jobListener) { Log.w("SCJobMgr", "Save Print Job : " + destination.name() + ", " + ((savedJobOptions == null) ? 1 : 0)); if (savedJobOptions == null) return 65813;  if (destination != SCDestination.StoragePrint) return 65798;  if (savedJobOptions.source == SavedJobOptions.SV_JobSource.USB) { int last_slash = savedJobOptions.fileName.lastIndexOf("/"); String folder = ""; if (last_slash > 0) folder = String.copyValueOf(savedJobOptions.fileName.toCharArray(), 0, last_slash);  getUSBList(folder); savedJobOptions.fileName = String.copyValueOf(savedJobOptions.fileName.toCharArray(), last_slash + 1, savedJobOptions.fileName.length() - last_slash - 1); }  mProcListener = jobListener; Log.w("SCJobMgr", "fileName : " + savedJobOptions.fileName); JSONObject jsonObject = new JSONObject(); try { jsonObject.put(JsonConstant.Job_Destination, destination.getCode()); jsonObject.put(JsonConstant.SJ_Source, savedJobOptions.source.getCode()); jsonObject.put(JsonConstant.SJ_Operator, savedJobOptions.operator); jsonObject.put(JsonConstant.SJ_Name, savedJobOptions.name); jsonObject.put(JsonConstant.SJ_FileName, savedJobOptions.fileName); jsonObject.put(JsonConstant.SJ_FolderName, savedJobOptions.folderName); jsonObject.put(JsonConstant.SJ_Password, savedJobOptions.password); jsonObject.put(JsonConstant.SJ_CopyCount, savedJobOptions.copyCount); jsonObject.put(JsonConstant.SJ_TwoSidedPrint, savedJobOptions.twoSidedPrint.getCode()); jsonObject.put(JsonConstant.SJ_PaperTray, savedJobOptions.paperTray.getCode()); } catch (JSONException e) { e.printStackTrace(); return 65800; }  Intent i = new Intent("global.scancenter.action.JOB_START"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.JOB_JSON_DATA", jsonObject.toString()); i.putExtra("global.scancenter.extra.JOB_MODE", 8); mContext.sendBroadcast(i); if (waitBR() > 75) { Log.w("SCJobMgr", "action timeout !!"); gErrCode = 65537; return gErrCode; }  int ret = 0; switch (gErrCode) { case 1: gErrCode = 0; ret = gJobID; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435456: ret = 65536; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435457: ret = 65537; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; }  ret = 65536 + gErrCode; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; } public int startJob(ScanOptions scanOptions, String savepath, OnJobProcListener jobListener, OnScanProcListener scanListener) { Log.i("SCJobMgr", gClassID + ": start Scan To local job"); SCDestination destination = SCDestination.LocalStorage; if (mContext == null) return 65799;  if (scanOptions == null) return 65793;  if (savepath == null || savepath.equals("")) return 65945;  savepath = SCGlobal.PATH_EXTERNAL_DATA + savepath; if (savepath.lastIndexOf("/") != savepath.length() - 1) savepath = savepath + "/";  FilingOptions filingOptions = new FilingOptions(); gDestination = destination; mProcListener = jobListener; mScanListener = scanListener; Log.i("SCJobMgr", "savepath : " + savepath); File file = new File(savepath); boolean mkFolder = SCGlobal.makeDirectory(savepath); if (!mkFolder) { Log.i("SCJobMgr", "MKDIR ERROR " + mkFolder); return 65809; }  try { mContext.registerReceiver(this.scanStatusReceiver, new IntentFilter("global.scancenter.action.SCAN_FILE_INFORMATION"), null, mHandler); } catch (Exception e) { e.printStackTrace(); finish(); return 65801; }  filingOptions.subFolder = filingOptions.subFolder.equals("") ? "Public" : filingOptions.subFolder; JSONObject jsonObject = new JSONObject(); try { jsonObject.put(JsonConstant.Job_Destination, destination.getCode()); jsonObject.put(JsonConstant.SO_Contrast, scanOptions.contrast); jsonObject.put(JsonConstant.SO_CustomHeight, scanOptions.customHeight); jsonObject.put(JsonConstant.SO_CustomWidth, scanOptions.customWidth); jsonObject.put(JsonConstant.SO_Density, scanOptions.density); jsonObject.put(JsonConstant.SO_Saturation, scanOptions.saturation); jsonObject.put(JsonConstant.SO_Sharpness, scanOptions.sharpness); jsonObject.put(JsonConstant.SO_EnableBlankDetect, scanOptions.enableBlankDetect); jsonObject.put(JsonConstant.SO_FileFormat, scanOptions.fileFormat.getCode()); jsonObject.put(JsonConstant.SO_FileName, (scanOptions.fileName == null) ? "" : scanOptions.fileName); jsonObject.put(JsonConstant.SO_IsBind, scanOptions.isBind); jsonObject.put(JsonConstant.SO_Operator, (scanOptions.operator == null) ? "" : scanOptions.operator); jsonObject.put(JsonConstant.SO_Orientation, scanOptions.orientation.getCode()); jsonObject.put(JsonConstant.SO_OriginalSize, scanOptions.originalSize.getCode()); jsonObject.put(JsonConstant.SO_OriginalType, scanOptions.originalType.getCode()); jsonObject.put(JsonConstant.SO_OutputColor, scanOptions.outputColor.getCode()); jsonObject.put(JsonConstant.SO_Quality, scanOptions.quality.getCode()); jsonObject.put(JsonConstant.SO_Resolution, scanOptions.resolution.getCode()); jsonObject.put(JsonConstant.SO_TwoSideScan, scanOptions.twoSidedScan.getCode()); jsonObject.put(JsonConstant.FO_URL, (filingOptions.URL == null) ? "" : filingOptions.URL); jsonObject.put(JsonConstant.FO_Port, filingOptions.port); jsonObject.put(JsonConstant.FO_LoginName, (filingOptions.loginName == null) ? "" : filingOptions.loginName); jsonObject.put(JsonConstant.FO_Password, (filingOptions.password == null) ? "" : filingOptions.password); jsonObject.put(JsonConstant.FO_SubFolder, filingOptions.subFolder); jsonObject.put(JsonConstant.FO_BSSL, filingOptions.bSSL); jsonObject.put(JsonConstant.FO_PassiveMode, filingOptions.passiveMode); jsonObject.put(JsonConstant.FO_Overwrite, filingOptions.overwrite); } catch (JSONException e) { e.printStackTrace(); return 65800; }  Intent intent = new Intent("global.scancenter.action.SCANJOB_EXTRA_PROCESSING"); intent.putExtra("global.scancenter.extra.LOADPATH", filingOptions.subFolder); intent.putExtra("global.scancenter.extra.SAVEPATH", savepath); mContext.sendBroadcast(intent); Intent i = new Intent("global.scancenter.action.JOB_START"); i.putExtra("global.scancenter.extra.PARSE_JSON_DATA", true); i.putExtra("global.scancenter.extra.JOB_JSON_DATA", jsonObject.toString()); i.putExtra("global.scancenter.extra.JOB_MODE", 9); mContext.sendBroadcast(i); if (waitBR() > 75) { Log.w("SCJobMgr", "action timeout !!"); gErrCode = 65537; return gErrCode; }  int ret = 0; switch (gErrCode) { case 1: gErrCode = 0; ret = gJobID; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435456: ret = 65536; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret;case 268435457: ret = 65537; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; }  ret = 65536 + gErrCode; Log.i("SCJobMgr", "return code: 0x" + Integer.toHexString(ret)); return ret; } public boolean UsbDetection() { Log.e("SCJobMgr", "UsbDetection"); boolean state = (new File("/usb_storage/USB_DISK0/DISK0_Partition0/")).exists(); try { Thread.sleep(1000L); } catch (InterruptedException e) { e.printStackTrace(); }  return state; } private JSONObject getUSBfolder(String folder) { File usb_storage = new File("/usb_storage/USB_DISK0/DISK0_Partition0/"); if (usb_storage.exists()) { JSONObject jsonObject = new JSONObject(); if ((usb_storage.listFiles()).length > 0) try { JSONArray item_arr = new JSONArray(); for (File i : usb_storage.listFiles()) { JSONObject item = new JSONObject(); item.put("name", i.getName()); item.put("isFileOrFolder", i.isDirectory()); item_arr.put(item); }  jsonObject.put("USBList", item_arr); } catch (JSONException e) { e.printStackTrace(); return null; }   Log.i("SCJobMgr", "USB List : " + jsonObject.toString()); return jsonObject; }  return null; } public JSONObject getUSBList(String folder) { String folderPath = ""; File usb_storage = new File("/usb_storage/USB_DISK0/DISK0_Partition0/"); if (usb_storage.exists()) if (folder.equals("")) { folderPath = "/usb_storage/USB_DISK0/DISK0_Partition0/"; } else { if (folder.indexOf("/") == 0) folder = folder.substring(1);  int iSlash = 0; do { File temp; iSlash = folder.indexOf("/", iSlash); if (iSlash == -1) { temp = new File("/usb_storage/USB_DISK0/DISK0_Partition0/" + folder); } else { temp = new File("/usb_storage/USB_DISK0/DISK0_Partition0/" + folder.substring(0, iSlash)); }  if (temp.exists()) continue;  temp.mkdir(); } while (iSlash < folder.length() && iSlash >= 0); folderPath = "/usb_storage/USB_DISK0/DISK0_Partition0/" + folder; }   Log.i("SCJobMgr", "getUSBList : " + folderPath); return getUSBfolder(folderPath); } public String GetAvailableTray() { trayList = null; data_access = -1; Intent i = new Intent("global.scancenter.action.UIP_DATA_ACCESS"); i.putExtra("global.scancenter.extra.UIP_DATA_ACCESS_MODE", (Serializable)UIP_AccessMode.DEV_GetAvailableTray); mContext.sendBroadcast(i); try { mContext.registerReceiver(DataAccessReceiver, new IntentFilter("global.scancenter.action.UIP_DATA_ACCESS_RESULTS"), null, mHandler); } catch (Exception e) { e.printStackTrace(); finish(); return null; }  String ret = waitDataAccess(); if (trayList.size() > 0 && ret.equals("END")) { JSONObject jsonObject = new JSONObject(); for (UIP_TrayStatusInfo temp : trayList) { JSONObject item = new JSONObject(); try { item.put("papersize", temp.paperSize.name()); item.put("quantity", temp.quantity); jsonObject.put(temp.printerTray.name(), item); } catch (JSONException e) { e.printStackTrace(); return null; }  }  return jsonObject.toString(); }  return null; } public String GetSystemUsageInfo() { system_usage_info = ""; data_access = -1; Intent i = new Intent("global.scancenter.action.GET_SYSTEM_USAGE_INFO"); mContext.sendBroadcast(i); try { IntentFilter filter = new IntentFilter(); filter.addAction("global.scancenter.action.GET_SYSTEM_USAGE_INFO_RESULT"); mContext.registerReceiver(DataAccessReceiver, filter, null, mHandler); } catch (Exception e) { e.printStackTrace(); finish(); return null; }  String ret = waitDataAccess(); Log.i("SCJobMgr", "system usage info = " + system_usage_info); if (ret.equals("END")) return system_usage_info;  return null; } public byte[] getFileToByte(String fileformat) { Log.e("SCJobMgr", "fileformat:" + fileformat); if (fileformat.charAt(0) == '/') { fileformat = SCGlobal.PATH_EXTERNAL_DATA + fileformat; } else { fileformat = SCGlobal.PATH_EXTERNAL_DATA + "/" + fileformat; }  fileformat = SCGlobal.PATH_EXTERNAL_DATA + fileformat; File file = new File(fileformat); if (!file.exists()) { Log.e("SCJobMgr", "file isn't exist"); return null; }  InputStream inputStream = null; ByteArrayOutputStream baos = new ByteArrayOutputStream(); try { inputStream = new FileInputStream(fileformat); byte[] buffer = new byte[1024]; baos = new ByteArrayOutputStream(); int bytesRead; while ((bytesRead = inputStream.read(buffer)) != -1) baos.write(buffer, 0, bytesRead);  } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); }  return null; } public boolean cleanExternalFolder(String folder) { boolean ret = true; File tmp_folder = new File(SCGlobal.PATH_EXTERNAL_DATA + folder); Log.i("SCJobMgr", "folder : " + tmp_folder.getPath()); if (tmp_folder.exists()) { String[] fileList = tmp_folder.list(); for (String tmp_fileList : fileList) { ret = (new File(tmp_folder.getPath() + File.separator + tmp_fileList)).delete(); Log.i("SCJobMgr", "delete : " + tmp_folder.getPath() + File.separator + tmp_fileList + " " + ret); if (!ret) return ret;  }  }  return (new File(SCGlobal.PATH_EXTERNAL_DATA + folder)).delete(); } public boolean cleanExternalFolder() { boolean ret = true; File folder = new File(SCGlobal.PATH_EXTERNAL_DATA); if (folder.isDirectory() && folder.exists()) { String[] fileList = folder.list(); for (String tmp_folder : fileList) { ret = cleanExternalFolder(tmp_folder); Log.i("SCJobMgr", "delete folder : " + tmp_folder + " " + ret); if (!ret) return ret;  }  }  Log.i("SCJobMgr", "mkdir : " + ret); return ret; } private static void finish() { try { mContext.unregisterReceiver(DataAccessReceiver); } catch (Exception e) { e.printStackTrace(); }  } public void freedRegisterReceiver() { Log.w("SCJobMgr", "freedRegisterReceiver"); try { mContext.unregisterReceiver(ErrorReceiver); mContext.unregisterReceiver(this.SystemReceiver); mContext.unregisterReceiver(responseReceiver); mContext.unregisterReceiver(this.jobStateReceiver); mContext.unregisterReceiver(this.jobStatusReceiver); mContext.unregisterReceiver(uiResponseReceiver); } catch (Exception e) { e.printStackTrace(); }  } private static BroadcastReceiver responseReceiver = new BroadcastReceiver() {
/*      */       public void onReceive(Context context, Intent intent) { final String action = intent.getAction(); final Intent i = intent; Log.i("SCJobMgr", "responseReceiver Action: " + action); (new Thread(new Runnable() {
/*      */               public void run() { if (action.equals("global.scancenter.action.UIP_OPERATION_RESULT_NOTIFICATION")) { SCJobMgr.gErrCode = i.getIntExtra("global.scancenter.extra.UIP_RESPONSE_STATUS_CODE", 65945); SCJobMgr.gJobID = i.getIntExtra("global.scancenter.extra.JOB_ID", 0); SCJobMgr.bWait = false; Log.i("SCJobMgr", "global.scancenter.action.UIP_OPERATION_RESULT_NOTIFICATION : " + SCJobMgr.gErrCode + ", " + SCJobMgr.gJobID); } else if (action.equals("global.scancenter.action.UIP_WAIT_RESPONSE_TIMEOUT")) { Intent it = new Intent("global.scancenter.action.UIP_JOB_STATUS_WAIT_FOR_RESULT"); it.putExtra("global.scancenter.extra.UIP_WAIT_FOR_RESULT", 2); SCJobMgr.mContext.sendBroadcast(it); }  }
/*      */             })).start(); }
/* 1466 */     }; private BroadcastReceiver stopReceiver; private BroadcastReceiver scanStatusReceiver; private BroadcastReceiver jobStatusReceiver; private BroadcastReceiver jobStateReceiver; private BroadcastReceiver SystemReceiver; private static BroadcastReceiver uiResponseReceiver = new BroadcastReceiver()
/*      */     {
/*      */       
/*      */       public void onReceive(Context context, final Intent intent)
/*      */       {
/* 1471 */         final String action = intent.getAction();
/* 1472 */         Log.w("SCJobMgr", "action : " + action);
/*      */         
/* 1474 */         (new Thread(new Runnable()
/*      */             {
/*      */               public void run() {
/* 1477 */                 if ("global.scancenter.action.UIP_GET_MACHINE_FAULTS_RESULT".equals(action)) {
/*      */                   
/* 1479 */                   SCJobMgr.MachineFault = intent.getParcelableArrayListExtra("global.scancenter.extra.UIP_MACHINE_FAULT_LIST");
/* 1480 */                   if (SCJobMgr.MachineFault == null) {
/* 1481 */                     SCJobMgr.MachineFault = new ArrayList<UiAgent_StateControl>();
/*      */                   }
/* 1483 */                   SCJobMgr.bUIResponse = true;
/* 1484 */                 } else if ("global.scancenter.action.UIP_UPDATE_MACHINE_FAULTS".equals(action)) {
/*      */                   
/* 1486 */                   if (SCJobMgr.mErrorListener != null) {
/*      */                     try {
/* 1488 */                       SCJobMgr.mErrorListener.errorStateUpdate();
/* 1489 */                     } catch (Exception e) {
/* 1490 */                       e.printStackTrace();
/*      */                     } 
/*      */                   }
/*      */                 } 
/*      */               }
/* 1495 */             })).start();
/*      */       }
/*      */     };
/*      */ 
/*      */   
/* 1500 */   private static BroadcastReceiver DataAccessReceiver = new BroadcastReceiver()
/*      */     {
/*      */       public void onReceive(Context context, Intent intent)
/*      */       {
/* 1504 */         String action = intent.getAction();
/* 1505 */         Intent i = intent;
/* 1506 */         if ("global.scancenter.action.UIP_DATA_ACCESS_RESULTS".equals(action)) {
/*      */           
/* 1508 */           UIP_AccessMode accessMode = (UIP_AccessMode)i.getSerializableExtra("global.scancenter.extra.UIP_DATA_ACCESS_MODE");
/* 1509 */           int ret = i.getIntExtra("global.scancenter.extra.UIP_DATA_ACCESS_RESULT", UIP_OperationCode.ACCOUNT_FULL.getCode());
/* 1510 */           if (accessMode != null && accessMode.equals(UIP_AccessMode.DEV_GetAvailableTray)) {
/* 1511 */             SCJobMgr.trayList = intent.getParcelableArrayListExtra("global.scancenter.extra.UIP_TRAY_STATUS_LIST");
/* 1512 */             SCJobMgr.data_access = ret;
/*      */           }
/* 1514 */           else if (accessMode.equals(UIP_AccessMode.SVJ_NewUsbFolder)) {
/* 1515 */             SCJobMgr.data_access = ret;
/*      */           } else {
/* 1517 */             Log.i("SCJobMgr", "accessMode null");
/*      */           } 
/* 1519 */         } else if ("global.scancenter.action.GET_SYSTEM_USAGE_INFO_RESULT".equals(action)) {
/*      */           
/* 1521 */           SCJobMgr.system_usage_info = i.getStringExtra("global.scancenter.extra.GET_DATA");
/* 1522 */           SCJobMgr.data_access = UIP_OperationCode.OPERATION_OK.getCode();
/*      */         } 
/*      */       }
/*      */     };
/*      */ 
/*      */   
/*      */   private String waitDataAccess() {
/* 1529 */     while (data_access == -1) {
/*      */ 
/*      */       
/*      */       try {
/* 1533 */         Thread.sleep(100L);
/*      */       }
/* 1535 */       catch (InterruptedException e) {
/*      */         
/* 1537 */         e.printStackTrace();
/* 1538 */         return "ERROR TIME";
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*      */     try {
/* 1544 */       mContext.unregisterReceiver(DataAccessReceiver);
/*      */     }
/* 1546 */     catch (Exception e) {
/*      */       
/* 1548 */       e.printStackTrace();
/* 1549 */       return "ERROR UNREGISTER";
/*      */     } 
/*      */     
/* 1552 */     Log.i("SCJobMgr", "waitBR : " + data_access);
/* 1553 */     if (data_access != UIP_OperationCode.OPERATION_OK.getCode()) {
/* 1554 */       return "NG";
/*      */     }
/* 1556 */     return "END";
/*      */   }
/*      */ 
/*      */   
/*      */   private static int waitBR() {
/* 1561 */     bWait = true;
/* 1562 */     int c = 0;
/*      */ 
/*      */ 
/*      */     
/* 1566 */     while (c <= 75) {
/* 1567 */       c++;
/*      */ 
/*      */       
/*      */       try {
/* 1571 */         Thread.sleep(200L);
/*      */       }
/* 1573 */       catch (InterruptedException e) {
/*      */         
/* 1575 */         e.printStackTrace();
/*      */       } 
/*      */       
/* 1578 */       if (!bWait)
/*      */         break; 
/* 1580 */     }  return c;
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean collateJsonArray(String target, JSONArray aJson, String tag) {
/* 1585 */     Log.i("SCJobMgr", "collateJsonArray : " + target + ", " + tag);
/*      */     
/* 1587 */     if (aJson != null)
/*      */     {
/* 1589 */       for (int i = 0; i < aJson.length(); i++) {
/*      */         try {
/* 1591 */           JSONObject json = aJson.getJSONObject(i);
/* 1592 */           if (target.equals(json.getString(tag))) {
/* 1593 */             return true;
/*      */           }
/* 1595 */         } catch (JSONException e) {
/*      */           
/* 1597 */           e.printStackTrace();
/*      */         } 
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 1603 */     return false;
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
/*      */   public void resetState() {
/* 1621 */     Intent i = new Intent("global.scancenter.action.UIP_MSG_ALL_RESET");
/* 1622 */     mContext.sendBroadcast(i);
/*      */   }
/*      */   
/*      */   public JSONArray getFaulterror() {
/* 1626 */     Log.w("SCJobMgr", "getFaulterror");
/* 1627 */     JSONArray ret = new JSONArray();
/* 1628 */     bUIResponse = false;
/* 1629 */     MachineFault = new ArrayList<UiAgent_StateControl>();
/* 1630 */     Intent i = new Intent("global.scancenter.action.UIP_GET_MACHINE_FAULTS");
/* 1631 */     mContext.sendBroadcast(i);
/*      */     
/* 1633 */     if (waitUIResponse() <= 75)
/*      */     {
/* 1635 */       for (UiAgent_StateControl m : MachineFault) {
/*      */         try {
/* 1637 */           JSONObject json = new JSONObject();
/* 1638 */           json.put("ErrorCode", m.error_code);
/* 1639 */           json.put("ErrorType", (m.type == 1) ? "Error" : "Warning");
/* 1640 */           ret.put(json);
/* 1641 */         } catch (JSONException e) {
/* 1642 */           e.printStackTrace();
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/* 1647 */     Log.w("SCJobMgr", "getFaulterror : " + ret.toString());
/* 1648 */     return ret;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static int waitUIResponse() {
/* 1654 */     int c = 0;
/* 1655 */     while (!bUIResponse) {
/*      */       
/* 1657 */       if (c > 75)
/* 1658 */         break;  c++;
/*      */ 
/*      */       
/*      */       try {
/* 1662 */         Thread.sleep(200L);
/*      */       }
/* 1664 */       catch (InterruptedException e) {
/*      */         
/* 1666 */         e.printStackTrace();
/*      */       } 
/*      */     } 
/*      */     
/* 1670 */     return c;
/*      */   }
/*      */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\sdk\SCJobMgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */