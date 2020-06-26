package me.home;

import java.time.Duration;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import me.home.model.Category;
import me.home.repository.CategorytRepository;

@SpringBootApplication
@EnableR2dbcRepositories
public class AppStarter
{

    private static final Logger log = LoggerFactory.getLogger( AppStarter.class );

    public static void main( String[] args )
    {
        SpringApplication.run( AppStarter.class, args );
    }

    @Bean
    public CommandLineRunner demo( CategorytRepository repository )
    {

        return ( args ) ->
        {
            // save a few customers
            repository.saveAll( Arrays.asList( new Category( "Test1" ), new Category( "Test2" ) ) ).blockLast( Duration.ofSeconds( 10 ) );

            log.info( "Insert Category done" );
        };

    }
}
