/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.ultimateAlpr.Sdk;

public class UltAlprSdkEngine {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected UltAlprSdkEngine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UltAlprSdkEngine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ultimateAlprSdkJNI.delete_UltAlprSdkEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static UltAlprSdkResult init(Object assetManager, String jsonConfig, UltAlprSdkParallelDeliveryCallback parallelDeliveryCallback) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_init__SWIG_0(assetManager, jsonConfig, UltAlprSdkParallelDeliveryCallback.getCPtr(parallelDeliveryCallback), parallelDeliveryCallback), true);
  }

  public static UltAlprSdkResult init(Object assetManager, String jsonConfig) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_init__SWIG_1(assetManager, jsonConfig), true);
  }

  public static UltAlprSdkResult init(Object assetManager) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_init__SWIG_2(assetManager), true);
  }

  public static UltAlprSdkResult deInit() {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_deInit(), true);
  }

  public static UltAlprSdkResult process(ULTALPR_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples, long imageStrideInSamples, int imageExifOrientation) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_process__SWIG_0(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples, imageStrideInSamples, imageExifOrientation), true);
  }

  public static UltAlprSdkResult process(ULTALPR_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples, long imageStrideInSamples) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_process__SWIG_1(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples, imageStrideInSamples), true);
  }

  public static UltAlprSdkResult process(ULTALPR_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer imageData, long imageWidthInSamples, long imageHeightInSamples) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_process__SWIG_2(imageType.swigValue(), imageData, imageWidthInSamples, imageHeightInSamples), true);
  }

  public static UltAlprSdkResult process(ULTALPR_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes, long uvPixelStrideInBytes, int exifOrientation) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_process__SWIG_3(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes, uvPixelStrideInBytes, exifOrientation), true);
  }

  public static UltAlprSdkResult process(ULTALPR_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes, long uvPixelStrideInBytes) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_process__SWIG_4(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes, uvPixelStrideInBytes), true);
  }

  public static UltAlprSdkResult process(ULTALPR_SDK_IMAGE_TYPE imageType, java.nio.ByteBuffer yPtr, java.nio.ByteBuffer uPtr, java.nio.ByteBuffer vPtr, long widthInSamples, long heightInSamples, long yStrideInBytes, long uStrideInBytes, long vStrideInBytes) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_process__SWIG_5(imageType.swigValue(), yPtr, uPtr, vPtr, widthInSamples, heightInSamples, yStrideInBytes, uStrideInBytes, vStrideInBytes), true);
  }

  public static int exifOrientation(java.nio.ByteBuffer jpegMetaDataPtr, long jpegMetaDataSize) {
    return ultimateAlprSdkJNI.UltAlprSdkEngine_exifOrientation(jpegMetaDataPtr, jpegMetaDataSize);
  }

  public static UltAlprSdkResult requestRuntimeLicenseKey(boolean rawInsteadOfJSON) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_requestRuntimeLicenseKey__SWIG_0(rawInsteadOfJSON), true);
  }

  public static UltAlprSdkResult requestRuntimeLicenseKey() {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_requestRuntimeLicenseKey__SWIG_1(), true);
  }

  public static UltAlprSdkResult warmUp(ULTALPR_SDK_IMAGE_TYPE imageType) {
    return new UltAlprSdkResult(ultimateAlprSdkJNI.UltAlprSdkEngine_warmUp(imageType.swigValue()), true);
  }

}
