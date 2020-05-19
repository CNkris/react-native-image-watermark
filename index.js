var ImageWatermark = require('react-native').NativeModules.ImageWatermark;

module.exports = {
    addWatermark(params: { src: string, watermarkStr: string, location: string }, cb: (distImg: string)=>void): void {
        ImageWatermark.addWatermark(params, cb);
    }
}
