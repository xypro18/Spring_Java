
import com.spring.repository.CustomerRepository;
import com.spring.repository.HibernateCustomerRepositoryImpl;
import com.spring.service.CustomerService;
import com.spring.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@Configuration
@ComponentScan({"com.spring"})
@PropertySource("app.properties")
public class AppConfig {
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
//    @Bean(name = "customerService")
//    public CustomerService getCustomerService() {
//        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        CustomerServiceImpl service = new CustomerServiceImpl();
//        //service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }
   
//    @Bean(name = "customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new HibernateCustomerRepositoryImpl();
//    }
    
}
