package com.tactfactory.capfakeskillspring.configurations.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;





import com.tactfactory.capfakeskillspring.configurations.security.dao.ISecurityUserCrudRepository;
import com.tactfactory.capfakeskillspring.configurations.security.models.SecurityRole;
import com.tactfactory.capfakeskillspring.configurations.security.models.SecurityUser;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private ISecurityUserCrudRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        SecurityUser user = userRepository.findByLogin(login);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        if (user.getEnable()) {

            for (SecurityRole role : user.getRoles()){
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
            }
		}

        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), grantedAuthorities);
    }
}
