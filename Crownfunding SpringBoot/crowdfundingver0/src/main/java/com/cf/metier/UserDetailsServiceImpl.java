/*
 * package com.cf.metier;
 * 
 * import java.util.ArrayList; import java.util.Collection;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.cf.entities.AppRole; import com.cf.entities.porteurProjet;
 * 
 * @Service public class UserDetailsServiceImpl implements UserDetailsService{
 * 
 * @Autowired private AccountMetier accountMetier;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { porteurProjet porteur =
 * accountMetier.findPorteurByUsername(username); if(porteur==null) throw new
 * UsernameNotFoundException(username); Collection<GrantedAuthority> authorities
 * = new ArrayList<>(); porteur.getRoles().forEach(r->{ authorities.add(new
 * SimpleGrantedAuthority(((AppRole) r).getRoleName())); }); return new
 * User(porteur.getUsername(), porteur.getPassword(), authorities); }
 * 
 * }
 */