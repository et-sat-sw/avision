/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.Arrays;
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
/*     */ public class SendOptions
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public JobCategory category;
/*     */   public SCDestination destination;
/*     */   public String fileName;
/*     */   public String[] to;
/*     */   public String[] cc;
/*     */   public String[] bcc;
/*     */   public String[] group_to;
/*     */   public String[] group_cc;
/*     */   public String[] group_bcc;
/*     */   public String[] attachments;
/*     */   public String from;
/*     */   public String reply;
/*     */   public String subject;
/*     */   public String body;
/*     */   public int separation;
/*     */   public int signature;
/*     */   public String signature_text;
/*     */   public MailServerInfo mailServerInfo;
/*     */   public String folderName;
/*     */   public int protocol;
/*     */   public String URL;
/*     */   public int port;
/*     */   public String loginName;
/*     */   public String password;
/*     */   public String subFolder;
/*     */   public Boolean bSSL;
/*     */   public Boolean passiveMode;
/*     */   public int overwrite;
/*     */   public String PIN;
/*     */   public int usageCount;
/*     */   public int confirmationReport;
/*     */   public Boolean bSMBv1;
/*     */   public Boolean bSMBv2;
/*     */   public Boolean bSMBv3;
/*     */   public int iNTLMVer;
/*     */   
/*     */   public SendOptions() {
/*  61 */     this.category = JobCategory.Default;
/*  62 */     this.destination = SCDestination.None;
/*  63 */     this.fileName = "Doc";
/*     */     
/*  65 */     this.to = null;
/*  66 */     this.cc = null;
/*  67 */     this.bcc = null;
/*  68 */     this.group_to = null;
/*  69 */     this.group_cc = null;
/*  70 */     this.group_bcc = null;
/*  71 */     this.attachments = null;
/*  72 */     this.from = "";
/*  73 */     this.reply = "";
/*  74 */     this.subject = "";
/*  75 */     this.body = "";
/*  76 */     this.separation = 65535;
/*  77 */     this.mailServerInfo = new MailServerInfo();
/*     */     
/*  79 */     this.folderName = "";
/*  80 */     this.protocol = 20;
/*  81 */     this.URL = "";
/*  82 */     this.port = 21;
/*  83 */     this.loginName = "";
/*  84 */     this.password = "";
/*  85 */     this.subFolder = "";
/*  86 */     this.bSSL = Boolean.valueOf(false);
/*  87 */     this.passiveMode = Boolean.valueOf(false);
/*     */ 
/*     */     
/*  90 */     this.overwrite = 1;
/*  91 */     this.PIN = "";
/*  92 */     this.usageCount = 0;
/*  93 */     this.bSMBv1 = Boolean.valueOf(true);
/*  94 */     this.bSMBv2 = Boolean.valueOf(true);
/*  95 */     this.bSMBv3 = Boolean.valueOf(true);
/*  96 */     this.iNTLMVer = 1;
/*     */   }
/*     */ 
/*     */   
/*     */   SendOptions(Parcel in) {
/* 101 */     this.id = in.readInt();
/* 102 */     this.category = JobCategory.valueOf(in.readString());
/* 103 */     this.destination = SCDestination.valueOf(in.readString());
/* 104 */     this.fileName = in.readString();
/* 105 */     this.to = in.createStringArray();
/* 106 */     this.cc = in.createStringArray();
/* 107 */     this.bcc = in.createStringArray();
/* 108 */     this.group_to = in.createStringArray();
/* 109 */     this.group_cc = in.createStringArray();
/* 110 */     this.group_bcc = in.createStringArray();
/* 111 */     this.attachments = in.createStringArray();
/* 112 */     this.from = in.readString();
/* 113 */     this.reply = in.readString();
/* 114 */     this.subject = in.readString();
/* 115 */     this.body = in.readString();
/* 116 */     this.separation = in.readInt();
/* 117 */     this.signature = in.readInt();
/* 118 */     this.signature_text = in.readString();
/* 119 */     this.mailServerInfo = (MailServerInfo)in.readParcelable(MailServerInfo.class.getClassLoader());
/*     */     
/* 121 */     this.folderName = in.readString();
/* 122 */     this.protocol = in.readInt();
/* 123 */     this.URL = in.readString();
/* 124 */     this.port = in.readInt();
/* 125 */     this.loginName = in.readString();
/* 126 */     this.password = in.readString();
/* 127 */     this.subFolder = in.readString();
/* 128 */     this.bSSL = Boolean.valueOf((in.readByte() != 0));
/* 129 */     this.passiveMode = Boolean.valueOf((in.readByte() != 0));
/*     */ 
/*     */     
/* 132 */     this.overwrite = in.readInt();
/* 133 */     this.PIN = in.readString();
/* 134 */     this.usageCount = in.readInt();
/* 135 */     this.confirmationReport = in.readInt();
/* 136 */     this.bSMBv1 = Boolean.valueOf((in.readByte() != 0));
/* 137 */     this.bSMBv2 = Boolean.valueOf((in.readByte() != 0));
/* 138 */     this.bSMBv3 = Boolean.valueOf((in.readByte() != 0));
/* 139 */     this.iNTLMVer = in.readInt();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 148 */     String log = "[ScanOptions]\ndestination:" + this.destination.getCode() + ", fileName:" + this.fileName + ", to:" + Arrays.toString((Object[])this.to) + ", cc:" + Arrays.toString((Object[])this.cc) + ", bcc:" + Arrays.toString((Object[])this.bcc) + ", attachments:" + Arrays.toString((Object[])this.attachments) + ", from:" + this.from + ", reply:" + this.reply + ", subject:" + this.subject + ", body:" + this.body + ", separation:" + this.separation + ", protocol:" + this.protocol + ", URL:" + this.URL + ", port:" + this.port + ", loginName:" + this.loginName + ", password:" + this.password + ", subFolder:" + this.subFolder + ", passiveMode:" + this.passiveMode + ", overwrite:" + this.overwrite + ", usageCount:" + this.usageCount;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     return log;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flag) {
/* 161 */     out.writeInt(this.id);
/* 162 */     out.writeString((this.category == null) ? "" : this.category.name());
/* 163 */     out.writeString((this.destination == null) ? "" : this.destination.name());
/* 164 */     out.writeString(this.fileName);
/* 165 */     out.writeStringArray(this.to);
/* 166 */     out.writeStringArray(this.cc);
/* 167 */     out.writeStringArray(this.bcc);
/* 168 */     out.writeStringArray(this.group_to);
/* 169 */     out.writeStringArray(this.group_cc);
/* 170 */     out.writeStringArray(this.group_bcc);
/* 171 */     out.writeStringArray(this.attachments);
/* 172 */     out.writeString(this.from);
/* 173 */     out.writeString(this.reply);
/* 174 */     out.writeString(this.subject);
/* 175 */     out.writeString(this.body);
/* 176 */     out.writeInt(this.separation);
/* 177 */     out.writeInt(this.signature);
/* 178 */     out.writeString(this.signature_text);
/* 179 */     out.writeParcelable(this.mailServerInfo, flag);
/*     */     
/* 181 */     out.writeString(this.folderName);
/* 182 */     out.writeInt(this.protocol);
/* 183 */     out.writeString(this.URL);
/* 184 */     out.writeInt(this.port);
/* 185 */     out.writeString(this.loginName);
/* 186 */     out.writeString(this.password);
/* 187 */     out.writeString(this.subFolder);
/* 188 */     out.writeByte((byte)(this.bSSL.booleanValue() ? 1 : 0));
/* 189 */     out.writeByte((byte)(this.passiveMode.booleanValue() ? 1 : 0));
/*     */ 
/*     */     
/* 192 */     out.writeInt(this.overwrite);
/* 193 */     out.writeString(this.PIN);
/* 194 */     out.writeInt(this.usageCount);
/* 195 */     out.writeInt(this.confirmationReport);
/* 196 */     out.writeByte((byte)(this.bSMBv1.booleanValue() ? 1 : 0));
/* 197 */     out.writeByte((byte)(this.bSMBv2.booleanValue() ? 1 : 0));
/* 198 */     out.writeByte((byte)(this.bSMBv3.booleanValue() ? 1 : 0));
/* 199 */     out.writeInt(this.iNTLMVer);
/*     */   }
/*     */   
/* 202 */   public static final Parcelable.Creator<SendOptions> CREATOR = new Parcelable.Creator<SendOptions>()
/*     */     {
/*     */       public SendOptions createFromParcel(Parcel p)
/*     */       {
/* 206 */         return new SendOptions(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public SendOptions[] newArray(int size) {
/* 211 */         return new SendOptions[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 218 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 225 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\SendOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */