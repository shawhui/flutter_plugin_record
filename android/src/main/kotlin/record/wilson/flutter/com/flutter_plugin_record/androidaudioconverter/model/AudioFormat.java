package record.wilson.flutter.com.flutter_plugin_record.androidaudioconverter.model;

public enum AudioFormat {
    AAC,
    MP3,
    M4A,
    WMA,
    WAV,
    FLAC;

    public String getFormat() {
        return name().toLowerCase();
    }
}