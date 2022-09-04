
# databinding
-keepclassmembers class * extends androidx.viewbinding.ViewBinding {
   public static * inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean);
   public static * inflate(android.view.LayoutInflater, android.view.ViewGroup);
   public static * bind(android.view.View);
}