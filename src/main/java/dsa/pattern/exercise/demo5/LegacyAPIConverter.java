package dsa.pattern.exercise.demo5;

public class LegacyAPIConverter implements ResponseData{

    private final LegacyAPI legacyAPI;

    public LegacyAPIConverter(LegacyAPI legacyAPI) {
        this.legacyAPI = legacyAPI;
    }

    @Override
    public String getResponseInJSON() {
        return legacyAPI.getResponseInXML();
    }
}
