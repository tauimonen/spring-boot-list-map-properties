package dev.tau.listmapprops.map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookmarkPropertiesTest {

    @Autowired
    BookmarkProperties properties;

    @Test
    void websites() {
        Map<String, Website> websites = properties.websites();
        assertEquals(4, websites.size());
    }

    @Test
    void shouldGetBookmarkTau() {
        Map<String, Website> websites = properties.websites();
        Website website = websites.get("tau");
        assertEquals("https://www.tau.dev", website.url());
    }

    @Test
    void shouldGetSpringAcademy() {
        Map<String, Website> websites = properties.websites();
        Website website = websites.get("spring-academy");
        assertEquals("https://spring.academy", website.url());
    }

    @Test
    void shouldGetSpringIo() {
        Map<String, Website> websites = properties.websites();
        Website website = websites.get("spring-io");
        assertEquals("https://spring.io", website.url());
    }

    @Test
    void shouldGetSpringOne() {
        Map<String, Website> websites = properties.websites();
        Website website = websites.get("spring-one");
        assertEquals("https://springone.io", website.url());
    }


}