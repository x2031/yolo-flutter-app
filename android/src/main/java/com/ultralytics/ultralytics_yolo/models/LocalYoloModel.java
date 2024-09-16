package com.ultralytics.ultralytics_yolo.models;

public class LocalYoloModel extends YoloModel {
    public final String cPath;
    public final String metadataPath;    
    public final byte[] byteCodeByte;

    public LocalYoloModel(String task, String format, String modelPath, String metadataPath, byte[] byteCodeByte) {
        super.task = task;
        super.format = format;
        this.modelPath = modelPath;
        this.metadataPath = metadataPath;
        this.byteCodeByte = byteCodeByte;
    }
}
