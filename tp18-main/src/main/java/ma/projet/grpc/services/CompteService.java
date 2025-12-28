package ma.projet.grpc.services;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.repositories.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {
    
    private final CompteRepository compteRepository;
    
    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }
    
    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }
    
    public Compte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }
    
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }
    
    public boolean deleteCompte(String id) {
        if (compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            return true;
        }
        return false;
    }
    
    public long countComptes() {
        return compteRepository.count();
    }
    
    public double sumSoldes() {
        return compteRepository.findAll().stream()
                .mapToDouble(Compte::getSolde)
                .sum();
    }
    
    public double averageSolde() {
        return compteRepository.findAll().stream()
                .mapToDouble(Compte::getSolde)
                .average()
                .orElse(0.0);
    }
}
