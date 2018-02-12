# AndroidAppCalculation
 - This app is used for addition of two number.

## Tech stacks

- [`Android`](https://developer.android.com/index.html)
- JAVA
- GRADLE as Build tool
## What app can perfrom
1. Android app has icon 
2. Launch with Splash Screen
3. User can add two number


## 2.0 Setup
### Dev Setup 
* Download Android Studio(https://developer.android.com/studio/index.html)<br />
* Clone my repo (https://github.com/Trisha1212/AndroidAppCalculation)<br />
* Open project in Android Studio (https://github.com/dogriffiths/HeadFirstAndroid/wiki/How-to-open-a-project-in-Android-Studio)<br />
* Add github in version control (https://stackoverflow.com/questions/37093723/how-to-add-an-android-studio-project-to-github)<br />
* How to fix Gradle build sync failed (https://www.youtube.com/watch?v=8RwVvZtNTaM)<br />

### Android Activity Life Cycle
<img src="activity.jpg" width="500" />
* Understanding of Activity life cycle (https://www.tutorialspoint.com/android/android_acitivities.htm)<br />
-onCreate() :  first callback and called when the activity is first created.<br />
-onStart() :  callback is called when the activity becomes visible to the user.<br />
-onResume() :  called when the user starts interacting with the application.<br />
-onPause() : activity does not receive user input and cannot execute any code and called when the current activity is being paused and the previous activity is being resumed<br />
-onStop(): callback is called when the activity is no longer visible.<br />
-onDestroy(): callback is called before the activity is destroyed by the system.<br />
-onRestart(): when the activity restarts after stopping it.<br />


###  RUN 
How to run the app on emulator (https://developer.android.com/studio/run/emulator.html)<br />
How to run your app on real device (https://developer.android.com/training/basics/firstapp/running-app.html)


###  Folder Structure

- `App` : Main Folder
- `App - manifests` : `AndroidManifest.xml' :  Currently it include the activities only, it can have : services, broadcast receivers, and content providers that compose the application. It also names the classes that implement each of the components and publishes their capabilities, such as the Intent messages that they can handle. These declarations inform the Android system of the components and the conditions in which they can be launched.
- `App -java - com.example.trishachetani.wwcode - MainActivity` : 
* Currently : 
MainActivity : onCreate() : will have all the id of editText and button and onClick() : will add two number
- `App -java - com.example.trishachetani.wwcode - SplashActivity` : 
* How to add splash screen on App (https://www.bignerdranch.com/blog/splash-screens-the-right-way/)
* Currently splash Activity : 
```
 setContentView(R.layout.layout); // set the layout to be displayed 
new Handler().postDelayed(new Runnable() {
@Override
public void run() {
Intent i = new Intent(SplashActivity.this,MainActivity.class); // Intent is basically  used for operation to be performed(https://developer.android.com/guide/components/intents-filters.html)
startActivity(i);
finish();
}
 },1000);
 ````
- `App -java - res - drawable `: graphic that can be drawn to the screen (https://developer.android.com/guide/topics/resources/drawable-resource.html)
- `App -java - res - layout ` : A layout is a place where we define locators and evenvisual structure for a user interface
(https://developer.android.com/guide/topics/ui/declaring-layout.html)
- `App -java - res - mipmap ` : The mipmap folders are for placing your app/launcher icons (which are shown on the homescreen) in only. Any other drawable assets you use should be placed in the relevant drawable folders as before.
- `App -java - res - values ` : All the value are defined (https://developer.android.com/guide/topics/resources/available-resources.html)

- `Gradle Scripts` :  building the Apk

 ### Video of Running App
 ```
 https://www.dropbox.com/s/4w13fesup98d0af/AndroidAppCalculator.mov?dl=0
 ```
 ### APK :
 * how to install apk in your phone(https://stackoverflow.com/questions/4756451/how-to-install-an-apk-file-on-an-android-phone)
 ```
 https://www.dropbox.com/s/4gpf78hwenppvt5/app-release.apk?dl=0
 ```
 



