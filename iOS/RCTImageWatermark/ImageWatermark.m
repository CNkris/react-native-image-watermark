//
//  ImageWatermark.m
//  RCTImageWatermark
//
//  Created by 陈远 on 2020/5/19.
//  Copyright © 2020 Facebook. All rights reserved.
//

#import "ImageWatermark.h"

@implementation ImageWatermark

RCT_EXPORT_MODULE(ImageWatermark)

RCT_EXPORT_METHOD(addWatermark:(NSDictionary *)params callback:(RCTResponseSenderBlock)callback)
{
    NSString srcImg=[[params objectForKey:@"src"] stringValue];
    NSString watermarkStr=[[params objectForKey:@"watermarkStr"] stringValue];
    NSString location=[[params objectForKey:@"location"] stringValue];
    //补充图片加水印方法
  
    NSString * distImg = @"";
    NSArray *resultArray = @[distImg];
    callback(resultArray);
}

@end
