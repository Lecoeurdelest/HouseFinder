package com.housefinder.service.implement;

import com.housefinder.entity.User;
import com.housefinder.dto.UserReqDto;
import com.housefinder.repository.UserRepository;
import com.housefinder.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private JavaMailSender javaMailSender;

    @Override
    public void saveUser(UserReqDto userReqDto) {
        User user = new User();
        user.setUserName(userReqDto.getUserName());
        user.setPassword(passwordEncoder.encode(userReqDto.getPassword()));
        user.setEmail(userReqDto.getEmail());
        user.setPhone(userReqDto.getPhone());
        user.setGender(userReqDto.getGender());
        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void forgotPassword(String email) {
        User user = userRepository.findByEmail(email);
        //check user exits or not
        if (user != null) {
            String newPassword = generateRandomPassword();
            String hashedPassword = passwordEncoder.encode(newPassword);
            user.setPassword(hashedPassword);
            userRepository.save(user);

            //Send mail notification of new password
            String subject = "Reset Password";
            String text = "Your new password" + newPassword;
            sendEmail(email, subject, text);
        }
    }

    private UserReqDto mapToUserDto(User user) {
        UserReqDto userReqDto = new UserReqDto();
        userReqDto.setUserName(user.getUserName());
        userReqDto.setEmail(user.getEmail());
        return userReqDto;
    }

    private String generateRandomPassword() {
        return UUID.randomUUID().toString().substring(0, 6);
    }

    @Override
    public List<UserReqDto> findAllUser() {
        List<User> users = userRepository.findAll();
        return users.stream().map(
                        this::mapToUserDto)
                .collect(Collectors.toList());
    }

    private void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        javaMailSender.send(message);
    }
}
