package com.example.sampleapiforloadtesting.language;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("lang")
public class LanguageController {
    private LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("random")
    public List<Language> getAllRandom() throws InterruptedException {
        int zeroToFiveSeconds = ThreadLocalRandom.current().nextInt(0, 5000);
        Thread.sleep(zeroToFiveSeconds);

        return languageService.getLanguages();
    }

    @GetMapping("fast")
    public List<Language> getAllFast() throws InterruptedException {
        return languageService.getLanguages();
    }

    @GetMapping("slow")
    public List<Language> getAllSlow() throws InterruptedException {
        int tenSeconds = 10000;
        Thread.sleep(tenSeconds);

        return languageService.getLanguages();
    }
}
