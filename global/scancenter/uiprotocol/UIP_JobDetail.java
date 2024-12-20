/*     */ package global.scancenter.uiprotocol;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import global.scancenter.commons.CopyOptions;
/*     */ import global.scancenter.commons.ScanOptions;
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
/*     */ public class UIP_JobDetail
/*     */   implements Parcelable, Cloneable
/*     */ {
/*     */   public int year;
/*     */   public int month;
/*     */   public int day;
/*     */   public int hour;
/*     */   public int minute;
/*     */   public int second;
/*     */   public int reserved;
/*  27 */   public int id = 0;
/*     */   
/*     */   public UIP_JobType type;
/*     */   
/*     */   public ScanOptions.SO_OriginalSize originalSize;
/*     */   
/*     */   public String jobName;
/*     */   
/*  35 */   public CopyOptions.CO_PaperTray paperTray = CopyOptions.CO_PaperTray.Tray1;
/*     */   
/*  37 */   public CopyOptions.CO_TwoSidedCopy twoSidedCopy = CopyOptions.CO_TwoSidedCopy.OneToOne;
/*     */   
/*     */   public boolean securityReceive;
/*     */   
/*  41 */   public CopyOptions.CO_MediaType mediaType = CopyOptions.CO_MediaType.Normal;
/*     */   
/*     */   public int retryCount;
/*     */   
/*     */   public int totalRecipients;
/*     */   
/*     */   public String phoneNumber;
/*     */   
/*     */   public int sendingTime;
/*     */   
/*     */   public String recipients;
/*     */   
/*     */   public int customWidth;
/*     */   
/*     */   public int customHeight;
/*     */   
/*     */   public String destination;
/*     */   
/*     */   public String totalPagesPrinting;
/*     */ 
/*     */   
/*     */   public UIP_JobDetail() {
/*  63 */     this.year = 2021;
/*  64 */     this.month = 1;
/*  65 */     this.day = 1;
/*  66 */     this.hour = 0;
/*  67 */     this.minute = 0;
/*  68 */     this.second = 0;
/*  69 */     this.reserved = 0;
/*  70 */     this.id = 0;
/*  71 */     this.type = UIP_JobType.COPY;
/*  72 */     this.originalSize = ScanOptions.SO_OriginalSize.AUTO;
/*  73 */     this.paperTray = CopyOptions.CO_PaperTray.AutoSelect;
/*  74 */     this.twoSidedCopy = CopyOptions.CO_TwoSidedCopy.OneToOne;
/*  75 */     this.securityReceive = false;
/*  76 */     this.mediaType = CopyOptions.CO_MediaType.Normal;
/*  77 */     this.retryCount = 0;
/*  78 */     this.totalRecipients = 0;
/*  79 */     this.phoneNumber = "";
/*  80 */     this.sendingTime = 0;
/*  81 */     this.recipients = "";
/*  82 */     this.customWidth = 0;
/*  83 */     this.customHeight = 0;
/*  84 */     this.destination = "";
/*     */   }
/*     */ 
/*     */   
/*     */   UIP_JobDetail(Parcel in) {
/*  89 */     this.year = in.readInt();
/*  90 */     this.month = in.readInt();
/*  91 */     this.day = in.readInt();
/*  92 */     this.hour = in.readInt();
/*  93 */     this.minute = in.readInt();
/*  94 */     this.second = in.readInt();
/*  95 */     this.reserved = in.readInt();
/*  96 */     this.id = in.readInt();
/*  97 */     this.type = UIP_JobType.valueOf(in.readString());
/*  98 */     this.originalSize = ScanOptions.SO_OriginalSize.valueOf(in.readString());
/*  99 */     this.jobName = in.readString();
/* 100 */     this.paperTray = CopyOptions.CO_PaperTray.valueOf(in.readString());
/* 101 */     this.twoSidedCopy = CopyOptions.CO_TwoSidedCopy.valueOf(in.readString());
/* 102 */     this.securityReceive = (in.readByte() == 1);
/* 103 */     this.mediaType = CopyOptions.CO_MediaType.valueOf(in.readString());
/* 104 */     this.retryCount = in.readInt();
/* 105 */     this.totalRecipients = in.readInt();
/* 106 */     this.phoneNumber = in.readString();
/* 107 */     this.sendingTime = in.readInt();
/* 108 */     this.recipients = in.readString();
/* 109 */     this.customWidth = in.readInt();
/* 110 */     this.customHeight = in.readInt();
/* 111 */     this.destination = in.readString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flags) {
/* 117 */     out.writeInt(this.year);
/* 118 */     out.writeInt(this.month);
/* 119 */     out.writeInt(this.day);
/* 120 */     out.writeInt(this.hour);
/* 121 */     out.writeInt(this.minute);
/* 122 */     out.writeInt(this.second);
/* 123 */     out.writeInt(this.reserved);
/* 124 */     out.writeInt(this.id);
/* 125 */     out.writeString((this.type == null) ? "" : this.type.name());
/* 126 */     out.writeString((this.originalSize == null) ? "" : this.originalSize.name());
/* 127 */     out.writeString(this.jobName);
/* 128 */     out.writeString((this.paperTray == null) ? "" : this.paperTray.name());
/* 129 */     out.writeString((this.twoSidedCopy == null) ? "" : this.twoSidedCopy.name());
/* 130 */     out.writeByte((byte)(this.securityReceive ? 1 : 0));
/* 131 */     out.writeString((this.mediaType == null) ? "" : this.mediaType.name());
/* 132 */     out.writeInt(this.retryCount);
/* 133 */     out.writeInt(this.totalRecipients);
/* 134 */     out.writeString(this.phoneNumber);
/* 135 */     out.writeInt(this.sendingTime);
/* 136 */     out.writeString(this.recipients);
/* 137 */     out.writeInt(this.customWidth);
/* 138 */     out.writeInt(this.customHeight);
/* 139 */     out.writeString(this.destination);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 145 */     return 0;
/*     */   }
/*     */   
/* 148 */   public static final Parcelable.Creator<UIP_JobDetail> CREATOR = new Parcelable.Creator<UIP_JobDetail>()
/*     */     {
/*     */       public UIP_JobDetail createFromParcel(Parcel p)
/*     */       {
/* 152 */         return new UIP_JobDetail(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public UIP_JobDetail[] newArray(int size) {
/* 157 */         return new UIP_JobDetail[size];
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/* 165 */     return super.clone();
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancente\\uiprotocol\UIP_JobDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */