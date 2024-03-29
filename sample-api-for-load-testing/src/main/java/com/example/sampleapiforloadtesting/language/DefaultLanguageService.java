package com.example.sampleapiforloadtesting.language;

import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class DefaultLanguageService implements LanguageService {
    @Override
    public List<Language> getLanguages() {
        return asList(
            new Language("Java", "JVM"),
            new Language("Kotlin", "JVM"),
            new Language("Scala", "JVM")
        );
    }
}
