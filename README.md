# FlutterToastAlert

Flutter plugin which shows a custom toast message on Android (https://github.com/GrenderG/Toasty) and custom alert message on iOS (https://github.com/vikmeup/SCLAlertView-Swift)

Github: https://github.com/roh-it/FlutterToastAlertPlugin

## Steps to install

Add fluttertoastalert: ^1.0.1 under dependencies in your pubspec.yaml file

To use the plugin, add this line to where the toast or alert must be displayed

    FlutterToastAlert.showToastAndAlert(type: Type.Success,iosTitle: "Wow",iosSubtitle: "It Works",androidToast: "It Works",toastDuration: 3,toastShowIcon: true);
    FlutterToastAlert.showToastAndAlert(type: Type.Error,iosTitle: "Error",iosSubtitle: "Doesn't work",androidToast: "Doesn't work",toastDuration: 3,toastShowIcon: true);
    FlutterToastAlert.showToastAndAlert(type: Type.Warning,iosTitle: "Warning",iosSubtitle: "Warning message",androidToast: "Warning message",toastDuration: 3,toastShowIcon: true);
    FlutterToastAlert.showToastAndAlert(type: Type.Info,iosTitle: "Info",iosSubtitle: "Information",androidToast: "Information",toastDuration: 3,toastShowIcon: true);
    FlutterToastAlert.showToastAndAlert(type: Type.Normal,iosTitle: "Normal",iosSubtitle: "Normal Message",androidToast: "Normal Message",toastDuration: 3,toastShowIcon: true);




![image](https://user-images.githubusercontent.com/32352599/89412263-62968100-d744-11ea-8218-4b575bfbbb0a.png)
![image](https://user-images.githubusercontent.com/32352599/89412893-75f61c00-d745-11ea-9d15-d2d08ad9788b.png)



