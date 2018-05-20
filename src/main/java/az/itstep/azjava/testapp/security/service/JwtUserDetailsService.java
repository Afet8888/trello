package az.itstep.azjava.testapp.security.service;

import az.itstep.azjava.testapp.repository.MemberRepository;
import az.itstep.azjava.testapp.security.model.JwtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailsService implements UserDetailsService {

    private MemberRepository memberRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return memberRepository.findByUsername(username)
                .map(u ->
                        new JwtUser(u, null))
                .orElseThrow(() -> new UsernameNotFoundException(username));
    }

    @Autowired
    public void setAppUserDao(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

}
