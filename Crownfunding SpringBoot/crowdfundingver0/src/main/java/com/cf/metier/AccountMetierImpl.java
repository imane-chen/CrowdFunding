/*
 * package com.cf.metier;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.cf.dao.PorteurProjetRepository; import com.cf.dao.RoleRepository;
 * import com.cf.entities.AppRole; import com.cf.entities.porteurProjet;
 * 
 * @Service
 * 
 * @Transactional public class AccountMetierImpl implements AccountMetier{
 * 
 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
 * 
 * @Autowired private PorteurProjetRepository porteurProjetRepository;
 * 
 * @Autowired private RoleRepository roleRepository;
 * 
 * @Override public porteurProjet savePorteur(porteurProjet porteur) { String
 * hashPW = bCryptPasswordEncoder.encode(porteur.getPassword());
 * porteur.setPassword(hashPW); return porteurProjetRepository.save(porteur); }
 * 
 * @Override public AppRole saveRole(AppRole role) { return
 * roleRepository.save(role); }
 * 
 * @Override public void addRoleToPorteur(String username, String roleName) {
 * AppRole role = roleRepository.findByRoleName(roleName); porteurProjet porteur
 * = porteurProjetRepository.findByUsername(username);
 * porteur.getRoles().add(role);
 * 
 * }
 * 
 * @Override public porteurProjet findPorteurByUsername(String username) {
 * return porteurProjetRepository.findByUsername(username); }
 * 
 * }
 */