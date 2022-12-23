package ru.krasnoperov.course.alishev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.krasnoperov.course.alishev")
@PropertySource("classpath:musicPlayer.properties")
public class ConfigSpring {

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer();
    }

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }


    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }
}
