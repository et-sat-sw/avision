/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.annotation.SuppressLint;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ public class SCJob
/*     */   implements Parcelable
/*     */ {
/*  15 */   private static int gCount = 0;
/*     */   
/*     */   public long id;
/*     */   
/*     */   public JobStatus status;
/*     */   
/*     */   public JobType type;
/*     */   public ScanOptions scanOptions;
/*     */   public SendOptions sendOptions;
/*     */   public List<WorkItems> workList;
/*     */   public ArrayList<FileInfo> fileList;
/*     */   public List<String> thumbList;
/*     */   
/*     */   @SuppressLint({"SimpleDateFormat"})
/*     */   public SCJob() {
/*  30 */     SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
/*  31 */     this.id = Long.parseLong(sdf.format(new Date()) + String.format("%06d", new Object[] { Integer.valueOf(gCount++) }));
/*  32 */     this.status = JobStatus.SCHEDULED;
/*  33 */     this.type = JobType.CUSTOM;
/*  34 */     this.scanOptions = new ScanOptions();
/*  35 */     this.sendOptions = new SendOptions();
/*  36 */     this.workList = new ArrayList<WorkItems>();
/*  37 */     this.fileList = new ArrayList<FileInfo>();
/*  38 */     this.thumbList = new ArrayList<String>();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   SCJob(Parcel in) {
/*  44 */     this.id = in.readLong();
/*  45 */     this.status = JobStatus.valueOf(in.readString());
/*  46 */     this.type = JobType.valueOf(in.readString());
/*  47 */     this.scanOptions = (ScanOptions)in.readParcelable(ScanOptions.class.getClassLoader());
/*  48 */     this.sendOptions = (SendOptions)in.readParcelable(SendOptions.class.getClassLoader());
/*  49 */     this.workList = new ArrayList<WorkItems>();
/*  50 */     in.readList(this.workList, null);
/*     */     
/*  52 */     this.fileList = in.readArrayList(FileInfo.class.getClassLoader());
/*  53 */     this.thumbList = new ArrayList<String>();
/*  54 */     in.readList(this.thumbList, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel out, int flag) {
/*  60 */     out.writeLong(this.id);
/*  61 */     out.writeString((this.status == null) ? "" : this.status.name());
/*  62 */     out.writeString((this.type == null) ? "" : this.type.name());
/*  63 */     out.writeParcelable(this.scanOptions, flag);
/*  64 */     out.writeParcelable(this.sendOptions, flag);
/*  65 */     out.writeList(this.workList);
/*  66 */     out.writeList(this.fileList);
/*  67 */     out.writeList(this.thumbList);
/*     */   }
/*     */   
/*  70 */   public static final Parcelable.Creator<SCJob> CREATOR = new Parcelable.Creator<SCJob>()
/*     */     {
/*     */       public SCJob createFromParcel(Parcel p)
/*     */       {
/*  74 */         return new SCJob(p);
/*     */       }
/*     */ 
/*     */       
/*     */       public SCJob[] newArray(int size) {
/*  79 */         return new SCJob[size];
/*     */       }
/*     */     };
/*     */   
/*     */   public enum JobStatus
/*     */   {
/*  85 */     SCHEDULED, SCANNING, PRINTING, SENDING, ABORTED, COMPLETED, PAUSED;
/*     */   }
/*     */   
/*     */   public enum JobType
/*     */   {
/*  90 */     COPY, EMAIL, FILING, DROP_N_TAKE, REMOTE_PRINT, REMOTE_SCAN, CUSTOM;
/*     */   }
/*     */   
/*     */   public enum WorkItems
/*     */   {
/*  95 */     SCAN, IMAGE_PROCESS, FILE_PACK, PRINT, EMAIL, FTP, CIFS, USB, HD, APPSEND, PREVIEW;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 101 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getId() {
/* 106 */     return this.id;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\SCJob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */