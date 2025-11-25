package com.ndduroc.rocmovies.config;

import com.ndduroc.rocmovies.entity.Customer;
import com.ndduroc.rocmovies.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerSeeder implements CommandLineRunner {

    private CustomerRepository customerRepo;

    public CustomerSeeder(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public void run(String... args) {
        if (customerRepo.count() == 0 ) {
            customerRepo.save(new Customer("Alice Dupont"));
            customerRepo.save(new Customer("Bob Martin"));
            customerRepo.save(new Customer("Claire Fournier"));
            customerRepo.save(new Customer("David Lambert"));
            customerRepo.save(new Customer("Emma Morel"));
            customerRepo.save(new Customer("Frank Bernard"));
            customerRepo.save(new Customer("Grace Petit"));
            customerRepo.save(new Customer("Hugo Girard"));
            customerRepo.save(new Customer("Isabelle Laurent"));
            customerRepo.save(new Customer("Julien Roux"));
            customerRepo.save(new Customer("Karine Vidal"));
            customerRepo.save(new Customer("Louis Perrin"));
            customerRepo.save(new Customer("Marie Colin"));
            customerRepo.save(new Customer("Nathan Robert"));
            customerRepo.save(new Customer("Oceane Duval"));
            customerRepo.save(new Customer("Paul Lefebvre"));
            customerRepo.save(new Customer("Quentin Marchand"));
            customerRepo.save(new Customer("Romain Fabre"));
            customerRepo.save(new Customer("Sarah Lopez"));
            customerRepo.save(new Customer("Thomas Leroy"));
            customerRepo.save(new Customer("Ulysse Fontaine"));
            customerRepo.save(new Customer("Valerie Breton"));
            customerRepo.save(new Customer("William Renault"));
            customerRepo.save(new Customer("Xavier Blanchard"));
            customerRepo.save(new Customer("Yasmine Duarte"));
            customerRepo.save(new Customer("Zoe Charpentier"));
            customerRepo.save(new Customer("Anthony Gerard"));
            customerRepo.save(new Customer("Beatrice Allard"));
            customerRepo.save(new Customer("Clement Giraud"));
            customerRepo.save(new Customer("Diane Poirier"));
        }
    }
}
