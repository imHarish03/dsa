package dsa.pattern.exercise.demo3;

public class AVIDecoderAdapter implements VideoFormat {
    private LegacyAVIPlayer legacyAVIPlayer;

    public AVIDecoderAdapter(LegacyAVIPlayer legacyAVIPlayer) {
        this.legacyAVIPlayer = legacyAVIPlayer;
    }

    @Override
    public String getFormat() {
        return "";
    }
}
