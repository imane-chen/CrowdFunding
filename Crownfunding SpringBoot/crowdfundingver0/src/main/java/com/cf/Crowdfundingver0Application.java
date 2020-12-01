package com.cf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)

//@ComponentScan({"com.delivery.request"})
//@EntityScan("com.delivery.domain")
//@EnableJpaRepositories("com.delivery.repository")


public class Crowdfundingver0Application {

//	@Autowired
//	private AccountMetier accountMetier;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Crowdfundingver0Application.class, args);
	}
//
//	@Bean
//	public BCryptPasswordEncoder getBCPE() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	public void run(String... arg0)throws Exception {
//		accountMetier.savePorteur(new porteurProjet(null, null, null, null, null, null, null, "admin", "123", null));
//		accountMetier.savePorteur(new porteurProjet(null, null, null, null, null, null, null, "user", "123", null));
//		accountMetier.saveRole(new AppRole(null,"ADMIN"));
//		accountMetier.saveRole(new AppRole(null,"USER"));
//		accountMetier.addRoleToPorteur("admin", "ADMIN");
//		accountMetier.addRoleToPorteur("user", "USER");
//	}
}
