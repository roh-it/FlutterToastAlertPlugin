import Flutter
import UIKit
import SCLAlertView

public class FlutterToastAlertPlugin: NSObject, FlutterPlugin {
  public static func register(with registrar: FlutterPluginRegistrar) {
    let channel = FlutterMethodChannel(name: "fluttertoastalert", binaryMessenger: registrar.messenger())
    let instance = FlutterToastAlertPlugin()
    registrar.addMethodCallDelegate(instance, channel: channel)
  }

  public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
    if(call.method.elementsEqual("showToastAndAlert")){
        let args = call.arguments as?[String:Any]
        guard let  alert_type = args?["type"] as? String else {return}
        guard let  title = args?["ios_title"] as? String else {return}
        guard let  subtitle = args?["ios_subtitle"] as? String else {return }
        switch alert_type{
        case "Info":
            SCLAlertView().showInfo(title , subTitle: subtitle)
        case "Success":
            SCLAlertView().showSuccess(title , subTitle: subtitle)
        case "Warning":
            SCLAlertView().showWarning(title , subTitle: subtitle)
        case "Error":
            SCLAlertView().showError(title , subTitle: subtitle)
        case "Normal":
            SCLAlertView().showNotice(title , subTitle: subtitle)
        default:
            SCLAlertView().showNotice(title , subTitle: subtitle)
        }
        
    }
  }
}


