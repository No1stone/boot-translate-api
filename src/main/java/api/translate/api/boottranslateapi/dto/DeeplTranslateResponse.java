package api.translate.api.boottranslateapi.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeeplTranslateResponse {

    @JsonProperty("translations")
    private List<Translation> translations;

    public String getTranslatedText() {
        return translations.get(0).translatedText;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Translation {
        @JsonProperty("text")
        private String translatedText;
    }
}
