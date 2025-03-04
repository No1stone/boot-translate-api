package api.translate.api.boottranslateapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
public class DeeplTranslateRequest {

    @JsonProperty("auth_key")
    private String authKey;

    @JsonProperty("text")
    private String text;

    @JsonProperty("source_lang")
    private String sourceLang;

    @JsonProperty("target_lang")
    private String targetLang;

    public DeeplTranslateRequest(String authKey, String text, String sourceLang, String targetLang) {
        this.authKey = authKey;
        this.text = text;
        this.sourceLang = sourceLang.toUpperCase();
        this.targetLang = targetLang.toUpperCase();
    }

    // Getter 생략 가능 (롬복 사용 시 @Getter 어노테이션 추가 가능)
}
