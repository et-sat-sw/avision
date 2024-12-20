/*     */ package global.scancenter.commons;
/*     */ 
/*     */ import android.os.Environment;
/*     */ import android.util.Log;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileReader;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class StorageUtils
/*     */ {
/*     */   private static final String TAG = "StorageUtils";
/*     */   
/*     */   public static class StorageInfo
/*     */   {
/*     */     public final String path;
/*     */     public final boolean readonly;
/*     */     public final boolean removable;
/*     */     public final int number;
/*     */     
/*     */     StorageInfo(String path, boolean readonly, boolean removable, int number) {
/*  31 */       this.path = path;
/*  32 */       this.readonly = readonly;
/*  33 */       this.removable = removable;
/*  34 */       this.number = number;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getDisplayName() {
/*  39 */       StringBuilder res = new StringBuilder();
/*  40 */       if (!this.removable) {
/*     */         
/*  42 */         res.append("Internal SD card");
/*     */       }
/*  44 */       else if (this.number > 1) {
/*     */         
/*  46 */         res.append("SD card " + this.number);
/*     */       }
/*     */       else {
/*     */         
/*  50 */         res.append("SD card");
/*     */       } 
/*  52 */       if (this.readonly)
/*     */       {
/*  54 */         res.append(" (Read only)");
/*     */       }
/*  56 */       return res.toString();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<StorageInfo> getStorageList() {
/*  63 */     List<StorageInfo> list = new ArrayList<StorageInfo>();
/*  64 */     String def_path = Environment.getExternalStorageDirectory().getPath();
/*  65 */     boolean def_path_removable = Environment.isExternalStorageRemovable();
/*  66 */     String def_path_state = Environment.getExternalStorageState();
/*     */     
/*  68 */     boolean def_path_available = (def_path_state.equals("mounted") || def_path_state.equals("mounted_ro"));
/*  69 */     boolean def_path_readonly = Environment.getExternalStorageState().equals("mounted_ro");
/*     */ 
/*     */     
/*  72 */     HashSet<String> paths = new HashSet<String>();
/*  73 */     int cur_removable_number = 1;
/*     */     
/*  75 */     if (def_path_available) {
/*     */       
/*  77 */       paths.add(def_path);
/*  78 */       list.add(0, new StorageInfo(def_path, def_path_readonly, def_path_removable, def_path_removable ? cur_removable_number++ : -1));
/*     */     } 
/*     */ 
/*     */     
/*  82 */     BufferedReader buf_reader = null;
/*     */     
/*     */     try {
/*  85 */       buf_reader = new BufferedReader(new FileReader("/proc/mounts"));
/*     */       
/*  87 */       Log.d("StorageUtils", "/proc/mounts"); String line;
/*  88 */       while ((line = buf_reader.readLine()) != null)
/*     */       {
/*  90 */         Log.d("StorageUtils", line);
/*  91 */         if (line.contains("vfat") || line.contains("/mnt"))
/*     */         {
/*  93 */           StringTokenizer tokens = new StringTokenizer(line, " ");
/*  94 */           String unused = tokens.nextToken();
/*  95 */           String mount_point = tokens.nextToken();
/*  96 */           if (paths.contains(mount_point)) {
/*     */             continue;
/*     */           }
/*     */           
/* 100 */           unused = tokens.nextToken();
/* 101 */           List<String> flags = Arrays.asList(tokens.nextToken().split(","));
/* 102 */           boolean readonly = flags.contains("ro");
/*     */           
/* 104 */           if (line.contains("/dev/block/vold"))
/*     */           {
/* 106 */             if (!line.contains("/mnt/secure") && !line.contains("/mnt/asec") && 
/* 107 */               !line.contains("/mnt/obb") && 
/* 108 */               !line.contains("/dev/mapper") && !line.contains("tmpfs"))
/*     */             {
/* 110 */               paths.add(mount_point);
/* 111 */               list.add(new StorageInfo(mount_point, readonly, true, cur_removable_number++));
/*     */             }
/*     */           
/*     */           }
/*     */         }
/*     */       
/*     */       }
/*     */     
/* 119 */     } catch (FileNotFoundException ex) {
/*     */       
/* 121 */       ex.printStackTrace();
/*     */     }
/* 123 */     catch (IOException ex) {
/*     */       
/* 125 */       ex.printStackTrace();
/*     */     }
/*     */     finally {
/*     */       
/* 129 */       if (buf_reader != null) {
/*     */         
/*     */         try {
/*     */           
/* 133 */           buf_reader.close();
/*     */         }
/* 135 */         catch (IOException iOException) {}
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 140 */     return list;
/*     */   }
/*     */ }


/* Location:              D:\commons.jar!\global\scancenter\commons\StorageUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */