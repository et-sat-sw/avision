/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import global.scancenter.uiprotocol.UIP_ActiveJobInfo;
/*     */ import java.util.ArrayList;
/*     */ import org.json.JSONObject;
/*     */ 
/*     */ 
/*     */ public class JsonConstant
/*     */ {
/*  10 */   public static String Job_Destination = "Job_Destination";
/*     */ 
/*     */   
/*  13 */   public static String SO_Contrast = "SO_Contrast";
/*  14 */   public static String SO_CustomHeight = "SO_CustomHeight";
/*  15 */   public static String SO_CustomWidth = "SO_CustomWidth";
/*  16 */   public static String SO_Density = "SO_Density";
/*  17 */   public static String SO_Saturation = "SO_Saturation";
/*  18 */   public static String SO_Sharpness = "SO_Sharpness";
/*  19 */   public static String SO_EnableBlankDetect = "SO_EnableBlankDetect";
/*  20 */   public static String SO_FileFormat = "SO_FileFormat";
/*  21 */   public static String SO_FileName = "SO_FileName";
/*  22 */   public static String SO_IsBind = "SO_IsBind";
/*  23 */   public static String SO_Operator = "SO_Operator";
/*  24 */   public static String SO_Orientation = "SO_Orientation";
/*  25 */   public static String SO_OriginalSize = "SO_OriginalSize";
/*  26 */   public static String SO_OriginalType = "SO_OriginalType";
/*  27 */   public static String SO_OutputColor = "SO_OutputColor";
/*  28 */   public static String SO_Quality = "SO_Quality";
/*  29 */   public static String SO_Resolution = "SO_Resolution";
/*  30 */   public static String SO_TwoSideScan = "SO_TwoSideScan";
/*  31 */   public static String SO_AutoOrientation = "SO_AutoOrientation";
/*  32 */   public static String SO_Descreen = "SO_Descreen";
/*  33 */   public static String SO_Colormatch = "SO_Colormatch";
/*  34 */   public static String SO_Gamma = "SO_Gamma";
/*  35 */   public static String SO_BackgroundRemove = "SO_BackgroundRemove";
/*  36 */   public static String SO_MoreBind = "SO_MoreBind";
/*     */ 
/*     */   
/*  39 */   public static String CO_ID = "CO_ID";
/*  40 */   public static String CO_BackSuppression = "CO_BackSuppression";
/*  41 */   public static String CO_BackSuppressionLevel = "CO_BackSuppressionLevel";
/*  42 */   public static String CO_BookCopy = "CO_BookCopy";
/*  43 */   public static String CO_BookMargin = "CO_BookMargin";
/*  44 */   public static String CO_CopyCount = "CO_CopyCount";
/*  45 */   public static String CO_CoverPage = "CO_CoverPage";
/*  46 */   public static String CO_Csa6Template = "CO_Csa6Template";
/*  47 */   public static String CO_CustomZoom = "CO_CustomZoom";
/*  48 */   public static String CO_PreviewCopy = "CO_PreviewCopy";
/*  49 */   public static String CO_RotateSide2 = "CO_RotateSide2";
/*  50 */   public static String CO_TonerSave = "CO_TonerSave";
/*  51 */   public static String CO_Watermark = "CO_Watermark";
/*  52 */   public static String CO_CopyOutput = "CO_CopyOutput";
/*  53 */   public static String CO_FolderName = "CO_FolderName";
/*  54 */   public static String CO_JobName = "CO_JobName";
/*  55 */   public static String CO_MediaType = "CO_MediaType";
/*  56 */   public static String CO_Operator = "CO_Operator";
/*  57 */   public static String CO_PageLayout = "CO_PageLayout";
/*  58 */   public static String CO_PaperSize = "CO_PaperSize";
/*  59 */   public static String CO_PaperTray = "CO_PaperTray";
/*  60 */   public static String CO_ReduceEnlarge = "CO_ReduceEnlarge";
/*  61 */   public static String CO_TrayForCoverPage = "CO_TrayForCoverPage";
/*  62 */   public static String CO_TwoSideCopy = "CO_TwoSideCopy";
/*  63 */   public static String CO_TrayOpen = "CO_TrayOpen";
/*  64 */   public static String CO_Quantity = "CO_Quantity";
/*  65 */   public static String CO_Auto_Fit = "CO_Auto_Fit";
/*  66 */   public static String CO_Merge = "CO_Merge";
/*  67 */   public static String CO_AutoContrast = "CO_AutoContrast";
/*  68 */   public static String CO_MixedModeHD = "CO_MixedModeHD";
/*  69 */   public static String CO_ExtraCopyCnt = "CO_ExtraCopyCnt";
/*     */ 
/*     */   
/*  72 */   public static String EO_ToList = "EO_ToList";
/*  73 */   public static String EO_CcList = "EO_CcList";
/*  74 */   public static String EO_BccList = "EO_BccList";
/*  75 */   public static String EO_G_ToList = "EO_G_ToList";
/*  76 */   public static String EO_G_CcList = "EO_G_CcList";
/*  77 */   public static String EO_G_BccList = "EO_G_BccList";
/*  78 */   public static String EO_Subject = "EO_Subject";
/*  79 */   public static String EO_Body = "EO_Body";
/*  80 */   public static String EO_From = "EO_From";
/*  81 */   public static String EO_Reply = "EO_Reply";
/*  82 */   public static String EO_Separation = "EO_Separation";
/*  83 */   public static String EO_ServerUrl = "EO_ServerUrl";
/*  84 */   public static String EO_Port = "EO_Port";
/*  85 */   public static String EO_LoginName = "EO_LoginName";
/*  86 */   public static String EO_Password = "EO_Password";
/*  87 */   public static String EO_EnableAuth = "EO_EnableAuth";
/*  88 */   public static String EO_EncryptType = "EO_EncryptType";
/*     */ 
/*     */   
/*  91 */   public static String SMTP_ServerUrl = "SMTP_URL";
/*  92 */   public static String SMTP_Port = "SMTP_Port";
/*  93 */   public static String SMTP_LoginName = "SMTP_LoginName";
/*  94 */   public static String SMTP_Password = "SMTP_Password";
/*  95 */   public static String SMTP_EnableAuth = "SMTP_Auth";
/*  96 */   public static String SMTP_EncryptType = "SMTP_Encrypt";
/*  97 */   public static String SMTP_Timeout = "SMTP_Timeout";
/*  98 */   public static String SMTP_ReplayTo = "SMTP_ReplayTo";
/*     */ 
/*     */   
/* 101 */   public static String FO_URL = "FO_URL";
/* 102 */   public static String FO_Port = "FO_Port";
/* 103 */   public static String FO_LoginName = "FO_LoginName";
/* 104 */   public static String FO_Password = "FO_Password";
/* 105 */   public static String FO_SubFolder = "FO_SubFolder";
/* 106 */   public static String FO_BSSL = "FO_BSSL";
/* 107 */   public static String FO_PassiveMode = "FO_PassiveMode";
/* 108 */   public static String FO_Overwrite = "FO_Overwrite";
/* 109 */   public static String FO_FolderName = "FO_FolderName";
/* 110 */   public static String FO_Protocol = "FO_Protocol";
/*     */ 
/*     */   
/* 113 */   public static String SJ_Source = "SJ_Source";
/* 114 */   public static String SJ_Operator = "SJ_Operator";
/* 115 */   public static String SJ_Name = "SJ_Name";
/* 116 */   public static String SJ_FileName = "SJ_FileName";
/* 117 */   public static String SJ_FolderName = "SJ_FolderName";
/* 118 */   public static String SJ_FolderPath = "SJ_FolderPath";
/* 119 */   public static String SJ_Password = "SJ_Password";
/* 120 */   public static String SJ_CopyCount = "SJ_CopyCount";
/* 121 */   public static String SJ_TwoSidedPrint = "SJ_TwoSidedPrint";
/* 122 */   public static String SJ_PaperTray = "SJ_PaperTray";
/*     */ 
/*     */   
/* 125 */   public static String P_PaperTray = "P_PaperTray";
/* 126 */   public static String P_PaperSize = "P_PaperSize";
/* 127 */   public static String P_MediaType = "P_MediaType";
/*     */ 
/*     */   
/* 130 */   public static String FAX_RedialInterval = "FAX_RedialInterval";
/* 131 */   public static String FAX_RedialCount = "FAX_RedialCount";
/* 132 */   public static String FAX_PhoneNumbers = "FAX_PhoneNumbers";
/* 133 */   public static String FAX_GroupPhoneNumbers = "FAX_GroupPhoneNumbers";
/*     */   
/* 135 */   public static String ACJ_JobList = "ACJ_JobList";
/*     */ 
/*     */   
/*     */   public static String parseActiveJobList(ArrayList<UIP_ActiveJobInfo> jobList) {
/* 139 */     JSONObject jsonObject = new JSONObject();
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
/* 150 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static ArrayList<UIP_ActiveJobInfo> parseActiveJobList(String jobList) {
/* 155 */     JSONObject jsonObject = new JSONObject();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\JsonConstant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */