## 0.0.1

* Initial Release
    
    To use the plugin, add the following to pubspec.yaml file of your flutter application
        
            fluttertoastalert: ^0.0.1
    
    Run Packages get
    
    Then you can use the plugin as
    
            FlutterToastAlert.showToastAndAlert(type: Type.Success,iosTitle: "Wow",iosSubtitle: "It Works",androidToast: "It Works",toastDuration: 3,toastShowIcon: true);
