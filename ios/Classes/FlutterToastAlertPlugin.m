#import "FlutterToastAlertPlugin.h"
#if __has_include(<fluttertoastalert/fluttertoastalert-Swift.h>)
#import <fluttertoastalert/fluttertoastalert-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "fluttertoastalert-Swift.h"
#endif

@implementation FlutterToastAlert
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [FlutterToastAlertPlugin registerWithRegistrar:registrar];
}
@end
