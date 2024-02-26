package dev.tau.listmapprops.map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties("bookmarks")
public record BookmarkProperties(Map<String, Website> websites) {
}
