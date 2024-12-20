/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EmailOptions
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int id;
/*     */   public int category;
/*     */   public String operator;
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
/*     */   public MailServerInfo mailServerInfo;
/*     */   public String signature;
/*     */   public int confirmationReport;
/*     */   
/*     */   public EmailOptions() {
/*  34 */     this.category = 0;
/*  35 */     this.fileName = "Doc";
/*     */     
/*  37 */     this.to = new String[0];
/*  38 */     this.cc = new String[0];
/*  39 */     this.bcc = new String[0];
/*  40 */     this.group_to = new String[0];
/*  41 */     this.group_cc = new String[0];
/*  42 */     this.group_bcc = new String[0];
/*  43 */     this.attachments = new String[0];
/*  44 */     this.from = "";
/*  45 */     this.reply = "";
/*  46 */     this.subject = "";
/*  47 */     this.body = "";
/*  48 */     this.separation = 65535;
/*  49 */     this.mailServerInfo = new MailServerInfo();
/*  50 */     this.signature = "";
/*     */   }
/*     */ 
/*     */   
/*     */   EmailOptions(Parcel in) {
/*  55 */     this.id = in.readInt();
/*  56 */     this.operator = in.readString();
/*  57 */     this.fileName = in.readString();
/*  58 */     this.to = in.createStringArray();
/*  59 */     this.cc = in.createStringArray();
/*  60 */     this.bcc = in.createStringArray();
/*  61 */     this.group_to = in.createStringArray();
/*  62 */     this.group_cc = in.createStringArray();
/*  63 */     this.group_bcc = in.createStringArray();
/*  64 */     this.attachments = in.createStringArray();
/*  65 */     this.from = in.readString();
/*  66 */     this.reply = in.readString();
/*  67 */     this.subject = in.readString();
/*  68 */     this.body = in.readString();
/*  69 */     this.separation = in.readInt();
/*  70 */     this.mailServerInfo = (MailServerInfo)in.readParcelable(MailServerInfo.class.getClassLoader());
/*  71 */     this.signature = in.readString();
/*  72 */     this.confirmationReport = in.readInt();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flag) {
/*  78 */     out.writeInt(this.id);
/*  79 */     out.writeString(this.operator);
/*  80 */     out.writeString(this.fileName);
/*  81 */     out.writeStringArray(this.to);
/*  82 */     out.writeStringArray(this.cc);
/*  83 */     out.writeStringArray(this.bcc);
/*  84 */     out.writeStringArray(this.group_to);
/*  85 */     out.writeStringArray(this.group_cc);
/*  86 */     out.writeStringArray(this.group_bcc);
/*  87 */     out.writeStringArray(this.attachments);
/*  88 */     out.writeString(this.from);
/*  89 */     out.writeString(this.reply);
/*  90 */     out.writeString(this.subject);
/*  91 */     out.writeString(this.body);
/*  92 */     out.writeInt(this.separation);
/*  93 */     out.writeParcelable(this.mailServerInfo, flag);
/*  94 */     out.writeString(this.signature);
/*  95 */     out.writeInt(this.confirmationReport);
/*     */   }
/*     */   
/*  98 */   public static final Parcelable.Creator<EmailOptions> CREATOR = new Parcelable.Creator<EmailOptions>()
/*     */     {
/*     */       public EmailOptions createFromParcel(Parcel p)
/*     */       {
/* 102 */         return new EmailOptions(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public EmailOptions[] newArray(int size) {
/* 107 */         return new EmailOptions[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 114 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 121 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\EmailOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */